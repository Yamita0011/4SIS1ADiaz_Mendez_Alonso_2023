class ModeloDatos extends AbstractTableModel {
                   Object datos[][] = {
                     {"uno","dos","tres","cuatro"},
                     {"cinco","seis","siete","ocho"},
                     {"nueve","diez","once","doce"},
                    };
                     class TablaListener implements TableModelListener {
                     public void tableChanged( TableModelEvent evt ) {
                      for( int i=0; i < datos.length; i++ ) {
                          for( int j=0; j < datos[0].length; j++ )
                             System.out.print( datos[i][j] + " " );
                             System.out.println();
                       }
                      }
                     }
                    ModeloDatos() {
                    addTableModelListener( new TablaListener() );
                    }
                    public int getColumnCount() { 
                    return( datos[0].length ); 
                    }
                    public int getRowCount() { 
                    return( datos.length );
                    }
                    public Object getValueAt( int fila,int col ) { 
                    return( datos[fila][col] ); 
                    }
                    public void setValueAt( Object valor,int fila,int col ) {
                    datos[fila][col] = valor;
                    fireTableDataChanged();
                    }
                    public boolean isCellEditable( int fila,int col ) { 
                    return( true ); 
                    }
                    }       
                    public class java1416 extends JPanel {
                    public java1416() {
                    setLayout( new BorderLayout() );
                    JTable tabla = new JTable( new ModeloDatos() );
                    JScrollPane panel = new JScrollPane( tabla );
                    add( panel,BorderLayout.CENTER );
                    }
                    public static void main(String args[]) {
                    JFrame frame = new JFrame( "Tutorial de Java, Swing" );
                    frame.addWindowListener( new WindowAdapter() {
                    public void windowClosing( WindowEvent evt ) {
                    System.exit( 0 );
                    }
                    } );
                    frame.getContentPane().add( new java1416(),BorderLayout.CENTER );
                    frame.setSize( 200,200 );
                    frame.setVisible( true );
                    }
                    }