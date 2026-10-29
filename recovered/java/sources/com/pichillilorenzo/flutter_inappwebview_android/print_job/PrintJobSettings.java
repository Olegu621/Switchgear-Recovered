            package com.pichillilorenzo.flutter_inappwebview_android.print_job;

            import com.pichillilorenzo.flutter_inappwebview_android.ISettings;
            import com.pichillilorenzo.flutter_inappwebview_android.types.MediaSizeExt;
            import com.pichillilorenzo.flutter_inappwebview_android.types.ResolutionExt;
            import java.util.HashMap;
            import java.util.Map;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 6 */     public class PrintJobSettings implements ISettings<PrintJobController> {
                public static final String LOG_TAG = "PrintJobSettings";
                public Integer colorMode;
                public Integer duplexMode;
                public Boolean handledByClient = Boolean.FALSE;
                public String jobName;
                public MediaSizeExt mediaSize;
                public Integer orientation;
                public ResolutionExt resolution;

                @Override // com.pichillilorenzo.flutter_inappwebview_android.ISettings
                /* JADX INFO: renamed from: parse, reason: avoid collision after fix types in other method */
                public ISettings<PrintJobController> parse2(Map<String, Object> map) {
/* 13 */            for (Map.Entry<String, Object> entry : map.entrySet()) {
/* 21 */                String key = entry.getKey();
/* 27 */                Object value = entry.getValue();
/* 31 */                if (value != null) {
/* 34 */                    key.getClass();
                            switch (key) {
                                case "resolution":
/* 171 */                           this.resolution = ResolutionExt.fromMap((Map) value);
                                    break;
                                case "duplexMode":
/* 161 */                           this.duplexMode = (Integer) value;
                                    break;
                                case "orientation":
/* 155 */                           this.orientation = (Integer) value;
                                    break;
                                case "jobName":
/* 149 */                           this.jobName = (String) value;
                                    break;
                                case "handledByClient":
/* 143 */                           this.handledByClient = (Boolean) value;
                                    break;
                                case "colorMode":
/* 137 */                           this.colorMode = (Integer) value;
                                    break;
                                case "mediaSize":
/* 132 */                           this.mediaSize = MediaSizeExt.fromMap((Map) value);
                                    break;
                            }
                        }
                    }
/* 175 */           return this;
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.ISettings
                public Map<String, Object> toMap() {
/* 3 */             HashMap map = new HashMap();
/* 10 */            map.put("handledByClient", this.handledByClient);
/* 17 */            map.put("jobName", this.jobName);
/* 24 */            map.put("orientation", this.orientation);
/* 27 */            MediaSizeExt mediaSizeExt = this.mediaSize;
/* 40 */            map.put("mediaSize", mediaSizeExt != null ? mediaSizeExt.toMap() : null);
/* 47 */            map.put("colorMode", this.colorMode);
/* 54 */            map.put("duplexMode", this.duplexMode);
/* 57 */            ResolutionExt resolutionExt = this.resolution;
/* 67 */            map.put("resolution", resolutionExt != null ? resolutionExt.toMap() : null);
/* 70 */            return map;
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.ISettings
/* 7 */         public Map<String, Object> getRealSettings(PrintJobController printJobController) {
/* 8 */             return toMap();
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.ISettings
/* 176 */       public /* bridge */ /* synthetic */ ISettings<PrintJobController> parse(Map map) {
/* 177 */           return parse2((Map<String, Object>) map);
                }
            }
