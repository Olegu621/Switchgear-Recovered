            package io.sentry.protocol;

            import io.sentry.ILogger;
            import io.sentry.InterfaceC1458g2;
            import io.sentry.InterfaceC1518j3;
            import io.sentry.internal.debugmeta.C1505c;
            import java.io.IOException;
            import java.util.Map;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
/* 6 */     public final class DebugImage implements InterfaceC1458g2 {
                public static final String JVM = "jvm";
                public static final String PROGUARD = "proguard";
                private String arch;
                private String codeFile;
                private String codeId;
                private String debugFile;
                private String debugId;
                private String imageAddr;
                private Long imageSize;
                private String type;
                private Map<String, Object> unknown;
                private String uuid;

                public String getArch() {
/* 1 */             return this.arch;
                }

                public String getCodeFile() {
/* 1 */             return this.codeFile;
                }

                public String getCodeId() {
/* 1 */             return this.codeId;
                }

                public String getDebugFile() {
/* 1 */             return this.debugFile;
                }

                public String getDebugId() {
/* 1 */             return this.debugId;
                }

                public String getImageAddr() {
/* 1 */             return this.imageAddr;
                }

                public Long getImageSize() {
/* 1 */             return this.imageSize;
                }

                public String getType() {
/* 1 */             return this.type;
                }

                public Map<String, Object> getUnknown() {
/* 1 */             return this.unknown;
                }

                public String getUuid() {
/* 1 */             return this.uuid;
                }

                @Override // io.sentry.InterfaceC1458g2
                public void serialize(InterfaceC1518j3 interfaceC1518j3, ILogger iLogger) throws IOException {
/* 1 */             C1505c c1505c = (C1505c) interfaceC1518j3;
/* 3 */             c1505c.m5287i();
/* 8 */             if (this.uuid != null) {
/* 12 */                c1505c.m5291p("uuid");
/* 17 */                c1505c.m5300y(this.uuid);
                    }
/* 22 */            if (this.type != null) {
/* 26 */                c1505c.m5291p("type");
/* 31 */                c1505c.m5300y(this.type);
                    }
/* 36 */            if (this.debugId != null) {
/* 40 */                c1505c.m5291p("debug_id");
/* 45 */                c1505c.m5300y(this.debugId);
                    }
/* 50 */            if (this.debugFile != null) {
/* 54 */                c1505c.m5291p("debug_file");
/* 59 */                c1505c.m5300y(this.debugFile);
                    }
/* 64 */            if (this.codeId != null) {
/* 68 */                c1505c.m5291p("code_id");
/* 73 */                c1505c.m5300y(this.codeId);
                    }
/* 78 */            if (this.codeFile != null) {
/* 82 */                c1505c.m5291p("code_file");
/* 87 */                c1505c.m5300y(this.codeFile);
                    }
/* 92 */            if (this.imageAddr != null) {
/* 96 */                c1505c.m5291p("image_addr");
/* 101 */               c1505c.m5300y(this.imageAddr);
                    }
/* 106 */           if (this.imageSize != null) {
/* 110 */               c1505c.m5291p("image_size");
/* 115 */               c1505c.m5299x(this.imageSize);
                    }
/* 120 */           if (this.arch != null) {
/* 124 */               c1505c.m5291p("arch");
/* 129 */               c1505c.m5300y(this.arch);
                    }
/* 132 */           Map<String, Object> map = this.unknown;
/* 134 */           if (map != null) {
/* 148 */               for (String str : map.keySet()) {
/* 158 */                   Object obj = this.unknown.get(str);
/* 162 */                   c1505c.m5291p(str);
/* 165 */                   c1505c.m5297v(iLogger, obj);
                        }
                    }
/* 169 */           c1505c.m5288l();
                }

                public void setArch(String str) {
/* 1 */             this.arch = str;
                }

                public void setCodeFile(String str) {
/* 1 */             this.codeFile = str;
                }

                public void setCodeId(String str) {
/* 1 */             this.codeId = str;
                }

                public void setDebugFile(String str) {
/* 1 */             this.debugFile = str;
                }

                public void setDebugId(String str) {
/* 1 */             this.debugId = str;
                }

                public void setImageAddr(String str) {
/* 1 */             this.imageAddr = str;
                }

                public void setImageSize(long j) {
/* 5 */             this.imageSize = Long.valueOf(j);
                }

                public void setType(String str) {
/* 1 */             this.type = str;
                }

                public void setUnknown(Map<String, Object> map) {
/* 1 */             this.unknown = map;
                }

                public void setUuid(String str) {
/* 1 */             this.uuid = str;
                }

/* 7 */         public void setImageSize(Long l) {
/* 8 */             this.imageSize = l;
                }
            }
