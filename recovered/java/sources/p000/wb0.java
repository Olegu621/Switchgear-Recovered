            package p000;

            import android.content.ContentProviderClient;
            import android.content.Context;
            import android.content.pm.ApplicationInfo;
            import android.content.pm.ProviderInfo;
            import android.database.Cursor;
            import android.database.MatrixCursor;
            import android.net.Uri;
            import android.os.Build;
            import android.os.IBinder;
            import android.os.IInterface;
            import android.os.Parcel;
            import android.os.RemoteException;
            import android.os.SystemClock;
            import com.google.android.gms.dynamic.IObjectWrapper;
            import com.google.android.gms.dynamic.ObjectWrapper;
            import com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader;
            import com.google.android.gms.dynamite.zzp;
            import com.google.android.gms.dynamite.zzq;
            import com.google.android.gms.internal.common.zzc;
            import io.sentry.android.core.AbstractC1245n0;
            import java.lang.reflect.Field;
            import java.lang.reflect.InvocationTargetException;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class wb0 {

                /* JADX INFO: renamed from: c */
                public static final cg3 f18549c;

                /* JADX INFO: renamed from: d */
                public static final dg3 f18550d;

                /* JADX INFO: renamed from: e */
                public static Boolean f18551e = null;

                /* JADX INFO: renamed from: f */
                public static String f18552f = null;

                /* JADX INFO: renamed from: g */
                public static boolean f18553g = false;

                /* JADX INFO: renamed from: h */
                public static int f18554h = -1;

                /* JADX INFO: renamed from: i */
                public static Boolean f18555i;

                /* JADX INFO: renamed from: m */
                public static zzp f18559m;

                /* JADX INFO: renamed from: n */
                public static zzq f18560n;

                /* JADX INFO: renamed from: a */
                public final Context f18561a;

                /* JADX INFO: renamed from: j */
                public static final ThreadLocal f18556j = new ThreadLocal();

                /* JADX INFO: renamed from: k */
                public static final C0942g5 f18557k = new C0942g5(10);

                /* JADX INFO: renamed from: l */
                public static final dg3 f18558l = new dg3(1);

                /* JADX INFO: renamed from: b */
                public static final cg3 f18548b = new cg3(12);

                static {
/* 36 */            int i = 13;
/* 41 */            f18549c = new cg3(i);
/* 48 */            f18550d = new dg3(i);
                }

                public wb0(Context context) {
/* 4 */             this.f18561a = context;
                }

                /* JADX INFO: renamed from: a */
                public static int m9512a(Context context, String str) {
                    try {
/* 18 */                ClassLoader classLoader = context.getApplicationContext().getClassLoader();
/* 30 */                StringBuilder sb = new StringBuilder(str.length() + 61);
/* 33 */                sb.append("com.google.android.gms.dynamite.descriptors.");
/* 36 */                sb.append(str);
/* 39 */                sb.append(".ModuleDescriptor");
/* 46 */                Class<?> clsLoadClass = classLoader.loadClass(sb.toString());
/* 52 */                Field declaredField = clsLoadClass.getDeclaredField("MODULE_ID");
/* 58 */                Field declaredField2 = clsLoadClass.getDeclaredField("MODULE_VERSION");
/* 71 */                if (de3.m3029k(declaredField.get(null), str)) {
/* 124 */                   return declaredField2.getInt(null);
                        }
/* 77 */                String strValueOf = String.valueOf(declaredField.get(null));
/* 96 */                StringBuilder sb2 = new StringBuilder(strValueOf.length() + 50 + str.length() + 1);
/* 99 */                sb2.append("Module descriptor id '");
/* 102 */               sb2.append(strValueOf);
/* 105 */               sb2.append("' didn't match expected id '");
/* 108 */               sb2.append(str);
/* 111 */               sb2.append("'");
/* 118 */               AbstractC1245n0.m4876d("DynamiteModule", sb2.toString());
/* 13 */                return 0;
                    } catch (ClassNotFoundException unused) {
/* 155 */               StringBuilder sb3 = new StringBuilder(str.length() + 45);
/* 160 */               sb3.append("Local module descriptor class for ");
/* 163 */               sb3.append(str);
/* 168 */               sb3.append(" not found.");
/* 175 */               AbstractC1245n0.m4889q("DynamiteModule", sb3.toString());
/* 13 */                return 0;
                    } catch (Exception e) {
/* 143 */               AbstractC1245n0.m4876d("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e.getMessage())));
/* 13 */                return 0;
                    }
                }

                /* JADX WARN: Code duplicated, block: B:101:0x01f5 A[Catch: all -> 0x0123, sb0 -> 0x0126, RemoteException -> 0x0129, TryCatch #8 {RemoteException -> 0x0129, sb0 -> 0x0126, all -> 0x0123, blocks: (B:36:0x00c0, B:42:0x00cc, B:44:0x00d3, B:45:0x00e9, B:49:0x00ef, B:51:0x00f7, B:53:0x00fb, B:54:0x0109, B:61:0x0114, B:69:0x0141, B:71:0x0149, B:72:0x0150, B:73:0x0157, B:68:0x012c, B:76:0x015a, B:77:0x015b, B:78:0x0162, B:79:0x0163, B:80:0x016a, B:83:0x016d, B:84:0x016e, B:86:0x0188, B:88:0x019b, B:90:0x01a3, B:96:0x01df, B:98:0x01e5, B:99:0x01ed, B:100:0x01f4, B:91:0x01b4, B:92:0x01bb, B:94:0x01be, B:95:0x01cf, B:101:0x01f5, B:102:0x01fc, B:103:0x01fd, B:104:0x0204, B:110:0x0210), top: B:160:0x00c0 }] */
                /* JADX WARN: Code duplicated, block: B:103:0x01fd A[Catch: all -> 0x0123, sb0 -> 0x0126, RemoteException -> 0x0129, TryCatch #8 {RemoteException -> 0x0129, sb0 -> 0x0126, all -> 0x0123, blocks: (B:36:0x00c0, B:42:0x00cc, B:44:0x00d3, B:45:0x00e9, B:49:0x00ef, B:51:0x00f7, B:53:0x00fb, B:54:0x0109, B:61:0x0114, B:69:0x0141, B:71:0x0149, B:72:0x0150, B:73:0x0157, B:68:0x012c, B:76:0x015a, B:77:0x015b, B:78:0x0162, B:79:0x0163, B:80:0x016a, B:83:0x016d, B:84:0x016e, B:86:0x0188, B:88:0x019b, B:90:0x01a3, B:96:0x01df, B:98:0x01e5, B:99:0x01ed, B:100:0x01f4, B:91:0x01b4, B:92:0x01bb, B:94:0x01be, B:95:0x01cf, B:101:0x01f5, B:102:0x01fc, B:103:0x01fd, B:104:0x0204, B:110:0x0210), top: B:160:0x00c0 }] */
                /* JADX WARN: Code duplicated, block: B:107:0x0207 A[Catch: all -> 0x0205, TRY_ENTER, TryCatch #2 {, blocks: (B:37:0x00c1, B:39:0x00c7, B:40:0x00c9, B:107:0x0207, B:108:0x020e), top: B:151:0x00c1 }] */
                /* JADX WARN: Code duplicated, block: B:125:0x0266  */
                /* JADX WARN: Code duplicated, block: B:126:0x026c  */
                /* JADX WARN: Code duplicated, block: B:129:0x0275  */
                /* JADX WARN: Code duplicated, block: B:134:0x0286 A[Catch: all -> 0x008d, TryCatch #6 {all -> 0x008d, blocks: (B:7:0x003c, B:11:0x0086, B:18:0x0092, B:22:0x0099, B:34:0x00bc, B:111:0x0211, B:112:0x0218, B:115:0x021b, B:116:0x021c, B:117:0x0223, B:134:0x0286, B:135:0x02a4, B:118:0x0224, B:120:0x024a, B:122:0x0258, B:132:0x027e, B:133:0x0285, B:136:0x02a5, B:137:0x02ee), top: B:156:0x003c, inners: #7 }] */
                /* JADX WARN: Code duplicated, block: B:151:0x00c1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:154:0x00ea A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:157:0x00bc A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:22:0x0099 A[Catch: all -> 0x008d, TRY_LEAVE, TryCatch #6 {all -> 0x008d, blocks: (B:7:0x003c, B:11:0x0086, B:18:0x0092, B:22:0x0099, B:34:0x00bc, B:111:0x0211, B:112:0x0218, B:115:0x021b, B:116:0x021c, B:117:0x0223, B:134:0x0286, B:135:0x02a4, B:118:0x0224, B:120:0x024a, B:122:0x0258, B:132:0x027e, B:133:0x0285, B:136:0x02a5, B:137:0x02ee), top: B:156:0x003c, inners: #7 }] */
                /* JADX WARN: Code duplicated, block: B:25:0x00a7  */
                /* JADX WARN: Code duplicated, block: B:26:0x00ab  */
                /* JADX WARN: Code duplicated, block: B:29:0x00b2  */
                /* JADX WARN: Code duplicated, block: B:32:0x00b9  */
                /* JADX WARN: Code duplicated, block: B:39:0x00c7 A[Catch: all -> 0x0205, TryCatch #2 {, blocks: (B:37:0x00c1, B:39:0x00c7, B:40:0x00c9, B:107:0x0207, B:108:0x020e), top: B:151:0x00c1 }] */
                /* JADX WARN: Code duplicated, block: B:42:0x00cc A[Catch: all -> 0x0123, sb0 -> 0x0126, RemoteException -> 0x0129, TRY_ENTER, TryCatch #8 {RemoteException -> 0x0129, sb0 -> 0x0126, all -> 0x0123, blocks: (B:36:0x00c0, B:42:0x00cc, B:44:0x00d3, B:45:0x00e9, B:49:0x00ef, B:51:0x00f7, B:53:0x00fb, B:54:0x0109, B:61:0x0114, B:69:0x0141, B:71:0x0149, B:72:0x0150, B:73:0x0157, B:68:0x012c, B:76:0x015a, B:77:0x015b, B:78:0x0162, B:79:0x0163, B:80:0x016a, B:83:0x016d, B:84:0x016e, B:86:0x0188, B:88:0x019b, B:90:0x01a3, B:96:0x01df, B:98:0x01e5, B:99:0x01ed, B:100:0x01f4, B:91:0x01b4, B:92:0x01bb, B:94:0x01be, B:95:0x01cf, B:101:0x01f5, B:102:0x01fc, B:103:0x01fd, B:104:0x0204, B:110:0x0210), top: B:160:0x00c0 }] */
                /* JADX WARN: Code duplicated, block: B:44:0x00d3 A[Catch: all -> 0x0123, sb0 -> 0x0126, RemoteException -> 0x0129, TryCatch #8 {RemoteException -> 0x0129, sb0 -> 0x0126, all -> 0x0123, blocks: (B:36:0x00c0, B:42:0x00cc, B:44:0x00d3, B:45:0x00e9, B:49:0x00ef, B:51:0x00f7, B:53:0x00fb, B:54:0x0109, B:61:0x0114, B:69:0x0141, B:71:0x0149, B:72:0x0150, B:73:0x0157, B:68:0x012c, B:76:0x015a, B:77:0x015b, B:78:0x0162, B:79:0x0163, B:80:0x016a, B:83:0x016d, B:84:0x016e, B:86:0x0188, B:88:0x019b, B:90:0x01a3, B:96:0x01df, B:98:0x01e5, B:99:0x01ed, B:100:0x01f4, B:91:0x01b4, B:92:0x01bb, B:94:0x01be, B:95:0x01cf, B:101:0x01f5, B:102:0x01fc, B:103:0x01fd, B:104:0x0204, B:110:0x0210), top: B:160:0x00c0 }] */
                /* JADX WARN: Code duplicated, block: B:49:0x00ef A[Catch: all -> 0x0123, sb0 -> 0x0126, RemoteException -> 0x0129, TRY_ENTER, TryCatch #8 {RemoteException -> 0x0129, sb0 -> 0x0126, all -> 0x0123, blocks: (B:36:0x00c0, B:42:0x00cc, B:44:0x00d3, B:45:0x00e9, B:49:0x00ef, B:51:0x00f7, B:53:0x00fb, B:54:0x0109, B:61:0x0114, B:69:0x0141, B:71:0x0149, B:72:0x0150, B:73:0x0157, B:68:0x012c, B:76:0x015a, B:77:0x015b, B:78:0x0162, B:79:0x0163, B:80:0x016a, B:83:0x016d, B:84:0x016e, B:86:0x0188, B:88:0x019b, B:90:0x01a3, B:96:0x01df, B:98:0x01e5, B:99:0x01ed, B:100:0x01f4, B:91:0x01b4, B:92:0x01bb, B:94:0x01be, B:95:0x01cf, B:101:0x01f5, B:102:0x01fc, B:103:0x01fd, B:104:0x0204, B:110:0x0210), top: B:160:0x00c0 }] */
                /* JADX WARN: Code duplicated, block: B:79:0x0163 A[Catch: all -> 0x0123, sb0 -> 0x0126, RemoteException -> 0x0129, TryCatch #8 {RemoteException -> 0x0129, sb0 -> 0x0126, all -> 0x0123, blocks: (B:36:0x00c0, B:42:0x00cc, B:44:0x00d3, B:45:0x00e9, B:49:0x00ef, B:51:0x00f7, B:53:0x00fb, B:54:0x0109, B:61:0x0114, B:69:0x0141, B:71:0x0149, B:72:0x0150, B:73:0x0157, B:68:0x012c, B:76:0x015a, B:77:0x015b, B:78:0x0162, B:79:0x0163, B:80:0x016a, B:83:0x016d, B:84:0x016e, B:86:0x0188, B:88:0x019b, B:90:0x01a3, B:96:0x01df, B:98:0x01e5, B:99:0x01ed, B:100:0x01f4, B:91:0x01b4, B:92:0x01bb, B:94:0x01be, B:95:0x01cf, B:101:0x01f5, B:102:0x01fc, B:103:0x01fd, B:104:0x0204, B:110:0x0210), top: B:160:0x00c0 }] */
                /* JADX WARN: Code duplicated, block: B:84:0x016e A[Catch: all -> 0x0123, sb0 -> 0x0126, RemoteException -> 0x0129, TryCatch #8 {RemoteException -> 0x0129, sb0 -> 0x0126, all -> 0x0123, blocks: (B:36:0x00c0, B:42:0x00cc, B:44:0x00d3, B:45:0x00e9, B:49:0x00ef, B:51:0x00f7, B:53:0x00fb, B:54:0x0109, B:61:0x0114, B:69:0x0141, B:71:0x0149, B:72:0x0150, B:73:0x0157, B:68:0x012c, B:76:0x015a, B:77:0x015b, B:78:0x0162, B:79:0x0163, B:80:0x016a, B:83:0x016d, B:84:0x016e, B:86:0x0188, B:88:0x019b, B:90:0x01a3, B:96:0x01df, B:98:0x01e5, B:99:0x01ed, B:100:0x01f4, B:91:0x01b4, B:92:0x01bb, B:94:0x01be, B:95:0x01cf, B:101:0x01f5, B:102:0x01fc, B:103:0x01fd, B:104:0x0204, B:110:0x0210), top: B:160:0x00c0 }] */
                /* JADX WARN: Code duplicated, block: B:86:0x0188 A[Catch: all -> 0x0123, sb0 -> 0x0126, RemoteException -> 0x0129, TryCatch #8 {RemoteException -> 0x0129, sb0 -> 0x0126, all -> 0x0123, blocks: (B:36:0x00c0, B:42:0x00cc, B:44:0x00d3, B:45:0x00e9, B:49:0x00ef, B:51:0x00f7, B:53:0x00fb, B:54:0x0109, B:61:0x0114, B:69:0x0141, B:71:0x0149, B:72:0x0150, B:73:0x0157, B:68:0x012c, B:76:0x015a, B:77:0x015b, B:78:0x0162, B:79:0x0163, B:80:0x016a, B:83:0x016d, B:84:0x016e, B:86:0x0188, B:88:0x019b, B:90:0x01a3, B:96:0x01df, B:98:0x01e5, B:99:0x01ed, B:100:0x01f4, B:91:0x01b4, B:92:0x01bb, B:94:0x01be, B:95:0x01cf, B:101:0x01f5, B:102:0x01fc, B:103:0x01fd, B:104:0x0204, B:110:0x0210), top: B:160:0x00c0 }] */
                /* JADX WARN: Code duplicated, block: B:88:0x019b A[Catch: all -> 0x0123, sb0 -> 0x0126, RemoteException -> 0x0129, TryCatch #8 {RemoteException -> 0x0129, sb0 -> 0x0126, all -> 0x0123, blocks: (B:36:0x00c0, B:42:0x00cc, B:44:0x00d3, B:45:0x00e9, B:49:0x00ef, B:51:0x00f7, B:53:0x00fb, B:54:0x0109, B:61:0x0114, B:69:0x0141, B:71:0x0149, B:72:0x0150, B:73:0x0157, B:68:0x012c, B:76:0x015a, B:77:0x015b, B:78:0x0162, B:79:0x0163, B:80:0x016a, B:83:0x016d, B:84:0x016e, B:86:0x0188, B:88:0x019b, B:90:0x01a3, B:96:0x01df, B:98:0x01e5, B:99:0x01ed, B:100:0x01f4, B:91:0x01b4, B:92:0x01bb, B:94:0x01be, B:95:0x01cf, B:101:0x01f5, B:102:0x01fc, B:103:0x01fd, B:104:0x0204, B:110:0x0210), top: B:160:0x00c0 }] */
                /* JADX WARN: Code duplicated, block: B:90:0x01a3 A[Catch: all -> 0x0123, sb0 -> 0x0126, RemoteException -> 0x0129, TryCatch #8 {RemoteException -> 0x0129, sb0 -> 0x0126, all -> 0x0123, blocks: (B:36:0x00c0, B:42:0x00cc, B:44:0x00d3, B:45:0x00e9, B:49:0x00ef, B:51:0x00f7, B:53:0x00fb, B:54:0x0109, B:61:0x0114, B:69:0x0141, B:71:0x0149, B:72:0x0150, B:73:0x0157, B:68:0x012c, B:76:0x015a, B:77:0x015b, B:78:0x0162, B:79:0x0163, B:80:0x016a, B:83:0x016d, B:84:0x016e, B:86:0x0188, B:88:0x019b, B:90:0x01a3, B:96:0x01df, B:98:0x01e5, B:99:0x01ed, B:100:0x01f4, B:91:0x01b4, B:92:0x01bb, B:94:0x01be, B:95:0x01cf, B:101:0x01f5, B:102:0x01fc, B:103:0x01fd, B:104:0x0204, B:110:0x0210), top: B:160:0x00c0 }] */
                /* JADX WARN: Code duplicated, block: B:91:0x01b4 A[Catch: all -> 0x0123, sb0 -> 0x0126, RemoteException -> 0x0129, TryCatch #8 {RemoteException -> 0x0129, sb0 -> 0x0126, all -> 0x0123, blocks: (B:36:0x00c0, B:42:0x00cc, B:44:0x00d3, B:45:0x00e9, B:49:0x00ef, B:51:0x00f7, B:53:0x00fb, B:54:0x0109, B:61:0x0114, B:69:0x0141, B:71:0x0149, B:72:0x0150, B:73:0x0157, B:68:0x012c, B:76:0x015a, B:77:0x015b, B:78:0x0162, B:79:0x0163, B:80:0x016a, B:83:0x016d, B:84:0x016e, B:86:0x0188, B:88:0x019b, B:90:0x01a3, B:96:0x01df, B:98:0x01e5, B:99:0x01ed, B:100:0x01f4, B:91:0x01b4, B:92:0x01bb, B:94:0x01be, B:95:0x01cf, B:101:0x01f5, B:102:0x01fc, B:103:0x01fd, B:104:0x0204, B:110:0x0210), top: B:160:0x00c0 }] */
                /* JADX WARN: Code duplicated, block: B:93:0x01bc A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:94:0x01be A[Catch: all -> 0x0123, sb0 -> 0x0126, RemoteException -> 0x0129, TryCatch #8 {RemoteException -> 0x0129, sb0 -> 0x0126, all -> 0x0123, blocks: (B:36:0x00c0, B:42:0x00cc, B:44:0x00d3, B:45:0x00e9, B:49:0x00ef, B:51:0x00f7, B:53:0x00fb, B:54:0x0109, B:61:0x0114, B:69:0x0141, B:71:0x0149, B:72:0x0150, B:73:0x0157, B:68:0x012c, B:76:0x015a, B:77:0x015b, B:78:0x0162, B:79:0x0163, B:80:0x016a, B:83:0x016d, B:84:0x016e, B:86:0x0188, B:88:0x019b, B:90:0x01a3, B:96:0x01df, B:98:0x01e5, B:99:0x01ed, B:100:0x01f4, B:91:0x01b4, B:92:0x01bb, B:94:0x01be, B:95:0x01cf, B:101:0x01f5, B:102:0x01fc, B:103:0x01fd, B:104:0x0204, B:110:0x0210), top: B:160:0x00c0 }] */
                /* JADX WARN: Code duplicated, block: B:95:0x01cf A[Catch: all -> 0x0123, sb0 -> 0x0126, RemoteException -> 0x0129, TryCatch #8 {RemoteException -> 0x0129, sb0 -> 0x0126, all -> 0x0123, blocks: (B:36:0x00c0, B:42:0x00cc, B:44:0x00d3, B:45:0x00e9, B:49:0x00ef, B:51:0x00f7, B:53:0x00fb, B:54:0x0109, B:61:0x0114, B:69:0x0141, B:71:0x0149, B:72:0x0150, B:73:0x0157, B:68:0x012c, B:76:0x015a, B:77:0x015b, B:78:0x0162, B:79:0x0163, B:80:0x016a, B:83:0x016d, B:84:0x016e, B:86:0x0188, B:88:0x019b, B:90:0x01a3, B:96:0x01df, B:98:0x01e5, B:99:0x01ed, B:100:0x01f4, B:91:0x01b4, B:92:0x01bb, B:94:0x01be, B:95:0x01cf, B:101:0x01f5, B:102:0x01fc, B:103:0x01fd, B:104:0x0204, B:110:0x0210), top: B:160:0x00c0 }] */
                /* JADX WARN: Code duplicated, block: B:98:0x01e5 A[Catch: all -> 0x0123, sb0 -> 0x0126, RemoteException -> 0x0129, TryCatch #8 {RemoteException -> 0x0129, sb0 -> 0x0126, all -> 0x0123, blocks: (B:36:0x00c0, B:42:0x00cc, B:44:0x00d3, B:45:0x00e9, B:49:0x00ef, B:51:0x00f7, B:53:0x00fb, B:54:0x0109, B:61:0x0114, B:69:0x0141, B:71:0x0149, B:72:0x0150, B:73:0x0157, B:68:0x012c, B:76:0x015a, B:77:0x015b, B:78:0x0162, B:79:0x0163, B:80:0x016a, B:83:0x016d, B:84:0x016e, B:86:0x0188, B:88:0x019b, B:90:0x01a3, B:96:0x01df, B:98:0x01e5, B:99:0x01ed, B:100:0x01f4, B:91:0x01b4, B:92:0x01bb, B:94:0x01be, B:95:0x01cf, B:101:0x01f5, B:102:0x01fc, B:103:0x01fd, B:104:0x0204, B:110:0x0210), top: B:160:0x00c0 }] */
                /* JADX WARN: Code duplicated, block: B:99:0x01ed A[Catch: all -> 0x0123, sb0 -> 0x0126, RemoteException -> 0x0129, TryCatch #8 {RemoteException -> 0x0129, sb0 -> 0x0126, all -> 0x0123, blocks: (B:36:0x00c0, B:42:0x00cc, B:44:0x00d3, B:45:0x00e9, B:49:0x00ef, B:51:0x00f7, B:53:0x00fb, B:54:0x0109, B:61:0x0114, B:69:0x0141, B:71:0x0149, B:72:0x0150, B:73:0x0157, B:68:0x012c, B:76:0x015a, B:77:0x015b, B:78:0x0162, B:79:0x0163, B:80:0x016a, B:83:0x016d, B:84:0x016e, B:86:0x0188, B:88:0x019b, B:90:0x01a3, B:96:0x01df, B:98:0x01e5, B:99:0x01ed, B:100:0x01f4, B:91:0x01b4, B:92:0x01bb, B:94:0x01be, B:95:0x01cf, B:101:0x01f5, B:102:0x01fc, B:103:0x01fd, B:104:0x0204, B:110:0x0210), top: B:160:0x00c0 }] */
                /* JADX INFO: renamed from: c */
                public static wb0 m9513c(Context context, vb0 vb0Var, String str) throws Throwable {
                    long j;
                    wb0 wb0Var;
                    Cursor cursor;
                    int i;
                    Boolean bool;
                    zzp zzpVarM9518h;
                    int i2;
                    IObjectWrapper iObjectWrapperM2046a;
                    Object objM2045b;
                    hn3 hn3Var;
                    zzq zzqVar;
                    hn3 hn3Var2;
                    boolean z;
                    IObjectWrapper iObjectWrapperM2050a;
                    Cursor cursor2;
/* 19 */            Context applicationContext = context.getApplicationContext();
/* 23 */            if (applicationContext == null) {
/* 790 */               throw new sb0("null application Context");
                    }
/* 25 */            ThreadLocal threadLocal = f18556j;
/* 31 */            hn3 hn3Var3 = (hn3) threadLocal.get();
/* 35 */            hn3 hn3Var4 = new hn3();
/* 38 */            threadLocal.set(hn3Var4);
/* 41 */            C0942g5 c0942g5 = f18557k;
/* 47 */            Long l = (Long) c0942g5.get();
/* 49 */            long jLongValue = l.longValue();
                    try {
/* 59 */                j = jLongValue;
                        try {
/* 65 */                    c0942g5.set(Long.valueOf(SystemClock.uptimeMillis()));
/* 70 */                    ub0 ub0VarMo1653c = vb0Var.mo1653c(context, str, f18558l);
/* 125 */                   new StringBuilder(str.length() + 26 + String.valueOf(ub0VarMo1653c.f17435a).length() + 19 + str.length() + 1 + String.valueOf(ub0VarMo1653c.f17436b).length());
/* 128 */                   int i3 = ub0VarMo1653c.f17437c;
/* 130 */                   if (i3 != 0) {
/* 133 */                       if (i3 != -1) {
/* 145 */                           if (i3 == 1 || ub0VarMo1653c.f17436b != 0) {
/* 152 */                               if (i3 == -1) {
/* 156 */                                   "Selected local version of ".concat(str);
/* 161 */                                   wb0 wb0Var2 = new wb0(applicationContext);
/* 166 */                                   if (j == 0) {
/* 168 */                                       c0942g5.remove();
                                            } else {
/* 172 */                                       c0942g5.set(l);
                                            }
/* 175 */                                   cursor2 = hn3Var4.f9161a;
/* 177 */                                   if (cursor2 != null) {
/* 179 */                                       cursor2.close();
                                            }
/* 182 */                                   threadLocal.set(hn3Var3);
/* 185 */                                   return wb0Var2;
                                        }
/* 187 */                               if (i3 == 1) {
/* 661 */                                   StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 36);
/* 664 */                                   sb.append("VersionPolicy returned invalid code:");
/* 667 */                                   sb.append(i3);
/* 677 */                                   throw new sb0(sb.toString());
                                        }
                                        try {
/* 189 */                                   i = ub0VarMo1653c.f17436b;
                                            try {
                                                synchronized (wb0.class) {
/* 198 */                                           if (m9515e(context)) {
/* 527 */                                               throw new sb0("Remote loading disabled");
                                                    }
/* 200 */                                           bool = f18551e;
                                                }
/* 203 */                                       if (bool != null) {
/* 517 */                                           throw new sb0("Failed to determine which loading route to use.");
                                                }
/* 210 */                                       if (bool.booleanValue()) {
/* 229 */                                           new StringBuilder(str.length() + 40 + String.valueOf(i).length());
                                                    synchronized (wb0.class) {
/* 235 */                                               zzqVar = f18560n;
                                                    }
/* 238 */                                           if (zzqVar != null) {
/* 363 */                                               throw new sb0("DynamiteLoaderV2 was not cached.");
                                                    }
/* 244 */                                           hn3Var2 = (hn3) threadLocal.get();
/* 246 */                                           if (hn3Var2 != null || hn3Var2.f9161a == null) {
/* 355 */                                               throw new sb0("No result cursor");
                                                    }
/* 252 */                                           Context applicationContext2 = context.getApplicationContext();
/* 256 */                                           Cursor cursor3 = hn3Var2.f9161a;
/* 261 */                                           new ObjectWrapper(null);
                                                    synchronized (wb0.class) {
/* 273 */                                               z = f18554h >= 2;
                                                    }
/* 275 */                                           if (z) {
/* 287 */                                               iObjectWrapperM2050a = zzqVar.m2051b(new ObjectWrapper(applicationContext2), str, i, new ObjectWrapper(cursor3));
                                                    } else {
/* 305 */                                               AbstractC1245n0.m4889q("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
/* 318 */                                               iObjectWrapperM2050a = zzqVar.m2050a(new ObjectWrapper(applicationContext2), str, i, new ObjectWrapper(cursor3));
                                                    }
/* 326 */                                           Context context2 = (Context) ObjectWrapper.m2045b(iObjectWrapperM2050a);
/* 328 */                                           if (context2 == null) {
/* 344 */                                               throw new sb0("Failed to get module context");
                                                    }
/* 332 */                                           wb0Var = new wb0(context2);
                                                } else {
/* 384 */                                           new StringBuilder(str.length() + 40 + String.valueOf(i).length());
/* 387 */                                           zzpVarM9518h = m9518h(context);
/* 391 */                                           if (zzpVarM9518h != null) {
/* 509 */                                               throw new sb0("Failed to create IDynamiteLoader.");
                                                    }
/* 398 */                                           Parcel parcelZzB = zzpVarM9518h.zzB(6, zzpVarM9518h.zza());
/* 402 */                                           i2 = parcelZzB.readInt();
/* 406 */                                           parcelZzB.recycle();
/* 410 */                                           if (i2 >= 3) {
/* 416 */                                               hn3Var = (hn3) threadLocal.get();
/* 418 */                                               if (hn3Var != null) {
/* 444 */                                                   throw new sb0("No cached result cursor holder");
                                                        }
/* 432 */                                               iObjectWrapperM2046a = zzpVarM9518h.m2049t0(new ObjectWrapper(context), str, i, new ObjectWrapper(hn3Var.f9161a));
                                                    } else if (i2 == 2) {
/* 451 */                                               AbstractC1245n0.m4889q("DynamiteModule", "IDynamite loader version = 2");
/* 459 */                                               iObjectWrapperM2046a = zzpVarM9518h.m2047b(new ObjectWrapper(context), str, i);
                                                    } else {
/* 468 */                                               AbstractC1245n0.m4889q("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
/* 476 */                                               iObjectWrapperM2046a = zzpVarM9518h.m2046a(new ObjectWrapper(context), str, i);
                                                    }
/* 480 */                                           objM2045b = ObjectWrapper.m2045b(iObjectWrapperM2046a);
/* 484 */                                           if (objM2045b != null) {
/* 501 */                                               throw new sb0("Failed to load remote module.");
                                                    }
/* 490 */                                           wb0Var = new wb0((Context) objM2045b);
                                                }
/* 613 */                                       if (j == 0) {
/* 617 */                                           f18557k.remove();
                                                } else {
/* 623 */                                           f18557k.set(l);
                                                }
/* 626 */                                       cursor = hn3Var4.f9161a;
/* 628 */                                       if (cursor != null) {
/* 630 */                                           cursor.close();
                                                }
/* 635 */                                       f18556j.set(hn3Var3);
/* 638 */                                       return wb0Var;
                                            } catch (RemoteException e) {
/* 548 */                                       throw new sb0("Failed to load remote module.", e);
                                            } catch (sb0 e2) {
/* 540 */                                       throw e2;
                                            } catch (Throwable th) {
/* 537 */                                       throw new sb0("Failed to load remote module.", th);
                                            }
                                        } catch (sb0 e3) {
/* 551 */                                   String message = e3.getMessage();
/* 567 */                                   StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 30);
/* 570 */                                   sb2.append("Failed to load remote module: ");
/* 573 */                                   sb2.append(message);
/* 580 */                                   AbstractC1245n0.m4889q("DynamiteModule", sb2.toString());
/* 583 */                                   int i4 = ub0VarMo1653c.f17435a;
/* 585 */                                   if (i4 == 0 || vb0Var.mo1653c(context, str, new vm2(i4)).f17437c != -1) {
/* 646 */                                       throw new sb0("Remote load failed. No local fallback found.", e3);
                                            }
/* 603 */                                   "Selected local version of ".concat(str);
/* 608 */                                   wb0Var = new wb0(applicationContext);
                                        }
                                    }
                                } else if (ub0VarMo1653c.f17435a != 0) {
/* 139 */                           i3 = -1;
/* 145 */                           if (i3 == 1) {
                                    }
/* 152 */                           if (i3 == -1) {
/* 156 */                               "Selected local version of ".concat(str);
/* 161 */                               wb0 wb0Var3 = new wb0(applicationContext);
/* 166 */                               if (j == 0) {
/* 168 */                                   c0942g5.remove();
                                        } else {
/* 172 */                                   c0942g5.set(l);
                                        }
/* 175 */                               cursor2 = hn3Var4.f9161a;
/* 177 */                               if (cursor2 != null) {
/* 179 */                                   cursor2.close();
                                        }
/* 182 */                               threadLocal.set(hn3Var3);
/* 185 */                               return wb0Var3;
                                    }
/* 187 */                           if (i3 == 1) {
/* 661 */                               StringBuilder sb3 = new StringBuilder(String.valueOf(i3).length() + 36);
/* 664 */                               sb3.append("VersionPolicy returned invalid code:");
/* 667 */                               sb3.append(i3);
/* 677 */                               throw new sb0(sb3.toString());
                                    }
/* 189 */                           i = ub0VarMo1653c.f17436b;
                                    synchronized (wb0.class) {
/* 198 */                               if (m9515e(context)) {
/* 527 */                                   throw new sb0("Remote loading disabled");
                                        }
/* 200 */                               bool = f18551e;
/* 203 */                               if (bool != null) {
/* 517 */                                   throw new sb0("Failed to determine which loading route to use.");
                                        }
/* 210 */                               if (bool.booleanValue()) {
/* 229 */                                   new StringBuilder(str.length() + 40 + String.valueOf(i).length());
                                            synchronized (wb0.class) {
/* 235 */                                       zzqVar = f18560n;
/* 238 */                                       if (zzqVar != null) {
/* 363 */                                           throw new sb0("DynamiteLoaderV2 was not cached.");
                                                }
/* 244 */                                       hn3Var2 = (hn3) threadLocal.get();
/* 246 */                                       if (hn3Var2 != null) {
                                                }
/* 355 */                                       throw new sb0("No result cursor");
                                            }
                                        }
/* 384 */                               new StringBuilder(str.length() + 40 + String.valueOf(i).length());
/* 387 */                               zzpVarM9518h = m9518h(context);
/* 391 */                               if (zzpVarM9518h != null) {
/* 509 */                                   throw new sb0("Failed to create IDynamiteLoader.");
                                        }
/* 398 */                               Parcel parcelZzB2 = zzpVarM9518h.zzB(6, zzpVarM9518h.zza());
/* 402 */                               i2 = parcelZzB2.readInt();
/* 406 */                               parcelZzB2.recycle();
/* 410 */                               if (i2 >= 3) {
/* 416 */                                   hn3Var = (hn3) threadLocal.get();
/* 418 */                                   if (hn3Var != null) {
/* 444 */                                       throw new sb0("No cached result cursor holder");
                                            }
/* 432 */                                   iObjectWrapperM2046a = zzpVarM9518h.m2049t0(new ObjectWrapper(context), str, i, new ObjectWrapper(hn3Var.f9161a));
                                        } else if (i2 == 2) {
/* 451 */                                   AbstractC1245n0.m4889q("DynamiteModule", "IDynamite loader version = 2");
/* 459 */                                   iObjectWrapperM2046a = zzpVarM9518h.m2047b(new ObjectWrapper(context), str, i);
                                        } else {
/* 468 */                                   AbstractC1245n0.m4889q("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
/* 476 */                                   iObjectWrapperM2046a = zzpVarM9518h.m2046a(new ObjectWrapper(context), str, i);
                                        }
/* 480 */                               objM2045b = ObjectWrapper.m2045b(iObjectWrapperM2046a);
/* 484 */                               if (objM2045b != null) {
/* 501 */                                   throw new sb0("Failed to load remote module.");
                                        }
/* 490 */                               wb0Var = new wb0((Context) objM2045b);
/* 613 */                               if (j == 0) {
/* 617 */                                   f18557k.remove();
                                        } else {
/* 623 */                                   f18557k.set(l);
                                        }
/* 626 */                               cursor = hn3Var4.f9161a;
/* 628 */                               if (cursor != null) {
/* 630 */                                   cursor.close();
                                        }
/* 635 */                               f18556j.set(hn3Var3);
/* 638 */                               return wb0Var;
                                    }
                                }
                            }
/* 680 */                   int i5 = ub0VarMo1653c.f17435a;
/* 682 */                   int i6 = ub0VarMo1653c.f17436b;
/* 716 */                   StringBuilder sb4 = new StringBuilder(str.length() + 46 + String.valueOf(i5).length() + 23 + String.valueOf(i6).length() + 1);
/* 719 */                   sb4.append("No acceptable module ");
/* 722 */                   sb4.append(str);
/* 725 */                   sb4.append(" found. Local version is ");
/* 728 */                   sb4.append(i5);
/* 733 */                   sb4.append(" and remote version is ");
/* 736 */                   sb4.append(i6);
/* 741 */                   sb4.append(".");
/* 751 */                   throw new sb0(sb4.toString());
                        } catch (Throwable th2) {
/* 142 */                   th = th2;
/* 757 */                   if (j == 0) {
/* 761 */                       f18557k.remove();
                            } else {
/* 767 */                       f18557k.set(l);
                            }
/* 770 */                   Cursor cursor4 = hn3Var4.f9161a;
/* 772 */                   if (cursor4 != null) {
/* 774 */                       cursor4.close();
                            }
/* 779 */                   f18556j.set(hn3Var3);
/* 782 */                   throw th;
                        }
                    } catch (Throwable th3) {
/* 752 */               th = th3;
/* 753 */               j = jLongValue;
                    }
                }

                /* JADX WARN: Code duplicated, block: B:102:0x0191  */
                /* JADX WARN: Code duplicated, block: B:51:0x00b4 A[Catch: all -> 0x003b, TryCatch #12 {all -> 0x003b, blocks: (B:10:0x002b, B:12:0x0037, B:52:0x00bd, B:17:0x0040, B:19:0x0047, B:21:0x004d, B:26:0x0054, B:28:0x0058, B:31:0x0061, B:33:0x0069, B:36:0x0070, B:43:0x009c, B:44:0x00a4, B:39:0x0077, B:41:0x007d, B:42:0x008e, B:47:0x00a7, B:50:0x00aa, B:51:0x00b4, B:18:0x0043), top: B:150:0x002b, inners: #13 }] */
                /* JADX INFO: renamed from: d */
                public static int m9514d(Context context, String str, boolean z) {
                    Throwable th;
                    RemoteException remoteException;
                    int i;
                    Cursor cursor;
                    try {
                        synchronized (wb0.class) {
/* 8 */                     Boolean bool = f18551e;
/* 10 */                    boolean z2 = true;
/* 11 */                    Cursor cursor2 = null;
/* 13 */                    if (bool == null) {
                                try {
/* 35 */                            Field declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteModule$DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                                    synchronized (declaredField.getDeclaringClass()) {
                                        try {
/* 48 */                                    ClassLoader classLoader = (ClassLoader) declaredField.get(null);
/* 54 */                                    if (classLoader == ClassLoader.getSystemClassLoader()) {
/* 56 */                                        bool = Boolean.FALSE;
                                            } else if (classLoader != null) {
                                                try {
/* 65 */                                            m9517g(classLoader);
                                                } catch (sb0 unused) {
                                                }
/* 68 */                                        bool = Boolean.TRUE;
                                            } else {
/* 76 */                                        if (!m9515e(context)) {
/* 12 */                                            return 0;
                                                }
/* 87 */                                        if (f18553g) {
/* 185 */                                           declaredField.set(null, ClassLoader.getSystemClassLoader());
/* 188 */                                           bool = Boolean.FALSE;
                                                } else {
/* 89 */                                            Boolean bool2 = Boolean.TRUE;
/* 95 */                                            if (bool2.equals(null)) {
/* 185 */                                               declaredField.set(null, ClassLoader.getSystemClassLoader());
/* 188 */                                               bool = Boolean.FALSE;
                                                    } else {
                                                        try {
/* 98 */                                                    int iM9516f = m9516f(context, str, z, true);
/* 102 */                                                   String str2 = f18552f;
/* 104 */                                                   if (str2 != null && !str2.isEmpty()) {
/* 113 */                                                       ClassLoader classLoaderM3019G = de3.m3019G();
/* 117 */                                                       if (classLoaderM3019G == null) {
/* 124 */                                                           if (Build.VERSION.SDK_INT >= 29) {
/* 126 */                                                               AbstractC2136r9.m8089d();
/* 129 */                                                               String str3 = f18552f;
/* 131 */                                                               kb1.m6061n(str3);
/* 138 */                                                               classLoaderM3019G = AbstractC2136r9.m8088c(ClassLoader.getSystemClassLoader(), str3);
                                                                    } else {
/* 145 */                                                               String str4 = f18552f;
/* 147 */                                                               kb1.m6061n(str4);
/* 154 */                                                               classLoaderM3019G = new sf3(str4, ClassLoader.getSystemClassLoader());
                                                                    }
                                                                }
/* 157 */                                                       m9517g(classLoaderM3019G);
/* 160 */                                                       declaredField.set(null, classLoaderM3019G);
/* 163 */                                                       f18551e = bool2;
/* 167 */                                                       return iM9516f;
                                                            }
/* 170 */                                                   return iM9516f;
                                                        } catch (sb0 unused2) {
/* 175 */                                                   declaredField.set(null, ClassLoader.getSystemClassLoader());
/* 178 */                                                   bool = Boolean.FALSE;
                                                        }
                                                    }
                                                }
                                            }
/* 231 */                                   f18551e = bool;
                                        } catch (Throwable th2) {
/* 193 */                                   throw th2;
                                        }
                                    }
                                } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e) {
/* 201 */                           String string = e.toString();
/* 213 */                           StringBuilder sb = new StringBuilder(string.length() + 30);
/* 216 */                           sb.append("Failed to load module via V2: ");
/* 219 */                           sb.append(string);
/* 226 */                           AbstractC1245n0.m4889q("DynamiteModule", sb.toString());
/* 229 */                           bool = Boolean.FALSE;
                                }
                            }
/* 238 */                   if (bool.booleanValue()) {
                                try {
/* 240 */                           return m9516f(context, str, z, false);
                                } catch (sb0 e2) {
/* 253 */                           String message = e2.getMessage();
/* 269 */                           StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 42);
/* 272 */                           sb2.append("Failed to retrieve remote module version: ");
/* 275 */                           sb2.append(message);
/* 282 */                           AbstractC1245n0.m4889q("DynamiteModule", sb2.toString());
/* 12 */                            return 0;
                                }
                            }
/* 288 */                   zzp zzpVarM9518h = m9518h(context);
                            try {
/* 292 */                       if (zzpVarM9518h == null) {
/* 12 */                            return 0;
                                }
                                try {
/* 301 */                           Parcel parcelZzB = zzpVarM9518h.zzB(6, zzpVarM9518h.zza());
/* 305 */                           int i2 = parcelZzB.readInt();
/* 309 */                           parcelZzB.recycle();
/* 313 */                           if (i2 >= 3) {
/* 315 */                               ThreadLocal threadLocal = f18556j;
/* 321 */                               hn3 hn3Var = (hn3) threadLocal.get();
/* 323 */                               if (hn3Var != null && (cursor = hn3Var.f9161a) != null) {
/* 329 */                                   return cursor.getInt(0);
                                        }
/* 366 */                               Cursor cursor3 = (Cursor) ObjectWrapper.m2045b(zzpVarM9518h.m2048s0(new ObjectWrapper(context), str, z, ((Long) f18557k.get()).longValue()));
/* 368 */                               if (cursor3 != null) {
                                            try {
/* 374 */                                       if (cursor3.moveToFirst()) {
/* 377 */                                           i = cursor3.getInt(0);
/* 381 */                                           if (i > 0) {
/* 387 */                                               hn3 hn3Var2 = (hn3) threadLocal.get();
/* 389 */                                               if (hn3Var2 == null || hn3Var2.f9161a != null) {
/* 398 */                                                   z2 = false;
                                                        } else {
/* 395 */                                                   hn3Var2.f9161a = cursor3;
                                                        }
/* 399 */                                               cursor2 = z2 ? null : cursor3;
                                                    }
/* 403 */                                           if (cursor2 != null) {
/* 405 */                                               cursor2.close();
                                                    }
                                                }
                                            } catch (RemoteException e3) {
/* 415 */                                       remoteException = e3;
/* 434 */                                       cursor2 = cursor3;
/* 521 */                                       String message2 = remoteException.getMessage();
/* 537 */                                       StringBuilder sb3 = new StringBuilder(String.valueOf(message2).length() + 42);
/* 540 */                                       sb3.append("Failed to retrieve remote module version: ");
/* 543 */                                       sb3.append(message2);
/* 550 */                                       AbstractC1245n0.m4889q("DynamiteModule", sb3.toString());
/* 553 */                                       if (cursor2 == null) {
/* 12 */                                            return 0;
                                                }
/* 555 */                                       cursor2.close();
/* 12 */                                        return 0;
                                            } catch (Throwable th3) {
/* 412 */                                       th = th3;
/* 431 */                                       cursor2 = cursor3;
/* 562 */                                       if (cursor2 == null) {
/* 567 */                                           throw th;
                                                }
/* 564 */                                       cursor2.close();
/* 567 */                                       throw th;
                                            }
                                        }
/* 421 */                               AbstractC1245n0.m4889q("DynamiteModule", "Failed to retrieve remote module version.");
/* 424 */                               if (cursor3 == null) {
/* 12 */                                    return 0;
                                        }
/* 426 */                               cursor3.close();
/* 12 */                                return 0;
                                    }
/* 439 */                           if (i2 == 2) {
/* 445 */                               AbstractC1245n0.m4889q("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
/* 450 */                               ObjectWrapper objectWrapper = new ObjectWrapper(context);
/* 453 */                               Parcel parcelZza = zzpVarM9518h.zza();
/* 457 */                               zzc.zze(parcelZza, objectWrapper);
/* 460 */                               parcelZza.writeString(str);
/* 463 */                               parcelZza.writeInt(z ? 1 : 0);
/* 467 */                               Parcel parcelZzB2 = zzpVarM9518h.zzB(5, parcelZza);
/* 471 */                               i = parcelZzB2.readInt();
/* 475 */                               parcelZzB2.recycle();
                                    } else {
/* 483 */                               AbstractC1245n0.m4889q("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
/* 488 */                               ObjectWrapper objectWrapper2 = new ObjectWrapper(context);
/* 491 */                               Parcel parcelZza2 = zzpVarM9518h.zza();
/* 495 */                               zzc.zze(parcelZza2, objectWrapper2);
/* 498 */                               parcelZza2.writeString(str);
/* 501 */                               parcelZza2.writeInt(z ? 1 : 0);
/* 504 */                               Parcel parcelZzB3 = zzpVarM9518h.zzB(3, parcelZza2);
/* 508 */                               i = parcelZzB3.readInt();
/* 512 */                               parcelZzB3.recycle();
                                    }
/* 408 */                           return i;
                                } catch (RemoteException e4) {
/* 518 */                           remoteException = e4;
                                }
                            } catch (Throwable th4) {
/* 516 */                       th = th4;
                            }
                        }
                    } catch (Throwable th5) {
                        try {
/* 570 */                   kb1.m6061n(context);
/* 583 */                   throw th5;
                        } catch (Exception e5) {
/* 580 */                   AbstractC1245n0.m4877e("CrashUtils", "Error adding exception to DropBox!", e5);
/* 583 */                   throw th5;
                        }
                    }
                }

                /* JADX INFO: renamed from: e */
                public static boolean m9515e(Context context) {
                    ApplicationInfo applicationInfo;
/* 1 */             Boolean bool = Boolean.TRUE;
/* 9 */             if (bool.equals(null) || bool.equals(f18555i)) {
/* 8 */                 return true;
                    }
/* 23 */            boolean z = false;
/* 24 */            if (f18555i == null) {
/* 42 */                ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", Build.VERSION.SDK_INT >= 29 ? 268435456 : 0);
/* 55 */                if (qr0.f15712b.m8004c(context, 10000000) == 0 && providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
/* 69 */                    z = true;
                        }
/* 74 */                f18555i = Boolean.valueOf(z);
/* 76 */                if (z && (applicationInfo = providerInfoResolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
/* 88 */                    f18553g = true;
                        }
                    }
/* 90 */            if (!z) {
/* 96 */                AbstractC1245n0.m4876d("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
                    }
/* 99 */            return z;
                }

                /* JADX WARN: Code duplicated, block: B:85:0x013a A[PHI: r3
  0x013a: PHI (r3v4 boolean) = (r3v3 boolean), (r3v6 boolean) binds: [B:58:0x00f1, B:83:0x0137] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX INFO: renamed from: f */
                public static int m9516f(Context context, String str, boolean z, boolean z2) throws Throwable {
                    Exception exc;
                    Throwable th;
                    MatrixCursor matrixCursor;
                    boolean z3;
/* 3 */             MatrixCursor matrixCursor2 = null;
                    try {
                        try {
/* 20 */                    boolean z4 = true;
/* 61 */                    Uri uriBuild = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").path(true != z ? "api" : "api_force_staging").appendPath(str).appendQueryParameter("requestStartUptime", String.valueOf(((Long) f18557k.get()).longValue())).build();
/* 69 */                    ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(uriBuild);
/* 74 */                    boolean z5 = false;
/* 75 */                    if (contentProviderClientAcquireUnstableContentProviderClient == null) {
/* 77 */                        matrixCursor = null;
                            } else {
                                try {
/* 84 */                            Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uriBuild, null, null, null, null);
/* 88 */                            if (cursorQuery == null) {
/* 90 */                                contentProviderClientAcquireUnstableContentProviderClient.release();
/* 77 */                                matrixCursor = null;
                                    } else {
                                        try {
/* 94 */                                    int count = cursorQuery.getCount();
/* 98 */                                    int columnCount = cursorQuery.getColumnCount();
/* 108 */                                   matrixCursor = new MatrixCursor(cursorQuery.getColumnNames(), count);
/* 112 */                                   for (int i = 0; i < count; i++) {
/* 118 */                                       if (!cursorQuery.moveToPosition(i)) {
/* 206 */                                           throw new RemoteException("Cursor read incomplete (ContentProvider dead?)");
                                                }
/* 120 */                                       Object[] objArr = new Object[columnCount];
/* 123 */                                       for (int i2 = 0; i2 < columnCount; i2++) {
/* 125 */                                           int type = cursorQuery.getType(i2);
/* 129 */                                           if (type == 0) {
/* 188 */                                               objArr[i2] = null;
                                                    } else if (type == 1) {
/* 185 */                                               objArr[i2] = Long.valueOf(cursorQuery.getLong(i2));
                                                    } else if (type == 2) {
/* 174 */                                               objArr[i2] = Double.valueOf(cursorQuery.getDouble(i2));
                                                    } else if (type == 3) {
/* 163 */                                               objArr[i2] = cursorQuery.getString(i2);
                                                    } else {
/* 139 */                                               if (type != 4) {
/* 158 */                                                   throw new RemoteException("Unknown column type");
                                                        }
/* 145 */                                               objArr[i2] = cursorQuery.getBlob(i2);
                                                    }
                                                }
/* 193 */                                       matrixCursor.addRow(objArr);
                                            }
/* 207 */                                   cursorQuery.close();
/* 210 */                                   contentProviderClientAcquireUnstableContentProviderClient.release();
                                        } catch (Throwable th2) {
                                            try {
/* 217 */                                       cursorQuery.close();
/* 225 */                                       throw th2;
                                            } catch (Throwable th3) {
/* 222 */                                       th2.addSuppressed(th3);
/* 225 */                                       throw th2;
                                            }
                                        }
                                    }
                                } catch (RemoteException unused) {
                                } catch (Throwable th4) {
/* 226 */                           contentProviderClientAcquireUnstableContentProviderClient.release();
/* 229 */                           throw th4;
                                }
                            }
/* 230 */                   if (matrixCursor != null) {
                                try {
/* 236 */                           if (matrixCursor.moveToFirst()) {
/* 238 */                               int i3 = matrixCursor.getInt(0);
/* 242 */                               if (i3 > 0) {
                                            synchronized (wb0.class) {
                                                try {
/* 251 */                                           f18552f = matrixCursor.getString(2);
/* 255 */                                           int columnIndex = matrixCursor.getColumnIndex("loaderVersion");
/* 259 */                                           if (columnIndex >= 0) {
/* 265 */                                               f18554h = matrixCursor.getInt(columnIndex);
                                                    }
/* 273 */                                           int columnIndex2 = matrixCursor.getColumnIndex("disableStandaloneDynamiteLoader2");
/* 277 */                                           if (columnIndex2 >= 0) {
/* 287 */                                               z3 = matrixCursor.getInt(columnIndex2) != 0;
/* 288 */                                               f18553g = z3;
                                                    } else {
/* 291 */                                               z3 = false;
                                                    }
                                                } catch (Throwable th5) {
/* 318 */                                           throw th5;
                                                }
                                            }
/* 299 */                                   hn3 hn3Var = (hn3) f18556j.get();
/* 301 */                                   if (hn3Var == null || hn3Var.f9161a != null) {
/* 310 */                                       z4 = false;
                                            } else {
/* 307 */                                       hn3Var.f9161a = matrixCursor;
                                            }
/* 311 */                                   z5 = z3;
/* 312 */                                   matrixCursor2 = z4 ? null : matrixCursor;
                                        }
/* 325 */                               if (z2 && z5) {
/* 337 */                                   throw new sb0("forcing fallback to container DynamiteLoader impl");
                                        }
/* 344 */                               if (matrixCursor2 != null) {
/* 346 */                                   matrixCursor2.close();
                                        }
/* 349 */                               return i3;
                                    }
                                } catch (Exception e) {
/* 323 */                           exc = e;
/* 370 */                           if (exc instanceof sb0) {
/* 407 */                               throw exc;
                                    }
/* 374 */                           String message = exc.getMessage();
/* 390 */                           StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 25);
/* 393 */                           sb.append("V2 version check failed: ");
/* 396 */                           sb.append(message);
/* 406 */                           throw new sb0(sb.toString(), exc);
                                } catch (Throwable th6) {
/* 320 */                           th = th6;
/* 365 */                           matrixCursor2 = matrixCursor;
/* 408 */                           if (matrixCursor2 == null) {
/* 413 */                               throw th;
                                    }
/* 410 */                           matrixCursor2.close();
/* 413 */                           throw th;
                                }
                            }
/* 354 */                   AbstractC1245n0.m4889q("DynamiteModule", "Failed to retrieve remote module version.");
/* 364 */                   throw new sb0("Failed to connect to dynamite module ContentResolver.");
                        } catch (Throwable th7) {
/* 339 */                   th = th7;
                        }
                    } catch (Exception e2) {
/* 342 */               exc = e2;
                    }
                }

                /* JADX INFO: renamed from: g */
                public static void m9517g(ClassLoader classLoader) throws sb0 {
                    try {
/* 9 */                 zzq zzqVar = null;
/* 18 */                IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
/* 20 */                if (iBinder != null) {
/* 23 */                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
/* 36 */                    zzqVar = iInterfaceQueryLocalInterface instanceof zzq ? (zzq) iInterfaceQueryLocalInterface : new zzq(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
                        }
/* 39 */                f18560n = zzqVar;
                    } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
/* 50 */                throw new sb0("Failed to instantiate dynamite loader", e);
                    }
                }

                /* JADX INFO: renamed from: h */
                public static zzp m9518h(Context context) {
                    zzp zzpVar;
                    synchronized (wb0.class) {
/* 6 */                 zzp zzpVar2 = f18559m;
/* 8 */                 if (zzpVar2 != null) {
/* 11 */                    return zzpVar2;
                        }
                        try {
/* 36 */                    IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
/* 38 */                    if (iBinder == null) {
/* 40 */                        zzpVar = null;
                            } else {
/* 44 */                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
/* 61 */                        zzpVar = iInterfaceQueryLocalInterface instanceof zzp ? (zzp) iInterfaceQueryLocalInterface : new zzp(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
                            }
/* 64 */                    if (zzpVar != null) {
/* 66 */                        f18559m = zzpVar;
/* 69 */                        return zzpVar;
                            }
                        } catch (Exception e) {
/* 72 */                    String message = e.getMessage();
/* 88 */                    StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 45);
/* 91 */                    sb.append("Failed to load IDynamiteLoader from GmsCore: ");
/* 94 */                    sb.append(message);
/* 101 */                   AbstractC1245n0.m4876d("DynamiteModule", sb.toString());
                        }
/* 14 */                return null;
                    }
                }

                /* JADX INFO: renamed from: b */
                public final IBinder m9519b(String str) throws sb0 {
                    try {
/* 15 */                return (IBinder) this.f18561a.getClassLoader().loadClass(str).newInstance();
                    } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
/* 34 */                throw new sb0("Failed to instantiate module class: ".concat(str), e);
                    }
                }
            }
