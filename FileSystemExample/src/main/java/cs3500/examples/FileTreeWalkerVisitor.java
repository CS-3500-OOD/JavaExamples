package cs3500.examples;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

import static java.nio.file.FileVisitResult.CONTINUE;

public class FileTreeWalkerVisitor implements FileVisitor<Path> {

    /**
     * called everytime the file system walker encounters a file
     * @param file
     *          a reference to the file
     * @param attr
     *          the file's basic attributes
     *
     * @return directive on how to process current item's siblings and children. In this case, we continue.
     */
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attr) {
        if (attr.isRegularFile()) {
            System.out.format("  - File %s \n", file);
            System.out.format("    - Created: %s\n", attr.creationTime());
            System.out.format("    - Modified: %s\n", attr.lastModifiedTime());
        }

        return CONTINUE;
    }

    /**
     * What to do after processing all items in a directory
     * @param dir
     *          a reference to the directory
     * @param exec
     *          {@code null} if the iteration of the directory completes without
     *          an error; otherwise the I/O exception that caused the iteration
     *          of the directory to complete prematurely
     *
     * @return in all cases, continue processing the sibling and child items of current item
     */
    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exec) {
        System.out.format("Finishing Directory: %s%n", dir);
        return CONTINUE;
    }

    /**
     * What to do at the beginning of processing a directory
     *
     * @param dir
     *          a reference to the directory
     * @param attrs
     *          the directory's basic attributes
     *
     * @return a directive to continue processing siblings and children of current item.
     * @throws IOException
     */
    @Override
    public FileVisitResult preVisitDirectory(Path dir,
                                             BasicFileAttributes attrs) throws IOException {
        System.out.format("Starting Directory: %s%n", dir);
        return CONTINUE;
    }

    /**
     * called when a file cannot be visited for some undetermined reason (perhaps
     * locked by another process or a access permissions issue)
     *
     * @param file
     *          a reference to the file
     * @param exc
     *          the I/O exception that prevented the file from being visited
     *
     * @return
     */
    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) {
        System.err.println(exc);
        return CONTINUE;
    }
}


