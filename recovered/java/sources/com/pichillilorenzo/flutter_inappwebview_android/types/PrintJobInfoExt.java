            package com.pichillilorenzo.flutter_inappwebview_android.types;

            import android.print.PrintJobInfo;
            import java.util.HashMap;
            import java.util.Map;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class PrintJobInfoExt {
                private PrintAttributesExt attributes;
                private int copies;
                private long creationTime;
                private String label;
                private Integer numberOfPages;
                private String printerId;
                private int state;

                public static PrintJobInfoExt fromPrintJobInfo(PrintJobInfo printJobInfo) {
/* 2 */             if (printJobInfo == null) {
/* 1 */                 return null;
                    }
/* 7 */             PrintJobInfoExt printJobInfoExt = new PrintJobInfoExt();
/* 14 */            printJobInfoExt.state = printJobInfo.getState();
/* 20 */            printJobInfoExt.copies = printJobInfo.getCopies();
/* 39 */            printJobInfoExt.numberOfPages = printJobInfo.getPages() != null ? Integer.valueOf(printJobInfo.getPages().length) : null;
/* 45 */            printJobInfoExt.creationTime = printJobInfo.getCreationTime();
/* 51 */            printJobInfoExt.label = printJobInfo.getLabel();
/* 67 */            printJobInfoExt.printerId = printJobInfo.getPrinterId() != null ? printJobInfo.getPrinterId().getLocalId() : null;
/* 77 */            printJobInfoExt.attributes = PrintAttributesExt.fromPrintAttributes(printJobInfo.getAttributes());
/* 79 */            return printJobInfoExt;
                }

                public Map<String, Object> toMap() {
/* 3 */             HashMap map = new HashMap();
/* 14 */            map.put("state", Integer.valueOf(this.state));
/* 25 */            map.put("copies", Integer.valueOf(this.copies));
/* 32 */            map.put("numberOfPages", this.numberOfPages);
/* 43 */            map.put("creationTime", Long.valueOf(this.creationTime));
/* 50 */            map.put("label", this.label);
/* 55 */            HashMap map2 = new HashMap();
/* 62 */            map2.put("id", this.printerId);
/* 67 */            map.put("printer", map2);
/* 70 */            PrintAttributesExt printAttributesExt = this.attributes;
/* 82 */            map.put("attributes", printAttributesExt != null ? printAttributesExt.toMap() : null);
/* 85 */            return map;
                }
            }
