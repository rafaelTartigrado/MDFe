/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

public class DetnfeimpPK {
    private int keynfe;
    private int nitemdet;
    private int nitem;

    public DetnfeimpPK() {
    }

    public DetnfeimpPK(int keynfe, int nitemdet, int nitem) {
        this.keynfe = keynfe;
        this.nitemdet = nitemdet;
        this.nitem = nitem;
    }

    public int getKeynfe() {
        return keynfe;
    }

    public void setKeynfe(int keynfe) {
        this.keynfe = keynfe;
    }

    public int getNitemdet() {
        return nitemdet;
    }

    public void setNitemdet(int nitemdet) {
        this.nitemdet = nitemdet;
    }

    public int getNitem() {
        return nitem;
    }

    public void setNitem(int nitem) {
        this.nitem = nitem;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) keynfe;
        hash += (int) nitemdet;
        hash += (int) nitem;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetnfeimpPK)) {
            return false;
        }
        DetnfeimpPK other = (DetnfeimpPK) object;
        if (this.keynfe != other.keynfe) {
            return false;
        }
        if (this.nitemdet != other.nitemdet) {
            return false;
        }
        if (this.nitem != other.nitem) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.DetnfeimpPK[ keynfe=" + keynfe + ", nitemdet=" + nitemdet + ", nitem=" + nitem + " ]";
    }
    
}