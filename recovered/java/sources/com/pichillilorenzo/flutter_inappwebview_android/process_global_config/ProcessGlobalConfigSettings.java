            package com.pichillilorenzo.flutter_inappwebview_android.process_global_config;

            import android.content.Context;
            import androidx.webkit.ProcessGlobalConfig;
            import com.pichillilorenzo.flutter_inappwebview_android.ISettings;
            import java.io.File;
            import java.util.HashMap;
            import java.util.Map;
            import okhttp3.HttpUrl;
            import p000.C1951n4;
            import p000.b73;
            import p000.fm0;
            import p000.xe2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 6 */     public class ProcessGlobalConfigSettings implements ISettings<ProcessGlobalConfig> {
                public static final String LOG_TAG = "ProcessGlobalConfigSettings";
                public String dataDirectorySuffix;
                public DirectoryBasePaths directoryBasePaths;

                /* JADX WARN: Type inference failed for: r0v5, types: [com.pichillilorenzo.flutter_inappwebview_android.process_global_config.ProcessGlobalConfigSettings$DirectoryBasePaths] */
                @Override // com.pichillilorenzo.flutter_inappwebview_android.ISettings
                /* JADX INFO: renamed from: parse, reason: avoid collision after fix types in other method */
                public ISettings<ProcessGlobalConfig> parse2(Map<String, Object> map) {
/* 13 */            for (Map.Entry<String, Object> entry : map.entrySet()) {
/* 21 */                String key = entry.getKey();
/* 27 */                Object value = entry.getValue();
/* 31 */                if (value != null) {
/* 34 */                    key.getClass();
/* 43 */                    if (key.equals("dataDirectorySuffix")) {
/* 70 */                        this.dataDirectorySuffix = (String) value;
                            } else if (key.equals("directoryBasePaths")) {
/* 65 */                        this.directoryBasePaths = new DirectoryBasePaths().parse2((Map<String, Object>) value);
                            }
                        }
                    }
/* 73 */            return this;
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.ISettings
                public Map<String, Object> toMap() {
/* 3 */             HashMap map = new HashMap();
/* 10 */            map.put("dataDirectorySuffix", this.dataDirectorySuffix);
/* 13 */            return map;
                }

                public ProcessGlobalConfig toProcessGlobalConfig(Context context) {
/* 3 */             ProcessGlobalConfig processGlobalConfig = new ProcessGlobalConfig();
/* 9 */             if (this.dataDirectorySuffix != null && xe2.m9788z(context, "STARTUP_FEATURE_SET_DATA_DIRECTORY_SUFFIX")) {
/* 19 */                String str = this.dataDirectorySuffix;
/* 27 */                if (!b73.f2285A.m6647a(context)) {
/* 70 */                    throw b73.m1295a();
                        }
/* 35 */                if (str.equals(HttpUrl.FRAGMENT_ENCODE_SET)) {
/* 62 */                    C1951n4.m6859j("Suffix cannot be an empty string");
/* 8 */                     return null;
                        }
/* 43 */                if (str.indexOf(File.separatorChar) >= 0) {
/* 56 */                    C1951n4.m6859j(fm0.m3784j("Suffix ", str, " contains a path separator"));
/* 8 */                     return null;
                        }
/* 45 */                processGlobalConfig.f2033a = str;
                    }
/* 73 */            if (this.directoryBasePaths == null || !xe2.m9788z(context, "STARTUP_FEATURE_SET_DIRECTORY_BASE_PATHS")) {
/* 151 */               return processGlobalConfig;
                    }
/* 89 */            File file = new File(this.directoryBasePaths.dataDirectoryBasePath);
/* 98 */            File file2 = new File(this.directoryBasePaths.cacheDirectoryBasePath);
/* 107 */           if (!b73.f2286B.m6647a(context)) {
/* 150 */               throw b73.m1295a();
                    }
/* 113 */           if (!file.isAbsolute()) {
/* 142 */               C1951n4.m6859j("dataDirectoryBasePath must be a non-empty absolute path");
/* 8 */                 return null;
                    }
/* 119 */           if (!file2.isAbsolute()) {
/* 136 */               C1951n4.m6859j("cacheDirectoryBasePath must be a non-empty absolute path");
/* 8 */                 return null;
                    }
/* 125 */           processGlobalConfig.f2034b = file.getAbsolutePath();
/* 131 */           processGlobalConfig.f2035c = file2.getAbsolutePath();
/* 133 */           return processGlobalConfig;
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.ISettings
/* 7 */         public Map<String, Object> getRealSettings(ProcessGlobalConfig processGlobalConfig) {
/* 8 */             return toMap();
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
/* 63 */        public static class DirectoryBasePaths implements ISettings<Object> {
                    public static final String LOG_TAG = "ProcessGlobalConfigSettings";
                    public String cacheDirectoryBasePath;
                    public String dataDirectoryBasePath;

                    @Override // com.pichillilorenzo.flutter_inappwebview_android.ISettings
                    public Map<String, Object> getRealSettings(Object obj) {
/* 1 */                 return toMap();
                    }

                    @Override // com.pichillilorenzo.flutter_inappwebview_android.ISettings
                    /* JADX INFO: renamed from: parse, reason: avoid collision after fix types in other method */
                    public ISettings<Object> parse2(Map<String, Object> map) {
/* 13 */                for (Map.Entry<String, Object> entry : map.entrySet()) {
/* 21 */                    String key = entry.getKey();
/* 27 */                    Object value = entry.getValue();
/* 31 */                    if (value != null) {
/* 34 */                        key.getClass();
/* 43 */                        if (key.equals("dataDirectoryBasePath")) {
/* 61 */                            this.dataDirectoryBasePath = (String) value;
                                } else if (key.equals("cacheDirectoryBasePath")) {
/* 56 */                            this.cacheDirectoryBasePath = (String) value;
                                }
                            }
                        }
/* 64 */                return this;
                    }

                    @Override // com.pichillilorenzo.flutter_inappwebview_android.ISettings
                    public Map<String, Object> toMap() {
/* 3 */                 HashMap map = new HashMap();
/* 10 */                map.put("cacheDirectoryBasePath", this.cacheDirectoryBasePath);
/* 17 */                map.put("dataDirectoryBasePath", this.dataDirectoryBasePath);
/* 20 */                return map;
                    }

                    @Override // com.pichillilorenzo.flutter_inappwebview_android.ISettings
/* 64 */            public /* bridge */ /* synthetic */ ISettings<Object> parse(Map map) {
/* 65 */                return parse2((Map<String, Object>) map);
                    }
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.ISettings
/* 73 */        public /* bridge */ /* synthetic */ ISettings<ProcessGlobalConfig> parse(Map map) {
/* 74 */            return parse2((Map<String, Object>) map);
                }
            }
