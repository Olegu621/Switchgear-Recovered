            package p000;

            import android.animation.ObjectAnimator;
            import android.animation.PropertyValuesHolder;
            import android.animation.TimeInterpolator;
            import android.app.NotificationManager;
            import android.content.Context;
            import android.content.Intent;
            import android.content.SharedPreferences;
            import android.content.pm.ApplicationInfo;
            import android.content.pm.PackageManager;
            import android.database.Cursor;
            import android.database.sqlite.SQLiteDatabase;
            import android.database.sqlite.SQLiteException;
            import android.os.Build;
            import android.os.Bundle;
            import android.text.TextUtils;
            import android.util.Log;
            import android.util.Property;
            import android.view.View;
            import android.widget.EdgeEffect;
            import androidx.recyclerview.widget.AbstractC0133k;
            import androidx.transition.R$id;
            import androidx.transition.Visibility;
            import com.google.android.gms.internal.measurement.zzbv;
            import com.google.android.gms.internal.measurement.zzca;
            import com.google.android.gms.tasks.Tasks;
            import com.google.firebase.analytics.connector.AnalyticsConnector;
            import com.google.firebase.installations.FirebaseInstallations;
            import com.google.firebase.messaging.FirebaseMessaging;
            import com.supercell.p007id.scid_plugin.platform_interface.SharedDataContentProvider;
            import io.sentry.android.core.AbstractC1245n0;
            import java.io.ByteArrayOutputStream;
            import java.io.Closeable;
            import java.io.File;
            import java.io.IOException;
            import java.io.InputStream;
            import java.io.OutputStream;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.Map;
            import java.util.concurrent.ExecutionException;
            import kotlin.Unit;
            import kotlin.coroutines.C1846g;
            import kotlin.coroutines.CoroutineContext;
            import kotlin.jvm.internal.Intrinsics;
            import kotlinx.serialization.KSerializer;
            import kotlinx.serialization.descriptors.SerialDescriptor;
            import okhttp3.HttpUrl;
            import okio.Segment;
            import org.json.JSONArray;
            import org.json.JSONException;
            import org.json.JSONObject;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class b40 {

                /* JADX INFO: renamed from: a */
                public static final C0892et f2200a = new C0892et();

                /* JADX INFO: renamed from: b */
                public static final C2131r4 f2201b = new C2131r4("CONDITION_FALSE", 8);

                /* JADX INFO: renamed from: c */
                public static final C2131r4 f2202c = new C2131r4("NONE", 8);

                /* JADX INFO: renamed from: d */
                public static final C2131r4 f2203d = new C2131r4("PENDING", 8);

                /* JADX INFO: renamed from: e */
                public static final iq3 f2204e = new iq3();

                /* JADX INFO: renamed from: f */
                public static final jq3 f2205f = new jq3();

                /* JADX INFO: renamed from: A */
                public static final byte[] m1210A(InputStream inputStream) throws IOException {
/* 1 */             inputStream.getClass();
/* 16 */            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(Segment.SIZE, inputStream.available()));
/* 19 */            m1225i(inputStream, byteArrayOutputStream);
/* 22 */            byte[] byteArray = byteArrayOutputStream.toByteArray();
/* 26 */            byteArray.getClass();
/* 29 */            return byteArray;
                }

                /* JADX INFO: renamed from: B */
                public static final void m1211B(Object[] objArr, int i, int i2) {
/* 1 */             objArr.getClass();
/* 4 */             while (i < i2) {
/* 7 */                 objArr[i] = null;
/* 9 */                 i++;
                    }
                }

                /* JADX INFO: renamed from: C */
                public static boolean m1212C(Intent intent) {
                    Bundle extras;
/* 2 */             if (intent == null || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction()) || (extras = intent.getExtras()) == null) {
/* 1 */                 return false;
                    }
/* 32 */            return "1".equals(extras.getString("google.c.a.e"));
                }

                /* JADX INFO: renamed from: D */
                public static final void m1213D(int[] iArr, int[] iArr2, SerialDescriptor serialDescriptor) {
/* 1 */             serialDescriptor.getClass();
/* 6 */             ArrayList arrayList = new ArrayList();
/* 9 */             int length = iArr2.length;
/* 12 */            for (int i = 0; i < length; i++) {
/* 19 */                int i2 = iArr2[i] & (~iArr[i]);
/* 20 */                if (i2 != 0) {
/* 25 */                    for (int i3 = 0; i3 < 32; i3++) {
/* 29 */                        if ((i2 & 1) != 0) {
/* 38 */                            arrayList.add(serialDescriptor.mo136g((i * 32) + i3));
                                }
/* 41 */                        i2 >>>= 1;
                            }
                        }
                    }
/* 58 */            throw new ej1(serialDescriptor.mo130a(), arrayList);
                }

                /* JADX INFO: renamed from: E */
                public static final void m1214E(int i, int i2, SerialDescriptor serialDescriptor) {
/* 1 */             serialDescriptor.getClass();
/* 6 */             ArrayList arrayList = new ArrayList();
/* 10 */            int i3 = (~i) & i2;
/* 14 */            for (int i4 = 0; i4 < 32; i4++) {
/* 18 */                if ((i3 & 1) != 0) {
/* 24 */                    arrayList.add(serialDescriptor.mo136g(i4));
                        }
/* 27 */                i3 >>>= 1;
                    }
/* 41 */            throw new ej1(serialDescriptor.mo130a(), arrayList);
                }

                /* JADX WARN: Code duplicated, block: B:24:0x003e  */
                /* JADX WARN: Code duplicated, block: B:30:0x0082 A[Catch: SQLiteException -> 0x00b7, TryCatch #1 {SQLiteException -> 0x00b7, blocks: (B:26:0x0044, B:28:0x0074, B:30:0x0082, B:32:0x008a, B:33:0x008d, B:34:0x00b6, B:38:0x00bc, B:40:0x00bf, B:42:0x00c7, B:43:0x00ce, B:44:0x00d1, B:46:0x00d7, B:49:0x00e6, B:50:0x00ea, B:27:0x006d), top: B:60:0x0044, inners: #3 }] */
                /* JADX WARN: Code duplicated, block: B:32:0x008a A[Catch: SQLiteException -> 0x00b7, LOOP:0: B:29:0x0080->B:32:0x008a, LOOP_END, TryCatch #1 {SQLiteException -> 0x00b7, blocks: (B:26:0x0044, B:28:0x0074, B:30:0x0082, B:32:0x008a, B:33:0x008d, B:34:0x00b6, B:38:0x00bc, B:40:0x00bf, B:42:0x00c7, B:43:0x00ce, B:44:0x00d1, B:46:0x00d7, B:49:0x00e6, B:50:0x00ea, B:27:0x006d), top: B:60:0x0044, inners: #3 }] */
                /* JADX WARN: Code duplicated, block: B:38:0x00bc A[Catch: SQLiteException -> 0x00b7, LOOP:1: B:38:0x00bc->B:43:0x00ce, LOOP_START, PHI: r1
  0x00bc: PHI (r1v5 int) = (r1v4 int), (r1v6 int) binds: [B:37:0x00ba, B:43:0x00ce] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {SQLiteException -> 0x00b7, blocks: (B:26:0x0044, B:28:0x0074, B:30:0x0082, B:32:0x008a, B:33:0x008d, B:34:0x00b6, B:38:0x00bc, B:40:0x00bf, B:42:0x00c7, B:43:0x00ce, B:44:0x00d1, B:46:0x00d7, B:49:0x00e6, B:50:0x00ea, B:27:0x006d), top: B:60:0x0044, inners: #3 }] */
                /* JADX WARN: Code duplicated, block: B:40:0x00bf A[Catch: SQLiteException -> 0x00b7, TryCatch #1 {SQLiteException -> 0x00b7, blocks: (B:26:0x0044, B:28:0x0074, B:30:0x0082, B:32:0x008a, B:33:0x008d, B:34:0x00b6, B:38:0x00bc, B:40:0x00bf, B:42:0x00c7, B:43:0x00ce, B:44:0x00d1, B:46:0x00d7, B:49:0x00e6, B:50:0x00ea, B:27:0x006d), top: B:60:0x0044, inners: #3 }] */
                /* JADX WARN: Code duplicated, block: B:42:0x00c7 A[Catch: SQLiteException -> 0x00b7, TryCatch #1 {SQLiteException -> 0x00b7, blocks: (B:26:0x0044, B:28:0x0074, B:30:0x0082, B:32:0x008a, B:33:0x008d, B:34:0x00b6, B:38:0x00bc, B:40:0x00bf, B:42:0x00c7, B:43:0x00ce, B:44:0x00d1, B:46:0x00d7, B:49:0x00e6, B:50:0x00ea, B:27:0x006d), top: B:60:0x0044, inners: #3 }] */
                /* JADX WARN: Code duplicated, block: B:46:0x00d7 A[Catch: SQLiteException -> 0x00b7, TryCatch #1 {SQLiteException -> 0x00b7, blocks: (B:26:0x0044, B:28:0x0074, B:30:0x0082, B:32:0x008a, B:33:0x008d, B:34:0x00b6, B:38:0x00bc, B:40:0x00bf, B:42:0x00c7, B:43:0x00ce, B:44:0x00d1, B:46:0x00d7, B:49:0x00e6, B:50:0x00ea, B:27:0x006d), top: B:60:0x0044, inners: #3 }] */
                /* JADX WARN: Code duplicated, block: B:54:0x00f5  */
                /* JADX WARN: Code duplicated, block: B:69:0x008d A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:72:0x00ce A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:73:? A[RETURN, SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:74:? A[SYNTHETIC] */
                /* JADX INFO: renamed from: F */
                public static void m1215F(uh3 uh3Var, SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, String[] strArr) throws Throwable {
                    SQLiteDatabase sQLiteDatabase2;
                    Throwable th;
                    Cursor cursorQuery;
                    HashSet hashSet;
                    Cursor cursorRawQuery;
                    int i;
                    int i2;
/* 1 */             if (uh3Var == null) {
/* 252 */               C1951n4.m6859j("Monitor must not be null");
/* 255 */               return;
                    }
/* 3 */             Cursor cursor = null;
                    try {
                        try {
                            try {
                                try {
/* 21 */                            sQLiteDatabase2 = sQLiteDatabase;
                                    try {
/* 22 */                                cursorQuery = sQLiteDatabase2.query("SQLITE_MASTER", new String[]{"name"}, "name=?", new String[]{str}, null, null, null);
                                        try {
                                            try {
/* 26 */                                        boolean zMoveToFirst = cursorQuery.moveToFirst();
/* 30 */                                        cursorQuery.close();
/* 33 */                                        if (!zMoveToFirst) {
/* 66 */                                            sQLiteDatabase2.execSQL(str2);
                                                }
                                            } catch (SQLiteException e) {
/* 41 */                                        e = e;
/* 58 */                                        uh3Var.f17541w.m8512c(str, "Error querying for table", e);
/* 61 */                                        if (cursorQuery != null) {
/* 63 */                                            cursorQuery.close();
                                                }
                                            }
                                        } catch (Throwable th2) {
/* 37 */                                    th = th2;
/* 38 */                                    cursor = cursorQuery;
/* 244 */                                   if (cursor != null) {
/* 249 */                                       throw th;
                                            }
/* 246 */                                   cursor.close();
/* 249 */                                   throw th;
                                        }
                                    } catch (SQLiteException e2) {
/* 47 */                                e = e2;
/* 53 */                                cursorQuery = null;
/* 58 */                                uh3Var.f17541w.m8512c(str, "Error querying for table", e);
/* 61 */                                if (cursorQuery != null) {
/* 63 */                                    cursorQuery.close();
                                        }
/* 66 */                                sQLiteDatabase2.execSQL(str2);
/* 79 */                                hashSet = new HashSet();
/* 90 */                                StringBuilder sb = new StringBuilder(str.length() + 22);
/* 93 */                                sb.append("SELECT * FROM ");
/* 96 */                                sb.append(str);
/* 99 */                                sb.append(" LIMIT 0");
/* 106 */                               cursorRawQuery = sQLiteDatabase2.rawQuery(sb.toString(), null);
/* 114 */                               Collections.addAll(hashSet, cursorRawQuery.getColumnNames());
/* 117 */                               cursorRawQuery.close();
/* 129 */                               for (String str4 : str3.split(",")) {
/* 137 */                                   if (hashSet.remove(str4)) {
/* 161 */                                       StringBuilder sb2 = new StringBuilder(str.length() + 35 + String.valueOf(str4).length());
/* 164 */                                       sb2.append("Table ");
/* 167 */                                       sb2.append(str);
/* 170 */                                       sb2.append(" is missing required column: ");
/* 173 */                                       sb2.append(str4);
/* 183 */                                       throw new SQLiteException(sb2.toString());
                                            }
                                        }
/* 187 */                               if (strArr != null) {
/* 190 */                                   for (i = 0; i < strArr.length; i += 2) {
/* 198 */                                       if (!hashSet.remove(strArr[i])) {
/* 204 */                                           sQLiteDatabase2.execSQL(strArr[i + 1]);
                                                }
                                            }
                                        }
/* 214 */                               if (hashSet.isEmpty()) {
/* 229 */                                   return;
                                        }
/* 226 */                               uh3Var.f17541w.m8512c(str, "Table has extra columns. table, columns", TextUtils.join(", ", hashSet));
/* 229 */                               return;
                                    }
                                } catch (Throwable th3) {
/* 44 */                            th = th3;
/* 244 */                           if (cursor != null) {
/* 249 */                               throw th;
                                    }
/* 246 */                           cursor.close();
/* 249 */                           throw th;
                                }
                            } catch (SQLiteException e3) {
/* 50 */                        e = e3;
/* 51 */                        sQLiteDatabase2 = sQLiteDatabase;
                            }
/* 114 */                   Collections.addAll(hashSet, cursorRawQuery.getColumnNames());
/* 117 */                   cursorRawQuery.close();
/* 129 */                   while (i2 < r0) {
/* 137 */                       if (hashSet.remove(str4)) {
/* 161 */                           StringBuilder sb3 = new StringBuilder(str.length() + 35 + String.valueOf(str4).length());
/* 164 */                           sb3.append("Table ");
/* 167 */                           sb3.append(str);
/* 170 */                           sb3.append(" is missing required column: ");
/* 173 */                           sb3.append(str4);
/* 183 */                           throw new SQLiteException(sb3.toString());
                                }
                            }
/* 187 */                   if (strArr != null) {
/* 190 */                       while (i < strArr.length) {
/* 198 */                           if (!hashSet.remove(strArr[i])) {
/* 204 */                               sQLiteDatabase2.execSQL(strArr[i + 1]);
                                    }
                                }
                            }
/* 214 */                   if (hashSet.isEmpty()) {
/* 226 */                       uh3Var.f17541w.m8512c(str, "Table has extra columns. table, columns", TextUtils.join(", ", hashSet));
/* 229 */                       return;
                            }
/* 229 */                   return;
                        } catch (Throwable th4) {
/* 232 */                   cursorRawQuery.close();
/* 235 */                   throw th4;
                        }
/* 79 */                hashSet = new HashSet();
/* 90 */                StringBuilder sb4 = new StringBuilder(str.length() + 22);
/* 93 */                sb4.append("SELECT * FROM ");
/* 96 */                sb4.append(str);
/* 99 */                sb4.append(" LIMIT 0");
/* 106 */               cursorRawQuery = sQLiteDatabase2.rawQuery(sb4.toString(), null);
                    } catch (SQLiteException e4) {
/* 240 */               uh3Var.f17538f.m8511b(str, "Failed to verify columns on table that was just created");
/* 243 */               throw e4;
                    }
                }

                /* JADX INFO: renamed from: G */
                public static void m1216G(uh3 uh3Var, SQLiteDatabase sQLiteDatabase) {
/* 1 */             if (uh3Var == null) {
/* 68 */                C1951n4.m6859j("Monitor must not be null");
/* 71 */                return;
                    }
/* 3 */             sh3 sh3Var = uh3Var.f17541w;
/* 7 */             zzbv.zza();
/* 10 */            String path = sQLiteDatabase.getPath();
/* 14 */            int i = zzca.zzb;
/* 16 */            File file = new File(path);
/* 24 */            if (!file.setReadable(false, false)) {
/* 28 */                sh3Var.m8510a("Failed to turn off database read permission");
                    }
/* 35 */            if (!file.setWritable(false, false)) {
/* 39 */                sh3Var.m8510a("Failed to turn off database write permission");
                    }
/* 47 */            if (!file.setReadable(true, true)) {
/* 51 */                sh3Var.m8510a("Failed to turn on database read permission for owner");
                    }
/* 58 */            if (file.setWritable(true, true)) {
/* 65 */                return;
                    }
/* 62 */            sh3Var.m8510a("Failed to turn on database write permission for owner");
                }

                /* JADX INFO: renamed from: a */
                public static final xx0 m1217a(String str, KSerializer kSerializer) {
/* 8 */             return new xx0(str, new yx0(kSerializer));
                }

                /* JADX INFO: renamed from: b */
                public static final String m1218b(Object[] objArr, int i, int i2, AbstractC0002a0 abstractC0002a0) {
/* 7 */             StringBuilder sb = new StringBuilder((i2 * 3) + 2);
/* 12 */            sb.append("[");
/* 16 */            for (int i3 = 0; i3 < i2; i3++) {
/* 18 */                if (i3 > 0) {
/* 22 */                    sb.append(", ");
                        }
/* 27 */                Object obj = objArr[i + i3];
/* 29 */                if (obj == abstractC0002a0) {
/* 33 */                    sb.append("(this Collection)");
                        } else {
/* 37 */                    sb.append(obj);
                        }
                    }
/* 45 */            sb.append("]");
/* 48 */            return sb.toString();
                }

                /* JADX WARN: Code duplicated, block: B:190:0x0292  */
                /* JADX WARN: Code duplicated, block: B:207:0x02da  */
                /* JADX WARN: Code duplicated, block: B:209:0x02dd  */
                /* JADX WARN: Code duplicated, block: B:211:0x02e3  */
                /* JADX WARN: Code duplicated, block: B:213:0x0304  */
                /* JADX WARN: Code duplicated, block: B:236:0x0372  */
                /* JADX WARN: Code duplicated, block: B:238:0x038c  */
                /* JADX WARN: Code duplicated, block: B:240:0x0391  */
                /* JADX WARN: Code duplicated, block: B:244:0x03bb  */
                /* JADX WARN: Code duplicated, block: B:254:0x0422  */
                /* JADX WARN: Code duplicated, block: B:410:0x06a7  */
                /* JADX WARN: Code duplicated, block: B:413:0x06b2  */
                /* JADX WARN: Code duplicated, block: B:414:0x06b5  */
                /* JADX WARN: Code duplicated, block: B:417:0x06bb  */
                /* JADX WARN: Code duplicated, block: B:418:0x06be  */
                /* JADX WARN: Code duplicated, block: B:420:0x06c2  */
                /* JADX WARN: Code duplicated, block: B:422:0x06ca  */
                /* JADX WARN: Code duplicated, block: B:425:0x06d2  */
                /* JADX WARN: Code duplicated, block: B:427:0x06d6 A[ADDED_TO_REGION] */
                /* JADX WARN: Code duplicated, block: B:437:0x06f2 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:66:0x00f6  */
                /* JADX WARN: Code duplicated, block: B:75:0x0117  */
                /* JADX INFO: renamed from: c */
                public static void m1219c(a00 a00Var, t71 t71Var, ArrayList arrayList, int i) {
                    int i2;
                    C1804js[] c1804jsArr;
                    int i3;
                    int i4;
                    boolean z;
                    boolean z2;
                    boolean z3;
                    int i5;
                    C2569zz c2569zz;
                    t71 t71Var2;
                    C2569zz c2569zz2;
                    qf2 qf2Var;
                    C2051oz c2051oz;
                    qf2 qf2Var2;
                    C2569zz c2569zz3;
                    int i6;
                    C2051oz[] c2051ozArr;
                    C2051oz c2051oz2;
                    qf2 qf2Var3;
                    int i7;
                    C2051oz[] c2051ozArr2;
                    int i8;
                    C2051oz c2051oz3;
                    C2051oz c2051oz4;
                    qf2 qf2Var4;
                    C2051oz c2051oz5;
                    qf2 qf2Var5;
                    int size;
                    ArrayList arrayList2;
                    float f;
                    float f2;
                    float f3;
                    qf2 qf2Var6;
                    qf2 qf2Var7;
                    qf2 qf2Var8;
                    qf2 qf2Var9;
                    C1789jd c1789jdM8717l;
                    float f4;
                    C2051oz c2051oz6;
                    C2569zz c2569zz4;
                    int i9;
                    int i10;
                    int i11;
                    C2569zz c2569zz5;
                    float f5;
/* 1 */             a00 a00Var2 = a00Var;
/* 7 */             if (i == 0) {
/* 9 */                 i2 = a00Var2.f4D0;
/* 11 */                c1804jsArr = a00Var2.f7G0;
/* 13 */                i3 = 0;
                    } else {
/* 17 */                i2 = a00Var2.f5E0;
/* 19 */                c1804jsArr = a00Var2.f6F0;
/* 21 */                i3 = 2;
                    }
/* 14 */            int i12 = i2;
/* 15 */            C1804js[] c1804jsArr2 = c1804jsArr;
/* 23 */            int i13 = 0;
/* 24 */            while (i13 < i12) {
/* 26 */                C1804js c1804js = c1804jsArr2[i13];
/* 28 */                boolean z4 = c1804js.f12466q;
/* 30 */                C2569zz c2569zz6 = c1804js.f12450a;
/* 32 */                C2051oz[] c2051ozArr3 = c2569zz6.f20412R;
/* 34 */                EnumC2516yz enumC2516yz = EnumC2516yz.f19867c;
/* 38 */                int i14 = 8;
/* 40 */                float f6 = 0.0f;
/* 42 */                if (z4) {
/* 355 */                   i4 = i13;
                        } else {
/* 44 */                    int i15 = c1804js.f12461l;
/* 46 */                    int i16 = i15 * 2;
/* 48 */                    C2569zz c2569zz7 = c2569zz6;
/* 49 */                    C2569zz c2569zz8 = c2569zz7;
/* 51 */                    boolean z5 = false;
/* 53 */                    while (!z5) {
/* 61 */                        c1804js.f12458i++;
/* 63 */                        C2569zz[] c2569zzArr = c2569zz7.f20452p0;
/* 65 */                        C2051oz[] c2051ozArr4 = c2569zz7.f20412R;
/* 67 */                        c2569zzArr[i15] = null;
/* 71 */                        c2569zz7.f20450o0[i15] = null;
/* 75 */                        if (c2569zz7.f20438i0 != i14) {
/* 77 */                            c2569zz7.m10471k(i15);
/* 82 */                            c2051ozArr4[i16].m7247e();
/* 85 */                            int i17 = i16 + 1;
/* 89 */                            c2051ozArr4[i17].m7247e();
/* 94 */                            c2051ozArr4[i16].m7247e();
/* 99 */                            c2051ozArr4[i17].m7247e();
/* 104 */                           if (c1804js.f12451b == null) {
/* 106 */                               c1804js.f12451b = c2569zz7;
                                    }
/* 108 */                           c1804js.f12453d = c2569zz7;
/* 112 */                           EnumC2516yz enumC2516yz2 = c2569zz7.f20415U[i15];
/* 114 */                           if (enumC2516yz2 == enumC2516yz) {
/* 118 */                               int i18 = c2569zz7.f20459t[i15];
/* 120 */                               i10 = i13;
/* 123 */                               if (i18 == 0 || i18 == 3 || i18 == 2) {
/* 138 */                                   c1804js.f12459j++;
/* 142 */                                   float f7 = c2569zz7.f20448n0[i15];
/* 146 */                                   if (f7 > 0.0f) {
/* 148 */                                       f5 = f7;
/* 154 */                                       c1804js.f12460k += f5;
                                            } else {
/* 157 */                                       f5 = f7;
                                            }
/* 161 */                                   i11 = i15;
/* 165 */                                   if (c2569zz7.f20438i0 != 8 && enumC2516yz2 == enumC2516yz && (i18 == 0 || i18 == 3)) {
/* 176 */                                       if (f5 < 0.0f) {
/* 180 */                                           c1804js.f12463n = true;
                                                } else {
/* 185 */                                           c1804js.f12464o = true;
                                                }
/* 189 */                                       if (c1804js.f12457h == null) {
/* 196 */                                           c1804js.f12457h = new ArrayList();
                                                }
/* 200 */                                       c1804js.f12457h.add(c2569zz7);
                                            }
/* 205 */                                   if (c1804js.f12455f == null) {
/* 207 */                                       c1804js.f12455f = c2569zz7;
                                            }
/* 209 */                                   C2569zz c2569zz9 = c1804js.f12456g;
/* 211 */                                   if (c2569zz9 != null) {
/* 215 */                                       c2569zz9.f20450o0[i11] = c2569zz7;
                                            }
/* 217 */                                   c1804js.f12456g = c2569zz7;
                                        } else {
/* 131 */                                   i11 = i15;
                                        }
/* 219 */                               if (i11 == 0) {
/* 223 */                                   if (c2569zz7.f20455r == 0 && c2569zz7.f20461u == 0) {
/* 230 */                                       int i19 = c2569zz7.f20462v;
                                            }
                                        } else if (c2569zz7.f20457s == 0 && c2569zz7.f20464x == 0) {
/* 242 */                                   int i20 = c2569zz7.f20465y;
                                        }
                                    } else {
/* 247 */                               i10 = i13;
/* 249 */                               i11 = i15;
                                    }
                                } else {
/* 247 */                           i10 = i13;
/* 249 */                           i11 = i15;
                                }
/* 244 */                       C2569zz c2569zz10 = c2569zz8;
/* 252 */                       if (c2569zz10 != c2569zz7) {
/* 256 */                           c2569zz10.f20452p0[i11] = c2569zz7;
                                }
/* 262 */                       C2051oz c2051oz7 = c2051ozArr4[i16 + 1].f14929f;
/* 264 */                       if (c2051oz7 != null) {
/* 266 */                           c2569zz5 = c2051oz7.f14927d;
/* 272 */                           C2051oz c2051oz8 = c2569zz5.f20412R[i16].f14929f;
/* 274 */                           if (c2051oz8 == null || c2051oz8.f14927d != c2569zz7) {
/* 280 */                               c2569zz5 = null;
                                    }
                                } else {
/* 280 */                           c2569zz5 = null;
                                }
/* 282 */                       if (c2569zz5 == null) {
/* 285 */                           c2569zz5 = c2569zz7;
/* 286 */                           z5 = true;
                                }
/* 288 */                       c2569zz8 = c2569zz7;
/* 290 */                       i15 = i11;
/* 292 */                       i14 = 8;
/* 294 */                       c2569zz7 = c2569zz5;
/* 295 */                       i13 = i10;
                            }
/* 299 */                   i4 = i13;
/* 301 */                   int i21 = i15;
/* 303 */                   C2569zz c2569zz11 = c1804js.f12451b;
/* 305 */                   if (c2569zz11 != null) {
/* 311 */                       c2569zz11.f20412R[i16].m7247e();
                            }
/* 314 */                   C2569zz c2569zz12 = c1804js.f12453d;
/* 316 */                   if (c2569zz12 != null) {
/* 324 */                       c2569zz12.f20412R[i16 + 1].m7247e();
                            }
/* 327 */                   c1804js.f12452c = c2569zz7;
/* 329 */                   if (i21 == 0 && c1804js.f12462m) {
/* 335 */                       c1804js.f12454e = c2569zz7;
                            } else {
/* 338 */                       c1804js.f12454e = c2569zz6;
                            }
/* 351 */                   c1804js.f12465p = c1804js.f12464o && c1804js.f12463n;
                        }
/* 358 */               c1804js.f12466q = true;
/* 360 */               if (arrayList == 0 || arrayList.contains(c2569zz6)) {
/* 377 */                   C2569zz c2569zz13 = c1804js.f12452c;
/* 379 */                   C2569zz c2569zz14 = c1804js.f12451b;
/* 381 */                   C2569zz c2569zz15 = c1804js.f12453d;
/* 383 */                   C2569zz c2569zz16 = c1804js.f12454e;
/* 385 */                   float f8 = c1804js.f12460k;
/* 387 */                   EnumC2516yz[] enumC2516yzArr = a00Var2.f20415U;
/* 389 */                   C2051oz[] c2051ozArr5 = c2051ozArr3;
/* 391 */                   C2051oz[] c2051ozArr6 = a00Var2.f20412R;
/* 403 */                   boolean z6 = enumC2516yzArr[i] == EnumC2516yz.f19866b;
/* 404 */                   if (i == 0) {
/* 406 */                       int i22 = c2569zz16.f20444l0;
/* 416 */                       boolean z7 = i22 == 0;
/* 425 */                       z2 = i22 == 1;
/* 432 */                       z3 = i22 == 2;
/* 436 */                       z = z7;
                            } else {
/* 446 */                       int i23 = c2569zz16.f20446m0;
/* 454 */                       z = i23 == 0;
/* 463 */                       z2 = i23 == 1;
/* 470 */                       z3 = i23 == 2;
                            }
/* 438 */                   boolean z8 = z2;
/* 440 */                   boolean z9 = false;
/* 475 */                   while (!z9) {
/* 477 */                       C2051oz[] c2051ozArr7 = c2569zz6.f20412R;
/* 481 */                       C2051oz c2051oz9 = c2051ozArr7[i3];
/* 488 */                       int i24 = z3 ? 1 : 4;
/* 490 */                       int iM7247e = c2051oz9.m7247e();
/* 494 */                       boolean z10 = z3;
/* 511 */                       boolean z11 = c2569zz6.f20415U[i] == enumC2516yz && c2569zz6.f20459t[i] == 0;
/* 513 */                       C2051oz c2051oz10 = c2051oz9.f14929f;
/* 515 */                       if (c2051oz10 != null && c2569zz6 != c2569zz6) {
/* 523 */                           iM7247e = c2051oz10.m7247e() + iM7247e;
                                }
/* 525 */                       int i25 = iM7247e;
/* 527 */                       if (z10 && c2569zz6 != c2569zz6 && c2569zz6 != c2569zz14) {
/* 533 */                           i24 = 8;
                                }
/* 535 */                       C2569zz c2569zz17 = c2569zz6;
/* 537 */                       C2051oz c2051oz11 = c2051oz9.f14929f;
/* 539 */                       if (c2051oz11 != null) {
/* 541 */                           qf2 qf2Var10 = c2051oz9.f14932i;
/* 543 */                           qf2 qf2Var11 = c2051oz11.f14932i;
/* 545 */                           if (c2569zz6 == c2569zz14) {
/* 550 */                               t71Var.m8711f(qf2Var10, qf2Var11, i25, 6);
                                    } else {
/* 558 */                               t71Var.m8711f(qf2Var10, qf2Var11, i25, 8);
                                    }
/* 561 */                           if (z11 && !z10) {
/* 565 */                               i24 = 5;
                                    }
/* 587 */                           t71Var.m8710e(c2051oz9.f14932i, c2051oz9.f14929f.f14932i, i25, (c2569zz6 == c2569zz14 && z10 && c2569zz6.f20414T[i]) ? 5 : i24);
                                } else {
/* 591 */                           i12 = i12;
                                }
/* 593 */                       if (z6) {
/* 599 */                           if (c2569zz6.f20438i0 == 8 || c2569zz6.f20415U[i] != enumC2516yz) {
/* 623 */                               i9 = 0;
                                    } else {
/* 617 */                               i9 = 0;
/* 619 */                               t71Var.m8711f(c2051ozArr7[i3 + 1].f14932i, c2051ozArr7[i3].f14932i, 0, 5);
                                    }
/* 634 */                           t71Var.m8711f(c2051ozArr7[i3].f14932i, c2051ozArr6[i3].f14932i, i9, 8);
                                }
/* 641 */                       C2051oz c2051oz12 = c2051ozArr7[i3 + 1].f14929f;
/* 643 */                       if (c2051oz12 != null) {
/* 645 */                           c2569zz4 = c2051oz12.f14927d;
/* 651 */                           C2051oz c2051oz13 = c2569zz4.f20412R[i3].f14929f;
/* 653 */                           if (c2051oz13 == null || c2051oz13.f14927d != c2569zz6) {
/* 659 */                               c2569zz4 = null;
                                    }
                                } else {
/* 659 */                           c2569zz4 = null;
                                }
/* 661 */                       if (c2569zz4 != null) {
/* 663 */                           c2569zz6 = c2569zz4;
                                } else {
/* 665 */                           z9 = true;
                                }
/* 669 */                       c2569zz6 = c2569zz17;
/* 671 */                       z3 = z10;
/* 673 */                       i12 = i12;
                            }
/* 677 */                   boolean z12 = z3;
/* 679 */                   i5 = i12;
/* 681 */                   if (c2569zz15 != null) {
/* 685 */                       int i26 = i3 + 1;
/* 691 */                       if (c2569zz13.f20412R[i26].f14929f != null) {
/* 695 */                           C2051oz c2051oz14 = c2569zz15.f20412R[i26];
/* 701 */                           if (c2569zz15.f20415U[i] == enumC2516yz && c2569zz15.f20459t[i] == 0 && !z12) {
/* 711 */                               C2051oz c2051oz15 = c2051oz14.f14929f;
/* 715 */                               if (c2051oz15.f14927d == a00Var2) {
/* 727 */                                   t71Var.m8710e(c2051oz14.f14932i, c2051oz15.f14932i, -c2051oz14.m7247e(), 5);
                                        } else if (z12) {
/* 734 */                                   c2051oz6 = c2051oz14.f14929f;
/* 738 */                                   if (c2051oz6.f14927d == a00Var2) {
/* 750 */                                       t71Var.m8710e(c2051oz14.f14932i, c2051oz6.f14932i, -c2051oz14.m7247e(), 4);
                                            }
                                        }
                                    } else if (z12) {
/* 734 */                               c2051oz6 = c2051oz14.f14929f;
/* 738 */                               if (c2051oz6.f14927d == a00Var2) {
/* 750 */                                   t71Var.m8710e(c2051oz14.f14932i, c2051oz6.f14932i, -c2051oz14.m7247e(), 4);
                                        }
                                    }
/* 769 */                           t71Var.m8712g(c2051oz14.f14932i, c2569zz13.f20412R[i26].f14929f.f14932i, -c2051oz14.m7247e(), 6);
                                }
                            }
/* 774 */                   if (z6 != 0) {
/* 776 */                       int i27 = i3 + 1;
/* 780 */                       qf2 qf2Var12 = c2051ozArr6[i27].f14932i;
/* 784 */                       C2051oz c2051oz16 = c2569zz13.f20412R[i27];
/* 794 */                       t71Var.m8711f(qf2Var12, c2051oz16.f14932i, c2051oz16.m7247e(), 8);
                            }
/* 797 */                   ArrayList arrayList3 = c1804js.f12457h;
/* 799 */                   if (arrayList3 != null && (size = arrayList3.size()) > 1) {
/* 820 */                       float f9 = (!c1804js.f12463n || c1804js.f12465p) ? f8 : c1804js.f12459j;
/* 822 */                       C2569zz c2569zz18 = null;
/* 824 */                       float f10 = 0.0f;
/* 826 */                       int i28 = 0;
/* 827 */                       while (i28 < size) {
/* 835 */                           C2569zz c2569zz19 = (C2569zz) arrayList3.get(i28);
/* 837 */                           float[] fArr = c2569zz19.f20448n0;
/* 839 */                           C2051oz[] c2051ozArr8 = c2569zz19.f20412R;
/* 841 */                           float f11 = fArr[i];
/* 847 */                           if (f11 >= f6) {
/* 876 */                               arrayList2 = arrayList3;
/* 881 */                               if (f11 == f6) {
/* 898 */                                   t71Var.m8710e(c2051ozArr8[i3 + 1].f14932i, c2051ozArr8[i3].f14932i, 0, 8);
/* 901 */                                   size = size;
/* 903 */                                   f2 = f6;
/* 905 */                                   f3 = f9;
                                        } else {
/* 909 */                                   i28 = i28;
/* 912 */                                   if (c2569zz18 != null) {
/* 914 */                                       C2051oz[] c2051ozArr9 = c2569zz18.f20412R;
/* 918 */                                       qf2Var6 = c2051ozArr9[i3].f14932i;
/* 920 */                                       int i29 = i3 + 1;
/* 924 */                                       qf2Var7 = c2051ozArr9[i29].f14932i;
/* 928 */                                       qf2Var8 = c2051ozArr8[i3].f14932i;
/* 932 */                                       qf2Var9 = c2051ozArr8[i29].f14932i;
/* 936 */                                       c1789jdM8717l = t71Var.m8717l();
/* 942 */                                       f4 = f6;
/* 944 */                                       c1789jdM8717l.f12223b = f4;
/* 948 */                                       f2 = f4;
/* 950 */                                       if (f9 != f4 || f10 == f11) {
/* 956 */                                           f3 = f9;
/* 958 */                                           f = f11;
/* 1037 */                                          c1789jdM8717l.f12225d.m3722g(qf2Var6, 1.0f);
/* 1042 */                                          c1789jdM8717l.f12225d.m3722g(qf2Var7, -1.0f);
/* 1047 */                                          c1789jdM8717l.f12225d.m3722g(qf2Var9, 1.0f);
/* 1052 */                                          c1789jdM8717l.f12225d.m3722g(qf2Var8, -1.0f);
                                                } else {
/* 967 */                                           C0913fd c0913fd = c1789jdM8717l.f12225d;
/* 969 */                                           if (f10 == f2) {
/* 971 */                                               f3 = f9;
/* 975 */                                               c0913fd.m3722g(qf2Var6, 1.0f);
/* 982 */                                               c1789jdM8717l.f12225d.m3722g(qf2Var7, -1.0f);
/* 985 */                                               f = f11;
                                                    } else {
/* 988 */                                               f3 = f9;
/* 990 */                                               f = f11;
/* 996 */                                               if (f11 == f6) {
/* 998 */                                                   c0913fd.m3722g(qf2Var8, 1.0f);
/* 1003 */                                                  c1789jdM8717l.f12225d.m3722g(qf2Var9, -1.0f);
                                                        } else {
/* 1011 */                                                  float f12 = (f10 / f3) / (f / f3);
/* 1013 */                                                  c0913fd.m3722g(qf2Var6, 1.0f);
/* 1020 */                                                  c1789jdM8717l.f12225d.m3722g(qf2Var7, -1.0f);
/* 1025 */                                                  c1789jdM8717l.f12225d.m3722g(qf2Var9, f12);
/* 1031 */                                                  c1789jdM8717l.f12225d.m3722g(qf2Var8, -f12);
                                                        }
                                                    }
                                                }
/* 1055 */                                      t71Var.m8708c(c1789jdM8717l);
                                            } else {
/* 1063 */                                      f = f11;
/* 1065 */                                      f2 = f6;
/* 1067 */                                      f3 = f9;
                                            }
/* 1069 */                                  c2569zz18 = c2569zz19;
/* 1071 */                                  f10 = f;
                                        }
                                    } else {
/* 851 */                               if (c1804js.f12465p) {
/* 863 */                                   arrayList2 = arrayList3;
/* 867 */                                   t71Var.m8710e(c2051ozArr8[i3 + 1].f14932i, c2051ozArr8[i3].f14932i, 0, 4);
                                        } else {
/* 874 */                                   f11 = 1.0f;
/* 876 */                                   arrayList2 = arrayList3;
/* 881 */                                   if (f11 == f6) {
/* 898 */                                       t71Var.m8710e(c2051ozArr8[i3 + 1].f14932i, c2051ozArr8[i3].f14932i, 0, 8);
                                            } else {
/* 909 */                                       i28 = i28;
/* 912 */                                       if (c2569zz18 != null) {
/* 914 */                                           C2051oz[] c2051ozArr10 = c2569zz18.f20412R;
/* 918 */                                           qf2Var6 = c2051ozArr10[i3].f14932i;
/* 920 */                                           int i210 = i3 + 1;
/* 924 */                                           qf2Var7 = c2051ozArr10[i210].f14932i;
/* 928 */                                           qf2Var8 = c2051ozArr8[i3].f14932i;
/* 932 */                                           qf2Var9 = c2051ozArr8[i210].f14932i;
/* 936 */                                           c1789jdM8717l = t71Var.m8717l();
/* 942 */                                           f4 = f6;
/* 944 */                                           c1789jdM8717l.f12223b = f4;
/* 948 */                                           f2 = f4;
/* 950 */                                           if (f9 != f4) {
/* 956 */                                               f3 = f9;
/* 958 */                                               f = f11;
/* 1037 */                                              c1789jdM8717l.f12225d.m3722g(qf2Var6, 1.0f);
/* 1042 */                                              c1789jdM8717l.f12225d.m3722g(qf2Var7, -1.0f);
/* 1047 */                                              c1789jdM8717l.f12225d.m3722g(qf2Var9, 1.0f);
/* 1052 */                                              c1789jdM8717l.f12225d.m3722g(qf2Var8, -1.0f);
                                                    } else {
/* 956 */                                               f3 = f9;
/* 958 */                                               f = f11;
/* 1037 */                                              c1789jdM8717l.f12225d.m3722g(qf2Var6, 1.0f);
/* 1042 */                                              c1789jdM8717l.f12225d.m3722g(qf2Var7, -1.0f);
/* 1047 */                                              c1789jdM8717l.f12225d.m3722g(qf2Var9, 1.0f);
/* 1052 */                                              c1789jdM8717l.f12225d.m3722g(qf2Var8, -1.0f);
                                                    }
/* 1055 */                                          t71Var.m8708c(c1789jdM8717l);
                                                } else {
/* 1063 */                                          f = f11;
/* 1065 */                                          f2 = f6;
/* 1067 */                                          f3 = f9;
                                                }
/* 1069 */                                      c2569zz18 = c2569zz19;
/* 1071 */                                      f10 = f;
                                            }
                                        }
/* 901 */                               size = size;
/* 903 */                               f2 = f6;
/* 905 */                               f3 = f9;
                                    }
/* 1073 */                          i28++;
/* 1075 */                          f9 = f3;
/* 1077 */                          arrayList3 = arrayList2;
/* 1079 */                          size = size;
/* 1081 */                          f6 = f2;
                                }
                            }
/* 1089 */                  if (c2569zz14 == null || !(c2569zz14 == c2569zz15 || z12)) {
/* 1096 */                      c2569zz = c2569zz15;
/* 1188 */                      if (z && c2569zz14 != null) {
/* 1192 */                          int i30 = c1804js.f12459j;
/* 1203 */                          boolean z13 = i30 > 0 && c1804js.f12458i == i30;
/* 1205 */                          C2569zz c2569zz20 = c2569zz14;
/* 1206 */                          C2569zz c2569zz21 = c2569zz20;
                                    while (true) {
/* 1207 */                              C2051oz[] c2051ozArr11 = c2569zz21.f20412R;
/* 1209 */                              if (c2569zz20 == null) {
                                            break;
                                        }
/* 1211 */                              C2051oz[] c2051ozArr12 = c2569zz20.f20412R;
/* 1215 */                              C2569zz c2569zz22 = c2569zz20.f20452p0[i];
                                        while (true) {
/* 1217 */                                  if (c2569zz22 == null) {
/* 1230 */                                      i6 = 8;
                                                break;
                                            }
/* 1221 */                                  i6 = 8;
/* 1223 */                                  if (c2569zz22.f20438i0 != 8) {
                                                break;
                                            } else {
/* 1227 */                                      c2569zz22 = c2569zz22.f20452p0[i];
                                            }
                                        }
/* 1232 */                              if (c2569zz22 != null || c2569zz20 == c2569zz) {
/* 1248 */                                  C2051oz c2051oz17 = c2051ozArr12[i3];
/* 1251 */                                  qf2 qf2Var13 = c2051oz17.f14932i;
/* 1253 */                                  C2051oz c2051oz18 = c2051oz17.f14929f;
/* 1260 */                                  qf2 qf2Var14 = c2051oz18 != null ? c2051oz18.f14932i : null;
/* 1262 */                                  if (c2569zz21 != c2569zz20) {
/* 1268 */                                      qf2Var14 = c2051ozArr11[i3 + 1].f14932i;
                                            } else if (c2569zz20 == c2569zz14) {
/* 1275 */                                      C2051oz c2051oz19 = c2051ozArr5[i3].f14929f;
/* 1282 */                                      qf2Var14 = c2051oz19 != null ? c2051oz19.f14932i : null;
                                            }
/* 1284 */                                  int iM7247e2 = c2051oz17.m7247e();
/* 1288 */                                  int i31 = i3 + 1;
/* 1292 */                                  int iM7247e3 = c2051ozArr12[i31].m7247e();
/* 1296 */                                  if (c2569zz22 != null) {
/* 1300 */                                      c2051oz2 = c2569zz22.f20412R[i3];
/* 1302 */                                      c2051ozArr = c2051ozArr11;
/* 1304 */                                      qf2Var3 = c2051oz2.f14932i;
                                            } else {
/* 1307 */                                      c2051ozArr = c2051ozArr11;
/* 1313 */                                      c2051oz2 = c2569zz13.f20412R[i31].f14929f;
/* 1320 */                                      qf2Var3 = c2051oz2 != null ? c2051oz2.f14932i : null;
                                            }
/* 1324 */                                  qf2 qf2Var15 = c2051ozArr12[i31].f14932i;
/* 1326 */                                  if (c2051oz2 != null) {
/* 1332 */                                      iM7247e3 += c2051oz2.m7247e();
                                            }
/* 1339 */                                  int iM7247e4 = c2051ozArr[i31].m7247e() + iM7247e2;
/* 1340 */                                  if (qf2Var13 == null || qf2Var14 == null || qf2Var3 == null || qf2Var15 == null) {
/* 1405 */                                      i7 = 8;
                                            } else {
/* 1348 */                                      if (c2569zz20 == c2569zz14) {
/* 1354 */                                          iM7247e4 = c2569zz14.f20412R[i3].m7247e();
                                                }
/* 1358 */                                      int i32 = iM7247e4;
/* 1359 */                                      if (c2569zz20 == c2569zz) {
/* 1365 */                                          iM7247e3 = c2569zz.f20412R[i31].m7247e();
                                                }
/* 1388 */                                      i7 = 8;
/* 1393 */                                      t71Var.m8707b(qf2Var13, qf2Var14, i32, 0.5f, qf2Var3, qf2Var15, iM7247e3, z13 ? 8 : 5);
                                            }
                                        } else {
/* 1245 */                                  i7 = i6;
                                        }
/* 1409 */                              if (c2569zz20.f20438i0 != i7) {
/* 1411 */                                  c2569zz21 = c2569zz20;
                                        }
/* 1413 */                              c2569zz20 = c2569zz22;
/* 1415 */                              c2569zz21 = c2569zz21;
/* 1417 */                              c2051ozArr5 = c2051ozArr5;
                                    }
                                } else {
/* 1423 */                          int i33 = 8;
/* 1425 */                          if (z8 && c2569zz14 != null) {
/* 1429 */                              int i34 = c1804js.f12459j;
/* 1440 */                              boolean z14 = i34 > 0 && c1804js.f12458i == i34;
/* 1442 */                              C2569zz c2569zz23 = c2569zz14;
/* 1443 */                              C2569zz c2569zz24 = c2569zz23;
                                        while (true) {
/* 1444 */                                  C2051oz[] c2051ozArr13 = c2569zz23.f20412R;
/* 1446 */                                  if (c2569zz24 == null) {
                                                break;
                                            }
/* 1448 */                                  C2051oz[] c2051ozArr14 = c2569zz24.f20412R;
/* 1452 */                                  C2569zz c2569zz25 = c2569zz24.f20452p0[i];
/* 1454 */                                  while (c2569zz25 != null && c2569zz25.f20438i0 == i33) {
/* 1462 */                                      c2569zz25 = c2569zz25.f20452p0[i];
                                            }
/* 1465 */                                  if (c2569zz24 == c2569zz14 || c2569zz24 == c2569zz || c2569zz25 == null) {
/* 1592 */                                      c2569zz2 = c2569zz23;
                                            } else {
/* 1471 */                                      if (c2569zz25 == c2569zz) {
/* 1473 */                                          c2569zz25 = null;
                                                }
/* 1475 */                                      C2051oz c2051oz20 = c2051ozArr14[i3];
/* 1478 */                                      qf2 qf2Var16 = c2051oz20.f14932i;
/* 1480 */                                      int i35 = i3 + 1;
/* 1484 */                                      qf2 qf2Var17 = c2051ozArr13[i35].f14932i;
/* 1486 */                                      int iM7247e5 = c2051oz20.m7247e();
/* 1492 */                                      int iM7247e6 = c2051ozArr14[i35].m7247e();
/* 1496 */                                      if (c2569zz25 != null) {
/* 1500 */                                          c2051oz = c2569zz25.f20412R[i3];
/* 1502 */                                          qf2Var = c2051oz.f14932i;
/* 1504 */                                          c2569zz2 = c2569zz23;
/* 1506 */                                          C2051oz c2051oz21 = c2051oz.f14929f;
/* 1513 */                                          qf2Var2 = c2051oz21 != null ? c2051oz21.f14932i : null;
                                                } else {
/* 1516 */                                          c2569zz2 = c2569zz23;
/* 1520 */                                          C2051oz c2051oz22 = c2569zz.f20412R[i3];
/* 1527 */                                          qf2Var = c2051oz22 != null ? c2051oz22.f14932i : null;
/* 1531 */                                          qf2 qf2Var18 = c2051ozArr14[i35].f14932i;
/* 1535 */                                          c2051oz = c2051oz22;
/* 1536 */                                          qf2Var2 = qf2Var18;
                                                }
/* 1538 */                                      if (c2051oz != null) {
/* 1544 */                                          iM7247e6 += c2051oz.m7247e();
                                                }
/* 1551 */                                      int iM7247e7 = c2051ozArr13[i35].m7247e() + iM7247e5;
/* 1552 */                                      C2569zz c2569zz26 = c2569zz25;
/* 1555 */                                      int i36 = iM7247e6;
/* 1561 */                                      int i37 = z14 ? 8 : 4;
/* 1562 */                                      if (qf2Var16 == null || qf2Var17 == null || qf2Var == null || qf2Var2 == null) {
/* 1587 */                                          c2569zz3 = c2569zz26;
                                                } else {
/* 1573 */                                          qf2 qf2Var19 = qf2Var;
/* 1574 */                                          c2569zz3 = c2569zz26;
/* 1581 */                                          t71Var.m8707b(qf2Var16, qf2Var17, iM7247e7, 0.5f, qf2Var19, qf2Var2, i36, i37);
                                                }
/* 1590 */                                      c2569zz25 = c2569zz3;
                                            }
/* 1600 */                                  i33 = 8;
/* 1602 */                                  if (c2569zz24.f20438i0 != 8) {
/* 1604 */                                      c2569zz2 = c2569zz24;
                                            }
/* 1606 */                                  c2569zz24 = c2569zz25;
/* 1607 */                                  c2569zz23 = c2569zz2;
                                        }
/* 1611 */                              t71Var2 = t71Var;
/* 1615 */                              C2051oz c2051oz23 = c2569zz14.f20412R[i3];
/* 1619 */                              C2051oz c2051oz24 = c2051ozArr5[i3].f14929f;
/* 1623 */                              int i38 = i3 + 1;
/* 1625 */                              C2051oz c2051oz25 = c2569zz.f20412R[i38];
/* 1631 */                              C2051oz c2051oz26 = c2569zz13.f20412R[i38].f14929f;
/* 1634 */                              if (c2051oz24 != null) {
/* 1636 */                                  if (c2569zz14 != c2569zz) {
/* 1646 */                                      t71Var2.m8710e(c2051oz23.f14932i, c2051oz24.f14932i, c2051oz23.m7247e(), 5);
                                            } else if (c2051oz26 != null) {
/* 1671 */                                      t71Var2.m8707b(c2051oz23.f14932i, c2051oz24.f14932i, c2051oz23.m7247e(), 0.5f, c2051oz25.f14932i, c2051oz26.f14932i, c2051oz25.m7247e(), 5);
                                            }
                                        }
/* 1674 */                              if (c2051oz26 != null && c2569zz14 != c2569zz) {
/* 1687 */                                  t71Var2.m8710e(c2051oz25.f14932i, c2051oz26.f14932i, -c2051oz25.m7247e(), 5);
                                        }
                                    }
/* 1690 */                          if ((z || z8) && c2569zz14 != null && c2569zz14 != c2569zz) {
/* 1698 */                              c2051ozArr2 = c2569zz14.f20412R;
/* 1700 */                              C2051oz c2051oz27 = c2051ozArr2[i3];
/* 1702 */                              if (c2569zz == null) {
/* 1704 */                                  c2569zz = c2569zz14;
                                        }
/* 1705 */                              C2051oz[] c2051ozArr15 = c2569zz.f20412R;
/* 1707 */                              i8 = i3 + 1;
/* 1709 */                              c2051oz3 = c2051ozArr15[i8];
/* 1711 */                              c2051oz4 = c2051oz27.f14929f;
/* 1713 */                              if (c2051oz4 != null) {
/* 1715 */                                  qf2Var4 = c2051oz4.f14932i;
                                        } else {
/* 1718 */                                  qf2Var4 = null;
                                        }
/* 1720 */                              c2051oz5 = c2051oz3.f14929f;
/* 1722 */                              if (c2051oz5 != null) {
/* 1724 */                                  qf2Var5 = c2051oz5.f14932i;
                                        } else {
/* 1727 */                                  qf2Var5 = null;
                                        }
/* 1729 */                              if (c2569zz13 != c2569zz) {
/* 1735 */                                  C2051oz c2051oz28 = c2569zz13.f20412R[i8].f14929f;
/* 1739 */                                  qf2Var5 = c2051oz28 != null ? c2051oz28.f14932i : null;
                                        }
/* 1745 */                              if (c2569zz14 == c2569zz) {
/* 1747 */                                  c2051oz3 = c2051ozArr2[i8];
                                        }
/* 1749 */                              if (qf2Var4 == null && qf2Var5 != null) {
/* 1776 */                                  t71Var2.m8707b(c2051oz27.f14932i, qf2Var4, c2051oz27.m7247e(), 0.5f, qf2Var5, c2051oz3.f14932i, c2051ozArr15[i8].m7247e(), 5);
                                        }
                                    }
                                }
                            } else {
/* 1102 */                      C2051oz c2051oz29 = c2051ozArr5[i3];
/* 1106 */                      int i39 = i3 + 1;
/* 1108 */                      C2051oz c2051oz30 = c2569zz13.f20412R[i39];
/* 1110 */                      C2051oz c2051oz31 = c2051oz29.f14929f;
/* 1117 */                      qf2 qf2Var20 = c2051oz31 != null ? c2051oz31.f14932i : null;
/* 1119 */                      C2051oz c2051oz32 = c2051oz30.f14929f;
/* 1126 */                      qf2 qf2Var21 = c2051oz32 != null ? c2051oz32.f14932i : null;
/* 1130 */                      C2051oz c2051oz33 = c2569zz14.f20412R[i3];
/* 1132 */                      if (c2569zz15 != null) {
/* 1136 */                          c2051oz30 = c2569zz15.f20412R[i39];
                                }
/* 1138 */                      if (qf2Var20 == null || qf2Var21 == null) {
/* 1179 */                          c2569zz = c2569zz15;
                                } else {
/* 1148 */                          float f13 = i == 0 ? c2569zz16.f20432f0 : c2569zz16.f20434g0;
/* 1151 */                          int iM7247e8 = c2051oz33.m7247e();
/* 1155 */                          int iM7247e9 = c2051oz30.m7247e();
/* 1159 */                          qf2 qf2Var22 = c2051oz33.f14932i;
/* 1161 */                          qf2 qf2Var23 = c2051oz30.f14932i;
/* 1166 */                          qf2 qf2Var24 = qf2Var20;
/* 1167 */                          c2569zz = c2569zz15;
/* 1175 */                          t71Var.m8707b(qf2Var22, qf2Var24, iM7247e8, f13, qf2Var21, qf2Var23, iM7247e9, 7);
                                }
                            }
/* 1184 */                  t71Var2 = t71Var;
/* 1690 */                  if (z) {
/* 1698 */                      c2051ozArr2 = c2569zz14.f20412R;
/* 1700 */                      C2051oz c2051oz210 = c2051ozArr2[i3];
/* 1702 */                      if (c2569zz == null) {
/* 1704 */                          c2569zz = c2569zz14;
                                }
/* 1705 */                      C2051oz[] c2051ozArr16 = c2569zz.f20412R;
/* 1707 */                      i8 = i3 + 1;
/* 1709 */                      c2051oz3 = c2051ozArr16[i8];
/* 1711 */                      c2051oz4 = c2051oz210.f14929f;
/* 1713 */                      if (c2051oz4 != null) {
/* 1715 */                          qf2Var4 = c2051oz4.f14932i;
                                } else {
/* 1718 */                          qf2Var4 = null;
                                }
/* 1720 */                      c2051oz5 = c2051oz3.f14929f;
/* 1722 */                      if (c2051oz5 != null) {
/* 1724 */                          qf2Var5 = c2051oz5.f14932i;
                                } else {
/* 1727 */                          qf2Var5 = null;
                                }
/* 1729 */                      if (c2569zz13 != c2569zz) {
/* 1735 */                          C2051oz c2051oz211 = c2569zz13.f20412R[i8].f14929f;
/* 1739 */                          qf2Var5 = c2051oz211 != null ? c2051oz211.f14932i : null;
                                }
/* 1745 */                      if (c2569zz14 == c2569zz) {
/* 1747 */                          c2051oz3 = c2051ozArr2[i8];
                                }
/* 1749 */                      if (qf2Var4 == null) {
                                }
                            } else {
/* 1698 */                      c2051ozArr2 = c2569zz14.f20412R;
/* 1700 */                      C2051oz c2051oz212 = c2051ozArr2[i3];
/* 1702 */                      if (c2569zz == null) {
/* 1704 */                          c2569zz = c2569zz14;
                                }
/* 1705 */                      C2051oz[] c2051ozArr17 = c2569zz.f20412R;
/* 1707 */                      i8 = i3 + 1;
/* 1709 */                      c2051oz3 = c2051ozArr17[i8];
/* 1711 */                      c2051oz4 = c2051oz212.f14929f;
/* 1713 */                      if (c2051oz4 != null) {
/* 1715 */                          qf2Var4 = c2051oz4.f14932i;
                                } else {
/* 1718 */                          qf2Var4 = null;
                                }
/* 1720 */                      c2051oz5 = c2051oz3.f14929f;
/* 1722 */                      if (c2051oz5 != null) {
/* 1724 */                          qf2Var5 = c2051oz5.f14932i;
                                } else {
/* 1727 */                          qf2Var5 = null;
                                }
/* 1729 */                      if (c2569zz13 != c2569zz) {
/* 1735 */                          C2051oz c2051oz213 = c2569zz13.f20412R[i8].f14929f;
/* 1739 */                          qf2Var5 = c2051oz213 != null ? c2051oz213.f14932i : null;
                                }
/* 1745 */                      if (c2569zz14 == c2569zz) {
/* 1747 */                          c2051oz3 = c2051ozArr2[i8];
                                }
/* 1749 */                      if (qf2Var4 == null) {
                                }
                            }
                        } else {
/* 369 */                   i5 = i12;
                        }
/* 1779 */              i13 = i4 + 1;
/* 1781 */              a00Var2 = a00Var;
/* 1787 */              i12 = i5;
                    }
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX INFO: renamed from: d */
                public static final Object m1220d(xx1 xx1Var, C1908lz c1908lz, d10 d10Var) {
                    wx1 wx1Var;
/* 3 */             if (d10Var instanceof wx1) {
/* 6 */                 wx1Var = (wx1) d10Var;
/* 8 */                 int i = wx1Var.f18853c;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    wx1Var.f18853c = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    wx1Var = new wx1(d10Var);
                        }
                    } else {
/* 22 */                wx1Var = new wx1(d10Var);
                    }
/* 25 */            Object obj = wx1Var.f18852b;
/* 27 */            z10 z10Var = z10.f19902a;
/* 29 */            int i2 = wx1Var.f18853c;
                    try {
/* 33 */                if (i2 == 0) {
/* 51 */                    pg3.m7417A(obj);
/* 64 */                    if (wx1Var.getContext().get(xt0.f19368w) != xx1Var) {
/* 112 */                       f42.m3656l("awaitClose() can only be invoked from the producer context");
/* 31 */                        return null;
                            }
/* 66 */                    wx1Var.f18851a = c1908lz;
/* 68 */                    wx1Var.f18853c = 1;
/* 76 */                    C0890er c0890er = new C0890er(1, mz0.m6834b(wx1Var));
/* 79 */                    c0890er.m3571u();
/* 90 */                    xx1Var.f19390f.m10396u(new wu0(c0890er, 2));
/* 97 */                    if (c0890er.m3569s() == z10Var) {
/* 99 */                        return z10Var;
                            }
                        } else {
/* 35 */                    if (i2 != 1) {
/* 47 */                        f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 31 */                        return null;
                            }
/* 37 */                    c1908lz = wx1Var.f18851a;
/* 39 */                    pg3.m7417A(obj);
                        }
/* 100 */               c1908lz.invoke();
/* 103 */               return Unit.f12910a;
                    } catch (Throwable th) {
/* 106 */               c1908lz.invoke();
/* 109 */               throw th;
                    }
                }

                /* JADX INFO: renamed from: e */
                public static void m1221e(Closeable closeable) {
/* 1 */             if (closeable != null) {
                        try {
/* 3 */                     closeable.close();
                        } catch (Exception unused) {
                        }
                    }
                }

                /* JADX INFO: renamed from: f */
                public static int m1222f(y12 y12Var, pc0 pc0Var, View view, View view2, AbstractC0133k abstractC0133k, boolean z) {
/* 5 */             if (abstractC0133k.m986G() == 0 || y12Var.m10082b() == 0 || view == null || view2 == null) {
/* 54 */                return 0;
                    }
/* 18 */            if (!z) {
/* 33 */                return Math.abs(AbstractC0133k.m974O(view) - AbstractC0133k.m974O(view2)) + 1;
                    }
/* 49 */            return Math.min(pc0Var.mo951l(), pc0Var.mo941b(view2) - pc0Var.mo944e(view));
                }

                /* JADX INFO: renamed from: g */
                public static int m1223g(y12 y12Var, pc0 pc0Var, View view, View view2, AbstractC0133k abstractC0133k, boolean z, boolean z2) {
/* 6 */             if (abstractC0133k.m986G() == 0 || y12Var.m10082b() == 0 || view == null || view2 == null) {
/* 5 */                 return 0;
                    }
/* 57 */            int iMax = z2 ? Math.max(0, (y12Var.m10082b() - Math.max(AbstractC0133k.m974O(view), AbstractC0133k.m974O(view2))) - 1) : Math.max(0, Math.min(AbstractC0133k.m974O(view), AbstractC0133k.m974O(view2)));
/* 61 */            if (z) {
/* 108 */               return Math.round((iMax * (Math.abs(pc0Var.mo941b(view2) - pc0Var.mo944e(view)) / (Math.abs(AbstractC0133k.m974O(view) - AbstractC0133k.m974O(view2)) + 1))) + (pc0Var.mo950k() - pc0Var.mo944e(view)));
                    }
/* 63 */            return iMax;
                }

                /* JADX INFO: renamed from: h */
                public static int m1224h(y12 y12Var, pc0 pc0Var, View view, View view2, AbstractC0133k abstractC0133k, boolean z) {
/* 5 */             if (abstractC0133k.m986G() == 0 || y12Var.m10082b() == 0 || view == null || view2 == null) {
/* 60 */                return 0;
                    }
/* 18 */            if (!z) {
/* 20 */                return y12Var.m10082b();
                    }
/* 58 */            return (int) (((pc0Var.mo941b(view2) - pc0Var.mo944e(view)) / (Math.abs(AbstractC0133k.m974O(view) - AbstractC0133k.m974O(view2)) + 1)) * y12Var.m10082b());
                }

                /* JADX INFO: renamed from: i */
                public static final long m1225i(InputStream inputStream, OutputStream outputStream) throws IOException {
/* 1 */             inputStream.getClass();
/* 4 */             outputStream.getClass();
/* 9 */             byte[] bArr = new byte[Segment.SIZE];
/* 11 */            int i = inputStream.read(bArr);
/* 15 */            long j = 0;
/* 17 */            while (i >= 0) {
/* 20 */                outputStream.write(bArr, 0, i);
/* 24 */                j += (long) i;
/* 25 */                i = inputStream.read(bArr);
                    }
/* 30 */            return j;
                }

                /* JADX INFO: renamed from: j */
                public static ObjectAnimator m1226j(View view, or2 or2Var, int i, int i2, float f, float f2, float f3, float f4, TimeInterpolator timeInterpolator, Visibility visibility) {
                    float f5;
                    float f6;
/* 1 */             float translationX = view.getTranslationX();
/* 5 */             float translationY = view.getTranslationY();
/* 17 */            int[] iArr = (int[]) or2Var.f14873b.getTag(R$id.transition_position);
/* 21 */            if (iArr != null) {
/* 27 */                f5 = (iArr[0] - i) + translationX;
/* 32 */                f6 = (iArr[1] - i2) + translationY;
                    } else {
/* 34 */                f5 = f;
/* 35 */                f6 = f2;
                    }
/* 42 */            int iRound = Math.round(f5 - translationX) + i;
/* 49 */            int iRound2 = Math.round(f6 - translationY) + i2;
/* 50 */            view.setTranslationX(f5);
/* 53 */            view.setTranslationY(f6);
/* 58 */            if (f5 == f3 && f6 == f4) {
/* 64 */                return null;
                    }
/* 95 */            ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, f5, f3), PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, f6, f4));
/* 112 */           pr2 pr2Var = new pr2(view, or2Var.f14873b, iRound, iRound2, translationX, translationY);
/* 117 */           visibility.m1090a(pr2Var);
/* 120 */           objectAnimatorOfPropertyValuesHolder.addListener(pr2Var);
/* 123 */           objectAnimatorOfPropertyValuesHolder.addPauseListener(pr2Var);
/* 128 */           objectAnimatorOfPropertyValuesHolder.setInterpolator(timeInterpolator);
/* 131 */           return objectAnimatorOfPropertyValuesHolder;
                }

                /* JADX INFO: renamed from: k */
                public static boolean m1227k() {
                    ApplicationInfo applicationInfo;
                    Bundle bundle;
                    try {
/* 4 */                 vi0.m9271c();
/* 7 */                 vi0 vi0VarM9271c = vi0.m9271c();
/* 11 */                vi0VarM9271c.m9274a();
/* 14 */                Context context = vi0VarM9271c.f18192a;
/* 18 */                SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
/* 28 */                if (sharedPreferences.contains("export_to_big_query")) {
/* 30 */                    return sharedPreferences.getBoolean("export_to_big_query", false);
                        }
/* 35 */                PackageManager packageManager = context.getPackageManager();
/* 39 */                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
/* 65 */                    return applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
                        }
/* 3 */                 return false;
                    } catch (PackageManager.NameNotFoundException | IllegalStateException unused) {
                    }
                }

                /* JADX WARN: Code duplicated, block: B:17:0x0026  */
                /* JADX INFO: renamed from: l */
                public static fk0 m1228l(C2149rm c2149rm, kt0 kt0Var, int i, EnumC2464xk enumC2464xk, int i2) {
                    CoroutineContext coroutineContext = kt0Var;
/* 3 */             if ((i2 & 1) != 0) {
/* 5 */                 coroutineContext = C1846g.f12919a;
                    }
/* 10 */            if ((i2 & 2) != 0) {
/* 12 */                i = -3;
                    }
/* 15 */            if ((i2 & 4) != 0) {
/* 17 */                enumC2464xk = EnumC2464xk.f19232a;
                    }
/* 19 */            EnumC2464xk enumC2464xk2 = c2149rm.f2088c;
/* 21 */            int i3 = c2149rm.f2087b;
/* 23 */            CoroutineContext coroutineContext2 = c2149rm.f2086a;
/* 25 */            CoroutineContext coroutineContextPlus = coroutineContext.plus(coroutineContext2);
/* 31 */            if (enumC2464xk == EnumC2464xk.f19232a) {
/* 34 */                if (i3 != -3) {
/* 37 */                    if (i == -3) {
/* 39 */                        i = i3;
                            } else if (i3 != -2) {
/* 45 */                        if (i == -2) {
/* 39 */                            i = i3;
                                } else {
/* 48 */                            i += i3;
/* 49 */                            if (i < 0) {
/* 52 */                                i = AbstractC0208c9.API_PRIORITY_OTHER;
                                    }
                                }
                            }
                        }
/* 55 */                enumC2464xk = enumC2464xk2;
                    }
                    return (Intrinsics.m6216a(coroutineContextPlus, coroutineContext2) && i == i3 && enumC2464xk == enumC2464xk2) ? c2149rm : new C2149rm(c2149rm.f16178e, coroutineContextPlus, i, enumC2464xk);
                }

                /* JADX INFO: renamed from: m */
                public static float m1229m(EdgeEffect edgeEffect) {
/* 5 */             if (Build.VERSION.SDK_INT >= 31) {
/* 7 */                 return cc0.m1629b(edgeEffect);
                    }
/* 12 */            return 0.0f;
                }

                /* JADX INFO: renamed from: n */
                public static NotificationManager m1230n(Context context) {
                    try {
/* 7 */                 return (NotificationManager) context.getSystemService("notification");
                    } catch (Exception e) {
/* 15 */                xe2.m9777o("AppUtil", "Unable to get notification manager from System service", e);
/* 18 */                return null;
                    }
                }

                /* JADX INFO: renamed from: o */
                public static final void m1231o(Throwable th, CoroutineContext coroutineContext) {
                    try {
/* 7 */                 t10 t10Var = (t10) coroutineContext.get(dc0.f7101c);
/* 9 */                 if (t10Var != null) {
/* 13 */                    ((C0171b8) t10Var).m1296g(th);
                        } else {
/* 17 */                    mn0.m6704t(th, coroutineContext);
                        }
                    } catch (Throwable th2) {
/* 22 */                if (th != th2) {
/* 29 */                    RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
/* 32 */                    jf0.m5798a(runtimeException, th);
/* 35 */                    th = runtimeException;
                        }
/* 36 */                mn0.m6704t(th, coroutineContext);
                    }
                }

                /* JADX INFO: renamed from: p */
                public static boolean m1232p(String str) {
                    return str == null || str.trim().length() == 0;
                }

                /* JADX INFO: renamed from: q */
                public static boolean m1233q(Map map) {
                    return map == null || map.isEmpty();
                }

                /* JADX INFO: renamed from: r */
                public static boolean m1234r(String str) {
/* 5 */             return !m1232p(str);
                }

                /* JADX INFO: renamed from: s */
                public static boolean m1235s(Context context) {
                    try {
                        return v00.checkSelfPermission(context, "android.permission.VIBRATE") == 0;
                    } catch (Exception e) {
/* 18 */                xe2.m9775m("AppUtil", "Error checking for permission : android.permission.VIBRATE", e);
/* 3 */                 return false;
                    }
                }

                /* JADX INFO: renamed from: t */
                public static boolean m1236t(String str) {
                    try {
                        try {
/* 3 */                     new JSONObject(str);
/* 12 */                    return true;
                        } catch (Exception unused) {
/* 14 */                    return false;
                        }
                    } catch (Exception unused2) {
/* 9 */                 new JSONArray(str);
/* 12 */                return true;
                    }
                }

                /* JADX INFO: renamed from: u */
                public static String m1237u(ArrayList arrayList) {
/* 3 */             StringBuilder sb = new StringBuilder();
/* 10 */            boolean z = true;
/* 15 */            for (Object obj : arrayList) {
/* 21 */                if (z) {
/* 23 */                    z = false;
                        } else {
/* 27 */                    sb.append((CharSequence) "&");
                        }
/* 30 */                sb.append(obj);
                    }
/* 34 */            return sb.toString();
                }

                /* JADX INFO: renamed from: v */
                public static HashMap m1238v(String str) {
/* 5 */             if (m1232p(str) || !m1236t(str)) {
/* 65 */                return new HashMap();
                    }
                    try {
/* 16 */                HashMap map = new HashMap();
/* 21 */                JSONObject jSONObject = new JSONObject(str);
/* 24 */                Iterator<String> itKeys = jSONObject.keys();
/* 32 */                while (itKeys.hasNext()) {
/* 34 */                    String next = itKeys.next();
/* 44 */                    map.put(next, jSONObject.get(next));
                        }
/* 48 */                return map;
                    } catch (JSONException e) {
/* 54 */                xe2.m9777o("Utils", "Error in creating map from string json", e);
/* 59 */                return new HashMap();
                    }
                }

                /* JADX INFO: renamed from: w */
                public static HashMap m1239w(String str) {
/* 5 */             if (m1232p(str) || !m1236t(str)) {
/* 65 */                return new HashMap();
                    }
                    try {
/* 16 */                HashMap map = new HashMap();
/* 21 */                JSONObject jSONObject = new JSONObject(str);
/* 24 */                Iterator<String> itKeys = jSONObject.keys();
/* 32 */                while (itKeys.hasNext()) {
/* 34 */                    String next = itKeys.next();
/* 44 */                    map.put(next, jSONObject.getString(next));
                        }
/* 48 */                return map;
                    } catch (Exception e) {
/* 54 */                xe2.m9777o("Utils", "Error in creating map from string json", e);
/* 59 */                return new HashMap();
                    }
                }

                /* JADX WARN: Code duplicated, block: B:100:0x0176  */
                /* JADX WARN: Code duplicated, block: B:106:0x018f  */
                /* JADX WARN: Code duplicated, block: B:108:0x0198  */
                /* JADX WARN: Code duplicated, block: B:109:0x019b  */
                /* JADX WARN: Code duplicated, block: B:118:0x01b2  */
                /* JADX WARN: Code duplicated, block: B:119:0x01b4  */
                /* JADX WARN: Code duplicated, block: B:134:0x014f A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:136:0x016b A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:138:0x0088 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:140:0x01a4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:142:0x0185 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:40:0x00ae  */
                /* JADX WARN: Code duplicated, block: B:42:0x00b2  */
                /* JADX WARN: Code duplicated, block: B:45:0x00bf  */
                /* JADX WARN: Code duplicated, block: B:47:0x00cd  */
                /* JADX WARN: Code duplicated, block: B:48:0x00cf  */
                /* JADX WARN: Code duplicated, block: B:49:0x00d5 A[PHI: r6
  0x00d5: PHI (r6v21 java.lang.String) = (r6v20 java.lang.String), (r6v33 java.lang.String) binds: [B:44:0x00bd, B:48:0x00cf] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Code duplicated, block: B:51:0x00dd  */
                /* JADX WARN: Code duplicated, block: B:52:0x00df  */
                /* JADX WARN: Code duplicated, block: B:55:0x00e8  */
                /* JADX WARN: Code duplicated, block: B:57:0x00eb  */
                /* JADX WARN: Code duplicated, block: B:59:0x00ee A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:60:0x00f0  */
                /* JADX WARN: Code duplicated, block: B:63:0x00fb  */
                /* JADX WARN: Code duplicated, block: B:66:0x0105  */
                /* JADX WARN: Code duplicated, block: B:67:0x0107  */
                /* JADX WARN: Code duplicated, block: B:74:0x011b  */
                /* JADX WARN: Code duplicated, block: B:75:0x011e  */
                /* JADX WARN: Code duplicated, block: B:78:0x0128  */
                /* JADX WARN: Code duplicated, block: B:79:0x012a  */
                /* JADX WARN: Code duplicated, block: B:82:0x0133  */
                /* JADX WARN: Code duplicated, block: B:83:0x0136  */
                /* JADX WARN: Code duplicated, block: B:86:0x0140  */
                /* JADX WARN: Code duplicated, block: B:87:0x0143  */
                /* JADX WARN: Code duplicated, block: B:94:0x015e  */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX INFO: renamed from: x */
                public static void m1240x(Intent intent) {
                    int iIntValue;
                    int i;
                    String string;
                    yh1 yh1Var;
                    String string2;
                    Object[] objArr;
                    String string3;
                    String str;
                    String string4;
                    String str2;
                    String string5;
                    String str3;
                    String string6;
                    String str4;
                    String string7;
                    String str5;
                    long j;
                    long j2;
                    vi0 vi0VarM9271c;
                    cj0 cj0Var;
                    String str6;
                    String str7;
                    String[] strArrSplit;
                    String str8;
/* 7 */             if (m1212C(intent)) {
/* 15 */                m1241y("_nr", intent.getExtras());
                    }
/* 18 */            int i2 = 0;
/* 40 */            if ((intent == null || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction())) ? false : m1227k()) {
/* 48 */                wr2 wr2Var = (wr2) FirebaseMessaging.f5295k.get();
/* 52 */                if (wr2Var == null) {
/* 56 */                    AbstractC1245n0.m4876d("FirebaseMessaging", "TransportFactory is null. Skip exporting message delivery metrics to Big Query");
/* 59 */                    return;
                        }
/* 60 */                ai1 ai1Var = null;
/* 60 */                str = null;
/* 60 */                String str9 = null;
/* 61 */                if (intent != null) {
/* 65 */                    Bundle extras = intent.getExtras();
/* 69 */                    if (extras == null) {
/* 71 */                        extras = Bundle.EMPTY;
                            }
/* 75 */                    Object obj = extras.get("google.ttl");
/* 81 */                    if (obj instanceof Integer) {
/* 85 */                        iIntValue = ((Integer) obj).intValue();
                            } else {
/* 94 */                        if (obj instanceof String) {
                                    try {
/* 99 */                                iIntValue = Integer.parseInt((String) obj);
                                    } catch (NumberFormatException unused) {
/* 118 */                               AbstractC1245n0.m4889q("FirebaseMessaging", "Invalid TTL: " + obj);
/* 121 */                               i = 0;
                                    }
                                }
/* 121 */                       i = 0;
/* 125 */                       string = extras.getString("google.to");
/* 133 */                       if (TextUtils.isEmpty(string)) {
                                    try {
/* 153 */                               string = (String) Tasks.await(FirebaseInstallations.getInstance(vi0.m9271c()).getId());
                                    } catch (InterruptedException | ExecutionException e) {
/* 510 */                               ds0.m3199p(e);
/* 513 */                               return;
                                    }
                                }
/* 135 */                       String str10 = string;
/* 156 */                       vi0 vi0VarM9271c2 = vi0.m9271c();
/* 160 */                       vi0VarM9271c2.m9274a();
/* 165 */                       String packageName = vi0VarM9271c2.f18192a.getPackageName();
/* 173 */                       if (ts0.m8887z(extras)) {
/* 175 */                           yh1Var = yh1.DISPLAY_NOTIFICATION;
                                } else {
/* 179 */                           yh1Var = yh1.DATA_MESSAGE;
                                }
/* 177 */                       yh1 yh1Var2 = yh1Var;
/* 184 */                       string2 = extras.getString("google.delivered_priority");
/* 190 */                       if (string2 != null) {
/* 220 */                           if ("high".equals(string2)) {
/* 222 */                               objArr = 1;
                                    } else if ("normal".equals(string2)) {
/* 206 */                               objArr = 2;
                                    } else {
/* 233 */                               objArr = 0;
                                    }
                                } else if ("1".equals(extras.getString("google.priority_reduced"))) {
/* 206 */                           objArr = 2;
                                } else {
/* 210 */                           string2 = extras.getString("google.priority");
/* 220 */                           if ("high".equals(string2)) {
/* 222 */                               objArr = 1;
                                    } else if ("normal".equals(string2)) {
/* 206 */                               objArr = 2;
                                    } else {
/* 233 */                               objArr = 0;
                                    }
                                }
/* 234 */                       if (objArr == 2) {
/* 236 */                           i2 = 5;
                                } else if (objArr == 1) {
/* 241 */                           i2 = 10;
                                }
/* 237 */                       int i3 = i2;
/* 246 */                       string3 = extras.getString("google.message_id");
/* 250 */                       if (string3 == null) {
/* 254 */                           string3 = extras.getString("message_id");
                                }
/* 260 */                       if (string3 != null) {
/* 262 */                           str = string3;
                                } else {
/* 264 */                           str = HttpUrl.FRAGMENT_ENCODE_SET;
                                }
/* 267 */                       string4 = extras.getString("from");
/* 271 */                       if (string4 != null && string4.startsWith("/topics/")) {
/* 281 */                           str9 = string4;
                                }
/* 282 */                       if (str9 != null) {
/* 284 */                           str2 = str9;
                                } else {
/* 287 */                           str2 = HttpUrl.FRAGMENT_ENCODE_SET;
                                }
/* 291 */                       string5 = extras.getString("collapse_key");
/* 295 */                       if (string5 != null) {
/* 297 */                           str3 = string5;
                                } else {
/* 299 */                           str3 = HttpUrl.FRAGMENT_ENCODE_SET;
                                }
/* 302 */                       string6 = extras.getString("google.c.a.m_l");
/* 306 */                       if (string6 != null) {
/* 308 */                           str4 = string6;
                                } else {
/* 311 */                           str4 = HttpUrl.FRAGMENT_ENCODE_SET;
                                }
/* 315 */                       string7 = extras.getString("google.c.a.c_l");
/* 319 */                       if (string7 != null) {
/* 321 */                           str5 = string7;
                                } else {
/* 324 */                           str5 = HttpUrl.FRAGMENT_ENCODE_SET;
                                }
/* 334 */                       if (extras.containsKey("google.c.sender.id")) {
                                    try {
/* 340 */                               j = Long.parseLong(extras.getString("google.c.sender.id"));
                                    } catch (NumberFormatException e2) {
/* 348 */                               AbstractC1245n0.m4891s("FirebaseMessaging", "error parsing project number", e2);
/* 351 */                               vi0VarM9271c = vi0.m9271c();
/* 355 */                               cj0Var = vi0VarM9271c.f18194c;
/* 357 */                               vi0VarM9271c.m9274a();
/* 360 */                               str6 = cj0Var.f2938e;
/* 362 */                               if (str6 != null) {
                                            try {
/* 364 */                                       j = Long.parseLong(str6);
                                            } catch (NumberFormatException e3) {
/* 372 */                                       AbstractC1245n0.m4891s("FirebaseMessaging", "error parsing sender ID", e3);
/* 375 */                                       vi0VarM9271c.m9274a();
/* 378 */                                       str7 = cj0Var.f2935b;
/* 388 */                                       if (str7.startsWith("1:")) {
/* 402 */                                           strArrSplit = str7.split(":");
/* 407 */                                           if (strArrSplit.length < 2) {
/* 409 */                                               j = 0;
                                                    } else {
/* 412 */                                               str8 = strArrSplit[1];
/* 418 */                                               if (str8.isEmpty()) {
/* 409 */                                                   j = 0;
                                                        } else {
                                                            try {
/* 421 */                                                       j = Long.parseLong(str8);
                                                            } catch (NumberFormatException e4) {
/* 427 */                                                       AbstractC1245n0.m4891s("FirebaseMessaging", "error parsing app ID", e4);
/* 409 */                                                       j = 0;
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    try {
/* 390 */                                               j = Long.parseLong(str7);
                                                    } catch (NumberFormatException e5) {
/* 396 */                                               AbstractC1245n0.m4891s("FirebaseMessaging", "error parsing app ID", e5);
/* 409 */                                               j = 0;
                                                    }
                                                }
                                            }
                                        } else {
/* 375 */                                   vi0VarM9271c.m9274a();
/* 378 */                                   str7 = cj0Var.f2935b;
/* 388 */                                   if (str7.startsWith("1:")) {
/* 390 */                                       j = Long.parseLong(str7);
                                            } else {
/* 402 */                                       strArrSplit = str7.split(":");
/* 407 */                                       if (strArrSplit.length < 2) {
/* 409 */                                           j = 0;
                                                } else {
/* 412 */                                           str8 = strArrSplit[1];
/* 418 */                                           if (str8.isEmpty()) {
/* 409 */                                               j = 0;
                                                    } else {
/* 421 */                                               j = Long.parseLong(str8);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
/* 351 */                           vi0VarM9271c = vi0.m9271c();
/* 355 */                           cj0Var = vi0VarM9271c.f18194c;
/* 357 */                           vi0VarM9271c.m9274a();
/* 360 */                           str6 = cj0Var.f2938e;
/* 362 */                           if (str6 != null) {
/* 364 */                               j = Long.parseLong(str6);
                                    } else {
/* 375 */                               vi0VarM9271c.m9274a();
/* 378 */                               str7 = cj0Var.f2935b;
/* 388 */                               if (str7.startsWith("1:")) {
/* 390 */                                   j = Long.parseLong(str7);
                                        } else {
/* 402 */                                   strArrSplit = str7.split(":");
/* 407 */                                   if (strArrSplit.length < 2) {
/* 409 */                                       j = 0;
                                            } else {
/* 412 */                                       str8 = strArrSplit[1];
/* 418 */                                       if (str8.isEmpty()) {
/* 409 */                                           j = 0;
                                                } else {
/* 421 */                                           j = Long.parseLong(str8);
                                                }
                                            }
                                        }
                                    }
                                }
/* 433 */                       if (j > 0) {
/* 435 */                           j2 = j;
                                } else {
/* 437 */                           j2 = 0;
                                }
/* 441 */                       ai1Var = new ai1(j2, str, str10, yh1Var2, packageName, str3, i3, i, str2, str4, str5);
                            }
/* 89 */                    i = iIntValue;
/* 125 */                   string = extras.getString("google.to");
/* 133 */                   if (TextUtils.isEmpty(string)) {
/* 153 */                       string = (String) Tasks.await(FirebaseInstallations.getInstance(vi0.m9271c()).getId());
                            }
/* 135 */                   String str11 = string;
/* 156 */                   vi0 vi0VarM9271c3 = vi0.m9271c();
/* 160 */                   vi0VarM9271c3.m9274a();
/* 165 */                   String packageName2 = vi0VarM9271c3.f18192a.getPackageName();
/* 173 */                   if (ts0.m8887z(extras)) {
/* 175 */                       yh1Var = yh1.DISPLAY_NOTIFICATION;
                            } else {
/* 179 */                       yh1Var = yh1.DATA_MESSAGE;
                            }
/* 177 */                   yh1 yh1Var3 = yh1Var;
/* 184 */                   string2 = extras.getString("google.delivered_priority");
/* 190 */                   if (string2 != null) {
/* 220 */                       if ("high".equals(string2)) {
/* 222 */                           objArr = 1;
                                } else if ("normal".equals(string2)) {
/* 206 */                           objArr = 2;
                                } else {
/* 233 */                           objArr = 0;
                                }
                            } else if ("1".equals(extras.getString("google.priority_reduced"))) {
/* 206 */                       objArr = 2;
                            } else {
/* 210 */                       string2 = extras.getString("google.priority");
/* 220 */                       if ("high".equals(string2)) {
/* 222 */                           objArr = 1;
                                } else if ("normal".equals(string2)) {
/* 206 */                           objArr = 2;
                                } else {
/* 233 */                           objArr = 0;
                                }
                            }
/* 234 */                   if (objArr == 2) {
/* 236 */                       i2 = 5;
                            } else if (objArr == 1) {
/* 241 */                       i2 = 10;
                            }
/* 237 */                   int i4 = i2;
/* 246 */                   string3 = extras.getString("google.message_id");
/* 250 */                   if (string3 == null) {
/* 254 */                       string3 = extras.getString("message_id");
                            }
/* 260 */                   if (string3 != null) {
/* 262 */                       str = string3;
                            } else {
/* 264 */                       str = HttpUrl.FRAGMENT_ENCODE_SET;
                            }
/* 267 */                   string4 = extras.getString("from");
/* 271 */                   if (string4 != null) {
/* 281 */                       str9 = string4;
                            }
/* 282 */                   if (str9 != null) {
/* 284 */                       str2 = str9;
                            } else {
/* 287 */                       str2 = HttpUrl.FRAGMENT_ENCODE_SET;
                            }
/* 291 */                   string5 = extras.getString("collapse_key");
/* 295 */                   if (string5 != null) {
/* 297 */                       str3 = string5;
                            } else {
/* 299 */                       str3 = HttpUrl.FRAGMENT_ENCODE_SET;
                            }
/* 302 */                   string6 = extras.getString("google.c.a.m_l");
/* 306 */                   if (string6 != null) {
/* 308 */                       str4 = string6;
                            } else {
/* 311 */                       str4 = HttpUrl.FRAGMENT_ENCODE_SET;
                            }
/* 315 */                   string7 = extras.getString("google.c.a.c_l");
/* 319 */                   if (string7 != null) {
/* 321 */                       str5 = string7;
                            } else {
/* 324 */                       str5 = HttpUrl.FRAGMENT_ENCODE_SET;
                            }
/* 334 */                   if (extras.containsKey("google.c.sender.id")) {
/* 340 */                       j = Long.parseLong(extras.getString("google.c.sender.id"));
                            } else {
/* 351 */                       vi0VarM9271c = vi0.m9271c();
/* 355 */                       cj0Var = vi0VarM9271c.f18194c;
/* 357 */                       vi0VarM9271c.m9274a();
/* 360 */                       str6 = cj0Var.f2938e;
/* 362 */                       if (str6 != null) {
/* 364 */                           j = Long.parseLong(str6);
                                } else {
/* 375 */                           vi0VarM9271c.m9274a();
/* 378 */                           str7 = cj0Var.f2935b;
/* 388 */                           if (str7.startsWith("1:")) {
/* 390 */                               j = Long.parseLong(str7);
                                    } else {
/* 402 */                               strArrSplit = str7.split(":");
/* 407 */                               if (strArrSplit.length < 2) {
/* 409 */                                   j = 0;
                                        } else {
/* 412 */                                   str8 = strArrSplit[1];
/* 418 */                                   if (str8.isEmpty()) {
/* 409 */                                       j = 0;
                                            } else {
/* 421 */                                       j = Long.parseLong(str8);
                                            }
                                        }
                                    }
                                }
                            }
/* 433 */                   if (j > 0) {
/* 435 */                       j2 = j;
                            } else {
/* 437 */                       j2 = 0;
                            }
/* 441 */                   ai1Var = new ai1(j2, str, str11, yh1Var3, packageName2, str3, i4, i, str2, str4, str5);
                        }
/* 445 */               if (ai1Var == null) {
/* 513 */                   return;
                        }
                        try {
/* 498 */                   ((xr2) wr2Var).m10019a("FCM_CLIENT_EVENT_LOGGING", new vd0("proto"), new ds0(15)).m1246A(new C2105qf(new bi1(ai1Var), new C1026ig(Integer.valueOf(intent.getIntExtra("google.product_id", 111881503)))));
                        } catch (RuntimeException e6) {
/* 505 */                   AbstractC1245n0.m4891s("FirebaseMessaging", "Failed to send big query analytics payload.", e6);
                        }
                    }
                }

                /* JADX INFO: renamed from: y */
                public static void m1241y(String str, Bundle bundle) {
                    try {
/* 3 */                 vi0.m9271c();
/* 6 */                 if (bundle == null) {
/* 10 */                    bundle = new Bundle();
                        }
/* 15 */                Bundle bundle2 = new Bundle();
/* 20 */                String string = bundle.getString("google.c.a.c_id");
/* 24 */                if (string != null) {
/* 28 */                    bundle2.putString("_nmid", string);
                        }
/* 33 */                String string2 = bundle.getString("google.c.a.c_l");
/* 37 */                if (string2 != null) {
/* 41 */                    bundle2.putString("_nmn", string2);
                        }
/* 46 */                String string3 = bundle.getString("google.c.a.m_l");
/* 54 */                if (!TextUtils.isEmpty(string3)) {
/* 58 */                    bundle2.putString("label", string3);
                        }
/* 63 */                String string4 = bundle.getString("google.c.a.m_c");
/* 71 */                if (!TextUtils.isEmpty(string4)) {
/* 75 */                    bundle2.putString("message_channel", string4);
                        }
/* 80 */                String string5 = bundle.getString("from");
/* 85 */                if (string5 == null || !string5.startsWith("/topics/")) {
/* 96 */                    string5 = null;
                        }
/* 97 */                if (string5 != null) {
/* 101 */                   bundle2.putString("_nt", string5);
                        }
/* 106 */               String string6 = bundle.getString("google.c.a.ts");
/* 110 */               if (string6 != null) {
                            try {
/* 118 */                       bundle2.putInt("_nmt", Integer.parseInt(string6));
                            } catch (NumberFormatException e) {
/* 125 */                       AbstractC1245n0.m4891s("FirebaseMessaging", "Error while parsing timestamp in GCM event", e);
                            }
                        }
/* 136 */               String string7 = bundle.containsKey("google.c.a.udt") ? bundle.getString("google.c.a.udt") : null;
/* 140 */               if (string7 != null) {
                            try {
/* 148 */                       bundle2.putInt("_ndt", Integer.parseInt(string7));
                            } catch (NumberFormatException e2) {
/* 155 */                       AbstractC1245n0.m4891s("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e2);
                            }
                        }
/* 167 */               String str2 = ts0.m8887z(bundle) ? "display" : SharedDataContentProvider.BASE_PATH;
/* 175 */               if ("_nr".equals(str) || "_nf".equals(str)) {
/* 187 */                   bundle2.putString("_nmc", str2);
                        }
/* 195 */               if (Log.isLoggable("FirebaseMessaging", 3)) {
/* 197 */                   bundle2.toString();
                        }
/* 210 */               AnalyticsConnector analyticsConnector = (AnalyticsConnector) vi0.m9271c().m9275b(AnalyticsConnector.class);
/* 212 */               if (analyticsConnector != null) {
/* 216 */                   analyticsConnector.logEvent("fcm", str, bundle2);
                        } else {
/* 222 */                   AbstractC1245n0.m4889q("FirebaseMessaging", "Unable to log event: analytics library is missing");
                        }
                    } catch (IllegalStateException unused) {
/* 228 */               AbstractC1245n0.m4876d("FirebaseMessaging", "Default FirebaseApp has not been initialized. Skip logging event to GA.");
                    }
                }

                /* JADX INFO: renamed from: z */
                public static float m1242z(EdgeEffect edgeEffect, float f, float f2) {
/* 5 */             if (Build.VERSION.SDK_INT >= 31) {
/* 7 */                 return cc0.m1630c(edgeEffect, f, f2);
                    }
/* 12 */            bc0.m1330a(edgeEffect, f, f2);
/* 15 */            return f;
                }
            }
