package com.ohm.selenium.utils;

import java.nio.file.Paths;

/**
 * Utility class for file management operations in test automation.
 * Provides helper methods for accessing test resources.
 */
public class FileManager {

    /**
     * Get the absolute path of a file in the test resources folder.
     *
     * @param relativePath The relative path of the file within the resources folder
     * @param className        Any class to use for loading the resource (typically the calling test class)
     * @return The absolute path of the file
     * @throws RuntimeException if the file is not found
     */
    public static String getTestResourcePath(String relativePath, Class<?> className) {
        try {
            return Paths.get(
                    className
                            .getClassLoader()
                            .getResource(relativePath)
                            .toURI()
            ).toString();
        } catch (Exception e) {
            throw new RuntimeException("File not found: " + relativePath, e);
        }
    }
}
