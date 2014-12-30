package org.jdom.filter;

final class OrFilter extends AbstractFilter
{
    private static final String CVS_ID = "@(#) $RCSfile: OrFilter.java,v $ $Revision: 1.4 $ $Date: 2004/02/06 09:28:31 $";
    private Filter left;
    private Filter right;
    
    public OrFilter(final Filter left, final Filter right) {
        super();
        if (left == null || right == null) {
            throw new IllegalArgumentException("null filter not allowed");
        }
        this.left = left;
        this.right = right;
    }
    
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OrFilter) {
            final OrFilter filter = (OrFilter)obj;
            if ((this.left.equals(filter.left) && this.right.equals(filter.right)) || (this.left.equals(filter.right) && this.right.equals(filter.left))) {
                return true;
            }
        }
        return false;
    }
    
    public int hashCode() {
        return 31 * this.left.hashCode() + this.right.hashCode();
    }
    
    public boolean matches(final Object obj) {
        return this.left.matches(obj) || this.right.matches(obj);
    }
    
    public String toString() {
        return new StringBuffer(64).append("[OrFilter: ").append(this.left.toString()).append(",\n").append("           ").append(this.right.toString()).append("]").toString();
    }
}
