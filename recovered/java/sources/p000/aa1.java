            package p000;

            import android.content.Context;
            import java.io.File;
            import java.io.FileOutputStream;
            import java.text.SimpleDateFormat;
            import java.util.Arrays;
            import java.util.Locale;
            import java.util.concurrent.ExecutorService;
            import java.util.concurrent.Executors;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class aa1 {

                /* JADX INFO: renamed from: f */
                public static final String f137f = fm0.m3789o(new StringBuilder("helpshift"), File.separator, "debugLogs");

                /* JADX INFO: renamed from: a */
                public final ExecutorService f138a = Executors.newSingleThreadExecutor();

                /* JADX INFO: renamed from: b */
                public final SimpleDateFormat f139b = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);

                /* JADX INFO: renamed from: c */
                public FileOutputStream f140c;

                /* JADX INFO: renamed from: d */
                public final File f141d;

                /* JADX INFO: renamed from: e */
                public final long f142e;

                public aa1(Context context, String str, long j) {
/* 29 */            File file = new File(context.getFilesDir(), f137f);
/* 32 */            file.mkdirs();
/* 35 */            File[] fileArrListFiles = file.listFiles();
/* 39 */            if (fileArrListFiles != null && fileArrListFiles.length > 5) {
/* 45 */                Arrays.sort(fileArrListFiles);
/* 51 */                for (int i = 0; i < fileArrListFiles.length - 5; i++) {
/* 55 */                    fileArrListFiles[i].delete();
                        }
                    }
/* 72 */            this.f141d = new File(file, str.concat(".txt"));
/* 74 */            this.f142e = j;
                }
            }
