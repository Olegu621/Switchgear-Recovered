            package io.flutter.embedding.engine;

            import android.content.Intent;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.HashSet;
            import java.util.List;
            import java.util.Set;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 14 */    public class FlutterShellArgs {
                public static final String ARG_CACHE_SKSL = "--cache-sksl";
                public static final String ARG_DART_FLAGS = "--dart-flags";
                public static final String ARG_DISABLE_IMPELLER = "--enable-impeller=false";
                public static final String ARG_DISABLE_SERVICE_AUTH_CODES = "--disable-service-auth-codes";
                public static final String ARG_DUMP_SHADER_SKP_ON_SHADER_COMPILATION = "--dump-skp-on-shader-compilation";
                public static final String ARG_ENABLE_DART_PROFILING = "--enable-dart-profiling";
                public static final String ARG_ENABLE_IMPELLER = "--enable-impeller=true";
                public static final String ARG_ENABLE_SOFTWARE_RENDERING = "--enable-software-rendering";
                public static final String ARG_ENABLE_VULKAN_VALIDATION = "--enable-vulkan-validation";
                public static final String ARG_ENDLESS_TRACE_BUFFER = "--endless-trace-buffer";
                public static final String ARG_KEY_CACHE_SKSL = "cache-sksl";
                public static final String ARG_KEY_DART_FLAGS = "dart-flags";
                public static final String ARG_KEY_DISABLE_SERVICE_AUTH_CODES = "disable-service-auth-codes";
                public static final String ARG_KEY_DUMP_SHADER_SKP_ON_SHADER_COMPILATION = "dump-skp-on-shader-compilation";
                public static final String ARG_KEY_ENABLE_DART_PROFILING = "enable-dart-profiling";
                public static final String ARG_KEY_ENABLE_SOFTWARE_RENDERING = "enable-software-rendering";
                public static final String ARG_KEY_ENABLE_VULKAN_VALIDATION = "enable-vulkan-validation";
                public static final String ARG_KEY_ENDLESS_TRACE_BUFFER = "endless-trace-buffer";
                public static final String ARG_KEY_PROFILE_MICROTASKS = "profile-microtasks";
                public static final String ARG_KEY_PURGE_PERSISTENT_CACHE = "purge-persistent-cache";
                public static final String ARG_KEY_SKIA_DETERMINISTIC_RENDERING = "skia-deterministic-rendering";
                public static final String ARG_KEY_START_PAUSED = "start-paused";
                public static final String ARG_KEY_TOGGLE_IMPELLER = "enable-impeller";
                public static final String ARG_KEY_TRACE_SKIA = "trace-skia";
                public static final String ARG_KEY_TRACE_SKIA_ALLOWLIST = "trace-skia-allowlist";
                public static final String ARG_KEY_TRACE_STARTUP = "trace-startup";
                public static final String ARG_KEY_TRACE_SYSTRACE = "trace-systrace";
                public static final String ARG_KEY_TRACE_TO_FILE = "trace-to-file";
                public static final String ARG_KEY_USE_TEST_FONTS = "use-test-fonts";
                public static final String ARG_KEY_VERBOSE_LOGGING = "verbose-logging";
                public static final String ARG_KEY_VM_SERVICE_PORT = "vm-service-port";
                public static final String ARG_PROFILE_MICROTASKS = "--profile-microtasks";
                public static final String ARG_PURGE_PERSISTENT_CACHE = "--purge-persistent-cache";
                public static final String ARG_SKIA_DETERMINISTIC_RENDERING = "--skia-deterministic-rendering";
                public static final String ARG_START_PAUSED = "--start-paused";
                public static final String ARG_TRACE_SKIA = "--trace-skia";
                public static final String ARG_TRACE_SKIA_ALLOWLIST = "--trace-skia-allowlist=";
                public static final String ARG_TRACE_STARTUP = "--trace-startup";
                public static final String ARG_TRACE_SYSTRACE = "--trace-systrace";
                public static final String ARG_TRACE_TO_FILE = "--trace-to-file";
                public static final String ARG_USE_TEST_FONTS = "--use-test-fonts";
                public static final String ARG_VERBOSE_LOGGING = "--verbose-logging";
                public static final String ARG_VM_SERVICE_PORT = "--vm-service-port=";
                private Set<String> args;

                public FlutterShellArgs(String[] strArr) {
/* 13 */            this.args = new HashSet(Arrays.asList(strArr));
                }

                public static FlutterShellArgs fromIntent(Intent intent) {
/* 3 */             ArrayList arrayList = new ArrayList();
/* 13 */            if (intent.getBooleanExtra(ARG_KEY_TRACE_STARTUP, false)) {
/* 17 */                arrayList.add(ARG_TRACE_STARTUP);
                    }
/* 26 */            if (intent.getBooleanExtra(ARG_KEY_START_PAUSED, false)) {
/* 30 */                arrayList.add(ARG_START_PAUSED);
                    }
/* 35 */            int intExtra = intent.getIntExtra(ARG_KEY_VM_SERVICE_PORT, 0);
/* 39 */            if (intExtra > 0) {
/* 59 */                arrayList.add(ARG_VM_SERVICE_PORT + Integer.toString(intExtra));
                    }
/* 68 */            if (intent.getBooleanExtra(ARG_KEY_DISABLE_SERVICE_AUTH_CODES, false)) {
/* 72 */                arrayList.add(ARG_DISABLE_SERVICE_AUTH_CODES);
                    }
/* 81 */            if (intent.getBooleanExtra(ARG_KEY_ENDLESS_TRACE_BUFFER, false)) {
/* 85 */                arrayList.add(ARG_ENDLESS_TRACE_BUFFER);
                    }
/* 94 */            if (intent.getBooleanExtra(ARG_KEY_USE_TEST_FONTS, false)) {
/* 98 */                arrayList.add(ARG_USE_TEST_FONTS);
                    }
/* 107 */           if (intent.getBooleanExtra(ARG_KEY_ENABLE_DART_PROFILING, false)) {
/* 111 */               arrayList.add(ARG_ENABLE_DART_PROFILING);
                    }
/* 120 */           if (intent.getBooleanExtra(ARG_KEY_ENABLE_SOFTWARE_RENDERING, false)) {
/* 124 */               arrayList.add(ARG_ENABLE_SOFTWARE_RENDERING);
                    }
/* 133 */           if (intent.getBooleanExtra(ARG_KEY_SKIA_DETERMINISTIC_RENDERING, false)) {
/* 137 */               arrayList.add(ARG_SKIA_DETERMINISTIC_RENDERING);
                    }
/* 146 */           if (intent.getBooleanExtra(ARG_KEY_TRACE_SKIA, false)) {
/* 150 */               arrayList.add(ARG_TRACE_SKIA);
                    }
/* 155 */           String stringExtra = intent.getStringExtra(ARG_KEY_TRACE_SKIA_ALLOWLIST);
/* 159 */           if (stringExtra != null) {
/* 167 */               arrayList.add(ARG_TRACE_SKIA_ALLOWLIST.concat(stringExtra));
                    }
/* 176 */           if (intent.getBooleanExtra(ARG_KEY_TRACE_SYSTRACE, false)) {
/* 180 */               arrayList.add(ARG_TRACE_SYSTRACE);
                    }
/* 189 */           if (intent.hasExtra(ARG_KEY_TRACE_TO_FILE)) {
/* 209 */               arrayList.add("--trace-to-file=" + intent.getStringExtra(ARG_KEY_TRACE_TO_FILE));
                    }
/* 218 */           if (intent.hasExtra(ARG_KEY_PROFILE_MICROTASKS)) {
/* 222 */               arrayList.add(ARG_PROFILE_MICROTASKS);
                    }
/* 231 */           if (intent.hasExtra(ARG_KEY_TOGGLE_IMPELLER)) {
/* 237 */               if (intent.getBooleanExtra(ARG_KEY_TOGGLE_IMPELLER, false)) {
/* 241 */                   arrayList.add(ARG_ENABLE_IMPELLER);
                        } else {
/* 247 */                   arrayList.add(ARG_DISABLE_IMPELLER);
                        }
                    }
/* 256 */           if (intent.getBooleanExtra(ARG_KEY_ENABLE_VULKAN_VALIDATION, false)) {
/* 260 */               arrayList.add(ARG_ENABLE_VULKAN_VALIDATION);
                    }
/* 269 */           if (intent.getBooleanExtra(ARG_KEY_DUMP_SHADER_SKP_ON_SHADER_COMPILATION, false)) {
/* 273 */               arrayList.add(ARG_DUMP_SHADER_SKP_ON_SHADER_COMPILATION);
                    }
/* 282 */           if (intent.getBooleanExtra(ARG_KEY_CACHE_SKSL, false)) {
/* 286 */               arrayList.add(ARG_CACHE_SKSL);
                    }
/* 295 */           if (intent.getBooleanExtra(ARG_KEY_PURGE_PERSISTENT_CACHE, false)) {
/* 299 */               arrayList.add(ARG_PURGE_PERSISTENT_CACHE);
                    }
/* 308 */           if (intent.getBooleanExtra(ARG_KEY_VERBOSE_LOGGING, false)) {
/* 312 */               arrayList.add(ARG_VERBOSE_LOGGING);
                    }
/* 321 */           if (intent.hasExtra(ARG_KEY_DART_FLAGS)) {
/* 341 */               arrayList.add("--dart-flags=" + intent.getStringExtra(ARG_KEY_DART_FLAGS));
                    }
/* 346 */           return new FlutterShellArgs(arrayList);
                }

                public void add(String str) {
/* 3 */             this.args.add(str);
                }

                public void remove(String str) {
/* 3 */             this.args.remove(str);
                }

                public String[] toArray() {
/* 15 */            return (String[]) this.args.toArray(new String[this.args.size()]);
                }

/* 15 */        public FlutterShellArgs(List<String> list) {
/* 17 */            this.args = new HashSet(list);
                }

/* 17 */        public FlutterShellArgs(Set<String> set) {
/* 19 */            this.args = new HashSet(set);
                }
            }
