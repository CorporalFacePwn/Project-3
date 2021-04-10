/*********************************************************************************************************
* CLASS: GradebookWriter (GradebookWriter.java)
*
* GROUP INFORMATION
* AUTHOR 1: Viktar Pisarchyk, vpisarch, vpisarch@asu.edu
* AUTHOR 2: Zachary Tiffany, ztiffany, ztiffany@asu.edu
* AUTHOR 3: Riley Einberger, reinber1@asu.edu, reinber1@asu.edu
* AUTHOR 3: Colby Manry, cmanry, cmanry@asu.edu
********************************************************************************************************/
package proj3;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * GradebookWriter inherits from PrintWriter and writes the gradebook info to the file whose name
 * is passed to the ctor.
 */
public class GradebookWriter extends PrintWriter {

    /**
     * Call the super class ctor that takes a String as the argument, i.e, PrintWriter(String).
     * The PrintWriter ctor opens the file named by pFname for writing. It will throw a
     * FileNotFoundException if the file could not be opened for writing. We throw the exception
     * here as well where it will eventually be caught in Main.exit() -- see SR 7.
     *
     * @param pFname The name of the output file to be opened for writing.
     */
    ???

    /**
     * Writes the gradebook info to the output file which was opened in the ctor.
     *
     * @param pRoster The roster of students.
     *
     * PSEUDOCODE:
     * method writeGradebook(pRoster : Roster() : void
     *     EnhancedFor each student in pRoster.getStudentList() Do
     *         Call println(student)
     *     End For
     *     Call close()
     * end writeGradebook
     */
    ???
}
