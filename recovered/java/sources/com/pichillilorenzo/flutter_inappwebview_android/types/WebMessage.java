            package com.pichillilorenzo.flutter_inappwebview_android.types;

            import java.util.List;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class WebMessage {
                public String data;
                public List<WebMessagePort> ports;

                public WebMessage(String str, List<WebMessagePort> list) {
/* 4 */             this.data = str;
/* 6 */             this.ports = list;
                }

                public void dispose() {
/* 1 */             List<WebMessagePort> list = this.ports;
/* 3 */             if (list != null) {
/* 5 */                 list.clear();
                    }
                }
            }
