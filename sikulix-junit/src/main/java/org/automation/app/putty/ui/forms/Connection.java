package org.automation.app.putty.ui.forms;

import org.automation.app.putty.ui.UiBase;

/**
 * Created by shantonu on 7/7/16.
 */
public class Connection extends UiBase {

    public Connection(String folder) {
        super(folder);
    }

    public class Data extends UiBase{
        public Data(String folder) {
            super(folder);
        }
    }
    public class Proxy extends UiBase{
        public Proxy(String folder) {
            super(folder);
        }
    }
    public class Telnet extends UiBase{
        public Telnet(String folder) {
            super(folder);
        }
    }
    public class Rlogin extends UiBase{
        public Rlogin(String folder) {
            super(folder);
        }
    }
    public class SSH extends UiBase{
        public SSH(String folder) {
            super(folder);
        }

        public class Kex extends UiBase{
            public Kex(String folder) {
                super(folder);
            }
        }
        public class Auth extends UiBase{
            public Auth(String folder) {
                super(folder);
            }

            public class GSSAPI extends UiBase{
                public GSSAPI(String folder) {
                    super(folder);
                }
            }
        }
        public class TTY extends UiBase{
            public TTY(String folder) {
                super(folder);
            }
        }
        public class X11 extends UiBase{
            public X11(String folder) {
                super(folder);
            }
        }
        public class Tunnels extends UiBase{
            public Tunnels(String folder) {
                super(folder);
            }
        }
        public class Bugs extends UiBase{
            public Bugs(String folder) {
                super(folder);
            }
        }
    }
    public class Serial extends UiBase{
        public Serial(String folder) {
            super(folder);
        }
    }
}
