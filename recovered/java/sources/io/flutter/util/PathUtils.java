            package io.flutter.util;

            import android.content.Context;
            import java.io.File;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class PathUtils {
                public static String getCacheDirectory(Context context) {
/* 1 */             File codeCacheDir = context.getCodeCacheDir();
/* 5 */             if (codeCacheDir == null) {
/* 7 */                 codeCacheDir = context.getCacheDir();
                    }
/* 11 */            if (codeCacheDir == null) {
/* 21 */                codeCacheDir = new File(getDataDirPath(context), "cache");
                    }
/* 24 */            return codeCacheDir.getPath();
                }

                private static String getDataDirPath(Context context) {
/* 5 */             return context.getDataDir().getPath();
                }

                public static String getDataDirectory(Context context) {
/* 4 */             File dir = context.getDir("flutter", 0);
/* 8 */             if (dir == null) {
/* 18 */                dir = new File(getDataDirPath(context), "app_flutter");
                    }
/* 21 */            return dir.getPath();
                }

                public static String getFilesDir(Context context) {
/* 1 */             File filesDir = context.getFilesDir();
/* 5 */             if (filesDir == null) {
/* 15 */                filesDir = new File(getDataDirPath(context), "files");
                    }
/* 18 */            return filesDir.getPath();
                }
            }
