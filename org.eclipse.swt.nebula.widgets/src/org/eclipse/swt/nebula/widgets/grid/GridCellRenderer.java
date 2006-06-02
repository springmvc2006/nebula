/*******************************************************************************
 * Copyright (c) 2006 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    chris.gross@us.ibm.com - initial API and implementation
 *******************************************************************************/ 
package org.eclipse.swt.nebula.widgets.grid;

import org.eclipse.swt.SWT;

public abstract class GridCellRenderer extends AbstractInternalWidget
{

    private int row = 0;

    private int column = 0;

    private int alignment = SWT.LEFT;

    private boolean tree = false;

    private boolean check = false;

    private boolean rowHover = false;

    private boolean columnHover = false;

    private boolean rowFocus = false;

    private boolean columnFocus = false;

    /**
     * @return Returns the row.
     */
    public int getRow()
    {
        return row;
    }

    /**
     * @param row The row to set.
     */
    public void setRow(int row)
    {
        this.row = row;
    }

    /**
     * @return Returns the alignment.
     */
    public int getAlignment()
    {
        return alignment;
    }

    /**
     * @param alignment The alignment to set.
     */
    public void setAlignment(int alignment)
    {
        this.alignment = alignment;
    }

    /**
     * @return Returns the check.
     */
    public boolean isCheck()
    {
        return check;
    }

    /**
     * @param check The check to set.
     */
    public void setCheck(boolean check)
    {
        this.check = check;
    }

    /**
     * @return Returns the tree.
     */
    public boolean isTree()
    {
        return tree;
    }

    /**
     * @param tree The tree to set.
     */
    public void setTree(boolean tree)
    {
        this.tree = tree;
    }

    /**
     * @return Returns the column.
     */
    public int getColumn()
    {
        return column;
    }

    /**
     * @param column The column to set.
     */
    public void setColumn(int column)
    {
        this.column = column;
    }

    /**
     * @return Returns the columnHover.
     */
    public boolean isColumnHover()
    {
        return columnHover;
    }

    /**
     * @param columnHover The columnHover to set.
     */
    public void setColumnHover(boolean columnHover)
    {
        this.columnHover = columnHover;
    }

    /**
     * @return Returns the rowHover.
     */
    public boolean isRowHover()
    {
        return rowHover;
    }

    /**
     * @param rowHover The rowHover to set.
     */
    public void setRowHover(boolean rowHover)
    {
        this.rowHover = rowHover;
    }

    /**
     * @return Returns the columnFocus.
     */
    public boolean isColumnFocus()
    {
        return columnFocus;
    }

    /**
     * @param columnFocus The columnFocus to set.
     */
    public void setColumnFocus(boolean columnFocus)
    {
        this.columnFocus = columnFocus;
    }

    /**
     * @return Returns the rowFocus.
     */
    public boolean isRowFocus()
    {
        return rowFocus;
    }

    /**
     * @param rowFocus The rowFocus to set.
     */
    public void setRowFocus(boolean rowFocus)
    {
        this.rowFocus = rowFocus;
    }

}
