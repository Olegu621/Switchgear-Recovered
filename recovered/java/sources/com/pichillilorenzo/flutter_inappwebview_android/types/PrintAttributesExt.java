            package com.pichillilorenzo.flutter_inappwebview_android.types;

            import android.print.PrintAttributes;
            import java.util.HashMap;
            import java.util.Map;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class PrintAttributesExt {
                private int colorMode;
                private Integer duplex;
                private MarginsExt margins;
                private MediaSizeExt mediaSize;
                private Integer orientation;
                private ResolutionExt resolution;

                public static PrintAttributesExt fromPrintAttributes(PrintAttributes printAttributes) {
/* 1 */             if (printAttributes == null) {
/* 3 */                 return null;
                    }
/* 7 */             PrintAttributesExt printAttributesExt = new PrintAttributesExt();
/* 14 */            printAttributesExt.colorMode = printAttributes.getColorMode();
/* 24 */            printAttributesExt.duplex = Integer.valueOf(printAttributes.getDuplexMode());
/* 26 */            PrintAttributes.MediaSize mediaSize = printAttributes.getMediaSize();
/* 30 */            if (mediaSize != null) {
/* 36 */                printAttributesExt.mediaSize = MediaSizeExt.fromMediaSize(mediaSize);
/* 48 */                printAttributesExt.orientation = Integer.valueOf(!mediaSize.isPortrait() ? 1 : 0);
                    }
/* 58 */            printAttributesExt.resolution = ResolutionExt.fromResolution(printAttributes.getResolution());
/* 68 */            printAttributesExt.margins = MarginsExt.fromMargins(printAttributes.getMinMargins());
/* 70 */            return printAttributesExt;
                }

                public Map<String, Object> toMap() {
/* 3 */             HashMap map = new HashMap();
/* 14 */            map.put("colorMode", Integer.valueOf(this.colorMode));
/* 21 */            map.put("duplex", this.duplex);
/* 28 */            map.put("orientation", this.orientation);
/* 31 */            MediaSizeExt mediaSizeExt = this.mediaSize;
/* 44 */            map.put("mediaSize", mediaSizeExt != null ? mediaSizeExt.toMap() : null);
/* 47 */            ResolutionExt resolutionExt = this.resolution;
/* 59 */            map.put("resolution", resolutionExt != null ? resolutionExt.toMap() : null);
/* 62 */            MarginsExt marginsExt = this.margins;
/* 72 */            map.put("margins", marginsExt != null ? marginsExt.toMap() : null);
/* 75 */            return map;
                }
            }
