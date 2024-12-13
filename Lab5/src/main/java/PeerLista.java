/**
 * Lab05: Sistema P2P
 * 
 * RODRIGO OLIVEIRA BADEGA          2207273
 * GUILHERME HENRIQUE SOEIRO FONTES 2320657
 * 
 * TODO1 : OK => PeerLista
 * TODO3 : OK => ClienteRMI
 * TODO4 : OK => Lab5 (Peers)
 */
public enum PeerLista {
    
    PEER1 {
        @Override
        public String getNome() {
            return "PEER1";
        }        
    },
    PEER2 {
        public String getNome() {
            return "PEER2";
        }        
    },
    PEER3 {
        public String getNome() {
            return "PEER3";
        }        
    },
    //------------------------------TODO 1--------------------------------------
    PEER4 {
        public String getNome(){
            return "PEER4";
        }
    };
    //--------------------------------------------------------------------------
    public String getNome(){
        return "NULO";
    }    
}
