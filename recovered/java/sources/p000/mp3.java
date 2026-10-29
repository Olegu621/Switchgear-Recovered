            package p000;

            import android.app.BroadcastOptions;
            import android.app.job.JobInfo;
            import android.content.ComponentName;
            import android.content.ContentValues;
            import android.content.Context;
            import android.content.Intent;
            import android.content.IntentFilter;
            import android.content.pm.ApplicationInfo;
            import android.content.pm.PackageInfo;
            import android.content.pm.PackageManager;
            import android.content.pm.ResolveInfo;
            import android.content.pm.ServiceInfo;
            import android.database.Cursor;
            import android.database.sqlite.SQLiteDatabase;
            import android.database.sqlite.SQLiteException;
            import android.net.Uri;
            import android.os.Build;
            import android.os.Bundle;
            import android.os.Parcelable;
            import android.os.PersistableBundle;
            import android.os.SystemClock;
            import android.text.TextUtils;
            import android.util.Log;
            import android.util.Pair;
            import androidx.core.app.NotificationCompat;
            import com.google.android.gms.internal.measurement.zzbv;
            import com.google.android.gms.internal.measurement.zzca;
            import com.google.android.gms.internal.measurement.zzch;
            import com.google.android.gms.internal.measurement.zzfu;
            import com.google.android.gms.internal.measurement.zzfw;
            import com.google.android.gms.internal.measurement.zzgc;
            import com.google.android.gms.internal.measurement.zzgf;
            import com.google.android.gms.internal.measurement.zzgl;
            import com.google.android.gms.internal.measurement.zzgx;
            import com.google.android.gms.internal.measurement.zzha;
            import com.google.android.gms.internal.measurement.zzhd;
            import com.google.android.gms.internal.measurement.zzhe;
            import com.google.android.gms.internal.measurement.zzhh;
            import com.google.android.gms.internal.measurement.zzhk;
            import com.google.android.gms.internal.measurement.zzhl;
            import com.google.android.gms.internal.measurement.zzho;
            import com.google.android.gms.internal.measurement.zzhr;
            import com.google.android.gms.internal.measurement.zzhs;
            import com.google.android.gms.internal.measurement.zzhv;
            import com.google.android.gms.internal.measurement.zzhw;
            import com.google.android.gms.internal.measurement.zzhz;
            import com.google.android.gms.internal.measurement.zzib;
            import com.google.android.gms.internal.measurement.zzic;
            import com.google.android.gms.internal.measurement.zzid;
            import com.google.android.gms.internal.measurement.zzis;
            import com.google.android.gms.internal.measurement.zzit;
            import com.google.android.gms.internal.measurement.zziu;
            import com.google.android.gms.internal.measurement.zzjq;
            import com.google.android.gms.internal.measurement.zzka;
            import com.google.android.gms.internal.measurement.zzmq;
            import com.google.android.gms.internal.measurement.zzpn;
            import com.google.android.gms.internal.measurement.zzql;
            import com.google.android.gms.internal.measurement.zzqu;
            import com.google.android.gms.measurement.internal.zzah;
            import com.google.android.gms.measurement.internal.zzbe;
            import com.google.android.gms.measurement.internal.zzbg;
            import com.google.android.gms.measurement.internal.zzog;
            import com.google.android.gms.measurement.internal.zzon;
            import com.google.android.gms.measurement.internal.zzpk;
            import com.google.android.gms.measurement.internal.zzr;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import com.supercell.p007id.scid_plugin.platform_interface.SharedDataContentProvider;
            import io.sentry.android.core.C1268s;
            import java.io.ByteArrayInputStream;
            import java.io.ByteArrayOutputStream;
            import java.io.File;
            import java.io.FileNotFoundException;
            import java.io.IOException;
            import java.io.RandomAccessFile;
            import java.io.Serializable;
            import java.math.BigInteger;
            import java.net.MalformedURLException;
            import java.net.URI;
            import java.net.URISyntaxException;
            import java.net.URL;
            import java.nio.ByteBuffer;
            import java.nio.channels.FileChannel;
            import java.nio.channels.FileLock;
            import java.nio.channels.OverlappingFileLockException;
            import java.nio.charset.Charset;
            import java.nio.charset.StandardCharsets;
            import java.security.SecureRandom;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collections;
            import java.util.EnumMap;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.LinkedList;
            import java.util.List;
            import java.util.Locale;
            import java.util.Map;
            import java.util.Objects;
            import java.util.Set;
            import java.util.TreeSet;
            import java.util.UUID;
            import java.util.concurrent.atomic.AtomicBoolean;
            import java.util.zip.GZIPInputStream;
            import okhttp3.HttpUrl;
            import okio.Segment;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class mp3 implements jk3 {

                /* JADX INFO: renamed from: v0 */
                public static volatile mp3 f13902v0;

                /* JADX INFO: renamed from: V */
                public oi3 f13904V;

                /* JADX INFO: renamed from: W */
                public final ij3 f13905W;

                /* JADX INFO: renamed from: Y */
                public boolean f13907Y;

                /* JADX INFO: renamed from: Z */
                public long f13908Z;

                /* JADX INFO: renamed from: a */
                public final vi3 f13909a;

                /* JADX INFO: renamed from: a0 */
                public ArrayList f13910a0;

                /* JADX INFO: renamed from: b */
                public final ci3 f13911b;

                /* JADX INFO: renamed from: c */
                public ae3 f13913c;

                /* JADX INFO: renamed from: c0 */
                public int f13914c0;

                /* JADX INFO: renamed from: d */
                public gi3 f13915d;

                /* JADX INFO: renamed from: d0 */
                public int f13916d0;

                /* JADX INFO: renamed from: e */
                public po3 f13917e;

                /* JADX INFO: renamed from: e0 */
                public boolean f13918e0;

                /* JADX INFO: renamed from: f */
                public fd3 f13919f;

                /* JADX INFO: renamed from: f0 */
                public boolean f13920f0;

                /* JADX INFO: renamed from: g0 */
                public boolean f13921g0;

                /* JADX INFO: renamed from: h0 */
                public FileLock f13922h0;

                /* JADX INFO: renamed from: i */
                public final ci3 f13923i;

                /* JADX INFO: renamed from: i0 */
                public FileChannel f13924i0;

                /* JADX INFO: renamed from: j0 */
                public ArrayList f13925j0;

                /* JADX INFO: renamed from: k0 */
                public ArrayList f13926k0;

                /* JADX INFO: renamed from: m0 */
                public final HashMap f13928m0;

                /* JADX INFO: renamed from: n0 */
                public final HashMap f13929n0;

                /* JADX INFO: renamed from: o0 */
                public final HashMap f13930o0;

                /* JADX INFO: renamed from: q0 */
                public bm3 f13932q0;

                /* JADX INFO: renamed from: r0 */
                public String f13933r0;

                /* JADX INFO: renamed from: s0 */
                public do3 f13934s0;

                /* JADX INFO: renamed from: t0 */
                public long f13935t0;

                /* JADX INFO: renamed from: v */
                public ci3 f13937v;

                /* JADX INFO: renamed from: w */
                public tn3 f13938w;

                /* JADX INFO: renamed from: X */
                public final AtomicBoolean f13906X = new AtomicBoolean(false);

                /* JADX INFO: renamed from: b0 */
                public final LinkedList f13912b0 = new LinkedList();

                /* JADX INFO: renamed from: p0 */
                public final HashMap f13931p0 = new HashMap();

                /* JADX INFO: renamed from: u0 */
                public final ac3 f13936u0 = new ac3(this, 9);

                /* JADX INFO: renamed from: l0 */
                public long f13927l0 = -1;

                /* JADX INFO: renamed from: U */
                public final yo3 f13903U = new yo3(this);

                public mp3(v30 v30Var) {
/* 42 */            this.f13905W = ij3.m4556r(v30Var.f17850a, null, null);
/* 58 */            ci3 ci3Var = new ci3(this, 2);
/* 61 */            ci3Var.m9594B();
/* 64 */            this.f13923i = ci3Var;
/* 68 */            ci3 ci3Var2 = new ci3(this, 0);
/* 71 */            ci3Var2.m9594B();
/* 74 */            this.f13911b = ci3Var2;
/* 78 */            vi3 vi3Var = new vi3(this);
/* 81 */            vi3Var.m9594B();
/* 84 */            this.f13909a = vi3Var;
/* 91 */            this.f13928m0 = new HashMap();
/* 98 */            this.f13929n0 = new HashMap();
/* 105 */           this.f13930o0 = new HashMap();
/* 116 */           mo4558b().m1370I(new bb3(this, v30Var));
                }

                /* JADX INFO: renamed from: B */
                public static mp3 m6723B(Context context) {
/* 1 */             kb1.m6061n(context);
/* 8 */             kb1.m6061n(context.getApplicationContext());
/* 13 */            if (f13902v0 == null) {
                        synchronized (mp3.class) {
                            try {
/* 20 */                        if (f13902v0 == null) {
/* 33 */                            f13902v0 = new mp3(new v30(context, 2));
                                }
                            } catch (Throwable th) {
/* 41 */                        throw th;
                            }
                        }
                    }
/* 42 */            return f13902v0;
                }

                /* JADX INFO: renamed from: C */
                public static final void m6724C(zzhr zzhrVar, String str) {
/* 1 */             List listZza = zzhrVar.zza();
/* 10 */            for (int i = 0; i < listZza.size(); i++) {
/* 26 */                if (str.equals(((zzhw) listZza.get(i)).zzb())) {
/* 28 */                    zzhrVar.zzj(i);
/* 31 */                    return;
                        }
                    }
                }

                /* JADX INFO: renamed from: K */
                public static String m6725K(String str, Map map) {
/* 1 */             if (map == null) {
/* 62 */                return null;
                    }
/* 16 */            for (Map.Entry entry : map.entrySet()) {
/* 34 */                if (str.equalsIgnoreCase((String) entry.getKey())) {
/* 46 */                    if (((List) entry.getValue()).isEmpty()) {
/* 62 */                        return null;
                            }
/* 59 */                    return (String) ((List) entry.getValue()).get(0);
                        }
                    }
/* 62 */            return null;
                }

                /* JADX INFO: renamed from: Q */
                public static final boolean m6726Q(zzr zzrVar) {
                    return !TextUtils.isEmpty(zzrVar.f4242b);
                }

                /* JADX INFO: renamed from: R */
                public static final void m6727R(zzic zzicVar) {
/* 6 */             zzicVar.zzv(Long.MAX_VALUE);
/* 11 */            zzicVar.zzx(Long.MIN_VALUE);
/* 19 */            for (int i = 0; i < zzicVar.zzc(); i++) {
/* 21 */                zzhs zzhsVarZzd = zzicVar.zzd(i);
/* 35 */                if (zzhsVarZzd.zzf() < zzicVar.zzu()) {
/* 41 */                    zzicVar.zzv(zzhsVarZzd.zzf());
                        }
/* 54 */                if (zzhsVarZzd.zzf() > zzicVar.zzw()) {
/* 60 */                    zzicVar.zzx(zzhsVarZzd.zzf());
                        }
                    }
                }

                /* JADX INFO: renamed from: S */
                public static final void m6728S(wo3 wo3Var) {
/* 1 */             if (wo3Var == null) {
/* 28 */                f42.m3656l("Upload Component not created");
                    } else {
/* 5 */                 if (wo3Var.f18714c) {
/* 7 */                     return;
                        }
/* 22 */                f42.m3656l("Component not initialized: ".concat(String.valueOf(wo3Var.getClass())));
                    }
                }

                /* JADX INFO: renamed from: T */
                public static final Boolean m6729T(zzr zzrVar) {
/* 1 */             Boolean bool = zzrVar.f4241a0;
/* 3 */             String str = zzrVar.f4260n0;
/* 9 */             if (!TextUtils.isEmpty(str)) {
/* 19 */                int iOrdinal = ((lk3) fs0.m3808y(str).f8339b).ordinal();
/* 23 */                if (iOrdinal == 0 || iOrdinal == 1) {
/* 41 */                    return null;
                        }
/* 29 */                if (iOrdinal == 2) {
/* 38 */                    return Boolean.TRUE;
                        }
/* 32 */                if (iOrdinal == 3) {
/* 35 */                    return Boolean.FALSE;
                        }
                    }
/* 43 */            return bool;
                }

                /* JADX INFO: renamed from: c0 */
                public static final void m6730c0(zzhr zzhrVar, int i, String str) {
/* 1 */             List listZza = zzhrVar.zza();
/* 12 */            for (int i2 = 0; i2 < listZza.size(); i2++) {
/* 28 */                if ("_err".equals(((zzhw) listZza.get(i2)).zzb())) {
/* 30 */                    return;
                        }
                    }
/* 34 */            zzhv zzhvVarZzn = zzhw.zzn();
/* 38 */            zzhvVarZzn.zzb("_err");
/* 42 */            zzhvVarZzn.zzf(i);
/* 49 */            zzhw zzhwVar = (zzhw) zzhvVarZzn.zzbc();
/* 51 */            zzhv zzhvVarZzn2 = zzhw.zzn();
/* 57 */            zzhvVarZzn2.zzb("_ev");
/* 60 */            zzhvVarZzn2.zzd(str);
/* 67 */            zzhw zzhwVar2 = (zzhw) zzhvVarZzn2.zzbc();
/* 69 */            zzhrVar.zzf(zzhwVar);
/* 72 */            zzhrVar.zzf(zzhwVar2);
                }

                /* JADX INFO: renamed from: A */
                public final void m6731A() {
/* 5 */             mo4558b().mo1375y();
/* 8 */             m6765k0();
/* 13 */            if (this.f13907Y) {
/* 426 */               return;
                    }
/* 16 */            this.f13907Y = true;
/* 22 */            mo4558b().mo1375y();
/* 25 */            FileLock fileLock = this.f13922h0;
/* 27 */            ij3 ij3Var = this.f13905W;
/* 31 */            if (fileLock == null || !fileLock.isValid()) {
/* 56 */                ((ij3) this.f13913c.f16749a).getClass();
/* 61 */                File filesDir = ij3Var.f9645a.getFilesDir();
/* 67 */                zzbv.zza();
/* 70 */                int i = zzca.zzb;
                        try {
/* 93 */                    FileChannel channel = new RandomAccessFile(new File(new File(filesDir, "google_app_measurement.db").getPath()), "rw").getChannel();
/* 97 */                    this.f13924i0 = channel;
/* 99 */                    FileLock fileLockTryLock = channel.tryLock();
/* 103 */                   this.f13922h0 = fileLockTryLock;
/* 105 */                   if (fileLockTryLock == null) {
/* 387 */                       mo4557a().f17538f.m8510a("Storage concurrent data access panic");
/* 426 */                       return;
                            }
/* 113 */                   mo4557a().f17534Y.m8510a("Storage concurrent access okay");
                        } catch (FileNotFoundException e) {
/* 423 */                   mo4557a().f17538f.m8511b(e, "Failed to acquire storage lock");
/* 426 */                   return;
                        } catch (IOException e2) {
/* 411 */                   mo4557a().f17538f.m8511b(e2, "Failed to access storage lock file");
/* 426 */                   return;
                        } catch (OverlappingFileLockException e3) {
/* 399 */                   mo4557a().f17541w.m8511b(e3, "Storage lock already acquired");
/* 426 */                   return;
                        }
                    } else {
/* 46 */                mo4557a().f17534Y.m8510a("Storage concurrent access okay");
                    }
/* 116 */           FileChannel fileChannel = this.f13924i0;
/* 122 */           mo4558b().mo1375y();
/* 130 */           int i2 = 0;
/* 131 */           if (fileChannel == null || !fileChannel.isOpen()) {
/* 200 */               mo4557a().f17538f.m8510a("Bad channel to read from");
                    } else {
/* 140 */               ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
                        try {
/* 144 */                   fileChannel.position(0L);
/* 147 */                   int i3 = fileChannel.read(byteBufferAllocate);
/* 151 */                   if (i3 == 4) {
/* 174 */                       byteBufferAllocate.flip();
/* 177 */                       i2 = byteBufferAllocate.getInt();
                            } else if (i3 != -1) {
/* 168 */                       mo4557a().f17541w.m8511b(Integer.valueOf(i3), "Unexpected data length. Bytes read");
                            }
                        } catch (IOException e4) {
/* 190 */                   mo4557a().f17538f.m8511b(e4, "Failed to read from channel");
                        }
                    }
/* 203 */           ih3 ih3VarM4569q = ij3Var.m4569q();
/* 207 */           ih3VarM4569q.m9576A();
/* 210 */           int i4 = ih3VarM4569q.f9599e;
/* 216 */           mo4558b().mo1375y();
/* 219 */           if (i2 > i4) {
/* 237 */               mo4557a().f17538f.m8512c(Integer.valueOf(i2), "Panic: can't downgrade version. Previous, current version", Integer.valueOf(i4));
/* 240 */               return;
                    }
/* 241 */           if (i2 < i4) {
/* 243 */               FileChannel fileChannel2 = this.f13924i0;
/* 249 */               mo4558b().mo1375y();
/* 252 */               if (fileChannel2 == null || !fileChannel2.isOpen()) {
/* 350 */                   mo4557a().f17538f.m8510a("Bad channel to read from");
                        } else {
/* 261 */                   ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(4);
/* 265 */                   byteBufferAllocate2.putInt(i4);
/* 268 */                   byteBufferAllocate2.flip();
                            try {
/* 271 */                       fileChannel2.truncate(0L);
/* 274 */                       fileChannel2.write(byteBufferAllocate2);
/* 277 */                       fileChannel2.force(true);
/* 288 */                       if (fileChannel2.size() != 4) {
/* 306 */                           mo4557a().f17538f.m8511b(Long.valueOf(fileChannel2.size()), "Error writing to channel. Bytes written");
                                }
/* 328 */                       mo4557a().f17534Y.m8512c(Integer.valueOf(i2), "Storage version upgraded. Previous, current version", Integer.valueOf(i4));
/* 331 */                       return;
                            } catch (IOException e5) {
/* 340 */                       mo4557a().f17538f.m8511b(e5, "Failed to write to channel");
                            }
                        }
/* 369 */               mo4557a().f17538f.m8512c(Integer.valueOf(i2), "Storage version upgrade failed. Previous, current version", Integer.valueOf(i4));
                    }
                }

                /* JADX INFO: renamed from: D */
                public final int m6732D(String str, ac3 ac3Var) {
                    lk3 lk3VarM9280D;
/* 1 */             vi3 vi3Var = this.f13909a;
/* 3 */             zzgf zzgfVarM9295U = vi3Var.m9295U(str);
/* 8 */             nk3 nk3Var = nk3.AD_PERSONALIZATION;
/* 10 */            if (zzgfVarM9295U == null) {
/* 14 */                ac3Var.m202g(nk3Var, rd3.FAILSAFE);
/* 7 */                 return 1;
                    }
/* 18 */            ae3 ae3Var = this.f13913c;
/* 20 */            m6728S(ae3Var);
/* 23 */            di3 di3VarM219D0 = ae3Var.m219D0(str);
/* 27 */            if (di3VarM219D0 == null || ((lk3) fs0.m3808y(di3VarM219D0.m3127s()).f8339b) != lk3.POLICY || (lk3VarM9280D = vi3Var.m9280D(str, nk3Var)) == lk3.UNINITIALIZED) {
/* 65 */                ac3Var.m202g(nk3Var, rd3.REMOTE_DEFAULT);
/* 72 */                if (vi3Var.m9294T(str, nk3Var)) {
/* 74 */                    return 0;
                        }
                    } else {
/* 55 */                ac3Var.m202g(nk3Var, rd3.REMOTE_ENFORCED_DEFAULT);
/* 60 */                if (lk3VarM9280D == lk3.GRANTED) {
/* 74 */                    return 0;
                        }
                    }
/* 7 */             return 1;
                }

                /* JADX INFO: renamed from: E */
                public final HashMap m6733E(zzhs zzhsVar) {
                    Serializable serializableM1666O;
/* 3 */             HashMap map = new HashMap();
/* 6 */             m6761i0();
/* 11 */            HashMap map2 = new HashMap();
/* 26 */            for (zzhw zzhwVar : zzhsVar.zza()) {
/* 44 */                if (zzhwVar.zzb().startsWith("gad_") && (serializableM1666O = ci3.m1666O(zzhwVar)) != null) {
/* 56 */                    map2.put(zzhwVar.zzb(), serializableM1666O);
                        }
                    }
/* 72 */            for (Map.Entry entry : map2.entrySet()) {
/* 94 */                map.put((String) entry.getKey(), String.valueOf(entry.getValue()));
                    }
/* 98 */            return map;
                }

                /* JADX INFO: renamed from: F */
                public final void m6734F() {
/* 5 */             mo4558b().mo1375y();
/* 14 */            if (this.f13912b0.isEmpty()) {
/* 109 */               return;
                    }
/* 18 */            int i = 2;
/* 19 */            if (this.f13934s0 == null) {
/* 28 */                this.f13934s0 = new do3(this, this.f13905W, i);
                    }
/* 38 */            if (this.f13934s0.f2395c != 0) {
/* 40 */                return;
                    }
/* 47 */            ((xt0) mo4562f()).getClass();
/* 72 */            long jMax = Math.max(0L, ((long) ((Integer) vg3.f18066B0.m9011a(null)).intValue()) - (SystemClock.elapsedRealtime() - this.f13935t0));
/* 88 */            mo4557a().f17534Y.m8511b(Long.valueOf(jMax), "Scheduling notify next app runnable, delay in ms");
/* 93 */            if (this.f13934s0 == null) {
/* 102 */               this.f13934s0 = new do3(this, this.f13905W, i);
                    }
/* 106 */           this.f13934s0.m1348b(jMax);
                }

                /* JADX WARN: Code duplicated, block: B:100:0x0395 A[Catch: all -> 0x0117, TryCatch #0 {all -> 0x0117, blocks: (B:3:0x0017, B:5:0x002f, B:8:0x0038, B:9:0x0050, B:12:0x006c, B:15:0x009a, B:17:0x00d7, B:20:0x00f0, B:22:0x00fa, B:206:0x066f, B:27:0x0128, B:30:0x013a, B:32:0x0140, B:47:0x0184, B:49:0x0196, B:52:0x01b6, B:54:0x01bc, B:56:0x01cc, B:58:0x01da, B:60:0x01ea, B:61:0x01f5, B:62:0x01f8, B:64:0x020e, B:115:0x03f8, B:116:0x0404, B:119:0x040e, B:125:0x0431, B:122:0x0420, B:147:0x04ab, B:149:0x04b7, B:152:0x04c8, B:154:0x04d9, B:156:0x04e5, B:172:0x0543, B:174:0x0549, B:175:0x0555, B:177:0x055b, B:179:0x056b, B:181:0x0575, B:182:0x0588, B:184:0x058e, B:185:0x05a7, B:187:0x05ad, B:188:0x05cb, B:189:0x05d9, B:193:0x0600, B:190:0x05df, B:192:0x05eb, B:194:0x0607, B:195:0x061d, B:197:0x0623, B:199:0x0636, B:200:0x0643, B:201:0x0647, B:203:0x064d, B:205:0x0659, B:160:0x04f7, B:162:0x0503, B:165:0x0516, B:167:0x0527, B:169:0x0533, B:129:0x0439, B:131:0x0445, B:133:0x0451, B:146:0x0495, B:138:0x046d, B:141:0x047f, B:143:0x0485, B:145:0x048f, B:72:0x0238, B:75:0x0242, B:77:0x0250, B:81:0x0297, B:78:0x026d, B:80:0x027d, B:85:0x02a4, B:87:0x02ce, B:88:0x02f6, B:90:0x032b, B:92:0x0331, B:95:0x033d, B:97:0x0372, B:98:0x038f, B:100:0x0395, B:102:0x03a3, B:106:0x03b7, B:103:0x03ab, B:109:0x03be, B:112:0x03c5, B:113:0x03dd, B:36:0x014a, B:38:0x0157, B:40:0x0165, B:42:0x016b, B:46:0x0176, B:209:0x0687, B:211:0x0695, B:213:0x069e, B:224:0x06ce, B:214:0x06a6, B:216:0x06af, B:218:0x06b5, B:221:0x06c1, B:223:0x06c9, B:225:0x06d1, B:226:0x06dd, B:229:0x06e5, B:231:0x06f7, B:232:0x0702, B:234:0x070a, B:238:0x0732, B:240:0x074e, B:242:0x0763, B:244:0x077f, B:246:0x0794, B:248:0x07e1, B:250:0x07e7, B:256:0x0812, B:258:0x081a, B:259:0x0823, B:261:0x0829, B:262:0x082f, B:264:0x0846, B:266:0x0857, B:268:0x0869, B:271:0x0874, B:273:0x087a, B:274:0x088c, B:276:0x0892, B:278:0x08a2, B:280:0x08be, B:283:0x08da, B:285:0x0901, B:305:0x0a4b, B:308:0x0a5b, B:286:0x091a, B:288:0x092e, B:290:0x094b, B:292:0x0972, B:294:0x09a4, B:295:0x09b1, B:297:0x09c7, B:299:0x09e4, B:301:0x0a0b, B:303:0x0a3d, B:309:0x0a63, B:311:0x0aac, B:312:0x0abf, B:315:0x0ac7, B:318:0x0ae2, B:320:0x0afb, B:322:0x0b10, B:324:0x0b15, B:326:0x0b19, B:328:0x0b1d, B:330:0x0b27, B:332:0x0b30, B:334:0x0b34, B:336:0x0b3a, B:338:0x0b45, B:340:0x0b53, B:406:0x0db2, B:342:0x0b5a, B:344:0x0b76, B:349:0x0b93, B:351:0x0bb5, B:352:0x0bbd, B:354:0x0bc3, B:356:0x0bd5, B:362:0x0bfc, B:363:0x0c1f, B:365:0x0c2b, B:367:0x0c43, B:369:0x0c86, B:375:0x0ca2, B:377:0x0cad, B:379:0x0cb1, B:381:0x0cb5, B:383:0x0cb9, B:384:0x0cc5, B:385:0x0cca, B:387:0x0cd0, B:389:0x0ce6, B:390:0x0ceb, B:405:0x0daf, B:392:0x0d29, B:394:0x0d2d, B:398:0x0d41, B:400:0x0d5d, B:401:0x0d64, B:404:0x0da3, B:395:0x0d32, B:360:0x0be6, B:347:0x0b7c, B:407:0x0db8, B:409:0x0dc2, B:410:0x0dc8, B:411:0x0dd0, B:413:0x0dd6, B:414:0x0dea, B:416:0x0dfc, B:436:0x0e9c, B:438:0x0ea2, B:440:0x0eb7, B:443:0x0ebe, B:448:0x0ef3, B:444:0x0ec6, B:446:0x0ed4, B:447:0x0eda, B:449:0x0f02, B:417:0x0e17, B:419:0x0e1d, B:421:0x0e2d, B:423:0x0e34, B:429:0x0e4a, B:431:0x0e51, B:433:0x0e8d, B:435:0x0e94, B:434:0x0e91, B:430:0x0e4e, B:422:0x0e31, B:251:0x07f7, B:253:0x07fd, B:255:0x0803, B:245:0x0791, B:241:0x0760, B:235:0x0710, B:237:0x0716, B:450:0x0f1d), top: B:456:0x0017, inners: #1 }] */
                /* JADX WARN: Code duplicated, block: B:102:0x03a3 A[Catch: all -> 0x0117, TryCatch #0 {all -> 0x0117, blocks: (B:3:0x0017, B:5:0x002f, B:8:0x0038, B:9:0x0050, B:12:0x006c, B:15:0x009a, B:17:0x00d7, B:20:0x00f0, B:22:0x00fa, B:206:0x066f, B:27:0x0128, B:30:0x013a, B:32:0x0140, B:47:0x0184, B:49:0x0196, B:52:0x01b6, B:54:0x01bc, B:56:0x01cc, B:58:0x01da, B:60:0x01ea, B:61:0x01f5, B:62:0x01f8, B:64:0x020e, B:115:0x03f8, B:116:0x0404, B:119:0x040e, B:125:0x0431, B:122:0x0420, B:147:0x04ab, B:149:0x04b7, B:152:0x04c8, B:154:0x04d9, B:156:0x04e5, B:172:0x0543, B:174:0x0549, B:175:0x0555, B:177:0x055b, B:179:0x056b, B:181:0x0575, B:182:0x0588, B:184:0x058e, B:185:0x05a7, B:187:0x05ad, B:188:0x05cb, B:189:0x05d9, B:193:0x0600, B:190:0x05df, B:192:0x05eb, B:194:0x0607, B:195:0x061d, B:197:0x0623, B:199:0x0636, B:200:0x0643, B:201:0x0647, B:203:0x064d, B:205:0x0659, B:160:0x04f7, B:162:0x0503, B:165:0x0516, B:167:0x0527, B:169:0x0533, B:129:0x0439, B:131:0x0445, B:133:0x0451, B:146:0x0495, B:138:0x046d, B:141:0x047f, B:143:0x0485, B:145:0x048f, B:72:0x0238, B:75:0x0242, B:77:0x0250, B:81:0x0297, B:78:0x026d, B:80:0x027d, B:85:0x02a4, B:87:0x02ce, B:88:0x02f6, B:90:0x032b, B:92:0x0331, B:95:0x033d, B:97:0x0372, B:98:0x038f, B:100:0x0395, B:102:0x03a3, B:106:0x03b7, B:103:0x03ab, B:109:0x03be, B:112:0x03c5, B:113:0x03dd, B:36:0x014a, B:38:0x0157, B:40:0x0165, B:42:0x016b, B:46:0x0176, B:209:0x0687, B:211:0x0695, B:213:0x069e, B:224:0x06ce, B:214:0x06a6, B:216:0x06af, B:218:0x06b5, B:221:0x06c1, B:223:0x06c9, B:225:0x06d1, B:226:0x06dd, B:229:0x06e5, B:231:0x06f7, B:232:0x0702, B:234:0x070a, B:238:0x0732, B:240:0x074e, B:242:0x0763, B:244:0x077f, B:246:0x0794, B:248:0x07e1, B:250:0x07e7, B:256:0x0812, B:258:0x081a, B:259:0x0823, B:261:0x0829, B:262:0x082f, B:264:0x0846, B:266:0x0857, B:268:0x0869, B:271:0x0874, B:273:0x087a, B:274:0x088c, B:276:0x0892, B:278:0x08a2, B:280:0x08be, B:283:0x08da, B:285:0x0901, B:305:0x0a4b, B:308:0x0a5b, B:286:0x091a, B:288:0x092e, B:290:0x094b, B:292:0x0972, B:294:0x09a4, B:295:0x09b1, B:297:0x09c7, B:299:0x09e4, B:301:0x0a0b, B:303:0x0a3d, B:309:0x0a63, B:311:0x0aac, B:312:0x0abf, B:315:0x0ac7, B:318:0x0ae2, B:320:0x0afb, B:322:0x0b10, B:324:0x0b15, B:326:0x0b19, B:328:0x0b1d, B:330:0x0b27, B:332:0x0b30, B:334:0x0b34, B:336:0x0b3a, B:338:0x0b45, B:340:0x0b53, B:406:0x0db2, B:342:0x0b5a, B:344:0x0b76, B:349:0x0b93, B:351:0x0bb5, B:352:0x0bbd, B:354:0x0bc3, B:356:0x0bd5, B:362:0x0bfc, B:363:0x0c1f, B:365:0x0c2b, B:367:0x0c43, B:369:0x0c86, B:375:0x0ca2, B:377:0x0cad, B:379:0x0cb1, B:381:0x0cb5, B:383:0x0cb9, B:384:0x0cc5, B:385:0x0cca, B:387:0x0cd0, B:389:0x0ce6, B:390:0x0ceb, B:405:0x0daf, B:392:0x0d29, B:394:0x0d2d, B:398:0x0d41, B:400:0x0d5d, B:401:0x0d64, B:404:0x0da3, B:395:0x0d32, B:360:0x0be6, B:347:0x0b7c, B:407:0x0db8, B:409:0x0dc2, B:410:0x0dc8, B:411:0x0dd0, B:413:0x0dd6, B:414:0x0dea, B:416:0x0dfc, B:436:0x0e9c, B:438:0x0ea2, B:440:0x0eb7, B:443:0x0ebe, B:448:0x0ef3, B:444:0x0ec6, B:446:0x0ed4, B:447:0x0eda, B:449:0x0f02, B:417:0x0e17, B:419:0x0e1d, B:421:0x0e2d, B:423:0x0e34, B:429:0x0e4a, B:431:0x0e51, B:433:0x0e8d, B:435:0x0e94, B:434:0x0e91, B:430:0x0e4e, B:422:0x0e31, B:251:0x07f7, B:253:0x07fd, B:255:0x0803, B:245:0x0791, B:241:0x0760, B:235:0x0710, B:237:0x0716, B:450:0x0f1d), top: B:456:0x0017, inners: #1 }] */
                /* JADX WARN: Code duplicated, block: B:103:0x03ab A[Catch: all -> 0x0117, TryCatch #0 {all -> 0x0117, blocks: (B:3:0x0017, B:5:0x002f, B:8:0x0038, B:9:0x0050, B:12:0x006c, B:15:0x009a, B:17:0x00d7, B:20:0x00f0, B:22:0x00fa, B:206:0x066f, B:27:0x0128, B:30:0x013a, B:32:0x0140, B:47:0x0184, B:49:0x0196, B:52:0x01b6, B:54:0x01bc, B:56:0x01cc, B:58:0x01da, B:60:0x01ea, B:61:0x01f5, B:62:0x01f8, B:64:0x020e, B:115:0x03f8, B:116:0x0404, B:119:0x040e, B:125:0x0431, B:122:0x0420, B:147:0x04ab, B:149:0x04b7, B:152:0x04c8, B:154:0x04d9, B:156:0x04e5, B:172:0x0543, B:174:0x0549, B:175:0x0555, B:177:0x055b, B:179:0x056b, B:181:0x0575, B:182:0x0588, B:184:0x058e, B:185:0x05a7, B:187:0x05ad, B:188:0x05cb, B:189:0x05d9, B:193:0x0600, B:190:0x05df, B:192:0x05eb, B:194:0x0607, B:195:0x061d, B:197:0x0623, B:199:0x0636, B:200:0x0643, B:201:0x0647, B:203:0x064d, B:205:0x0659, B:160:0x04f7, B:162:0x0503, B:165:0x0516, B:167:0x0527, B:169:0x0533, B:129:0x0439, B:131:0x0445, B:133:0x0451, B:146:0x0495, B:138:0x046d, B:141:0x047f, B:143:0x0485, B:145:0x048f, B:72:0x0238, B:75:0x0242, B:77:0x0250, B:81:0x0297, B:78:0x026d, B:80:0x027d, B:85:0x02a4, B:87:0x02ce, B:88:0x02f6, B:90:0x032b, B:92:0x0331, B:95:0x033d, B:97:0x0372, B:98:0x038f, B:100:0x0395, B:102:0x03a3, B:106:0x03b7, B:103:0x03ab, B:109:0x03be, B:112:0x03c5, B:113:0x03dd, B:36:0x014a, B:38:0x0157, B:40:0x0165, B:42:0x016b, B:46:0x0176, B:209:0x0687, B:211:0x0695, B:213:0x069e, B:224:0x06ce, B:214:0x06a6, B:216:0x06af, B:218:0x06b5, B:221:0x06c1, B:223:0x06c9, B:225:0x06d1, B:226:0x06dd, B:229:0x06e5, B:231:0x06f7, B:232:0x0702, B:234:0x070a, B:238:0x0732, B:240:0x074e, B:242:0x0763, B:244:0x077f, B:246:0x0794, B:248:0x07e1, B:250:0x07e7, B:256:0x0812, B:258:0x081a, B:259:0x0823, B:261:0x0829, B:262:0x082f, B:264:0x0846, B:266:0x0857, B:268:0x0869, B:271:0x0874, B:273:0x087a, B:274:0x088c, B:276:0x0892, B:278:0x08a2, B:280:0x08be, B:283:0x08da, B:285:0x0901, B:305:0x0a4b, B:308:0x0a5b, B:286:0x091a, B:288:0x092e, B:290:0x094b, B:292:0x0972, B:294:0x09a4, B:295:0x09b1, B:297:0x09c7, B:299:0x09e4, B:301:0x0a0b, B:303:0x0a3d, B:309:0x0a63, B:311:0x0aac, B:312:0x0abf, B:315:0x0ac7, B:318:0x0ae2, B:320:0x0afb, B:322:0x0b10, B:324:0x0b15, B:326:0x0b19, B:328:0x0b1d, B:330:0x0b27, B:332:0x0b30, B:334:0x0b34, B:336:0x0b3a, B:338:0x0b45, B:340:0x0b53, B:406:0x0db2, B:342:0x0b5a, B:344:0x0b76, B:349:0x0b93, B:351:0x0bb5, B:352:0x0bbd, B:354:0x0bc3, B:356:0x0bd5, B:362:0x0bfc, B:363:0x0c1f, B:365:0x0c2b, B:367:0x0c43, B:369:0x0c86, B:375:0x0ca2, B:377:0x0cad, B:379:0x0cb1, B:381:0x0cb5, B:383:0x0cb9, B:384:0x0cc5, B:385:0x0cca, B:387:0x0cd0, B:389:0x0ce6, B:390:0x0ceb, B:405:0x0daf, B:392:0x0d29, B:394:0x0d2d, B:398:0x0d41, B:400:0x0d5d, B:401:0x0d64, B:404:0x0da3, B:395:0x0d32, B:360:0x0be6, B:347:0x0b7c, B:407:0x0db8, B:409:0x0dc2, B:410:0x0dc8, B:411:0x0dd0, B:413:0x0dd6, B:414:0x0dea, B:416:0x0dfc, B:436:0x0e9c, B:438:0x0ea2, B:440:0x0eb7, B:443:0x0ebe, B:448:0x0ef3, B:444:0x0ec6, B:446:0x0ed4, B:447:0x0eda, B:449:0x0f02, B:417:0x0e17, B:419:0x0e1d, B:421:0x0e2d, B:423:0x0e34, B:429:0x0e4a, B:431:0x0e51, B:433:0x0e8d, B:435:0x0e94, B:434:0x0e91, B:430:0x0e4e, B:422:0x0e31, B:251:0x07f7, B:253:0x07fd, B:255:0x0803, B:245:0x0791, B:241:0x0760, B:235:0x0710, B:237:0x0716, B:450:0x0f1d), top: B:456:0x0017, inners: #1 }] */
                /* JADX WARN: Code duplicated, block: B:105:0x03b5  */
                /* JADX WARN: Code duplicated, block: B:108:0x03bc A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:109:0x03be A[Catch: all -> 0x0117, TryCatch #0 {all -> 0x0117, blocks: (B:3:0x0017, B:5:0x002f, B:8:0x0038, B:9:0x0050, B:12:0x006c, B:15:0x009a, B:17:0x00d7, B:20:0x00f0, B:22:0x00fa, B:206:0x066f, B:27:0x0128, B:30:0x013a, B:32:0x0140, B:47:0x0184, B:49:0x0196, B:52:0x01b6, B:54:0x01bc, B:56:0x01cc, B:58:0x01da, B:60:0x01ea, B:61:0x01f5, B:62:0x01f8, B:64:0x020e, B:115:0x03f8, B:116:0x0404, B:119:0x040e, B:125:0x0431, B:122:0x0420, B:147:0x04ab, B:149:0x04b7, B:152:0x04c8, B:154:0x04d9, B:156:0x04e5, B:172:0x0543, B:174:0x0549, B:175:0x0555, B:177:0x055b, B:179:0x056b, B:181:0x0575, B:182:0x0588, B:184:0x058e, B:185:0x05a7, B:187:0x05ad, B:188:0x05cb, B:189:0x05d9, B:193:0x0600, B:190:0x05df, B:192:0x05eb, B:194:0x0607, B:195:0x061d, B:197:0x0623, B:199:0x0636, B:200:0x0643, B:201:0x0647, B:203:0x064d, B:205:0x0659, B:160:0x04f7, B:162:0x0503, B:165:0x0516, B:167:0x0527, B:169:0x0533, B:129:0x0439, B:131:0x0445, B:133:0x0451, B:146:0x0495, B:138:0x046d, B:141:0x047f, B:143:0x0485, B:145:0x048f, B:72:0x0238, B:75:0x0242, B:77:0x0250, B:81:0x0297, B:78:0x026d, B:80:0x027d, B:85:0x02a4, B:87:0x02ce, B:88:0x02f6, B:90:0x032b, B:92:0x0331, B:95:0x033d, B:97:0x0372, B:98:0x038f, B:100:0x0395, B:102:0x03a3, B:106:0x03b7, B:103:0x03ab, B:109:0x03be, B:112:0x03c5, B:113:0x03dd, B:36:0x014a, B:38:0x0157, B:40:0x0165, B:42:0x016b, B:46:0x0176, B:209:0x0687, B:211:0x0695, B:213:0x069e, B:224:0x06ce, B:214:0x06a6, B:216:0x06af, B:218:0x06b5, B:221:0x06c1, B:223:0x06c9, B:225:0x06d1, B:226:0x06dd, B:229:0x06e5, B:231:0x06f7, B:232:0x0702, B:234:0x070a, B:238:0x0732, B:240:0x074e, B:242:0x0763, B:244:0x077f, B:246:0x0794, B:248:0x07e1, B:250:0x07e7, B:256:0x0812, B:258:0x081a, B:259:0x0823, B:261:0x0829, B:262:0x082f, B:264:0x0846, B:266:0x0857, B:268:0x0869, B:271:0x0874, B:273:0x087a, B:274:0x088c, B:276:0x0892, B:278:0x08a2, B:280:0x08be, B:283:0x08da, B:285:0x0901, B:305:0x0a4b, B:308:0x0a5b, B:286:0x091a, B:288:0x092e, B:290:0x094b, B:292:0x0972, B:294:0x09a4, B:295:0x09b1, B:297:0x09c7, B:299:0x09e4, B:301:0x0a0b, B:303:0x0a3d, B:309:0x0a63, B:311:0x0aac, B:312:0x0abf, B:315:0x0ac7, B:318:0x0ae2, B:320:0x0afb, B:322:0x0b10, B:324:0x0b15, B:326:0x0b19, B:328:0x0b1d, B:330:0x0b27, B:332:0x0b30, B:334:0x0b34, B:336:0x0b3a, B:338:0x0b45, B:340:0x0b53, B:406:0x0db2, B:342:0x0b5a, B:344:0x0b76, B:349:0x0b93, B:351:0x0bb5, B:352:0x0bbd, B:354:0x0bc3, B:356:0x0bd5, B:362:0x0bfc, B:363:0x0c1f, B:365:0x0c2b, B:367:0x0c43, B:369:0x0c86, B:375:0x0ca2, B:377:0x0cad, B:379:0x0cb1, B:381:0x0cb5, B:383:0x0cb9, B:384:0x0cc5, B:385:0x0cca, B:387:0x0cd0, B:389:0x0ce6, B:390:0x0ceb, B:405:0x0daf, B:392:0x0d29, B:394:0x0d2d, B:398:0x0d41, B:400:0x0d5d, B:401:0x0d64, B:404:0x0da3, B:395:0x0d32, B:360:0x0be6, B:347:0x0b7c, B:407:0x0db8, B:409:0x0dc2, B:410:0x0dc8, B:411:0x0dd0, B:413:0x0dd6, B:414:0x0dea, B:416:0x0dfc, B:436:0x0e9c, B:438:0x0ea2, B:440:0x0eb7, B:443:0x0ebe, B:448:0x0ef3, B:444:0x0ec6, B:446:0x0ed4, B:447:0x0eda, B:449:0x0f02, B:417:0x0e17, B:419:0x0e1d, B:421:0x0e2d, B:423:0x0e34, B:429:0x0e4a, B:431:0x0e51, B:433:0x0e8d, B:435:0x0e94, B:434:0x0e91, B:430:0x0e4e, B:422:0x0e31, B:251:0x07f7, B:253:0x07fd, B:255:0x0803, B:245:0x0791, B:241:0x0760, B:235:0x0710, B:237:0x0716, B:450:0x0f1d), top: B:456:0x0017, inners: #1 }] */
                /* JADX WARN: Code duplicated, block: B:110:0x03c2  */
                /* JADX WARN: Code duplicated, block: B:111:0x03c3 A[DONT_INVERT, PHI: r2
  0x03c3: PHI (r2v86 com.google.android.gms.internal.measurement.zzhv) = (r2v85 com.google.android.gms.internal.measurement.zzhv), (r2v93 com.google.android.gms.internal.measurement.zzhv) binds: [B:107:0x03ba, B:110:0x03c2] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Code duplicated, block: B:112:0x03c5 A[Catch: all -> 0x0117, TryCatch #0 {all -> 0x0117, blocks: (B:3:0x0017, B:5:0x002f, B:8:0x0038, B:9:0x0050, B:12:0x006c, B:15:0x009a, B:17:0x00d7, B:20:0x00f0, B:22:0x00fa, B:206:0x066f, B:27:0x0128, B:30:0x013a, B:32:0x0140, B:47:0x0184, B:49:0x0196, B:52:0x01b6, B:54:0x01bc, B:56:0x01cc, B:58:0x01da, B:60:0x01ea, B:61:0x01f5, B:62:0x01f8, B:64:0x020e, B:115:0x03f8, B:116:0x0404, B:119:0x040e, B:125:0x0431, B:122:0x0420, B:147:0x04ab, B:149:0x04b7, B:152:0x04c8, B:154:0x04d9, B:156:0x04e5, B:172:0x0543, B:174:0x0549, B:175:0x0555, B:177:0x055b, B:179:0x056b, B:181:0x0575, B:182:0x0588, B:184:0x058e, B:185:0x05a7, B:187:0x05ad, B:188:0x05cb, B:189:0x05d9, B:193:0x0600, B:190:0x05df, B:192:0x05eb, B:194:0x0607, B:195:0x061d, B:197:0x0623, B:199:0x0636, B:200:0x0643, B:201:0x0647, B:203:0x064d, B:205:0x0659, B:160:0x04f7, B:162:0x0503, B:165:0x0516, B:167:0x0527, B:169:0x0533, B:129:0x0439, B:131:0x0445, B:133:0x0451, B:146:0x0495, B:138:0x046d, B:141:0x047f, B:143:0x0485, B:145:0x048f, B:72:0x0238, B:75:0x0242, B:77:0x0250, B:81:0x0297, B:78:0x026d, B:80:0x027d, B:85:0x02a4, B:87:0x02ce, B:88:0x02f6, B:90:0x032b, B:92:0x0331, B:95:0x033d, B:97:0x0372, B:98:0x038f, B:100:0x0395, B:102:0x03a3, B:106:0x03b7, B:103:0x03ab, B:109:0x03be, B:112:0x03c5, B:113:0x03dd, B:36:0x014a, B:38:0x0157, B:40:0x0165, B:42:0x016b, B:46:0x0176, B:209:0x0687, B:211:0x0695, B:213:0x069e, B:224:0x06ce, B:214:0x06a6, B:216:0x06af, B:218:0x06b5, B:221:0x06c1, B:223:0x06c9, B:225:0x06d1, B:226:0x06dd, B:229:0x06e5, B:231:0x06f7, B:232:0x0702, B:234:0x070a, B:238:0x0732, B:240:0x074e, B:242:0x0763, B:244:0x077f, B:246:0x0794, B:248:0x07e1, B:250:0x07e7, B:256:0x0812, B:258:0x081a, B:259:0x0823, B:261:0x0829, B:262:0x082f, B:264:0x0846, B:266:0x0857, B:268:0x0869, B:271:0x0874, B:273:0x087a, B:274:0x088c, B:276:0x0892, B:278:0x08a2, B:280:0x08be, B:283:0x08da, B:285:0x0901, B:305:0x0a4b, B:308:0x0a5b, B:286:0x091a, B:288:0x092e, B:290:0x094b, B:292:0x0972, B:294:0x09a4, B:295:0x09b1, B:297:0x09c7, B:299:0x09e4, B:301:0x0a0b, B:303:0x0a3d, B:309:0x0a63, B:311:0x0aac, B:312:0x0abf, B:315:0x0ac7, B:318:0x0ae2, B:320:0x0afb, B:322:0x0b10, B:324:0x0b15, B:326:0x0b19, B:328:0x0b1d, B:330:0x0b27, B:332:0x0b30, B:334:0x0b34, B:336:0x0b3a, B:338:0x0b45, B:340:0x0b53, B:406:0x0db2, B:342:0x0b5a, B:344:0x0b76, B:349:0x0b93, B:351:0x0bb5, B:352:0x0bbd, B:354:0x0bc3, B:356:0x0bd5, B:362:0x0bfc, B:363:0x0c1f, B:365:0x0c2b, B:367:0x0c43, B:369:0x0c86, B:375:0x0ca2, B:377:0x0cad, B:379:0x0cb1, B:381:0x0cb5, B:383:0x0cb9, B:384:0x0cc5, B:385:0x0cca, B:387:0x0cd0, B:389:0x0ce6, B:390:0x0ceb, B:405:0x0daf, B:392:0x0d29, B:394:0x0d2d, B:398:0x0d41, B:400:0x0d5d, B:401:0x0d64, B:404:0x0da3, B:395:0x0d32, B:360:0x0be6, B:347:0x0b7c, B:407:0x0db8, B:409:0x0dc2, B:410:0x0dc8, B:411:0x0dd0, B:413:0x0dd6, B:414:0x0dea, B:416:0x0dfc, B:436:0x0e9c, B:438:0x0ea2, B:440:0x0eb7, B:443:0x0ebe, B:448:0x0ef3, B:444:0x0ec6, B:446:0x0ed4, B:447:0x0eda, B:449:0x0f02, B:417:0x0e17, B:419:0x0e1d, B:421:0x0e2d, B:423:0x0e34, B:429:0x0e4a, B:431:0x0e51, B:433:0x0e8d, B:435:0x0e94, B:434:0x0e91, B:430:0x0e4e, B:422:0x0e31, B:251:0x07f7, B:253:0x07fd, B:255:0x0803, B:245:0x0791, B:241:0x0760, B:235:0x0710, B:237:0x0716, B:450:0x0f1d), top: B:456:0x0017, inners: #1 }] */
                /* JADX WARN: Code duplicated, block: B:113:0x03dd A[Catch: all -> 0x0117, TryCatch #0 {all -> 0x0117, blocks: (B:3:0x0017, B:5:0x002f, B:8:0x0038, B:9:0x0050, B:12:0x006c, B:15:0x009a, B:17:0x00d7, B:20:0x00f0, B:22:0x00fa, B:206:0x066f, B:27:0x0128, B:30:0x013a, B:32:0x0140, B:47:0x0184, B:49:0x0196, B:52:0x01b6, B:54:0x01bc, B:56:0x01cc, B:58:0x01da, B:60:0x01ea, B:61:0x01f5, B:62:0x01f8, B:64:0x020e, B:115:0x03f8, B:116:0x0404, B:119:0x040e, B:125:0x0431, B:122:0x0420, B:147:0x04ab, B:149:0x04b7, B:152:0x04c8, B:154:0x04d9, B:156:0x04e5, B:172:0x0543, B:174:0x0549, B:175:0x0555, B:177:0x055b, B:179:0x056b, B:181:0x0575, B:182:0x0588, B:184:0x058e, B:185:0x05a7, B:187:0x05ad, B:188:0x05cb, B:189:0x05d9, B:193:0x0600, B:190:0x05df, B:192:0x05eb, B:194:0x0607, B:195:0x061d, B:197:0x0623, B:199:0x0636, B:200:0x0643, B:201:0x0647, B:203:0x064d, B:205:0x0659, B:160:0x04f7, B:162:0x0503, B:165:0x0516, B:167:0x0527, B:169:0x0533, B:129:0x0439, B:131:0x0445, B:133:0x0451, B:146:0x0495, B:138:0x046d, B:141:0x047f, B:143:0x0485, B:145:0x048f, B:72:0x0238, B:75:0x0242, B:77:0x0250, B:81:0x0297, B:78:0x026d, B:80:0x027d, B:85:0x02a4, B:87:0x02ce, B:88:0x02f6, B:90:0x032b, B:92:0x0331, B:95:0x033d, B:97:0x0372, B:98:0x038f, B:100:0x0395, B:102:0x03a3, B:106:0x03b7, B:103:0x03ab, B:109:0x03be, B:112:0x03c5, B:113:0x03dd, B:36:0x014a, B:38:0x0157, B:40:0x0165, B:42:0x016b, B:46:0x0176, B:209:0x0687, B:211:0x0695, B:213:0x069e, B:224:0x06ce, B:214:0x06a6, B:216:0x06af, B:218:0x06b5, B:221:0x06c1, B:223:0x06c9, B:225:0x06d1, B:226:0x06dd, B:229:0x06e5, B:231:0x06f7, B:232:0x0702, B:234:0x070a, B:238:0x0732, B:240:0x074e, B:242:0x0763, B:244:0x077f, B:246:0x0794, B:248:0x07e1, B:250:0x07e7, B:256:0x0812, B:258:0x081a, B:259:0x0823, B:261:0x0829, B:262:0x082f, B:264:0x0846, B:266:0x0857, B:268:0x0869, B:271:0x0874, B:273:0x087a, B:274:0x088c, B:276:0x0892, B:278:0x08a2, B:280:0x08be, B:283:0x08da, B:285:0x0901, B:305:0x0a4b, B:308:0x0a5b, B:286:0x091a, B:288:0x092e, B:290:0x094b, B:292:0x0972, B:294:0x09a4, B:295:0x09b1, B:297:0x09c7, B:299:0x09e4, B:301:0x0a0b, B:303:0x0a3d, B:309:0x0a63, B:311:0x0aac, B:312:0x0abf, B:315:0x0ac7, B:318:0x0ae2, B:320:0x0afb, B:322:0x0b10, B:324:0x0b15, B:326:0x0b19, B:328:0x0b1d, B:330:0x0b27, B:332:0x0b30, B:334:0x0b34, B:336:0x0b3a, B:338:0x0b45, B:340:0x0b53, B:406:0x0db2, B:342:0x0b5a, B:344:0x0b76, B:349:0x0b93, B:351:0x0bb5, B:352:0x0bbd, B:354:0x0bc3, B:356:0x0bd5, B:362:0x0bfc, B:363:0x0c1f, B:365:0x0c2b, B:367:0x0c43, B:369:0x0c86, B:375:0x0ca2, B:377:0x0cad, B:379:0x0cb1, B:381:0x0cb5, B:383:0x0cb9, B:384:0x0cc5, B:385:0x0cca, B:387:0x0cd0, B:389:0x0ce6, B:390:0x0ceb, B:405:0x0daf, B:392:0x0d29, B:394:0x0d2d, B:398:0x0d41, B:400:0x0d5d, B:401:0x0d64, B:404:0x0da3, B:395:0x0d32, B:360:0x0be6, B:347:0x0b7c, B:407:0x0db8, B:409:0x0dc2, B:410:0x0dc8, B:411:0x0dd0, B:413:0x0dd6, B:414:0x0dea, B:416:0x0dfc, B:436:0x0e9c, B:438:0x0ea2, B:440:0x0eb7, B:443:0x0ebe, B:448:0x0ef3, B:444:0x0ec6, B:446:0x0ed4, B:447:0x0eda, B:449:0x0f02, B:417:0x0e17, B:419:0x0e1d, B:421:0x0e2d, B:423:0x0e34, B:429:0x0e4a, B:431:0x0e51, B:433:0x0e8d, B:435:0x0e94, B:434:0x0e91, B:430:0x0e4e, B:422:0x0e31, B:251:0x07f7, B:253:0x07fd, B:255:0x0803, B:245:0x0791, B:241:0x0760, B:235:0x0710, B:237:0x0716, B:450:0x0f1d), top: B:456:0x0017, inners: #1 }] */
                /* JADX WARN: Code duplicated, block: B:159:0x04f4  */
                /* JADX WARN: Code duplicated, block: B:214:0x06a6 A[Catch: all -> 0x0117, TryCatch #0 {all -> 0x0117, blocks: (B:3:0x0017, B:5:0x002f, B:8:0x0038, B:9:0x0050, B:12:0x006c, B:15:0x009a, B:17:0x00d7, B:20:0x00f0, B:22:0x00fa, B:206:0x066f, B:27:0x0128, B:30:0x013a, B:32:0x0140, B:47:0x0184, B:49:0x0196, B:52:0x01b6, B:54:0x01bc, B:56:0x01cc, B:58:0x01da, B:60:0x01ea, B:61:0x01f5, B:62:0x01f8, B:64:0x020e, B:115:0x03f8, B:116:0x0404, B:119:0x040e, B:125:0x0431, B:122:0x0420, B:147:0x04ab, B:149:0x04b7, B:152:0x04c8, B:154:0x04d9, B:156:0x04e5, B:172:0x0543, B:174:0x0549, B:175:0x0555, B:177:0x055b, B:179:0x056b, B:181:0x0575, B:182:0x0588, B:184:0x058e, B:185:0x05a7, B:187:0x05ad, B:188:0x05cb, B:189:0x05d9, B:193:0x0600, B:190:0x05df, B:192:0x05eb, B:194:0x0607, B:195:0x061d, B:197:0x0623, B:199:0x0636, B:200:0x0643, B:201:0x0647, B:203:0x064d, B:205:0x0659, B:160:0x04f7, B:162:0x0503, B:165:0x0516, B:167:0x0527, B:169:0x0533, B:129:0x0439, B:131:0x0445, B:133:0x0451, B:146:0x0495, B:138:0x046d, B:141:0x047f, B:143:0x0485, B:145:0x048f, B:72:0x0238, B:75:0x0242, B:77:0x0250, B:81:0x0297, B:78:0x026d, B:80:0x027d, B:85:0x02a4, B:87:0x02ce, B:88:0x02f6, B:90:0x032b, B:92:0x0331, B:95:0x033d, B:97:0x0372, B:98:0x038f, B:100:0x0395, B:102:0x03a3, B:106:0x03b7, B:103:0x03ab, B:109:0x03be, B:112:0x03c5, B:113:0x03dd, B:36:0x014a, B:38:0x0157, B:40:0x0165, B:42:0x016b, B:46:0x0176, B:209:0x0687, B:211:0x0695, B:213:0x069e, B:224:0x06ce, B:214:0x06a6, B:216:0x06af, B:218:0x06b5, B:221:0x06c1, B:223:0x06c9, B:225:0x06d1, B:226:0x06dd, B:229:0x06e5, B:231:0x06f7, B:232:0x0702, B:234:0x070a, B:238:0x0732, B:240:0x074e, B:242:0x0763, B:244:0x077f, B:246:0x0794, B:248:0x07e1, B:250:0x07e7, B:256:0x0812, B:258:0x081a, B:259:0x0823, B:261:0x0829, B:262:0x082f, B:264:0x0846, B:266:0x0857, B:268:0x0869, B:271:0x0874, B:273:0x087a, B:274:0x088c, B:276:0x0892, B:278:0x08a2, B:280:0x08be, B:283:0x08da, B:285:0x0901, B:305:0x0a4b, B:308:0x0a5b, B:286:0x091a, B:288:0x092e, B:290:0x094b, B:292:0x0972, B:294:0x09a4, B:295:0x09b1, B:297:0x09c7, B:299:0x09e4, B:301:0x0a0b, B:303:0x0a3d, B:309:0x0a63, B:311:0x0aac, B:312:0x0abf, B:315:0x0ac7, B:318:0x0ae2, B:320:0x0afb, B:322:0x0b10, B:324:0x0b15, B:326:0x0b19, B:328:0x0b1d, B:330:0x0b27, B:332:0x0b30, B:334:0x0b34, B:336:0x0b3a, B:338:0x0b45, B:340:0x0b53, B:406:0x0db2, B:342:0x0b5a, B:344:0x0b76, B:349:0x0b93, B:351:0x0bb5, B:352:0x0bbd, B:354:0x0bc3, B:356:0x0bd5, B:362:0x0bfc, B:363:0x0c1f, B:365:0x0c2b, B:367:0x0c43, B:369:0x0c86, B:375:0x0ca2, B:377:0x0cad, B:379:0x0cb1, B:381:0x0cb5, B:383:0x0cb9, B:384:0x0cc5, B:385:0x0cca, B:387:0x0cd0, B:389:0x0ce6, B:390:0x0ceb, B:405:0x0daf, B:392:0x0d29, B:394:0x0d2d, B:398:0x0d41, B:400:0x0d5d, B:401:0x0d64, B:404:0x0da3, B:395:0x0d32, B:360:0x0be6, B:347:0x0b7c, B:407:0x0db8, B:409:0x0dc2, B:410:0x0dc8, B:411:0x0dd0, B:413:0x0dd6, B:414:0x0dea, B:416:0x0dfc, B:436:0x0e9c, B:438:0x0ea2, B:440:0x0eb7, B:443:0x0ebe, B:448:0x0ef3, B:444:0x0ec6, B:446:0x0ed4, B:447:0x0eda, B:449:0x0f02, B:417:0x0e17, B:419:0x0e1d, B:421:0x0e2d, B:423:0x0e34, B:429:0x0e4a, B:431:0x0e51, B:433:0x0e8d, B:435:0x0e94, B:434:0x0e91, B:430:0x0e4e, B:422:0x0e31, B:251:0x07f7, B:253:0x07fd, B:255:0x0803, B:245:0x0791, B:241:0x0760, B:235:0x0710, B:237:0x0716, B:450:0x0f1d), top: B:456:0x0017, inners: #1 }] */
                /* JADX WARN: Code duplicated, block: B:216:0x06af A[Catch: all -> 0x0117, TryCatch #0 {all -> 0x0117, blocks: (B:3:0x0017, B:5:0x002f, B:8:0x0038, B:9:0x0050, B:12:0x006c, B:15:0x009a, B:17:0x00d7, B:20:0x00f0, B:22:0x00fa, B:206:0x066f, B:27:0x0128, B:30:0x013a, B:32:0x0140, B:47:0x0184, B:49:0x0196, B:52:0x01b6, B:54:0x01bc, B:56:0x01cc, B:58:0x01da, B:60:0x01ea, B:61:0x01f5, B:62:0x01f8, B:64:0x020e, B:115:0x03f8, B:116:0x0404, B:119:0x040e, B:125:0x0431, B:122:0x0420, B:147:0x04ab, B:149:0x04b7, B:152:0x04c8, B:154:0x04d9, B:156:0x04e5, B:172:0x0543, B:174:0x0549, B:175:0x0555, B:177:0x055b, B:179:0x056b, B:181:0x0575, B:182:0x0588, B:184:0x058e, B:185:0x05a7, B:187:0x05ad, B:188:0x05cb, B:189:0x05d9, B:193:0x0600, B:190:0x05df, B:192:0x05eb, B:194:0x0607, B:195:0x061d, B:197:0x0623, B:199:0x0636, B:200:0x0643, B:201:0x0647, B:203:0x064d, B:205:0x0659, B:160:0x04f7, B:162:0x0503, B:165:0x0516, B:167:0x0527, B:169:0x0533, B:129:0x0439, B:131:0x0445, B:133:0x0451, B:146:0x0495, B:138:0x046d, B:141:0x047f, B:143:0x0485, B:145:0x048f, B:72:0x0238, B:75:0x0242, B:77:0x0250, B:81:0x0297, B:78:0x026d, B:80:0x027d, B:85:0x02a4, B:87:0x02ce, B:88:0x02f6, B:90:0x032b, B:92:0x0331, B:95:0x033d, B:97:0x0372, B:98:0x038f, B:100:0x0395, B:102:0x03a3, B:106:0x03b7, B:103:0x03ab, B:109:0x03be, B:112:0x03c5, B:113:0x03dd, B:36:0x014a, B:38:0x0157, B:40:0x0165, B:42:0x016b, B:46:0x0176, B:209:0x0687, B:211:0x0695, B:213:0x069e, B:224:0x06ce, B:214:0x06a6, B:216:0x06af, B:218:0x06b5, B:221:0x06c1, B:223:0x06c9, B:225:0x06d1, B:226:0x06dd, B:229:0x06e5, B:231:0x06f7, B:232:0x0702, B:234:0x070a, B:238:0x0732, B:240:0x074e, B:242:0x0763, B:244:0x077f, B:246:0x0794, B:248:0x07e1, B:250:0x07e7, B:256:0x0812, B:258:0x081a, B:259:0x0823, B:261:0x0829, B:262:0x082f, B:264:0x0846, B:266:0x0857, B:268:0x0869, B:271:0x0874, B:273:0x087a, B:274:0x088c, B:276:0x0892, B:278:0x08a2, B:280:0x08be, B:283:0x08da, B:285:0x0901, B:305:0x0a4b, B:308:0x0a5b, B:286:0x091a, B:288:0x092e, B:290:0x094b, B:292:0x0972, B:294:0x09a4, B:295:0x09b1, B:297:0x09c7, B:299:0x09e4, B:301:0x0a0b, B:303:0x0a3d, B:309:0x0a63, B:311:0x0aac, B:312:0x0abf, B:315:0x0ac7, B:318:0x0ae2, B:320:0x0afb, B:322:0x0b10, B:324:0x0b15, B:326:0x0b19, B:328:0x0b1d, B:330:0x0b27, B:332:0x0b30, B:334:0x0b34, B:336:0x0b3a, B:338:0x0b45, B:340:0x0b53, B:406:0x0db2, B:342:0x0b5a, B:344:0x0b76, B:349:0x0b93, B:351:0x0bb5, B:352:0x0bbd, B:354:0x0bc3, B:356:0x0bd5, B:362:0x0bfc, B:363:0x0c1f, B:365:0x0c2b, B:367:0x0c43, B:369:0x0c86, B:375:0x0ca2, B:377:0x0cad, B:379:0x0cb1, B:381:0x0cb5, B:383:0x0cb9, B:384:0x0cc5, B:385:0x0cca, B:387:0x0cd0, B:389:0x0ce6, B:390:0x0ceb, B:405:0x0daf, B:392:0x0d29, B:394:0x0d2d, B:398:0x0d41, B:400:0x0d5d, B:401:0x0d64, B:404:0x0da3, B:395:0x0d32, B:360:0x0be6, B:347:0x0b7c, B:407:0x0db8, B:409:0x0dc2, B:410:0x0dc8, B:411:0x0dd0, B:413:0x0dd6, B:414:0x0dea, B:416:0x0dfc, B:436:0x0e9c, B:438:0x0ea2, B:440:0x0eb7, B:443:0x0ebe, B:448:0x0ef3, B:444:0x0ec6, B:446:0x0ed4, B:447:0x0eda, B:449:0x0f02, B:417:0x0e17, B:419:0x0e1d, B:421:0x0e2d, B:423:0x0e34, B:429:0x0e4a, B:431:0x0e51, B:433:0x0e8d, B:435:0x0e94, B:434:0x0e91, B:430:0x0e4e, B:422:0x0e31, B:251:0x07f7, B:253:0x07fd, B:255:0x0803, B:245:0x0791, B:241:0x0760, B:235:0x0710, B:237:0x0716, B:450:0x0f1d), top: B:456:0x0017, inners: #1 }] */
                /* JADX WARN: Code duplicated, block: B:218:0x06b5 A[Catch: all -> 0x0117, TryCatch #0 {all -> 0x0117, blocks: (B:3:0x0017, B:5:0x002f, B:8:0x0038, B:9:0x0050, B:12:0x006c, B:15:0x009a, B:17:0x00d7, B:20:0x00f0, B:22:0x00fa, B:206:0x066f, B:27:0x0128, B:30:0x013a, B:32:0x0140, B:47:0x0184, B:49:0x0196, B:52:0x01b6, B:54:0x01bc, B:56:0x01cc, B:58:0x01da, B:60:0x01ea, B:61:0x01f5, B:62:0x01f8, B:64:0x020e, B:115:0x03f8, B:116:0x0404, B:119:0x040e, B:125:0x0431, B:122:0x0420, B:147:0x04ab, B:149:0x04b7, B:152:0x04c8, B:154:0x04d9, B:156:0x04e5, B:172:0x0543, B:174:0x0549, B:175:0x0555, B:177:0x055b, B:179:0x056b, B:181:0x0575, B:182:0x0588, B:184:0x058e, B:185:0x05a7, B:187:0x05ad, B:188:0x05cb, B:189:0x05d9, B:193:0x0600, B:190:0x05df, B:192:0x05eb, B:194:0x0607, B:195:0x061d, B:197:0x0623, B:199:0x0636, B:200:0x0643, B:201:0x0647, B:203:0x064d, B:205:0x0659, B:160:0x04f7, B:162:0x0503, B:165:0x0516, B:167:0x0527, B:169:0x0533, B:129:0x0439, B:131:0x0445, B:133:0x0451, B:146:0x0495, B:138:0x046d, B:141:0x047f, B:143:0x0485, B:145:0x048f, B:72:0x0238, B:75:0x0242, B:77:0x0250, B:81:0x0297, B:78:0x026d, B:80:0x027d, B:85:0x02a4, B:87:0x02ce, B:88:0x02f6, B:90:0x032b, B:92:0x0331, B:95:0x033d, B:97:0x0372, B:98:0x038f, B:100:0x0395, B:102:0x03a3, B:106:0x03b7, B:103:0x03ab, B:109:0x03be, B:112:0x03c5, B:113:0x03dd, B:36:0x014a, B:38:0x0157, B:40:0x0165, B:42:0x016b, B:46:0x0176, B:209:0x0687, B:211:0x0695, B:213:0x069e, B:224:0x06ce, B:214:0x06a6, B:216:0x06af, B:218:0x06b5, B:221:0x06c1, B:223:0x06c9, B:225:0x06d1, B:226:0x06dd, B:229:0x06e5, B:231:0x06f7, B:232:0x0702, B:234:0x070a, B:238:0x0732, B:240:0x074e, B:242:0x0763, B:244:0x077f, B:246:0x0794, B:248:0x07e1, B:250:0x07e7, B:256:0x0812, B:258:0x081a, B:259:0x0823, B:261:0x0829, B:262:0x082f, B:264:0x0846, B:266:0x0857, B:268:0x0869, B:271:0x0874, B:273:0x087a, B:274:0x088c, B:276:0x0892, B:278:0x08a2, B:280:0x08be, B:283:0x08da, B:285:0x0901, B:305:0x0a4b, B:308:0x0a5b, B:286:0x091a, B:288:0x092e, B:290:0x094b, B:292:0x0972, B:294:0x09a4, B:295:0x09b1, B:297:0x09c7, B:299:0x09e4, B:301:0x0a0b, B:303:0x0a3d, B:309:0x0a63, B:311:0x0aac, B:312:0x0abf, B:315:0x0ac7, B:318:0x0ae2, B:320:0x0afb, B:322:0x0b10, B:324:0x0b15, B:326:0x0b19, B:328:0x0b1d, B:330:0x0b27, B:332:0x0b30, B:334:0x0b34, B:336:0x0b3a, B:338:0x0b45, B:340:0x0b53, B:406:0x0db2, B:342:0x0b5a, B:344:0x0b76, B:349:0x0b93, B:351:0x0bb5, B:352:0x0bbd, B:354:0x0bc3, B:356:0x0bd5, B:362:0x0bfc, B:363:0x0c1f, B:365:0x0c2b, B:367:0x0c43, B:369:0x0c86, B:375:0x0ca2, B:377:0x0cad, B:379:0x0cb1, B:381:0x0cb5, B:383:0x0cb9, B:384:0x0cc5, B:385:0x0cca, B:387:0x0cd0, B:389:0x0ce6, B:390:0x0ceb, B:405:0x0daf, B:392:0x0d29, B:394:0x0d2d, B:398:0x0d41, B:400:0x0d5d, B:401:0x0d64, B:404:0x0da3, B:395:0x0d32, B:360:0x0be6, B:347:0x0b7c, B:407:0x0db8, B:409:0x0dc2, B:410:0x0dc8, B:411:0x0dd0, B:413:0x0dd6, B:414:0x0dea, B:416:0x0dfc, B:436:0x0e9c, B:438:0x0ea2, B:440:0x0eb7, B:443:0x0ebe, B:448:0x0ef3, B:444:0x0ec6, B:446:0x0ed4, B:447:0x0eda, B:449:0x0f02, B:417:0x0e17, B:419:0x0e1d, B:421:0x0e2d, B:423:0x0e34, B:429:0x0e4a, B:431:0x0e51, B:433:0x0e8d, B:435:0x0e94, B:434:0x0e91, B:430:0x0e4e, B:422:0x0e31, B:251:0x07f7, B:253:0x07fd, B:255:0x0803, B:245:0x0791, B:241:0x0760, B:235:0x0710, B:237:0x0716, B:450:0x0f1d), top: B:456:0x0017, inners: #1 }] */
                /* JADX WARN: Code duplicated, block: B:219:0x06be  */
                /* JADX WARN: Code duplicated, block: B:45:0x0174  */
                /* JADX WARN: Code duplicated, block: B:483:0x029e A[EDGE_INSN: B:483:0x029e->B:82:0x029e BREAK  A[LOOP:9: B:72:0x0238->B:81:0x0297], SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:486:0x0297 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:490:0x03b7 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:494:0x06ce A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:70:0x022a  */
                /* JADX WARN: Code duplicated, block: B:75:0x0242 A[Catch: all -> 0x0117, TRY_ENTER, TryCatch #0 {all -> 0x0117, blocks: (B:3:0x0017, B:5:0x002f, B:8:0x0038, B:9:0x0050, B:12:0x006c, B:15:0x009a, B:17:0x00d7, B:20:0x00f0, B:22:0x00fa, B:206:0x066f, B:27:0x0128, B:30:0x013a, B:32:0x0140, B:47:0x0184, B:49:0x0196, B:52:0x01b6, B:54:0x01bc, B:56:0x01cc, B:58:0x01da, B:60:0x01ea, B:61:0x01f5, B:62:0x01f8, B:64:0x020e, B:115:0x03f8, B:116:0x0404, B:119:0x040e, B:125:0x0431, B:122:0x0420, B:147:0x04ab, B:149:0x04b7, B:152:0x04c8, B:154:0x04d9, B:156:0x04e5, B:172:0x0543, B:174:0x0549, B:175:0x0555, B:177:0x055b, B:179:0x056b, B:181:0x0575, B:182:0x0588, B:184:0x058e, B:185:0x05a7, B:187:0x05ad, B:188:0x05cb, B:189:0x05d9, B:193:0x0600, B:190:0x05df, B:192:0x05eb, B:194:0x0607, B:195:0x061d, B:197:0x0623, B:199:0x0636, B:200:0x0643, B:201:0x0647, B:203:0x064d, B:205:0x0659, B:160:0x04f7, B:162:0x0503, B:165:0x0516, B:167:0x0527, B:169:0x0533, B:129:0x0439, B:131:0x0445, B:133:0x0451, B:146:0x0495, B:138:0x046d, B:141:0x047f, B:143:0x0485, B:145:0x048f, B:72:0x0238, B:75:0x0242, B:77:0x0250, B:81:0x0297, B:78:0x026d, B:80:0x027d, B:85:0x02a4, B:87:0x02ce, B:88:0x02f6, B:90:0x032b, B:92:0x0331, B:95:0x033d, B:97:0x0372, B:98:0x038f, B:100:0x0395, B:102:0x03a3, B:106:0x03b7, B:103:0x03ab, B:109:0x03be, B:112:0x03c5, B:113:0x03dd, B:36:0x014a, B:38:0x0157, B:40:0x0165, B:42:0x016b, B:46:0x0176, B:209:0x0687, B:211:0x0695, B:213:0x069e, B:224:0x06ce, B:214:0x06a6, B:216:0x06af, B:218:0x06b5, B:221:0x06c1, B:223:0x06c9, B:225:0x06d1, B:226:0x06dd, B:229:0x06e5, B:231:0x06f7, B:232:0x0702, B:234:0x070a, B:238:0x0732, B:240:0x074e, B:242:0x0763, B:244:0x077f, B:246:0x0794, B:248:0x07e1, B:250:0x07e7, B:256:0x0812, B:258:0x081a, B:259:0x0823, B:261:0x0829, B:262:0x082f, B:264:0x0846, B:266:0x0857, B:268:0x0869, B:271:0x0874, B:273:0x087a, B:274:0x088c, B:276:0x0892, B:278:0x08a2, B:280:0x08be, B:283:0x08da, B:285:0x0901, B:305:0x0a4b, B:308:0x0a5b, B:286:0x091a, B:288:0x092e, B:290:0x094b, B:292:0x0972, B:294:0x09a4, B:295:0x09b1, B:297:0x09c7, B:299:0x09e4, B:301:0x0a0b, B:303:0x0a3d, B:309:0x0a63, B:311:0x0aac, B:312:0x0abf, B:315:0x0ac7, B:318:0x0ae2, B:320:0x0afb, B:322:0x0b10, B:324:0x0b15, B:326:0x0b19, B:328:0x0b1d, B:330:0x0b27, B:332:0x0b30, B:334:0x0b34, B:336:0x0b3a, B:338:0x0b45, B:340:0x0b53, B:406:0x0db2, B:342:0x0b5a, B:344:0x0b76, B:349:0x0b93, B:351:0x0bb5, B:352:0x0bbd, B:354:0x0bc3, B:356:0x0bd5, B:362:0x0bfc, B:363:0x0c1f, B:365:0x0c2b, B:367:0x0c43, B:369:0x0c86, B:375:0x0ca2, B:377:0x0cad, B:379:0x0cb1, B:381:0x0cb5, B:383:0x0cb9, B:384:0x0cc5, B:385:0x0cca, B:387:0x0cd0, B:389:0x0ce6, B:390:0x0ceb, B:405:0x0daf, B:392:0x0d29, B:394:0x0d2d, B:398:0x0d41, B:400:0x0d5d, B:401:0x0d64, B:404:0x0da3, B:395:0x0d32, B:360:0x0be6, B:347:0x0b7c, B:407:0x0db8, B:409:0x0dc2, B:410:0x0dc8, B:411:0x0dd0, B:413:0x0dd6, B:414:0x0dea, B:416:0x0dfc, B:436:0x0e9c, B:438:0x0ea2, B:440:0x0eb7, B:443:0x0ebe, B:448:0x0ef3, B:444:0x0ec6, B:446:0x0ed4, B:447:0x0eda, B:449:0x0f02, B:417:0x0e17, B:419:0x0e1d, B:421:0x0e2d, B:423:0x0e34, B:429:0x0e4a, B:431:0x0e51, B:433:0x0e8d, B:435:0x0e94, B:434:0x0e91, B:430:0x0e4e, B:422:0x0e31, B:251:0x07f7, B:253:0x07fd, B:255:0x0803, B:245:0x0791, B:241:0x0760, B:235:0x0710, B:237:0x0716, B:450:0x0f1d), top: B:456:0x0017, inners: #1 }] */
                /* JADX WARN: Code duplicated, block: B:77:0x0250 A[Catch: all -> 0x0117, TryCatch #0 {all -> 0x0117, blocks: (B:3:0x0017, B:5:0x002f, B:8:0x0038, B:9:0x0050, B:12:0x006c, B:15:0x009a, B:17:0x00d7, B:20:0x00f0, B:22:0x00fa, B:206:0x066f, B:27:0x0128, B:30:0x013a, B:32:0x0140, B:47:0x0184, B:49:0x0196, B:52:0x01b6, B:54:0x01bc, B:56:0x01cc, B:58:0x01da, B:60:0x01ea, B:61:0x01f5, B:62:0x01f8, B:64:0x020e, B:115:0x03f8, B:116:0x0404, B:119:0x040e, B:125:0x0431, B:122:0x0420, B:147:0x04ab, B:149:0x04b7, B:152:0x04c8, B:154:0x04d9, B:156:0x04e5, B:172:0x0543, B:174:0x0549, B:175:0x0555, B:177:0x055b, B:179:0x056b, B:181:0x0575, B:182:0x0588, B:184:0x058e, B:185:0x05a7, B:187:0x05ad, B:188:0x05cb, B:189:0x05d9, B:193:0x0600, B:190:0x05df, B:192:0x05eb, B:194:0x0607, B:195:0x061d, B:197:0x0623, B:199:0x0636, B:200:0x0643, B:201:0x0647, B:203:0x064d, B:205:0x0659, B:160:0x04f7, B:162:0x0503, B:165:0x0516, B:167:0x0527, B:169:0x0533, B:129:0x0439, B:131:0x0445, B:133:0x0451, B:146:0x0495, B:138:0x046d, B:141:0x047f, B:143:0x0485, B:145:0x048f, B:72:0x0238, B:75:0x0242, B:77:0x0250, B:81:0x0297, B:78:0x026d, B:80:0x027d, B:85:0x02a4, B:87:0x02ce, B:88:0x02f6, B:90:0x032b, B:92:0x0331, B:95:0x033d, B:97:0x0372, B:98:0x038f, B:100:0x0395, B:102:0x03a3, B:106:0x03b7, B:103:0x03ab, B:109:0x03be, B:112:0x03c5, B:113:0x03dd, B:36:0x014a, B:38:0x0157, B:40:0x0165, B:42:0x016b, B:46:0x0176, B:209:0x0687, B:211:0x0695, B:213:0x069e, B:224:0x06ce, B:214:0x06a6, B:216:0x06af, B:218:0x06b5, B:221:0x06c1, B:223:0x06c9, B:225:0x06d1, B:226:0x06dd, B:229:0x06e5, B:231:0x06f7, B:232:0x0702, B:234:0x070a, B:238:0x0732, B:240:0x074e, B:242:0x0763, B:244:0x077f, B:246:0x0794, B:248:0x07e1, B:250:0x07e7, B:256:0x0812, B:258:0x081a, B:259:0x0823, B:261:0x0829, B:262:0x082f, B:264:0x0846, B:266:0x0857, B:268:0x0869, B:271:0x0874, B:273:0x087a, B:274:0x088c, B:276:0x0892, B:278:0x08a2, B:280:0x08be, B:283:0x08da, B:285:0x0901, B:305:0x0a4b, B:308:0x0a5b, B:286:0x091a, B:288:0x092e, B:290:0x094b, B:292:0x0972, B:294:0x09a4, B:295:0x09b1, B:297:0x09c7, B:299:0x09e4, B:301:0x0a0b, B:303:0x0a3d, B:309:0x0a63, B:311:0x0aac, B:312:0x0abf, B:315:0x0ac7, B:318:0x0ae2, B:320:0x0afb, B:322:0x0b10, B:324:0x0b15, B:326:0x0b19, B:328:0x0b1d, B:330:0x0b27, B:332:0x0b30, B:334:0x0b34, B:336:0x0b3a, B:338:0x0b45, B:340:0x0b53, B:406:0x0db2, B:342:0x0b5a, B:344:0x0b76, B:349:0x0b93, B:351:0x0bb5, B:352:0x0bbd, B:354:0x0bc3, B:356:0x0bd5, B:362:0x0bfc, B:363:0x0c1f, B:365:0x0c2b, B:367:0x0c43, B:369:0x0c86, B:375:0x0ca2, B:377:0x0cad, B:379:0x0cb1, B:381:0x0cb5, B:383:0x0cb9, B:384:0x0cc5, B:385:0x0cca, B:387:0x0cd0, B:389:0x0ce6, B:390:0x0ceb, B:405:0x0daf, B:392:0x0d29, B:394:0x0d2d, B:398:0x0d41, B:400:0x0d5d, B:401:0x0d64, B:404:0x0da3, B:395:0x0d32, B:360:0x0be6, B:347:0x0b7c, B:407:0x0db8, B:409:0x0dc2, B:410:0x0dc8, B:411:0x0dd0, B:413:0x0dd6, B:414:0x0dea, B:416:0x0dfc, B:436:0x0e9c, B:438:0x0ea2, B:440:0x0eb7, B:443:0x0ebe, B:448:0x0ef3, B:444:0x0ec6, B:446:0x0ed4, B:447:0x0eda, B:449:0x0f02, B:417:0x0e17, B:419:0x0e1d, B:421:0x0e2d, B:423:0x0e34, B:429:0x0e4a, B:431:0x0e51, B:433:0x0e8d, B:435:0x0e94, B:434:0x0e91, B:430:0x0e4e, B:422:0x0e31, B:251:0x07f7, B:253:0x07fd, B:255:0x0803, B:245:0x0791, B:241:0x0760, B:235:0x0710, B:237:0x0716, B:450:0x0f1d), top: B:456:0x0017, inners: #1 }] */
                /* JADX WARN: Code duplicated, block: B:78:0x026d A[Catch: all -> 0x0117, TryCatch #0 {all -> 0x0117, blocks: (B:3:0x0017, B:5:0x002f, B:8:0x0038, B:9:0x0050, B:12:0x006c, B:15:0x009a, B:17:0x00d7, B:20:0x00f0, B:22:0x00fa, B:206:0x066f, B:27:0x0128, B:30:0x013a, B:32:0x0140, B:47:0x0184, B:49:0x0196, B:52:0x01b6, B:54:0x01bc, B:56:0x01cc, B:58:0x01da, B:60:0x01ea, B:61:0x01f5, B:62:0x01f8, B:64:0x020e, B:115:0x03f8, B:116:0x0404, B:119:0x040e, B:125:0x0431, B:122:0x0420, B:147:0x04ab, B:149:0x04b7, B:152:0x04c8, B:154:0x04d9, B:156:0x04e5, B:172:0x0543, B:174:0x0549, B:175:0x0555, B:177:0x055b, B:179:0x056b, B:181:0x0575, B:182:0x0588, B:184:0x058e, B:185:0x05a7, B:187:0x05ad, B:188:0x05cb, B:189:0x05d9, B:193:0x0600, B:190:0x05df, B:192:0x05eb, B:194:0x0607, B:195:0x061d, B:197:0x0623, B:199:0x0636, B:200:0x0643, B:201:0x0647, B:203:0x064d, B:205:0x0659, B:160:0x04f7, B:162:0x0503, B:165:0x0516, B:167:0x0527, B:169:0x0533, B:129:0x0439, B:131:0x0445, B:133:0x0451, B:146:0x0495, B:138:0x046d, B:141:0x047f, B:143:0x0485, B:145:0x048f, B:72:0x0238, B:75:0x0242, B:77:0x0250, B:81:0x0297, B:78:0x026d, B:80:0x027d, B:85:0x02a4, B:87:0x02ce, B:88:0x02f6, B:90:0x032b, B:92:0x0331, B:95:0x033d, B:97:0x0372, B:98:0x038f, B:100:0x0395, B:102:0x03a3, B:106:0x03b7, B:103:0x03ab, B:109:0x03be, B:112:0x03c5, B:113:0x03dd, B:36:0x014a, B:38:0x0157, B:40:0x0165, B:42:0x016b, B:46:0x0176, B:209:0x0687, B:211:0x0695, B:213:0x069e, B:224:0x06ce, B:214:0x06a6, B:216:0x06af, B:218:0x06b5, B:221:0x06c1, B:223:0x06c9, B:225:0x06d1, B:226:0x06dd, B:229:0x06e5, B:231:0x06f7, B:232:0x0702, B:234:0x070a, B:238:0x0732, B:240:0x074e, B:242:0x0763, B:244:0x077f, B:246:0x0794, B:248:0x07e1, B:250:0x07e7, B:256:0x0812, B:258:0x081a, B:259:0x0823, B:261:0x0829, B:262:0x082f, B:264:0x0846, B:266:0x0857, B:268:0x0869, B:271:0x0874, B:273:0x087a, B:274:0x088c, B:276:0x0892, B:278:0x08a2, B:280:0x08be, B:283:0x08da, B:285:0x0901, B:305:0x0a4b, B:308:0x0a5b, B:286:0x091a, B:288:0x092e, B:290:0x094b, B:292:0x0972, B:294:0x09a4, B:295:0x09b1, B:297:0x09c7, B:299:0x09e4, B:301:0x0a0b, B:303:0x0a3d, B:309:0x0a63, B:311:0x0aac, B:312:0x0abf, B:315:0x0ac7, B:318:0x0ae2, B:320:0x0afb, B:322:0x0b10, B:324:0x0b15, B:326:0x0b19, B:328:0x0b1d, B:330:0x0b27, B:332:0x0b30, B:334:0x0b34, B:336:0x0b3a, B:338:0x0b45, B:340:0x0b53, B:406:0x0db2, B:342:0x0b5a, B:344:0x0b76, B:349:0x0b93, B:351:0x0bb5, B:352:0x0bbd, B:354:0x0bc3, B:356:0x0bd5, B:362:0x0bfc, B:363:0x0c1f, B:365:0x0c2b, B:367:0x0c43, B:369:0x0c86, B:375:0x0ca2, B:377:0x0cad, B:379:0x0cb1, B:381:0x0cb5, B:383:0x0cb9, B:384:0x0cc5, B:385:0x0cca, B:387:0x0cd0, B:389:0x0ce6, B:390:0x0ceb, B:405:0x0daf, B:392:0x0d29, B:394:0x0d2d, B:398:0x0d41, B:400:0x0d5d, B:401:0x0d64, B:404:0x0da3, B:395:0x0d32, B:360:0x0be6, B:347:0x0b7c, B:407:0x0db8, B:409:0x0dc2, B:410:0x0dc8, B:411:0x0dd0, B:413:0x0dd6, B:414:0x0dea, B:416:0x0dfc, B:436:0x0e9c, B:438:0x0ea2, B:440:0x0eb7, B:443:0x0ebe, B:448:0x0ef3, B:444:0x0ec6, B:446:0x0ed4, B:447:0x0eda, B:449:0x0f02, B:417:0x0e17, B:419:0x0e1d, B:421:0x0e2d, B:423:0x0e34, B:429:0x0e4a, B:431:0x0e51, B:433:0x0e8d, B:435:0x0e94, B:434:0x0e91, B:430:0x0e4e, B:422:0x0e31, B:251:0x07f7, B:253:0x07fd, B:255:0x0803, B:245:0x0791, B:241:0x0760, B:235:0x0710, B:237:0x0716, B:450:0x0f1d), top: B:456:0x0017, inners: #1 }] */
                /* JADX WARN: Code duplicated, block: B:80:0x027d A[Catch: all -> 0x0117, TryCatch #0 {all -> 0x0117, blocks: (B:3:0x0017, B:5:0x002f, B:8:0x0038, B:9:0x0050, B:12:0x006c, B:15:0x009a, B:17:0x00d7, B:20:0x00f0, B:22:0x00fa, B:206:0x066f, B:27:0x0128, B:30:0x013a, B:32:0x0140, B:47:0x0184, B:49:0x0196, B:52:0x01b6, B:54:0x01bc, B:56:0x01cc, B:58:0x01da, B:60:0x01ea, B:61:0x01f5, B:62:0x01f8, B:64:0x020e, B:115:0x03f8, B:116:0x0404, B:119:0x040e, B:125:0x0431, B:122:0x0420, B:147:0x04ab, B:149:0x04b7, B:152:0x04c8, B:154:0x04d9, B:156:0x04e5, B:172:0x0543, B:174:0x0549, B:175:0x0555, B:177:0x055b, B:179:0x056b, B:181:0x0575, B:182:0x0588, B:184:0x058e, B:185:0x05a7, B:187:0x05ad, B:188:0x05cb, B:189:0x05d9, B:193:0x0600, B:190:0x05df, B:192:0x05eb, B:194:0x0607, B:195:0x061d, B:197:0x0623, B:199:0x0636, B:200:0x0643, B:201:0x0647, B:203:0x064d, B:205:0x0659, B:160:0x04f7, B:162:0x0503, B:165:0x0516, B:167:0x0527, B:169:0x0533, B:129:0x0439, B:131:0x0445, B:133:0x0451, B:146:0x0495, B:138:0x046d, B:141:0x047f, B:143:0x0485, B:145:0x048f, B:72:0x0238, B:75:0x0242, B:77:0x0250, B:81:0x0297, B:78:0x026d, B:80:0x027d, B:85:0x02a4, B:87:0x02ce, B:88:0x02f6, B:90:0x032b, B:92:0x0331, B:95:0x033d, B:97:0x0372, B:98:0x038f, B:100:0x0395, B:102:0x03a3, B:106:0x03b7, B:103:0x03ab, B:109:0x03be, B:112:0x03c5, B:113:0x03dd, B:36:0x014a, B:38:0x0157, B:40:0x0165, B:42:0x016b, B:46:0x0176, B:209:0x0687, B:211:0x0695, B:213:0x069e, B:224:0x06ce, B:214:0x06a6, B:216:0x06af, B:218:0x06b5, B:221:0x06c1, B:223:0x06c9, B:225:0x06d1, B:226:0x06dd, B:229:0x06e5, B:231:0x06f7, B:232:0x0702, B:234:0x070a, B:238:0x0732, B:240:0x074e, B:242:0x0763, B:244:0x077f, B:246:0x0794, B:248:0x07e1, B:250:0x07e7, B:256:0x0812, B:258:0x081a, B:259:0x0823, B:261:0x0829, B:262:0x082f, B:264:0x0846, B:266:0x0857, B:268:0x0869, B:271:0x0874, B:273:0x087a, B:274:0x088c, B:276:0x0892, B:278:0x08a2, B:280:0x08be, B:283:0x08da, B:285:0x0901, B:305:0x0a4b, B:308:0x0a5b, B:286:0x091a, B:288:0x092e, B:290:0x094b, B:292:0x0972, B:294:0x09a4, B:295:0x09b1, B:297:0x09c7, B:299:0x09e4, B:301:0x0a0b, B:303:0x0a3d, B:309:0x0a63, B:311:0x0aac, B:312:0x0abf, B:315:0x0ac7, B:318:0x0ae2, B:320:0x0afb, B:322:0x0b10, B:324:0x0b15, B:326:0x0b19, B:328:0x0b1d, B:330:0x0b27, B:332:0x0b30, B:334:0x0b34, B:336:0x0b3a, B:338:0x0b45, B:340:0x0b53, B:406:0x0db2, B:342:0x0b5a, B:344:0x0b76, B:349:0x0b93, B:351:0x0bb5, B:352:0x0bbd, B:354:0x0bc3, B:356:0x0bd5, B:362:0x0bfc, B:363:0x0c1f, B:365:0x0c2b, B:367:0x0c43, B:369:0x0c86, B:375:0x0ca2, B:377:0x0cad, B:379:0x0cb1, B:381:0x0cb5, B:383:0x0cb9, B:384:0x0cc5, B:385:0x0cca, B:387:0x0cd0, B:389:0x0ce6, B:390:0x0ceb, B:405:0x0daf, B:392:0x0d29, B:394:0x0d2d, B:398:0x0d41, B:400:0x0d5d, B:401:0x0d64, B:404:0x0da3, B:395:0x0d32, B:360:0x0be6, B:347:0x0b7c, B:407:0x0db8, B:409:0x0dc2, B:410:0x0dc8, B:411:0x0dd0, B:413:0x0dd6, B:414:0x0dea, B:416:0x0dfc, B:436:0x0e9c, B:438:0x0ea2, B:440:0x0eb7, B:443:0x0ebe, B:448:0x0ef3, B:444:0x0ec6, B:446:0x0ed4, B:447:0x0eda, B:449:0x0f02, B:417:0x0e17, B:419:0x0e1d, B:421:0x0e2d, B:423:0x0e34, B:429:0x0e4a, B:431:0x0e51, B:433:0x0e8d, B:435:0x0e94, B:434:0x0e91, B:430:0x0e4e, B:422:0x0e31, B:251:0x07f7, B:253:0x07fd, B:255:0x0803, B:245:0x0791, B:241:0x0760, B:235:0x0710, B:237:0x0716, B:450:0x0f1d), top: B:456:0x0017, inners: #1 }] */
                /* JADX WARN: Code duplicated, block: B:87:0x02ce A[Catch: all -> 0x0117, TryCatch #0 {all -> 0x0117, blocks: (B:3:0x0017, B:5:0x002f, B:8:0x0038, B:9:0x0050, B:12:0x006c, B:15:0x009a, B:17:0x00d7, B:20:0x00f0, B:22:0x00fa, B:206:0x066f, B:27:0x0128, B:30:0x013a, B:32:0x0140, B:47:0x0184, B:49:0x0196, B:52:0x01b6, B:54:0x01bc, B:56:0x01cc, B:58:0x01da, B:60:0x01ea, B:61:0x01f5, B:62:0x01f8, B:64:0x020e, B:115:0x03f8, B:116:0x0404, B:119:0x040e, B:125:0x0431, B:122:0x0420, B:147:0x04ab, B:149:0x04b7, B:152:0x04c8, B:154:0x04d9, B:156:0x04e5, B:172:0x0543, B:174:0x0549, B:175:0x0555, B:177:0x055b, B:179:0x056b, B:181:0x0575, B:182:0x0588, B:184:0x058e, B:185:0x05a7, B:187:0x05ad, B:188:0x05cb, B:189:0x05d9, B:193:0x0600, B:190:0x05df, B:192:0x05eb, B:194:0x0607, B:195:0x061d, B:197:0x0623, B:199:0x0636, B:200:0x0643, B:201:0x0647, B:203:0x064d, B:205:0x0659, B:160:0x04f7, B:162:0x0503, B:165:0x0516, B:167:0x0527, B:169:0x0533, B:129:0x0439, B:131:0x0445, B:133:0x0451, B:146:0x0495, B:138:0x046d, B:141:0x047f, B:143:0x0485, B:145:0x048f, B:72:0x0238, B:75:0x0242, B:77:0x0250, B:81:0x0297, B:78:0x026d, B:80:0x027d, B:85:0x02a4, B:87:0x02ce, B:88:0x02f6, B:90:0x032b, B:92:0x0331, B:95:0x033d, B:97:0x0372, B:98:0x038f, B:100:0x0395, B:102:0x03a3, B:106:0x03b7, B:103:0x03ab, B:109:0x03be, B:112:0x03c5, B:113:0x03dd, B:36:0x014a, B:38:0x0157, B:40:0x0165, B:42:0x016b, B:46:0x0176, B:209:0x0687, B:211:0x0695, B:213:0x069e, B:224:0x06ce, B:214:0x06a6, B:216:0x06af, B:218:0x06b5, B:221:0x06c1, B:223:0x06c9, B:225:0x06d1, B:226:0x06dd, B:229:0x06e5, B:231:0x06f7, B:232:0x0702, B:234:0x070a, B:238:0x0732, B:240:0x074e, B:242:0x0763, B:244:0x077f, B:246:0x0794, B:248:0x07e1, B:250:0x07e7, B:256:0x0812, B:258:0x081a, B:259:0x0823, B:261:0x0829, B:262:0x082f, B:264:0x0846, B:266:0x0857, B:268:0x0869, B:271:0x0874, B:273:0x087a, B:274:0x088c, B:276:0x0892, B:278:0x08a2, B:280:0x08be, B:283:0x08da, B:285:0x0901, B:305:0x0a4b, B:308:0x0a5b, B:286:0x091a, B:288:0x092e, B:290:0x094b, B:292:0x0972, B:294:0x09a4, B:295:0x09b1, B:297:0x09c7, B:299:0x09e4, B:301:0x0a0b, B:303:0x0a3d, B:309:0x0a63, B:311:0x0aac, B:312:0x0abf, B:315:0x0ac7, B:318:0x0ae2, B:320:0x0afb, B:322:0x0b10, B:324:0x0b15, B:326:0x0b19, B:328:0x0b1d, B:330:0x0b27, B:332:0x0b30, B:334:0x0b34, B:336:0x0b3a, B:338:0x0b45, B:340:0x0b53, B:406:0x0db2, B:342:0x0b5a, B:344:0x0b76, B:349:0x0b93, B:351:0x0bb5, B:352:0x0bbd, B:354:0x0bc3, B:356:0x0bd5, B:362:0x0bfc, B:363:0x0c1f, B:365:0x0c2b, B:367:0x0c43, B:369:0x0c86, B:375:0x0ca2, B:377:0x0cad, B:379:0x0cb1, B:381:0x0cb5, B:383:0x0cb9, B:384:0x0cc5, B:385:0x0cca, B:387:0x0cd0, B:389:0x0ce6, B:390:0x0ceb, B:405:0x0daf, B:392:0x0d29, B:394:0x0d2d, B:398:0x0d41, B:400:0x0d5d, B:401:0x0d64, B:404:0x0da3, B:395:0x0d32, B:360:0x0be6, B:347:0x0b7c, B:407:0x0db8, B:409:0x0dc2, B:410:0x0dc8, B:411:0x0dd0, B:413:0x0dd6, B:414:0x0dea, B:416:0x0dfc, B:436:0x0e9c, B:438:0x0ea2, B:440:0x0eb7, B:443:0x0ebe, B:448:0x0ef3, B:444:0x0ec6, B:446:0x0ed4, B:447:0x0eda, B:449:0x0f02, B:417:0x0e17, B:419:0x0e1d, B:421:0x0e2d, B:423:0x0e34, B:429:0x0e4a, B:431:0x0e51, B:433:0x0e8d, B:435:0x0e94, B:434:0x0e91, B:430:0x0e4e, B:422:0x0e31, B:251:0x07f7, B:253:0x07fd, B:255:0x0803, B:245:0x0791, B:241:0x0760, B:235:0x0710, B:237:0x0716, B:450:0x0f1d), top: B:456:0x0017, inners: #1 }] */
                /* JADX WARN: Code duplicated, block: B:90:0x032b A[Catch: all -> 0x0117, TryCatch #0 {all -> 0x0117, blocks: (B:3:0x0017, B:5:0x002f, B:8:0x0038, B:9:0x0050, B:12:0x006c, B:15:0x009a, B:17:0x00d7, B:20:0x00f0, B:22:0x00fa, B:206:0x066f, B:27:0x0128, B:30:0x013a, B:32:0x0140, B:47:0x0184, B:49:0x0196, B:52:0x01b6, B:54:0x01bc, B:56:0x01cc, B:58:0x01da, B:60:0x01ea, B:61:0x01f5, B:62:0x01f8, B:64:0x020e, B:115:0x03f8, B:116:0x0404, B:119:0x040e, B:125:0x0431, B:122:0x0420, B:147:0x04ab, B:149:0x04b7, B:152:0x04c8, B:154:0x04d9, B:156:0x04e5, B:172:0x0543, B:174:0x0549, B:175:0x0555, B:177:0x055b, B:179:0x056b, B:181:0x0575, B:182:0x0588, B:184:0x058e, B:185:0x05a7, B:187:0x05ad, B:188:0x05cb, B:189:0x05d9, B:193:0x0600, B:190:0x05df, B:192:0x05eb, B:194:0x0607, B:195:0x061d, B:197:0x0623, B:199:0x0636, B:200:0x0643, B:201:0x0647, B:203:0x064d, B:205:0x0659, B:160:0x04f7, B:162:0x0503, B:165:0x0516, B:167:0x0527, B:169:0x0533, B:129:0x0439, B:131:0x0445, B:133:0x0451, B:146:0x0495, B:138:0x046d, B:141:0x047f, B:143:0x0485, B:145:0x048f, B:72:0x0238, B:75:0x0242, B:77:0x0250, B:81:0x0297, B:78:0x026d, B:80:0x027d, B:85:0x02a4, B:87:0x02ce, B:88:0x02f6, B:90:0x032b, B:92:0x0331, B:95:0x033d, B:97:0x0372, B:98:0x038f, B:100:0x0395, B:102:0x03a3, B:106:0x03b7, B:103:0x03ab, B:109:0x03be, B:112:0x03c5, B:113:0x03dd, B:36:0x014a, B:38:0x0157, B:40:0x0165, B:42:0x016b, B:46:0x0176, B:209:0x0687, B:211:0x0695, B:213:0x069e, B:224:0x06ce, B:214:0x06a6, B:216:0x06af, B:218:0x06b5, B:221:0x06c1, B:223:0x06c9, B:225:0x06d1, B:226:0x06dd, B:229:0x06e5, B:231:0x06f7, B:232:0x0702, B:234:0x070a, B:238:0x0732, B:240:0x074e, B:242:0x0763, B:244:0x077f, B:246:0x0794, B:248:0x07e1, B:250:0x07e7, B:256:0x0812, B:258:0x081a, B:259:0x0823, B:261:0x0829, B:262:0x082f, B:264:0x0846, B:266:0x0857, B:268:0x0869, B:271:0x0874, B:273:0x087a, B:274:0x088c, B:276:0x0892, B:278:0x08a2, B:280:0x08be, B:283:0x08da, B:285:0x0901, B:305:0x0a4b, B:308:0x0a5b, B:286:0x091a, B:288:0x092e, B:290:0x094b, B:292:0x0972, B:294:0x09a4, B:295:0x09b1, B:297:0x09c7, B:299:0x09e4, B:301:0x0a0b, B:303:0x0a3d, B:309:0x0a63, B:311:0x0aac, B:312:0x0abf, B:315:0x0ac7, B:318:0x0ae2, B:320:0x0afb, B:322:0x0b10, B:324:0x0b15, B:326:0x0b19, B:328:0x0b1d, B:330:0x0b27, B:332:0x0b30, B:334:0x0b34, B:336:0x0b3a, B:338:0x0b45, B:340:0x0b53, B:406:0x0db2, B:342:0x0b5a, B:344:0x0b76, B:349:0x0b93, B:351:0x0bb5, B:352:0x0bbd, B:354:0x0bc3, B:356:0x0bd5, B:362:0x0bfc, B:363:0x0c1f, B:365:0x0c2b, B:367:0x0c43, B:369:0x0c86, B:375:0x0ca2, B:377:0x0cad, B:379:0x0cb1, B:381:0x0cb5, B:383:0x0cb9, B:384:0x0cc5, B:385:0x0cca, B:387:0x0cd0, B:389:0x0ce6, B:390:0x0ceb, B:405:0x0daf, B:392:0x0d29, B:394:0x0d2d, B:398:0x0d41, B:400:0x0d5d, B:401:0x0d64, B:404:0x0da3, B:395:0x0d32, B:360:0x0be6, B:347:0x0b7c, B:407:0x0db8, B:409:0x0dc2, B:410:0x0dc8, B:411:0x0dd0, B:413:0x0dd6, B:414:0x0dea, B:416:0x0dfc, B:436:0x0e9c, B:438:0x0ea2, B:440:0x0eb7, B:443:0x0ebe, B:448:0x0ef3, B:444:0x0ec6, B:446:0x0ed4, B:447:0x0eda, B:449:0x0f02, B:417:0x0e17, B:419:0x0e1d, B:421:0x0e2d, B:423:0x0e34, B:429:0x0e4a, B:431:0x0e51, B:433:0x0e8d, B:435:0x0e94, B:434:0x0e91, B:430:0x0e4e, B:422:0x0e31, B:251:0x07f7, B:253:0x07fd, B:255:0x0803, B:245:0x0791, B:241:0x0760, B:235:0x0710, B:237:0x0716, B:450:0x0f1d), top: B:456:0x0017, inners: #1 }] */
                /* JADX WARN: Code duplicated, block: B:91:0x032f  */
                /* JADX WARN: Code duplicated, block: B:97:0x0372 A[Catch: all -> 0x0117, TryCatch #0 {all -> 0x0117, blocks: (B:3:0x0017, B:5:0x002f, B:8:0x0038, B:9:0x0050, B:12:0x006c, B:15:0x009a, B:17:0x00d7, B:20:0x00f0, B:22:0x00fa, B:206:0x066f, B:27:0x0128, B:30:0x013a, B:32:0x0140, B:47:0x0184, B:49:0x0196, B:52:0x01b6, B:54:0x01bc, B:56:0x01cc, B:58:0x01da, B:60:0x01ea, B:61:0x01f5, B:62:0x01f8, B:64:0x020e, B:115:0x03f8, B:116:0x0404, B:119:0x040e, B:125:0x0431, B:122:0x0420, B:147:0x04ab, B:149:0x04b7, B:152:0x04c8, B:154:0x04d9, B:156:0x04e5, B:172:0x0543, B:174:0x0549, B:175:0x0555, B:177:0x055b, B:179:0x056b, B:181:0x0575, B:182:0x0588, B:184:0x058e, B:185:0x05a7, B:187:0x05ad, B:188:0x05cb, B:189:0x05d9, B:193:0x0600, B:190:0x05df, B:192:0x05eb, B:194:0x0607, B:195:0x061d, B:197:0x0623, B:199:0x0636, B:200:0x0643, B:201:0x0647, B:203:0x064d, B:205:0x0659, B:160:0x04f7, B:162:0x0503, B:165:0x0516, B:167:0x0527, B:169:0x0533, B:129:0x0439, B:131:0x0445, B:133:0x0451, B:146:0x0495, B:138:0x046d, B:141:0x047f, B:143:0x0485, B:145:0x048f, B:72:0x0238, B:75:0x0242, B:77:0x0250, B:81:0x0297, B:78:0x026d, B:80:0x027d, B:85:0x02a4, B:87:0x02ce, B:88:0x02f6, B:90:0x032b, B:92:0x0331, B:95:0x033d, B:97:0x0372, B:98:0x038f, B:100:0x0395, B:102:0x03a3, B:106:0x03b7, B:103:0x03ab, B:109:0x03be, B:112:0x03c5, B:113:0x03dd, B:36:0x014a, B:38:0x0157, B:40:0x0165, B:42:0x016b, B:46:0x0176, B:209:0x0687, B:211:0x0695, B:213:0x069e, B:224:0x06ce, B:214:0x06a6, B:216:0x06af, B:218:0x06b5, B:221:0x06c1, B:223:0x06c9, B:225:0x06d1, B:226:0x06dd, B:229:0x06e5, B:231:0x06f7, B:232:0x0702, B:234:0x070a, B:238:0x0732, B:240:0x074e, B:242:0x0763, B:244:0x077f, B:246:0x0794, B:248:0x07e1, B:250:0x07e7, B:256:0x0812, B:258:0x081a, B:259:0x0823, B:261:0x0829, B:262:0x082f, B:264:0x0846, B:266:0x0857, B:268:0x0869, B:271:0x0874, B:273:0x087a, B:274:0x088c, B:276:0x0892, B:278:0x08a2, B:280:0x08be, B:283:0x08da, B:285:0x0901, B:305:0x0a4b, B:308:0x0a5b, B:286:0x091a, B:288:0x092e, B:290:0x094b, B:292:0x0972, B:294:0x09a4, B:295:0x09b1, B:297:0x09c7, B:299:0x09e4, B:301:0x0a0b, B:303:0x0a3d, B:309:0x0a63, B:311:0x0aac, B:312:0x0abf, B:315:0x0ac7, B:318:0x0ae2, B:320:0x0afb, B:322:0x0b10, B:324:0x0b15, B:326:0x0b19, B:328:0x0b1d, B:330:0x0b27, B:332:0x0b30, B:334:0x0b34, B:336:0x0b3a, B:338:0x0b45, B:340:0x0b53, B:406:0x0db2, B:342:0x0b5a, B:344:0x0b76, B:349:0x0b93, B:351:0x0bb5, B:352:0x0bbd, B:354:0x0bc3, B:356:0x0bd5, B:362:0x0bfc, B:363:0x0c1f, B:365:0x0c2b, B:367:0x0c43, B:369:0x0c86, B:375:0x0ca2, B:377:0x0cad, B:379:0x0cb1, B:381:0x0cb5, B:383:0x0cb9, B:384:0x0cc5, B:385:0x0cca, B:387:0x0cd0, B:389:0x0ce6, B:390:0x0ceb, B:405:0x0daf, B:392:0x0d29, B:394:0x0d2d, B:398:0x0d41, B:400:0x0d5d, B:401:0x0d64, B:404:0x0da3, B:395:0x0d32, B:360:0x0be6, B:347:0x0b7c, B:407:0x0db8, B:409:0x0dc2, B:410:0x0dc8, B:411:0x0dd0, B:413:0x0dd6, B:414:0x0dea, B:416:0x0dfc, B:436:0x0e9c, B:438:0x0ea2, B:440:0x0eb7, B:443:0x0ebe, B:448:0x0ef3, B:444:0x0ec6, B:446:0x0ed4, B:447:0x0eda, B:449:0x0f02, B:417:0x0e17, B:419:0x0e1d, B:421:0x0e2d, B:423:0x0e34, B:429:0x0e4a, B:431:0x0e51, B:433:0x0e8d, B:435:0x0e94, B:434:0x0e91, B:430:0x0e4e, B:422:0x0e31, B:251:0x07f7, B:253:0x07fd, B:255:0x0803, B:245:0x0791, B:241:0x0760, B:235:0x0710, B:237:0x0716, B:450:0x0f1d), top: B:456:0x0017, inners: #1 }] */
                /* JADX INFO: renamed from: G */
                public final boolean m6735G(String str, long j) {
                    boolean z;
                    int i;
                    ij3 ij3Var;
                    Long l;
                    Long l2;
                    long j2;
                    int iM9291Q;
                    long j3;
                    long jZzp;
                    Long l3;
                    long j4;
                    String strM9112r0;
                    String strM9112r1;
                    zzhw zzhwVarM1661H;
                    Long lValueOf;
                    String str2;
                    String str3;
                    int i2;
                    boolean z2;
                    boolean z3;
                    String str4;
                    boolean z4;
                    zzhv zzhvVar;
                    int i3;
                    boolean z5;
                    int i4;
                    zzhw zzhwVarZzc;
                    boolean z6;
                    String str5;
                    int i5;
                    int i6;
/* 1 */             mp3 mp3Var = this;
/* 5 */             String str6 = "_ai";
/* 7 */             String str7 = FirebaseAnalytics.Event.PURCHASE;
/* 9 */             String str8 = FirebaseAnalytics.Param.ITEMS;
/* 13 */            Long l4 = 1L;
/* 21 */            mp3Var.m6755f0().m258n0();
                    try {
/* 26 */                ji3 ji3Var = new ji3(mp3Var);
/* 39 */                mp3Var.m6755f0().m257l0(str, j, mp3Var.f13927l0, ji3Var);
/* 44 */                ArrayList arrayList = (ArrayList) ji3Var.f12322d;
/* 46 */                if (arrayList == null || arrayList.isEmpty()) {
/* 3874 */                  m6755f0().m259o0();
/* 3877 */                  z = false;
                        } else {
/* 65 */                    zzic zzicVar = (zzic) ((zzid) ji3Var.f12320b).zzcl();
/* 67 */                    zzicVar.zzi();
/* 70 */                    int i7 = -1;
/* 71 */                    int i8 = -1;
/* 72 */                    int i9 = 0;
/* 73 */                    int i10 = 0;
/* 74 */                    boolean z7 = false;
/* 75 */                    boolean z8 = false;
/* 77 */                    zzhr zzhrVar = null;
/* 79 */                    zzhr zzhrVar2 = null;
                            while (true) {
/* 85 */                        int size = ((ArrayList) ji3Var.f12322d).size();
/* 93 */                        i = i10;
/* 97 */                        boolean z9 = z7;
/* 99 */                        ij3Var = mp3Var.f13905W;
/* 105 */                       l = l4;
/* 107 */                       if (i9 >= size) {
                                    break;
                                }
/* 123 */                       zzhr zzhrVar3 = (zzhr) ((zzhs) ((ArrayList) ji3Var.f12322d).get(i9)).zzcl();
/* 131 */                       int i11 = i9;
/* 141 */                       String str9 = str8;
/* 153 */                       if (mp3Var.m6754e0().m9289O(((zzid) ji3Var.f12320b).zzA(), zzhrVar3.zzk())) {
/* 189 */                           mp3Var.mo4557a().m9017E().m8512c(uh3.m9013H(((zzid) ji3Var.f12320b).zzA()), "Dropping blocked raw event. appId", ij3Var.m4565m().m6656a(zzhrVar3.zzk()));
/* 214 */                           if (!"1".equals(mp3Var.m6754e0().mo7139d(((zzid) ji3Var.f12320b).zzA(), "measurement.upload.blacklist_internal")) && !"1".equals(mp3Var.m6754e0().mo7139d(((zzid) ji3Var.f12320b).zzA(), "measurement.upload.blacklist_public")) && !"_err".equals(zzhrVar3.zzk())) {
/* 251 */                               mp3Var.m6763j0();
/* 276 */                               up3.m9062P(mp3Var.f13936u0, ((zzid) ji3Var.f12320b).zzA(), 11, "_ev", zzhrVar3.zzk(), 0);
                                    }
/* 283 */                           str3 = str6;
/* 285 */                           str4 = str7;
/* 287 */                           i10 = i;
/* 289 */                           i5 = i11;
/* 291 */                           str5 = str9;
                                } else {
/* 297 */                           String strZzk = zzhrVar3.zzk();
/* 309 */                           int i12 = i8;
/* 313 */                           if (strZzk.equals(str7) || strZzk.equals("_iap") || strZzk.equals("ecommerce_purchase")) {
/* 331 */                               zzhv zzhvVarZzn = zzhw.zzn();
/* 339 */                               zzhvVarZzn.zzb("_ct");
/* 342 */                               if (z9) {
/* 373 */                                   str2 = "returning";
                                        } else {
/* 348 */                                   String strZzA = ((zzid) ji3Var.f12320b).zzA();
/* 356 */                                   if (mp3Var.m6743P(strZzA, str7) && mp3Var.m6743P(strZzA, "_iap") && mp3Var.m6743P(strZzA, "ecommerce_purchase")) {
/* 370 */                                       str2 = "new";
                                            } else {
/* 373 */                                       str2 = "returning";
                                            }
                                        }
/* 375 */                               zzhvVarZzn.zzd(str2);
/* 384 */                               zzhrVar3.zzf((zzhw) zzhvVarZzn.zzbc());
/* 387 */                               z9 = true;
                                    }
/* 405 */                           if (zzhrVar3.zzk().equals(qj3.m7889V(str6, i13.f9405h, i13.f9403f))) {
/* 407 */                               zzhrVar3.zzl(str6);
/* 420 */                               mp3Var.mo4557a().m9019G().m8510a("Renaming ad_impression to _ai");
/* 436 */                               if (Log.isLoggable(mp3Var.mo4557a().m9021J(), 5)) {
/* 443 */                                   for (int i13 = 0; i13 < zzhrVar3.zzb(); i13++) {
/* 459 */                                       if (FirebaseAnalytics.Param.AD_PLATFORM.equals(zzhrVar3.zzc(i13).zzb()) && !zzhrVar3.zzc(i13).zzd().isEmpty() && "admob".equalsIgnoreCase(zzhrVar3.zzc(i13).zzd())) {
/* 499 */                                           mp3Var.mo4557a().f17531V.m8510a("AdMob ad impression logged from app. Potentially duplicative.");
                                                }
                                            }
                                        }
                                    }
/* 521 */                           boolean zM9290P = mp3Var.m6754e0().m9290P(((zzid) ji3Var.f12320b).zzA(), zzhrVar3.zzk());
/* 525 */                           if (zM9290P) {
/* 555 */                               str3 = str6;
/* 557 */                               i2 = 0;
/* 558 */                               z2 = false;
/* 559 */                               z3 = false;
                                        while (true) {
/* 573 */                                   str4 = str7;
/* 577 */                                   if (i2 < zzhrVar3.zzb()) {
                                                break;
                                                break;
                                            }
/* 591 */                                   if ("_c".equals(zzhrVar3.zzc(i2).zzb())) {
/* 601 */                                       zzhv zzhvVar2 = (zzhv) zzhrVar3.zzc(i2).zzcl();
/* 603 */                                       z6 = zM9290P;
/* 607 */                                       zzhvVar2.zzf(1L);
/* 616 */                                       zzhrVar3.zzd(i2, (zzhw) zzhvVar2.zzbc());
/* 619 */                                       z2 = true;
                                            } else {
/* 622 */                                       z6 = zM9290P;
/* 636 */                                       if ("_r".equals(zzhrVar3.zzc(i2).zzb())) {
/* 646 */                                           zzhv zzhvVar3 = (zzhv) zzhrVar3.zzc(i2).zzcl();
/* 650 */                                           zzhvVar3.zzf(1L);
/* 659 */                                           zzhrVar3.zzd(i2, (zzhw) zzhvVar3.zzbc());
/* 662 */                                           z3 = true;
                                                }
                                            }
/* 664 */                                   i2++;
/* 666 */                                   str7 = str4;
/* 668 */                                   zM9290P = z6;
                                        }
/* 671 */                               z4 = zM9290P;
/* 673 */                               if (!z2) {
/* 699 */                                   mp3Var.mo4557a().m9019G().m8511b(ij3Var.m4565m().m6656a(zzhrVar3.zzk()), "Marking event as conversion");
/* 702 */                                   zzhv zzhvVarZzn2 = zzhw.zzn();
/* 706 */                                   zzhvVarZzn2.zzb("_c");
/* 711 */                                   zzhvVarZzn2.zzf(1L);
/* 714 */                                   zzhrVar3.zzg(zzhvVarZzn2);
                                        }
/* 717 */                               if (!z3) {
/* 741 */                                   mp3Var.mo4557a().m9019G().m8511b(ij3Var.m4565m().m6656a(zzhrVar3.zzk()), "Marking event as real-time");
/* 744 */                                   zzhv zzhvVarZzn3 = zzhw.zzn();
/* 748 */                                   zzhvVarZzn3.zzb("_r");
/* 753 */                                   zzhvVarZzn3.zzf(1L);
/* 756 */                                   zzhrVar3.zzg(zzhvVarZzn3);
                                        }
/* 810 */                               if (mp3Var.m6755f0().m223F0(false, true, false, false, ((zzid) ji3Var.f12320b).zzA(), mp3Var.m6756g()).f17481e > mp3Var.m6753d0().m7404H(((zzid) ji3Var.f12320b).zzA(), vg3.f18155p)) {
/* 812 */                                   m6724C(zzhrVar3, "_r");
                                        } else {
/* 816 */                                   z8 = true;
                                        }
/* 826 */                               if (up3.m9074x0(zzhrVar3.zzk())) {
/* 881 */                                   if (mp3Var.m6755f0().m223F0(true, false, false, false, ((zzid) ji3Var.f12320b).zzA(), mp3Var.m6756g()).f17479c > mp3Var.m6753d0().m7404H(((zzid) ji3Var.f12320b).zzA(), vg3.f18153o)) {
/* 905 */                                       mp3Var.mo4557a().m9017E().m8511b(uh3.m9013H(((zzid) ji3Var.f12320b).zzA()), "Too many conversions. Not logging as conversion. appId");
/* 908 */                                       zzhvVar = null;
/* 910 */                                       z5 = false;
/* 911 */                                       i4 = -1;
/* 916 */                                       for (i3 = 0; i3 < zzhrVar3.zzb(); i3++) {
/* 918 */                                           zzhwVarZzc = zzhrVar3.zzc(i3);
/* 930 */                                           if ("_c".equals(zzhwVarZzc.zzb())) {
/* 936 */                                               zzhvVar = (zzhv) zzhwVarZzc.zzcl();
/* 938 */                                               i4 = i3;
                                                    } else if ("_err".equals(zzhwVarZzc.zzb())) {
/* 950 */                                               z5 = true;
                                                    }
                                                }
/* 955 */                                       if (z5) {
/* 957 */                                           if (zzhvVar != null) {
/* 959 */                                               zzhrVar3.zzj(i4);
                                                    } else {
/* 963 */                                               zzhvVar = null;
/* 964 */                                               if (zzhvVar != null) {
/* 970 */                                                   zzhv zzhvVar4 = (zzhv) zzhvVar.clone();
/* 972 */                                                   zzhvVar4.zzb("_err");
/* 977 */                                                   zzhvVar4.zzf(10L);
/* 986 */                                                   zzhrVar3.zzd(i4, (zzhw) zzhvVar4.zzbc());
                                                        } else {
/* 1012 */                                                  mp3Var.mo4557a().m9016D().m8511b(uh3.m9013H(((zzid) ji3Var.f12320b).zzA()), "Did not find conversion parameter. appId");
                                                        }
                                                    }
                                                } else if (zzhvVar != null) {
/* 970 */                                           zzhv zzhvVar5 = (zzhv) zzhvVar.clone();
/* 972 */                                           zzhvVar5.zzb("_err");
/* 977 */                                           zzhvVar5.zzf(10L);
/* 986 */                                           zzhrVar3.zzd(i4, (zzhw) zzhvVar5.zzbc());
                                                } else {
/* 1012 */                                          mp3Var.mo4557a().m9016D().m8511b(uh3.m9013H(((zzid) ji3Var.f12320b).zzA()), "Did not find conversion parameter. appId");
                                                }
                                            }
                                        }
                                    } else {
/* 527 */                               mp3Var.m6761i0();
/* 530 */                               String strZzk2 = zzhrVar3.zzk();
/* 534 */                               kb1.m6058k(strZzk2);
/* 544 */                               if (strZzk2.hashCode() == 95027 && strZzk2.equals("_ui")) {
/* 555 */                                   str3 = str6;
/* 557 */                                   i2 = 0;
/* 558 */                                   z2 = false;
/* 559 */                                   z3 = false;
                                            while (true) {
/* 573 */                                       str4 = str7;
/* 577 */                                       if (i2 < zzhrVar3.zzb()) {
                                                    break;
                                                }
/* 591 */                                       if ("_c".equals(zzhrVar3.zzc(i2).zzb())) {
/* 601 */                                           zzhv zzhvVar6 = (zzhv) zzhrVar3.zzc(i2).zzcl();
/* 603 */                                           z6 = zM9290P;
/* 607 */                                           zzhvVar6.zzf(1L);
/* 616 */                                           zzhrVar3.zzd(i2, (zzhw) zzhvVar6.zzbc());
/* 619 */                                           z2 = true;
                                                } else {
/* 622 */                                           z6 = zM9290P;
/* 636 */                                           if ("_r".equals(zzhrVar3.zzc(i2).zzb())) {
/* 646 */                                               zzhv zzhvVar7 = (zzhv) zzhrVar3.zzc(i2).zzcl();
/* 650 */                                               zzhvVar7.zzf(1L);
/* 659 */                                               zzhrVar3.zzd(i2, (zzhw) zzhvVar7.zzbc());
/* 662 */                                               z3 = true;
                                                    }
                                                }
/* 664 */                                       i2++;
/* 666 */                                       str7 = str4;
/* 668 */                                       zM9290P = z6;
                                            }
/* 671 */                                   z4 = zM9290P;
/* 673 */                                   if (!z2 && z4) {
/* 699 */                                       mp3Var.mo4557a().m9019G().m8511b(ij3Var.m4565m().m6656a(zzhrVar3.zzk()), "Marking event as conversion");
/* 702 */                                       zzhv zzhvVarZzn4 = zzhw.zzn();
/* 706 */                                       zzhvVarZzn4.zzb("_c");
/* 711 */                                       zzhvVarZzn4.zzf(1L);
/* 714 */                                       zzhrVar3.zzg(zzhvVarZzn4);
                                            }
/* 717 */                                   if (!z3) {
/* 741 */                                       mp3Var.mo4557a().m9019G().m8511b(ij3Var.m4565m().m6656a(zzhrVar3.zzk()), "Marking event as real-time");
/* 744 */                                       zzhv zzhvVarZzn5 = zzhw.zzn();
/* 748 */                                       zzhvVarZzn5.zzb("_r");
/* 753 */                                       zzhvVarZzn5.zzf(1L);
/* 756 */                                       zzhrVar3.zzg(zzhvVarZzn5);
                                            }
/* 810 */                                   if (mp3Var.m6755f0().m223F0(false, true, false, false, ((zzid) ji3Var.f12320b).zzA(), mp3Var.m6756g()).f17481e > mp3Var.m6753d0().m7404H(((zzid) ji3Var.f12320b).zzA(), vg3.f18155p)) {
/* 812 */                                       m6724C(zzhrVar3, "_r");
                                            } else {
/* 816 */                                       z8 = true;
                                            }
/* 826 */                                   if (up3.m9074x0(zzhrVar3.zzk()) && z4) {
/* 881 */                                       if (mp3Var.m6755f0().m223F0(true, false, false, false, ((zzid) ji3Var.f12320b).zzA(), mp3Var.m6756g()).f17479c > mp3Var.m6753d0().m7404H(((zzid) ji3Var.f12320b).zzA(), vg3.f18153o)) {
/* 905 */                                           mp3Var.mo4557a().m9017E().m8511b(uh3.m9013H(((zzid) ji3Var.f12320b).zzA()), "Too many conversions. Not logging as conversion. appId");
/* 908 */                                           zzhvVar = null;
/* 910 */                                           z5 = false;
/* 911 */                                           i4 = -1;
/* 916 */                                           while (i3 < zzhrVar3.zzb()) {
/* 918 */                                               zzhwVarZzc = zzhrVar3.zzc(i3);
/* 930 */                                               if ("_c".equals(zzhwVarZzc.zzb())) {
/* 936 */                                                   zzhvVar = (zzhv) zzhwVarZzc.zzcl();
/* 938 */                                                   i4 = i3;
                                                        } else if ("_err".equals(zzhwVarZzc.zzb())) {
/* 950 */                                                   z5 = true;
                                                        }
                                                    }
/* 955 */                                           if (z5) {
/* 964 */                                               if (zzhvVar != null) {
/* 970 */                                                   zzhv zzhvVar8 = (zzhv) zzhvVar.clone();
/* 972 */                                                   zzhvVar8.zzb("_err");
/* 977 */                                                   zzhvVar8.zzf(10L);
/* 986 */                                                   zzhrVar3.zzd(i4, (zzhw) zzhvVar8.zzbc());
                                                        } else {
/* 1012 */                                                  mp3Var.mo4557a().m9016D().m8511b(uh3.m9013H(((zzid) ji3Var.f12320b).zzA()), "Did not find conversion parameter. appId");
                                                        }
                                                    } else if (zzhvVar != null) {
/* 959 */                                               zzhrVar3.zzj(i4);
                                                    } else {
/* 963 */                                               zzhvVar = null;
/* 964 */                                               if (zzhvVar != null) {
/* 970 */                                                   zzhv zzhvVar9 = (zzhv) zzhvVar.clone();
/* 972 */                                                   zzhvVar9.zzb("_err");
/* 977 */                                                   zzhvVar9.zzf(10L);
/* 986 */                                                   zzhrVar3.zzd(i4, (zzhw) zzhvVar9.zzbc());
                                                        } else {
/* 1012 */                                                  mp3Var.mo4557a().m9016D().m8511b(uh3.m9013H(((zzid) ji3Var.f12320b).zzA()), "Did not find conversion parameter. appId");
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
/* 561 */                                   str3 = str6;
/* 563 */                                   str4 = str7;
/* 565 */                                   z4 = false;
                                        }
                                    }
/* 1015 */                          if (z4) {
/* 1023 */                              ArrayList arrayList2 = new ArrayList(zzhrVar3.zza());
/* 1027 */                              int i14 = -1;
/* 1028 */                              int i15 = -1;
/* 1037 */                              for (int i16 = 0; i16 < arrayList2.size(); i16++) {
/* 1053 */                                  if (FirebaseAnalytics.Param.VALUE.equals(((zzhw) arrayList2.get(i16)).zzb())) {
/* 1055 */                                      i14 = i16;
                                            } else if (FirebaseAnalytics.Param.CURRENCY.equals(((zzhw) arrayList2.get(i16)).zzb())) {
/* 1073 */                                      i15 = i16;
                                            }
                                        }
/* 1078 */                              if (i14 != -1) {
/* 1092 */                                  if (((zzhw) arrayList2.get(i14)).zze() || ((zzhw) arrayList2.get(i14)).zzi()) {
/* 1131 */                                      if (i15 != -1) {
/* 1140 */                                          String strZzd = ((zzhw) arrayList2.get(i15)).zzd();
/* 1149 */                                          if (strZzd.length() == 3) {
/* 1151 */                                              int iCharCount = 0;
/* 1156 */                                              while (iCharCount < strZzd.length()) {
/* 1158 */                                                  int iCodePointAt = strZzd.codePointAt(iCharCount);
/* 1166 */                                                  if (Character.isLetter(iCodePointAt)) {
/* 1172 */                                                      iCharCount += Character.charCount(iCodePointAt);
                                                            }
                                                        }
                                                    }
                                                }
/* 1182 */                                      mp3Var.mo4557a().f17531V.m8510a("Value parameter discarded. You must also supply a 3-letter ISO_4217 currency code in the currency parameter.");
/* 1185 */                                      zzhrVar3.zzj(i14);
/* 1188 */                                      m6724C(zzhrVar3, "_c");
/* 1193 */                                      m6730c0(zzhrVar3, 19, FirebaseAnalytics.Param.CURRENCY);
                                                break;
                                            }
/* 1114 */                                  mp3Var.mo4557a().f17531V.m8510a("Value must be specified with a numeric type.");
/* 1117 */                                  zzhrVar3.zzj(i14);
/* 1120 */                                  m6724C(zzhrVar3, "_c");
/* 1125 */                                  m6730c0(zzhrVar3, 18, FirebaseAnalytics.Param.VALUE);
                                        }
                                    }
/* 1206 */                          if ("_e".equals(zzhrVar3.zzk())) {
/* 1208 */                              mp3Var.m6761i0();
/* 1221 */                              if (ci3.m1661H((zzhs) zzhrVar3.zzbc(), "_fr") == null) {
/* 1223 */                                  if (zzhrVar2 != null && Math.abs(zzhrVar2.zzn() - zzhrVar3.zzn()) <= 1000) {
/* 1246 */                                      zzhr zzhrVar4 = (zzhr) zzhrVar2.clone();
/* 1252 */                                      if (mp3Var.m6737I(zzhrVar3, zzhrVar4)) {
/* 1254 */                                          zzicVar.zzf(i7, zzhrVar4);
/* 1257 */                                          i8 = i12;
/* 1259 */                                          zzhrVar = null;
/* 1261 */                                          zzhrVar2 = null;
                                                }
                                            }
/* 1264 */                                  zzhrVar = zzhrVar3;
/* 1266 */                                  i8 = i;
                                        } else {
/* 1347 */                                  i8 = i12;
                                        }
                                    } else if ("_vs".equals(zzhrVar3.zzk())) {
/* 1284 */                              mp3Var.m6761i0();
/* 1299 */                              if (ci3.m1661H((zzhs) zzhrVar3.zzbc(), "_et") == null) {
/* 1301 */                                  if (zzhrVar != null && Math.abs(zzhrVar.zzn() - zzhrVar3.zzn()) <= 1000) {
/* 1324 */                                      zzhr zzhrVar5 = (zzhr) zzhrVar.clone();
/* 1330 */                                      if (mp3Var.m6737I(zzhrVar5, zzhrVar3)) {
/* 1334 */                                          zzicVar.zzf(i12, zzhrVar5);
/* 1337 */                                          i8 = i12;
/* 1259 */                                          zzhrVar = null;
/* 1261 */                                          zzhrVar2 = null;
                                                }
                                            }
/* 1341 */                                  i8 = i12;
/* 1342 */                                  zzhrVar2 = zzhrVar3;
/* 1344 */                                  i7 = i;
                                        } else {
/* 1347 */                                  i8 = i12;
                                        }
                                    } else {
/* 1347 */                              i8 = i12;
                                    }
/* 1352 */                          if (zzhrVar3.zzb() != 0) {
/* 1354 */                              mp3Var.m6761i0();
/* 1361 */                              Bundle bundleM1660G = ci3.m1660G(zzhrVar3.zza());
/* 1365 */                              int i17 = 0;
/* 1370 */                              while (i17 < zzhrVar3.zzb()) {
/* 1372 */                                  zzhw zzhwVarZzc2 = zzhrVar3.zzc(i17);
/* 1380 */                                  String str10 = str9;
/* 1386 */                                  if (!zzhwVarZzc2.zzb().equals(str10) || zzhwVarZzc2.zzk().isEmpty()) {
/* 1504 */                                      i6 = i17;
/* 1514 */                                      if (!zzhwVarZzc2.zzb().equals(str10)) {
/* 1534 */                                          mp3Var.m6782w(zzhrVar3.zzk(), (zzhv) zzhwVarZzc2.zzcl(), bundleM1660G, ((zzid) ji3Var.f12320b).zzA());
                                                }
                                            } else {
/* 1402 */                                      String strZzA2 = ((zzid) ji3Var.f12320b).zzA();
/* 1406 */                                      List listZzk = zzhwVarZzc2.zzk();
/* 1414 */                                      Bundle[] bundleArr = new Bundle[listZzk.size()];
/* 1416 */                                      int i18 = 0;
/* 1421 */                                      while (i18 < listZzk.size()) {
/* 1427 */                                          zzhw zzhwVar = (zzhw) listZzk.get(i18);
/* 1429 */                                          mp3Var.m6761i0();
/* 1436 */                                          Bundle bundleM1660G2 = ci3.m1660G(zzhwVar.zzk());
/* 1444 */                                          Iterator it = zzhwVar.zzk().iterator();
/* 1452 */                                          while (it.hasNext()) {
/* 1476 */                                              mp3Var.m6782w(zzhrVar3.zzk(), (zzhv) ((zzhw) it.next()).zzcl(), bundleM1660G2, strZzA2);
/* 1479 */                                              i17 = i17;
/* 1481 */                                              listZzk = listZzk;
                                                    }
/* 1488 */                                          bundleArr[i18] = bundleM1660G2;
/* 1490 */                                          i18++;
/* 1492 */                                          i17 = i17;
/* 1494 */                                          listZzk = listZzk;
                                                }
/* 1498 */                                      i6 = i17;
/* 1500 */                                      bundleM1660G.putParcelableArray(str10, bundleArr);
                                            }
/* 1537 */                                  i17 = i6 + 1;
/* 1539 */                                  str9 = str10;
                                        }
/* 1544 */                              str5 = str9;
/* 1546 */                              zzhrVar3.zzi();
/* 1549 */                              ci3 ci3VarM6761i0 = mp3Var.m6761i0();
/* 1555 */                              ArrayList arrayList3 = new ArrayList();
/* 1570 */                              for (String str11 : bundleM1660G.keySet()) {
/* 1578 */                                  zzhv zzhvVarZzn6 = zzhw.zzn();
/* 1582 */                                  zzhvVarZzn6.zzb(str11);
/* 1585 */                                  Object obj = bundleM1660G.get(str11);
/* 1589 */                                  if (obj != null) {
/* 1591 */                                      ci3VarM6761i0.m1686Z(zzhvVarZzn6, obj);
/* 1600 */                                      arrayList3.add((zzhw) zzhvVarZzn6.zzbc());
                                            }
                                        }
/* 1604 */                              Iterator it2 = arrayList3.iterator();
/* 1612 */                              while (it2.hasNext()) {
/* 1620 */                                  zzhrVar3.zzf((zzhw) it2.next());
                                        }
                                    } else {
/* 1624 */                              str5 = str9;
                                    }
/* 1636 */                          i5 = i11;
/* 1638 */                          ((ArrayList) ji3Var.f12322d).set(i5, (zzhs) zzhrVar3.zzbc());
/* 1641 */                          zzicVar.zzg(zzhrVar3);
/* 1644 */                          i10 = i + 1;
                                }
/* 293 */                       z7 = z9;
/* 1648 */                      i9 = i5 + 1;
/* 1650 */                      str8 = str5;
/* 1651 */                      l4 = l;
/* 1653 */                      str6 = str3;
/* 1655 */                      str7 = str4;
                            }
/* 1664 */                  long j5 = 0;
/* 1666 */                  long jLongValue = 0;
/* 1667 */                  int i19 = i;
/* 1669 */                  int i20 = 0;
/* 1670 */                  while (i20 < i19) {
/* 1672 */                      zzhs zzhsVarZzd = zzicVar.zzd(i20);
/* 1684 */                      if ("_e".equals(zzhsVarZzd.zzd())) {
/* 1686 */                          mp3Var.m6761i0();
/* 1693 */                          if (ci3.m1661H(zzhsVarZzd, "_fr") != null) {
/* 1695 */                              zzicVar.zzj(i20);
/* 1698 */                              i19--;
/* 1700 */                              i20--;
                                    } else {
/* 1703 */                              mp3Var.m6761i0();
/* 1706 */                              zzhwVarM1661H = ci3.m1661H(zzhsVarZzd, "_et");
/* 1710 */                              if (zzhwVarM1661H == null) {
/* 1716 */                                  if (zzhwVarM1661H.zze()) {
/* 1722 */                                      lValueOf = Long.valueOf(zzhwVarM1661H.zzf());
                                            } else {
/* 1727 */                                      lValueOf = null;
                                            }
/* 1728 */                                  if (lValueOf == null && lValueOf.longValue() > 0) {
/* 1742 */                                      jLongValue += lValueOf.longValue();
                                            }
                                        }
                                    }
                                } else {
/* 1703 */                          mp3Var.m6761i0();
/* 1706 */                          zzhwVarM1661H = ci3.m1661H(zzhsVarZzd, "_et");
/* 1710 */                          if (zzhwVarM1661H == null) {
/* 1716 */                              if (zzhwVarM1661H.zze()) {
/* 1722 */                                  lValueOf = Long.valueOf(zzhwVarM1661H.zzf());
                                        } else {
/* 1727 */                                  lValueOf = null;
                                        }
/* 1728 */                              if (lValueOf == null) {
                                        }
                                    }
                                }
/* 1743 */                      i20++;
                            }
/* 1747 */                  mp3Var.m6736H(zzicVar, jLongValue, false);
/* 1754 */                  Iterator it3 = zzicVar.zzb().iterator();
/* 1764 */                  while (it3.hasNext()) {
/* 1782 */                      if ("_s".equals(((zzhs) it3.next()).zzd())) {
/* 1792 */                          mp3Var.m6755f0().m264t0(zzicVar.zzK(), "_se");
                                    break;
                                }
                            }
/* 1801 */                  if (ci3.m1678n0(zzicVar, "_sid") >= 0) {
/* 1805 */                      mp3Var.m6736H(zzicVar, jLongValue, true);
                            } else {
/* 1809 */                      int iM1678n0 = ci3.m1678n0(zzicVar, "_se");
/* 1813 */                      if (iM1678n0 >= 0) {
/* 1815 */                          zzicVar.zzr(iM1678n0);
/* 1840 */                          mp3Var.mo4557a().m9016D().m8511b(uh3.m9013H(((zzid) ji3Var.f12320b).zzA()), "Session engagement user property is in the bundle without session ID. appId");
                                }
                            }
/* 1847 */                  String strZzA3 = ((zzid) ji3Var.f12320b).zzA();
/* 1855 */                  mp3Var.mo4558b().mo1375y();
/* 1858 */                  mp3Var.m6765k0();
/* 1865 */                  di3 di3VarM219D0 = mp3Var.m6755f0().m219D0(strZzA3);
/* 1869 */                  if (di3VarM219D0 == null) {
/* 1885 */                      mp3Var.mo4557a().m9016D().m8511b(uh3.m9013H(strZzA3), "Cannot fix consent fields without appInfo. appId");
                            } else {
/* 1889 */                      mp3Var.m6768m(di3VarM219D0, zzicVar);
                            }
/* 1896 */                  String strZzA4 = ((zzid) ji3Var.f12320b).zzA();
/* 1904 */                  mp3Var.mo4558b().mo1375y();
/* 1907 */                  mp3Var.m6765k0();
/* 1914 */                  di3 di3VarM219D1 = mp3Var.m6755f0().m219D0(strZzA4);
/* 1918 */                  if (di3VarM219D1 == null) {
/* 1934 */                      mp3Var.mo4557a().m9017E().m8511b(uh3.m9013H(strZzA4), "Cannot populate ad_campaign_info without appInfo. appId");
                            } else {
/* 1938 */                      mp3Var.m6770n(di3VarM219D1, zzicVar);
                            }
/* 1941 */                  m6727R(zzicVar);
/* 1944 */                  zzicVar.zzak();
/* 1947 */                  ok3 ok3Var = ok3.f14791c;
/* 1975 */                  ok3 ok3VarM7190j = mp3Var.m6752d(((zzid) ji3Var.f12320b).zzA()).m7190j(ok3.m7182c(100, ((zzid) ji3Var.f12320b).zzaf()));
/* 1991 */                  ok3 ok3VarM254i0 = mp3Var.m6755f0().m254i0(((zzid) ji3Var.f12320b).zzA());
/* 2007 */                  mp3Var.m6755f0().m253h0(((zzid) ji3Var.f12320b).zzA(), ok3VarM7190j);
/* 2010 */                  nk3 nk3Var = nk3.ANALYTICS_STORAGE;
/* 2016 */                  if (!ok3VarM7190j.m7189i(nk3Var) && ok3VarM254i0.m7189i(nk3Var)) {
/* 2036 */                      mp3Var.m6755f0().m262r0(((zzid) ji3Var.f12320b).zzA());
                            } else if (ok3VarM7190j.m7189i(nk3Var) && !ok3VarM254i0.m7189i(nk3Var)) {
/* 2064 */                      mp3Var.m6755f0().m263s0(((zzid) ji3Var.f12320b).zzA());
                            }
/* 2067 */                  nk3 nk3Var2 = nk3.AD_STORAGE;
/* 2073 */                  if (!ok3VarM7190j.m7189i(nk3Var2)) {
/* 2075 */                      zzicVar.zzR();
/* 2078 */                      zzicVar.zzU();
/* 2081 */                      zzicVar.zzan();
                            }
/* 2088 */                  if (!ok3VarM7190j.m7189i(nk3Var)) {
/* 2090 */                      zzicVar.zzX();
/* 2093 */                      zzicVar.zzav();
                            }
/* 2096 */                  zzql.zza();
/* 2117 */                  if (mp3Var.m6753d0().m7406J(((zzid) ji3Var.f12320b).zzA(), vg3.f18094P0)) {
/* 2119 */                      mp3Var.m6763j0();
/* 2134 */                      if (up3.m9066V(((zzid) ji3Var.f12320b).zzA()) && mp3Var.m6752d(((zzid) ji3Var.f12320b).zzA()).m7189i(nk3Var2) && ((zzid) ji3Var.f12320b).zzak()) {
/* 2164 */                          int i21 = 0;
/* 2169 */                          while (i21 < zzicVar.zzc()) {
/* 2179 */                              zzhr zzhrVar6 = (zzhr) zzicVar.zzd(i21).zzcl();
/* 2185 */                              Iterator it4 = zzhrVar6.zza().iterator();
                                        while (true) {
/* 2193 */                                  if (!it4.hasNext()) {
/* 2650 */                                      j4 = j5;
                                                break;
                                            }
/* 2209 */                                  if ("_c".equals(((zzhw) it4.next()).zzb())) {
/* 2237 */                                      if (((zzid) ji3Var.f12320b).zzar() >= mp3Var.m6753d0().m7404H(((zzid) ji3Var.f12320b).zzA(), vg3.f18148l0)) {
/* 2253 */                                          int iM7404H = mp3Var.m6753d0().m7404H(((zzid) ji3Var.f12320b).zzA(), vg3.f18174y0);
/* 2257 */                                          LinkedList linkedList = mp3Var.f13912b0;
/* 2265 */                                          if (iM7404H > 0) {
/* 2295 */                                              j4 = j5;
/* 2304 */                                              if (mp3Var.m6755f0().m223F0(false, false, false, true, ((zzid) ji3Var.f12320b).zzA(), mp3Var.m6756g()).f17483g > iM7404H) {
/* 2306 */                                                  zzhv zzhvVarZzn7 = zzhw.zzn();
/* 2312 */                                                  zzhvVarZzn7.zzb("_tnr");
/* 2317 */                                                  zzhvVarZzn7.zzf(1L);
/* 2326 */                                                  zzhrVar6.zzf((zzhw) zzhvVarZzn7.zzbc());
                                                        } else {
/* 2349 */                                                  if (m6753d0().m7406J(((zzid) ji3Var.f12320b).zzA(), vg3.f18098R0)) {
/* 2355 */                                                      strM9112r1 = m6763j0().m9112r0();
/* 2359 */                                                      zzhv zzhvVarZzn8 = zzhw.zzn();
/* 2363 */                                                      zzhvVarZzn8.zzb("_tu");
/* 2366 */                                                      zzhvVarZzn8.zzd(strM9112r1);
/* 2375 */                                                      zzhrVar6.zzf((zzhw) zzhvVarZzn8.zzbc());
                                                            } else {
/* 2379 */                                                      strM9112r1 = null;
                                                            }
/* 2380 */                                                  zzhv zzhvVarZzn9 = zzhw.zzn();
/* 2384 */                                                  zzhvVarZzn9.zzb("_tr");
/* 2389 */                                                  zzhvVarZzn9.zzf(1L);
/* 2398 */                                                  zzhrVar6.zzf((zzhw) zzhvVarZzn9.zzbc());
/* 2413 */                                                  zzog zzogVarM1687a0 = m6761i0().m1687a0(((zzid) ji3Var.f12320b).zzA(), zzicVar, zzhrVar6, strM9112r1);
/* 2417 */                                                  if (zzogVarM1687a0 != null) {
/* 2437 */                                                      mo4557a().m9019G().m8512c(((zzid) ji3Var.f12320b).zzA(), "Generated trigger URI. appId, uri", zzogVarM1687a0.f4215a);
/* 2452 */                                                      m6755f0().m251f0(((zzid) ji3Var.f12320b).zzA(), zzogVarM1687a0);
/* 2467 */                                                      if (!linkedList.contains(((zzid) ji3Var.f12320b).zzA())) {
/* 2477 */                                                          linkedList.add(((zzid) ji3Var.f12320b).zzA());
                                                                }
                                                            }
                                                        }
                                                    } else {
/* 2482 */                                              j4 = j5;
/* 2502 */                                              if (m6753d0().m7406J(((zzid) ji3Var.f12320b).zzA(), vg3.f18098R0)) {
/* 2508 */                                                  strM9112r0 = m6763j0().m9112r0();
/* 2512 */                                                  zzhv zzhvVarZzn10 = zzhw.zzn();
/* 2516 */                                                  zzhvVarZzn10.zzb("_tu");
/* 2519 */                                                  zzhvVarZzn10.zzd(strM9112r0);
/* 2528 */                                                  zzhrVar6.zzf((zzhw) zzhvVarZzn10.zzbc());
                                                        } else {
/* 2532 */                                                  strM9112r0 = null;
                                                        }
/* 2533 */                                              zzhv zzhvVarZzn11 = zzhw.zzn();
/* 2537 */                                              zzhvVarZzn11.zzb("_tr");
/* 2542 */                                              zzhvVarZzn11.zzf(1L);
/* 2551 */                                              zzhrVar6.zzf((zzhw) zzhvVarZzn11.zzbc());
/* 2566 */                                              zzog zzogVarM1687a1 = m6761i0().m1687a0(((zzid) ji3Var.f12320b).zzA(), zzicVar, zzhrVar6, strM9112r0);
/* 2570 */                                              if (zzogVarM1687a1 != null) {
/* 2590 */                                                  mo4557a().m9019G().m8512c(((zzid) ji3Var.f12320b).zzA(), "Generated trigger URI. appId, uri", zzogVarM1687a1.f4215a);
/* 2605 */                                                  m6755f0().m251f0(((zzid) ji3Var.f12320b).zzA(), zzogVarM1687a1);
/* 2620 */                                                  if (!linkedList.contains(((zzid) ji3Var.f12320b).zzA())) {
/* 2630 */                                                      linkedList.add(((zzid) ji3Var.f12320b).zzA());
                                                            }
                                                        }
                                                    }
                                                } else {
/* 2634 */                                          j4 = j5;
                                                }
/* 2642 */                                      zzicVar.zze(i21, (zzhs) zzhrVar6.zzbc());
                                                break;
                                            }
/* 2646 */                                  mp3Var = this;
                                        }
/* 2652 */                              i21++;
/* 2654 */                              mp3Var = this;
/* 2656 */                              j5 = j4;
                                    }
                                }
                            }
/* 2660 */                  long j6 = j5;
/* 2662 */                  zzicVar.zzag();
/* 2712 */                  zzicVar.zzaf(m6759h0().m3751D(zzicVar.zzK(), zzicVar.zzb(), zzicVar.zzk(), Long.valueOf(zzicVar.zzu()), Long.valueOf(zzicVar.zzw()), !ok3VarM7190j.m7189i(nk3Var)));
/* 2731 */                  if (m6753d0().m7398B(((zzid) ji3Var.f12320b).zzA())) {
/* 2735 */                      HashMap map = new HashMap();
/* 2740 */                      ArrayList arrayList4 = new ArrayList();
/* 2747 */                      SecureRandom secureRandomM9116w0 = m6763j0().m9116w0();
/* 2751 */                      int i22 = 0;
/* 2758 */                      while (i22 < zzicVar.zzc()) {
/* 2769 */                          zzhr zzhrVar7 = (zzhr) zzicVar.zzd(i22).zzcl();
/* 2785 */                          if (zzhrVar7.zzk().equals("_ep")) {
/* 2787 */                              m6761i0();
/* 2802 */                              String str12 = (String) ci3.m1662I((zzhs) zzhrVar7.zzbc(), "_en");
/* 2808 */                              pe3 pe3VarM246Z = (pe3) map.get(str12);
/* 2810 */                              if (pe3VarM246Z == null) {
/* 2812 */                                  ae3 ae3VarM6755f0 = m6755f0();
/* 2820 */                                  String strZzA5 = ((zzid) ji3Var.f12320b).zzA();
/* 2824 */                                  kb1.m6061n(str12);
/* 2827 */                                  pe3VarM246Z = ae3VarM6755f0.m246Z("events", strZzA5, str12);
/* 2831 */                                  if (pe3VarM246Z != null) {
/* 2833 */                                      map.put(str12, pe3VarM246Z);
                                            }
                                        }
/* 2836 */                              if (pe3VarM246Z == null || pe3VarM246Z.f15088i != null) {
/* 2896 */                                  l2 = l;
                                        } else {
/* 2842 */                                  Long l5 = pe3VarM246Z.f15089j;
/* 2844 */                                  if (l5 != null && l5.longValue() > 1) {
/* 2856 */                                      m6761i0();
/* 2859 */                                      ci3.m1659F(zzhrVar7, "_sr", l5);
                                            }
/* 2865 */                                  Boolean bool = pe3VarM246Z.f15090k;
/* 2867 */                                  if (bool == null || !bool.booleanValue()) {
/* 2884 */                                      l2 = l;
                                            } else {
/* 2875 */                                      m6761i0();
/* 2878 */                                      l2 = l;
/* 2880 */                                      ci3.m1659F(zzhrVar7, "_efs", l2);
                                            }
/* 2892 */                                  arrayList4.add((zzhs) zzhrVar7.zzbc());
                                        }
/* 2900 */                              zzicVar.zzf(i22, zzhrVar7);
                                    } else {
/* 2907 */                              l2 = l;
/* 2911 */                              vi3 vi3VarM6754e0 = m6754e0();
/* 2919 */                              String strZzA6 = ((zzid) ji3Var.f12320b).zzA();
/* 2925 */                              String strMo7139d = vi3VarM6754e0.mo7139d(strZzA6, "measurement.account.time_zone_offset_minutes");
/* 2933 */                              if (TextUtils.isEmpty(strMo7139d)) {
/* 2962 */                                  j2 = j6;
                                        } else {
                                            try {
/* 2935 */                                      j2 = Long.parseLong(strMo7139d);
                                            } catch (NumberFormatException e) {
/* 2959 */                                      ((ij3) vi3VarM6754e0.f16749a).mo4557a().m9017E().m8512c(uh3.m9013H(strZzA6), "Unable to parse timezone offset. appId", e);
/* 2962 */                                      j2 = j6;
                                            }
                                        }
/* 2964 */                              m6763j0();
/* 2974 */                              long j7 = j2 * 60000;
/* 2980 */                              long jZzn = (zzhrVar7.zzn() + j7) / 86400000;
/* 2986 */                              zzhs zzhsVar = (zzhs) zzhrVar7.zzbc();
/* 2996 */                              if (!TextUtils.isEmpty("_dbg")) {
/* 3002 */                                  Iterator it5 = zzhsVar.zza().iterator();
                                            while (true) {
/* 3010 */                                      if (it5.hasNext()) {
/* 3016 */                                          zzhw zzhwVar2 = (zzhw) it5.next();
/* 3028 */                                          if ("_dbg".equals(zzhwVar2.zzb())) {
/* 3042 */                                              if (l2.equals(Long.valueOf(zzhwVar2.zzf()))) {
/* 3045 */                                                  iM9291Q = 1;
                                                            break;
                                                        }
                                                    }
                                                }
/* 3063 */                                      iM9291Q = m6754e0().m9291Q(((zzid) ji3Var.f12320b).zzA(), zzhrVar7.zzk());
                                                break;
                                            }
                                        }
/* 3063 */                              iM9291Q = m6754e0().m9291Q(((zzid) ji3Var.f12320b).zzA(), zzhrVar7.zzk());
                                        break;
/* 3067 */                              if (iM9291Q <= 0) {
/* 3087 */                                  mo4557a().m9017E().m8512c(zzhrVar7.zzk(), "Sample rate must be positive. event, rate", Integer.valueOf(iM9291Q));
/* 3096 */                                  arrayList4.add((zzhs) zzhrVar7.zzbc());
/* 3099 */                                  zzicVar.zzf(i22, zzhrVar7);
                                        } else {
/* 3112 */                                  pe3 pe3VarM7413b = (pe3) map.get(zzhrVar7.zzk());
/* 3114 */                                  if (pe3VarM7413b == null) {
/* 3128 */                                      j3 = jZzn;
/* 3134 */                                      pe3VarM7413b = m6755f0().m246Z("events", ((zzid) ji3Var.f12320b).zzA(), zzhrVar7.zzk());
/* 3138 */                                      if (pe3VarM7413b == null) {
/* 3162 */                                          mo4557a().m9017E().m8512c(((zzid) ji3Var.f12320b).zzA(), "Event being bundled has no eventAggregate. appId, eventName", zzhrVar7.zzk());
/* 3199 */                                          pe3VarM7413b = new pe3(((zzid) ji3Var.f12320b).zzA(), zzhrVar7.zzk(), 1L, 1L, 1L, zzhrVar7.zzn(), 0L, null, null, null, null);
                                                }
                                            } else {
/* 3205 */                                      j3 = jZzn;
                                            }
/* 3207 */                                  m6761i0();
/* 3222 */                                  Long l6 = (Long) ci3.m1662I((zzhs) zzhrVar7.zzbc(), "_eid");
/* 3230 */                                  boolean z10 = l6 != null;
/* 3233 */                                  if (iM9291Q == 1) {
/* 3241 */                                      arrayList4.add((zzhs) zzhrVar7.zzbc());
/* 3244 */                                      if (z10 && (pe3VarM7413b.f15088i != null || pe3VarM7413b.f15089j != null || pe3VarM7413b.f15090k != null)) {
/* 3267 */                                          map.put(zzhrVar7.zzk(), pe3VarM7413b.m7413b(null, null, null));
                                                }
/* 3270 */                                      zzicVar.zzf(i22, zzhrVar7);
                                            } else {
/* 3279 */                                      if (secureRandomM9116w0.nextInt(iM9291Q) == 0) {
/* 3281 */                                          m6761i0();
/* 3285 */                                          Long lValueOf2 = Long.valueOf(iM9291Q);
/* 3289 */                                          ci3.m1659F(zzhrVar7, "_sr", lValueOf2);
/* 3298 */                                          arrayList4.add((zzhs) zzhrVar7.zzbc());
/* 3301 */                                          if (z10) {
/* 3304 */                                              pe3VarM7413b = pe3VarM7413b.m7413b(null, lValueOf2, null);
                                                    }
/* 3363 */                                          map.put(zzhrVar7.zzk(), new pe3(pe3VarM7413b.f15080a, pe3VarM7413b.f15081b, pe3VarM7413b.f15082c, pe3VarM7413b.f15083d, pe3VarM7413b.f15084e, pe3VarM7413b.f15085f, zzhrVar7.zzn(), Long.valueOf(j3), pe3VarM7413b.f15088i, pe3VarM7413b.f15089j, pe3VarM7413b.f15090k));
/* 3366 */                                          l3 = l2;
                                                } else {
/* 3370 */                                          Long l7 = pe3VarM7413b.f15087h;
/* 3372 */                                          if (l7 != null) {
/* 3374 */                                              jZzp = l7.longValue();
                                                    } else {
/* 3379 */                                              m6763j0();
/* 3388 */                                              jZzp = (j7 + zzhrVar7.zzp()) / 86400000;
                                                    }
/* 3392 */                                          if (jZzp != j3) {
/* 3394 */                                              m6761i0();
/* 3397 */                                              ci3.m1659F(zzhrVar7, "_efs", l2);
/* 3400 */                                              m6761i0();
/* 3404 */                                              Long lValueOf3 = Long.valueOf(iM9291Q);
/* 3408 */                                              ci3.m1659F(zzhrVar7, "_sr", lValueOf3);
/* 3417 */                                              arrayList4.add((zzhs) zzhrVar7.zzbc());
/* 3420 */                                              if (z10) {
/* 3425 */                                                  pe3VarM7413b = pe3VarM7413b.m7413b(null, lValueOf3, Boolean.TRUE);
                                                        }
/* 3455 */                                              l3 = l2;
/* 3485 */                                              map.put(zzhrVar7.zzk(), new pe3(pe3VarM7413b.f15080a, pe3VarM7413b.f15081b, pe3VarM7413b.f15082c, pe3VarM7413b.f15083d, pe3VarM7413b.f15084e, pe3VarM7413b.f15085f, zzhrVar7.zzn(), Long.valueOf(j3), pe3VarM7413b.f15088i, pe3VarM7413b.f15089j, pe3VarM7413b.f15090k));
                                                    } else {
/* 3489 */                                              l3 = l2;
/* 3490 */                                              if (z10) {
/* 3501 */                                                  map.put(zzhrVar7.zzk(), pe3VarM7413b.m7413b(l6, null, null));
                                                        }
/* 3504 */                                              zzicVar.zzf(i22, zzhrVar7);
                                                    }
                                                }
/* 3504 */                                      zzicVar.zzf(i22, zzhrVar7);
                                            }
/* 3507 */                                  i22++;
/* 3509 */                                  l = l3;
                                        }
                                    }
/* 2903 */                          l3 = l2;
/* 3507 */                          i22++;
/* 3509 */                          l = l3;
                                }
/* 3521 */                      if (arrayList4.size() < zzicVar.zzc()) {
/* 3523 */                          zzicVar.zzi();
/* 3526 */                          zzicVar.zzh(arrayList4);
                                }
/* 3533 */                      Iterator it6 = map.entrySet().iterator();
/* 3541 */                      while (it6.hasNext()) {
/* 3559 */                          m6755f0().m247a0("events", (pe3) ((Map.Entry) it6.next()).getValue());
                                }
                            }
/* 3567 */                  String strZzA7 = ((zzid) ji3Var.f12320b).zzA();
/* 3575 */                  di3 di3VarM219D2 = m6755f0().m219D0(strZzA7);
/* 3579 */                  if (di3VarM219D2 == null) {
/* 3603 */                      mo4557a().m9016D().m8511b(uh3.m9013H(((zzid) ji3Var.f12320b).zzA()), "Bundling raw events w/o app info. appId");
                            } else if (zzicVar.zzc() > 0) {
/* 3616 */                      bj3 bj3Var = di3VarM219D2.f7242a.f9659i;
/* 3618 */                      ij3.m4555l(bj3Var);
/* 3621 */                      bj3Var.mo1375y();
/* 3624 */                      long j8 = di3VarM219D2.f7250i;
/* 3628 */                      if (j8 != j6) {
/* 3630 */                          zzicVar.zzA(j8);
                                } else {
/* 3634 */                          zzicVar.zzB();
                                }
/* 3639 */                      bj3 bj3Var2 = di3VarM219D2.f7242a.f9659i;
/* 3641 */                      ij3.m4555l(bj3Var2);
/* 3644 */                      bj3Var2.mo1375y();
/* 3647 */                      long j9 = di3VarM219D2.f7249h;
/* 3651 */                      if (j9 != j6) {
/* 3654 */                          j8 = j9;
                                }
/* 3657 */                      if (j8 != j6) {
/* 3659 */                          zzicVar.zzy(j8);
                                } else {
/* 3663 */                          zzicVar.zzz();
                                }
/* 3671 */                      di3VarM219D2.m3116h(zzicVar.zzc());
/* 3676 */                      bj3 bj3Var3 = di3VarM219D2.f7242a.f9659i;
/* 3678 */                      ij3.m4555l(bj3Var3);
/* 3681 */                      bj3Var3.mo1375y();
/* 3687 */                      zzicVar.zzaJ((int) di3VarM219D2.f7228F);
/* 3692 */                      bj3 bj3Var4 = di3VarM219D2.f7242a.f9659i;
/* 3694 */                      ij3.m4555l(bj3Var4);
/* 3697 */                      bj3Var4.mo1375y();
/* 3703 */                      zzicVar.zzZ((int) di3VarM219D2.f7248g);
/* 3710 */                      di3VarM219D2.m3101L(zzicVar.zzu());
/* 3717 */                      di3VarM219D2.m3102M(zzicVar.zzw());
/* 3720 */                      String strM3129u = di3VarM219D2.m3129u();
/* 3724 */                      if (strM3129u != null) {
/* 3726 */                          zzicVar.zzaa(strM3129u);
                                } else {
/* 3730 */                          zzicVar.zzab();
                                }
/* 3738 */                      m6755f0().m221E0(di3VarM219D2, false);
                            }
/* 3745 */                  if (zzicVar.zzc() > 0) {
/* 3747 */                      ij3Var.getClass();
/* 3762 */                      zzgl zzglVarM9286L = m6754e0().m9286L(((zzid) ji3Var.f12320b).zzA());
/* 3766 */                      if (zzglVarM9286L != null && zzglVarM9286L.zza()) {
/* 3779 */                          zzicVar.zzal(zzglVarM9286L.zzb());
                                } else if (((zzid) ji3Var.f12320b).zzP().isEmpty()) {
/* 3799 */                          zzicVar.zzal(-1L);
                                } else {
/* 3825 */                          mo4557a().m9017E().m8511b(uh3.m9013H(((zzid) ji3Var.f12320b).zzA()), "Did not find measurement config or missing version info. appId");
                                }
/* 3840 */                      m6755f0().m229I0((zzid) zzicVar.zzbc(), z8);
                            }
/* 3851 */                  m6755f0().m236P((ArrayList) ji3Var.f12321c);
/* 3858 */                  m6755f0().m237Q(strZzA7);
/* 3865 */                  m6755f0().m259o0();
/* 3868 */                  z = true;
                        }
/* 3882 */              m6755f0().m260p0();
/* 3885 */              return z;
                    } catch (Throwable th) {
/* 3890 */              m6755f0().m260p0();
/* 3893 */              throw th;
                    }
                }

                /* JADX INFO: renamed from: H */
                public final void m6736H(zzic zzicVar, long j, boolean z) {
                    rp3 rp3Var;
                    Object obj;
/* 8 */             String str = true != z ? "_lte" : "_se";
/* 11 */            ae3 ae3Var = this.f13913c;
/* 13 */            m6728S(ae3Var);
/* 20 */            rp3 rp3VarM266v0 = ae3Var.m266v0(zzicVar.zzK(), str);
/* 24 */            if (rp3VarM266v0 == null || (obj = rp3VarM266v0.f16228e) == null) {
/* 69 */                String strZzK = zzicVar.zzK();
/* 79 */                ((xt0) mo4562f()).getClass();
/* 92 */                rp3Var = new rp3(strZzK, "auto", str, System.currentTimeMillis(), Long.valueOf(j));
                    } else {
/* 33 */                String strZzK2 = zzicVar.zzK();
/* 43 */                ((xt0) mo4562f()).getClass();
/* 63 */                rp3Var = new rp3(strZzK2, "auto", str, System.currentTimeMillis(), Long.valueOf(((Long) obj).longValue() + j));
                    }
/* 95 */            zzit zzitVarZzm = zziu.zzm();
/* 99 */            zzitVarZzm.zzb(str);
/* 108 */           ((xt0) mo4562f()).getClass();
/* 115 */           zzitVarZzm.zza(System.currentTimeMillis());
/* 118 */           Object obj2 = rp3Var.f16228e;
/* 127 */           zzitVarZzm.zze(((Long) obj2).longValue());
/* 134 */           zziu zziuVar = (zziu) zzitVarZzm.zzbc();
/* 136 */           int iM1678n0 = ci3.m1678n0(zzicVar, str);
/* 140 */           if (iM1678n0 >= 0) {
/* 142 */               zzicVar.zzn(iM1678n0, zziuVar);
                    } else {
/* 146 */               zzicVar.zzo(zziuVar);
                    }
/* 153 */           if (j > 0) {
/* 155 */               ae3 ae3Var2 = this.f13913c;
/* 157 */               m6728S(ae3Var2);
/* 160 */               ae3Var2.m265u0(rp3Var);
/* 178 */               mo4557a().f17534Y.m8512c(true != z ? "lifetime" : "session-scoped", "Updated engagement user property. scope, value", obj2);
                    }
                }

                /* JADX INFO: renamed from: I */
                public final boolean m6737I(zzhr zzhrVar, zzhr zzhrVar2) {
/* 11 */            kb1.m6054g("_e".equals(zzhrVar.zzk()));
/* 14 */            m6761i0();
/* 25 */            zzhw zzhwVarM1661H = ci3.m1661H((zzhs) zzhrVar.zzbc(), "_sc");
/* 34 */            String strZzd = zzhwVarM1661H == null ? null : zzhwVarM1661H.zzd();
/* 38 */            m6761i0();
/* 49 */            zzhw zzhwVarM1661H2 = ci3.m1661H((zzhs) zzhrVar2.zzbc(), "_pc");
/* 56 */            String strZzd2 = zzhwVarM1661H2 != null ? zzhwVarM1661H2.zzd() : null;
/* 60 */            if (strZzd2 == null || !strZzd2.equals(strZzd)) {
/* 171 */               return false;
                    }
/* 76 */            kb1.m6054g("_e".equals(zzhrVar.zzk()));
/* 79 */            m6761i0();
/* 90 */            zzhw zzhwVarM1661H3 = ci3.m1661H((zzhs) zzhrVar.zzbc(), "_et");
/* 94 */            if (zzhwVarM1661H3 == null || !zzhwVarM1661H3.zze() || zzhwVarM1661H3.zzf() <= 0) {
/* 169 */               return true;
                    }
/* 113 */           long jZzf = zzhwVarM1661H3.zzf();
/* 117 */           m6761i0();
/* 126 */           zzhw zzhwVarM1661H4 = ci3.m1661H((zzhs) zzhrVar2.zzbc(), "_et");
/* 130 */           if (zzhwVarM1661H4 != null && zzhwVarM1661H4.zzf() > 0) {
/* 144 */               jZzf += zzhwVarM1661H4.zzf();
                    }
/* 145 */           m6761i0();
/* 152 */           ci3.m1659F(zzhrVar2, "_et", Long.valueOf(jZzf));
/* 155 */           m6761i0();
/* 166 */           ci3.m1659F(zzhrVar, "_fr", 1L);
/* 169 */           return true;
                }

                /* JADX INFO: renamed from: J */
                public final boolean m6738J() {
/* 5 */             mo4558b().mo1375y();
/* 8 */             m6765k0();
/* 11 */            ae3 ae3Var = this.f13913c;
/* 13 */            m6728S(ae3Var);
/* 27 */            if (ae3Var.m242V("select count(1) > 0 from raw_events", null) != 0) {
/* 45 */                return true;
                    }
/* 30 */            ae3 ae3Var2 = this.f13913c;
/* 32 */            m6728S(ae3Var2);
                    return !TextUtils.isEmpty(ae3Var2.m226H());
                }

                /* JADX WARN: Code duplicated, block: B:16:0x0093  */
                /* JADX INFO: renamed from: L */
                public final void m6739L() {
                    boolean z;
                    long jMax;
                    long jMax2;
/* 3 */             ci3 ci3Var = this.f13923i;
/* 9 */             mo4558b().mo1375y();
/* 12 */            m6765k0();
/* 21 */            if (this.f13908Z > 0) {
/* 29 */                ((xt0) mo4562f()).getClass();
/* 46 */                long jAbs = 3600000 - Math.abs(SystemClock.elapsedRealtime() - this.f13908Z);
/* 49 */                if (jAbs > 0) {
/* 63 */                    mo4557a().f17534Y.m8511b(Long.valueOf(jAbs), "Upload has been suspended. Will update scheduling later in approximately ms");
/* 70 */                    m6757g0().m3949b();
/* 73 */                    po3 po3Var = this.f13917e;
/* 75 */                    m6728S(po3Var);
/* 78 */                    po3Var.m7531D();
/* 81 */                    return;
                        }
/* 82 */                this.f13908Z = 0L;
                    }
/* 90 */            if (!this.f13905W.m4564h() || !m6738J()) {
/* 868 */               mo4557a().f17534Y.m8510a("Nothing to upload or uploading impossible");
/* 875 */               m6757g0().m3949b();
/* 878 */               po3 po3Var2 = this.f13917e;
/* 880 */               m6728S(po3Var2);
/* 883 */               po3Var2.m7531D();
/* 886 */               return;
                    }
/* 106 */           ((xt0) mo4562f()).getClass();
/* 109 */           long jCurrentTimeMillis = System.currentTimeMillis();
/* 113 */           m6753d0();
/* 129 */           long jMax3 = Math.max(0L, ((Long) vg3.f18091O.m9011a(null)).longValue());
/* 133 */           ae3 ae3Var = this.f13913c;
/* 135 */           m6728S(ae3Var);
/* 146 */           if (ae3Var.m242V("select count(1) > 0 from raw_events where realtime = 1", null) != 0) {
/* 148 */               z = true;
                    } else {
/* 150 */               ae3 ae3Var2 = this.f13913c;
/* 152 */               m6728S(ae3Var2);
/* 163 */               if (ae3Var2.m242V("select count(1) > 0 from queue where has_realtime = 1", null) != 0) {
/* 148 */                   z = true;
                        } else {
/* 166 */                   z = false;
                        }
                    }
/* 167 */           if (z) {
/* 175 */               String strM7400D = m6753d0().m7400D("debug.firebase.analytics.app");
/* 183 */               if (TextUtils.isEmpty(strM7400D) || ".none.".equals(strM7400D)) {
/* 213 */                   m6753d0();
/* 228 */                   jMax = Math.max(0L, ((Long) vg3.f18079I.m9011a(null)).longValue());
                        } else {
/* 193 */                   m6753d0();
/* 208 */                   jMax = Math.max(0L, ((Long) vg3.f18081J.m9011a(null)).longValue());
                        }
                    } else {
/* 233 */               m6753d0();
/* 248 */               jMax = Math.max(0L, ((Long) vg3.f18077H.m9011a(null)).longValue());
                    }
/* 256 */           long jM4932a = this.f13938w.f17198v.m4932a();
/* 264 */           long jM4932a2 = this.f13938w.f17199w.m4932a();
/* 268 */           ae3 ae3Var3 = this.f13913c;
/* 270 */           m6728S(ae3Var3);
/* 275 */           long jM243W = ae3Var3.m243W("select max(bundle_end_timestamp) from queue", null, 0L);
/* 279 */           ae3 ae3Var4 = this.f13913c;
/* 281 */           m6728S(ae3Var4);
/* 294 */           long jMax4 = Math.max(jM243W, ae3Var4.m243W("select max(timestamp) from raw_events", null, 0L));
/* 300 */           if (jMax4 != 0) {
/* 314 */               long jAbs2 = jCurrentTimeMillis - Math.abs(jMax4 - jCurrentTimeMillis);
/* 322 */               long jAbs3 = jCurrentTimeMillis - Math.abs(jM4932a - jCurrentTimeMillis);
/* 330 */               long jAbs4 = jCurrentTimeMillis - Math.abs(jM4932a2 - jCurrentTimeMillis);
/* 332 */               long jMin = jMax3 + jAbs2;
/* 333 */               long jMax5 = Math.max(jAbs3, jAbs4);
/* 337 */               if (z && jMax5 > 0) {
/* 349 */                   jMin = Math.min(jAbs2, jMax5) + jMax;
                        }
/* 350 */               m6728S(ci3Var);
/* 363 */               jMax2 = !ci3Var.m1693j0(jMax5, jMax) ? jMax5 + jMax : jMin;
/* 367 */               if (jAbs4 != 0 && jAbs4 >= jAbs2) {
/* 373 */                   int i = 0;
                            while (true) {
/* 374 */                       m6753d0();
/* 400 */                       if (i >= Math.min(20, Math.max(0, ((Integer) vg3.f18095Q.m9011a(null)).intValue()))) {
/* 302 */                           jMax2 = 0;
                                    break;
                                }
/* 405 */                       m6753d0();
/* 427 */                       jMax2 += Math.max(0L, ((Long) vg3.f18093P.m9011a(null)).longValue()) * (1 << i);
/* 430 */                       if (jMax2 > jAbs4) {
                                    break;
                                } else {
/* 434 */                           i++;
                                }
                            }
                        }
                    } else {
/* 302 */               jMax2 = 0;
                        break;
                    }
/* 439 */           if (jMax2 == 0) {
/* 449 */               mo4557a().f17534Y.m8510a("Next upload time is 0");
/* 456 */               m6757g0().m3949b();
/* 459 */               po3 po3Var3 = this.f13917e;
/* 461 */               m6728S(po3Var3);
/* 464 */               po3Var3.m7531D();
/* 467 */               return;
                    }
/* 468 */           ci3 ci3Var2 = this.f13911b;
/* 470 */           m6728S(ci3Var2);
/* 477 */           if (!ci3Var2.m1683T()) {
/* 780 */               mo4557a().f17534Y.m8510a("No network");
/* 783 */               gi3 gi3VarM6757g0 = m6757g0();
/* 789 */               mp3 mp3Var = (mp3) gi3VarM6757g0.f8630d;
/* 791 */               mp3Var.m6765k0();
/* 798 */               mp3Var.mo4558b().mo1375y();
/* 803 */               if (!gi3VarM6757g0.f8628b) {
/* 817 */                   mp3Var.f13905W.f9645a.registerReceiver(gi3VarM6757g0, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
/* 820 */                   ci3 ci3Var3 = mp3Var.f13911b;
/* 822 */                   m6728S(ci3Var3);
/* 829 */                   gi3VarM6757g0.f8629c = ci3Var3.m1683T();
/* 845 */                   mp3Var.mo4557a().f17534Y.m8511b(Boolean.valueOf(gi3VarM6757g0.f8629c), "Registering connectivity change receiver. Network connected");
/* 849 */                   gi3VarM6757g0.f8628b = true;
                        }
/* 851 */               po3 po3Var4 = this.f13917e;
/* 853 */               m6728S(po3Var4);
/* 856 */               po3Var4.m7531D();
/* 859 */               return;
                    }
/* 483 */           long jM4932a3 = this.f13938w.f17197i.m4932a();
/* 487 */           m6753d0();
/* 504 */           long jMax6 = Math.max(0L, ((Long) vg3.f18075G.m9011a(null)).longValue());
/* 508 */           m6728S(ci3Var);
/* 515 */           if (!ci3Var.m1693j0(jM4932a3, jMax6)) {
/* 518 */               jMax2 = Math.max(jMax2, jM4932a3 + jMax6);
                    }
/* 526 */           m6757g0().m3949b();
/* 535 */           ((xt0) mo4562f()).getClass();
/* 542 */           long jCurrentTimeMillis2 = jMax2 - System.currentTimeMillis();
/* 547 */           if (jCurrentTimeMillis2 <= 0) {
/* 549 */               m6753d0();
/* 564 */               jCurrentTimeMillis2 = Math.max(0L, ((Long) vg3.f18083K.m9011a(null)).longValue());
/* 570 */               C1268s c1268s = this.f13938w.f17198v;
/* 578 */               ((xt0) mo4562f()).getClass();
/* 585 */               c1268s.m4933b(System.currentTimeMillis());
                    }
/* 600 */           mo4557a().f17534Y.m8511b(Long.valueOf(jCurrentTimeMillis2), "Upload scheduled in approximately ms");
/* 603 */           po3 po3Var5 = this.f13917e;
/* 605 */           m6728S(po3Var5);
/* 608 */           po3Var5.m9593A();
/* 613 */           ij3 ij3Var = (ij3) po3Var5.f16749a;
/* 615 */           ij3Var.getClass();
/* 618 */           uh3 uh3Var = ij3Var.f9655f;
/* 620 */           Context context = ij3Var.f9645a;
/* 626 */           if (!up3.m9071p0(context)) {
/* 628 */               ij3.m4555l(uh3Var);
/* 635 */               uh3Var.f17533X.m8510a("Receiver not registered/enabled");
                    }
/* 642 */           if (!up3.m9065S(context)) {
/* 644 */               ij3.m4555l(uh3Var);
/* 651 */               uh3Var.f17533X.m8510a("Service not registered/enabled");
                    }
/* 654 */           po3Var5.m7531D();
/* 657 */           ij3.m4555l(uh3Var);
/* 668 */           uh3Var.f17534Y.m8511b(Long.valueOf(jCurrentTimeMillis2), "Scheduling upload, millis");
/* 673 */           ij3Var.f9640V.getClass();
/* 676 */           SystemClock.elapsedRealtime();
/* 699 */           if (jCurrentTimeMillis2 < Math.max(0L, ((Long) vg3.f18085L.m9011a(null)).longValue()) && po3Var5.m7532E().f2395c == 0) {
/* 716 */               po3Var5.m7532E().m1348b(jCurrentTimeMillis2);
                    }
/* 723 */           ComponentName componentName = new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementJobService");
/* 726 */           int iM7534G = po3Var5.m7534G();
/* 732 */           PersistableBundle persistableBundle = new PersistableBundle();
/* 739 */           persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
/* 768 */           zzch.zza(context, new JobInfo.Builder(iM7534G, componentName).setMinimumLatency(jCurrentTimeMillis2).setOverrideDeadline(jCurrentTimeMillis2 + jCurrentTimeMillis2).setExtras(persistableBundle).build(), "com.google.android.gms", "UploadAlarm");
                }

                /* JADX INFO: renamed from: M */
                public final void m6740M() {
/* 5 */             mo4558b().mo1375y();
/* 10 */            if (this.f13918e0 || this.f13920f0 || this.f13921g0) {
/* 92 */                mo4557a().f17534Y.m8513d("Not stopping services. fetch, network, upload", Boolean.valueOf(this.f13918e0), Boolean.valueOf(this.f13920f0), Boolean.valueOf(this.f13921g0));
/* 95 */                return;
                    }
/* 29 */            mo4557a().f17534Y.m8510a("Stopping uploading service(s)");
/* 32 */            ArrayList arrayList = this.f13910a0;
/* 34 */            if (arrayList == null) {
/* 36 */                return;
                    }
/* 37 */            Iterator it = arrayList.iterator();
/* 45 */            while (it.hasNext()) {
/* 53 */                ((Runnable) it.next()).run();
                    }
/* 57 */            ArrayList arrayList2 = this.f13910a0;
/* 59 */            kb1.m6061n(arrayList2);
/* 62 */            arrayList2.clear();
                }

                /* JADX INFO: renamed from: N */
                public final Boolean m6741N(di3 di3Var) {
                    try {
/* 1 */                 long jM3105P = di3Var.m3105P();
/* 11 */                ij3 ij3Var = this.f13905W;
/* 13 */                if (jM3105P != -2147483648L) {
/* 38 */                    if (di3Var.m3105P() == g93.m3898a(ij3Var.f9645a).m9214c(0, di3Var.m3093D()).versionCode) {
/* 40 */                        return Boolean.TRUE;
                            }
                        } else {
/* 57 */                    String str = g93.m3898a(ij3Var.f9645a).m9214c(0, di3Var.m3093D()).versionName;
/* 59 */                    String strM3103N = di3Var.m3103N();
/* 63 */                    if (strM3103N != null && strM3103N.equals(str)) {
/* 71 */                        return Boolean.TRUE;
                            }
                        }
/* 74 */                return Boolean.FALSE;
                    } catch (PackageManager.NameNotFoundException unused) {
/* 77 */                return null;
                    }
                }

                /* JADX INFO: renamed from: O */
                public final zzr m6742O(String str) {
/* 5 */             ae3 ae3Var = this.f13913c;
/* 7 */             m6728S(ae3Var);
/* 10 */            di3 di3VarM219D0 = ae3Var.m219D0(str);
/* 15 */            if (di3VarM219D0 != null) {
/* 17 */                ij3 ij3Var = di3VarM219D0.f7242a;
/* 27 */                if (!TextUtils.isEmpty(di3VarM219D0.m3103N())) {
/* 31 */                    Boolean boolM6741N = m6741N(di3VarM219D0);
/* 35 */                    if (boolM6741N != null && !boolM6741N.booleanValue()) {
/* 55 */                        mo4557a().f17538f.m8511b(uh3.m9013H(str), "App version does not match; dropping. appId");
/* 14 */                        return null;
                            }
/* 61 */                    String strM3096G = di3VarM219D0.m3096G();
/* 66 */                    String strM3103N = di3VarM219D0.m3103N();
/* 70 */                    long jM3105P = di3VarM219D0.m3105P();
/* 74 */                    bj3 bj3Var = ij3Var.f9659i;
/* 76 */                    ij3.m4555l(bj3Var);
/* 79 */                    bj3Var.mo1375y();
/* 83 */                    String str2 = di3VarM219D0.f7253l;
/* 85 */                    bj3 bj3Var2 = ij3Var.f9659i;
/* 87 */                    ij3.m4555l(bj3Var2);
/* 90 */                    bj3Var2.mo1375y();
/* 94 */                    long j = di3VarM219D0.f7254m;
/* 96 */                    bj3 bj3Var3 = ij3Var.f9659i;
/* 98 */                    ij3.m4555l(bj3Var3);
/* 101 */                   bj3Var3.mo1375y();
/* 105 */                   long j2 = di3VarM219D0.f7255n;
/* 107 */                   bj3 bj3Var4 = ij3Var.f9659i;
/* 109 */                   ij3.m4555l(bj3Var4);
/* 112 */                   bj3Var4.mo1375y();
/* 116 */                   boolean z = di3VarM219D0.f7256o;
/* 119 */                   String strM3099J = di3VarM219D0.m3099J();
/* 123 */                   bj3 bj3Var5 = ij3Var.f9659i;
/* 125 */                   ij3.m4555l(bj3Var5);
/* 128 */                   bj3Var5.mo1375y();
/* 131 */                   boolean z2 = di3VarM219D0.f7257p;
/* 133 */                   Boolean boolM3131w = di3VarM219D0.m3131w();
/* 137 */                   long jM3110b = di3VarM219D0.m3110b();
/* 141 */                   bj3 bj3Var6 = ij3Var.f9659i;
/* 143 */                   ij3.m4555l(bj3Var6);
/* 146 */                   bj3Var6.mo1375y();
/* 149 */                   ArrayList arrayList = di3VarM219D0.f7260s;
/* 155 */                   String strM7188g = m6752d(str).m7188g();
/* 159 */                   boolean zM3133y = di3VarM219D0.m3133y();
/* 165 */                   bj3 bj3Var7 = ij3Var.f9659i;
/* 167 */                   ij3.m4555l(bj3Var7);
/* 170 */                   bj3Var7.mo1375y();
/* 173 */                   long j3 = di3VarM219D0.f7263v;
/* 181 */                   int i = m6752d(str).f14793b;
/* 187 */                   String str3 = m6771n0(str).f2867b;
/* 191 */                   bj3 bj3Var8 = ij3Var.f9659i;
/* 193 */                   ij3.m4555l(bj3Var8);
/* 196 */                   bj3Var8.mo1375y();
/* 199 */                   int i2 = di3VarM219D0.f7265x;
/* 201 */                   bj3 bj3Var9 = ij3Var.f9659i;
/* 203 */                   ij3.m4555l(bj3Var9);
/* 206 */                   bj3Var9.mo1375y();
/* 253 */                   return new zzr(str, strM3096G, strM3103N, jM3105P, str2, j, j2, (String) null, z, false, strM3099J, 0L, 0, z2, false, boolM3131w, jM3110b, (List) arrayList, strM7188g, HttpUrl.FRAGMENT_ENCODE_SET, (String) null, zM3133y, j3, i, str3, i2, di3VarM219D0.f7224B, di3VarM219D0.m3092C(), di3VarM219D0.m3127s(), 0L, di3VarM219D0.m3128t());
                        }
                    }
/* 265 */           mo4557a().f17533X.m8511b(str, "No app data available; dropping");
/* 14 */            return null;
                }

                /* JADX INFO: renamed from: P */
                public final boolean m6743P(String str, String str2) {
/* 1 */             ae3 ae3Var = this.f13913c;
/* 3 */             m6728S(ae3Var);
/* 8 */             pe3 pe3VarM246Z = ae3Var.m246Z("events", str, str2);
                    return pe3VarM246Z == null || pe3VarM246Z.f15082c < 1;
                }

                /* JADX WARN: Code duplicated, block: B:39:0x00cd A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:40:0x00cf  */
                /* JADX WARN: Code duplicated, block: B:43:0x00eb  */
                /* JADX WARN: Code duplicated, block: B:44:0x0100  */
                /* JADX INFO: renamed from: U */
                public final void m6744U(zzpk zzpkVar, zzr zzrVar) {
                    pe3 pe3VarM246Z;
                    long jLongValue;
/* 13 */            mo4558b().mo1375y();
/* 16 */            m6765k0();
/* 19 */            boolean zM6726Q = m6726Q(zzrVar);
/* 23 */            String str = zzrVar.f4240a;
/* 25 */            if (zM6726Q) {
/* 31 */                if (!zzrVar.f4263v) {
/* 33 */                    m6750a0(zzrVar);
/* 36 */                    return;
                        }
/* 37 */                up3 up3VarM6763j0 = m6763j0();
/* 41 */                String str2 = zzpkVar.f4228b;
/* 43 */                int iM9080E0 = up3VarM6763j0.m9080E0(str2);
/* 50 */                ac3 ac3Var = this.f13936u0;
/* 52 */                if (iM9080E0 != 0) {
/* 54 */                    m6763j0();
/* 57 */                    m6753d0();
/* 60 */                    String strM9060E = up3.m9060E(24, str2, true);
/* 72 */                    int length = str2 != null ? str2.length() : 0;
/* 73 */                    m6763j0();
/* 80 */                    up3.m9062P(ac3Var, zzrVar.f4240a, iM9080E0, "_ev", strM9060E, length);
/* 83 */                    return;
                        }
/* 92 */                int iM9092M = m6763j0().m9092M(zzpkVar.m2197D1(), str2);
/* 96 */                if (iM9092M != 0) {
/* 98 */                    m6763j0();
/* 101 */                   m6753d0();
/* 104 */                   String strM9060E2 = up3.m9060E(24, str2, true);
/* 108 */                   Object objM2197D1 = zzpkVar.m2197D1();
/* 130 */                   int length2 = (objM2197D1 == null || !((objM2197D1 instanceof String) || (objM2197D1 instanceof CharSequence))) ? 0 : objM2197D1.toString().length();
/* 136 */                   m6763j0();
/* 144 */                   up3.m9062P(ac3Var, zzrVar.f4240a, iM9092M, "_ev", strM9060E2, length2);
/* 147 */                   return;
                        }
/* 157 */               Object objM9093N = m6763j0().m9093N(zzpkVar.m2197D1(), str2);
/* 161 */               if (objM9093N != null) {
/* 163 */                   String str3 = "_sid";
/* 169 */                   if ("_sid".equals(str2)) {
/* 171 */                       long j = zzpkVar.f4229c;
/* 173 */                       String str4 = zzpkVar.f4232f;
/* 175 */                       kb1.m6061n(str);
/* 178 */                       ae3 ae3Var = this.f13913c;
/* 180 */                       m6728S(ae3Var);
/* 185 */                       rp3 rp3VarM266v0 = ae3Var.m266v0(str, "_sno");
/* 189 */                       if (rp3VarM266v0 != null) {
/* 191 */                           Object obj = rp3VarM266v0.f16228e;
/* 195 */                           if (obj instanceof Long) {
/* 199 */                               jLongValue = ((Long) obj).longValue();
                                    } else {
/* 206 */                               if (rp3VarM266v0 != null) {
/* 218 */                                   mo4557a().f17541w.m8511b(rp3VarM266v0.f16228e, "Retrieved last session number from database does not contain a valid (long) value");
                                        }
/* 221 */                               ae3 ae3Var2 = this.f13913c;
/* 223 */                               m6728S(ae3Var2);
/* 230 */                               pe3VarM246Z = ae3Var2.m246Z("events", str, "_s");
/* 234 */                               if (pe3VarM246Z != null) {
/* 240 */                                   sh3 sh3Var = mo4557a().f17534Y;
/* 244 */                                   long j2 = pe3VarM246Z.f15082c;
/* 252 */                                   sh3Var.m8511b(Long.valueOf(j2), "Backfill the session number. Last used session number");
/* 255 */                                   jLongValue = j2;
                                        } else {
/* 259 */                                   jLongValue = 0;
                                        }
                                    }
                                } else {
/* 206 */                           if (rp3VarM266v0 != null) {
/* 218 */                               mo4557a().f17541w.m8511b(rp3VarM266v0.f16228e, "Retrieved last session number from database does not contain a valid (long) value");
                                    }
/* 221 */                           ae3 ae3Var3 = this.f13913c;
/* 223 */                           m6728S(ae3Var3);
/* 230 */                           pe3VarM246Z = ae3Var3.m246Z("events", str, "_s");
/* 234 */                           if (pe3VarM246Z != null) {
/* 240 */                               sh3 sh3Var2 = mo4557a().f17534Y;
/* 244 */                               long j3 = pe3VarM246Z.f15082c;
/* 252 */                               sh3Var2.m8511b(Long.valueOf(j3), "Backfill the session number. Last used session number");
/* 255 */                               jLongValue = j3;
                                    } else {
/* 259 */                               jLongValue = 0;
                                    }
                                }
/* 281 */                       m6744U(new zzpk(j, Long.valueOf(jLongValue + 1), "_sno", str4), zzrVar);
                            } else {
/* 163 */                       str3 = "_sid";
                            }
/* 289 */                   kb1.m6061n(str);
/* 292 */                   String str5 = zzpkVar.f4232f;
/* 294 */                   kb1.m6061n(str5);
/* 299 */                   rp3 rp3Var = new rp3(str, str5, str2, zzpkVar.f4229c, objM9093N);
/* 306 */                   sh3 sh3Var3 = mo4557a().f17534Y;
/* 308 */                   ij3 ij3Var = this.f13905W;
/* 310 */                   mh3 mh3Var = ij3Var.f9639U;
/* 312 */                   String str6 = rp3Var.f16226c;
/* 320 */                   sh3Var3.m8512c(mh3Var.m6658c(str6), "Setting user property", objM9093N);
/* 323 */                   ae3 ae3Var4 = this.f13913c;
/* 325 */                   m6728S(ae3Var4);
/* 328 */                   ae3Var4.m258n0();
                            try {
/* 331 */                       boolean zEquals = "_id".equals(str6);
/* 335 */                       Object obj2 = rp3Var.f16228e;
/* 337 */                       if (zEquals) {
/* 339 */                           ae3 ae3Var5 = this.f13913c;
/* 341 */                           m6728S(ae3Var5);
/* 344 */                           rp3 rp3VarM266v1 = ae3Var5.m266v0(str, "_id");
/* 348 */                           if (rp3VarM266v1 != null && !obj2.equals(rp3VarM266v1.f16228e)) {
/* 358 */                               ae3 ae3Var6 = this.f13913c;
/* 360 */                               m6728S(ae3Var6);
/* 365 */                               ae3Var6.m264t0(str, "_lair");
                                    }
                                }
/* 372 */                       m6750a0(zzrVar);
/* 375 */                       ae3 ae3Var7 = this.f13913c;
/* 377 */                       m6728S(ae3Var7);
/* 380 */                       boolean zM265u0 = ae3Var7.m265u0(rp3Var);
/* 390 */                       if (str3.equals(str2)) {
/* 392 */                           ci3 ci3Var = this.f13923i;
/* 394 */                           m6728S(ci3Var);
/* 397 */                           String str7 = zzrVar.f4251f0;
/* 418 */                           long jM1694k0 = TextUtils.isEmpty(str7) ? 0L : ci3Var.m1694k0(str7.getBytes(Charset.forName("UTF-8")));
/* 422 */                           ae3 ae3Var8 = this.f13913c;
/* 424 */                           m6728S(ae3Var8);
/* 427 */                           di3 di3VarM219D0 = ae3Var8.m219D0(str);
/* 431 */                           if (di3VarM219D0 != null) {
/* 433 */                               di3VarM219D0.m3090A(jM1694k0);
/* 440 */                               if (di3VarM219D0.m3123o()) {
/* 442 */                                   ae3 ae3Var9 = this.f13913c;
/* 444 */                                   m6728S(ae3Var9);
/* 448 */                                   ae3Var9.m221E0(di3VarM219D0, false);
                                        }
                                    }
                                }
/* 451 */                       ae3 ae3Var10 = this.f13913c;
/* 453 */                       m6728S(ae3Var10);
/* 456 */                       ae3Var10.m259o0();
/* 459 */                       if (!zM265u0) {
/* 475 */                           mo4557a().f17538f.m8512c(ij3Var.f9639U.m6658c(str6), "Too many unique user properties are set. Ignoring user property", obj2);
/* 478 */                           m6763j0();
/* 487 */                           up3.m9062P(ac3Var, str, 9, null, null, 0);
                                }
                            } finally {
/* 499 */                       ae3 ae3Var11 = this.f13913c;
/* 501 */                       m6728S(ae3Var11);
/* 504 */                       ae3Var11.m260p0();
                            }
                        }
                    }
                }

                /* JADX INFO: renamed from: V */
                public final void m6745V(String str, zzr zzrVar) {
/* 5 */             mo4558b().mo1375y();
/* 8 */             m6765k0();
/* 11 */            boolean zM6726Q = m6726Q(zzrVar);
/* 15 */            String str2 = zzrVar.f4240a;
/* 17 */            if (zM6726Q) {
/* 22 */                if (!zzrVar.f4263v) {
/* 24 */                    m6750a0(zzrVar);
/* 27 */                    return;
                        }
/* 28 */                Boolean boolM6729T = m6729T(zzrVar);
/* 38 */                if ("_npa".equals(str) && boolM6729T != null) {
/* 50 */                    mo4557a().f17533X.m8510a("Falling back to manifest metadata value for ad personalization");
/* 61 */                    ((xt0) mo4562f()).getClass();
/* 91 */                    m6744U(new zzpk(System.currentTimeMillis(), Long.valueOf(true != boolM6729T.booleanValue() ? 0L : 1L), "_npa", "auto"), zzrVar);
/* 94 */                    return;
                        }
/* 99 */                sh3 sh3Var = mo4557a().f17533X;
/* 101 */               ij3 ij3Var = this.f13905W;
/* 111 */               sh3Var.m8511b(ij3Var.f9639U.m6658c(str), "Removing user property");
/* 114 */               ae3 ae3Var = this.f13913c;
/* 116 */               m6728S(ae3Var);
/* 119 */               ae3Var.m258n0();
                        try {
/* 122 */                   m6750a0(zzrVar);
/* 131 */                   if ("_id".equals(str)) {
/* 133 */                       ae3 ae3Var2 = this.f13913c;
/* 135 */                       m6728S(ae3Var2);
/* 138 */                       kb1.m6061n(str2);
/* 143 */                       ae3Var2.m264t0(str2, "_lair");
                            }
/* 150 */                   ae3 ae3Var3 = this.f13913c;
/* 152 */                   m6728S(ae3Var3);
/* 155 */                   kb1.m6061n(str2);
/* 158 */                   ae3Var3.m264t0(str2, str);
/* 161 */                   ae3 ae3Var4 = this.f13913c;
/* 163 */                   m6728S(ae3Var4);
/* 166 */                   ae3Var4.m259o0();
/* 183 */                   mo4557a().f17533X.m8511b(ij3Var.f9639U.m6658c(str), "User property removed");
                        } finally {
/* 195 */                   ae3 ae3Var5 = this.f13913c;
/* 197 */                   m6728S(ae3Var5);
/* 200 */                   ae3Var5.m260p0();
                        }
                    }
                }

                /* JADX WARN: Code duplicated, block: B:102:0x0287 A[Catch: all -> 0x01d9, TryCatch #5 {all -> 0x01d9, blocks: (B:62:0x0173, B:65:0x017f, B:100:0x025c, B:102:0x0287, B:103:0x028a, B:70:0x01a5, B:72:0x01cd, B:75:0x01de, B:77:0x01e5, B:79:0x01eb, B:81:0x01f5, B:83:0x01fb, B:85:0x0201, B:87:0x0207, B:88:0x020c, B:94:0x0225, B:96:0x0229, B:97:0x023a, B:98:0x0245, B:99:0x0250), top: B:174:0x0173, inners: #1 }] */
                /* JADX WARN: Code duplicated, block: B:107:0x02ad A[Catch: all -> 0x02c4, TRY_LEAVE, TryCatch #0 {all -> 0x02c4, blocks: (B:105:0x028f, B:107:0x02ad, B:150:0x0375, B:151:0x0378, B:159:0x0404, B:112:0x02c7, B:117:0x02e6, B:119:0x02ee, B:121:0x02f4, B:125:0x0306, B:129:0x0318, B:133:0x0324, B:136:0x0337, B:141:0x0356, B:143:0x035e, B:145:0x0366, B:147:0x036c, B:139:0x0344, B:127:0x0311, B:115:0x02d4, B:152:0x0391, B:154:0x03c5, B:155:0x03c8, B:156:0x03e0, B:158:0x03e8), top: B:164:0x0138, inners: #3, #4 }] */
                /* JADX WARN: Code duplicated, block: B:117:0x02e6 A[Catch: all -> 0x02c4, TryCatch #0 {all -> 0x02c4, blocks: (B:105:0x028f, B:107:0x02ad, B:150:0x0375, B:151:0x0378, B:159:0x0404, B:112:0x02c7, B:117:0x02e6, B:119:0x02ee, B:121:0x02f4, B:125:0x0306, B:129:0x0318, B:133:0x0324, B:136:0x0337, B:141:0x0356, B:143:0x035e, B:145:0x0366, B:147:0x036c, B:139:0x0344, B:127:0x0311, B:115:0x02d4, B:152:0x0391, B:154:0x03c5, B:155:0x03c8, B:156:0x03e0, B:158:0x03e8), top: B:164:0x0138, inners: #3, #4 }] */
                /* JADX WARN: Code duplicated, block: B:119:0x02ee A[Catch: all -> 0x02c4, TryCatch #0 {all -> 0x02c4, blocks: (B:105:0x028f, B:107:0x02ad, B:150:0x0375, B:151:0x0378, B:159:0x0404, B:112:0x02c7, B:117:0x02e6, B:119:0x02ee, B:121:0x02f4, B:125:0x0306, B:129:0x0318, B:133:0x0324, B:136:0x0337, B:141:0x0356, B:143:0x035e, B:145:0x0366, B:147:0x036c, B:139:0x0344, B:127:0x0311, B:115:0x02d4, B:152:0x0391, B:154:0x03c5, B:155:0x03c8, B:156:0x03e0, B:158:0x03e8), top: B:164:0x0138, inners: #3, #4 }] */
                /* JADX WARN: Code duplicated, block: B:121:0x02f4 A[Catch: all -> 0x02c4, TryCatch #0 {all -> 0x02c4, blocks: (B:105:0x028f, B:107:0x02ad, B:150:0x0375, B:151:0x0378, B:159:0x0404, B:112:0x02c7, B:117:0x02e6, B:119:0x02ee, B:121:0x02f4, B:125:0x0306, B:129:0x0318, B:133:0x0324, B:136:0x0337, B:141:0x0356, B:143:0x035e, B:145:0x0366, B:147:0x036c, B:139:0x0344, B:127:0x0311, B:115:0x02d4, B:152:0x0391, B:154:0x03c5, B:155:0x03c8, B:156:0x03e0, B:158:0x03e8), top: B:164:0x0138, inners: #3, #4 }] */
                /* JADX WARN: Code duplicated, block: B:123:0x0300  */
                /* JADX WARN: Code duplicated, block: B:125:0x0306 A[Catch: all -> 0x02c4, TryCatch #0 {all -> 0x02c4, blocks: (B:105:0x028f, B:107:0x02ad, B:150:0x0375, B:151:0x0378, B:159:0x0404, B:112:0x02c7, B:117:0x02e6, B:119:0x02ee, B:121:0x02f4, B:125:0x0306, B:129:0x0318, B:133:0x0324, B:136:0x0337, B:141:0x0356, B:143:0x035e, B:145:0x0366, B:147:0x036c, B:139:0x0344, B:127:0x0311, B:115:0x02d4, B:152:0x0391, B:154:0x03c5, B:155:0x03c8, B:156:0x03e0, B:158:0x03e8), top: B:164:0x0138, inners: #3, #4 }] */
                /* JADX WARN: Code duplicated, block: B:127:0x0311 A[Catch: all -> 0x02c4, TryCatch #0 {all -> 0x02c4, blocks: (B:105:0x028f, B:107:0x02ad, B:150:0x0375, B:151:0x0378, B:159:0x0404, B:112:0x02c7, B:117:0x02e6, B:119:0x02ee, B:121:0x02f4, B:125:0x0306, B:129:0x0318, B:133:0x0324, B:136:0x0337, B:141:0x0356, B:143:0x035e, B:145:0x0366, B:147:0x036c, B:139:0x0344, B:127:0x0311, B:115:0x02d4, B:152:0x0391, B:154:0x03c5, B:155:0x03c8, B:156:0x03e0, B:158:0x03e8), top: B:164:0x0138, inners: #3, #4 }] */
                /* JADX WARN: Code duplicated, block: B:128:0x0317  */
                /* JADX WARN: Code duplicated, block: B:131:0x031f  */
                /* JADX WARN: Code duplicated, block: B:132:0x0322  */
                /* JADX WARN: Code duplicated, block: B:135:0x0335  */
                /* JADX WARN: Code duplicated, block: B:141:0x0356 A[Catch: all -> 0x02c4, TryCatch #0 {all -> 0x02c4, blocks: (B:105:0x028f, B:107:0x02ad, B:150:0x0375, B:151:0x0378, B:159:0x0404, B:112:0x02c7, B:117:0x02e6, B:119:0x02ee, B:121:0x02f4, B:125:0x0306, B:129:0x0318, B:133:0x0324, B:136:0x0337, B:141:0x0356, B:143:0x035e, B:145:0x0366, B:147:0x036c, B:139:0x0344, B:127:0x0311, B:115:0x02d4, B:152:0x0391, B:154:0x03c5, B:155:0x03c8, B:156:0x03e0, B:158:0x03e8), top: B:164:0x0138, inners: #3, #4 }] */
                /* JADX WARN: Code duplicated, block: B:143:0x035e A[Catch: all -> 0x02c4, TryCatch #0 {all -> 0x02c4, blocks: (B:105:0x028f, B:107:0x02ad, B:150:0x0375, B:151:0x0378, B:159:0x0404, B:112:0x02c7, B:117:0x02e6, B:119:0x02ee, B:121:0x02f4, B:125:0x0306, B:129:0x0318, B:133:0x0324, B:136:0x0337, B:141:0x0356, B:143:0x035e, B:145:0x0366, B:147:0x036c, B:139:0x0344, B:127:0x0311, B:115:0x02d4, B:152:0x0391, B:154:0x03c5, B:155:0x03c8, B:156:0x03e0, B:158:0x03e8), top: B:164:0x0138, inners: #3, #4 }] */
                /* JADX WARN: Code duplicated, block: B:144:0x0364  */
                /* JADX WARN: Code duplicated, block: B:147:0x036c A[Catch: all -> 0x02c4, TryCatch #0 {all -> 0x02c4, blocks: (B:105:0x028f, B:107:0x02ad, B:150:0x0375, B:151:0x0378, B:159:0x0404, B:112:0x02c7, B:117:0x02e6, B:119:0x02ee, B:121:0x02f4, B:125:0x0306, B:129:0x0318, B:133:0x0324, B:136:0x0337, B:141:0x0356, B:143:0x035e, B:145:0x0366, B:147:0x036c, B:139:0x0344, B:127:0x0311, B:115:0x02d4, B:152:0x0391, B:154:0x03c5, B:155:0x03c8, B:156:0x03e0, B:158:0x03e8), top: B:164:0x0138, inners: #3, #4 }] */
                /* JADX WARN: Code duplicated, block: B:150:0x0375 A[Catch: all -> 0x02c4, TryCatch #0 {all -> 0x02c4, blocks: (B:105:0x028f, B:107:0x02ad, B:150:0x0375, B:151:0x0378, B:159:0x0404, B:112:0x02c7, B:117:0x02e6, B:119:0x02ee, B:121:0x02f4, B:125:0x0306, B:129:0x0318, B:133:0x0324, B:136:0x0337, B:141:0x0356, B:143:0x035e, B:145:0x0366, B:147:0x036c, B:139:0x0344, B:127:0x0311, B:115:0x02d4, B:152:0x0391, B:154:0x03c5, B:155:0x03c8, B:156:0x03e0, B:158:0x03e8), top: B:164:0x0138, inners: #3, #4 }] */
                /* JADX WARN: Code duplicated, block: B:152:0x0391 A[Catch: all -> 0x02c4, TryCatch #0 {all -> 0x02c4, blocks: (B:105:0x028f, B:107:0x02ad, B:150:0x0375, B:151:0x0378, B:159:0x0404, B:112:0x02c7, B:117:0x02e6, B:119:0x02ee, B:121:0x02f4, B:125:0x0306, B:129:0x0318, B:133:0x0324, B:136:0x0337, B:141:0x0356, B:143:0x035e, B:145:0x0366, B:147:0x036c, B:139:0x0344, B:127:0x0311, B:115:0x02d4, B:152:0x0391, B:154:0x03c5, B:155:0x03c8, B:156:0x03e0, B:158:0x03e8), top: B:164:0x0138, inners: #3, #4 }] */
                /* JADX WARN: Code duplicated, block: B:154:0x03c5 A[Catch: all -> 0x02c4, TryCatch #0 {all -> 0x02c4, blocks: (B:105:0x028f, B:107:0x02ad, B:150:0x0375, B:151:0x0378, B:159:0x0404, B:112:0x02c7, B:117:0x02e6, B:119:0x02ee, B:121:0x02f4, B:125:0x0306, B:129:0x0318, B:133:0x0324, B:136:0x0337, B:141:0x0356, B:143:0x035e, B:145:0x0366, B:147:0x036c, B:139:0x0344, B:127:0x0311, B:115:0x02d4, B:152:0x0391, B:154:0x03c5, B:155:0x03c8, B:156:0x03e0, B:158:0x03e8), top: B:164:0x0138, inners: #3, #4 }] */
                /* JADX WARN: Code duplicated, block: B:156:0x03e0 A[Catch: all -> 0x02c4, TryCatch #0 {all -> 0x02c4, blocks: (B:105:0x028f, B:107:0x02ad, B:150:0x0375, B:151:0x0378, B:159:0x0404, B:112:0x02c7, B:117:0x02e6, B:119:0x02ee, B:121:0x02f4, B:125:0x0306, B:129:0x0318, B:133:0x0324, B:136:0x0337, B:141:0x0356, B:143:0x035e, B:145:0x0366, B:147:0x036c, B:139:0x0344, B:127:0x0311, B:115:0x02d4, B:152:0x0391, B:154:0x03c5, B:155:0x03c8, B:156:0x03e0, B:158:0x03e8), top: B:164:0x0138, inners: #3, #4 }] */
                /* JADX WARN: Code duplicated, block: B:158:0x03e8 A[Catch: all -> 0x02c4, TryCatch #0 {all -> 0x02c4, blocks: (B:105:0x028f, B:107:0x02ad, B:150:0x0375, B:151:0x0378, B:159:0x0404, B:112:0x02c7, B:117:0x02e6, B:119:0x02ee, B:121:0x02f4, B:125:0x0306, B:129:0x0318, B:133:0x0324, B:136:0x0337, B:141:0x0356, B:143:0x035e, B:145:0x0366, B:147:0x036c, B:139:0x0344, B:127:0x0311, B:115:0x02d4, B:152:0x0391, B:154:0x03c5, B:155:0x03c8, B:156:0x03e0, B:158:0x03e8), top: B:164:0x0138, inners: #3, #4 }] */
                /* JADX WARN: Code duplicated, block: B:172:0x02c7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:174:0x0173 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:48:0x010f A[Catch: all -> 0x00c6, TryCatch #2 {all -> 0x00c6, blocks: (B:24:0x00a6, B:26:0x00b6, B:34:0x00ce, B:38:0x00de, B:40:0x00ed, B:46:0x0102, B:48:0x010f, B:50:0x011a, B:53:0x0123, B:56:0x013a, B:59:0x014f, B:67:0x0193, B:54:0x012e, B:49:0x0116, B:42:0x00f7, B:45:0x00ff), top: B:168:0x00a6 }] */
                /* JADX WARN: Code duplicated, block: B:49:0x0116 A[Catch: all -> 0x00c6, TryCatch #2 {all -> 0x00c6, blocks: (B:24:0x00a6, B:26:0x00b6, B:34:0x00ce, B:38:0x00de, B:40:0x00ed, B:46:0x0102, B:48:0x010f, B:50:0x011a, B:53:0x0123, B:56:0x013a, B:59:0x014f, B:67:0x0193, B:54:0x012e, B:49:0x0116, B:42:0x00f7, B:45:0x00ff), top: B:168:0x00a6 }] */
                /* JADX WARN: Code duplicated, block: B:53:0x0123 A[Catch: all -> 0x00c6, TRY_ENTER, TryCatch #2 {all -> 0x00c6, blocks: (B:24:0x00a6, B:26:0x00b6, B:34:0x00ce, B:38:0x00de, B:40:0x00ed, B:46:0x0102, B:48:0x010f, B:50:0x011a, B:53:0x0123, B:56:0x013a, B:59:0x014f, B:67:0x0193, B:54:0x012e, B:49:0x0116, B:42:0x00f7, B:45:0x00ff), top: B:168:0x00a6 }] */
                /* JADX WARN: Code duplicated, block: B:54:0x012e A[Catch: all -> 0x00c6, TryCatch #2 {all -> 0x00c6, blocks: (B:24:0x00a6, B:26:0x00b6, B:34:0x00ce, B:38:0x00de, B:40:0x00ed, B:46:0x0102, B:48:0x010f, B:50:0x011a, B:53:0x0123, B:56:0x013a, B:59:0x014f, B:67:0x0193, B:54:0x012e, B:49:0x0116, B:42:0x00f7, B:45:0x00ff), top: B:168:0x00a6 }] */
                /* JADX WARN: Code duplicated, block: B:56:0x013a A[Catch: all -> 0x00c6, TRY_LEAVE, TryCatch #2 {all -> 0x00c6, blocks: (B:24:0x00a6, B:26:0x00b6, B:34:0x00ce, B:38:0x00de, B:40:0x00ed, B:46:0x0102, B:48:0x010f, B:50:0x011a, B:53:0x0123, B:56:0x013a, B:59:0x014f, B:67:0x0193, B:54:0x012e, B:49:0x0116, B:42:0x00f7, B:45:0x00ff), top: B:168:0x00a6 }] */
                /* JADX WARN: Code duplicated, block: B:59:0x014f A[Catch: all -> 0x00c6, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x00c6, blocks: (B:24:0x00a6, B:26:0x00b6, B:34:0x00ce, B:38:0x00de, B:40:0x00ed, B:46:0x0102, B:48:0x010f, B:50:0x011a, B:53:0x0123, B:56:0x013a, B:59:0x014f, B:67:0x0193, B:54:0x012e, B:49:0x0116, B:42:0x00f7, B:45:0x00ff), top: B:168:0x00a6 }] */
                /* JADX WARN: Code duplicated, block: B:64:0x0179  */
                /* JADX WARN: Code duplicated, block: B:65:0x017f A[Catch: all -> 0x01d9, TRY_LEAVE, TryCatch #5 {all -> 0x01d9, blocks: (B:62:0x0173, B:65:0x017f, B:100:0x025c, B:102:0x0287, B:103:0x028a, B:70:0x01a5, B:72:0x01cd, B:75:0x01de, B:77:0x01e5, B:79:0x01eb, B:81:0x01f5, B:83:0x01fb, B:85:0x0201, B:87:0x0207, B:88:0x020c, B:94:0x0225, B:96:0x0229, B:97:0x023a, B:98:0x0245, B:99:0x0250), top: B:174:0x0173, inners: #1 }] */
                /* JADX WARN: Code duplicated, block: B:67:0x0193 A[Catch: all -> 0x00c6, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x00c6, blocks: (B:24:0x00a6, B:26:0x00b6, B:34:0x00ce, B:38:0x00de, B:40:0x00ed, B:46:0x0102, B:48:0x010f, B:50:0x011a, B:53:0x0123, B:56:0x013a, B:59:0x014f, B:67:0x0193, B:54:0x012e, B:49:0x0116, B:42:0x00f7, B:45:0x00ff), top: B:168:0x00a6 }] */
                /* JADX WARN: Code duplicated, block: B:69:0x01a3  */
                /* JADX WARN: Code duplicated, block: B:72:0x01cd A[Catch: all -> 0x01d9, TryCatch #5 {all -> 0x01d9, blocks: (B:62:0x0173, B:65:0x017f, B:100:0x025c, B:102:0x0287, B:103:0x028a, B:70:0x01a5, B:72:0x01cd, B:75:0x01de, B:77:0x01e5, B:79:0x01eb, B:81:0x01f5, B:83:0x01fb, B:85:0x0201, B:87:0x0207, B:88:0x020c, B:94:0x0225, B:96:0x0229, B:97:0x023a, B:98:0x0245, B:99:0x0250), top: B:174:0x0173, inners: #1 }] */
                /* JADX WARN: Code duplicated, block: B:75:0x01de A[Catch: all -> 0x01d9, TryCatch #5 {all -> 0x01d9, blocks: (B:62:0x0173, B:65:0x017f, B:100:0x025c, B:102:0x0287, B:103:0x028a, B:70:0x01a5, B:72:0x01cd, B:75:0x01de, B:77:0x01e5, B:79:0x01eb, B:81:0x01f5, B:83:0x01fb, B:85:0x0201, B:87:0x0207, B:88:0x020c, B:94:0x0225, B:96:0x0229, B:97:0x023a, B:98:0x0245, B:99:0x0250), top: B:174:0x0173, inners: #1 }] */
                /* JADX WARN: Code duplicated, block: B:98:0x0245 A[Catch: all -> 0x01d9, TryCatch #5 {all -> 0x01d9, blocks: (B:62:0x0173, B:65:0x017f, B:100:0x025c, B:102:0x0287, B:103:0x028a, B:70:0x01a5, B:72:0x01cd, B:75:0x01de, B:77:0x01e5, B:79:0x01eb, B:81:0x01f5, B:83:0x01fb, B:85:0x0201, B:87:0x0207, B:88:0x020c, B:94:0x0225, B:96:0x0229, B:97:0x023a, B:98:0x0245, B:99:0x0250), top: B:174:0x0173, inners: #1 }] */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r2v0, types: [com.google.android.gms.measurement.internal.zzr, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r2v13, types: [mp3] */
                /* JADX WARN: Type inference failed for: r2v14 */
                /* JADX WARN: Type inference failed for: r2v15 */
                /* JADX WARN: Type inference failed for: r2v16 */
                /* JADX WARN: Type inference failed for: r2v17 */
                /* JADX WARN: Type inference failed for: r2v5, types: [mp3] */
                /* JADX INFO: renamed from: W */
                public final void m6746W(zzr zzrVar) throws Throwable {
                    long j;
                    long j2;
                    ae3 ae3Var;
                    pe3 pe3VarM246Z;
                    boolean z;
                    long j3;
                    mp3 mp3Var;
                    long j4;
                    Bundle bundle;
                    long j5;
                    oi3 oi3Var;
                    ij3 ij3Var;
                    Context context;
                    uh3 uh3Var;
                    ij3 ij3Var2;
                    Intent intent;
                    String str;
                    PackageManager packageManager;
                    List<ResolveInfo> listQueryIntentServices;
                    Bundle bundle2;
                    long j6;
                    String str2;
                    long jM234N;
                    ij3 ij3Var3;
                    PackageInfo packageInfoM9214c;
                    zzr zzrVar2;
                    ApplicationInfo applicationInfoM9213b;
                    long j7;
                    long j8;
                    boolean z2;
                    long j9;
                    long j10;
/* 3 */             mp3 mp3Var2 = zzrVar;
/* 5 */             ij3 ij3Var4 = this.f13905W;
/* 23 */            mo4558b().mo1375y();
/* 26 */            m6765k0();
/* 29 */            kb1.m6061n(mp3Var2);
/* 32 */            boolean z3 = mp3Var2.f4239Z;
/* 34 */            String str3 = mp3Var2.f4240a;
/* 36 */            kb1.m6058k(str3);
/* 43 */            if (!m6726Q(mp3Var2)) {
/* 45 */                return;
                    }
/* 46 */            ae3 ae3Var2 = this.f13913c;
/* 48 */            m6728S(ae3Var2);
/* 51 */            di3 di3VarM219D0 = ae3Var2.m219D0(str3);
/* 58 */            if (di3VarM219D0 != null && TextUtils.isEmpty(di3VarM219D0.m3096G()) && !TextUtils.isEmpty(mp3Var2.f4242b)) {
/* 78 */                di3VarM219D0.m3114f(0L);
/* 81 */                ae3 ae3Var3 = this.f13913c;
/* 83 */                m6728S(ae3Var3);
/* 86 */                ae3Var3.m221E0(di3VarM219D0, false);
/* 89 */                vi3 vi3Var = this.f13909a;
/* 91 */                m6728S(vi3Var);
/* 94 */                vi3Var.mo1375y();
/* 99 */                vi3Var.f18215v.remove(str3);
                    }
/* 104 */           if (!mp3Var2.f4263v) {
/* 106 */               m6750a0(zzrVar);
/* 109 */               return;
                    }
/* 111 */           long jCurrentTimeMillis = mp3Var2.f4236W;
/* 115 */           if (jCurrentTimeMillis == 0) {
/* 123 */               ((xt0) mo4562f()).getClass();
/* 126 */               jCurrentTimeMillis = System.currentTimeMillis();
                    }
/* 130 */           long j11 = jCurrentTimeMillis;
/* 132 */           int i = mp3Var2.f4237X;
/* 135 */           if (i != 0 && i != 1) {
/* 155 */               mo4557a().f17541w.m8512c(uh3.m9013H(str3), "Incorrect app type, assuming installed app. appId, appType", Integer.valueOf(i));
/* 158 */               i = 0;
                    }
/* 159 */           ae3 ae3Var4 = this.f13913c;
/* 161 */           m6728S(ae3Var4);
/* 164 */           ae3Var4.m258n0();
                    try {
/* 167 */               ae3 ae3Var5 = this.f13913c;
/* 169 */               m6728S(ae3Var5);
/* 172 */               rp3 rp3VarM266v0 = ae3Var5.m266v0(str3, "_npa");
/* 176 */               Boolean boolM6729T = m6729T(mp3Var2);
                        try {
/* 181 */                   if (rp3VarM266v0 != null) {
/* 183 */                       j = 1;
/* 193 */                       if (!"auto".equals(rp3VarM266v0.f16225b)) {
/* 196 */                           j2 = j11;
                                }
/* 270 */                       if (m6753d0().m7406J(null, vg3.f18123c1)) {
/* 275 */                           m6749Z(mp3Var2, mp3Var2.f4261o0);
                                } else {
/* 280 */                           m6749Z(mp3Var2, j2);
                                }
/* 283 */                       m6750a0(zzrVar);
/* 286 */                       ae3Var = this.f13913c;
/* 290 */                       if (i == 0) {
/* 292 */                           m6728S(ae3Var);
/* 297 */                           pe3VarM246Z = ae3Var.m246Z("events", str3, "_f");
/* 301 */                           z = false;
                                } else {
/* 303 */                           m6728S(ae3Var);
/* 308 */                           pe3VarM246Z = ae3Var.m246Z("events", str3, "_v");
/* 312 */                           z = true;
                                }
/* 313 */                       if (pe3VarM246Z == null) {
/* 322 */                           j4 = ((j2 / 3600000) + j) * 3600000;
/* 334 */                           if (z) {
/* 917 */                               mp3 mp3Var3 = this;
/* 922 */                               Long lValueOf = Long.valueOf(j4);
/* 928 */                               long j12 = j2;
/* 935 */                               mp3Var3.m6744U(new zzpk(j12, lValueOf, "_fvt", "auto"), mp3Var2);
/* 942 */                               mp3Var3.mo4558b().mo1375y();
/* 945 */                               mp3Var3.m6765k0();
/* 950 */                               bundle = new Bundle();
/* 955 */                               bundle.putLong("_c", 1L);
/* 958 */                               bundle.putLong("_r", 1L);
/* 961 */                               bundle.putLong("_et", 1L);
/* 964 */                               if (z3) {
/* 966 */                                   bundle.putLong("_dac", 1L);
                                        }
/* 989 */                               mp3Var3.m6760i(new zzbg("_v", new zzbe(bundle), "auto", j12), mp3Var2);
                                        mp3Var2 = mp3Var3;
                                    } else {
/* 340 */                               Long lValueOf2 = Long.valueOf(j4);
/* 346 */                               j5 = j2;
/* 353 */                               m6744U(new zzpk(j5, lValueOf2, "_fot", "auto"), mp3Var2);
/* 360 */                               mo4558b().mo1375y();
/* 363 */                               oi3Var = this.f13904V;
/* 365 */                               kb1.m6061n(oi3Var);
/* 368 */                               ij3Var = oi3Var.f14773b;
/* 370 */                               if (str3 != null) {
                                            try {
/* 376 */                                       if (str3.isEmpty()) {
/* 378 */                                           ij3Var2 = ij3Var4;
/* 380 */                                           str = str3;
/* 593 */                                           uh3 uh3Var2 = ij3Var.f9655f;
/* 595 */                                           ij3.m4555l(uh3Var2);
/* 602 */                                           uh3Var2.f17530U.m8510a("Install Referrer Reporter was called with invalid app package name");
                                                } else {
/* 384 */                                           bj3 bj3Var = ij3Var.f9659i;
/* 388 */                                           context = ij3Var.f9645a;
/* 390 */                                           uh3Var = ij3Var.f9655f;
/* 392 */                                           ij3.m4555l(bj3Var);
/* 395 */                                           bj3Var.mo1375y();
/* 402 */                                           if (oi3Var.m7175a()) {
/* 420 */                                               ij3Var2 = ij3Var4;
/* 424 */                                               mi3 mi3Var = new mi3(oi3Var, str3);
/* 429 */                                               bj3 bj3Var2 = ij3Var.f9659i;
/* 431 */                                               ij3.m4555l(bj3Var2);
/* 434 */                                               bj3Var2.mo1375y();
/* 439 */                                               str = str3;
/* 443 */                                               intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
/* 453 */                                               intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
/* 456 */                                               packageManager = context.getPackageManager();
/* 460 */                                               if (packageManager == null) {
/* 462 */                                                   ij3.m4555l(uh3Var);
/* 469 */                                                   uh3Var.f17530U.m8510a("Failed to obtain Package Manager to verify binding conditions for Install Referrer");
                                                        } else {
/* 480 */                                                   listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
/* 484 */                                                   if (listQueryIntentServices != null || listQueryIntentServices.isEmpty()) {
/* 582 */                                                       ij3.m4555l(uh3Var);
/* 589 */                                                       uh3Var.f17532W.m8510a("Play Service for fetching Install Referrer is unavailable on device");
                                                            } else {
/* 498 */                                                       ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
/* 500 */                                                       if (serviceInfo != null) {
/* 502 */                                                           String str4 = serviceInfo.packageName;
/* 506 */                                                           if (serviceInfo.name != null && "com.android.vending".equals(str4) && oi3Var.m7175a()) {
                                                                        try {
/* 530 */                                                                   boolean zM10191a = C2515yy.m10190b().m10191a(context, new Intent(intent), mi3Var, 1);
/* 534 */                                                                   ij3.m4555l(uh3Var);
/* 550 */                                                                   uh3Var.f17534Y.m8511b(zM10191a ? "available" : "not available", "Install Referrer Service is");
                                                                        } catch (RuntimeException e) {
/* 554 */                                                                   uh3 uh3Var3 = ij3Var.f9655f;
/* 556 */                                                                   ij3.m4555l(uh3Var3);
/* 567 */                                                                   uh3Var3.f17538f.m8511b(e.getMessage(), "Exception occurred while binding to Install Referrer Service");
                                                                        }
                                                                    } else {
/* 571 */                                                               ij3.m4555l(uh3Var);
/* 578 */                                                               uh3Var.f17541w.m8510a("Play Store version 8.3.73 or higher required for Install Referrer");
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } else {
/* 404 */                                               ij3.m4555l(uh3Var);
/* 411 */                                               uh3Var.f17532W.m8510a("Install Referrer Reporter is not available");
/* 414 */                                               ij3Var2 = ij3Var4;
/* 416 */                                               str = str3;
                                                    }
                                                }
/* 609 */                                       mo4558b().mo1375y();
/* 612 */                                       m6765k0();
/* 617 */                                       bundle2 = new Bundle();
/* 620 */                                       j6 = j;
/* 622 */                                       bundle2.putLong("_c", j6);
/* 625 */                                       bundle2.putLong("_r", j6);
/* 630 */                                       bundle2.putLong("_uwa", 0L);
/* 633 */                                       bundle2.putLong("_pfo", 0L);
/* 636 */                                       bundle2.putLong("_sys", 0L);
/* 639 */                                       bundle2.putLong("_sysu", 0L);
/* 643 */                                       bundle2.putLong("_et", j6);
/* 646 */                                       if (z3) {
/* 648 */                                           bundle2.putLong("_dac", j6);
                                                }
/* 651 */                                       kb1.m6061n(str);
/* 654 */                                       mp3Var2 = this;
/* 656 */                                       ae3 ae3Var6 = mp3Var2.f13913c;
/* 658 */                                       m6728S(ae3Var6);
/* 661 */                                       kb1.m6058k(str);
/* 664 */                                       ae3Var6.mo1375y();
/* 667 */                                       ae3Var6.m9593A();
/* 670 */                                       str2 = str;
/* 672 */                                       jM234N = ae3Var6.m234N(str2);
/* 676 */                                       ij3Var3 = ij3Var2;
/* 684 */                                       if (ij3Var3.f9645a.getPackageManager() == null) {
/* 698 */                                           mp3Var2.mo4557a().f17538f.m8511b(uh3.m9013H(str2), "PackageManager is null, first open report might be inaccurate. appId");
/* 701 */                                           zzrVar2 = zzrVar;
                                                } else {
                                                    try {
/* 719 */                                               packageInfoM9214c = g93.m3898a(ij3Var3.f9645a).m9214c(0, str2);
                                                    } catch (PackageManager.NameNotFoundException e2) {
/* 737 */                                               mp3Var2.mo4557a().f17538f.m8512c(uh3.m9013H(str2), "Package info is null, first open report might be inaccurate. appId", e2);
/* 740 */                                               packageInfoM9214c = null;
                                                    }
/* 741 */                                           if (packageInfoM9214c != null) {
/* 743 */                                               j8 = packageInfoM9214c.firstInstallTime;
/* 749 */                                               if (j8 != 0) {
/* 755 */                                                   if (j8 != packageInfoM9214c.lastUpdateTime) {
/* 767 */                                                       if (mp3Var2.m6753d0().m7406J(null, vg3.f18080I0)) {
/* 788 */                                                           bundle2.putLong("_uwa", 1L);
                                                                } else if (jM234N == 0) {
/* 777 */                                                           bundle2.putLong("_uwa", 1L);
/* 780 */                                                           z2 = false;
/* 781 */                                                           jM234N = 0;
                                                                }
/* 784 */                                                       z2 = false;
                                                            } else {
/* 792 */                                                       z2 = true;
                                                            }
/* 798 */                                                   if (true != z2) {
/* 800 */                                                       j9 = 0;
                                                            } else {
/* 803 */                                                       j9 = 1;
                                                            }
/* 816 */                                                   zzrVar2 = zzrVar;
/* 818 */                                                   mp3Var2.m6744U(new zzpk(j5, Long.valueOf(j9), "_fi", "auto"), zzrVar2);
                                                        } else {
/* 822 */                                                   zzrVar2 = zzrVar;
                                                        }
                                                    } else {
/* 822 */                                               zzrVar2 = zzrVar;
                                                    }
                                                    try {
/* 831 */                                               applicationInfoM9213b = g93.m3898a(ij3Var3.f9645a).m9213b(0, str2);
                                                    } catch (PackageManager.NameNotFoundException e3) {
/* 849 */                                               mp3Var2.mo4557a().f17538f.m8512c(uh3.m9013H(str2), "Application info is null, first open report might be inaccurate. appId", e3);
/* 852 */                                               applicationInfoM9213b = null;
                                                    }
/* 853 */                                           if (applicationInfoM9213b != null) {
/* 861 */                                               if ((applicationInfoM9213b.flags & 1) != 0) {
/* 863 */                                                   j7 = 1;
/* 865 */                                                   bundle2.putLong("_sys", 1L);
                                                        } else {
/* 869 */                                                   j7 = 1;
                                                        }
/* 875 */                                               if ((applicationInfoM9213b.flags & 128) != 0) {
/* 877 */                                                   bundle2.putLong("_sysu", j7);
                                                        }
                                                    }
                                                }
/* 703 */                                       j10 = jM234N;
/* 884 */                                       if (j10 >= 0) {
/* 886 */                                           bundle2.putLong("_pfo", j10);
                                                }
/* 909 */                                       mp3Var2.m6760i(new zzbg("_f", new zzbe(bundle2), "auto", j5), zzrVar2);
                                                mp3Var2 = mp3Var2;
                                            } catch (Throwable th) {
/* 474 */                                       th = th;
/* 475 */                                       mp3Var2 = this;
/* 1046 */                                      ae3 ae3Var7 = mp3Var2.f13913c;
/* 1048 */                                      m6728S(ae3Var7);
/* 1051 */                                      ae3Var7.m260p0();
/* 1054 */                                      throw th;
                                            }
                                        } else {
/* 378 */                                   ij3Var2 = ij3Var4;
/* 380 */                                   str = str3;
/* 593 */                                   uh3 uh3Var4 = ij3Var.f9655f;
/* 595 */                                   ij3.m4555l(uh3Var4);
/* 602 */                                   uh3Var4.f17530U.m8510a("Install Referrer Reporter was called with invalid app package name");
/* 609 */                                   mo4558b().mo1375y();
/* 612 */                                   m6765k0();
/* 617 */                                   bundle2 = new Bundle();
/* 620 */                                   j6 = j;
/* 622 */                                   bundle2.putLong("_c", j6);
/* 625 */                                   bundle2.putLong("_r", j6);
/* 630 */                                   bundle2.putLong("_uwa", 0L);
/* 633 */                                   bundle2.putLong("_pfo", 0L);
/* 636 */                                   bundle2.putLong("_sys", 0L);
/* 639 */                                   bundle2.putLong("_sysu", 0L);
/* 643 */                                   bundle2.putLong("_et", j6);
/* 646 */                                   if (z3) {
/* 648 */                                       bundle2.putLong("_dac", j6);
                                            }
/* 651 */                                   kb1.m6061n(str);
/* 654 */                                   mp3Var2 = this;
/* 656 */                                   ae3 ae3Var8 = mp3Var2.f13913c;
/* 658 */                                   m6728S(ae3Var8);
/* 661 */                                   kb1.m6058k(str);
/* 664 */                                   ae3Var8.mo1375y();
/* 667 */                                   ae3Var8.m9593A();
/* 670 */                                   str2 = str;
/* 672 */                                   jM234N = ae3Var8.m234N(str2);
/* 676 */                                   ij3Var3 = ij3Var2;
/* 684 */                                   if (ij3Var3.f9645a.getPackageManager() == null) {
/* 698 */                                       mp3Var2.mo4557a().f17538f.m8511b(uh3.m9013H(str2), "PackageManager is null, first open report might be inaccurate. appId");
/* 701 */                                       zzrVar2 = zzrVar;
                                            } else {
/* 719 */                                       packageInfoM9214c = g93.m3898a(ij3Var3.f9645a).m9214c(0, str2);
/* 741 */                                       if (packageInfoM9214c != null) {
/* 743 */                                           j8 = packageInfoM9214c.firstInstallTime;
/* 749 */                                           if (j8 != 0) {
/* 755 */                                               if (j8 != packageInfoM9214c.lastUpdateTime) {
/* 767 */                                                   if (mp3Var2.m6753d0().m7406J(null, vg3.f18080I0)) {
/* 788 */                                                       bundle2.putLong("_uwa", 1L);
                                                            } else if (jM234N == 0) {
/* 777 */                                                       bundle2.putLong("_uwa", 1L);
/* 780 */                                                       z2 = false;
/* 781 */                                                       jM234N = 0;
                                                            }
/* 784 */                                                   z2 = false;
                                                        } else {
/* 792 */                                                   z2 = true;
                                                        }
/* 798 */                                               if (true != z2) {
/* 800 */                                                   j9 = 0;
                                                        } else {
/* 803 */                                                   j9 = 1;
                                                        }
/* 816 */                                               zzrVar2 = zzrVar;
/* 818 */                                               mp3Var2.m6744U(new zzpk(j5, Long.valueOf(j9), "_fi", "auto"), zzrVar2);
                                                    } else {
/* 822 */                                               zzrVar2 = zzrVar;
                                                    }
                                                } else {
/* 822 */                                           zzrVar2 = zzrVar;
                                                }
/* 831 */                                       applicationInfoM9213b = g93.m3898a(ij3Var3.f9645a).m9213b(0, str2);
/* 853 */                                       if (applicationInfoM9213b != null) {
/* 861 */                                           if ((applicationInfoM9213b.flags & 1) != 0) {
/* 863 */                                               j7 = 1;
/* 865 */                                               bundle2.putLong("_sys", 1L);
                                                    } else {
/* 869 */                                               j7 = 1;
                                                    }
/* 875 */                                           if ((applicationInfoM9213b.flags & 128) != 0) {
/* 877 */                                               bundle2.putLong("_sysu", j7);
                                                    }
                                                }
                                            }
/* 703 */                                   j10 = jM234N;
/* 884 */                                   if (j10 >= 0) {
/* 886 */                                       bundle2.putLong("_pfo", j10);
                                            }
/* 909 */                                   mp3Var2.m6760i(new zzbg("_f", new zzbe(bundle2), "auto", j5), zzrVar2);
                                            mp3Var2 = mp3Var2;
                                        }
                                    }
                                } else {
/* 994 */                           j3 = j2;
/* 996 */                           mp3Var = this;
/* 999 */                           if (mp3Var2.f4264w) {
                                        mp3Var2 = mp3Var;
/* 1026 */                              mp3Var.m6760i(new zzbg("_cd", new zzbe(new Bundle()), "auto", j3), mp3Var2);
                                        mp3Var2 = mp3Var;
                                    }
                                }
                                mp3Var2 = mp3Var;
/* 1029 */                      ae3 ae3Var9 = mp3Var2.f13913c;
/* 1031 */                      m6728S(ae3Var9);
/* 1034 */                      ae3Var9.m259o0();
/* 1037 */                      ae3 ae3Var10 = mp3Var2.f13913c;
/* 1039 */                      m6728S(ae3Var10);
/* 1042 */                      ae3Var10.m260p0();
/* 1045 */                      return;
                            }
/* 203 */                   j = 1;
/* 313 */                   if (pe3VarM246Z == null) {
/* 322 */                       j4 = ((j2 / 3600000) + j) * 3600000;
/* 334 */                       if (z) {
/* 340 */                           Long lValueOf3 = Long.valueOf(j4);
/* 346 */                           j5 = j2;
/* 353 */                           m6744U(new zzpk(j5, lValueOf3, "_fot", "auto"), mp3Var2);
/* 360 */                           mo4558b().mo1375y();
/* 363 */                           oi3Var = this.f13904V;
/* 365 */                           kb1.m6061n(oi3Var);
/* 368 */                           ij3Var = oi3Var.f14773b;
/* 370 */                           if (str3 != null) {
/* 376 */                               if (str3.isEmpty()) {
/* 378 */                                   ij3Var2 = ij3Var4;
/* 380 */                                   str = str3;
/* 593 */                                   uh3 uh3Var5 = ij3Var.f9655f;
/* 595 */                                   ij3.m4555l(uh3Var5);
/* 602 */                                   uh3Var5.f17530U.m8510a("Install Referrer Reporter was called with invalid app package name");
                                        } else {
/* 384 */                                   bj3 bj3Var3 = ij3Var.f9659i;
/* 388 */                                   context = ij3Var.f9645a;
/* 390 */                                   uh3Var = ij3Var.f9655f;
/* 392 */                                   ij3.m4555l(bj3Var3);
/* 395 */                                   bj3Var3.mo1375y();
/* 402 */                                   if (oi3Var.m7175a()) {
/* 404 */                                       ij3.m4555l(uh3Var);
/* 411 */                                       uh3Var.f17532W.m8510a("Install Referrer Reporter is not available");
/* 414 */                                       ij3Var2 = ij3Var4;
/* 416 */                                       str = str3;
                                            } else {
/* 420 */                                       ij3Var2 = ij3Var4;
/* 424 */                                       mi3 mi3Var2 = new mi3(oi3Var, str3);
/* 429 */                                       bj3 bj3Var4 = ij3Var.f9659i;
/* 431 */                                       ij3.m4555l(bj3Var4);
/* 434 */                                       bj3Var4.mo1375y();
/* 439 */                                       str = str3;
/* 443 */                                       intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
/* 453 */                                       intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
/* 456 */                                       packageManager = context.getPackageManager();
/* 460 */                                       if (packageManager == null) {
/* 462 */                                           ij3.m4555l(uh3Var);
/* 469 */                                           uh3Var.f17530U.m8510a("Failed to obtain Package Manager to verify binding conditions for Install Referrer");
                                                } else {
/* 480 */                                           listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
/* 484 */                                           if (listQueryIntentServices != null) {
/* 582 */                                               ij3.m4555l(uh3Var);
/* 589 */                                               uh3Var.f17532W.m8510a("Play Service for fetching Install Referrer is unavailable on device");
                                                    } else {
/* 582 */                                               ij3.m4555l(uh3Var);
/* 589 */                                               uh3Var.f17532W.m8510a("Play Service for fetching Install Referrer is unavailable on device");
                                                    }
                                                }
                                            }
                                        }
/* 609 */                               mo4558b().mo1375y();
/* 612 */                               m6765k0();
/* 617 */                               bundle2 = new Bundle();
/* 620 */                               j6 = j;
/* 622 */                               bundle2.putLong("_c", j6);
/* 625 */                               bundle2.putLong("_r", j6);
/* 630 */                               bundle2.putLong("_uwa", 0L);
/* 633 */                               bundle2.putLong("_pfo", 0L);
/* 636 */                               bundle2.putLong("_sys", 0L);
/* 639 */                               bundle2.putLong("_sysu", 0L);
/* 643 */                               bundle2.putLong("_et", j6);
/* 646 */                               if (z3) {
/* 648 */                                   bundle2.putLong("_dac", j6);
                                        }
/* 651 */                               kb1.m6061n(str);
/* 654 */                               mp3Var2 = this;
/* 656 */                               ae3 ae3Var11 = mp3Var2.f13913c;
/* 658 */                               m6728S(ae3Var11);
/* 661 */                               kb1.m6058k(str);
/* 664 */                               ae3Var11.mo1375y();
/* 667 */                               ae3Var11.m9593A();
/* 670 */                               str2 = str;
/* 672 */                               jM234N = ae3Var11.m234N(str2);
/* 676 */                               ij3Var3 = ij3Var2;
/* 684 */                               if (ij3Var3.f9645a.getPackageManager() == null) {
/* 698 */                                   mp3Var2.mo4557a().f17538f.m8511b(uh3.m9013H(str2), "PackageManager is null, first open report might be inaccurate. appId");
/* 701 */                                   zzrVar2 = zzrVar;
                                        } else {
/* 719 */                                   packageInfoM9214c = g93.m3898a(ij3Var3.f9645a).m9214c(0, str2);
/* 741 */                                   if (packageInfoM9214c != null) {
/* 743 */                                       j8 = packageInfoM9214c.firstInstallTime;
/* 749 */                                       if (j8 != 0) {
/* 755 */                                           if (j8 != packageInfoM9214c.lastUpdateTime) {
/* 767 */                                               if (mp3Var2.m6753d0().m7406J(null, vg3.f18080I0)) {
/* 788 */                                                   bundle2.putLong("_uwa", 1L);
                                                        } else if (jM234N == 0) {
/* 777 */                                                   bundle2.putLong("_uwa", 1L);
/* 780 */                                                   z2 = false;
/* 781 */                                                   jM234N = 0;
                                                        }
/* 784 */                                               z2 = false;
                                                    } else {
/* 792 */                                               z2 = true;
                                                    }
/* 798 */                                           if (true != z2) {
/* 800 */                                               j9 = 0;
                                                    } else {
/* 803 */                                               j9 = 1;
                                                    }
/* 816 */                                           zzrVar2 = zzrVar;
/* 818 */                                           mp3Var2.m6744U(new zzpk(j5, Long.valueOf(j9), "_fi", "auto"), zzrVar2);
                                                } else {
/* 822 */                                           zzrVar2 = zzrVar;
                                                }
                                            } else {
/* 822 */                                       zzrVar2 = zzrVar;
                                            }
/* 831 */                                   applicationInfoM9213b = g93.m3898a(ij3Var3.f9645a).m9213b(0, str2);
/* 853 */                                   if (applicationInfoM9213b != null) {
/* 861 */                                       if ((applicationInfoM9213b.flags & 1) != 0) {
/* 863 */                                           j7 = 1;
/* 865 */                                           bundle2.putLong("_sys", 1L);
                                                } else {
/* 869 */                                           j7 = 1;
                                                }
/* 875 */                                       if ((applicationInfoM9213b.flags & 128) != 0) {
/* 877 */                                           bundle2.putLong("_sysu", j7);
                                                }
                                            }
                                        }
/* 703 */                               j10 = jM234N;
/* 884 */                               if (j10 >= 0) {
/* 886 */                                   bundle2.putLong("_pfo", j10);
                                        }
/* 909 */                               mp3Var2.m6760i(new zzbg("_f", new zzbe(bundle2), "auto", j5), zzrVar2);
                                        mp3Var2 = mp3Var2;
                                    } else {
/* 378 */                               ij3Var2 = ij3Var4;
/* 380 */                               str = str3;
/* 593 */                               uh3 uh3Var6 = ij3Var.f9655f;
/* 595 */                               ij3.m4555l(uh3Var6);
/* 602 */                               uh3Var6.f17530U.m8510a("Install Referrer Reporter was called with invalid app package name");
/* 609 */                               mo4558b().mo1375y();
/* 612 */                               m6765k0();
/* 617 */                               bundle2 = new Bundle();
/* 620 */                               j6 = j;
/* 622 */                               bundle2.putLong("_c", j6);
/* 625 */                               bundle2.putLong("_r", j6);
/* 630 */                               bundle2.putLong("_uwa", 0L);
/* 633 */                               bundle2.putLong("_pfo", 0L);
/* 636 */                               bundle2.putLong("_sys", 0L);
/* 639 */                               bundle2.putLong("_sysu", 0L);
/* 643 */                               bundle2.putLong("_et", j6);
/* 646 */                               if (z3) {
/* 648 */                                   bundle2.putLong("_dac", j6);
                                        }
/* 651 */                               kb1.m6061n(str);
/* 654 */                               mp3Var2 = this;
/* 656 */                               ae3 ae3Var12 = mp3Var2.f13913c;
/* 658 */                               m6728S(ae3Var12);
/* 661 */                               kb1.m6058k(str);
/* 664 */                               ae3Var12.mo1375y();
/* 667 */                               ae3Var12.m9593A();
/* 670 */                               str2 = str;
/* 672 */                               jM234N = ae3Var12.m234N(str2);
/* 676 */                               ij3Var3 = ij3Var2;
/* 684 */                               if (ij3Var3.f9645a.getPackageManager() == null) {
/* 698 */                                   mp3Var2.mo4557a().f17538f.m8511b(uh3.m9013H(str2), "PackageManager is null, first open report might be inaccurate. appId");
/* 701 */                                   zzrVar2 = zzrVar;
                                        } else {
/* 719 */                                   packageInfoM9214c = g93.m3898a(ij3Var3.f9645a).m9214c(0, str2);
/* 741 */                                   if (packageInfoM9214c != null) {
/* 743 */                                       j8 = packageInfoM9214c.firstInstallTime;
/* 749 */                                       if (j8 != 0) {
/* 755 */                                           if (j8 != packageInfoM9214c.lastUpdateTime) {
/* 767 */                                               if (mp3Var2.m6753d0().m7406J(null, vg3.f18080I0)) {
/* 788 */                                                   bundle2.putLong("_uwa", 1L);
                                                        } else if (jM234N == 0) {
/* 777 */                                                   bundle2.putLong("_uwa", 1L);
/* 780 */                                                   z2 = false;
/* 781 */                                                   jM234N = 0;
                                                        }
/* 784 */                                               z2 = false;
                                                    } else {
/* 792 */                                               z2 = true;
                                                    }
/* 798 */                                           if (true != z2) {
/* 800 */                                               j9 = 0;
                                                    } else {
/* 803 */                                               j9 = 1;
                                                    }
/* 816 */                                           zzrVar2 = zzrVar;
/* 818 */                                           mp3Var2.m6744U(new zzpk(j5, Long.valueOf(j9), "_fi", "auto"), zzrVar2);
                                                } else {
/* 822 */                                           zzrVar2 = zzrVar;
                                                }
                                            } else {
/* 822 */                                       zzrVar2 = zzrVar;
                                            }
/* 831 */                                   applicationInfoM9213b = g93.m3898a(ij3Var3.f9645a).m9213b(0, str2);
/* 853 */                                   if (applicationInfoM9213b != null) {
/* 861 */                                       if ((applicationInfoM9213b.flags & 1) != 0) {
/* 863 */                                           j7 = 1;
/* 865 */                                           bundle2.putLong("_sys", 1L);
                                                } else {
/* 869 */                                           j7 = 1;
                                                }
/* 875 */                                       if ((applicationInfoM9213b.flags & 128) != 0) {
/* 877 */                                           bundle2.putLong("_sysu", j7);
                                                }
                                            }
                                        }
/* 703 */                               j10 = jM234N;
/* 884 */                               if (j10 >= 0) {
/* 886 */                                   bundle2.putLong("_pfo", j10);
                                        }
/* 909 */                               mp3Var2.m6760i(new zzbg("_f", new zzbe(bundle2), "auto", j5), zzrVar2);
                                        mp3Var2 = mp3Var2;
                                    }
                                } else {
/* 917 */                           mp3 mp3Var4 = this;
/* 922 */                           Long lValueOf4 = Long.valueOf(j4);
/* 928 */                           long j13 = j2;
/* 935 */                           mp3Var4.m6744U(new zzpk(j13, lValueOf4, "_fvt", "auto"), mp3Var2);
/* 942 */                           mp3Var4.mo4558b().mo1375y();
/* 945 */                           mp3Var4.m6765k0();
/* 950 */                           bundle = new Bundle();
/* 955 */                           bundle.putLong("_c", 1L);
/* 958 */                           bundle.putLong("_r", 1L);
/* 961 */                           bundle.putLong("_et", 1L);
/* 964 */                           if (z3) {
/* 966 */                               bundle.putLong("_dac", 1L);
                                    }
/* 989 */                           mp3Var4.m6760i(new zzbg("_v", new zzbe(bundle), "auto", j13), mp3Var2);
                                    mp3Var2 = mp3Var4;
                                }
                            } else {
/* 994 */                       j3 = j2;
/* 996 */                       mp3Var = this;
/* 999 */                       if (mp3Var2.f4264w) {
                                    mp3Var2 = mp3Var;
/* 1026 */                          mp3Var.m6760i(new zzbg("_cd", new zzbe(new Bundle()), "auto", j3), mp3Var2);
                                    mp3Var2 = mp3Var;
                                }
                            }
                            mp3Var2 = mp3Var;
/* 1029 */                  ae3 ae3Var13 = mp3Var2.f13913c;
/* 1031 */                  m6728S(ae3Var13);
/* 1034 */                  ae3Var13.m259o0();
/* 1037 */                  ae3 ae3Var14 = mp3Var2.f13913c;
/* 1039 */                  m6728S(ae3Var14);
/* 1042 */                  ae3Var14.m260p0();
/* 1045 */                  return;
                        } catch (Throwable th2) {
/* 709 */                   th = th2;
                        }
/* 205 */               if (boolM6729T != null) {
/* 229 */                   zzpk zzpkVar = new zzpk(j11, Long.valueOf(true != boolM6729T.booleanValue() ? 0L : j), "_npa", "auto");
/* 234 */                   j2 = j11;
/* 236 */                   if (rp3VarM266v0 == null || !rp3VarM266v0.f16228e.equals(zzpkVar.f4230d)) {
/* 248 */                       m6744U(zzpkVar, mp3Var2);
                            }
                        } else {
/* 252 */                   j2 = j11;
/* 254 */                   if (rp3VarM266v0 != null) {
/* 256 */                       m6745V("_npa", mp3Var2);
                            }
                        }
/* 270 */               if (m6753d0().m7406J(null, vg3.f18123c1)) {
/* 275 */                   m6749Z(mp3Var2, mp3Var2.f4261o0);
                        } else {
/* 280 */                   m6749Z(mp3Var2, j2);
                        }
/* 283 */               m6750a0(zzrVar);
/* 286 */               ae3Var = this.f13913c;
/* 290 */               if (i == 0) {
/* 292 */                   m6728S(ae3Var);
/* 297 */                   pe3VarM246Z = ae3Var.m246Z("events", str3, "_f");
/* 301 */                   z = false;
                        } else {
/* 303 */                   m6728S(ae3Var);
/* 308 */                   pe3VarM246Z = ae3Var.m246Z("events", str3, "_v");
/* 312 */                   z = true;
                        }
                    } catch (Throwable th3) {
/* 199 */               th = th3;
/* 200 */               mp3Var2 = this;
                    }
                }

                /* JADX INFO: renamed from: X */
                public final void m6747X(zzah zzahVar, zzr zzrVar) {
                    zzbg zzbgVar;
/* 3 */             kb1.m6058k(zzahVar.f4197a);
/* 8 */             kb1.m6061n(zzahVar.f4198b);
/* 13 */            kb1.m6061n(zzahVar.f4199c);
/* 20 */            kb1.m6058k(zzahVar.f4199c.f4228b);
/* 27 */            mo4558b().mo1375y();
/* 30 */            m6765k0();
/* 37 */            if (m6726Q(zzrVar)) {
/* 42 */                if (!zzrVar.f4263v) {
/* 44 */                    m6750a0(zzrVar);
/* 47 */                    return;
                        }
/* 50 */                zzah zzahVar2 = new zzah(zzahVar);
/* 53 */                boolean z = false;
/* 54 */                zzahVar2.f4201e = false;
/* 56 */                ae3 ae3Var = this.f13913c;
/* 58 */                m6728S(ae3Var);
/* 61 */                ae3Var.m258n0();
                        try {
/* 64 */                    ae3 ae3Var2 = this.f13913c;
/* 66 */                    m6728S(ae3Var2);
/* 69 */                    String str = zzahVar2.f4197a;
/* 71 */                    kb1.m6061n(str);
/* 78 */                    zzah zzahVarM270z0 = ae3Var2.m270z0(str, zzahVar2.f4199c.f4228b);
/* 82 */                    ij3 ij3Var = this.f13905W;
/* 84 */                    if (zzahVarM270z0 != null && !zzahVarM270z0.f4198b.equals(zzahVar2.f4198b)) {
/* 118 */                       mo4557a().f17541w.m8513d("Updating a conditional user property with different origin. name, origin, origin (from DB)", ij3Var.f9639U.m6658c(zzahVar2.f4199c.f4228b), zzahVar2.f4198b, zzahVarM270z0.f4198b);
                            }
/* 127 */                   if (zzahVarM270z0 != null && zzahVarM270z0.f4201e) {
/* 135 */                       zzahVar2.f4198b = zzahVarM270z0.f4198b;
/* 139 */                       zzahVar2.f4200d = zzahVarM270z0.f4200d;
/* 143 */                       zzahVar2.f4204v = zzahVarM270z0.f4204v;
/* 147 */                       zzahVar2.f4202f = zzahVarM270z0.f4202f;
/* 151 */                       zzahVar2.f4205w = zzahVarM270z0.f4205w;
/* 153 */                       zzahVar2.f4201e = true;
/* 157 */                       zzpk zzpkVar = zzahVar2.f4199c;
/* 176 */                       zzahVar2.f4199c = new zzpk(zzahVarM270z0.f4199c.f4229c, zzpkVar.m2197D1(), zzpkVar.f4228b, zzahVarM270z0.f4199c.f4232f);
                            } else if (TextUtils.isEmpty(zzahVar2.f4202f)) {
/* 189 */                       zzpk zzpkVar2 = zzahVar2.f4199c;
/* 206 */                       zzahVar2.f4199c = new zzpk(zzahVar2.f4200d, zzpkVar2.m2197D1(), zzpkVar2.f4228b, zzahVar2.f4199c.f4232f);
/* 208 */                       zzahVar2.f4201e = true;
/* 210 */                       z = true;
                            }
/* 213 */                   if (zzahVar2.f4201e) {
/* 215 */                       zzpk zzpkVar3 = zzahVar2.f4199c;
/* 219 */                       String str2 = zzahVar2.f4197a;
/* 221 */                       kb1.m6061n(str2);
/* 224 */                       String str3 = zzahVar2.f4198b;
/* 226 */                       String str4 = zzpkVar3.f4228b;
/* 228 */                       long j = zzpkVar3.f4229c;
/* 230 */                       Object objM2197D1 = zzpkVar3.m2197D1();
/* 234 */                       kb1.m6061n(objM2197D1);
/* 237 */                       rp3 rp3Var = new rp3(str2, str3, str4, j, objM2197D1);
/* 240 */                       Object obj = rp3Var.f16228e;
/* 242 */                       String str5 = rp3Var.f16226c;
/* 244 */                       ae3 ae3Var3 = this.f13913c;
/* 246 */                       m6728S(ae3Var3);
/* 253 */                       if (ae3Var3.m265u0(rp3Var)) {
/* 271 */                           mo4557a().f17533X.m8513d("User property updated immediately", zzahVar2.f4197a, ij3Var.f9639U.m6658c(str5), obj);
                                } else {
/* 295 */                           mo4557a().f17538f.m8513d("(2)Too many active user properties, ignoring", uh3.m9013H(zzahVar2.f4197a), ij3Var.f9639U.m6658c(str5), obj);
                                }
/* 298 */                       if (z && (zzbgVar = zzahVar2.f4205w) != null) {
/* 311 */                           m6766l(new zzbg(zzbgVar, zzahVar2.f4200d), zzrVar);
                                }
                            }
/* 314 */                   ae3 ae3Var4 = this.f13913c;
/* 316 */                   m6728S(ae3Var4);
/* 323 */                   if (ae3Var4.m269y0(zzahVar2)) {
/* 351 */                       mo4557a().f17533X.m8513d("Conditional property added", zzahVar2.f4197a, ij3Var.f9639U.m6658c(zzahVar2.f4199c.f4228b), zzahVar2.f4199c.m2197D1());
                            } else {
/* 385 */                       mo4557a().f17538f.m8513d("Too many conditional properties, ignoring", uh3.m9013H(zzahVar2.f4197a), ij3Var.f9639U.m6658c(zzahVar2.f4199c.f4228b), zzahVar2.f4199c.m2197D1());
                            }
/* 388 */                   ae3 ae3Var5 = this.f13913c;
/* 390 */                   m6728S(ae3Var5);
/* 393 */                   ae3Var5.m259o0();
                        } finally {
/* 405 */                   ae3 ae3Var6 = this.f13913c;
/* 407 */                   m6728S(ae3Var6);
/* 410 */                   ae3Var6.m260p0();
                        }
                    }
                }

                /* JADX INFO: renamed from: Y */
                public final void m6748Y(zzah zzahVar, zzr zzrVar) {
/* 3 */             kb1.m6058k(zzahVar.f4197a);
/* 8 */             kb1.m6061n(zzahVar.f4199c);
/* 15 */            kb1.m6058k(zzahVar.f4199c.f4228b);
/* 22 */            mo4558b().mo1375y();
/* 25 */            m6765k0();
/* 32 */            if (m6726Q(zzrVar)) {
/* 37 */                if (!zzrVar.f4263v) {
/* 39 */                    m6750a0(zzrVar);
/* 42 */                    return;
                        }
/* 43 */                ae3 ae3Var = this.f13913c;
/* 45 */                m6728S(ae3Var);
/* 48 */                ae3Var.m258n0();
                        try {
/* 51 */                    m6750a0(zzrVar);
/* 54 */                    String str = zzahVar.f4197a;
/* 56 */                    kb1.m6061n(str);
/* 59 */                    ae3 ae3Var2 = this.f13913c;
/* 61 */                    m6728S(ae3Var2);
/* 68 */                    zzah zzahVarM270z0 = ae3Var2.m270z0(str, zzahVar.f4199c.f4228b);
/* 72 */                    ij3 ij3Var = this.f13905W;
/* 74 */                    if (zzahVarM270z0 != null) {
/* 96 */                        mo4557a().f17533X.m8512c(zzahVar.f4197a, "Removing conditional user property", ij3Var.f9639U.m6658c(zzahVar.f4199c.f4228b));
/* 99 */                        ae3 ae3Var3 = this.f13913c;
/* 101 */                       m6728S(ae3Var3);
/* 108 */                       ae3Var3.m214A0(str, zzahVar.f4199c.f4228b);
/* 113 */                       if (zzahVarM270z0.f4201e) {
/* 115 */                           ae3 ae3Var4 = this.f13913c;
/* 117 */                           m6728S(ae3Var4);
/* 124 */                           ae3Var4.m264t0(str, zzahVar.f4199c.f4228b);
                                }
/* 131 */                       zzbg zzbgVar = zzahVar.f4196V;
/* 133 */                       if (zzbgVar != null) {
/* 135 */                           zzbe zzbeVar = zzbgVar.f4209b;
/* 158 */                           zzbg zzbgVarM9100b0 = m6763j0().m9100b0(zzbgVar.f4208a, zzbeVar != null ? zzbeVar.m2167G1() : null, zzahVarM270z0.f4198b, zzbgVar.f4211d, true);
/* 162 */                           kb1.m6061n(zzbgVarM9100b0);
/* 165 */                           m6766l(zzbgVarM9100b0, zzrVar);
                                }
                            } else {
/* 193 */                       mo4557a().f17541w.m8512c(uh3.m9013H(zzahVar.f4197a), "Conditional user property doesn't exist", ij3Var.f9639U.m6658c(zzahVar.f4199c.f4228b));
                            }
/* 196 */                   ae3 ae3Var5 = this.f13913c;
/* 198 */                   m6728S(ae3Var5);
/* 201 */                   ae3Var5.m259o0();
                        } finally {
/* 213 */                   ae3 ae3Var6 = this.f13913c;
/* 215 */                   m6728S(ae3Var6);
/* 218 */                   ae3Var6.m260p0();
                        }
                    }
                }

                /* JADX INFO: renamed from: Z */
                public final void m6749Z(zzr zzrVar, long j) {
/* 7 */             ae3 ae3Var = this.f13913c;
/* 9 */             m6728S(ae3Var);
/* 12 */            String str = zzrVar.f4240a;
/* 14 */            kb1.m6061n(str);
/* 17 */            di3 di3VarM219D0 = ae3Var.m219D0(str);
/* 22 */            if (di3VarM219D0 != null) {
/* 24 */                m6763j0();
/* 27 */                String str2 = zzrVar.f4242b;
/* 29 */                String strM3096G = di3VarM219D0.m3096G();
/* 33 */                boolean zIsEmpty = TextUtils.isEmpty(str2);
/* 37 */                boolean zIsEmpty2 = TextUtils.isEmpty(strM3096G);
/* 41 */                if (!zIsEmpty && !zIsEmpty2) {
/* 45 */                    kb1.m6061n(str2);
/* 52 */                    if (!str2.equals(strM3096G)) {
/* 70 */                        mo4557a().f17541w.m8511b(uh3.m9013H(di3VarM219D0.m3093D()), "New GMP App Id passed in. Removing cached database data. appId");
/* 73 */                        ae3 ae3Var2 = this.f13913c;
/* 75 */                        m6728S(ae3Var2);
/* 80 */                        ij3 ij3Var = (ij3) ae3Var2.f16749a;
/* 82 */                        String strM3093D = di3VarM219D0.m3093D();
/* 86 */                        ae3Var2.m9593A();
/* 89 */                        ae3Var2.mo1375y();
/* 92 */                        kb1.m6058k(strM3093D);
                                try {
/* 95 */                            SQLiteDatabase sQLiteDatabaseM261q0 = ae3Var2.m261q0();
/* 99 */                            String[] strArr = {strM3093D};
/* 185 */                           int iDelete = sQLiteDatabaseM261q0.delete("events", "app_id=?", strArr) + sQLiteDatabaseM261q0.delete("user_attributes", "app_id=?", strArr) + sQLiteDatabaseM261q0.delete("conditional_properties", "app_id=?", strArr) + sQLiteDatabaseM261q0.delete("apps", "app_id=?", strArr) + sQLiteDatabaseM261q0.delete("raw_events", "app_id=?", strArr) + sQLiteDatabaseM261q0.delete("raw_events_metadata", "app_id=?", strArr) + sQLiteDatabaseM261q0.delete("event_filters", "app_id=?", strArr) + sQLiteDatabaseM261q0.delete("property_filters", "app_id=?", strArr) + sQLiteDatabaseM261q0.delete("audience_filter_values", "app_id=?", strArr) + sQLiteDatabaseM261q0.delete("consent_settings", "app_id=?", strArr) + sQLiteDatabaseM261q0.delete("default_event_params", "app_id=?", strArr) + sQLiteDatabaseM261q0.delete("trigger_uris", "app_id=?", strArr);
/* 186 */                           com.google.android.gms.internal.measurement.zzpk.zza();
/* 197 */                           if (ij3Var.f9651d.m7406J(null, vg3.f18141i1)) {
/* 205 */                               iDelete += sQLiteDatabaseM261q0.delete("no_data_mode_events", "app_id=?", strArr);
                                    }
/* 209 */                           if (iDelete > 0) {
/* 211 */                               uh3 uh3Var = ij3Var.f9655f;
/* 213 */                               ij3.m4555l(uh3Var);
/* 224 */                               uh3Var.f17534Y.m8512c(strM3093D, "Deleted application data. app, records", Integer.valueOf(iDelete));
                                    }
                                } catch (SQLiteException e) {
/* 229 */                           uh3 uh3Var2 = ij3Var.f9655f;
/* 231 */                           ij3.m4555l(uh3Var2);
/* 242 */                           uh3Var2.f17538f.m8512c(uh3.m9013H(strM3093D), "Error deleting application data. appId, error", e);
                                }
/* 227 */                       di3VarM219D0 = null;
                            }
                        }
                    }
/* 246 */           if (di3VarM219D0 != null) {
/* 273 */               boolean z = (di3VarM219D0.m3105P() == -2147483648L || di3VarM219D0.m3105P() == zzrVar.f4234U) ? false : true;
/* 274 */               String strM3103N = di3VarM219D0.m3103N();
/* 299 */               if (z || ((di3VarM219D0.m3105P() != -2147483648L || strM3103N == null || strM3103N.equals(zzrVar.f4244c)) ? false : true)) {
/* 303 */                   Bundle bundle = new Bundle();
/* 308 */                   bundle.putString("_pv", strM3103N);
/* 324 */                   zzbg zzbgVar = new zzbg("_au", new zzbe(bundle), "auto", j);
/* 337 */                   if (m6753d0().m7406J(null, vg3.f18126d1)) {
/* 339 */                       m6760i(zzbgVar, zzrVar);
                            } else {
/* 343 */                       m6762j(zzbgVar, zzrVar);
                            }
                        }
                    }
                }

                @Override // p000.jk3
                /* JADX INFO: renamed from: a */
                public final uh3 mo4557a() {
/* 1 */             ij3 ij3Var = this.f13905W;
/* 3 */             kb1.m6061n(ij3Var);
/* 6 */             uh3 uh3Var = ij3Var.f9655f;
/* 8 */             ij3.m4555l(uh3Var);
/* 11 */            return uh3Var;
                }

                /* JADX WARN: Code duplicated, block: B:100:0x0294 A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:102:0x0297 A[RETURN] */
                /* JADX WARN: Code duplicated, block: B:103:0x0298  */
                /* JADX WARN: Code duplicated, block: B:46:0x012f  */
                /* JADX WARN: Code duplicated, block: B:53:0x0157  */
                /* JADX WARN: Code duplicated, block: B:56:0x0162  */
                /* JADX WARN: Code duplicated, block: B:59:0x016d  */
                /* JADX WARN: Code duplicated, block: B:62:0x0179  */
                /* JADX WARN: Code duplicated, block: B:65:0x018e  */
                /* JADX WARN: Code duplicated, block: B:68:0x019f  */
                /* JADX WARN: Code duplicated, block: B:69:0x01a1  */
                /* JADX WARN: Code duplicated, block: B:72:0x01ec  */
                /* JADX WARN: Code duplicated, block: B:73:0x01f2  */
                /* JADX WARN: Code duplicated, block: B:75:0x0201  */
                /* JADX WARN: Code duplicated, block: B:78:0x0214  */
                /* JADX WARN: Code duplicated, block: B:79:0x0216  */
                /* JADX WARN: Code duplicated, block: B:82:0x022c  */
                /* JADX WARN: Code duplicated, block: B:83:0x022e  */
                /* JADX WARN: Code duplicated, block: B:86:0x0243  */
                /* JADX WARN: Code duplicated, block: B:88:0x0253  */
                /* JADX WARN: Code duplicated, block: B:89:0x0255  */
                /* JADX WARN: Code duplicated, block: B:93:0x0270  */
                /* JADX WARN: Code duplicated, block: B:94:0x0272  */
                /* JADX WARN: Code duplicated, block: B:97:0x0288  */
                /* JADX INFO: renamed from: a0 */
                public final di3 m6750a0(zzr zzrVar) {
                    boolean z;
                    ij3 ij3Var;
                    String str;
                    long j;
                    String str2;
                    String str3;
                    String str4;
                    boolean z2;
                    boolean z3;
                    boolean z4;
                    String str5;
                    boolean z5;
                    String str6;
                    boolean z6;
                    int i;
                    boolean z7;
/* 5 */             mo4558b().mo1375y();
/* 8 */             m6765k0();
/* 11 */            kb1.m6061n(zzrVar);
/* 14 */            boolean z8 = zzrVar.f4238Y;
/* 16 */            String str7 = zzrVar.f4240a;
/* 18 */            kb1.m6058k(str7);
/* 21 */            String str8 = zzrVar.f4249e0;
/* 27 */            if (!str8.isEmpty()) {
/* 36 */                this.f13930o0.put(str7, new jp3(this, str8));
                    }
/* 39 */            ae3 ae3Var = this.f13913c;
/* 41 */            m6728S(ae3Var);
/* 44 */            di3 di3VarM219D0 = ae3Var.m219D0(str7);
/* 60 */            ok3 ok3VarM7190j = m6752d(str7).m7190j(ok3.m7182c(100, zzrVar.f4247d0));
/* 64 */            nk3 nk3Var = nk3.AD_STORAGE;
/* 81 */            String strM8815E = ok3VarM7190j.m7189i(nk3Var) ? this.f13938w.m8815E(str7, z8) : HttpUrl.FRAGMENT_ENCODE_SET;
/* 82 */            boolean z9 = true;
/* 83 */            nk3 nk3Var2 = nk3.ANALYTICS_STORAGE;
/* 86 */            if (di3VarM219D0 != null) {
/* 120 */               ij3 ij3Var2 = di3VarM219D0.f7242a;
/* 126 */               if (ok3VarM7190j.m7189i(nk3Var) && strM8815E != null) {
/* 130 */                   bj3 bj3Var = ij3Var2.f9659i;
/* 132 */                   ij3.m4555l(bj3Var);
/* 135 */                   bj3Var.mo1375y();
/* 144 */                   if (!strM8815E.equals(di3VarM219D0.f7246e)) {
/* 146 */                       bj3 bj3Var2 = ij3Var2.f9659i;
/* 148 */                       ij3.m4555l(bj3Var2);
/* 151 */                       bj3Var2.mo1375y();
/* 156 */                       boolean zIsEmpty = TextUtils.isEmpty(di3VarM219D0.f7246e);
/* 160 */                       di3VarM219D0.m3098I(strM8815E);
/* 163 */                       if (z8) {
/* 165 */                           tn3 tn3Var = this.f13938w;
/* 167 */                           tn3Var.getClass();
/* 196 */                           if (!"00000000-0000-0000-0000-000000000000".equals((ok3VarM7190j.m7189i(nk3Var) ? tn3Var.m8814D(str7) : new Pair(HttpUrl.FRAGMENT_ENCODE_SET, Boolean.FALSE)).first) && !zIsEmpty) {
/* 204 */                               if (ok3VarM7190j.m7189i(nk3Var2)) {
/* 210 */                                   di3VarM219D0.m3095F(m6772o(ok3VarM7190j));
/* 213 */                                   z = false;
                                        } else {
/* 215 */                                   z = true;
                                        }
/* 216 */                               ae3 ae3Var2 = this.f13913c;
/* 218 */                               m6728S(ae3Var2);
/* 227 */                               if (ae3Var2.m266v0(str7, "_id") != null) {
/* 229 */                                   ae3 ae3Var3 = this.f13913c;
/* 231 */                                   m6728S(ae3Var3);
/* 240 */                                   if (ae3Var3.m266v0(str7, "_lair") == null) {
/* 248 */                                       ((xt0) mo4562f()).getClass();
/* 267 */                                       rp3 rp3Var = new rp3(str7, "auto", "_lair", System.currentTimeMillis(), 1L);
/* 270 */                                       ae3 ae3Var4 = this.f13913c;
/* 272 */                                       m6728S(ae3Var4);
/* 275 */                                       ae3Var4.m265u0(rp3Var);
                                            }
                                        }
                                    }
                                }
/* 287 */                       if (TextUtils.isEmpty(di3VarM219D0.m3094E()) && ok3VarM7190j.m7189i(nk3Var2)) {
/* 299 */                           di3VarM219D0.m3095F(m6772o(ok3VarM7190j));
                                }
                            } else if (TextUtils.isEmpty(di3VarM219D0.m3094E())) {
/* 324 */                       di3VarM219D0.m3095F(m6772o(ok3VarM7190j));
                            }
                        } else if (TextUtils.isEmpty(di3VarM219D0.m3094E()) && ok3VarM7190j.m7189i(nk3Var2)) {
/* 324 */                   di3VarM219D0.m3095F(m6772o(ok3VarM7190j));
                        }
/* 329 */               ij3Var = di3VarM219D0.f7242a;
/* 333 */               di3VarM219D0.m3097H(zzrVar.f4242b);
/* 336 */               str = zzrVar.f4235V;
/* 342 */               if (!TextUtils.isEmpty(str)) {
/* 344 */                   di3VarM219D0.m3100K(str);
                        }
/* 347 */               j = zzrVar.f4248e;
/* 353 */               if (j != 0) {
/* 355 */                   di3VarM219D0.m3108S(j);
                        }
/* 358 */               str2 = zzrVar.f4244c;
/* 364 */               if (!TextUtils.isEmpty(str2)) {
/* 366 */                   di3VarM219D0.m3104O(str2);
                        }
/* 371 */               di3VarM219D0.m3106Q(zzrVar.f4234U);
/* 374 */               str3 = zzrVar.f4246d;
/* 376 */               if (str3 != null) {
/* 378 */                   di3VarM219D0.m3107R(str3);
                        }
/* 383 */               di3VarM219D0.m3109a(zzrVar.f4250f);
/* 388 */               di3VarM219D0.m3112d(zzrVar.f4263v);
/* 391 */               str4 = zzrVar.f4254i;
/* 397 */               if (!TextUtils.isEmpty(str4)) {
/* 399 */                   di3VarM219D0.m3130v(str4);
                        }
/* 402 */               bj3 bj3Var3 = ij3Var.f9659i;
/* 404 */               ij3.m4555l(bj3Var3);
/* 407 */               bj3Var3.mo1375y();
/* 410 */               boolean z10 = di3VarM219D0.f7239Q;
/* 414 */               if (di3VarM219D0.f7257p != z8) {
/* 416 */                   z2 = true;
                        } else {
/* 418 */                   z2 = false;
                        }
/* 420 */               di3VarM219D0.f7239Q = z10 | z2;
/* 422 */               di3VarM219D0.f7257p = z8;
/* 424 */               Boolean bool = zzrVar.f4241a0;
/* 426 */               bj3 bj3Var4 = ij3Var.f9659i;
/* 428 */               ij3.m4555l(bj3Var4);
/* 431 */               bj3Var4.mo1375y();
/* 444 */               di3VarM219D0.f7239Q |= !Objects.equals(di3VarM219D0.f7258q, bool);
/* 446 */               di3VarM219D0.f7258q = bool;
/* 450 */               di3VarM219D0.m3111c(zzrVar.f4243b0);
/* 453 */               String str9 = zzrVar.f4251f0;
/* 455 */               bj3 bj3Var5 = ij3Var.f9659i;
/* 457 */               ij3.m4555l(bj3Var5);
/* 460 */               bj3Var5.mo1375y();
/* 473 */               di3VarM219D0.f7239Q |= !Objects.equals(di3VarM219D0.f7261t, str9);
/* 475 */               di3VarM219D0.f7261t = str9;
/* 477 */               zzpn.zza();
/* 491 */               if (m6753d0().m7406J(null, vg3.f18086L0)) {
/* 495 */                   di3VarM219D0.m3132x(zzrVar.f4245c0);
                        } else {
/* 499 */                   zzpn.zza();
/* 512 */                   if (m6753d0().m7406J(null, vg3.f18084K0)) {
/* 514 */                       di3VarM219D0.m3132x(null);
                            }
                        }
/* 517 */               z3 = zzrVar.f4252g0;
/* 519 */               bj3 bj3Var6 = ij3Var.f9659i;
/* 521 */               ij3.m4555l(bj3Var6);
/* 524 */               bj3Var6.mo1375y();
/* 527 */               boolean z11 = di3VarM219D0.f7239Q;
/* 531 */               if (di3VarM219D0.f7262u != z3) {
/* 533 */                   z4 = true;
                        } else {
/* 535 */                   z4 = false;
                        }
/* 537 */               di3VarM219D0.f7239Q = z11 | z4;
/* 539 */               di3VarM219D0.f7262u = z3;
/* 541 */               str5 = zzrVar.f4259m0;
/* 543 */               bj3 bj3Var7 = ij3Var.f9659i;
/* 545 */               ij3.m4555l(bj3Var7);
/* 548 */               bj3Var7.mo1375y();
/* 551 */               boolean z12 = di3VarM219D0.f7239Q;
/* 555 */               if (di3VarM219D0.f7225C != str5) {
/* 557 */                   z5 = true;
                        } else {
/* 559 */                   z5 = false;
                        }
/* 561 */               di3VarM219D0.f7239Q = z12 | z5;
/* 563 */               di3VarM219D0.f7225C = str5;
/* 565 */               zzql.zza();
/* 578 */               if (m6753d0().m7406J(null, vg3.f18094P0)) {
/* 580 */                   i = zzrVar.f4257k0;
/* 582 */                   bj3 bj3Var8 = ij3Var.f9659i;
/* 584 */                   ij3.m4555l(bj3Var8);
/* 587 */                   bj3Var8.mo1375y();
/* 590 */                   boolean z13 = di3VarM219D0.f7239Q;
/* 594 */                   if (di3VarM219D0.f7265x != i) {
/* 596 */                       z7 = true;
                            } else {
/* 598 */                       z7 = false;
                            }
/* 600 */                   di3VarM219D0.f7239Q = z13 | z7;
/* 602 */                   di3VarM219D0.f7265x = i;
                        }
/* 606 */               di3VarM219D0.m3134z(zzrVar.f4253h0);
/* 609 */               str6 = zzrVar.f4260n0;
/* 611 */               bj3 bj3Var9 = ij3Var.f9659i;
/* 613 */               ij3.m4555l(bj3Var9);
/* 616 */               bj3Var9.mo1375y();
/* 619 */               boolean z14 = di3VarM219D0.f7239Q;
/* 623 */               if (di3VarM219D0.f7229G != str6) {
/* 625 */                   z6 = true;
                        } else {
/* 627 */                   z6 = false;
                        }
/* 629 */               di3VarM219D0.f7239Q = z14 | z6;
/* 631 */               di3VarM219D0.f7229G = str6;
/* 633 */               int i2 = zzrVar.f4262p0;
/* 635 */               bj3 bj3Var10 = ij3Var.f9659i;
/* 637 */               ij3.m4555l(bj3Var10);
/* 640 */               bj3Var10.mo1375y();
/* 651 */               di3VarM219D0.f7239Q |= di3VarM219D0.f7231I != i2;
/* 653 */               di3VarM219D0.f7231I = i2;
/* 659 */               if (!di3VarM219D0.m3123o()) {
/* 665 */                   z9 = z;
                        } else if (!z) {
/* 664 */                   return di3VarM219D0;
                        }
/* 666 */               ae3 ae3Var5 = this.f13913c;
/* 668 */               m6728S(ae3Var5);
/* 671 */               ae3Var5.m221E0(di3VarM219D0, z9);
/* 674 */               return di3VarM219D0;
                    }
/* 92 */            di3VarM219D0 = new di3(this.f13905W, str7);
/* 99 */            if (ok3VarM7190j.m7189i(nk3Var2)) {
/* 105 */               di3VarM219D0.m3095F(m6772o(ok3VarM7190j));
                    }
/* 112 */           if (ok3VarM7190j.m7189i(nk3Var)) {
/* 114 */               di3VarM219D0.m3098I(strM8815E);
                    }
/* 117 */           z = false;
/* 329 */           ij3Var = di3VarM219D0.f7242a;
/* 333 */           di3VarM219D0.m3097H(zzrVar.f4242b);
/* 336 */           str = zzrVar.f4235V;
/* 342 */           if (!TextUtils.isEmpty(str)) {
/* 344 */               di3VarM219D0.m3100K(str);
                    }
/* 347 */           j = zzrVar.f4248e;
/* 353 */           if (j != 0) {
/* 355 */               di3VarM219D0.m3108S(j);
                    }
/* 358 */           str2 = zzrVar.f4244c;
/* 364 */           if (!TextUtils.isEmpty(str2)) {
/* 366 */               di3VarM219D0.m3104O(str2);
                    }
/* 371 */           di3VarM219D0.m3106Q(zzrVar.f4234U);
/* 374 */           str3 = zzrVar.f4246d;
/* 376 */           if (str3 != null) {
/* 378 */               di3VarM219D0.m3107R(str3);
                    }
/* 383 */           di3VarM219D0.m3109a(zzrVar.f4250f);
/* 388 */           di3VarM219D0.m3112d(zzrVar.f4263v);
/* 391 */           str4 = zzrVar.f4254i;
/* 397 */           if (!TextUtils.isEmpty(str4)) {
/* 399 */               di3VarM219D0.m3130v(str4);
                    }
/* 402 */           bj3 bj3Var11 = ij3Var.f9659i;
/* 404 */           ij3.m4555l(bj3Var11);
/* 407 */           bj3Var11.mo1375y();
/* 410 */           boolean z15 = di3VarM219D0.f7239Q;
/* 414 */           if (di3VarM219D0.f7257p != z8) {
/* 416 */               z2 = true;
                    } else {
/* 418 */               z2 = false;
                    }
/* 420 */           di3VarM219D0.f7239Q = z15 | z2;
/* 422 */           di3VarM219D0.f7257p = z8;
/* 424 */           Boolean bool2 = zzrVar.f4241a0;
/* 426 */           bj3 bj3Var12 = ij3Var.f9659i;
/* 428 */           ij3.m4555l(bj3Var12);
/* 431 */           bj3Var12.mo1375y();
/* 444 */           di3VarM219D0.f7239Q |= !Objects.equals(di3VarM219D0.f7258q, bool2);
/* 446 */           di3VarM219D0.f7258q = bool2;
/* 450 */           di3VarM219D0.m3111c(zzrVar.f4243b0);
/* 453 */           String str10 = zzrVar.f4251f0;
/* 455 */           bj3 bj3Var13 = ij3Var.f9659i;
/* 457 */           ij3.m4555l(bj3Var13);
/* 460 */           bj3Var13.mo1375y();
/* 473 */           di3VarM219D0.f7239Q |= !Objects.equals(di3VarM219D0.f7261t, str10);
/* 475 */           di3VarM219D0.f7261t = str10;
/* 477 */           zzpn.zza();
/* 491 */           if (m6753d0().m7406J(null, vg3.f18086L0)) {
/* 495 */               di3VarM219D0.m3132x(zzrVar.f4245c0);
                    } else {
/* 499 */               zzpn.zza();
/* 512 */               if (m6753d0().m7406J(null, vg3.f18084K0)) {
/* 514 */                   di3VarM219D0.m3132x(null);
                        }
                    }
/* 517 */           z3 = zzrVar.f4252g0;
/* 519 */           bj3 bj3Var14 = ij3Var.f9659i;
/* 521 */           ij3.m4555l(bj3Var14);
/* 524 */           bj3Var14.mo1375y();
/* 527 */           boolean z16 = di3VarM219D0.f7239Q;
/* 531 */           if (di3VarM219D0.f7262u != z3) {
/* 533 */               z4 = true;
                    } else {
/* 535 */               z4 = false;
                    }
/* 537 */           di3VarM219D0.f7239Q = z16 | z4;
/* 539 */           di3VarM219D0.f7262u = z3;
/* 541 */           str5 = zzrVar.f4259m0;
/* 543 */           bj3 bj3Var15 = ij3Var.f9659i;
/* 545 */           ij3.m4555l(bj3Var15);
/* 548 */           bj3Var15.mo1375y();
/* 551 */           boolean z17 = di3VarM219D0.f7239Q;
/* 555 */           if (di3VarM219D0.f7225C != str5) {
/* 557 */               z5 = true;
                    } else {
/* 559 */               z5 = false;
                    }
/* 561 */           di3VarM219D0.f7239Q = z17 | z5;
/* 563 */           di3VarM219D0.f7225C = str5;
/* 565 */           zzql.zza();
/* 578 */           if (m6753d0().m7406J(null, vg3.f18094P0)) {
/* 580 */               i = zzrVar.f4257k0;
/* 582 */               bj3 bj3Var16 = ij3Var.f9659i;
/* 584 */               ij3.m4555l(bj3Var16);
/* 587 */               bj3Var16.mo1375y();
/* 590 */               boolean z18 = di3VarM219D0.f7239Q;
/* 594 */               if (di3VarM219D0.f7265x != i) {
/* 596 */                   z7 = true;
                        } else {
/* 598 */                   z7 = false;
                        }
/* 600 */               di3VarM219D0.f7239Q = z18 | z7;
/* 602 */               di3VarM219D0.f7265x = i;
                    }
/* 606 */           di3VarM219D0.m3134z(zzrVar.f4253h0);
/* 609 */           str6 = zzrVar.f4260n0;
/* 611 */           bj3 bj3Var17 = ij3Var.f9659i;
/* 613 */           ij3.m4555l(bj3Var17);
/* 616 */           bj3Var17.mo1375y();
/* 619 */           boolean z19 = di3VarM219D0.f7239Q;
/* 623 */           if (di3VarM219D0.f7229G != str6) {
/* 625 */               z6 = true;
                    } else {
/* 627 */               z6 = false;
                    }
/* 629 */           di3VarM219D0.f7239Q = z19 | z6;
/* 631 */           di3VarM219D0.f7229G = str6;
/* 633 */           int i3 = zzrVar.f4262p0;
/* 635 */           bj3 bj3Var18 = ij3Var.f9659i;
/* 637 */           ij3.m4555l(bj3Var18);
/* 640 */           bj3Var18.mo1375y();
/* 651 */           di3VarM219D0.f7239Q |= di3VarM219D0.f7231I != i3;
/* 653 */           di3VarM219D0.f7231I = i3;
/* 659 */           if (!di3VarM219D0.m3123o()) {
/* 665 */               z9 = z;
                    } else if (!z) {
/* 664 */               return di3VarM219D0;
                    }
/* 666 */           ae3 ae3Var6 = this.f13913c;
/* 668 */           m6728S(ae3Var6);
/* 671 */           ae3Var6.m221E0(di3VarM219D0, z9);
/* 674 */           return di3VarM219D0;
                }

                @Override // p000.jk3
                /* JADX INFO: renamed from: b */
                public final bj3 mo4558b() {
/* 1 */             ij3 ij3Var = this.f13905W;
/* 3 */             kb1.m6061n(ij3Var);
/* 6 */             bj3 bj3Var = ij3Var.f9659i;
/* 8 */             ij3.m4555l(bj3Var);
/* 11 */            return bj3Var;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList] */
                /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
                /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List] */
                /* JADX INFO: renamed from: b0 */
                public final List m6751b0(Bundle bundle, zzr zzrVar) {
                    int[] iArr;
/* 11 */            mo4558b().mo1375y();
/* 14 */            zzql.zza();
/* 17 */            pd3 pd3VarM6753d0 = m6753d0();
/* 21 */            String str = zzrVar.f4240a;
/* 29 */            if (!pd3VarM6753d0.m7406J(str, vg3.f18094P0) || str == null) {
/* 333 */               return new ArrayList();
                    }
/* 35 */            if (bundle != null) {
/* 39 */                int[] intArray = bundle.getIntArray("uriSources");
/* 45 */                long[] longArray = bundle.getLongArray("uriTimestamps");
/* 49 */                if (intArray != null) {
/* 51 */                    if (longArray == null || longArray.length != intArray.length) {
/* 196 */                       mo4557a().f17538f.m8510a("Uri sources and timestamps do not match");
                            } else {
/* 59 */                        int i = 0;
/* 61 */                        while (i < intArray.length) {
/* 63 */                            ae3 ae3Var = this.f13913c;
/* 65 */                            m6728S(ae3Var);
/* 70 */                            ij3 ij3Var = (ij3) ae3Var.f16749a;
/* 72 */                            int i2 = intArray[i];
/* 74 */                            long j = longArray[i];
/* 76 */                            kb1.m6058k(str);
/* 79 */                            ae3Var.mo1375y();
/* 82 */                            ae3Var.m9593A();
                                    try {
/* 101 */                               iArr = intArray;
                                        try {
/* 111 */                                   int iDelete = ae3Var.m261q0().delete("trigger_uris", "app_id=? and source=? and timestamp_millis<=?", new String[]{str, String.valueOf(i2), String.valueOf(j)});
/* 115 */                                   uh3 uh3Var = ij3Var.f9655f;
/* 117 */                                   ij3.m4555l(uh3Var);
/* 120 */                                   sh3 sh3Var = uh3Var.f17534Y;
/* 134 */                                   StringBuilder sb = new StringBuilder(String.valueOf(iDelete).length() + 46);
/* 137 */                                   sb.append("Pruned ");
/* 140 */                                   sb.append(iDelete);
/* 143 */                                   sb.append(" trigger URIs. appId, source, timestamp");
/* 158 */                                   sh3Var.m8513d(sb.toString(), str, Integer.valueOf(i2), Long.valueOf(j));
                                        } catch (SQLiteException e) {
/* 162 */                                   e = e;
/* 167 */                                   uh3 uh3Var2 = ij3Var.f9655f;
/* 169 */                                   ij3.m4555l(uh3Var2);
/* 180 */                                   uh3Var2.f17538f.m8512c(uh3.m9013H(str), "Error pruning trigger URIs. appId", e);
                                        }
                                    } catch (SQLiteException e2) {
/* 164 */                               e = e2;
/* 165 */                               iArr = intArray;
                                    }
/* 183 */                           i++;
/* 185 */                           intArray = iArr;
                                }
                            }
                        }
                    }
/* 199 */           ae3 ae3Var2 = this.f13913c;
/* 201 */           m6728S(ae3Var2);
/* 204 */           String str2 = zzrVar.f4240a;
/* 206 */           kb1.m6058k(str2);
/* 209 */           ae3Var2.mo1375y();
/* 212 */           ae3Var2.m9593A();
/* 217 */           ?? arrayList = new ArrayList();
/* 220 */           Cursor cursorQuery = null;
                    try {
                        try {
/* 248 */                   cursorQuery = ae3Var2.m261q0().query("trigger_uris", new String[]{"trigger_uri", "timestamp_millis", FirebaseAnalytics.Param.SOURCE}, "app_id=?", new String[]{str2}, null, null, "rowid", null);
/* 256 */                   if (cursorQuery.moveToFirst()) {
/* 294 */                       do {
/* 259 */                           String string = cursorQuery.getString(0);
/* 263 */                           if (string == null) {
/* 265 */                               string = HttpUrl.FRAGMENT_ENCODE_SET;
                                    }
/* 287 */                           arrayList.add(new zzog(string, cursorQuery.getLong(1), cursorQuery.getInt(2)));
/* 294 */                       } while (cursorQuery.moveToNext());
                            }
                        } finally {
/* 325 */                   if (cursorQuery != null) {
/* 327 */                       cursorQuery.close();
                            }
                        }
                    } catch (SQLiteException e3) {
/* 301 */               uh3 uh3Var3 = ((ij3) ae3Var2.f16749a).f9655f;
/* 303 */               ij3.m4555l(uh3Var3);
/* 314 */               uh3Var3.f17538f.m8512c(uh3.m9013H(str2), "Error querying trigger uris. appId", e3);
/* 317 */               arrayList = Collections.EMPTY_LIST;
                    }
/* 324 */           return arrayList;
                }

                @Override // p000.jk3
                /* JADX INFO: renamed from: c */
                public final q62 mo4559c() {
/* 3 */             return this.f13905W.f9649c;
                }

                /* JADX INFO: renamed from: d */
                public final ok3 m6752d(String str) {
/* 1 */             ok3 ok3Var = ok3.f14791c;
/* 7 */             mo4558b().mo1375y();
/* 10 */            m6765k0();
/* 13 */            HashMap map = this.f13928m0;
/* 19 */            ok3 ok3VarM241U = (ok3) map.get(str);
/* 21 */            if (ok3VarM241U == null) {
/* 23 */                ae3 ae3Var = this.f13913c;
/* 25 */                m6728S(ae3Var);
/* 28 */                ok3VarM241U = ae3Var.m241U(str);
/* 32 */                if (ok3VarM241U == null) {
/* 34 */                    ok3VarM241U = ok3.f14791c;
                        }
/* 40 */                mo4558b().mo1375y();
/* 43 */                m6765k0();
/* 46 */                map.put(str, ok3VarM241U);
/* 49 */                ae3 ae3Var2 = this.f13913c;
/* 51 */                m6728S(ae3Var2);
/* 54 */                ae3Var2.m252g0(str, ok3VarM241U);
                    }
/* 57 */            return ok3VarM241U;
                }

                /* JADX INFO: renamed from: d0 */
                public final pd3 m6753d0() {
/* 1 */             ij3 ij3Var = this.f13905W;
/* 3 */             kb1.m6061n(ij3Var);
/* 6 */             return ij3Var.f9651d;
                }

                @Override // p000.jk3
                /* JADX INFO: renamed from: e */
                public final Context mo4561e() {
/* 3 */             return this.f13905W.f9645a;
                }

                /* JADX INFO: renamed from: e0 */
                public final vi3 m6754e0() {
/* 1 */             vi3 vi3Var = this.f13909a;
/* 3 */             m6728S(vi3Var);
/* 6 */             return vi3Var;
                }

                @Override // p000.jk3
                /* JADX INFO: renamed from: f */
                public final InterfaceC2475xv mo4562f() {
/* 1 */             ij3 ij3Var = this.f13905W;
/* 3 */             kb1.m6061n(ij3Var);
/* 6 */             return ij3Var.f9640V;
                }

                /* JADX INFO: renamed from: f0 */
                public final ae3 m6755f0() {
/* 1 */             ae3 ae3Var = this.f13913c;
/* 3 */             m6728S(ae3Var);
/* 6 */             return ae3Var;
                }

                /* JADX INFO: renamed from: g */
                public final long m6756g() {
/* 7 */             ((xt0) mo4562f()).getClass();
/* 10 */            long jCurrentTimeMillis = System.currentTimeMillis();
/* 14 */            tn3 tn3Var = this.f13938w;
/* 16 */            tn3Var.m9593A();
/* 19 */            tn3Var.mo1375y();
/* 22 */            C1268s c1268s = tn3Var.f17193U;
/* 24 */            long jM4932a = c1268s.m4932a();
/* 32 */            if (jM4932a == 0) {
/* 38 */                up3 up3Var = ((ij3) tn3Var.f16749a).f9668w;
/* 40 */                ij3.m4553j(up3Var);
/* 57 */                jM4932a = ((long) up3Var.m9116w0().nextInt(86400000)) + 1;
/* 58 */                c1268s.m4933b(jM4932a);
                    }
/* 71 */            return ((((jCurrentTimeMillis + jM4932a) / 1000) / 60) / 60) / 24;
                }

                /* JADX INFO: renamed from: g0 */
                public final gi3 m6757g0() {
/* 1 */             gi3 gi3Var = this.f13915d;
/* 3 */             if (gi3Var != null) {
/* 5 */                 return gi3Var;
                    }
/* 8 */             f42.m3656l("Network broadcast receiver not created");
/* 11 */            return null;
                }

                /* JADX INFO: renamed from: h */
                public final void m6758h(zzbg zzbgVar, String str) {
/* 7 */             ae3 ae3Var = this.f13913c;
/* 9 */             m6728S(ae3Var);
/* 12 */            di3 di3VarM219D0 = ae3Var.m219D0(str);
/* 16 */            if (di3VarM219D0 != null) {
/* 18 */                ij3 ij3Var = di3VarM219D0.f7242a;
/* 28 */                if (!TextUtils.isEmpty(di3VarM219D0.m3103N())) {
/* 32 */                    Boolean boolM6741N = m6741N(di3VarM219D0);
/* 36 */                    if (boolM6741N == null) {
/* 46 */                        if (!"_ui".equals(zzbgVar.f4208a)) {
/* 60 */                            mo4557a().f17541w.m8511b(uh3.m9013H(str), "Could not find package. appId");
                                }
                            } else if (!boolM6741N.booleanValue()) {
/* 82 */                        mo4557a().f17538f.m8511b(uh3.m9013H(str), "App version does not match; dropping event. appId");
/* 85 */                        return;
                            }
/* 88 */                    String strM3096G = di3VarM219D0.m3096G();
/* 93 */                    String strM3103N = di3VarM219D0.m3103N();
/* 99 */                    long jM3105P = di3VarM219D0.m3105P();
/* 103 */                   bj3 bj3Var = ij3Var.f9659i;
/* 105 */                   ij3.m4555l(bj3Var);
/* 108 */                   bj3Var.mo1375y();
/* 112 */                   String str2 = di3VarM219D0.f7253l;
/* 114 */                   bj3 bj3Var2 = ij3Var.f9659i;
/* 116 */                   ij3.m4555l(bj3Var2);
/* 119 */                   bj3Var2.mo1375y();
/* 124 */                   long j = di3VarM219D0.f7254m;
/* 126 */                   bj3 bj3Var3 = ij3Var.f9659i;
/* 128 */                   ij3.m4555l(bj3Var3);
/* 131 */                   bj3Var3.mo1375y();
/* 136 */                   long j2 = di3VarM219D0.f7255n;
/* 138 */                   bj3 bj3Var4 = ij3Var.f9659i;
/* 140 */                   ij3.m4555l(bj3Var4);
/* 143 */                   bj3Var4.mo1375y();
/* 147 */                   boolean z = di3VarM219D0.f7256o;
/* 149 */                   String strM3099J = di3VarM219D0.m3099J();
/* 155 */                   bj3 bj3Var5 = ij3Var.f9659i;
/* 157 */                   ij3.m4555l(bj3Var5);
/* 160 */                   bj3Var5.mo1375y();
/* 163 */                   boolean z2 = di3VarM219D0.f7257p;
/* 165 */                   Boolean boolM3131w = di3VarM219D0.m3131w();
/* 169 */                   long jM3110b = di3VarM219D0.m3110b();
/* 175 */                   bj3 bj3Var6 = ij3Var.f9659i;
/* 177 */                   ij3.m4555l(bj3Var6);
/* 180 */                   bj3Var6.mo1375y();
/* 183 */                   ArrayList arrayList = di3VarM219D0.f7260s;
/* 189 */                   String strM7188g = m6752d(str).m7188g();
/* 193 */                   boolean zM3133y = di3VarM219D0.m3133y();
/* 199 */                   bj3 bj3Var7 = ij3Var.f9659i;
/* 201 */                   ij3.m4555l(bj3Var7);
/* 204 */                   bj3Var7.mo1375y();
/* 209 */                   long j3 = di3VarM219D0.f7263v;
/* 215 */                   int i = m6752d(str).f14793b;
/* 223 */                   String str3 = m6771n0(str).f2867b;
/* 225 */                   bj3 bj3Var8 = ij3Var.f9659i;
/* 227 */                   ij3.m4555l(bj3Var8);
/* 230 */                   bj3Var8.mo1375y();
/* 233 */                   int i2 = di3VarM219D0.f7265x;
/* 235 */                   bj3 bj3Var9 = ij3Var.f9659i;
/* 237 */                   ij3.m4555l(bj3Var9);
/* 240 */                   bj3Var9.mo1375y();
/* 290 */                   m6760i(zzbgVar, new zzr(str, strM3096G, strM3103N, jM3105P, str2, j, j2, (String) null, z, false, strM3099J, 0L, 0, z2, false, boolM3131w, jM3110b, (List) arrayList, strM7188g, HttpUrl.FRAGMENT_ENCODE_SET, (String) null, zM3133y, j3, i, str3, i2, di3VarM219D0.f7224B, di3VarM219D0.m3092C(), di3VarM219D0.m3127s(), 0L, di3VarM219D0.m3128t()));
/* 293 */                   return;
                        }
                    }
/* 302 */           mo4557a().f17533X.m8511b(str, "No app data available; dropping event");
                }

                /* JADX INFO: renamed from: h0 */
                public final fd3 m6759h0() {
/* 1 */             fd3 fd3Var = this.f13919f;
/* 3 */             m6728S(fd3Var);
/* 6 */             return fd3Var;
                }

                /* JADX WARN: Code duplicated, block: B:25:0x0097  */
                /* JADX WARN: Code duplicated, block: B:34:0x00eb  */
                /* JADX WARN: Code duplicated, block: B:36:0x00f9  */
                /* JADX WARN: Code duplicated, block: B:40:0x010d  */
                /* JADX WARN: Code duplicated, block: B:47:? A[SYNTHETIC] */
                /* JADX WARN: Not initialized variable reg: 6, insn: 0x0080: MOVE (r5 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]) (LINE:129), block:B:18:0x0080 */
                /* JADX INFO: renamed from: i */
                public final void m6760i(zzbg zzbgVar, zzr zzrVar) {
                    Throwable th;
                    Cursor cursorRawQuery;
                    Cursor cursor;
                    Bundle bundleM1660G;
                    zzbg zzbgVarM9580c;
                    zzbe zzbeVar;
                    String string;
/* 1 */             String str = zzrVar.f4240a;
/* 3 */             kb1.m6058k(str);
/* 6 */             wh3 wh3VarM9578b = wh3.m9578b(zzbgVar);
/* 13 */            Bundle bundle = (Bundle) wh3VarM9578b.f18636e;
/* 15 */            up3 up3VarM6763j0 = m6763j0();
/* 19 */            ae3 ae3Var = this.f13913c;
/* 21 */            m6728S(ae3Var);
/* 26 */            ij3 ij3Var = (ij3) ae3Var.f16749a;
/* 28 */            ae3Var.mo1375y();
/* 31 */            ae3Var.m9593A();
/* 34 */            Cursor cursor2 = null;
                    try {
                        try {
/* 45 */                    cursorRawQuery = ae3Var.m261q0().rawQuery("select parameters from default_event_params where app_id=?", new String[]{str});
                            try {
/* 53 */                        if (cursorRawQuery.moveToFirst()) {
                                    try {
/* 92 */                                zzhs zzhsVar = (zzhs) ((zzhr) ci3.m1677m0(zzhs.zzk(), cursorRawQuery.getBlob(0))).zzbc();
/* 96 */                                ae3Var.f15676b.m6761i0();
/* 103 */                               bundleM1660G = ci3.m1660G(zzhsVar.zza());
/* 107 */                               cursorRawQuery.close();
                                    } catch (IOException e) {
/* 112 */                               uh3 uh3Var = ij3Var.f9655f;
/* 114 */                               ij3.m4555l(uh3Var);
/* 125 */                               uh3Var.f17538f.m8512c(uh3.m9013H(str), "Failed to retrieve default event parameters. appId", e);
/* 150 */                               if (cursorRawQuery != null) {
/* 152 */                                   cursorRawQuery.close();
                                        }
/* 155 */                               bundleM1660G = null;
                                    }
/* 156 */                           up3VarM6763j0.m9090K(bundle, bundleM1660G);
/* 159 */                           up3 up3VarM6763j1 = m6763j0();
/* 163 */                           pd3 pd3VarM6753d0 = m6753d0();
/* 167 */                           pd3VarM6753d0.getClass();
/* 188 */                           up3VarM6763j1.m9086I(wh3VarM9578b, Math.max(Math.min(pd3VarM6753d0.m7404H(str, vg3.f18109X), 100), 25));
/* 191 */                           zzbgVarM9580c = wh3VarM9578b.m9580c();
/* 205 */                           if (!m6753d0().m7406J(null, vg3.f18135g1) && "_cmp".equals(zzbgVarM9580c.f4208a)) {
/* 218 */                               zzbeVar = zzbgVarM9580c.f4209b;
/* 234 */                               if ("referrer API v2".equals(zzbeVar.f4207a.getString("_cis"))) {
/* 240 */                                   string = zzbeVar.f4207a.getString("gclid");
/* 248 */                                   if (!TextUtils.isEmpty(string)) {
/* 261 */                                       m6744U(new zzpk(zzbgVarM9580c.f4211d, string, "_lgclid", "auto"), zzrVar);
                                            }
                                        }
                                    }
/* 264 */                           m6762j(zzbgVarM9580c, zzrVar);
                                }
/* 55 */                        uh3 uh3Var2 = ij3Var.f9655f;
/* 57 */                        ij3.m4555l(uh3Var2);
/* 64 */                        uh3Var2.f17534Y.m8510a("Default event parameters not found");
                            } catch (SQLiteException e2) {
/* 71 */                        e = e2;
/* 138 */                       uh3 uh3Var3 = ij3Var.f9655f;
/* 140 */                       ij3.m4555l(uh3Var3);
/* 147 */                       uh3Var3.f17538f.m8511b(e, "Error selecting default event parameters");
                            }
                        } catch (Throwable th2) {
/* 69 */                    th = th2;
/* 129 */                   cursor2 = cursor;
/* 268 */                   if (cursor2 != null) {
/* 273 */                       throw th;
                            }
/* 270 */                   cursor2.close();
/* 273 */                   throw th;
                        }
                    } catch (SQLiteException e3) {
/* 136 */               e = e3;
/* 137 */               cursorRawQuery = null;
                    } catch (Throwable th3) {
/* 133 */               th = th3;
/* 268 */               if (cursor2 != null) {
/* 273 */                   throw th;
                        }
/* 270 */               cursor2.close();
/* 273 */               throw th;
                    }
/* 150 */           if (cursorRawQuery != null) {
/* 152 */               cursorRawQuery.close();
                    }
/* 155 */           bundleM1660G = null;
/* 156 */           up3VarM6763j0.m9090K(bundle, bundleM1660G);
/* 159 */           up3 up3VarM6763j2 = m6763j0();
/* 163 */           pd3 pd3VarM6753d1 = m6753d0();
/* 167 */           pd3VarM6753d1.getClass();
/* 188 */           up3VarM6763j2.m9086I(wh3VarM9578b, Math.max(Math.min(pd3VarM6753d1.m7404H(str, vg3.f18109X), 100), 25));
/* 191 */           zzbgVarM9580c = wh3VarM9578b.m9580c();
/* 205 */           if (!m6753d0().m7406J(null, vg3.f18135g1)) {
/* 218 */               zzbeVar = zzbgVarM9580c.f4209b;
/* 234 */               if ("referrer API v2".equals(zzbeVar.f4207a.getString("_cis"))) {
/* 240 */                   string = zzbeVar.f4207a.getString("gclid");
/* 248 */                   if (!TextUtils.isEmpty(string)) {
/* 261 */                       m6744U(new zzpk(zzbgVarM9580c.f4211d, string, "_lgclid", "auto"), zzrVar);
                            }
                        }
                    }
/* 264 */           m6762j(zzbgVarM9580c, zzrVar);
                }

                /* JADX INFO: renamed from: i0 */
                public final ci3 m6761i0() {
/* 1 */             ci3 ci3Var = this.f13923i;
/* 3 */             m6728S(ci3Var);
/* 6 */             return ci3Var;
                }

                /* JADX INFO: renamed from: j */
                public final void m6762j(zzbg zzbgVar, zzr zzrVar) {
                    zzbg zzbgVar2;
                    List listM217C0;
                    ij3 ij3Var;
                    List listM217C1;
                    List<zzah> listM217C2;
                    String str;
/* 9 */             kb1.m6061n(zzrVar);
/* 12 */            String str2 = zzrVar.f4240a;
/* 14 */            kb1.m6058k(str2);
/* 21 */            mo4558b().mo1375y();
/* 24 */            m6765k0();
/* 29 */            long j = zzbgVar.f4211d;
/* 31 */            wh3 wh3VarM9578b = wh3.m9578b(zzbgVar);
/* 39 */            mo4558b().mo1375y();
/* 66 */            up3.m9072q0((this.f13932q0 == null || (str = this.f13933r0) == null || !str.equals(str2)) ? null : this.f13932q0, (Bundle) wh3VarM9578b.f18636e, false);
/* 69 */            zzbg zzbgVarM9580c = wh3VarM9578b.m9580c();
/* 73 */            m6761i0();
/* 82 */            if (TextUtils.isEmpty(zzrVar.f4242b)) {
/* 84 */                return;
                    }
/* 87 */            if (!zzrVar.f4263v) {
/* 89 */                m6750a0(zzrVar);
/* 92 */                return;
                    }
/* 93 */            List list = zzrVar.f4245c0;
/* 95 */            if (list != null) {
/* 97 */                String str3 = zzbgVarM9580c.f4208a;
/* 103 */               if (!list.contains(str3)) {
/* 147 */                   mo4557a().f17533X.m8513d("Dropping non-safelisted event. appId, event name, origin", str2, zzbgVarM9580c.f4208a, zzbgVarM9580c.f4210c);
/* 150 */                   return;
                        } else {
/* 107 */                   Bundle bundleM2167G1 = zzbgVarM9580c.f4209b.m2167G1();
/* 115 */                   bundleM2167G1.putLong("ga_safelisted", 1L);
/* 130 */                   zzbgVar2 = new zzbg(str3, new zzbe(bundleM2167G1), zzbgVarM9580c.f4210c, zzbgVarM9580c.f4211d);
                        }
                    } else {
/* 151 */               zzbgVar2 = zzbgVarM9580c;
                    }
/* 152 */           ae3 ae3Var = this.f13913c;
/* 154 */           m6728S(ae3Var);
/* 157 */           ae3Var.m258n0();
                    try {
/* 160 */               String str4 = zzbgVar2.f4208a;
/* 168 */               if ("_s".equals(str4)) {
/* 170 */                   ae3 ae3Var2 = this.f13913c;
/* 172 */                   m6728S(ae3Var2);
/* 179 */                   if (!ae3Var2.m235O(str2, "_s") && zzbgVar2.f4209b.f4207a.getLong("_sid") != 0) {
/* 193 */                       ae3 ae3Var3 = this.f13913c;
/* 195 */                       m6728S(ae3Var3);
/* 204 */                       if (ae3Var3.m235O(str2, "_f")) {
/* 256 */                           ae3 ae3Var4 = this.f13913c;
/* 258 */                           m6728S(ae3Var4);
/* 265 */                           ae3Var4.m240T(str2, null, "_sid", m6764k(zzbgVar2, str2));
                                } else {
/* 206 */                           ae3 ae3Var5 = this.f13913c;
/* 208 */                           m6728S(ae3Var5);
/* 217 */                           if (ae3Var5.m235O(str2, "_v")) {
/* 256 */                               ae3 ae3Var6 = this.f13913c;
/* 258 */                               m6728S(ae3Var6);
/* 265 */                               ae3Var6.m240T(str2, null, "_sid", m6764k(zzbgVar2, str2));
                                    } else {
/* 220 */                               ae3 ae3Var7 = this.f13913c;
/* 222 */                               m6728S(ae3Var7);
/* 231 */                               ((xt0) mo4562f()).getClass();
/* 249 */                               ae3Var7.m240T(str2, Long.valueOf(System.currentTimeMillis() - 15000), "_sid", m6764k(zzbgVar2, str2));
                                    }
                                }
                            }
                        }
/* 268 */               ae3 ae3Var8 = this.f13913c;
/* 270 */               m6728S(ae3Var8);
/* 273 */               kb1.m6058k(str2);
/* 276 */               ae3Var8.mo1375y();
/* 279 */               ae3Var8.m9593A();
/* 284 */               if (j < 0) {
/* 290 */                   uh3 uh3Var = ((ij3) ae3Var8.f16749a).f9655f;
/* 292 */                   ij3.m4555l(uh3Var);
/* 307 */                   uh3Var.f17541w.m8512c(uh3.m9013H(str2), "Invalid time querying timed out conditional properties", Long.valueOf(j));
/* 310 */                   listM217C0 = Collections.EMPTY_LIST;
                        } else {
/* 323 */                   listM217C0 = ae3Var8.m217C0("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str2, String.valueOf(j)});
                        }
/* 327 */               Iterator it = listM217C0.iterator();
                        while (true) {
/* 331 */                   boolean zHasNext = it.hasNext();
/* 335 */                   ij3Var = this.f13905W;
/* 337 */                   if (!zHasNext) {
                                break;
                            }
/* 343 */                   zzah zzahVar = (zzah) it.next();
/* 345 */                   if (zzahVar != null) {
/* 373 */                       mo4557a().f17534Y.m8513d("User property timed out", zzahVar.f4197a, ij3Var.f9639U.m6658c(zzahVar.f4199c.f4228b), zzahVar.f4199c.m2197D1());
/* 376 */                       zzbg zzbgVar3 = zzahVar.f4203i;
/* 378 */                       if (zzbgVar3 != null) {
/* 385 */                           m6766l(new zzbg(zzbgVar3, j), zzrVar);
                                }
/* 388 */                       ae3 ae3Var9 = this.f13913c;
/* 390 */                       m6728S(ae3Var9);
/* 397 */                       ae3Var9.m214A0(str2, zzahVar.f4199c.f4228b);
                            }
                        }
/* 401 */               ae3 ae3Var10 = this.f13913c;
/* 403 */               m6728S(ae3Var10);
/* 406 */               kb1.m6058k(str2);
/* 409 */               ae3Var10.mo1375y();
/* 412 */               ae3Var10.m9593A();
/* 415 */               if (j < 0) {
/* 421 */                   uh3 uh3Var2 = ((ij3) ae3Var10.f16749a).f9655f;
/* 423 */                   ij3.m4555l(uh3Var2);
/* 438 */                   uh3Var2.f17541w.m8512c(uh3.m9013H(str2), "Invalid time querying expired conditional properties", Long.valueOf(j));
/* 441 */                   listM217C1 = Collections.EMPTY_LIST;
                        } else {
/* 454 */                   listM217C1 = ae3Var10.m217C0("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str2, String.valueOf(j)});
                        }
/* 464 */               ArrayList arrayList = new ArrayList(listM217C1.size());
/* 467 */               Iterator it2 = listM217C1.iterator();
/* 475 */               while (it2.hasNext()) {
/* 481 */                   zzah zzahVar2 = (zzah) it2.next();
/* 483 */                   if (zzahVar2 != null) {
/* 497 */                       Iterator it3 = it2;
/* 513 */                       mo4557a().f17534Y.m8513d("User property expired", zzahVar2.f4197a, ij3Var.f9639U.m6658c(zzahVar2.f4199c.f4228b), zzahVar2.f4199c.m2197D1());
/* 516 */                       ae3 ae3Var11 = this.f13913c;
/* 518 */                       m6728S(ae3Var11);
/* 525 */                       ae3Var11.m264t0(str2, zzahVar2.f4199c.f4228b);
/* 528 */                       zzbg zzbgVar4 = zzahVar2.f4196V;
/* 530 */                       if (zzbgVar4 != null) {
/* 532 */                           arrayList.add(zzbgVar4);
                                }
/* 535 */                       ae3 ae3Var12 = this.f13913c;
/* 537 */                       m6728S(ae3Var12);
/* 544 */                       ae3Var12.m214A0(str2, zzahVar2.f4199c.f4228b);
/* 547 */                       it2 = it3;
                            }
                        }
/* 550 */               Iterator it4 = arrayList.iterator();
/* 558 */               while (it4.hasNext()) {
/* 571 */                   m6766l(new zzbg((zzbg) it4.next(), j), zzrVar);
                        }
/* 575 */               ae3 ae3Var13 = this.f13913c;
/* 577 */               m6728S(ae3Var13);
/* 580 */               kb1.m6058k(str2);
/* 583 */               kb1.m6058k(str4);
/* 586 */               ae3Var13.mo1375y();
/* 589 */               ae3Var13.m9593A();
/* 592 */               if (j < 0) {
/* 596 */                   ij3 ij3Var2 = (ij3) ae3Var13.f16749a;
/* 598 */                   uh3 uh3Var3 = ij3Var2.f9655f;
/* 600 */                   ij3.m4555l(uh3Var3);
/* 621 */                   uh3Var3.f17541w.m8513d("Invalid time querying triggered conditional properties", uh3.m9013H(str2), ij3Var2.f9639U.m6656a(str4), Long.valueOf(j));
/* 624 */                   listM217C2 = Collections.EMPTY_LIST;
                        } else {
/* 637 */                   listM217C2 = ae3Var13.m217C0("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str2, str4, String.valueOf(j)});
                        }
/* 647 */               ArrayList arrayList2 = new ArrayList(listM217C2.size());
/* 658 */               for (zzah zzahVar3 : listM217C2) {
/* 666 */                   if (zzahVar3 != null) {
/* 668 */                       zzpk zzpkVar = zzahVar3.f4199c;
/* 673 */                       String str5 = zzahVar3.f4197a;
/* 675 */                       kb1.m6061n(str5);
/* 679 */                       String str6 = zzahVar3.f4198b;
/* 682 */                       String str7 = zzpkVar.f4228b;
/* 684 */                       Object objM2197D1 = zzpkVar.m2197D1();
/* 688 */                       kb1.m6061n(objM2197D1);
/* 696 */                       rp3 rp3Var = new rp3(str5, str6, str7, j, objM2197D1);
/* 699 */                       Object obj = rp3Var.f16228e;
/* 701 */                       String str8 = rp3Var.f16226c;
/* 703 */                       ae3 ae3Var14 = this.f13913c;
/* 705 */                       m6728S(ae3Var14);
/* 712 */                       if (ae3Var14.m265u0(rp3Var)) {
/* 730 */                           mo4557a().f17534Y.m8513d("User property triggered", zzahVar3.f4197a, ij3Var.f9639U.m6658c(str8), obj);
                                } else {
/* 754 */                           mo4557a().f17538f.m8513d("Too many active user properties, ignoring", uh3.m9013H(zzahVar3.f4197a), ij3Var.f9639U.m6658c(str8), obj);
                                }
/* 757 */                       zzbg zzbgVar5 = zzahVar3.f4205w;
/* 759 */                       if (zzbgVar5 != null) {
/* 761 */                           arrayList2.add(zzbgVar5);
                                }
/* 769 */                       zzahVar3.f4199c = new zzpk(rp3Var);
/* 772 */                       zzahVar3.f4201e = true;
/* 774 */                       ae3 ae3Var15 = this.f13913c;
/* 776 */                       m6728S(ae3Var15);
/* 779 */                       ae3Var15.m269y0(zzahVar3);
                            }
                        }
/* 784 */               m6766l(zzbgVar2, zzrVar);
/* 787 */               Iterator it5 = arrayList2.iterator();
/* 795 */               while (it5.hasNext()) {
/* 808 */                   m6766l(new zzbg((zzbg) it5.next(), j), zzrVar);
                        }
/* 812 */               ae3 ae3Var16 = this.f13913c;
/* 814 */               m6728S(ae3Var16);
/* 817 */               ae3Var16.m259o0();
                    } finally {
/* 829 */               ae3 ae3Var17 = this.f13913c;
/* 831 */               m6728S(ae3Var17);
/* 834 */               ae3Var17.m260p0();
                    }
                }

                /* JADX INFO: renamed from: j0 */
                public final up3 m6763j0() {
/* 1 */             ij3 ij3Var = this.f13905W;
/* 3 */             kb1.m6061n(ij3Var);
/* 6 */             up3 up3Var = ij3Var.f9668w;
/* 8 */             ij3.m4553j(up3Var);
/* 11 */            return up3Var;
                }

                /* JADX INFO: renamed from: k */
                public final Bundle m6764k(zzbg zzbgVar, String str) {
/* 3 */             Bundle bundle = new Bundle();
/* 16 */            bundle.putLong("_sid", zzbgVar.f4209b.f4207a.getLong("_sid"));
/* 19 */            ae3 ae3Var = this.f13913c;
/* 21 */            m6728S(ae3Var);
/* 26 */            rp3 rp3VarM266v0 = ae3Var.m266v0(str, "_sno");
/* 30 */            if (rp3VarM266v0 != null) {
/* 32 */                Object obj = rp3VarM266v0.f16228e;
/* 36 */                if (obj instanceof Long) {
/* 44 */                    bundle.putLong("_sno", ((Long) obj).longValue());
                        }
                    }
/* 47 */            return bundle;
                }

                /* JADX INFO: renamed from: k0 */
                public final void m6765k0() {
/* 7 */             if (this.f13906X.get()) {
/* 9 */                 return;
                    }
/* 12 */            f42.m3656l("UploadController is not initialized");
                }

                /* JADX WARN: Code duplicated, block: B:104:0x03eb A[Catch: all -> 0x01ed, TryCatch #7 {all -> 0x01ed, blocks: (B:35:0x01ce, B:38:0x01db, B:40:0x01e3, B:46:0x01f1, B:91:0x0372, B:102:0x03af, B:104:0x03eb, B:106:0x03f0, B:107:0x0407, B:109:0x0412, B:111:0x042c, B:113:0x0432, B:114:0x0449, B:117:0x0468, B:121:0x048a, B:122:0x04a1, B:123:0x04aa, B:126:0x04c7, B:127:0x04db, B:129:0x04e3, B:131:0x04ed, B:133:0x04f3, B:134:0x04fa, B:136:0x0507, B:138:0x050f, B:140:0x0517, B:142:0x051f, B:143:0x052b, B:144:0x0538, B:150:0x0580, B:151:0x0595, B:153:0x05c2, B:156:0x05ec, B:160:0x063c, B:163:0x066a, B:165:0x069a, B:166:0x069d, B:168:0x06a3, B:170:0x06ab, B:172:0x06b1, B:174:0x06b9, B:176:0x06bf, B:180:0x06ce, B:183:0x06db, B:185:0x06e4, B:187:0x06f0, B:190:0x071f, B:192:0x0728, B:196:0x073d, B:201:0x074a, B:236:0x07c5, B:237:0x07cc, B:239:0x07f1, B:242:0x07fa, B:246:0x0807, B:247:0x0823, B:249:0x0829, B:251:0x0843, B:253:0x084f, B:255:0x085c, B:262:0x0891, B:266:0x089b, B:267:0x089e, B:270:0x08ad, B:271:0x08b0, B:282:0x08f3, B:260:0x087d, B:240:0x07f4, B:204:0x0753, B:208:0x0760, B:212:0x076e, B:216:0x077c, B:220:0x078a, B:224:0x0798, B:228:0x07a4, B:232:0x07b2, B:162:0x065d, B:147:0x0565, B:95:0x0384, B:96:0x0390, B:98:0x0396, B:100:0x03a4, B:54:0x0211, B:57:0x021f, B:59:0x0234, B:65:0x024c, B:70:0x027c, B:72:0x0282, B:74:0x0290, B:76:0x029e, B:79:0x02a7, B:87:0x0334, B:89:0x033e, B:81:0x02d6, B:82:0x02ef, B:86:0x0317, B:85:0x0302, B:68:0x0258, B:69:0x0276), top: B:394:0x01ce, inners: #0, #2, #5 }] */
                /* JADX WARN: Code duplicated, block: B:106:0x03f0 A[Catch: all -> 0x01ed, TryCatch #7 {all -> 0x01ed, blocks: (B:35:0x01ce, B:38:0x01db, B:40:0x01e3, B:46:0x01f1, B:91:0x0372, B:102:0x03af, B:104:0x03eb, B:106:0x03f0, B:107:0x0407, B:109:0x0412, B:111:0x042c, B:113:0x0432, B:114:0x0449, B:117:0x0468, B:121:0x048a, B:122:0x04a1, B:123:0x04aa, B:126:0x04c7, B:127:0x04db, B:129:0x04e3, B:131:0x04ed, B:133:0x04f3, B:134:0x04fa, B:136:0x0507, B:138:0x050f, B:140:0x0517, B:142:0x051f, B:143:0x052b, B:144:0x0538, B:150:0x0580, B:151:0x0595, B:153:0x05c2, B:156:0x05ec, B:160:0x063c, B:163:0x066a, B:165:0x069a, B:166:0x069d, B:168:0x06a3, B:170:0x06ab, B:172:0x06b1, B:174:0x06b9, B:176:0x06bf, B:180:0x06ce, B:183:0x06db, B:185:0x06e4, B:187:0x06f0, B:190:0x071f, B:192:0x0728, B:196:0x073d, B:201:0x074a, B:236:0x07c5, B:237:0x07cc, B:239:0x07f1, B:242:0x07fa, B:246:0x0807, B:247:0x0823, B:249:0x0829, B:251:0x0843, B:253:0x084f, B:255:0x085c, B:262:0x0891, B:266:0x089b, B:267:0x089e, B:270:0x08ad, B:271:0x08b0, B:282:0x08f3, B:260:0x087d, B:240:0x07f4, B:204:0x0753, B:208:0x0760, B:212:0x076e, B:216:0x077c, B:220:0x078a, B:224:0x0798, B:228:0x07a4, B:232:0x07b2, B:162:0x065d, B:147:0x0565, B:95:0x0384, B:96:0x0390, B:98:0x0396, B:100:0x03a4, B:54:0x0211, B:57:0x021f, B:59:0x0234, B:65:0x024c, B:70:0x027c, B:72:0x0282, B:74:0x0290, B:76:0x029e, B:79:0x02a7, B:87:0x0334, B:89:0x033e, B:81:0x02d6, B:82:0x02ef, B:86:0x0317, B:85:0x0302, B:68:0x0258, B:69:0x0276), top: B:394:0x01ce, inners: #0, #2, #5 }] */
                /* JADX WARN: Code duplicated, block: B:108:0x0410 A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:109:0x0412 A[Catch: all -> 0x01ed, TryCatch #7 {all -> 0x01ed, blocks: (B:35:0x01ce, B:38:0x01db, B:40:0x01e3, B:46:0x01f1, B:91:0x0372, B:102:0x03af, B:104:0x03eb, B:106:0x03f0, B:107:0x0407, B:109:0x0412, B:111:0x042c, B:113:0x0432, B:114:0x0449, B:117:0x0468, B:121:0x048a, B:122:0x04a1, B:123:0x04aa, B:126:0x04c7, B:127:0x04db, B:129:0x04e3, B:131:0x04ed, B:133:0x04f3, B:134:0x04fa, B:136:0x0507, B:138:0x050f, B:140:0x0517, B:142:0x051f, B:143:0x052b, B:144:0x0538, B:150:0x0580, B:151:0x0595, B:153:0x05c2, B:156:0x05ec, B:160:0x063c, B:163:0x066a, B:165:0x069a, B:166:0x069d, B:168:0x06a3, B:170:0x06ab, B:172:0x06b1, B:174:0x06b9, B:176:0x06bf, B:180:0x06ce, B:183:0x06db, B:185:0x06e4, B:187:0x06f0, B:190:0x071f, B:192:0x0728, B:196:0x073d, B:201:0x074a, B:236:0x07c5, B:237:0x07cc, B:239:0x07f1, B:242:0x07fa, B:246:0x0807, B:247:0x0823, B:249:0x0829, B:251:0x0843, B:253:0x084f, B:255:0x085c, B:262:0x0891, B:266:0x089b, B:267:0x089e, B:270:0x08ad, B:271:0x08b0, B:282:0x08f3, B:260:0x087d, B:240:0x07f4, B:204:0x0753, B:208:0x0760, B:212:0x076e, B:216:0x077c, B:220:0x078a, B:224:0x0798, B:228:0x07a4, B:232:0x07b2, B:162:0x065d, B:147:0x0565, B:95:0x0384, B:96:0x0390, B:98:0x0396, B:100:0x03a4, B:54:0x0211, B:57:0x021f, B:59:0x0234, B:65:0x024c, B:70:0x027c, B:72:0x0282, B:74:0x0290, B:76:0x029e, B:79:0x02a7, B:87:0x0334, B:89:0x033e, B:81:0x02d6, B:82:0x02ef, B:86:0x0317, B:85:0x0302, B:68:0x0258, B:69:0x0276), top: B:394:0x01ce, inners: #0, #2, #5 }] */
                /* JADX WARN: Code duplicated, block: B:111:0x042c A[Catch: all -> 0x01ed, TryCatch #7 {all -> 0x01ed, blocks: (B:35:0x01ce, B:38:0x01db, B:40:0x01e3, B:46:0x01f1, B:91:0x0372, B:102:0x03af, B:104:0x03eb, B:106:0x03f0, B:107:0x0407, B:109:0x0412, B:111:0x042c, B:113:0x0432, B:114:0x0449, B:117:0x0468, B:121:0x048a, B:122:0x04a1, B:123:0x04aa, B:126:0x04c7, B:127:0x04db, B:129:0x04e3, B:131:0x04ed, B:133:0x04f3, B:134:0x04fa, B:136:0x0507, B:138:0x050f, B:140:0x0517, B:142:0x051f, B:143:0x052b, B:144:0x0538, B:150:0x0580, B:151:0x0595, B:153:0x05c2, B:156:0x05ec, B:160:0x063c, B:163:0x066a, B:165:0x069a, B:166:0x069d, B:168:0x06a3, B:170:0x06ab, B:172:0x06b1, B:174:0x06b9, B:176:0x06bf, B:180:0x06ce, B:183:0x06db, B:185:0x06e4, B:187:0x06f0, B:190:0x071f, B:192:0x0728, B:196:0x073d, B:201:0x074a, B:236:0x07c5, B:237:0x07cc, B:239:0x07f1, B:242:0x07fa, B:246:0x0807, B:247:0x0823, B:249:0x0829, B:251:0x0843, B:253:0x084f, B:255:0x085c, B:262:0x0891, B:266:0x089b, B:267:0x089e, B:270:0x08ad, B:271:0x08b0, B:282:0x08f3, B:260:0x087d, B:240:0x07f4, B:204:0x0753, B:208:0x0760, B:212:0x076e, B:216:0x077c, B:220:0x078a, B:224:0x0798, B:228:0x07a4, B:232:0x07b2, B:162:0x065d, B:147:0x0565, B:95:0x0384, B:96:0x0390, B:98:0x0396, B:100:0x03a4, B:54:0x0211, B:57:0x021f, B:59:0x0234, B:65:0x024c, B:70:0x027c, B:72:0x0282, B:74:0x0290, B:76:0x029e, B:79:0x02a7, B:87:0x0334, B:89:0x033e, B:81:0x02d6, B:82:0x02ef, B:86:0x0317, B:85:0x0302, B:68:0x0258, B:69:0x0276), top: B:394:0x01ce, inners: #0, #2, #5 }] */
                /* JADX WARN: Code duplicated, block: B:113:0x0432 A[Catch: all -> 0x01ed, TryCatch #7 {all -> 0x01ed, blocks: (B:35:0x01ce, B:38:0x01db, B:40:0x01e3, B:46:0x01f1, B:91:0x0372, B:102:0x03af, B:104:0x03eb, B:106:0x03f0, B:107:0x0407, B:109:0x0412, B:111:0x042c, B:113:0x0432, B:114:0x0449, B:117:0x0468, B:121:0x048a, B:122:0x04a1, B:123:0x04aa, B:126:0x04c7, B:127:0x04db, B:129:0x04e3, B:131:0x04ed, B:133:0x04f3, B:134:0x04fa, B:136:0x0507, B:138:0x050f, B:140:0x0517, B:142:0x051f, B:143:0x052b, B:144:0x0538, B:150:0x0580, B:151:0x0595, B:153:0x05c2, B:156:0x05ec, B:160:0x063c, B:163:0x066a, B:165:0x069a, B:166:0x069d, B:168:0x06a3, B:170:0x06ab, B:172:0x06b1, B:174:0x06b9, B:176:0x06bf, B:180:0x06ce, B:183:0x06db, B:185:0x06e4, B:187:0x06f0, B:190:0x071f, B:192:0x0728, B:196:0x073d, B:201:0x074a, B:236:0x07c5, B:237:0x07cc, B:239:0x07f1, B:242:0x07fa, B:246:0x0807, B:247:0x0823, B:249:0x0829, B:251:0x0843, B:253:0x084f, B:255:0x085c, B:262:0x0891, B:266:0x089b, B:267:0x089e, B:270:0x08ad, B:271:0x08b0, B:282:0x08f3, B:260:0x087d, B:240:0x07f4, B:204:0x0753, B:208:0x0760, B:212:0x076e, B:216:0x077c, B:220:0x078a, B:224:0x0798, B:228:0x07a4, B:232:0x07b2, B:162:0x065d, B:147:0x0565, B:95:0x0384, B:96:0x0390, B:98:0x0396, B:100:0x03a4, B:54:0x0211, B:57:0x021f, B:59:0x0234, B:65:0x024c, B:70:0x027c, B:72:0x0282, B:74:0x0290, B:76:0x029e, B:79:0x02a7, B:87:0x0334, B:89:0x033e, B:81:0x02d6, B:82:0x02ef, B:86:0x0317, B:85:0x0302, B:68:0x0258, B:69:0x0276), top: B:394:0x01ce, inners: #0, #2, #5 }] */
                /* JADX WARN: Code duplicated, block: B:117:0x0468 A[Catch: all -> 0x01ed, TryCatch #7 {all -> 0x01ed, blocks: (B:35:0x01ce, B:38:0x01db, B:40:0x01e3, B:46:0x01f1, B:91:0x0372, B:102:0x03af, B:104:0x03eb, B:106:0x03f0, B:107:0x0407, B:109:0x0412, B:111:0x042c, B:113:0x0432, B:114:0x0449, B:117:0x0468, B:121:0x048a, B:122:0x04a1, B:123:0x04aa, B:126:0x04c7, B:127:0x04db, B:129:0x04e3, B:131:0x04ed, B:133:0x04f3, B:134:0x04fa, B:136:0x0507, B:138:0x050f, B:140:0x0517, B:142:0x051f, B:143:0x052b, B:144:0x0538, B:150:0x0580, B:151:0x0595, B:153:0x05c2, B:156:0x05ec, B:160:0x063c, B:163:0x066a, B:165:0x069a, B:166:0x069d, B:168:0x06a3, B:170:0x06ab, B:172:0x06b1, B:174:0x06b9, B:176:0x06bf, B:180:0x06ce, B:183:0x06db, B:185:0x06e4, B:187:0x06f0, B:190:0x071f, B:192:0x0728, B:196:0x073d, B:201:0x074a, B:236:0x07c5, B:237:0x07cc, B:239:0x07f1, B:242:0x07fa, B:246:0x0807, B:247:0x0823, B:249:0x0829, B:251:0x0843, B:253:0x084f, B:255:0x085c, B:262:0x0891, B:266:0x089b, B:267:0x089e, B:270:0x08ad, B:271:0x08b0, B:282:0x08f3, B:260:0x087d, B:240:0x07f4, B:204:0x0753, B:208:0x0760, B:212:0x076e, B:216:0x077c, B:220:0x078a, B:224:0x0798, B:228:0x07a4, B:232:0x07b2, B:162:0x065d, B:147:0x0565, B:95:0x0384, B:96:0x0390, B:98:0x0396, B:100:0x03a4, B:54:0x0211, B:57:0x021f, B:59:0x0234, B:65:0x024c, B:70:0x027c, B:72:0x0282, B:74:0x0290, B:76:0x029e, B:79:0x02a7, B:87:0x0334, B:89:0x033e, B:81:0x02d6, B:82:0x02ef, B:86:0x0317, B:85:0x0302, B:68:0x0258, B:69:0x0276), top: B:394:0x01ce, inners: #0, #2, #5 }] */
                /* JADX WARN: Code duplicated, block: B:119:0x0486  */
                /* JADX WARN: Code duplicated, block: B:121:0x048a A[Catch: all -> 0x01ed, TryCatch #7 {all -> 0x01ed, blocks: (B:35:0x01ce, B:38:0x01db, B:40:0x01e3, B:46:0x01f1, B:91:0x0372, B:102:0x03af, B:104:0x03eb, B:106:0x03f0, B:107:0x0407, B:109:0x0412, B:111:0x042c, B:113:0x0432, B:114:0x0449, B:117:0x0468, B:121:0x048a, B:122:0x04a1, B:123:0x04aa, B:126:0x04c7, B:127:0x04db, B:129:0x04e3, B:131:0x04ed, B:133:0x04f3, B:134:0x04fa, B:136:0x0507, B:138:0x050f, B:140:0x0517, B:142:0x051f, B:143:0x052b, B:144:0x0538, B:150:0x0580, B:151:0x0595, B:153:0x05c2, B:156:0x05ec, B:160:0x063c, B:163:0x066a, B:165:0x069a, B:166:0x069d, B:168:0x06a3, B:170:0x06ab, B:172:0x06b1, B:174:0x06b9, B:176:0x06bf, B:180:0x06ce, B:183:0x06db, B:185:0x06e4, B:187:0x06f0, B:190:0x071f, B:192:0x0728, B:196:0x073d, B:201:0x074a, B:236:0x07c5, B:237:0x07cc, B:239:0x07f1, B:242:0x07fa, B:246:0x0807, B:247:0x0823, B:249:0x0829, B:251:0x0843, B:253:0x084f, B:255:0x085c, B:262:0x0891, B:266:0x089b, B:267:0x089e, B:270:0x08ad, B:271:0x08b0, B:282:0x08f3, B:260:0x087d, B:240:0x07f4, B:204:0x0753, B:208:0x0760, B:212:0x076e, B:216:0x077c, B:220:0x078a, B:224:0x0798, B:228:0x07a4, B:232:0x07b2, B:162:0x065d, B:147:0x0565, B:95:0x0384, B:96:0x0390, B:98:0x0396, B:100:0x03a4, B:54:0x0211, B:57:0x021f, B:59:0x0234, B:65:0x024c, B:70:0x027c, B:72:0x0282, B:74:0x0290, B:76:0x029e, B:79:0x02a7, B:87:0x0334, B:89:0x033e, B:81:0x02d6, B:82:0x02ef, B:86:0x0317, B:85:0x0302, B:68:0x0258, B:69:0x0276), top: B:394:0x01ce, inners: #0, #2, #5 }] */
                /* JADX WARN: Code duplicated, block: B:126:0x04c7 A[Catch: all -> 0x01ed, TRY_ENTER, TryCatch #7 {all -> 0x01ed, blocks: (B:35:0x01ce, B:38:0x01db, B:40:0x01e3, B:46:0x01f1, B:91:0x0372, B:102:0x03af, B:104:0x03eb, B:106:0x03f0, B:107:0x0407, B:109:0x0412, B:111:0x042c, B:113:0x0432, B:114:0x0449, B:117:0x0468, B:121:0x048a, B:122:0x04a1, B:123:0x04aa, B:126:0x04c7, B:127:0x04db, B:129:0x04e3, B:131:0x04ed, B:133:0x04f3, B:134:0x04fa, B:136:0x0507, B:138:0x050f, B:140:0x0517, B:142:0x051f, B:143:0x052b, B:144:0x0538, B:150:0x0580, B:151:0x0595, B:153:0x05c2, B:156:0x05ec, B:160:0x063c, B:163:0x066a, B:165:0x069a, B:166:0x069d, B:168:0x06a3, B:170:0x06ab, B:172:0x06b1, B:174:0x06b9, B:176:0x06bf, B:180:0x06ce, B:183:0x06db, B:185:0x06e4, B:187:0x06f0, B:190:0x071f, B:192:0x0728, B:196:0x073d, B:201:0x074a, B:236:0x07c5, B:237:0x07cc, B:239:0x07f1, B:242:0x07fa, B:246:0x0807, B:247:0x0823, B:249:0x0829, B:251:0x0843, B:253:0x084f, B:255:0x085c, B:262:0x0891, B:266:0x089b, B:267:0x089e, B:270:0x08ad, B:271:0x08b0, B:282:0x08f3, B:260:0x087d, B:240:0x07f4, B:204:0x0753, B:208:0x0760, B:212:0x076e, B:216:0x077c, B:220:0x078a, B:224:0x0798, B:228:0x07a4, B:232:0x07b2, B:162:0x065d, B:147:0x0565, B:95:0x0384, B:96:0x0390, B:98:0x0396, B:100:0x03a4, B:54:0x0211, B:57:0x021f, B:59:0x0234, B:65:0x024c, B:70:0x027c, B:72:0x0282, B:74:0x0290, B:76:0x029e, B:79:0x02a7, B:87:0x0334, B:89:0x033e, B:81:0x02d6, B:82:0x02ef, B:86:0x0317, B:85:0x0302, B:68:0x0258, B:69:0x0276), top: B:394:0x01ce, inners: #0, #2, #5 }] */
                /* JADX WARN: Code duplicated, block: B:129:0x04e3 A[Catch: all -> 0x01ed, TryCatch #7 {all -> 0x01ed, blocks: (B:35:0x01ce, B:38:0x01db, B:40:0x01e3, B:46:0x01f1, B:91:0x0372, B:102:0x03af, B:104:0x03eb, B:106:0x03f0, B:107:0x0407, B:109:0x0412, B:111:0x042c, B:113:0x0432, B:114:0x0449, B:117:0x0468, B:121:0x048a, B:122:0x04a1, B:123:0x04aa, B:126:0x04c7, B:127:0x04db, B:129:0x04e3, B:131:0x04ed, B:133:0x04f3, B:134:0x04fa, B:136:0x0507, B:138:0x050f, B:140:0x0517, B:142:0x051f, B:143:0x052b, B:144:0x0538, B:150:0x0580, B:151:0x0595, B:153:0x05c2, B:156:0x05ec, B:160:0x063c, B:163:0x066a, B:165:0x069a, B:166:0x069d, B:168:0x06a3, B:170:0x06ab, B:172:0x06b1, B:174:0x06b9, B:176:0x06bf, B:180:0x06ce, B:183:0x06db, B:185:0x06e4, B:187:0x06f0, B:190:0x071f, B:192:0x0728, B:196:0x073d, B:201:0x074a, B:236:0x07c5, B:237:0x07cc, B:239:0x07f1, B:242:0x07fa, B:246:0x0807, B:247:0x0823, B:249:0x0829, B:251:0x0843, B:253:0x084f, B:255:0x085c, B:262:0x0891, B:266:0x089b, B:267:0x089e, B:270:0x08ad, B:271:0x08b0, B:282:0x08f3, B:260:0x087d, B:240:0x07f4, B:204:0x0753, B:208:0x0760, B:212:0x076e, B:216:0x077c, B:220:0x078a, B:224:0x0798, B:228:0x07a4, B:232:0x07b2, B:162:0x065d, B:147:0x0565, B:95:0x0384, B:96:0x0390, B:98:0x0396, B:100:0x03a4, B:54:0x0211, B:57:0x021f, B:59:0x0234, B:65:0x024c, B:70:0x027c, B:72:0x0282, B:74:0x0290, B:76:0x029e, B:79:0x02a7, B:87:0x0334, B:89:0x033e, B:81:0x02d6, B:82:0x02ef, B:86:0x0317, B:85:0x0302, B:68:0x0258, B:69:0x0276), top: B:394:0x01ce, inners: #0, #2, #5 }] */
                /* JADX WARN: Code duplicated, block: B:133:0x04f3 A[Catch: all -> 0x01ed, TryCatch #7 {all -> 0x01ed, blocks: (B:35:0x01ce, B:38:0x01db, B:40:0x01e3, B:46:0x01f1, B:91:0x0372, B:102:0x03af, B:104:0x03eb, B:106:0x03f0, B:107:0x0407, B:109:0x0412, B:111:0x042c, B:113:0x0432, B:114:0x0449, B:117:0x0468, B:121:0x048a, B:122:0x04a1, B:123:0x04aa, B:126:0x04c7, B:127:0x04db, B:129:0x04e3, B:131:0x04ed, B:133:0x04f3, B:134:0x04fa, B:136:0x0507, B:138:0x050f, B:140:0x0517, B:142:0x051f, B:143:0x052b, B:144:0x0538, B:150:0x0580, B:151:0x0595, B:153:0x05c2, B:156:0x05ec, B:160:0x063c, B:163:0x066a, B:165:0x069a, B:166:0x069d, B:168:0x06a3, B:170:0x06ab, B:172:0x06b1, B:174:0x06b9, B:176:0x06bf, B:180:0x06ce, B:183:0x06db, B:185:0x06e4, B:187:0x06f0, B:190:0x071f, B:192:0x0728, B:196:0x073d, B:201:0x074a, B:236:0x07c5, B:237:0x07cc, B:239:0x07f1, B:242:0x07fa, B:246:0x0807, B:247:0x0823, B:249:0x0829, B:251:0x0843, B:253:0x084f, B:255:0x085c, B:262:0x0891, B:266:0x089b, B:267:0x089e, B:270:0x08ad, B:271:0x08b0, B:282:0x08f3, B:260:0x087d, B:240:0x07f4, B:204:0x0753, B:208:0x0760, B:212:0x076e, B:216:0x077c, B:220:0x078a, B:224:0x0798, B:228:0x07a4, B:232:0x07b2, B:162:0x065d, B:147:0x0565, B:95:0x0384, B:96:0x0390, B:98:0x0396, B:100:0x03a4, B:54:0x0211, B:57:0x021f, B:59:0x0234, B:65:0x024c, B:70:0x027c, B:72:0x0282, B:74:0x0290, B:76:0x029e, B:79:0x02a7, B:87:0x0334, B:89:0x033e, B:81:0x02d6, B:82:0x02ef, B:86:0x0317, B:85:0x0302, B:68:0x0258, B:69:0x0276), top: B:394:0x01ce, inners: #0, #2, #5 }] */
                /* JADX WARN: Code duplicated, block: B:136:0x0507 A[Catch: all -> 0x01ed, TryCatch #7 {all -> 0x01ed, blocks: (B:35:0x01ce, B:38:0x01db, B:40:0x01e3, B:46:0x01f1, B:91:0x0372, B:102:0x03af, B:104:0x03eb, B:106:0x03f0, B:107:0x0407, B:109:0x0412, B:111:0x042c, B:113:0x0432, B:114:0x0449, B:117:0x0468, B:121:0x048a, B:122:0x04a1, B:123:0x04aa, B:126:0x04c7, B:127:0x04db, B:129:0x04e3, B:131:0x04ed, B:133:0x04f3, B:134:0x04fa, B:136:0x0507, B:138:0x050f, B:140:0x0517, B:142:0x051f, B:143:0x052b, B:144:0x0538, B:150:0x0580, B:151:0x0595, B:153:0x05c2, B:156:0x05ec, B:160:0x063c, B:163:0x066a, B:165:0x069a, B:166:0x069d, B:168:0x06a3, B:170:0x06ab, B:172:0x06b1, B:174:0x06b9, B:176:0x06bf, B:180:0x06ce, B:183:0x06db, B:185:0x06e4, B:187:0x06f0, B:190:0x071f, B:192:0x0728, B:196:0x073d, B:201:0x074a, B:236:0x07c5, B:237:0x07cc, B:239:0x07f1, B:242:0x07fa, B:246:0x0807, B:247:0x0823, B:249:0x0829, B:251:0x0843, B:253:0x084f, B:255:0x085c, B:262:0x0891, B:266:0x089b, B:267:0x089e, B:270:0x08ad, B:271:0x08b0, B:282:0x08f3, B:260:0x087d, B:240:0x07f4, B:204:0x0753, B:208:0x0760, B:212:0x076e, B:216:0x077c, B:220:0x078a, B:224:0x0798, B:228:0x07a4, B:232:0x07b2, B:162:0x065d, B:147:0x0565, B:95:0x0384, B:96:0x0390, B:98:0x0396, B:100:0x03a4, B:54:0x0211, B:57:0x021f, B:59:0x0234, B:65:0x024c, B:70:0x027c, B:72:0x0282, B:74:0x0290, B:76:0x029e, B:79:0x02a7, B:87:0x0334, B:89:0x033e, B:81:0x02d6, B:82:0x02ef, B:86:0x0317, B:85:0x0302, B:68:0x0258, B:69:0x0276), top: B:394:0x01ce, inners: #0, #2, #5 }] */
                /* JADX WARN: Code duplicated, block: B:150:0x0580 A[Catch: all -> 0x01ed, TryCatch #7 {all -> 0x01ed, blocks: (B:35:0x01ce, B:38:0x01db, B:40:0x01e3, B:46:0x01f1, B:91:0x0372, B:102:0x03af, B:104:0x03eb, B:106:0x03f0, B:107:0x0407, B:109:0x0412, B:111:0x042c, B:113:0x0432, B:114:0x0449, B:117:0x0468, B:121:0x048a, B:122:0x04a1, B:123:0x04aa, B:126:0x04c7, B:127:0x04db, B:129:0x04e3, B:131:0x04ed, B:133:0x04f3, B:134:0x04fa, B:136:0x0507, B:138:0x050f, B:140:0x0517, B:142:0x051f, B:143:0x052b, B:144:0x0538, B:150:0x0580, B:151:0x0595, B:153:0x05c2, B:156:0x05ec, B:160:0x063c, B:163:0x066a, B:165:0x069a, B:166:0x069d, B:168:0x06a3, B:170:0x06ab, B:172:0x06b1, B:174:0x06b9, B:176:0x06bf, B:180:0x06ce, B:183:0x06db, B:185:0x06e4, B:187:0x06f0, B:190:0x071f, B:192:0x0728, B:196:0x073d, B:201:0x074a, B:236:0x07c5, B:237:0x07cc, B:239:0x07f1, B:242:0x07fa, B:246:0x0807, B:247:0x0823, B:249:0x0829, B:251:0x0843, B:253:0x084f, B:255:0x085c, B:262:0x0891, B:266:0x089b, B:267:0x089e, B:270:0x08ad, B:271:0x08b0, B:282:0x08f3, B:260:0x087d, B:240:0x07f4, B:204:0x0753, B:208:0x0760, B:212:0x076e, B:216:0x077c, B:220:0x078a, B:224:0x0798, B:228:0x07a4, B:232:0x07b2, B:162:0x065d, B:147:0x0565, B:95:0x0384, B:96:0x0390, B:98:0x0396, B:100:0x03a4, B:54:0x0211, B:57:0x021f, B:59:0x0234, B:65:0x024c, B:70:0x027c, B:72:0x0282, B:74:0x0290, B:76:0x029e, B:79:0x02a7, B:87:0x0334, B:89:0x033e, B:81:0x02d6, B:82:0x02ef, B:86:0x0317, B:85:0x0302, B:68:0x0258, B:69:0x0276), top: B:394:0x01ce, inners: #0, #2, #5 }] */
                /* JADX WARN: Code duplicated, block: B:153:0x05c2 A[Catch: all -> 0x01ed, TryCatch #7 {all -> 0x01ed, blocks: (B:35:0x01ce, B:38:0x01db, B:40:0x01e3, B:46:0x01f1, B:91:0x0372, B:102:0x03af, B:104:0x03eb, B:106:0x03f0, B:107:0x0407, B:109:0x0412, B:111:0x042c, B:113:0x0432, B:114:0x0449, B:117:0x0468, B:121:0x048a, B:122:0x04a1, B:123:0x04aa, B:126:0x04c7, B:127:0x04db, B:129:0x04e3, B:131:0x04ed, B:133:0x04f3, B:134:0x04fa, B:136:0x0507, B:138:0x050f, B:140:0x0517, B:142:0x051f, B:143:0x052b, B:144:0x0538, B:150:0x0580, B:151:0x0595, B:153:0x05c2, B:156:0x05ec, B:160:0x063c, B:163:0x066a, B:165:0x069a, B:166:0x069d, B:168:0x06a3, B:170:0x06ab, B:172:0x06b1, B:174:0x06b9, B:176:0x06bf, B:180:0x06ce, B:183:0x06db, B:185:0x06e4, B:187:0x06f0, B:190:0x071f, B:192:0x0728, B:196:0x073d, B:201:0x074a, B:236:0x07c5, B:237:0x07cc, B:239:0x07f1, B:242:0x07fa, B:246:0x0807, B:247:0x0823, B:249:0x0829, B:251:0x0843, B:253:0x084f, B:255:0x085c, B:262:0x0891, B:266:0x089b, B:267:0x089e, B:270:0x08ad, B:271:0x08b0, B:282:0x08f3, B:260:0x087d, B:240:0x07f4, B:204:0x0753, B:208:0x0760, B:212:0x076e, B:216:0x077c, B:220:0x078a, B:224:0x0798, B:228:0x07a4, B:232:0x07b2, B:162:0x065d, B:147:0x0565, B:95:0x0384, B:96:0x0390, B:98:0x0396, B:100:0x03a4, B:54:0x0211, B:57:0x021f, B:59:0x0234, B:65:0x024c, B:70:0x027c, B:72:0x0282, B:74:0x0290, B:76:0x029e, B:79:0x02a7, B:87:0x0334, B:89:0x033e, B:81:0x02d6, B:82:0x02ef, B:86:0x0317, B:85:0x0302, B:68:0x0258, B:69:0x0276), top: B:394:0x01ce, inners: #0, #2, #5 }] */
                /* JADX WARN: Code duplicated, block: B:155:0x05ea A[ADDED_TO_REGION] */
                /* JADX WARN: Code duplicated, block: B:162:0x065d A[Catch: all -> 0x01ed, TryCatch #7 {all -> 0x01ed, blocks: (B:35:0x01ce, B:38:0x01db, B:40:0x01e3, B:46:0x01f1, B:91:0x0372, B:102:0x03af, B:104:0x03eb, B:106:0x03f0, B:107:0x0407, B:109:0x0412, B:111:0x042c, B:113:0x0432, B:114:0x0449, B:117:0x0468, B:121:0x048a, B:122:0x04a1, B:123:0x04aa, B:126:0x04c7, B:127:0x04db, B:129:0x04e3, B:131:0x04ed, B:133:0x04f3, B:134:0x04fa, B:136:0x0507, B:138:0x050f, B:140:0x0517, B:142:0x051f, B:143:0x052b, B:144:0x0538, B:150:0x0580, B:151:0x0595, B:153:0x05c2, B:156:0x05ec, B:160:0x063c, B:163:0x066a, B:165:0x069a, B:166:0x069d, B:168:0x06a3, B:170:0x06ab, B:172:0x06b1, B:174:0x06b9, B:176:0x06bf, B:180:0x06ce, B:183:0x06db, B:185:0x06e4, B:187:0x06f0, B:190:0x071f, B:192:0x0728, B:196:0x073d, B:201:0x074a, B:236:0x07c5, B:237:0x07cc, B:239:0x07f1, B:242:0x07fa, B:246:0x0807, B:247:0x0823, B:249:0x0829, B:251:0x0843, B:253:0x084f, B:255:0x085c, B:262:0x0891, B:266:0x089b, B:267:0x089e, B:270:0x08ad, B:271:0x08b0, B:282:0x08f3, B:260:0x087d, B:240:0x07f4, B:204:0x0753, B:208:0x0760, B:212:0x076e, B:216:0x077c, B:220:0x078a, B:224:0x0798, B:228:0x07a4, B:232:0x07b2, B:162:0x065d, B:147:0x0565, B:95:0x0384, B:96:0x0390, B:98:0x0396, B:100:0x03a4, B:54:0x0211, B:57:0x021f, B:59:0x0234, B:65:0x024c, B:70:0x027c, B:72:0x0282, B:74:0x0290, B:76:0x029e, B:79:0x02a7, B:87:0x0334, B:89:0x033e, B:81:0x02d6, B:82:0x02ef, B:86:0x0317, B:85:0x0302, B:68:0x0258, B:69:0x0276), top: B:394:0x01ce, inners: #0, #2, #5 }] */
                /* JADX WARN: Code duplicated, block: B:165:0x069a A[Catch: all -> 0x01ed, TryCatch #7 {all -> 0x01ed, blocks: (B:35:0x01ce, B:38:0x01db, B:40:0x01e3, B:46:0x01f1, B:91:0x0372, B:102:0x03af, B:104:0x03eb, B:106:0x03f0, B:107:0x0407, B:109:0x0412, B:111:0x042c, B:113:0x0432, B:114:0x0449, B:117:0x0468, B:121:0x048a, B:122:0x04a1, B:123:0x04aa, B:126:0x04c7, B:127:0x04db, B:129:0x04e3, B:131:0x04ed, B:133:0x04f3, B:134:0x04fa, B:136:0x0507, B:138:0x050f, B:140:0x0517, B:142:0x051f, B:143:0x052b, B:144:0x0538, B:150:0x0580, B:151:0x0595, B:153:0x05c2, B:156:0x05ec, B:160:0x063c, B:163:0x066a, B:165:0x069a, B:166:0x069d, B:168:0x06a3, B:170:0x06ab, B:172:0x06b1, B:174:0x06b9, B:176:0x06bf, B:180:0x06ce, B:183:0x06db, B:185:0x06e4, B:187:0x06f0, B:190:0x071f, B:192:0x0728, B:196:0x073d, B:201:0x074a, B:236:0x07c5, B:237:0x07cc, B:239:0x07f1, B:242:0x07fa, B:246:0x0807, B:247:0x0823, B:249:0x0829, B:251:0x0843, B:253:0x084f, B:255:0x085c, B:262:0x0891, B:266:0x089b, B:267:0x089e, B:270:0x08ad, B:271:0x08b0, B:282:0x08f3, B:260:0x087d, B:240:0x07f4, B:204:0x0753, B:208:0x0760, B:212:0x076e, B:216:0x077c, B:220:0x078a, B:224:0x0798, B:228:0x07a4, B:232:0x07b2, B:162:0x065d, B:147:0x0565, B:95:0x0384, B:96:0x0390, B:98:0x0396, B:100:0x03a4, B:54:0x0211, B:57:0x021f, B:59:0x0234, B:65:0x024c, B:70:0x027c, B:72:0x0282, B:74:0x0290, B:76:0x029e, B:79:0x02a7, B:87:0x0334, B:89:0x033e, B:81:0x02d6, B:82:0x02ef, B:86:0x0317, B:85:0x0302, B:68:0x0258, B:69:0x0276), top: B:394:0x01ce, inners: #0, #2, #5 }] */
                /* JADX WARN: Code duplicated, block: B:168:0x06a3 A[Catch: all -> 0x01ed, TryCatch #7 {all -> 0x01ed, blocks: (B:35:0x01ce, B:38:0x01db, B:40:0x01e3, B:46:0x01f1, B:91:0x0372, B:102:0x03af, B:104:0x03eb, B:106:0x03f0, B:107:0x0407, B:109:0x0412, B:111:0x042c, B:113:0x0432, B:114:0x0449, B:117:0x0468, B:121:0x048a, B:122:0x04a1, B:123:0x04aa, B:126:0x04c7, B:127:0x04db, B:129:0x04e3, B:131:0x04ed, B:133:0x04f3, B:134:0x04fa, B:136:0x0507, B:138:0x050f, B:140:0x0517, B:142:0x051f, B:143:0x052b, B:144:0x0538, B:150:0x0580, B:151:0x0595, B:153:0x05c2, B:156:0x05ec, B:160:0x063c, B:163:0x066a, B:165:0x069a, B:166:0x069d, B:168:0x06a3, B:170:0x06ab, B:172:0x06b1, B:174:0x06b9, B:176:0x06bf, B:180:0x06ce, B:183:0x06db, B:185:0x06e4, B:187:0x06f0, B:190:0x071f, B:192:0x0728, B:196:0x073d, B:201:0x074a, B:236:0x07c5, B:237:0x07cc, B:239:0x07f1, B:242:0x07fa, B:246:0x0807, B:247:0x0823, B:249:0x0829, B:251:0x0843, B:253:0x084f, B:255:0x085c, B:262:0x0891, B:266:0x089b, B:267:0x089e, B:270:0x08ad, B:271:0x08b0, B:282:0x08f3, B:260:0x087d, B:240:0x07f4, B:204:0x0753, B:208:0x0760, B:212:0x076e, B:216:0x077c, B:220:0x078a, B:224:0x0798, B:228:0x07a4, B:232:0x07b2, B:162:0x065d, B:147:0x0565, B:95:0x0384, B:96:0x0390, B:98:0x0396, B:100:0x03a4, B:54:0x0211, B:57:0x021f, B:59:0x0234, B:65:0x024c, B:70:0x027c, B:72:0x0282, B:74:0x0290, B:76:0x029e, B:79:0x02a7, B:87:0x0334, B:89:0x033e, B:81:0x02d6, B:82:0x02ef, B:86:0x0317, B:85:0x0302, B:68:0x0258, B:69:0x0276), top: B:394:0x01ce, inners: #0, #2, #5 }] */
                /* JADX WARN: Code duplicated, block: B:169:0x06a9  */
                /* JADX WARN: Code duplicated, block: B:172:0x06b1 A[Catch: all -> 0x01ed, TryCatch #7 {all -> 0x01ed, blocks: (B:35:0x01ce, B:38:0x01db, B:40:0x01e3, B:46:0x01f1, B:91:0x0372, B:102:0x03af, B:104:0x03eb, B:106:0x03f0, B:107:0x0407, B:109:0x0412, B:111:0x042c, B:113:0x0432, B:114:0x0449, B:117:0x0468, B:121:0x048a, B:122:0x04a1, B:123:0x04aa, B:126:0x04c7, B:127:0x04db, B:129:0x04e3, B:131:0x04ed, B:133:0x04f3, B:134:0x04fa, B:136:0x0507, B:138:0x050f, B:140:0x0517, B:142:0x051f, B:143:0x052b, B:144:0x0538, B:150:0x0580, B:151:0x0595, B:153:0x05c2, B:156:0x05ec, B:160:0x063c, B:163:0x066a, B:165:0x069a, B:166:0x069d, B:168:0x06a3, B:170:0x06ab, B:172:0x06b1, B:174:0x06b9, B:176:0x06bf, B:180:0x06ce, B:183:0x06db, B:185:0x06e4, B:187:0x06f0, B:190:0x071f, B:192:0x0728, B:196:0x073d, B:201:0x074a, B:236:0x07c5, B:237:0x07cc, B:239:0x07f1, B:242:0x07fa, B:246:0x0807, B:247:0x0823, B:249:0x0829, B:251:0x0843, B:253:0x084f, B:255:0x085c, B:262:0x0891, B:266:0x089b, B:267:0x089e, B:270:0x08ad, B:271:0x08b0, B:282:0x08f3, B:260:0x087d, B:240:0x07f4, B:204:0x0753, B:208:0x0760, B:212:0x076e, B:216:0x077c, B:220:0x078a, B:224:0x0798, B:228:0x07a4, B:232:0x07b2, B:162:0x065d, B:147:0x0565, B:95:0x0384, B:96:0x0390, B:98:0x0396, B:100:0x03a4, B:54:0x0211, B:57:0x021f, B:59:0x0234, B:65:0x024c, B:70:0x027c, B:72:0x0282, B:74:0x0290, B:76:0x029e, B:79:0x02a7, B:87:0x0334, B:89:0x033e, B:81:0x02d6, B:82:0x02ef, B:86:0x0317, B:85:0x0302, B:68:0x0258, B:69:0x0276), top: B:394:0x01ce, inners: #0, #2, #5 }] */
                /* JADX WARN: Code duplicated, block: B:173:0x06b7  */
                /* JADX WARN: Code duplicated, block: B:176:0x06bf A[Catch: all -> 0x01ed, TryCatch #7 {all -> 0x01ed, blocks: (B:35:0x01ce, B:38:0x01db, B:40:0x01e3, B:46:0x01f1, B:91:0x0372, B:102:0x03af, B:104:0x03eb, B:106:0x03f0, B:107:0x0407, B:109:0x0412, B:111:0x042c, B:113:0x0432, B:114:0x0449, B:117:0x0468, B:121:0x048a, B:122:0x04a1, B:123:0x04aa, B:126:0x04c7, B:127:0x04db, B:129:0x04e3, B:131:0x04ed, B:133:0x04f3, B:134:0x04fa, B:136:0x0507, B:138:0x050f, B:140:0x0517, B:142:0x051f, B:143:0x052b, B:144:0x0538, B:150:0x0580, B:151:0x0595, B:153:0x05c2, B:156:0x05ec, B:160:0x063c, B:163:0x066a, B:165:0x069a, B:166:0x069d, B:168:0x06a3, B:170:0x06ab, B:172:0x06b1, B:174:0x06b9, B:176:0x06bf, B:180:0x06ce, B:183:0x06db, B:185:0x06e4, B:187:0x06f0, B:190:0x071f, B:192:0x0728, B:196:0x073d, B:201:0x074a, B:236:0x07c5, B:237:0x07cc, B:239:0x07f1, B:242:0x07fa, B:246:0x0807, B:247:0x0823, B:249:0x0829, B:251:0x0843, B:253:0x084f, B:255:0x085c, B:262:0x0891, B:266:0x089b, B:267:0x089e, B:270:0x08ad, B:271:0x08b0, B:282:0x08f3, B:260:0x087d, B:240:0x07f4, B:204:0x0753, B:208:0x0760, B:212:0x076e, B:216:0x077c, B:220:0x078a, B:224:0x0798, B:228:0x07a4, B:232:0x07b2, B:162:0x065d, B:147:0x0565, B:95:0x0384, B:96:0x0390, B:98:0x0396, B:100:0x03a4, B:54:0x0211, B:57:0x021f, B:59:0x0234, B:65:0x024c, B:70:0x027c, B:72:0x0282, B:74:0x0290, B:76:0x029e, B:79:0x02a7, B:87:0x0334, B:89:0x033e, B:81:0x02d6, B:82:0x02ef, B:86:0x0317, B:85:0x0302, B:68:0x0258, B:69:0x0276), top: B:394:0x01ce, inners: #0, #2, #5 }] */
                /* JADX WARN: Code duplicated, block: B:177:0x06c5  */
                /* JADX WARN: Code duplicated, block: B:180:0x06ce A[Catch: all -> 0x01ed, TryCatch #7 {all -> 0x01ed, blocks: (B:35:0x01ce, B:38:0x01db, B:40:0x01e3, B:46:0x01f1, B:91:0x0372, B:102:0x03af, B:104:0x03eb, B:106:0x03f0, B:107:0x0407, B:109:0x0412, B:111:0x042c, B:113:0x0432, B:114:0x0449, B:117:0x0468, B:121:0x048a, B:122:0x04a1, B:123:0x04aa, B:126:0x04c7, B:127:0x04db, B:129:0x04e3, B:131:0x04ed, B:133:0x04f3, B:134:0x04fa, B:136:0x0507, B:138:0x050f, B:140:0x0517, B:142:0x051f, B:143:0x052b, B:144:0x0538, B:150:0x0580, B:151:0x0595, B:153:0x05c2, B:156:0x05ec, B:160:0x063c, B:163:0x066a, B:165:0x069a, B:166:0x069d, B:168:0x06a3, B:170:0x06ab, B:172:0x06b1, B:174:0x06b9, B:176:0x06bf, B:180:0x06ce, B:183:0x06db, B:185:0x06e4, B:187:0x06f0, B:190:0x071f, B:192:0x0728, B:196:0x073d, B:201:0x074a, B:236:0x07c5, B:237:0x07cc, B:239:0x07f1, B:242:0x07fa, B:246:0x0807, B:247:0x0823, B:249:0x0829, B:251:0x0843, B:253:0x084f, B:255:0x085c, B:262:0x0891, B:266:0x089b, B:267:0x089e, B:270:0x08ad, B:271:0x08b0, B:282:0x08f3, B:260:0x087d, B:240:0x07f4, B:204:0x0753, B:208:0x0760, B:212:0x076e, B:216:0x077c, B:220:0x078a, B:224:0x0798, B:228:0x07a4, B:232:0x07b2, B:162:0x065d, B:147:0x0565, B:95:0x0384, B:96:0x0390, B:98:0x0396, B:100:0x03a4, B:54:0x0211, B:57:0x021f, B:59:0x0234, B:65:0x024c, B:70:0x027c, B:72:0x0282, B:74:0x0290, B:76:0x029e, B:79:0x02a7, B:87:0x0334, B:89:0x033e, B:81:0x02d6, B:82:0x02ef, B:86:0x0317, B:85:0x0302, B:68:0x0258, B:69:0x0276), top: B:394:0x01ce, inners: #0, #2, #5 }] */
                /* JADX WARN: Code duplicated, block: B:182:0x06d8  */
                /* JADX WARN: Code duplicated, block: B:185:0x06e4 A[Catch: all -> 0x01ed, TryCatch #7 {all -> 0x01ed, blocks: (B:35:0x01ce, B:38:0x01db, B:40:0x01e3, B:46:0x01f1, B:91:0x0372, B:102:0x03af, B:104:0x03eb, B:106:0x03f0, B:107:0x0407, B:109:0x0412, B:111:0x042c, B:113:0x0432, B:114:0x0449, B:117:0x0468, B:121:0x048a, B:122:0x04a1, B:123:0x04aa, B:126:0x04c7, B:127:0x04db, B:129:0x04e3, B:131:0x04ed, B:133:0x04f3, B:134:0x04fa, B:136:0x0507, B:138:0x050f, B:140:0x0517, B:142:0x051f, B:143:0x052b, B:144:0x0538, B:150:0x0580, B:151:0x0595, B:153:0x05c2, B:156:0x05ec, B:160:0x063c, B:163:0x066a, B:165:0x069a, B:166:0x069d, B:168:0x06a3, B:170:0x06ab, B:172:0x06b1, B:174:0x06b9, B:176:0x06bf, B:180:0x06ce, B:183:0x06db, B:185:0x06e4, B:187:0x06f0, B:190:0x071f, B:192:0x0728, B:196:0x073d, B:201:0x074a, B:236:0x07c5, B:237:0x07cc, B:239:0x07f1, B:242:0x07fa, B:246:0x0807, B:247:0x0823, B:249:0x0829, B:251:0x0843, B:253:0x084f, B:255:0x085c, B:262:0x0891, B:266:0x089b, B:267:0x089e, B:270:0x08ad, B:271:0x08b0, B:282:0x08f3, B:260:0x087d, B:240:0x07f4, B:204:0x0753, B:208:0x0760, B:212:0x076e, B:216:0x077c, B:220:0x078a, B:224:0x0798, B:228:0x07a4, B:232:0x07b2, B:162:0x065d, B:147:0x0565, B:95:0x0384, B:96:0x0390, B:98:0x0396, B:100:0x03a4, B:54:0x0211, B:57:0x021f, B:59:0x0234, B:65:0x024c, B:70:0x027c, B:72:0x0282, B:74:0x0290, B:76:0x029e, B:79:0x02a7, B:87:0x0334, B:89:0x033e, B:81:0x02d6, B:82:0x02ef, B:86:0x0317, B:85:0x0302, B:68:0x0258, B:69:0x0276), top: B:394:0x01ce, inners: #0, #2, #5 }] */
                /* JADX WARN: Code duplicated, block: B:186:0x06ec  */
                /* JADX WARN: Code duplicated, block: B:190:0x071f A[Catch: all -> 0x01ed, TRY_ENTER, TryCatch #7 {all -> 0x01ed, blocks: (B:35:0x01ce, B:38:0x01db, B:40:0x01e3, B:46:0x01f1, B:91:0x0372, B:102:0x03af, B:104:0x03eb, B:106:0x03f0, B:107:0x0407, B:109:0x0412, B:111:0x042c, B:113:0x0432, B:114:0x0449, B:117:0x0468, B:121:0x048a, B:122:0x04a1, B:123:0x04aa, B:126:0x04c7, B:127:0x04db, B:129:0x04e3, B:131:0x04ed, B:133:0x04f3, B:134:0x04fa, B:136:0x0507, B:138:0x050f, B:140:0x0517, B:142:0x051f, B:143:0x052b, B:144:0x0538, B:150:0x0580, B:151:0x0595, B:153:0x05c2, B:156:0x05ec, B:160:0x063c, B:163:0x066a, B:165:0x069a, B:166:0x069d, B:168:0x06a3, B:170:0x06ab, B:172:0x06b1, B:174:0x06b9, B:176:0x06bf, B:180:0x06ce, B:183:0x06db, B:185:0x06e4, B:187:0x06f0, B:190:0x071f, B:192:0x0728, B:196:0x073d, B:201:0x074a, B:236:0x07c5, B:237:0x07cc, B:239:0x07f1, B:242:0x07fa, B:246:0x0807, B:247:0x0823, B:249:0x0829, B:251:0x0843, B:253:0x084f, B:255:0x085c, B:262:0x0891, B:266:0x089b, B:267:0x089e, B:270:0x08ad, B:271:0x08b0, B:282:0x08f3, B:260:0x087d, B:240:0x07f4, B:204:0x0753, B:208:0x0760, B:212:0x076e, B:216:0x077c, B:220:0x078a, B:224:0x0798, B:228:0x07a4, B:232:0x07b2, B:162:0x065d, B:147:0x0565, B:95:0x0384, B:96:0x0390, B:98:0x0396, B:100:0x03a4, B:54:0x0211, B:57:0x021f, B:59:0x0234, B:65:0x024c, B:70:0x027c, B:72:0x0282, B:74:0x0290, B:76:0x029e, B:79:0x02a7, B:87:0x0334, B:89:0x033e, B:81:0x02d6, B:82:0x02ef, B:86:0x0317, B:85:0x0302, B:68:0x0258, B:69:0x0276), top: B:394:0x01ce, inners: #0, #2, #5 }] */
                /* JADX WARN: Code duplicated, block: B:192:0x0728 A[Catch: all -> 0x01ed, TryCatch #7 {all -> 0x01ed, blocks: (B:35:0x01ce, B:38:0x01db, B:40:0x01e3, B:46:0x01f1, B:91:0x0372, B:102:0x03af, B:104:0x03eb, B:106:0x03f0, B:107:0x0407, B:109:0x0412, B:111:0x042c, B:113:0x0432, B:114:0x0449, B:117:0x0468, B:121:0x048a, B:122:0x04a1, B:123:0x04aa, B:126:0x04c7, B:127:0x04db, B:129:0x04e3, B:131:0x04ed, B:133:0x04f3, B:134:0x04fa, B:136:0x0507, B:138:0x050f, B:140:0x0517, B:142:0x051f, B:143:0x052b, B:144:0x0538, B:150:0x0580, B:151:0x0595, B:153:0x05c2, B:156:0x05ec, B:160:0x063c, B:163:0x066a, B:165:0x069a, B:166:0x069d, B:168:0x06a3, B:170:0x06ab, B:172:0x06b1, B:174:0x06b9, B:176:0x06bf, B:180:0x06ce, B:183:0x06db, B:185:0x06e4, B:187:0x06f0, B:190:0x071f, B:192:0x0728, B:196:0x073d, B:201:0x074a, B:236:0x07c5, B:237:0x07cc, B:239:0x07f1, B:242:0x07fa, B:246:0x0807, B:247:0x0823, B:249:0x0829, B:251:0x0843, B:253:0x084f, B:255:0x085c, B:262:0x0891, B:266:0x089b, B:267:0x089e, B:270:0x08ad, B:271:0x08b0, B:282:0x08f3, B:260:0x087d, B:240:0x07f4, B:204:0x0753, B:208:0x0760, B:212:0x076e, B:216:0x077c, B:220:0x078a, B:224:0x0798, B:228:0x07a4, B:232:0x07b2, B:162:0x065d, B:147:0x0565, B:95:0x0384, B:96:0x0390, B:98:0x0396, B:100:0x03a4, B:54:0x0211, B:57:0x021f, B:59:0x0234, B:65:0x024c, B:70:0x027c, B:72:0x0282, B:74:0x0290, B:76:0x029e, B:79:0x02a7, B:87:0x0334, B:89:0x033e, B:81:0x02d6, B:82:0x02ef, B:86:0x0317, B:85:0x0302, B:68:0x0258, B:69:0x0276), top: B:394:0x01ce, inners: #0, #2, #5 }] */
                /* JADX WARN: Code duplicated, block: B:194:0x0739  */
                /* JADX WARN: Code duplicated, block: B:199:0x0747  */
                /* JADX WARN: Code duplicated, block: B:200:0x0749  */
                /* JADX WARN: Code duplicated, block: B:203:0x0751  */
                /* JADX WARN: Code duplicated, block: B:204:0x0753 A[Catch: all -> 0x01ed, TryCatch #7 {all -> 0x01ed, blocks: (B:35:0x01ce, B:38:0x01db, B:40:0x01e3, B:46:0x01f1, B:91:0x0372, B:102:0x03af, B:104:0x03eb, B:106:0x03f0, B:107:0x0407, B:109:0x0412, B:111:0x042c, B:113:0x0432, B:114:0x0449, B:117:0x0468, B:121:0x048a, B:122:0x04a1, B:123:0x04aa, B:126:0x04c7, B:127:0x04db, B:129:0x04e3, B:131:0x04ed, B:133:0x04f3, B:134:0x04fa, B:136:0x0507, B:138:0x050f, B:140:0x0517, B:142:0x051f, B:143:0x052b, B:144:0x0538, B:150:0x0580, B:151:0x0595, B:153:0x05c2, B:156:0x05ec, B:160:0x063c, B:163:0x066a, B:165:0x069a, B:166:0x069d, B:168:0x06a3, B:170:0x06ab, B:172:0x06b1, B:174:0x06b9, B:176:0x06bf, B:180:0x06ce, B:183:0x06db, B:185:0x06e4, B:187:0x06f0, B:190:0x071f, B:192:0x0728, B:196:0x073d, B:201:0x074a, B:236:0x07c5, B:237:0x07cc, B:239:0x07f1, B:242:0x07fa, B:246:0x0807, B:247:0x0823, B:249:0x0829, B:251:0x0843, B:253:0x084f, B:255:0x085c, B:262:0x0891, B:266:0x089b, B:267:0x089e, B:270:0x08ad, B:271:0x08b0, B:282:0x08f3, B:260:0x087d, B:240:0x07f4, B:204:0x0753, B:208:0x0760, B:212:0x076e, B:216:0x077c, B:220:0x078a, B:224:0x0798, B:228:0x07a4, B:232:0x07b2, B:162:0x065d, B:147:0x0565, B:95:0x0384, B:96:0x0390, B:98:0x0396, B:100:0x03a4, B:54:0x0211, B:57:0x021f, B:59:0x0234, B:65:0x024c, B:70:0x027c, B:72:0x0282, B:74:0x0290, B:76:0x029e, B:79:0x02a7, B:87:0x0334, B:89:0x033e, B:81:0x02d6, B:82:0x02ef, B:86:0x0317, B:85:0x0302, B:68:0x0258, B:69:0x0276), top: B:394:0x01ce, inners: #0, #2, #5 }] */
                /* JADX WARN: Code duplicated, block: B:206:0x075d  */
                /* JADX WARN: Code duplicated, block: B:207:0x075f  */
                /* JADX WARN: Code duplicated, block: B:210:0x076b  */
                /* JADX WARN: Code duplicated, block: B:211:0x076d  */
                /* JADX WARN: Code duplicated, block: B:214:0x0779  */
                /* JADX WARN: Code duplicated, block: B:215:0x077b  */
                /* JADX WARN: Code duplicated, block: B:218:0x0787  */
                /* JADX WARN: Code duplicated, block: B:219:0x0789  */
                /* JADX WARN: Code duplicated, block: B:222:0x0795  */
                /* JADX WARN: Code duplicated, block: B:223:0x0797  */
                /* JADX WARN: Code duplicated, block: B:226:0x07a1  */
                /* JADX WARN: Code duplicated, block: B:227:0x07a3  */
                /* JADX WARN: Code duplicated, block: B:230:0x07af  */
                /* JADX WARN: Code duplicated, block: B:231:0x07b1  */
                /* JADX WARN: Code duplicated, block: B:233:0x07bf  */
                /* JADX WARN: Code duplicated, block: B:236:0x07c5 A[Catch: all -> 0x01ed, TryCatch #7 {all -> 0x01ed, blocks: (B:35:0x01ce, B:38:0x01db, B:40:0x01e3, B:46:0x01f1, B:91:0x0372, B:102:0x03af, B:104:0x03eb, B:106:0x03f0, B:107:0x0407, B:109:0x0412, B:111:0x042c, B:113:0x0432, B:114:0x0449, B:117:0x0468, B:121:0x048a, B:122:0x04a1, B:123:0x04aa, B:126:0x04c7, B:127:0x04db, B:129:0x04e3, B:131:0x04ed, B:133:0x04f3, B:134:0x04fa, B:136:0x0507, B:138:0x050f, B:140:0x0517, B:142:0x051f, B:143:0x052b, B:144:0x0538, B:150:0x0580, B:151:0x0595, B:153:0x05c2, B:156:0x05ec, B:160:0x063c, B:163:0x066a, B:165:0x069a, B:166:0x069d, B:168:0x06a3, B:170:0x06ab, B:172:0x06b1, B:174:0x06b9, B:176:0x06bf, B:180:0x06ce, B:183:0x06db, B:185:0x06e4, B:187:0x06f0, B:190:0x071f, B:192:0x0728, B:196:0x073d, B:201:0x074a, B:236:0x07c5, B:237:0x07cc, B:239:0x07f1, B:242:0x07fa, B:246:0x0807, B:247:0x0823, B:249:0x0829, B:251:0x0843, B:253:0x084f, B:255:0x085c, B:262:0x0891, B:266:0x089b, B:267:0x089e, B:270:0x08ad, B:271:0x08b0, B:282:0x08f3, B:260:0x087d, B:240:0x07f4, B:204:0x0753, B:208:0x0760, B:212:0x076e, B:216:0x077c, B:220:0x078a, B:224:0x0798, B:228:0x07a4, B:232:0x07b2, B:162:0x065d, B:147:0x0565, B:95:0x0384, B:96:0x0390, B:98:0x0396, B:100:0x03a4, B:54:0x0211, B:57:0x021f, B:59:0x0234, B:65:0x024c, B:70:0x027c, B:72:0x0282, B:74:0x0290, B:76:0x029e, B:79:0x02a7, B:87:0x0334, B:89:0x033e, B:81:0x02d6, B:82:0x02ef, B:86:0x0317, B:85:0x0302, B:68:0x0258, B:69:0x0276), top: B:394:0x01ce, inners: #0, #2, #5 }] */
                /* JADX WARN: Code duplicated, block: B:239:0x07f1 A[Catch: all -> 0x01ed, TryCatch #7 {all -> 0x01ed, blocks: (B:35:0x01ce, B:38:0x01db, B:40:0x01e3, B:46:0x01f1, B:91:0x0372, B:102:0x03af, B:104:0x03eb, B:106:0x03f0, B:107:0x0407, B:109:0x0412, B:111:0x042c, B:113:0x0432, B:114:0x0449, B:117:0x0468, B:121:0x048a, B:122:0x04a1, B:123:0x04aa, B:126:0x04c7, B:127:0x04db, B:129:0x04e3, B:131:0x04ed, B:133:0x04f3, B:134:0x04fa, B:136:0x0507, B:138:0x050f, B:140:0x0517, B:142:0x051f, B:143:0x052b, B:144:0x0538, B:150:0x0580, B:151:0x0595, B:153:0x05c2, B:156:0x05ec, B:160:0x063c, B:163:0x066a, B:165:0x069a, B:166:0x069d, B:168:0x06a3, B:170:0x06ab, B:172:0x06b1, B:174:0x06b9, B:176:0x06bf, B:180:0x06ce, B:183:0x06db, B:185:0x06e4, B:187:0x06f0, B:190:0x071f, B:192:0x0728, B:196:0x073d, B:201:0x074a, B:236:0x07c5, B:237:0x07cc, B:239:0x07f1, B:242:0x07fa, B:246:0x0807, B:247:0x0823, B:249:0x0829, B:251:0x0843, B:253:0x084f, B:255:0x085c, B:262:0x0891, B:266:0x089b, B:267:0x089e, B:270:0x08ad, B:271:0x08b0, B:282:0x08f3, B:260:0x087d, B:240:0x07f4, B:204:0x0753, B:208:0x0760, B:212:0x076e, B:216:0x077c, B:220:0x078a, B:224:0x0798, B:228:0x07a4, B:232:0x07b2, B:162:0x065d, B:147:0x0565, B:95:0x0384, B:96:0x0390, B:98:0x0396, B:100:0x03a4, B:54:0x0211, B:57:0x021f, B:59:0x0234, B:65:0x024c, B:70:0x027c, B:72:0x0282, B:74:0x0290, B:76:0x029e, B:79:0x02a7, B:87:0x0334, B:89:0x033e, B:81:0x02d6, B:82:0x02ef, B:86:0x0317, B:85:0x0302, B:68:0x0258, B:69:0x0276), top: B:394:0x01ce, inners: #0, #2, #5 }] */
                /* JADX WARN: Code duplicated, block: B:240:0x07f4 A[Catch: all -> 0x01ed, TryCatch #7 {all -> 0x01ed, blocks: (B:35:0x01ce, B:38:0x01db, B:40:0x01e3, B:46:0x01f1, B:91:0x0372, B:102:0x03af, B:104:0x03eb, B:106:0x03f0, B:107:0x0407, B:109:0x0412, B:111:0x042c, B:113:0x0432, B:114:0x0449, B:117:0x0468, B:121:0x048a, B:122:0x04a1, B:123:0x04aa, B:126:0x04c7, B:127:0x04db, B:129:0x04e3, B:131:0x04ed, B:133:0x04f3, B:134:0x04fa, B:136:0x0507, B:138:0x050f, B:140:0x0517, B:142:0x051f, B:143:0x052b, B:144:0x0538, B:150:0x0580, B:151:0x0595, B:153:0x05c2, B:156:0x05ec, B:160:0x063c, B:163:0x066a, B:165:0x069a, B:166:0x069d, B:168:0x06a3, B:170:0x06ab, B:172:0x06b1, B:174:0x06b9, B:176:0x06bf, B:180:0x06ce, B:183:0x06db, B:185:0x06e4, B:187:0x06f0, B:190:0x071f, B:192:0x0728, B:196:0x073d, B:201:0x074a, B:236:0x07c5, B:237:0x07cc, B:239:0x07f1, B:242:0x07fa, B:246:0x0807, B:247:0x0823, B:249:0x0829, B:251:0x0843, B:253:0x084f, B:255:0x085c, B:262:0x0891, B:266:0x089b, B:267:0x089e, B:270:0x08ad, B:271:0x08b0, B:282:0x08f3, B:260:0x087d, B:240:0x07f4, B:204:0x0753, B:208:0x0760, B:212:0x076e, B:216:0x077c, B:220:0x078a, B:224:0x0798, B:228:0x07a4, B:232:0x07b2, B:162:0x065d, B:147:0x0565, B:95:0x0384, B:96:0x0390, B:98:0x0396, B:100:0x03a4, B:54:0x0211, B:57:0x021f, B:59:0x0234, B:65:0x024c, B:70:0x027c, B:72:0x0282, B:74:0x0290, B:76:0x029e, B:79:0x02a7, B:87:0x0334, B:89:0x033e, B:81:0x02d6, B:82:0x02ef, B:86:0x0317, B:85:0x0302, B:68:0x0258, B:69:0x0276), top: B:394:0x01ce, inners: #0, #2, #5 }] */
                /* JADX WARN: Code duplicated, block: B:242:0x07fa A[Catch: all -> 0x01ed, TryCatch #7 {all -> 0x01ed, blocks: (B:35:0x01ce, B:38:0x01db, B:40:0x01e3, B:46:0x01f1, B:91:0x0372, B:102:0x03af, B:104:0x03eb, B:106:0x03f0, B:107:0x0407, B:109:0x0412, B:111:0x042c, B:113:0x0432, B:114:0x0449, B:117:0x0468, B:121:0x048a, B:122:0x04a1, B:123:0x04aa, B:126:0x04c7, B:127:0x04db, B:129:0x04e3, B:131:0x04ed, B:133:0x04f3, B:134:0x04fa, B:136:0x0507, B:138:0x050f, B:140:0x0517, B:142:0x051f, B:143:0x052b, B:144:0x0538, B:150:0x0580, B:151:0x0595, B:153:0x05c2, B:156:0x05ec, B:160:0x063c, B:163:0x066a, B:165:0x069a, B:166:0x069d, B:168:0x06a3, B:170:0x06ab, B:172:0x06b1, B:174:0x06b9, B:176:0x06bf, B:180:0x06ce, B:183:0x06db, B:185:0x06e4, B:187:0x06f0, B:190:0x071f, B:192:0x0728, B:196:0x073d, B:201:0x074a, B:236:0x07c5, B:237:0x07cc, B:239:0x07f1, B:242:0x07fa, B:246:0x0807, B:247:0x0823, B:249:0x0829, B:251:0x0843, B:253:0x084f, B:255:0x085c, B:262:0x0891, B:266:0x089b, B:267:0x089e, B:270:0x08ad, B:271:0x08b0, B:282:0x08f3, B:260:0x087d, B:240:0x07f4, B:204:0x0753, B:208:0x0760, B:212:0x076e, B:216:0x077c, B:220:0x078a, B:224:0x0798, B:228:0x07a4, B:232:0x07b2, B:162:0x065d, B:147:0x0565, B:95:0x0384, B:96:0x0390, B:98:0x0396, B:100:0x03a4, B:54:0x0211, B:57:0x021f, B:59:0x0234, B:65:0x024c, B:70:0x027c, B:72:0x0282, B:74:0x0290, B:76:0x029e, B:79:0x02a7, B:87:0x0334, B:89:0x033e, B:81:0x02d6, B:82:0x02ef, B:86:0x0317, B:85:0x0302, B:68:0x0258, B:69:0x0276), top: B:394:0x01ce, inners: #0, #2, #5 }] */
                /* JADX WARN: Code duplicated, block: B:244:0x0800  */
                /* JADX WARN: Code duplicated, block: B:266:0x089b A[Catch: all -> 0x01ed, TryCatch #7 {all -> 0x01ed, blocks: (B:35:0x01ce, B:38:0x01db, B:40:0x01e3, B:46:0x01f1, B:91:0x0372, B:102:0x03af, B:104:0x03eb, B:106:0x03f0, B:107:0x0407, B:109:0x0412, B:111:0x042c, B:113:0x0432, B:114:0x0449, B:117:0x0468, B:121:0x048a, B:122:0x04a1, B:123:0x04aa, B:126:0x04c7, B:127:0x04db, B:129:0x04e3, B:131:0x04ed, B:133:0x04f3, B:134:0x04fa, B:136:0x0507, B:138:0x050f, B:140:0x0517, B:142:0x051f, B:143:0x052b, B:144:0x0538, B:150:0x0580, B:151:0x0595, B:153:0x05c2, B:156:0x05ec, B:160:0x063c, B:163:0x066a, B:165:0x069a, B:166:0x069d, B:168:0x06a3, B:170:0x06ab, B:172:0x06b1, B:174:0x06b9, B:176:0x06bf, B:180:0x06ce, B:183:0x06db, B:185:0x06e4, B:187:0x06f0, B:190:0x071f, B:192:0x0728, B:196:0x073d, B:201:0x074a, B:236:0x07c5, B:237:0x07cc, B:239:0x07f1, B:242:0x07fa, B:246:0x0807, B:247:0x0823, B:249:0x0829, B:251:0x0843, B:253:0x084f, B:255:0x085c, B:262:0x0891, B:266:0x089b, B:267:0x089e, B:270:0x08ad, B:271:0x08b0, B:282:0x08f3, B:260:0x087d, B:240:0x07f4, B:204:0x0753, B:208:0x0760, B:212:0x076e, B:216:0x077c, B:220:0x078a, B:224:0x0798, B:228:0x07a4, B:232:0x07b2, B:162:0x065d, B:147:0x0565, B:95:0x0384, B:96:0x0390, B:98:0x0396, B:100:0x03a4, B:54:0x0211, B:57:0x021f, B:59:0x0234, B:65:0x024c, B:70:0x027c, B:72:0x0282, B:74:0x0290, B:76:0x029e, B:79:0x02a7, B:87:0x0334, B:89:0x033e, B:81:0x02d6, B:82:0x02ef, B:86:0x0317, B:85:0x0302, B:68:0x0258, B:69:0x0276), top: B:394:0x01ce, inners: #0, #2, #5 }] */
                /* JADX WARN: Code duplicated, block: B:270:0x08ad A[Catch: all -> 0x01ed, TRY_ENTER, TryCatch #7 {all -> 0x01ed, blocks: (B:35:0x01ce, B:38:0x01db, B:40:0x01e3, B:46:0x01f1, B:91:0x0372, B:102:0x03af, B:104:0x03eb, B:106:0x03f0, B:107:0x0407, B:109:0x0412, B:111:0x042c, B:113:0x0432, B:114:0x0449, B:117:0x0468, B:121:0x048a, B:122:0x04a1, B:123:0x04aa, B:126:0x04c7, B:127:0x04db, B:129:0x04e3, B:131:0x04ed, B:133:0x04f3, B:134:0x04fa, B:136:0x0507, B:138:0x050f, B:140:0x0517, B:142:0x051f, B:143:0x052b, B:144:0x0538, B:150:0x0580, B:151:0x0595, B:153:0x05c2, B:156:0x05ec, B:160:0x063c, B:163:0x066a, B:165:0x069a, B:166:0x069d, B:168:0x06a3, B:170:0x06ab, B:172:0x06b1, B:174:0x06b9, B:176:0x06bf, B:180:0x06ce, B:183:0x06db, B:185:0x06e4, B:187:0x06f0, B:190:0x071f, B:192:0x0728, B:196:0x073d, B:201:0x074a, B:236:0x07c5, B:237:0x07cc, B:239:0x07f1, B:242:0x07fa, B:246:0x0807, B:247:0x0823, B:249:0x0829, B:251:0x0843, B:253:0x084f, B:255:0x085c, B:262:0x0891, B:266:0x089b, B:267:0x089e, B:270:0x08ad, B:271:0x08b0, B:282:0x08f3, B:260:0x087d, B:240:0x07f4, B:204:0x0753, B:208:0x0760, B:212:0x076e, B:216:0x077c, B:220:0x078a, B:224:0x0798, B:228:0x07a4, B:232:0x07b2, B:162:0x065d, B:147:0x0565, B:95:0x0384, B:96:0x0390, B:98:0x0396, B:100:0x03a4, B:54:0x0211, B:57:0x021f, B:59:0x0234, B:65:0x024c, B:70:0x027c, B:72:0x0282, B:74:0x0290, B:76:0x029e, B:79:0x02a7, B:87:0x0334, B:89:0x033e, B:81:0x02d6, B:82:0x02ef, B:86:0x0317, B:85:0x0302, B:68:0x0258, B:69:0x0276), top: B:394:0x01ce, inners: #0, #2, #5 }] */
                /* JADX WARN: Code duplicated, block: B:273:0x08c4 A[ADDED_TO_REGION] */
                /* JADX WARN: Code duplicated, block: B:301:0x097b  */
                /* JADX WARN: Code duplicated, block: B:304:0x09b9 A[Catch: all -> 0x0954, TryCatch #1 {all -> 0x0954, blocks: (B:274:0x08c6, B:276:0x08d1, B:278:0x08de, B:280:0x08e8, B:283:0x08fc, B:285:0x0906, B:287:0x0912, B:289:0x091c, B:291:0x092a, B:293:0x0942, B:297:0x095b, B:299:0x0969, B:300:0x0972, B:302:0x097d, B:304:0x09b9, B:306:0x09c3, B:307:0x09c6, B:309:0x09d0, B:277:0x08d6), top: B:383:0x08c6 }] */
                /* JADX WARN: Code duplicated, block: B:306:0x09c3 A[Catch: all -> 0x0954, TryCatch #1 {all -> 0x0954, blocks: (B:274:0x08c6, B:276:0x08d1, B:278:0x08de, B:280:0x08e8, B:283:0x08fc, B:285:0x0906, B:287:0x0912, B:289:0x091c, B:291:0x092a, B:293:0x0942, B:297:0x095b, B:299:0x0969, B:300:0x0972, B:302:0x097d, B:304:0x09b9, B:306:0x09c3, B:307:0x09c6, B:309:0x09d0, B:277:0x08d6), top: B:383:0x08c6 }] */
                /* JADX WARN: Code duplicated, block: B:309:0x09d0 A[Catch: all -> 0x0954, TRY_LEAVE, TryCatch #1 {all -> 0x0954, blocks: (B:274:0x08c6, B:276:0x08d1, B:278:0x08de, B:280:0x08e8, B:283:0x08fc, B:285:0x0906, B:287:0x0912, B:289:0x091c, B:291:0x092a, B:293:0x0942, B:297:0x095b, B:299:0x0969, B:300:0x0972, B:302:0x097d, B:304:0x09b9, B:306:0x09c3, B:307:0x09c6, B:309:0x09d0, B:277:0x08d6), top: B:383:0x08c6 }] */
                /* JADX WARN: Code duplicated, block: B:313:0x09f0 A[Catch: all -> 0x09fe, TryCatch #8 {all -> 0x09fe, blocks: (B:311:0x09d9, B:313:0x09f0, B:317:0x0a01, B:319:0x0a39, B:321:0x0a41, B:323:0x0a4b, B:324:0x0a55, B:326:0x0a5f, B:327:0x0a69, B:328:0x0a72, B:330:0x0a78, B:332:0x0ab4, B:334:0x0ac6, B:338:0x0ae5, B:340:0x0af5, B:337:0x0ad5, B:344:0x0b01, B:345:0x0b46, B:346:0x0b51, B:347:0x0b64, B:349:0x0b6a, B:358:0x0bb1, B:359:0x0bf9, B:361:0x0c0a, B:375:0x0c71, B:366:0x0c24, B:367:0x0c27, B:352:0x0b78, B:354:0x0b9e, B:372:0x0c42, B:373:0x0c5b, B:374:0x0c5c), top: B:395:0x09d9, inners: #3, #4 }] */
                /* JADX WARN: Code duplicated, block: B:318:0x0a36  */
                /* JADX WARN: Code duplicated, block: B:321:0x0a41 A[Catch: all -> 0x09fe, TryCatch #8 {all -> 0x09fe, blocks: (B:311:0x09d9, B:313:0x09f0, B:317:0x0a01, B:319:0x0a39, B:321:0x0a41, B:323:0x0a4b, B:324:0x0a55, B:326:0x0a5f, B:327:0x0a69, B:328:0x0a72, B:330:0x0a78, B:332:0x0ab4, B:334:0x0ac6, B:338:0x0ae5, B:340:0x0af5, B:337:0x0ad5, B:344:0x0b01, B:345:0x0b46, B:346:0x0b51, B:347:0x0b64, B:349:0x0b6a, B:358:0x0bb1, B:359:0x0bf9, B:361:0x0c0a, B:375:0x0c71, B:366:0x0c24, B:367:0x0c27, B:352:0x0b78, B:354:0x0b9e, B:372:0x0c42, B:373:0x0c5b, B:374:0x0c5c), top: B:395:0x09d9, inners: #3, #4 }] */
                /* JADX WARN: Code duplicated, block: B:326:0x0a5f A[Catch: all -> 0x09fe, TryCatch #8 {all -> 0x09fe, blocks: (B:311:0x09d9, B:313:0x09f0, B:317:0x0a01, B:319:0x0a39, B:321:0x0a41, B:323:0x0a4b, B:324:0x0a55, B:326:0x0a5f, B:327:0x0a69, B:328:0x0a72, B:330:0x0a78, B:332:0x0ab4, B:334:0x0ac6, B:338:0x0ae5, B:340:0x0af5, B:337:0x0ad5, B:344:0x0b01, B:345:0x0b46, B:346:0x0b51, B:347:0x0b64, B:349:0x0b6a, B:358:0x0bb1, B:359:0x0bf9, B:361:0x0c0a, B:375:0x0c71, B:366:0x0c24, B:367:0x0c27, B:352:0x0b78, B:354:0x0b9e, B:372:0x0c42, B:373:0x0c5b, B:374:0x0c5c), top: B:395:0x09d9, inners: #3, #4 }] */
                /* JADX WARN: Code duplicated, block: B:330:0x0a78 A[Catch: all -> 0x09fe, TryCatch #8 {all -> 0x09fe, blocks: (B:311:0x09d9, B:313:0x09f0, B:317:0x0a01, B:319:0x0a39, B:321:0x0a41, B:323:0x0a4b, B:324:0x0a55, B:326:0x0a5f, B:327:0x0a69, B:328:0x0a72, B:330:0x0a78, B:332:0x0ab4, B:334:0x0ac6, B:338:0x0ae5, B:340:0x0af5, B:337:0x0ad5, B:344:0x0b01, B:345:0x0b46, B:346:0x0b51, B:347:0x0b64, B:349:0x0b6a, B:358:0x0bb1, B:359:0x0bf9, B:361:0x0c0a, B:375:0x0c71, B:366:0x0c24, B:367:0x0c27, B:352:0x0b78, B:354:0x0b9e, B:372:0x0c42, B:373:0x0c5b, B:374:0x0c5c), top: B:395:0x09d9, inners: #3, #4 }] */
                /* JADX WARN: Code duplicated, block: B:332:0x0ab4 A[Catch: all -> 0x09fe, TryCatch #8 {all -> 0x09fe, blocks: (B:311:0x09d9, B:313:0x09f0, B:317:0x0a01, B:319:0x0a39, B:321:0x0a41, B:323:0x0a4b, B:324:0x0a55, B:326:0x0a5f, B:327:0x0a69, B:328:0x0a72, B:330:0x0a78, B:332:0x0ab4, B:334:0x0ac6, B:338:0x0ae5, B:340:0x0af5, B:337:0x0ad5, B:344:0x0b01, B:345:0x0b46, B:346:0x0b51, B:347:0x0b64, B:349:0x0b6a, B:358:0x0bb1, B:359:0x0bf9, B:361:0x0c0a, B:375:0x0c71, B:366:0x0c24, B:367:0x0c27, B:352:0x0b78, B:354:0x0b9e, B:372:0x0c42, B:373:0x0c5b, B:374:0x0c5c), top: B:395:0x09d9, inners: #3, #4 }] */
                /* JADX WARN: Code duplicated, block: B:334:0x0ac6 A[Catch: all -> 0x09fe, TryCatch #8 {all -> 0x09fe, blocks: (B:311:0x09d9, B:313:0x09f0, B:317:0x0a01, B:319:0x0a39, B:321:0x0a41, B:323:0x0a4b, B:324:0x0a55, B:326:0x0a5f, B:327:0x0a69, B:328:0x0a72, B:330:0x0a78, B:332:0x0ab4, B:334:0x0ac6, B:338:0x0ae5, B:340:0x0af5, B:337:0x0ad5, B:344:0x0b01, B:345:0x0b46, B:346:0x0b51, B:347:0x0b64, B:349:0x0b6a, B:358:0x0bb1, B:359:0x0bf9, B:361:0x0c0a, B:375:0x0c71, B:366:0x0c24, B:367:0x0c27, B:352:0x0b78, B:354:0x0b9e, B:372:0x0c42, B:373:0x0c5b, B:374:0x0c5c), top: B:395:0x09d9, inners: #3, #4 }] */
                /* JADX WARN: Code duplicated, block: B:336:0x0ad0  */
                /* JADX WARN: Code duplicated, block: B:337:0x0ad5 A[Catch: all -> 0x09fe, TryCatch #8 {all -> 0x09fe, blocks: (B:311:0x09d9, B:313:0x09f0, B:317:0x0a01, B:319:0x0a39, B:321:0x0a41, B:323:0x0a4b, B:324:0x0a55, B:326:0x0a5f, B:327:0x0a69, B:328:0x0a72, B:330:0x0a78, B:332:0x0ab4, B:334:0x0ac6, B:338:0x0ae5, B:340:0x0af5, B:337:0x0ad5, B:344:0x0b01, B:345:0x0b46, B:346:0x0b51, B:347:0x0b64, B:349:0x0b6a, B:358:0x0bb1, B:359:0x0bf9, B:361:0x0c0a, B:375:0x0c71, B:366:0x0c24, B:367:0x0c27, B:352:0x0b78, B:354:0x0b9e, B:372:0x0c42, B:373:0x0c5b, B:374:0x0c5c), top: B:395:0x09d9, inners: #3, #4 }] */
                /* JADX WARN: Code duplicated, block: B:340:0x0af5 A[Catch: all -> 0x09fe, TRY_LEAVE, TryCatch #8 {all -> 0x09fe, blocks: (B:311:0x09d9, B:313:0x09f0, B:317:0x0a01, B:319:0x0a39, B:321:0x0a41, B:323:0x0a4b, B:324:0x0a55, B:326:0x0a5f, B:327:0x0a69, B:328:0x0a72, B:330:0x0a78, B:332:0x0ab4, B:334:0x0ac6, B:338:0x0ae5, B:340:0x0af5, B:337:0x0ad5, B:344:0x0b01, B:345:0x0b46, B:346:0x0b51, B:347:0x0b64, B:349:0x0b6a, B:358:0x0bb1, B:359:0x0bf9, B:361:0x0c0a, B:375:0x0c71, B:366:0x0c24, B:367:0x0c27, B:352:0x0b78, B:354:0x0b9e, B:372:0x0c42, B:373:0x0c5b, B:374:0x0c5c), top: B:395:0x09d9, inners: #3, #4 }] */
                /* JADX WARN: Code duplicated, block: B:342:0x0af9  */
                /* JADX WARN: Code duplicated, block: B:349:0x0b6a A[Catch: all -> 0x09fe, TryCatch #8 {all -> 0x09fe, blocks: (B:311:0x09d9, B:313:0x09f0, B:317:0x0a01, B:319:0x0a39, B:321:0x0a41, B:323:0x0a4b, B:324:0x0a55, B:326:0x0a5f, B:327:0x0a69, B:328:0x0a72, B:330:0x0a78, B:332:0x0ab4, B:334:0x0ac6, B:338:0x0ae5, B:340:0x0af5, B:337:0x0ad5, B:344:0x0b01, B:345:0x0b46, B:346:0x0b51, B:347:0x0b64, B:349:0x0b6a, B:358:0x0bb1, B:359:0x0bf9, B:361:0x0c0a, B:375:0x0c71, B:366:0x0c24, B:367:0x0c27, B:352:0x0b78, B:354:0x0b9e, B:372:0x0c42, B:373:0x0c5b, B:374:0x0c5c), top: B:395:0x09d9, inners: #3, #4 }] */
                /* JADX WARN: Code duplicated, block: B:354:0x0b9e A[Catch: all -> 0x09fe, TryCatch #8 {all -> 0x09fe, blocks: (B:311:0x09d9, B:313:0x09f0, B:317:0x0a01, B:319:0x0a39, B:321:0x0a41, B:323:0x0a4b, B:324:0x0a55, B:326:0x0a5f, B:327:0x0a69, B:328:0x0a72, B:330:0x0a78, B:332:0x0ab4, B:334:0x0ac6, B:338:0x0ae5, B:340:0x0af5, B:337:0x0ad5, B:344:0x0b01, B:345:0x0b46, B:346:0x0b51, B:347:0x0b64, B:349:0x0b6a, B:358:0x0bb1, B:359:0x0bf9, B:361:0x0c0a, B:375:0x0c71, B:366:0x0c24, B:367:0x0c27, B:352:0x0b78, B:354:0x0b9e, B:372:0x0c42, B:373:0x0c5b, B:374:0x0c5c), top: B:395:0x09d9, inners: #3, #4 }] */
                /* JADX WARN: Code duplicated, block: B:361:0x0c0a A[Catch: all -> 0x09fe, SQLiteException -> 0x0c20, TRY_LEAVE, TryCatch #3 {SQLiteException -> 0x0c20, blocks: (B:359:0x0bf9, B:361:0x0c0a), top: B:387:0x0bf9, outer: #8 }] */
                /* JADX WARN: Code duplicated, block: B:365:0x0c22  */
                /* JADX WARN: Code duplicated, block: B:396:0x051f A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:410:0x0afb A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:412:0x0b78 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:413:0x0b76 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:414:? A[LOOP:3: B:347:0x0b64->B:414:?, LOOP_END, SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:416:0x03ac A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:417:0x03a4 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:89:0x033e A[Catch: all -> 0x01ed, TryCatch #7 {all -> 0x01ed, blocks: (B:35:0x01ce, B:38:0x01db, B:40:0x01e3, B:46:0x01f1, B:91:0x0372, B:102:0x03af, B:104:0x03eb, B:106:0x03f0, B:107:0x0407, B:109:0x0412, B:111:0x042c, B:113:0x0432, B:114:0x0449, B:117:0x0468, B:121:0x048a, B:122:0x04a1, B:123:0x04aa, B:126:0x04c7, B:127:0x04db, B:129:0x04e3, B:131:0x04ed, B:133:0x04f3, B:134:0x04fa, B:136:0x0507, B:138:0x050f, B:140:0x0517, B:142:0x051f, B:143:0x052b, B:144:0x0538, B:150:0x0580, B:151:0x0595, B:153:0x05c2, B:156:0x05ec, B:160:0x063c, B:163:0x066a, B:165:0x069a, B:166:0x069d, B:168:0x06a3, B:170:0x06ab, B:172:0x06b1, B:174:0x06b9, B:176:0x06bf, B:180:0x06ce, B:183:0x06db, B:185:0x06e4, B:187:0x06f0, B:190:0x071f, B:192:0x0728, B:196:0x073d, B:201:0x074a, B:236:0x07c5, B:237:0x07cc, B:239:0x07f1, B:242:0x07fa, B:246:0x0807, B:247:0x0823, B:249:0x0829, B:251:0x0843, B:253:0x084f, B:255:0x085c, B:262:0x0891, B:266:0x089b, B:267:0x089e, B:270:0x08ad, B:271:0x08b0, B:282:0x08f3, B:260:0x087d, B:240:0x07f4, B:204:0x0753, B:208:0x0760, B:212:0x076e, B:216:0x077c, B:220:0x078a, B:224:0x0798, B:228:0x07a4, B:232:0x07b2, B:162:0x065d, B:147:0x0565, B:95:0x0384, B:96:0x0390, B:98:0x0396, B:100:0x03a4, B:54:0x0211, B:57:0x021f, B:59:0x0234, B:65:0x024c, B:70:0x027c, B:72:0x0282, B:74:0x0290, B:76:0x029e, B:79:0x02a7, B:87:0x0334, B:89:0x033e, B:81:0x02d6, B:82:0x02ef, B:86:0x0317, B:85:0x0302, B:68:0x0258, B:69:0x0276), top: B:394:0x01ce, inners: #0, #2, #5 }] */
                /* JADX WARN: Code duplicated, block: B:93:0x037f  */
                /* JADX WARN: Code duplicated, block: B:95:0x0384 A[Catch: all -> 0x01ed, TryCatch #7 {all -> 0x01ed, blocks: (B:35:0x01ce, B:38:0x01db, B:40:0x01e3, B:46:0x01f1, B:91:0x0372, B:102:0x03af, B:104:0x03eb, B:106:0x03f0, B:107:0x0407, B:109:0x0412, B:111:0x042c, B:113:0x0432, B:114:0x0449, B:117:0x0468, B:121:0x048a, B:122:0x04a1, B:123:0x04aa, B:126:0x04c7, B:127:0x04db, B:129:0x04e3, B:131:0x04ed, B:133:0x04f3, B:134:0x04fa, B:136:0x0507, B:138:0x050f, B:140:0x0517, B:142:0x051f, B:143:0x052b, B:144:0x0538, B:150:0x0580, B:151:0x0595, B:153:0x05c2, B:156:0x05ec, B:160:0x063c, B:163:0x066a, B:165:0x069a, B:166:0x069d, B:168:0x06a3, B:170:0x06ab, B:172:0x06b1, B:174:0x06b9, B:176:0x06bf, B:180:0x06ce, B:183:0x06db, B:185:0x06e4, B:187:0x06f0, B:190:0x071f, B:192:0x0728, B:196:0x073d, B:201:0x074a, B:236:0x07c5, B:237:0x07cc, B:239:0x07f1, B:242:0x07fa, B:246:0x0807, B:247:0x0823, B:249:0x0829, B:251:0x0843, B:253:0x084f, B:255:0x085c, B:262:0x0891, B:266:0x089b, B:267:0x089e, B:270:0x08ad, B:271:0x08b0, B:282:0x08f3, B:260:0x087d, B:240:0x07f4, B:204:0x0753, B:208:0x0760, B:212:0x076e, B:216:0x077c, B:220:0x078a, B:224:0x0798, B:228:0x07a4, B:232:0x07b2, B:162:0x065d, B:147:0x0565, B:95:0x0384, B:96:0x0390, B:98:0x0396, B:100:0x03a4, B:54:0x0211, B:57:0x021f, B:59:0x0234, B:65:0x024c, B:70:0x027c, B:72:0x0282, B:74:0x0290, B:76:0x029e, B:79:0x02a7, B:87:0x0334, B:89:0x033e, B:81:0x02d6, B:82:0x02ef, B:86:0x0317, B:85:0x0302, B:68:0x0258, B:69:0x0276), top: B:394:0x01ce, inners: #0, #2, #5 }] */
                /* JADX WARN: Code duplicated, block: B:98:0x0396 A[Catch: all -> 0x01ed, TryCatch #7 {all -> 0x01ed, blocks: (B:35:0x01ce, B:38:0x01db, B:40:0x01e3, B:46:0x01f1, B:91:0x0372, B:102:0x03af, B:104:0x03eb, B:106:0x03f0, B:107:0x0407, B:109:0x0412, B:111:0x042c, B:113:0x0432, B:114:0x0449, B:117:0x0468, B:121:0x048a, B:122:0x04a1, B:123:0x04aa, B:126:0x04c7, B:127:0x04db, B:129:0x04e3, B:131:0x04ed, B:133:0x04f3, B:134:0x04fa, B:136:0x0507, B:138:0x050f, B:140:0x0517, B:142:0x051f, B:143:0x052b, B:144:0x0538, B:150:0x0580, B:151:0x0595, B:153:0x05c2, B:156:0x05ec, B:160:0x063c, B:163:0x066a, B:165:0x069a, B:166:0x069d, B:168:0x06a3, B:170:0x06ab, B:172:0x06b1, B:174:0x06b9, B:176:0x06bf, B:180:0x06ce, B:183:0x06db, B:185:0x06e4, B:187:0x06f0, B:190:0x071f, B:192:0x0728, B:196:0x073d, B:201:0x074a, B:236:0x07c5, B:237:0x07cc, B:239:0x07f1, B:242:0x07fa, B:246:0x0807, B:247:0x0823, B:249:0x0829, B:251:0x0843, B:253:0x084f, B:255:0x085c, B:262:0x0891, B:266:0x089b, B:267:0x089e, B:270:0x08ad, B:271:0x08b0, B:282:0x08f3, B:260:0x087d, B:240:0x07f4, B:204:0x0753, B:208:0x0760, B:212:0x076e, B:216:0x077c, B:220:0x078a, B:224:0x0798, B:228:0x07a4, B:232:0x07b2, B:162:0x065d, B:147:0x0565, B:95:0x0384, B:96:0x0390, B:98:0x0396, B:100:0x03a4, B:54:0x0211, B:57:0x021f, B:59:0x0234, B:65:0x024c, B:70:0x027c, B:72:0x0282, B:74:0x0290, B:76:0x029e, B:79:0x02a7, B:87:0x0334, B:89:0x033e, B:81:0x02d6, B:82:0x02ef, B:86:0x0317, B:85:0x0302, B:68:0x0258, B:69:0x0276), top: B:394:0x01ce, inners: #0, #2, #5 }] */
                /* JADX INFO: renamed from: l */
                public final void m6766l(zzbg zzbgVar, zzr zzrVar) throws Throwable {
                    mp3 mp3Var;
                    String str;
                    String str2;
                    String str3;
                    long jRound;
                    String str4;
                    ae3 ae3VarM6755f0;
                    int iM7404H;
                    rp3 rp3Var;
                    rp3 rp3Var2;
                    ac3 ac3Var;
                    boolean zM9074x0;
                    boolean zEquals;
                    Iterator<String> it;
                    long length;
                    Object objM2164D1;
                    String str5;
                    ud3 ud3VarM225G0;
                    long jIntValue;
                    String str6;
                    Bundle bundleM2167G1;
                    ae3 ae3VarM6755f1;
                    long jDelete;
                    ij3 ij3Var;
                    oe3 oe3Var;
                    String str7;
                    pe3 pe3VarM246Z;
                    pe3 pe3VarM7412a;
                    oe3 oe3Var2;
                    zzic zzicVarZzaE;
                    String str8;
                    String str9;
                    String str10;
                    long j;
                    String str11;
                    String str12;
                    ok3 ok3VarM7190j;
                    boolean zM7406J;
                    nk3 nk3Var;
                    long j2;
                    zzjq zzjqVarZza;
                    Map mapZzb;
                    String str13;
                    String str14;
                    ArrayList arrayList;
                    ok3 ok3VarM7190j2;
                    di3 di3VarM219D0;
                    int i;
                    List listM267w0;
                    int i2;
                    ae3 ae3VarM6755f2;
                    ae3 ae3VarM6755f3;
                    Iterator<String> it2;
                    boolean zM9290P;
                    int i3;
                    String str15;
                    ContentValues contentValues;
                    String str16;
                    ci3 ci3VarM6761i0;
                    long jM1694k0;
                    di3 di3VarM219D1;
                    long j3;
                    boolean z;
                    boolean z2;
                    boolean z3;
                    boolean z4;
                    boolean z5;
                    boolean z6;
                    boolean z7;
                    boolean z8;
                    long jM238R;
                    pd3 pd3VarM6753d0;
                    ug3 ug3Var;
                    ac3 ac3Var2;
                    Object obj;
                    rp3 rp3VarM266v0;
                    Object obj2;
                    long jMax;
                    long jIntValue2;
/* 11 */            String str17 = "events";
/* 17 */            kb1.m6061n(zzrVar);
/* 20 */            boolean z9 = zzrVar.f4238Y;
/* 22 */            long j4 = zzrVar.f4243b0;
/* 24 */            long j5 = zzrVar.f4250f;
/* 26 */            String str18 = zzrVar.f4247d0;
/* 31 */            long j6 = zzrVar.f4248e;
/* 37 */            long j7 = zzrVar.f4234U;
/* 39 */            String str19 = zzrVar.f4251f0;
/* 43 */            String str20 = zzrVar.f4244c;
/* 47 */            String str21 = zzrVar.f4246d;
/* 49 */            long j8 = j5;
/* 51 */            boolean z10 = zzrVar.f4263v;
/* 53 */            String str22 = zzrVar.f4240a;
/* 55 */            kb1.m6058k(str22);
/* 58 */            long jNanoTime = System.nanoTime();
/* 66 */            mo4558b().mo1375y();
/* 69 */            m6765k0();
/* 72 */            m6761i0();
/* 77 */            String str23 = zzrVar.f4242b;
/* 83 */            if (TextUtils.isEmpty(str23)) {
/* 295 */               return;
                    }
/* 87 */            if (!z10) {
/* 89 */                m6750a0(zzrVar);
/* 92 */                return;
                    }
/* 93 */            vi3 vi3VarM6754e0 = m6754e0();
/* 103 */           String str24 = zzbgVar.f4208a;
/* 105 */           boolean zM9289O = vi3VarM6754e0.m9289O(str22, str24);
/* 113 */           ij3 ij3Var2 = this.f13905W;
/* 115 */           ac3 ac3Var3 = this.f13936u0;
/* 120 */           if (zM9289O) {
/* 144 */               mo4557a().m9017E().m8512c(uh3.m9013H(str22), "Dropping blocked event. appId", ij3Var2.m4565m().m6656a(str24));
/* 163 */               if (!"1".equals(m6754e0().mo7139d(str22, "measurement.upload.blacklist_internal")) && !"1".equals(m6754e0().mo7139d(str22, "measurement.upload.blacklist_public"))) {
/* 187 */                   if ("_err".equals(str24)) {
/* 295 */                       return;
                            }
/* 189 */                   m6763j0();
/* 202 */                   up3.m9062P(ac3Var3, str22, 11, "_ev", str24, 0);
/* 205 */                   return;
                        }
/* 210 */               di3 di3VarM219D2 = m6755f0().m219D0(str22);
/* 214 */               if (di3VarM219D2 != null) {
/* 216 */                   ij3 ij3Var3 = di3VarM219D2.f7242a;
/* 218 */                   bj3 bj3Var = ij3Var3.f9659i;
/* 220 */                   ij3.m4555l(bj3Var);
/* 223 */                   bj3Var.mo1375y();
/* 226 */                   long j9 = di3VarM219D2.f7241S;
/* 228 */                   bj3 bj3Var2 = ij3Var3.f9659i;
/* 230 */                   ij3.m4555l(bj3Var2);
/* 233 */                   bj3Var2.mo1375y();
/* 238 */                   long jMax2 = Math.max(j9, di3VarM219D2.f7240R);
/* 248 */                   ((xt0) mo4562f()).getClass();
/* 256 */                   long jAbs = Math.abs(System.currentTimeMillis() - jMax2);
/* 260 */                   m6753d0();
/* 277 */                   if (jAbs > ((Long) vg3.f18089N.m9011a(null)).longValue()) {
/* 289 */                       mo4557a().m9018F().m8510a("Fetching config for blocked app");
/* 292 */                       m6784y(di3VarM219D2);
/* 295 */                       return;
                            }
/* 295 */                   return;
                        }
/* 295 */               return;
                    }
/* 299 */           wh3 wh3VarM9578b = wh3.m9578b(zzbgVar);
/* 303 */           up3 up3VarM6763j0 = m6763j0();
/* 309 */           pd3 pd3VarM6753d1 = m6753d0();
/* 313 */           pd3VarM6753d1.getClass();
/* 336 */           up3VarM6763j0.m9086I(wh3VarM9578b, Math.max(Math.min(pd3VarM6753d1.m7404H(str22, vg3.f18109X), 100), 25));
/* 357 */           int iMax = Math.max(Math.min(m6753d0().m7404H(str22, vg3.f18134g0), 35), 10);
/* 363 */           Bundle bundle = (Bundle) wh3VarM9578b.f18636e;
/* 384 */           for (String str25 : new TreeSet(bundle.keySet())) {
/* 398 */               if (FirebaseAnalytics.Param.ITEMS.equals(str25)) {
/* 408 */                   m6763j0().m9088J(bundle.getParcelableArray(str25), iMax);
                        }
                    }
/* 412 */           zzbg zzbgVarM9580c = wh3VarM9578b.m9580c();
/* 416 */           zzbe zzbeVar = zzbgVarM9580c.f4209b;
/* 418 */           String str26 = zzbgVarM9580c.f4208a;
/* 433 */           if (Log.isLoggable(mo4557a().m9021J(), 2)) {
/* 453 */               mo4557a().m9019G().m8511b(ij3Var2.m4565m().m6659d(zzbgVarM9580c), "Logging event");
                    }
/* 460 */           m6755f0().m258n0();
                    try {
/* 463 */               m6750a0(zzrVar);
/* 492 */               boolean z11 = "ecommerce_purchase".equals(str26) || FirebaseAnalytics.Event.PURCHASE.equals(str26) || FirebaseAnalytics.Event.REFUND.equals(str26);
/* 508 */               if (!"_iap".equals(str26)) {
/* 510 */                   if (z11) {
/* 512 */                       z11 = true;
                            } else {
/* 516 */                       str3 = str21;
/* 11 */                        str17 = "events";
/* 520 */                       str = str19;
/* 522 */                       str4 = str22;
/* 524 */                       str2 = str20;
                            }
/* 526 */                   ac3Var = ac3Var3;
/* 883 */                   zM9074x0 = up3.m9074x0(str26);
/* 887 */                   zEquals = "_err".equals(str26);
/* 891 */                   m6763j0();
/* 894 */                   if (zzbeVar == null) {
/* 896 */                       length = 0;
                            } else {
/* 907 */                       it = zzbeVar.f4207a.keySet().iterator();
/* 911 */                       length = 0;
/* 917 */                       while (it.hasNext()) {
/* 925 */                           objM2164D1 = zzbeVar.m2164D1(it.next());
/* 931 */                           if (objM2164D1 instanceof Parcelable[]) {
/* 939 */                               length += (long) ((Parcelable[]) objM2164D1).length;
                                    }
                                }
                            }
/* 952 */                   str5 = str4;
/* 968 */                   ud3VarM225G0 = m6755f0().m225G0(m6756g(), str5, length + 1, true, zM9074x0, false, zEquals, false, false, false);
/* 976 */                   long j10 = ud3VarM225G0.f17478b;
/* 978 */                   m6753d0();
/* 997 */                   jIntValue = j10 - ((long) ((Integer) vg3.f18147l.m9011a(null)).intValue());
/* 1002 */                  if (jIntValue <= 0) {
/* 1041 */                      if (zM9074x0) {
/* 1043 */                          long j11 = ud3VarM225G0.f17477a;
/* 1045 */                          m6753d0();
/* 1064 */                          jIntValue2 = j11 - ((long) ((Integer) vg3.f18151n.m9011a(null)).intValue());
/* 1067 */                          if (jIntValue2 > 0) {
/* 1073 */                              if (jIntValue2 % 1000 == 1) {
/* 1095 */                                  mo4557a().m9016D().m8512c(uh3.m9013H(str5), "Data loss. Too many public events logged. appId, count", Long.valueOf(ud3VarM225G0.f17477a));
                                        }
/* 1098 */                              m6763j0();
/* 1113 */                              up3.m9062P(ac3Var, str5, 16, "_ev", zzbgVarM9580c.f4208a, 0);
/* 1120 */                              m6755f0().m259o0();
                                    }
                                }
/* 1125 */                      str6 = str5;
/* 1127 */                      if (zEquals) {
/* 1154 */                          jMax = ud3VarM225G0.f17480d - ((long) Math.max(0, Math.min(1000000, m6753d0().m7404H(str6, vg3.f18149m))));
/* 1157 */                          if (jMax > 0) {
/* 1161 */                              if (jMax == 1) {
/* 1183 */                                  mo4557a().m9016D().m8512c(uh3.m9013H(str6), "Too many error events logged. appId, count", Long.valueOf(ud3VarM225G0.f17480d));
                                        }
/* 1190 */                              m6755f0().m259o0();
                                    }
                                }
/* 1195 */                      bundleM2167G1 = zzbeVar.m2167G1();
/* 1199 */                      up3 up3VarM6763j1 = m6763j0();
/* 1205 */                      String str27 = zzbgVarM9580c.f4210c;
/* 1207 */                      up3VarM6763j1.m9094O(str27, "_o", bundleM2167G1);
/* 1222 */                      if (m6763j0().m9098Z(str6, zzrVar.f4259m0)) {
/* 1234 */                          m6763j0().m9094O(1L, "_dbg", bundleM2167G1);
/* 1241 */                          m6763j0().m9094O(1L, "_r", bundleM2167G1);
                                }
/* 1250 */                      if ("_s".equals(str26) && (rp3VarM266v0 = m6755f0().m266v0(str6, "_sno")) != null) {
/* 1262 */                          obj2 = rp3VarM266v0.f16228e;
/* 1266 */                          if (obj2 instanceof Long) {
/* 1272 */                              m6763j0().m9094O(obj2, "_sno", bundleM2167G1);
                                    }
                                }
/* 1286 */                      if (m6753d0().m7406J(null, vg3.f18110X0) && Objects.equals(str27, "am") && str26.equals("_ai")) {
/* 1304 */                          obj = bundleM2167G1.get(FirebaseAnalytics.Param.VALUE);
/* 1310 */                          if (obj instanceof String) {
                                        try {
/* 1314 */                                  double d = Double.parseDouble((String) obj);
/* 1318 */                                  bundleM2167G1.remove(FirebaseAnalytics.Param.VALUE);
/* 1321 */                                  bundleM2167G1.putDouble(FirebaseAnalytics.Param.VALUE, d);
                                        } catch (NumberFormatException unused) {
                                        }
                                    }
                                }
/* 1324 */                      ae3VarM6755f1 = m6755f0();
/* 1328 */                      kb1.m6058k(str6);
/* 1331 */                      ae3VarM6755f1.mo1375y();
/* 1334 */                      ae3VarM6755f1.m9593A();
                                try {
/* 1375 */                          jDelete = ae3VarM6755f1.m261q0().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str6, String.valueOf(Math.max(0, Math.min(1000000, ((ij3) ae3VarM6755f1.f16749a).f9651d.m7404H(str6, vg3.f18157q))))});
                                } catch (SQLiteException e) {
/* 1400 */                          ((ij3) ae3VarM6755f1.f16749a).mo4557a().m9016D().m8512c(uh3.m9013H(str6), "Error deleting over the limit events. appId", e);
/* 1403 */                          jDelete = 0;
                                }
/* 1407 */                      if (jDelete > 0) {
/* 1427 */                          mo4557a().m9017E().m8512c(uh3.m9013H(str6), "Data lost. Too many events stored on disk, deleted. appId", Long.valueOf(jDelete));
                                }
/* 1432 */                      ij3Var = this.f13905W;
/* 1454 */                      oe3Var = new oe3(ij3Var, zzbgVarM9580c.f4210c, str6, zzbgVarM9580c.f4208a, zzbgVarM9580c.f4211d, 0L, bundleM2167G1);
/* 1461 */                      ae3 ae3VarM6755f4 = m6755f0();
/* 1465 */                      str7 = oe3Var.f14728b;
/* 1467 */                      String str28 = str17;
/* 1469 */                      pe3VarM246Z = ae3VarM6755f4.m246Z(str28, str6, str7);
/* 1473 */                      if (pe3VarM246Z == null) {
/* 1479 */                          jM238R = m6755f0().m238R(str6);
/* 1483 */                          pd3VarM6753d0 = m6753d0();
/* 1487 */                          pd3VarM6753d0.getClass();
/* 1490 */                          ug3Var = vg3.f18107W;
/* 1508 */                          ac3Var2 = ac3Var;
/* 1513 */                          if (jM238R >= Math.max(Math.min(pd3VarM6753d0.m7404H(str6, ug3Var), 2000), 500) || !zM9074x0) {
/* 1595 */                              ac3Var = ac3Var2;
/* 1621 */                              pe3VarM7412a = new pe3(str6, str7, 0L, 0L, 0L, oe3Var.f14730d, 0L, null, null, null, null);
/* 1624 */                              str6 = str6;
                                    } else {
/* 1521 */                              sh3 sh3VarM9016D = mo4557a().m9016D();
/* 1527 */                              th3 th3VarM9013H = uh3.m9013H(str6);
/* 1535 */                              String strM6656a = ij3Var.m4565m().m6656a(str7);
/* 1539 */                              pd3 pd3VarM6753d2 = m6753d0();
/* 1543 */                              pd3VarM6753d2.getClass();
/* 1564 */                              sh3VarM9016D.m8513d("Too many event names used, ignoring event. appId, name, supported count", th3VarM9013H, strM6656a, Integer.valueOf(Math.max(Math.min(pd3VarM6753d2.m7404H(str6, ug3Var), 2000), 500)));
/* 1567 */                              m6763j0();
/* 1582 */                              up3.m9062P(ac3Var2, str6, 8, null, null, 0);
                                    }
                                } else {
/* 1632 */                          oe3Var = oe3Var.m7140a(ij3Var, pe3VarM246Z.f15085f);
/* 1638 */                          pe3VarM7412a = pe3VarM246Z.m7412a(oe3Var.f14730d);
                                }
/* 1626 */                      oe3Var2 = oe3Var;
/* 1647 */                      m6755f0().m247a0(str28, pe3VarM7412a);
/* 1654 */                      mo4558b().mo1375y();
/* 1657 */                      m6765k0();
/* 1660 */                      String str29 = oe3Var2.f14727a;
/* 1662 */                      kb1.m6058k(str29);
/* 1669 */                      kb1.m6054g(str29.equals(str6));
/* 1672 */                      zzicVarZzaE = zzid.zzaE();
/* 1677 */                      zzicVarZzaE.zza(1);
/* 1682 */                      zzicVarZzaE.zzC("android");
/* 1689 */                      if (!TextUtils.isEmpty(str6)) {
/* 1691 */                          zzicVarZzaE.zzL(str6);
                                }
/* 1698 */                      if (TextUtils.isEmpty(str3)) {
/* 1706 */                          str8 = str3;
                                } else {
/* 1700 */                          str8 = str3;
/* 1702 */                          zzicVarZzaE.zzJ(str8);
                                }
/* 1712 */                      if (TextUtils.isEmpty(str2)) {
/* 1720 */                          str9 = str2;
                                } else {
/* 1714 */                          str9 = str2;
/* 1716 */                          zzicVarZzaE.zzM(str9);
                                }
/* 1726 */                      if (TextUtils.isEmpty(str)) {
/* 1734 */                          str10 = str;
                                } else {
/* 1728 */                          str10 = str;
/* 1730 */                          zzicVarZzaE.zzau(str10);
                                }
/* 1741 */                      if (j7 != -2147483648L) {
/* 1743 */                          j = j7;
/* 1746 */                          zzicVarZzaE.zzaj((int) j);
                                } else {
/* 1753 */                          j = j7;
                                }
/* 1756 */                      zzicVarZzaE.zzN(j6);
/* 1763 */                      if (TextUtils.isEmpty(str23)) {
/* 1775 */                          str11 = str23;
                                } else {
/* 1767 */                          str11 = str23;
/* 1769 */                          zzicVarZzaE.zzad(str11);
                                }
/* 1777 */                      kb1.m6061n(str6);
/* 1786 */                      str12 = str10;
/* 1796 */                      ok3VarM7190j = m6752d(str6).m7190j(ok3.m7182c(100, str18));
/* 1804 */                      zzicVarZzaE.zzat(ok3VarM7190j.m7187f());
/* 1807 */                      zzql.zza();
/* 1816 */                      zM7406J = m6753d0().m7406J(str6, vg3.f18094P0);
/* 1820 */                      nk3Var = nk3.AD_STORAGE;
/* 1822 */                      if (zM7406J) {
/* 1824 */                          m6763j0();
/* 1831 */                          if (up3.m9066V(str6)) {
/* 1835 */                              zzicVarZzaE.zzaH(zzrVar.f4257k0);
/* 1838 */                              j2 = j;
/* 1840 */                              j3 = zzrVar.f4258l0;
/* 1848 */                              if (!ok3VarM7190j.m7189i(nk3Var) && j3 != 0) {
/* 1858 */                                  j3 = (j3 & (-2)) | 32;
                                        }
/* 1862 */                              if (j3 == 1) {
/* 1864 */                                  z = true;
                                        } else {
/* 1866 */                                  z = false;
                                        }
/* 1867 */                              zzicVarZzaE.zzaz(z);
/* 1872 */                              if (j3 != 0) {
/* 1876 */                                  zzhd zzhdVarZzh = zzhe.zzh();
/* 1884 */                                  if ((j3 & 1) != 0) {
/* 1886 */                                      z2 = true;
                                            } else {
/* 1888 */                                      z2 = false;
                                            }
/* 1889 */                                  zzhdVarZzh.zza(z2);
/* 1898 */                                  if ((j3 & 2) != 0) {
/* 1900 */                                      z3 = true;
                                            } else {
/* 1902 */                                      z3 = false;
                                            }
/* 1903 */                                  zzhdVarZzh.zzb(z3);
/* 1912 */                                  if ((j3 & 4) != 0) {
/* 1914 */                                      z4 = true;
                                            } else {
/* 1916 */                                      z4 = false;
                                            }
/* 1917 */                                  zzhdVarZzh.zzc(z4);
/* 1926 */                                  if ((j3 & 8) != 0) {
/* 1928 */                                      z5 = true;
                                            } else {
/* 1930 */                                      z5 = false;
                                            }
/* 1931 */                                  zzhdVarZzh.zzd(z5);
/* 1940 */                                  if ((j3 & 16) != 0) {
/* 1942 */                                      z6 = true;
                                            } else {
/* 1944 */                                      z6 = false;
                                            }
/* 1945 */                                  zzhdVarZzh.zze(z6);
/* 1952 */                                  if ((j3 & 32) != 0) {
/* 1954 */                                      z7 = true;
                                            } else {
/* 1956 */                                      z7 = false;
                                            }
/* 1957 */                                  zzhdVarZzh.zzf(z7);
/* 1966 */                                  if ((j3 & 64) != 0) {
/* 1968 */                                      z8 = true;
                                            } else {
/* 1970 */                                      z8 = false;
                                            }
/* 1971 */                                  zzhdVarZzh.zzg(z8);
/* 1980 */                                  zzicVarZzaE.zzaI((zzhe) zzhdVarZzh.zzbc());
                                        }
                                    } else {
/* 1984 */                              j2 = j;
                                    }
                                } else {
/* 1984 */                          j2 = j;
                                }
/* 1988 */                      if (j8 != 0) {
/* 1992 */                          zzicVarZzaE.zzY(j8);
/* 1995 */                          j8 = j8;
                                }
/* 1999 */                      zzicVarZzaE.zzar(j4);
/* 2002 */                      ci3 ci3VarM6761i1 = m6761i0();
/* 2028 */                      zzjqVarZza = zzjq.zza(ci3VarM6761i1.f15676b.f13905W.mo4561e().getContentResolver(), zzka.zza("com.google.android.gms.measurement"), vc0.f17978b);
/* 2032 */                      if (zzjqVarZza == null) {
/* 2034 */                          mapZzb = Collections.EMPTY_MAP;
                                } else {
/* 2037 */                          mapZzb = zzjqVarZza.zzb();
                                }
/* 2041 */                      if (mapZzb == null && !mapZzb.isEmpty()) {
/* 2058 */                          arrayList = new ArrayList();
/* 2063 */                          str13 = str8;
/* 2072 */                          int iIntValue = ((Integer) vg3.f18131f0.m9011a(null)).intValue();
/* 2080 */                          Iterator it3 = mapZzb.entrySet().iterator();
                                    while (true) {
/* 2088 */                              if (!it3.hasNext()) {
/* 2192 */                                  str14 = str9;
                                            break;
                                        }
/* 2094 */                              Map.Entry entry = (Map.Entry) it3.next();
/* 2100 */                              Iterator it4 = it3;
/* 2106 */                              str14 = str9;
/* 2114 */                              if (((String) entry.getKey()).startsWith("measurement.id.")) {
                                            try {
/* 2122 */                                      int i4 = Integer.parseInt((String) entry.getValue());
/* 2126 */                                      if (i4 != 0) {
/* 2132 */                                          arrayList.add(Integer.valueOf(i4));
/* 2139 */                                          if (arrayList.size() >= iIntValue) {
/* 2163 */                                              ((ij3) ci3VarM6761i1.f16749a).mo4557a().m9017E().m8511b(Integer.valueOf(arrayList.size()), "Too many experiment IDs. Number of IDs");
                                                        break;
                                                    }
                                                    continue;
                                                } else {
                                                    continue;
                                                }
                                            } catch (NumberFormatException e2) {
/* 2188 */                                      ((ij3) ci3VarM6761i1.f16749a).mo4557a().m9017E().m8511b(e2, "Experiment ID NumberFormatException");
                                            }
                                        }
/* 2169 */                              it3 = it4;
/* 2171 */                              str9 = str14;
                                    }
/* 2198 */                          if (!arrayList.isEmpty()) {
/* 2202 */                              if (arrayList != null) {
/* 2204 */                                  zzicVarZzaE.zzaq(arrayList);
                                        }
/* 2220 */                              if (m6753d0().m7406J(null, vg3.f18120b1)) {
/* 2222 */                                  zzicVarZzaE.zzaP(HttpUrl.FRAGMENT_ENCODE_SET);
                                        }
/* 2235 */                              ok3VarM7190j2 = m6752d(str6).m7190j(ok3.m7182c(100, str18));
/* 2243 */                              if (ok3VarM7190j2.m7189i(nk3Var) || !z9) {
/* 2428 */                                  str11 = str11;
/* 2434 */                                  ij3Var2.m4568p().m4240B();
/* 2439 */                                  zzicVarZzaE.zzF(Build.MODEL);
/* 2446 */                                  ij3Var2.m4568p().m4240B();
/* 2451 */                                  zzicVarZzaE.zzE(Build.VERSION.RELEASE);
/* 2463 */                                  zzicVarZzaE.zzI((int) ij3Var2.m4568p().m6641D());
/* 2474 */                                  zzicVarZzaE.zzH(ij3Var2.m4568p().m6642E());
/* 2481 */                                  zzicVarZzaE.zzay(zzrVar.f4253h0);
/* 2488 */                                  if (ij3Var2.m4560d()) {
/* 2490 */                                      zzicVarZzaE.zzK();
/* 2498 */                                      if (!TextUtils.isEmpty(null)) {
/* 2500 */                                          zzicVarZzaE.zzam(null);
                                                }
                                            }
/* 2507 */                                  di3VarM219D0 = m6755f0().m219D0(str6);
/* 2511 */                                  if (di3VarM219D0 == null) {
/* 2517 */                                      di3VarM219D0 = new di3(ij3Var2, str6);
/* 2520 */                                      mp3Var = this;
                                                try {
/* 2526 */                                          di3VarM219D0.m3095F(mp3Var.m6772o(ok3VarM7190j2));
/* 2531 */                                          di3VarM219D0.m3100K(zzrVar.f4235V);
/* 2536 */                                          di3VarM219D0.m3097H(str11);
/* 2543 */                                          if (ok3VarM7190j2.m7189i(nk3Var)) {
/* 2553 */                                              di3VarM219D0.m3098I(mp3Var.f13938w.m8815E(str6, z9));
                                                    }
/* 2562 */                                          di3VarM219D0.m3113e(0L);
/* 2565 */                                          di3VarM219D0.m3101L(0L);
/* 2568 */                                          di3VarM219D0.m3102M(0L);
/* 2573 */                                          di3VarM219D0.m3104O(str14);
/* 2578 */                                          di3VarM219D0.m3106Q(j2);
/* 2583 */                                          di3VarM219D0.m3107R(str13);
/* 2588 */                                          di3VarM219D0.m3108S(j6);
/* 2593 */                                          di3VarM219D0.m3109a(j8);
/* 2598 */                                          di3VarM219D0.m3112d(z10);
/* 2603 */                                          di3VarM219D0.m3111c(j4);
/* 2610 */                                          i = 0;
/* 2611 */                                          mp3Var.m6755f0().m221E0(di3VarM219D0, false);
                                                } catch (Throwable th) {
/* 2559 */                                          th = th;
                                                }
                                            } else {
/* 2615 */                                      i = 0;
/* 2616 */                                      mp3Var = this;
                                            }
/* 2624 */                                  if (ok3VarM7190j2.m7189i(nk3.ANALYTICS_STORAGE) && !TextUtils.isEmpty(di3VarM219D0.m3094E())) {
/* 2636 */                                      String strM3094E = di3VarM219D0.m3094E();
/* 2640 */                                      kb1.m6061n(strM3094E);
/* 2643 */                                      zzicVarZzaE.zzW(strM3094E);
                                            }
/* 2654 */                                  if (!TextUtils.isEmpty(di3VarM219D0.m3099J())) {
/* 2656 */                                      String strM3099J = di3VarM219D0.m3099J();
/* 2660 */                                      kb1.m6061n(strM3099J);
/* 2663 */                                      zzicVarZzaE.zzah(strM3099J);
                                            }
/* 2670 */                                  listM267w0 = mp3Var.m6755f0().m267w0(str6);
/* 2674 */                                  i2 = i;
/* 2679 */                                  while (i2 < listM267w0.size()) {
/* 2681 */                                      zzit zzitVarZzm = zziu.zzm();
/* 2693 */                                      zzitVarZzm.zzb(((rp3) listM267w0.get(i2)).f16226c);
/* 2704 */                                      zzitVarZzm.zza(((rp3) listM267w0.get(i2)).f16227d);
/* 2719 */                                      mp3Var.m6761i0().m1684X(zzitVarZzm, ((rp3) listM267w0.get(i2)).f16228e);
/* 2722 */                                      zzicVarZzaE.zzp(zzitVarZzm);
/* 2739 */                                      if ("_sid".equals(((rp3) listM267w0.get(i2)).f16226c)) {
/* 2743 */                                          bj3 bj3Var3 = di3VarM219D0.f7242a.f9659i;
/* 2745 */                                          ij3.m4555l(bj3Var3);
/* 2748 */                                          bj3Var3.mo1375y();
/* 2757 */                                          if (di3VarM219D0.f7264w != 0) {
/* 2759 */                                              ci3VarM6761i0 = mp3Var.m6761i0();
/* 2767 */                                              if (TextUtils.isEmpty(str12)) {
/* 2769 */                                                  str16 = str12;
/* 2771 */                                                  jM1694k0 = 0;
                                                        } else {
/* 2780 */                                                  str16 = str12;
/* 2786 */                                                  jM1694k0 = ci3VarM6761i0.m1694k0(str16.getBytes(Charset.forName("UTF-8")));
                                                        }
/* 2792 */                                              bj3 bj3Var4 = di3VarM219D0.f7242a.f9659i;
/* 2794 */                                              ij3.m4555l(bj3Var4);
/* 2797 */                                              bj3Var4.mo1375y();
/* 2804 */                                              if (jM1694k0 != di3VarM219D0.f7264w) {
/* 2806 */                                                  zzicVarZzaE.zzav();
                                                        }
                                                    } else {
/* 2810 */                                              str16 = str12;
                                                    }
                                                } else {
/* 2810 */                                          str16 = str12;
                                                }
/* 2812 */                                      i2++;
/* 2814 */                                      str12 = str16;
                                            }
                                            try {
/* 2818 */                                      ae3VarM6755f2 = mp3Var.m6755f0();
/* 2827 */                                      zzid zzidVar = (zzid) zzicVarZzaE.zzbc();
/* 2829 */                                      ae3VarM6755f2.mo1375y();
/* 2832 */                                      ae3VarM6755f2.m9593A();
/* 2835 */                                      kb1.m6061n(zzidVar);
/* 2842 */                                      kb1.m6058k(zzidVar.zzA());
/* 2845 */                                      byte[] bArrZzcc = zzidVar.zzcc();
/* 2855 */                                      long jM1694k1 = ae3VarM6755f2.f15676b.m6761i0().m1694k0(bArrZzcc);
/* 2861 */                                      ContentValues contentValues2 = new ContentValues();
/* 2870 */                                      contentValues2.put("app_id", zzidVar.zzA());
/* 2879 */                                      contentValues2.put("metadata_fingerprint", Long.valueOf(jM1694k1));
/* 2884 */                                      contentValues2.put("metadata", bArrZzcc);
                                                try {
/* 2895 */                                          ae3VarM6755f2.m261q0().insertWithOnConflict("raw_events_metadata", null, contentValues2, 4);
/* 2898 */                                          ae3VarM6755f3 = mp3Var.m6755f0();
/* 2902 */                                          zzbe zzbeVar2 = oe3Var2.f14732f;
/* 2904 */                                          Objects.requireNonNull(zzbeVar2);
/* 2913 */                                          it2 = zzbeVar2.f4207a.keySet().iterator();
                                                    while (true) {
/* 2921 */                                              if (it2.hasNext()) {
/* 2937 */                                                  vi3 vi3VarM6754e1 = mp3Var.m6754e0();
/* 2941 */                                                  String str30 = oe3Var2.f14727a;
/* 2945 */                                                  zM9290P = vi3VarM6754e1.m9290P(str30, oe3Var2.f14728b);
/* 2967 */                                                  ud3 ud3VarM223F0 = mp3Var.m6755f0().m223F0(false, false, false, false, str30, mp3Var.m6756g());
/* 2973 */                                                  if (zM9290P || ud3VarM223F0.f17481e >= mp3Var.m6753d0().m7404H(str30, vg3.f18155p)) {
/* 2993 */                                                      i3 = i;
                                                                break;
                                                            }
                                                        } else if ("_r".equals(it2.next())) {
                                                        }
/* 2935 */                                              i3 = 1;
                                                        break;
                                                    }
/* 2994 */                                          ae3VarM6755f3.mo1375y();
/* 2997 */                                          ae3VarM6755f3.m9593A();
/* 3000 */                                          str15 = oe3Var2.f14727a;
/* 3002 */                                          kb1.m6058k(str15);
/* 3015 */                                          byte[] bArrZzcc2 = ae3VarM6755f3.f15676b.m6761i0().m1688b0(oe3Var2).zzcc();
/* 3021 */                                          contentValues = new ContentValues();
/* 3024 */                                          contentValues.put("app_id", str15);
/* 3031 */                                          contentValues.put("name", oe3Var2.f14728b);
/* 3042 */                                          contentValues.put("timestamp", Long.valueOf(oe3Var2.f14730d));
/* 3049 */                                          contentValues.put("metadata_fingerprint", Long.valueOf(jM1694k1));
/* 3054 */                                          contentValues.put(SharedDataContentProvider.BASE_PATH, bArrZzcc2);
/* 3063 */                                          contentValues.put("realtime", Integer.valueOf(i3));
                                                    try {
/* 3081 */                                              if (ae3VarM6755f3.m261q0().insert("raw_events", null, contentValues) == -1) {
/* 3101 */                                                  ((ij3) ae3VarM6755f3.f16749a).mo4557a().m9016D().m8511b(uh3.m9013H(str15), "Failed to insert raw event (got -1). appId");
                                                        } else {
/* 3109 */                                                  mp3Var.f13908Z = 0L;
                                                        }
                                                    } catch (SQLiteException e3) {
/* 3132 */                                              ((ij3) ae3VarM6755f3.f16749a).mo4557a().m9016D().m8512c(uh3.m9013H(oe3Var2.f14727a), "Error storing raw event. appId", e3);
                                                    }
/* 3190 */                                          mp3Var.m6755f0().m259o0();
/* 3197 */                                          mp3Var.m6755f0().m260p0();
/* 3200 */                                          mp3Var.m6739L();
/* 3231 */                                          mp3Var.mo4557a().m9019G().m8511b(Long.valueOf(((System.nanoTime() - jNanoTime) + 500000) / 1000000), "Background event processing time, ms");
/* 3234 */                                          return;
                                                } catch (SQLiteException e4) {
/* 3161 */                                          ((ij3) ae3VarM6755f2.f16749a).mo4557a().m9016D().m8512c(uh3.m9013H(zzidVar.zzA()), "Error storing raw event metadata. appId", e4);
/* 3164 */                                          throw e4;
                                                }
                                            } catch (IOException e5) {
/* 3183 */                                      mp3Var.mo4557a().m9016D().m8512c(uh3.m9013H(zzicVarZzaE.zzK()), "Data loss. Failed to insert raw event metadata. appId", e5);
                                            }
                                        } else {
                                            try {
/* 2247 */                                      tn3 tn3Var = this.f13938w;
/* 2249 */                                      tn3Var.getClass();
/* 2267 */                                      Pair pairM8814D = ok3VarM7190j2.m7189i(nk3Var) ? tn3Var.m8814D(str6) : new Pair(HttpUrl.FRAGMENT_ENCODE_SET, Boolean.FALSE);
/* 2279 */                                      if (TextUtils.isEmpty((CharSequence) pairM8814D.first)) {
/* 2428 */                                          str11 = str11;
                                                } else {
/* 2285 */                                          zzicVarZzaE.zzQ((String) pairM8814D.first);
/* 2288 */                                          Object obj3 = pairM8814D.second;
/* 2290 */                                          if (obj3 != null) {
/* 2298 */                                              zzicVarZzaE.zzT(((Boolean) obj3).booleanValue());
                                                    }
/* 2309 */                                          if (oe3Var2.f14728b.equals("_fx") || ((String) pairM8814D.first).equals("00000000-0000-0000-0000-000000000000") || (di3VarM219D1 = m6755f0().m219D0(str6)) == null) {
/* 2428 */                                              str11 = str11;
                                                    } else {
/* 2335 */                                              bj3 bj3Var5 = di3VarM219D1.f7242a.f9659i;
/* 2337 */                                              ij3.m4555l(bj3Var5);
/* 2340 */                                              bj3Var5.mo1375y();
/* 2345 */                                              if (di3VarM219D1.f7266y) {
/* 2349 */                                                  m6780u(str6, false, null, null);
/* 2354 */                                                  Bundle bundle2 = new Bundle();
/* 2359 */                                                  bj3 bj3Var6 = di3VarM219D1.f7242a.f9659i;
/* 2361 */                                                  ij3.m4555l(bj3Var6);
/* 2364 */                                                  bj3Var6.mo1375y();
/* 2367 */                                                  Long l = di3VarM219D1.f7267z;
/* 2369 */                                                  if (l != null) {
/* 2385 */                                                      bundle2.putLong("_pfo", Math.max(0L, l.longValue()));
                                                            }
/* 2398 */                                                  bj3 bj3Var7 = di3VarM219D1.f7242a.f9659i;
/* 2400 */                                                  ij3.m4555l(bj3Var7);
/* 2403 */                                                  bj3Var7.mo1375y();
/* 2406 */                                                  Long l2 = di3VarM219D1.f7223A;
/* 2408 */                                                  if (l2 != null) {
/* 2416 */                                                      bundle2.putLong("_uwa", l2.longValue());
                                                            }
/* 2421 */                                                  bundle2.putLong("_r", 1L);
/* 2424 */                                                  ac3Var.m200e(str6, "_fx", bundle2);
                                                        } else {
/* 2428 */                                                  str11 = str11;
                                                        }
                                                    }
                                                }
/* 2434 */                                      ij3Var2.m4568p().m4240B();
/* 2439 */                                      zzicVarZzaE.zzF(Build.MODEL);
/* 2446 */                                      ij3Var2.m4568p().m4240B();
/* 2451 */                                      zzicVarZzaE.zzE(Build.VERSION.RELEASE);
/* 2463 */                                      zzicVarZzaE.zzI((int) ij3Var2.m4568p().m6641D());
/* 2474 */                                      zzicVarZzaE.zzH(ij3Var2.m4568p().m6642E());
/* 2481 */                                      zzicVarZzaE.zzay(zzrVar.f4253h0);
/* 2488 */                                      if (ij3Var2.m4560d()) {
/* 2490 */                                          zzicVarZzaE.zzK();
/* 2498 */                                          if (!TextUtils.isEmpty(null)) {
/* 2500 */                                              zzicVarZzaE.zzam(null);
                                                    }
                                                }
/* 2507 */                                      di3VarM219D0 = m6755f0().m219D0(str6);
/* 2511 */                                      if (di3VarM219D0 == null) {
/* 2517 */                                          di3VarM219D0 = new di3(ij3Var2, str6);
/* 2520 */                                          mp3Var = this;
/* 2526 */                                          di3VarM219D0.m3095F(mp3Var.m6772o(ok3VarM7190j2));
/* 2531 */                                          di3VarM219D0.m3100K(zzrVar.f4235V);
/* 2536 */                                          di3VarM219D0.m3097H(str11);
/* 2543 */                                          if (ok3VarM7190j2.m7189i(nk3Var)) {
/* 2553 */                                              di3VarM219D0.m3098I(mp3Var.f13938w.m8815E(str6, z9));
                                                    }
/* 2562 */                                          di3VarM219D0.m3113e(0L);
/* 2565 */                                          di3VarM219D0.m3101L(0L);
/* 2568 */                                          di3VarM219D0.m3102M(0L);
/* 2573 */                                          di3VarM219D0.m3104O(str14);
/* 2578 */                                          di3VarM219D0.m3106Q(j2);
/* 2583 */                                          di3VarM219D0.m3107R(str13);
/* 2588 */                                          di3VarM219D0.m3108S(j6);
/* 2593 */                                          di3VarM219D0.m3109a(j8);
/* 2598 */                                          di3VarM219D0.m3112d(z10);
/* 2603 */                                          di3VarM219D0.m3111c(j4);
/* 2610 */                                          i = 0;
/* 2611 */                                          mp3Var.m6755f0().m221E0(di3VarM219D0, false);
                                                } else {
/* 2615 */                                          i = 0;
/* 2616 */                                          mp3Var = this;
                                                }
/* 2624 */                                      if (ok3VarM7190j2.m7189i(nk3.ANALYTICS_STORAGE)) {
/* 2636 */                                          String strM3094E2 = di3VarM219D0.m3094E();
/* 2640 */                                          kb1.m6061n(strM3094E2);
/* 2643 */                                          zzicVarZzaE.zzW(strM3094E2);
                                                }
/* 2654 */                                      if (!TextUtils.isEmpty(di3VarM219D0.m3099J())) {
/* 2656 */                                          String strM3099J2 = di3VarM219D0.m3099J();
/* 2660 */                                          kb1.m6061n(strM3099J2);
/* 2663 */                                          zzicVarZzaE.zzah(strM3099J2);
                                                }
/* 2670 */                                      listM267w0 = mp3Var.m6755f0().m267w0(str6);
/* 2674 */                                      i2 = i;
/* 2679 */                                      while (i2 < listM267w0.size()) {
/* 2681 */                                          zzit zzitVarZzm2 = zziu.zzm();
/* 2693 */                                          zzitVarZzm2.zzb(((rp3) listM267w0.get(i2)).f16226c);
/* 2704 */                                          zzitVarZzm2.zza(((rp3) listM267w0.get(i2)).f16227d);
/* 2719 */                                          mp3Var.m6761i0().m1684X(zzitVarZzm2, ((rp3) listM267w0.get(i2)).f16228e);
/* 2722 */                                          zzicVarZzaE.zzp(zzitVarZzm2);
/* 2739 */                                          if ("_sid".equals(((rp3) listM267w0.get(i2)).f16226c)) {
/* 2743 */                                              bj3 bj3Var8 = di3VarM219D0.f7242a.f9659i;
/* 2745 */                                              ij3.m4555l(bj3Var8);
/* 2748 */                                              bj3Var8.mo1375y();
/* 2757 */                                              if (di3VarM219D0.f7264w != 0) {
/* 2759 */                                                  ci3VarM6761i0 = mp3Var.m6761i0();
/* 2767 */                                                  if (TextUtils.isEmpty(str12)) {
/* 2769 */                                                      str16 = str12;
/* 2771 */                                                      jM1694k0 = 0;
                                                            } else {
/* 2780 */                                                      str16 = str12;
/* 2786 */                                                      jM1694k0 = ci3VarM6761i0.m1694k0(str16.getBytes(Charset.forName("UTF-8")));
                                                            }
/* 2792 */                                                  bj3 bj3Var9 = di3VarM219D0.f7242a.f9659i;
/* 2794 */                                                  ij3.m4555l(bj3Var9);
/* 2797 */                                                  bj3Var9.mo1375y();
/* 2804 */                                                  if (jM1694k0 != di3VarM219D0.f7264w) {
/* 2806 */                                                      zzicVarZzaE.zzav();
                                                            }
                                                        } else {
/* 2810 */                                                  str16 = str12;
                                                        }
                                                    } else {
/* 2810 */                                              str16 = str12;
                                                    }
/* 2812 */                                          i2++;
/* 2814 */                                          str12 = str16;
                                                }
/* 2818 */                                      ae3VarM6755f2 = mp3Var.m6755f0();
/* 2827 */                                      zzid zzidVar2 = (zzid) zzicVarZzaE.zzbc();
/* 2829 */                                      ae3VarM6755f2.mo1375y();
/* 2832 */                                      ae3VarM6755f2.m9593A();
/* 2835 */                                      kb1.m6061n(zzidVar2);
/* 2842 */                                      kb1.m6058k(zzidVar2.zzA());
/* 2845 */                                      byte[] bArrZzcc3 = zzidVar2.zzcc();
/* 2855 */                                      long jM1694k2 = ae3VarM6755f2.f15676b.m6761i0().m1694k0(bArrZzcc3);
/* 2861 */                                      ContentValues contentValues3 = new ContentValues();
/* 2870 */                                      contentValues3.put("app_id", zzidVar2.zzA());
/* 2879 */                                      contentValues3.put("metadata_fingerprint", Long.valueOf(jM1694k2));
/* 2884 */                                      contentValues3.put("metadata", bArrZzcc3);
/* 2895 */                                      ae3VarM6755f2.m261q0().insertWithOnConflict("raw_events_metadata", null, contentValues3, 4);
/* 2898 */                                      ae3VarM6755f3 = mp3Var.m6755f0();
/* 2902 */                                      zzbe zzbeVar3 = oe3Var2.f14732f;
/* 2904 */                                      Objects.requireNonNull(zzbeVar3);
/* 2913 */                                      it2 = zzbeVar3.f4207a.keySet().iterator();
                                                while (true) {
/* 2921 */                                          if (it2.hasNext()) {
/* 2937 */                                              vi3 vi3VarM6754e2 = mp3Var.m6754e0();
/* 2941 */                                              String str31 = oe3Var2.f14727a;
/* 2945 */                                              zM9290P = vi3VarM6754e2.m9290P(str31, oe3Var2.f14728b);
/* 2967 */                                              ud3 ud3VarM223F1 = mp3Var.m6755f0().m223F0(false, false, false, false, str31, mp3Var.m6756g());
/* 2973 */                                              if (zM9290P) {
                                                        }
/* 2993 */                                              i3 = i;
                                                        break;
                                                    }
/* 2933 */                                          if ("_r".equals(it2.next())) {
                                                    }
/* 2935 */                                          i3 = 1;
                                                    break;
                                                }
/* 2994 */                                      ae3VarM6755f3.mo1375y();
/* 2997 */                                      ae3VarM6755f3.m9593A();
/* 3000 */                                      str15 = oe3Var2.f14727a;
/* 3002 */                                      kb1.m6058k(str15);
/* 3015 */                                      byte[] bArrZzcc4 = ae3VarM6755f3.f15676b.m6761i0().m1688b0(oe3Var2).zzcc();
/* 3021 */                                      contentValues = new ContentValues();
/* 3024 */                                      contentValues.put("app_id", str15);
/* 3031 */                                      contentValues.put("name", oe3Var2.f14728b);
/* 3042 */                                      contentValues.put("timestamp", Long.valueOf(oe3Var2.f14730d));
/* 3049 */                                      contentValues.put("metadata_fingerprint", Long.valueOf(jM1694k2));
/* 3054 */                                      contentValues.put(SharedDataContentProvider.BASE_PATH, bArrZzcc4);
/* 3063 */                                      contentValues.put("realtime", Integer.valueOf(i3));
/* 3081 */                                      if (ae3VarM6755f3.m261q0().insert("raw_events", null, contentValues) == -1) {
/* 3101 */                                          ((ij3) ae3VarM6755f3.f16749a).mo4557a().m9016D().m8511b(uh3.m9013H(str15), "Failed to insert raw event (got -1). appId");
                                                } else {
/* 3109 */                                          mp3Var.f13908Z = 0L;
                                                }
/* 3190 */                                      mp3Var.m6755f0().m259o0();
/* 3197 */                                      mp3Var.m6755f0().m260p0();
/* 3200 */                                      mp3Var.m6739L();
/* 3231 */                                      mp3Var.mo4557a().m9019G().m8511b(Long.valueOf(((System.nanoTime() - jNanoTime) + 500000) / 1000000), "Background event processing time, ms");
/* 3234 */                                      return;
                                            } catch (Throwable th2) {
/* 2389 */                                      th = th2;
/* 2390 */                                      mp3Var = this;
                                            }
                                        }
                                    }
/* 3239 */                          mp3Var.m6755f0().m260p0();
/* 3242 */                          throw th;
                                }
/* 2049 */                      str13 = str8;
/* 2051 */                      str14 = str9;
/* 2053 */                      arrayList = null;
/* 2202 */                      if (arrayList != null) {
/* 2204 */                          zzicVarZzaE.zzaq(arrayList);
                                }
/* 2220 */                      if (m6753d0().m7406J(null, vg3.f18120b1)) {
/* 2222 */                          zzicVarZzaE.zzaP(HttpUrl.FRAGMENT_ENCODE_SET);
                                }
/* 2235 */                      ok3VarM7190j2 = m6752d(str6).m7190j(ok3.m7182c(100, str18));
/* 2243 */                      if (ok3VarM7190j2.m7189i(nk3Var)) {
/* 2428 */                          str11 = str11;
/* 2434 */                          ij3Var2.m4568p().m4240B();
/* 2439 */                          zzicVarZzaE.zzF(Build.MODEL);
/* 2446 */                          ij3Var2.m4568p().m4240B();
/* 2451 */                          zzicVarZzaE.zzE(Build.VERSION.RELEASE);
/* 2463 */                          zzicVarZzaE.zzI((int) ij3Var2.m4568p().m6641D());
/* 2474 */                          zzicVarZzaE.zzH(ij3Var2.m4568p().m6642E());
/* 2481 */                          zzicVarZzaE.zzay(zzrVar.f4253h0);
/* 2488 */                          if (ij3Var2.m4560d()) {
/* 2490 */                              zzicVarZzaE.zzK();
/* 2498 */                              if (!TextUtils.isEmpty(null)) {
/* 2500 */                                  zzicVarZzaE.zzam(null);
                                        }
                                    }
/* 2507 */                          di3VarM219D0 = m6755f0().m219D0(str6);
/* 2511 */                          if (di3VarM219D0 == null) {
/* 2517 */                              di3VarM219D0 = new di3(ij3Var2, str6);
/* 2520 */                              mp3Var = this;
/* 2526 */                              di3VarM219D0.m3095F(mp3Var.m6772o(ok3VarM7190j2));
/* 2531 */                              di3VarM219D0.m3100K(zzrVar.f4235V);
/* 2536 */                              di3VarM219D0.m3097H(str11);
/* 2543 */                              if (ok3VarM7190j2.m7189i(nk3Var)) {
/* 2553 */                                  di3VarM219D0.m3098I(mp3Var.f13938w.m8815E(str6, z9));
                                        }
/* 2562 */                              di3VarM219D0.m3113e(0L);
/* 2565 */                              di3VarM219D0.m3101L(0L);
/* 2568 */                              di3VarM219D0.m3102M(0L);
/* 2573 */                              di3VarM219D0.m3104O(str14);
/* 2578 */                              di3VarM219D0.m3106Q(j2);
/* 2583 */                              di3VarM219D0.m3107R(str13);
/* 2588 */                              di3VarM219D0.m3108S(j6);
/* 2593 */                              di3VarM219D0.m3109a(j8);
/* 2598 */                              di3VarM219D0.m3112d(z10);
/* 2603 */                              di3VarM219D0.m3111c(j4);
/* 2610 */                              i = 0;
/* 2611 */                              mp3Var.m6755f0().m221E0(di3VarM219D0, false);
                                    } else {
/* 2615 */                              i = 0;
/* 2616 */                              mp3Var = this;
                                    }
/* 2624 */                          if (ok3VarM7190j2.m7189i(nk3.ANALYTICS_STORAGE)) {
/* 2636 */                              String strM3094E3 = di3VarM219D0.m3094E();
/* 2640 */                              kb1.m6061n(strM3094E3);
/* 2643 */                              zzicVarZzaE.zzW(strM3094E3);
                                    }
/* 2654 */                          if (!TextUtils.isEmpty(di3VarM219D0.m3099J())) {
/* 2656 */                              String strM3099J3 = di3VarM219D0.m3099J();
/* 2660 */                              kb1.m6061n(strM3099J3);
/* 2663 */                              zzicVarZzaE.zzah(strM3099J3);
                                    }
/* 2670 */                          listM267w0 = mp3Var.m6755f0().m267w0(str6);
/* 2674 */                          i2 = i;
/* 2679 */                          while (i2 < listM267w0.size()) {
/* 2681 */                              zzit zzitVarZzm3 = zziu.zzm();
/* 2693 */                              zzitVarZzm3.zzb(((rp3) listM267w0.get(i2)).f16226c);
/* 2704 */                              zzitVarZzm3.zza(((rp3) listM267w0.get(i2)).f16227d);
/* 2719 */                              mp3Var.m6761i0().m1684X(zzitVarZzm3, ((rp3) listM267w0.get(i2)).f16228e);
/* 2722 */                              zzicVarZzaE.zzp(zzitVarZzm3);
/* 2739 */                              if ("_sid".equals(((rp3) listM267w0.get(i2)).f16226c)) {
/* 2743 */                                  bj3 bj3Var10 = di3VarM219D0.f7242a.f9659i;
/* 2745 */                                  ij3.m4555l(bj3Var10);
/* 2748 */                                  bj3Var10.mo1375y();
/* 2757 */                                  if (di3VarM219D0.f7264w != 0) {
/* 2759 */                                      ci3VarM6761i0 = mp3Var.m6761i0();
/* 2767 */                                      if (TextUtils.isEmpty(str12)) {
/* 2769 */                                          str16 = str12;
/* 2771 */                                          jM1694k0 = 0;
                                                } else {
/* 2780 */                                          str16 = str12;
/* 2786 */                                          jM1694k0 = ci3VarM6761i0.m1694k0(str16.getBytes(Charset.forName("UTF-8")));
                                                }
/* 2792 */                                      bj3 bj3Var11 = di3VarM219D0.f7242a.f9659i;
/* 2794 */                                      ij3.m4555l(bj3Var11);
/* 2797 */                                      bj3Var11.mo1375y();
/* 2804 */                                      if (jM1694k0 != di3VarM219D0.f7264w) {
/* 2806 */                                          zzicVarZzaE.zzav();
                                                }
                                            } else {
/* 2810 */                                      str16 = str12;
                                            }
                                        } else {
/* 2810 */                                  str16 = str12;
                                        }
/* 2812 */                              i2++;
/* 2814 */                              str12 = str16;
                                    }
/* 2818 */                          ae3VarM6755f2 = mp3Var.m6755f0();
/* 2827 */                          zzid zzidVar3 = (zzid) zzicVarZzaE.zzbc();
/* 2829 */                          ae3VarM6755f2.mo1375y();
/* 2832 */                          ae3VarM6755f2.m9593A();
/* 2835 */                          kb1.m6061n(zzidVar3);
/* 2842 */                          kb1.m6058k(zzidVar3.zzA());
/* 2845 */                          byte[] bArrZzcc5 = zzidVar3.zzcc();
/* 2855 */                          long jM1694k3 = ae3VarM6755f2.f15676b.m6761i0().m1694k0(bArrZzcc5);
/* 2861 */                          ContentValues contentValues4 = new ContentValues();
/* 2870 */                          contentValues4.put("app_id", zzidVar3.zzA());
/* 2879 */                          contentValues4.put("metadata_fingerprint", Long.valueOf(jM1694k3));
/* 2884 */                          contentValues4.put("metadata", bArrZzcc5);
/* 2895 */                          ae3VarM6755f2.m261q0().insertWithOnConflict("raw_events_metadata", null, contentValues4, 4);
/* 2898 */                          ae3VarM6755f3 = mp3Var.m6755f0();
/* 2902 */                          zzbe zzbeVar4 = oe3Var2.f14732f;
/* 2904 */                          Objects.requireNonNull(zzbeVar4);
/* 2913 */                          it2 = zzbeVar4.f4207a.keySet().iterator();
                                    while (true) {
/* 2921 */                              if (it2.hasNext()) {
/* 2937 */                                  vi3 vi3VarM6754e3 = mp3Var.m6754e0();
/* 2941 */                                  String str32 = oe3Var2.f14727a;
/* 2945 */                                  zM9290P = vi3VarM6754e3.m9290P(str32, oe3Var2.f14728b);
/* 2967 */                                  ud3 ud3VarM223F2 = mp3Var.m6755f0().m223F0(false, false, false, false, str32, mp3Var.m6756g());
/* 2973 */                                  if (zM9290P) {
                                            }
/* 2993 */                                  i3 = i;
                                            break;
                                        }
/* 2933 */                              if ("_r".equals(it2.next())) {
                                        }
/* 2935 */                              i3 = 1;
                                        break;
                                    }
/* 2994 */                          ae3VarM6755f3.mo1375y();
/* 2997 */                          ae3VarM6755f3.m9593A();
/* 3000 */                          str15 = oe3Var2.f14727a;
/* 3002 */                          kb1.m6058k(str15);
/* 3015 */                          byte[] bArrZzcc6 = ae3VarM6755f3.f15676b.m6761i0().m1688b0(oe3Var2).zzcc();
/* 3021 */                          contentValues = new ContentValues();
/* 3024 */                          contentValues.put("app_id", str15);
/* 3031 */                          contentValues.put("name", oe3Var2.f14728b);
/* 3042 */                          contentValues.put("timestamp", Long.valueOf(oe3Var2.f14730d));
/* 3049 */                          contentValues.put("metadata_fingerprint", Long.valueOf(jM1694k3));
/* 3054 */                          contentValues.put(SharedDataContentProvider.BASE_PATH, bArrZzcc6);
/* 3063 */                          contentValues.put("realtime", Integer.valueOf(i3));
/* 3081 */                          if (ae3VarM6755f3.m261q0().insert("raw_events", null, contentValues) == -1) {
/* 3101 */                              ((ij3) ae3VarM6755f3.f16749a).mo4557a().m9016D().m8511b(uh3.m9013H(str15), "Failed to insert raw event (got -1). appId");
                                    } else {
/* 3109 */                              mp3Var.f13908Z = 0L;
                                    }
/* 3190 */                          mp3Var.m6755f0().m259o0();
/* 3197 */                          mp3Var.m6755f0().m260p0();
/* 3200 */                          mp3Var.m6739L();
/* 3231 */                          mp3Var.mo4557a().m9019G().m8511b(Long.valueOf(((System.nanoTime() - jNanoTime) + 500000) / 1000000), "Background event processing time, ms");
/* 3234 */                          return;
                                }
/* 2428 */                      str11 = str11;
/* 2434 */                      ij3Var2.m4568p().m4240B();
/* 2439 */                      zzicVarZzaE.zzF(Build.MODEL);
/* 2446 */                      ij3Var2.m4568p().m4240B();
/* 2451 */                      zzicVarZzaE.zzE(Build.VERSION.RELEASE);
/* 2463 */                      zzicVarZzaE.zzI((int) ij3Var2.m4568p().m6641D());
/* 2474 */                      zzicVarZzaE.zzH(ij3Var2.m4568p().m6642E());
/* 2481 */                      zzicVarZzaE.zzay(zzrVar.f4253h0);
/* 2488 */                      if (ij3Var2.m4560d()) {
/* 2490 */                          zzicVarZzaE.zzK();
/* 2498 */                          if (!TextUtils.isEmpty(null)) {
/* 2500 */                              zzicVarZzaE.zzam(null);
                                    }
                                }
/* 2507 */                      di3VarM219D0 = m6755f0().m219D0(str6);
/* 2511 */                      if (di3VarM219D0 == null) {
/* 2517 */                          di3VarM219D0 = new di3(ij3Var2, str6);
/* 2520 */                          mp3Var = this;
/* 2526 */                          di3VarM219D0.m3095F(mp3Var.m6772o(ok3VarM7190j2));
/* 2531 */                          di3VarM219D0.m3100K(zzrVar.f4235V);
/* 2536 */                          di3VarM219D0.m3097H(str11);
/* 2543 */                          if (ok3VarM7190j2.m7189i(nk3Var)) {
/* 2553 */                              di3VarM219D0.m3098I(mp3Var.f13938w.m8815E(str6, z9));
                                    }
/* 2562 */                          di3VarM219D0.m3113e(0L);
/* 2565 */                          di3VarM219D0.m3101L(0L);
/* 2568 */                          di3VarM219D0.m3102M(0L);
/* 2573 */                          di3VarM219D0.m3104O(str14);
/* 2578 */                          di3VarM219D0.m3106Q(j2);
/* 2583 */                          di3VarM219D0.m3107R(str13);
/* 2588 */                          di3VarM219D0.m3108S(j6);
/* 2593 */                          di3VarM219D0.m3109a(j8);
/* 2598 */                          di3VarM219D0.m3112d(z10);
/* 2603 */                          di3VarM219D0.m3111c(j4);
/* 2610 */                          i = 0;
/* 2611 */                          mp3Var.m6755f0().m221E0(di3VarM219D0, false);
                                } else {
/* 2615 */                          i = 0;
/* 2616 */                          mp3Var = this;
                                }
/* 2624 */                      if (ok3VarM7190j2.m7189i(nk3.ANALYTICS_STORAGE)) {
/* 2636 */                          String strM3094E4 = di3VarM219D0.m3094E();
/* 2640 */                          kb1.m6061n(strM3094E4);
/* 2643 */                          zzicVarZzaE.zzW(strM3094E4);
                                }
/* 2654 */                      if (!TextUtils.isEmpty(di3VarM219D0.m3099J())) {
/* 2656 */                          String strM3099J4 = di3VarM219D0.m3099J();
/* 2660 */                          kb1.m6061n(strM3099J4);
/* 2663 */                          zzicVarZzaE.zzah(strM3099J4);
                                }
/* 2670 */                      listM267w0 = mp3Var.m6755f0().m267w0(str6);
/* 2674 */                      i2 = i;
/* 2679 */                      while (i2 < listM267w0.size()) {
/* 2681 */                          zzit zzitVarZzm4 = zziu.zzm();
/* 2693 */                          zzitVarZzm4.zzb(((rp3) listM267w0.get(i2)).f16226c);
/* 2704 */                          zzitVarZzm4.zza(((rp3) listM267w0.get(i2)).f16227d);
/* 2719 */                          mp3Var.m6761i0().m1684X(zzitVarZzm4, ((rp3) listM267w0.get(i2)).f16228e);
/* 2722 */                          zzicVarZzaE.zzp(zzitVarZzm4);
/* 2739 */                          if ("_sid".equals(((rp3) listM267w0.get(i2)).f16226c)) {
/* 2743 */                              bj3 bj3Var12 = di3VarM219D0.f7242a.f9659i;
/* 2745 */                              ij3.m4555l(bj3Var12);
/* 2748 */                              bj3Var12.mo1375y();
/* 2757 */                              if (di3VarM219D0.f7264w != 0) {
/* 2759 */                                  ci3VarM6761i0 = mp3Var.m6761i0();
/* 2767 */                                  if (TextUtils.isEmpty(str12)) {
/* 2769 */                                      str16 = str12;
/* 2771 */                                      jM1694k0 = 0;
                                            } else {
/* 2780 */                                      str16 = str12;
/* 2786 */                                      jM1694k0 = ci3VarM6761i0.m1694k0(str16.getBytes(Charset.forName("UTF-8")));
                                            }
/* 2792 */                                  bj3 bj3Var13 = di3VarM219D0.f7242a.f9659i;
/* 2794 */                                  ij3.m4555l(bj3Var13);
/* 2797 */                                  bj3Var13.mo1375y();
/* 2804 */                                  if (jM1694k0 != di3VarM219D0.f7264w) {
/* 2806 */                                      zzicVarZzaE.zzav();
                                            }
                                        } else {
/* 2810 */                                  str16 = str12;
                                        }
                                    } else {
/* 2810 */                              str16 = str12;
                                    }
/* 2812 */                          i2++;
/* 2814 */                          str12 = str16;
                                }
/* 2818 */                      ae3VarM6755f2 = mp3Var.m6755f0();
/* 2827 */                      zzid zzidVar4 = (zzid) zzicVarZzaE.zzbc();
/* 2829 */                      ae3VarM6755f2.mo1375y();
/* 2832 */                      ae3VarM6755f2.m9593A();
/* 2835 */                      kb1.m6061n(zzidVar4);
/* 2842 */                      kb1.m6058k(zzidVar4.zzA());
/* 2845 */                      byte[] bArrZzcc7 = zzidVar4.zzcc();
/* 2855 */                      long jM1694k4 = ae3VarM6755f2.f15676b.m6761i0().m1694k0(bArrZzcc7);
/* 2861 */                      ContentValues contentValues5 = new ContentValues();
/* 2870 */                      contentValues5.put("app_id", zzidVar4.zzA());
/* 2879 */                      contentValues5.put("metadata_fingerprint", Long.valueOf(jM1694k4));
/* 2884 */                      contentValues5.put("metadata", bArrZzcc7);
/* 2895 */                      ae3VarM6755f2.m261q0().insertWithOnConflict("raw_events_metadata", null, contentValues5, 4);
/* 2898 */                      ae3VarM6755f3 = mp3Var.m6755f0();
/* 2902 */                      zzbe zzbeVar5 = oe3Var2.f14732f;
/* 2904 */                      Objects.requireNonNull(zzbeVar5);
/* 2913 */                      it2 = zzbeVar5.f4207a.keySet().iterator();
                                while (true) {
/* 2921 */                          if (it2.hasNext()) {
/* 2937 */                              vi3 vi3VarM6754e4 = mp3Var.m6754e0();
/* 2941 */                              String str33 = oe3Var2.f14727a;
/* 2945 */                              zM9290P = vi3VarM6754e4.m9290P(str33, oe3Var2.f14728b);
/* 2967 */                              ud3 ud3VarM223F3 = mp3Var.m6755f0().m223F0(false, false, false, false, str33, mp3Var.m6756g());
/* 2973 */                              if (zM9290P) {
                                        }
/* 2993 */                              i3 = i;
                                        break;
                                    }
/* 2933 */                          if ("_r".equals(it2.next())) {
                                    }
/* 2935 */                          i3 = 1;
                                    break;
                                }
/* 2994 */                      ae3VarM6755f3.mo1375y();
/* 2997 */                      ae3VarM6755f3.m9593A();
/* 3000 */                      str15 = oe3Var2.f14727a;
/* 3002 */                      kb1.m6058k(str15);
/* 3015 */                      byte[] bArrZzcc8 = ae3VarM6755f3.f15676b.m6761i0().m1688b0(oe3Var2).zzcc();
/* 3021 */                      contentValues = new ContentValues();
/* 3024 */                      contentValues.put("app_id", str15);
/* 3031 */                      contentValues.put("name", oe3Var2.f14728b);
/* 3042 */                      contentValues.put("timestamp", Long.valueOf(oe3Var2.f14730d));
/* 3049 */                      contentValues.put("metadata_fingerprint", Long.valueOf(jM1694k4));
/* 3054 */                      contentValues.put(SharedDataContentProvider.BASE_PATH, bArrZzcc8);
/* 3063 */                      contentValues.put("realtime", Integer.valueOf(i3));
/* 3081 */                      if (ae3VarM6755f3.m261q0().insert("raw_events", null, contentValues) == -1) {
/* 3101 */                          ((ij3) ae3VarM6755f3.f16749a).mo4557a().m9016D().m8511b(uh3.m9013H(str15), "Failed to insert raw event (got -1). appId");
                                } else {
/* 3109 */                          mp3Var.f13908Z = 0L;
                                }
/* 3190 */                      mp3Var.m6755f0().m259o0();
/* 3197 */                      mp3Var.m6755f0().m260p0();
/* 3200 */                      mp3Var.m6739L();
/* 3231 */                      mp3Var.mo4557a().m9019G().m8511b(Long.valueOf(((System.nanoTime() - jNanoTime) + 500000) / 1000000), "Background event processing time, ms");
/* 3234 */                      return;
/* 3239 */                      mp3Var.m6755f0().m260p0();
/* 3242 */                      throw th;
                            }
/* 1007 */                  if (jIntValue % 1000 == 1) {
/* 1029 */                      mo4557a().m9016D().m8512c(uh3.m9013H(str5), "Data loss. Too many events logged. appId, count", Long.valueOf(ud3VarM225G0.f17478b));
                            }
/* 1036 */                  m6755f0().m259o0();
/* 1589 */                  m6755f0().m260p0();
                        }
/* 513 */               str = str19;
/* 532 */               str2 = str20;
/* 534 */               String strM2166F1 = zzbeVar.m2166F1();
/* 538 */               str3 = str21;
/* 540 */               Bundle bundle3 = zzbeVar.f4207a;
/* 542 */               if (z11) {
/* 557 */                   double dDoubleValue = zzbeVar.m2165E1().doubleValue() * 1000000.0d;
/* 563 */                   if (dDoubleValue == 0.0d) {
/* 572 */                       dDoubleValue = bundle3.getLong(FirebaseAnalytics.Param.VALUE) * 1000000.0d;
                            }
/* 581 */                   if (dDoubleValue > 9.223372036854776E18d || dDoubleValue < -9.223372036854776E18d) {
/* 619 */                       mo4557a().m9017E().m8512c(uh3.m9013H(str22), "Data lost. Currency value is too big. appId", Double.valueOf(dDoubleValue));
/* 626 */                       m6755f0().m259o0();
                            } else {
/* 589 */                       jRound = Math.round(dDoubleValue);
/* 597 */                       if (FirebaseAnalytics.Event.REFUND.equals(str26)) {
/* 599 */                           jRound = -jRound;
                                }
                            }
/* 1589 */                  m6755f0().m260p0();
                        }
/* 11 */                str17 = "events";
/* 633 */               jRound = bundle3.getLong(FirebaseAnalytics.Param.VALUE);
/* 641 */               if (!TextUtils.isEmpty(strM2166F1)) {
/* 645 */                   String upperCase = strM2166F1.toUpperCase(Locale.US);
/* 655 */                   if (upperCase.matches("[A-Z]{3}")) {
/* 657 */                       String strConcat = "_ltv_".concat(upperCase);
/* 665 */                       rp3 rp3VarM266v1 = m6755f0().m266v0(str22, strConcat);
                                try {
/* 669 */                           if (rp3VarM266v1 != null) {
/* 671 */                               Object obj4 = rp3VarM266v1.f16228e;
/* 675 */                               if (obj4 instanceof Long) {
/* 682 */                                   long jLongValue = ((Long) obj4).longValue();
/* 690 */                                   String str34 = zzbgVarM9580c.f4210c;
/* 698 */                                   ((xt0) mo4562f()).getClass();
/* 717 */                                   rp3Var = new rp3(str22, str34, strConcat, System.currentTimeMillis(), Long.valueOf(jLongValue + jRound));
/* 722 */                                   str4 = str22;
                                        }
/* 724 */                               rp3Var2 = rp3Var;
/* 829 */                               if (!m6755f0().m265u0(rp3Var2)) {
/* 857 */                                   mo4557a().m9016D().m8513d("Too many unique user properties are set. Ignoring user property. appId", uh3.m9013H(str4), ij3Var2.m4565m().m6658c(rp3Var2.f16226c), rp3Var2.f16228e);
/* 860 */                                   m6763j0();
/* 873 */                                   up3.m9062P(ac3Var3, str4, 9, null, null, 0);
/* 876 */                                   ac3Var = ac3Var3;
                                        }
/* 883 */                               zM9074x0 = up3.m9074x0(str26);
/* 887 */                               zEquals = "_err".equals(str26);
/* 891 */                               m6763j0();
/* 894 */                               if (zzbeVar == null) {
/* 896 */                                   length = 0;
                                        } else {
/* 907 */                                   it = zzbeVar.f4207a.keySet().iterator();
/* 911 */                                   length = 0;
/* 917 */                                   while (it.hasNext()) {
/* 925 */                                       objM2164D1 = zzbeVar.m2164D1(it.next());
/* 931 */                                       if (objM2164D1 instanceof Parcelable[]) {
/* 939 */                                           length += (long) ((Parcelable[]) objM2164D1).length;
                                                }
                                            }
                                        }
/* 952 */                               str5 = str4;
/* 968 */                               ud3VarM225G0 = m6755f0().m225G0(m6756g(), str5, length + 1, true, zM9074x0, false, zEquals, false, false, false);
/* 976 */                               long j12 = ud3VarM225G0.f17478b;
/* 978 */                               m6753d0();
/* 997 */                               jIntValue = j12 - ((long) ((Integer) vg3.f18147l.m9011a(null)).intValue());
/* 1002 */                              if (jIntValue <= 0) {
/* 1041 */                                  if (zM9074x0) {
/* 1043 */                                      long j13 = ud3VarM225G0.f17477a;
/* 1045 */                                      m6753d0();
/* 1064 */                                      jIntValue2 = j13 - ((long) ((Integer) vg3.f18151n.m9011a(null)).intValue());
/* 1067 */                                      if (jIntValue2 > 0) {
/* 1073 */                                          if (jIntValue2 % 1000 == 1) {
/* 1095 */                                              mo4557a().m9016D().m8512c(uh3.m9013H(str5), "Data loss. Too many public events logged. appId, count", Long.valueOf(ud3VarM225G0.f17477a));
                                                    }
/* 1098 */                                          m6763j0();
/* 1113 */                                          up3.m9062P(ac3Var, str5, 16, "_ev", zzbgVarM9580c.f4208a, 0);
/* 1120 */                                          m6755f0().m259o0();
                                                }
                                            }
/* 1125 */                                  str6 = str5;
/* 1127 */                                  if (zEquals) {
/* 1154 */                                      jMax = ud3VarM225G0.f17480d - ((long) Math.max(0, Math.min(1000000, m6753d0().m7404H(str6, vg3.f18149m))));
/* 1157 */                                      if (jMax > 0) {
/* 1161 */                                          if (jMax == 1) {
/* 1183 */                                              mo4557a().m9016D().m8512c(uh3.m9013H(str6), "Too many error events logged. appId, count", Long.valueOf(ud3VarM225G0.f17480d));
                                                    }
/* 1190 */                                          m6755f0().m259o0();
                                                }
                                            }
/* 1195 */                                  bundleM2167G1 = zzbeVar.m2167G1();
/* 1199 */                                  up3 up3VarM6763j2 = m6763j0();
/* 1205 */                                  String str210 = zzbgVarM9580c.f4210c;
/* 1207 */                                  up3VarM6763j2.m9094O(str210, "_o", bundleM2167G1);
/* 1222 */                                  if (m6763j0().m9098Z(str6, zzrVar.f4259m0)) {
/* 1234 */                                      m6763j0().m9094O(1L, "_dbg", bundleM2167G1);
/* 1241 */                                      m6763j0().m9094O(1L, "_r", bundleM2167G1);
                                            }
/* 1250 */                                  if ("_s".equals(str26)) {
/* 1262 */                                      obj2 = rp3VarM266v0.f16228e;
/* 1266 */                                      if (obj2 instanceof Long) {
/* 1272 */                                          m6763j0().m9094O(obj2, "_sno", bundleM2167G1);
                                                }
                                            }
/* 1286 */                                  if (m6753d0().m7406J(null, vg3.f18110X0)) {
/* 1304 */                                      obj = bundleM2167G1.get(FirebaseAnalytics.Param.VALUE);
/* 1310 */                                      if (obj instanceof String) {
/* 1314 */                                          double d2 = Double.parseDouble((String) obj);
/* 1318 */                                          bundleM2167G1.remove(FirebaseAnalytics.Param.VALUE);
/* 1321 */                                          bundleM2167G1.putDouble(FirebaseAnalytics.Param.VALUE, d2);
                                                }
                                            }
/* 1324 */                                  ae3VarM6755f1 = m6755f0();
/* 1328 */                                  kb1.m6058k(str6);
/* 1331 */                                  ae3VarM6755f1.mo1375y();
/* 1334 */                                  ae3VarM6755f1.m9593A();
/* 1375 */                                  jDelete = ae3VarM6755f1.m261q0().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str6, String.valueOf(Math.max(0, Math.min(1000000, ((ij3) ae3VarM6755f1.f16749a).f9651d.m7404H(str6, vg3.f18157q))))});
/* 1407 */                                  if (jDelete > 0) {
/* 1427 */                                      mo4557a().m9017E().m8512c(uh3.m9013H(str6), "Data lost. Too many events stored on disk, deleted. appId", Long.valueOf(jDelete));
                                            }
/* 1432 */                                  ij3Var = this.f13905W;
/* 1454 */                                  oe3Var = new oe3(ij3Var, zzbgVarM9580c.f4210c, str6, zzbgVarM9580c.f4208a, zzbgVarM9580c.f4211d, 0L, bundleM2167G1);
/* 1461 */                                  ae3 ae3VarM6755f5 = m6755f0();
/* 1465 */                                  str7 = oe3Var.f14728b;
/* 1467 */                                  String str211 = str17;
/* 1469 */                                  pe3VarM246Z = ae3VarM6755f5.m246Z(str211, str6, str7);
/* 1473 */                                  if (pe3VarM246Z == null) {
/* 1479 */                                      jM238R = m6755f0().m238R(str6);
/* 1483 */                                      pd3VarM6753d0 = m6753d0();
/* 1487 */                                      pd3VarM6753d0.getClass();
/* 1490 */                                      ug3Var = vg3.f18107W;
/* 1508 */                                      ac3Var2 = ac3Var;
/* 1513 */                                      if (jM238R >= Math.max(Math.min(pd3VarM6753d0.m7404H(str6, ug3Var), 2000), 500)) {
                                                }
/* 1595 */                                      ac3Var = ac3Var2;
/* 1621 */                                      pe3VarM7412a = new pe3(str6, str7, 0L, 0L, 0L, oe3Var.f14730d, 0L, null, null, null, null);
/* 1624 */                                      str6 = str6;
                                            } else {
/* 1632 */                                      oe3Var = oe3Var.m7140a(ij3Var, pe3VarM246Z.f15085f);
/* 1638 */                                      pe3VarM7412a = pe3VarM246Z.m7412a(oe3Var.f14730d);
                                            }
/* 1626 */                                  oe3Var2 = oe3Var;
/* 1647 */                                  m6755f0().m247a0(str211, pe3VarM7412a);
/* 1654 */                                  mo4558b().mo1375y();
/* 1657 */                                  m6765k0();
/* 1660 */                                  String str212 = oe3Var2.f14727a;
/* 1662 */                                  kb1.m6058k(str212);
/* 1669 */                                  kb1.m6054g(str212.equals(str6));
/* 1672 */                                  zzicVarZzaE = zzid.zzaE();
/* 1677 */                                  zzicVarZzaE.zza(1);
/* 1682 */                                  zzicVarZzaE.zzC("android");
/* 1689 */                                  if (!TextUtils.isEmpty(str6)) {
/* 1691 */                                      zzicVarZzaE.zzL(str6);
                                            }
/* 1698 */                                  if (TextUtils.isEmpty(str3)) {
/* 1700 */                                      str8 = str3;
/* 1702 */                                      zzicVarZzaE.zzJ(str8);
                                            } else {
/* 1706 */                                      str8 = str3;
                                            }
/* 1712 */                                  if (TextUtils.isEmpty(str2)) {
/* 1714 */                                      str9 = str2;
/* 1716 */                                      zzicVarZzaE.zzM(str9);
                                            } else {
/* 1720 */                                      str9 = str2;
                                            }
/* 1726 */                                  if (TextUtils.isEmpty(str)) {
/* 1728 */                                      str10 = str;
/* 1730 */                                      zzicVarZzaE.zzau(str10);
                                            } else {
/* 1734 */                                      str10 = str;
                                            }
/* 1741 */                                  if (j7 != -2147483648L) {
/* 1743 */                                      j = j7;
/* 1746 */                                      zzicVarZzaE.zzaj((int) j);
                                            } else {
/* 1753 */                                      j = j7;
                                            }
/* 1756 */                                  zzicVarZzaE.zzN(j6);
/* 1763 */                                  if (TextUtils.isEmpty(str23)) {
/* 1767 */                                      str11 = str23;
/* 1769 */                                      zzicVarZzaE.zzad(str11);
                                            } else {
/* 1775 */                                      str11 = str23;
                                            }
/* 1777 */                                  kb1.m6061n(str6);
/* 1786 */                                  str12 = str10;
/* 1796 */                                  ok3VarM7190j = m6752d(str6).m7190j(ok3.m7182c(100, str18));
/* 1804 */                                  zzicVarZzaE.zzat(ok3VarM7190j.m7187f());
/* 1807 */                                  zzql.zza();
/* 1816 */                                  zM7406J = m6753d0().m7406J(str6, vg3.f18094P0);
/* 1820 */                                  nk3Var = nk3.AD_STORAGE;
/* 1822 */                                  if (zM7406J) {
/* 1824 */                                      m6763j0();
/* 1831 */                                      if (up3.m9066V(str6)) {
/* 1835 */                                          zzicVarZzaE.zzaH(zzrVar.f4257k0);
/* 1838 */                                          j2 = j;
/* 1840 */                                          j3 = zzrVar.f4258l0;
/* 1848 */                                          if (!ok3VarM7190j.m7189i(nk3Var)) {
/* 1858 */                                              j3 = (j3 & (-2)) | 32;
                                                    }
/* 1862 */                                          if (j3 == 1) {
/* 1864 */                                              z = true;
                                                    } else {
/* 1866 */                                              z = false;
                                                    }
/* 1867 */                                          zzicVarZzaE.zzaz(z);
/* 1872 */                                          if (j3 != 0) {
/* 1876 */                                              zzhd zzhdVarZzh2 = zzhe.zzh();
/* 1884 */                                              if ((j3 & 1) != 0) {
/* 1886 */                                                  z2 = true;
                                                        } else {
/* 1888 */                                                  z2 = false;
                                                        }
/* 1889 */                                              zzhdVarZzh2.zza(z2);
/* 1898 */                                              if ((j3 & 2) != 0) {
/* 1900 */                                                  z3 = true;
                                                        } else {
/* 1902 */                                                  z3 = false;
                                                        }
/* 1903 */                                              zzhdVarZzh2.zzb(z3);
/* 1912 */                                              if ((j3 & 4) != 0) {
/* 1914 */                                                  z4 = true;
                                                        } else {
/* 1916 */                                                  z4 = false;
                                                        }
/* 1917 */                                              zzhdVarZzh2.zzc(z4);
/* 1926 */                                              if ((j3 & 8) != 0) {
/* 1928 */                                                  z5 = true;
                                                        } else {
/* 1930 */                                                  z5 = false;
                                                        }
/* 1931 */                                              zzhdVarZzh2.zzd(z5);
/* 1940 */                                              if ((j3 & 16) != 0) {
/* 1942 */                                                  z6 = true;
                                                        } else {
/* 1944 */                                                  z6 = false;
                                                        }
/* 1945 */                                              zzhdVarZzh2.zze(z6);
/* 1952 */                                              if ((j3 & 32) != 0) {
/* 1954 */                                                  z7 = true;
                                                        } else {
/* 1956 */                                                  z7 = false;
                                                        }
/* 1957 */                                              zzhdVarZzh2.zzf(z7);
/* 1966 */                                              if ((j3 & 64) != 0) {
/* 1968 */                                                  z8 = true;
                                                        } else {
/* 1970 */                                                  z8 = false;
                                                        }
/* 1971 */                                              zzhdVarZzh2.zzg(z8);
/* 1980 */                                              zzicVarZzaE.zzaI((zzhe) zzhdVarZzh2.zzbc());
                                                    }
                                                } else {
/* 1984 */                                          j2 = j;
                                                }
                                            } else {
/* 1984 */                                      j2 = j;
                                            }
/* 1988 */                                  if (j8 != 0) {
/* 1992 */                                      zzicVarZzaE.zzY(j8);
/* 1995 */                                      j8 = j8;
                                            }
/* 1999 */                                  zzicVarZzaE.zzar(j4);
/* 2002 */                                  ci3 ci3VarM6761i2 = m6761i0();
/* 2028 */                                  zzjqVarZza = zzjq.zza(ci3VarM6761i2.f15676b.f13905W.mo4561e().getContentResolver(), zzka.zza("com.google.android.gms.measurement"), vc0.f17978b);
/* 2032 */                                  if (zzjqVarZza == null) {
/* 2034 */                                      mapZzb = Collections.EMPTY_MAP;
                                            } else {
/* 2037 */                                      mapZzb = zzjqVarZza.zzb();
                                            }
/* 2041 */                                  if (mapZzb == null) {
/* 2049 */                                      str13 = str8;
/* 2051 */                                      str14 = str9;
/* 2053 */                                      arrayList = null;
                                            } else {
/* 2049 */                                      str13 = str8;
/* 2051 */                                      str14 = str9;
/* 2053 */                                      arrayList = null;
                                            }
/* 2202 */                                  if (arrayList != null) {
/* 2204 */                                      zzicVarZzaE.zzaq(arrayList);
                                            }
/* 2220 */                                  if (m6753d0().m7406J(null, vg3.f18120b1)) {
/* 2222 */                                      zzicVarZzaE.zzaP(HttpUrl.FRAGMENT_ENCODE_SET);
                                            }
/* 2235 */                                  ok3VarM7190j2 = m6752d(str6).m7190j(ok3.m7182c(100, str18));
/* 2243 */                                  if (ok3VarM7190j2.m7189i(nk3Var)) {
/* 2428 */                                      str11 = str11;
/* 2434 */                                      ij3Var2.m4568p().m4240B();
/* 2439 */                                      zzicVarZzaE.zzF(Build.MODEL);
/* 2446 */                                      ij3Var2.m4568p().m4240B();
/* 2451 */                                      zzicVarZzaE.zzE(Build.VERSION.RELEASE);
/* 2463 */                                      zzicVarZzaE.zzI((int) ij3Var2.m4568p().m6641D());
/* 2474 */                                      zzicVarZzaE.zzH(ij3Var2.m4568p().m6642E());
/* 2481 */                                      zzicVarZzaE.zzay(zzrVar.f4253h0);
/* 2488 */                                      if (ij3Var2.m4560d()) {
/* 2490 */                                          zzicVarZzaE.zzK();
/* 2498 */                                          if (!TextUtils.isEmpty(null)) {
/* 2500 */                                              zzicVarZzaE.zzam(null);
                                                    }
                                                }
/* 2507 */                                      di3VarM219D0 = m6755f0().m219D0(str6);
/* 2511 */                                      if (di3VarM219D0 == null) {
/* 2517 */                                          di3VarM219D0 = new di3(ij3Var2, str6);
/* 2520 */                                          mp3Var = this;
/* 2526 */                                          di3VarM219D0.m3095F(mp3Var.m6772o(ok3VarM7190j2));
/* 2531 */                                          di3VarM219D0.m3100K(zzrVar.f4235V);
/* 2536 */                                          di3VarM219D0.m3097H(str11);
/* 2543 */                                          if (ok3VarM7190j2.m7189i(nk3Var)) {
/* 2553 */                                              di3VarM219D0.m3098I(mp3Var.f13938w.m8815E(str6, z9));
                                                    }
/* 2562 */                                          di3VarM219D0.m3113e(0L);
/* 2565 */                                          di3VarM219D0.m3101L(0L);
/* 2568 */                                          di3VarM219D0.m3102M(0L);
/* 2573 */                                          di3VarM219D0.m3104O(str14);
/* 2578 */                                          di3VarM219D0.m3106Q(j2);
/* 2583 */                                          di3VarM219D0.m3107R(str13);
/* 2588 */                                          di3VarM219D0.m3108S(j6);
/* 2593 */                                          di3VarM219D0.m3109a(j8);
/* 2598 */                                          di3VarM219D0.m3112d(z10);
/* 2603 */                                          di3VarM219D0.m3111c(j4);
/* 2610 */                                          i = 0;
/* 2611 */                                          mp3Var.m6755f0().m221E0(di3VarM219D0, false);
                                                } else {
/* 2615 */                                          i = 0;
/* 2616 */                                          mp3Var = this;
                                                }
/* 2624 */                                      if (ok3VarM7190j2.m7189i(nk3.ANALYTICS_STORAGE)) {
/* 2636 */                                          String strM3094E5 = di3VarM219D0.m3094E();
/* 2640 */                                          kb1.m6061n(strM3094E5);
/* 2643 */                                          zzicVarZzaE.zzW(strM3094E5);
                                                }
/* 2654 */                                      if (!TextUtils.isEmpty(di3VarM219D0.m3099J())) {
/* 2656 */                                          String strM3099J5 = di3VarM219D0.m3099J();
/* 2660 */                                          kb1.m6061n(strM3099J5);
/* 2663 */                                          zzicVarZzaE.zzah(strM3099J5);
                                                }
/* 2670 */                                      listM267w0 = mp3Var.m6755f0().m267w0(str6);
/* 2674 */                                      i2 = i;
/* 2679 */                                      while (i2 < listM267w0.size()) {
/* 2681 */                                          zzit zzitVarZzm5 = zziu.zzm();
/* 2693 */                                          zzitVarZzm5.zzb(((rp3) listM267w0.get(i2)).f16226c);
/* 2704 */                                          zzitVarZzm5.zza(((rp3) listM267w0.get(i2)).f16227d);
/* 2719 */                                          mp3Var.m6761i0().m1684X(zzitVarZzm5, ((rp3) listM267w0.get(i2)).f16228e);
/* 2722 */                                          zzicVarZzaE.zzp(zzitVarZzm5);
/* 2739 */                                          if ("_sid".equals(((rp3) listM267w0.get(i2)).f16226c)) {
/* 2743 */                                              bj3 bj3Var14 = di3VarM219D0.f7242a.f9659i;
/* 2745 */                                              ij3.m4555l(bj3Var14);
/* 2748 */                                              bj3Var14.mo1375y();
/* 2757 */                                              if (di3VarM219D0.f7264w != 0) {
/* 2759 */                                                  ci3VarM6761i0 = mp3Var.m6761i0();
/* 2767 */                                                  if (TextUtils.isEmpty(str12)) {
/* 2769 */                                                      str16 = str12;
/* 2771 */                                                      jM1694k0 = 0;
                                                            } else {
/* 2780 */                                                      str16 = str12;
/* 2786 */                                                      jM1694k0 = ci3VarM6761i0.m1694k0(str16.getBytes(Charset.forName("UTF-8")));
                                                            }
/* 2792 */                                                  bj3 bj3Var15 = di3VarM219D0.f7242a.f9659i;
/* 2794 */                                                  ij3.m4555l(bj3Var15);
/* 2797 */                                                  bj3Var15.mo1375y();
/* 2804 */                                                  if (jM1694k0 != di3VarM219D0.f7264w) {
/* 2806 */                                                      zzicVarZzaE.zzav();
                                                            }
                                                        } else {
/* 2810 */                                                  str16 = str12;
                                                        }
                                                    } else {
/* 2810 */                                              str16 = str12;
                                                    }
/* 2812 */                                          i2++;
/* 2814 */                                          str12 = str16;
                                                }
/* 2818 */                                      ae3VarM6755f2 = mp3Var.m6755f0();
/* 2827 */                                      zzid zzidVar5 = (zzid) zzicVarZzaE.zzbc();
/* 2829 */                                      ae3VarM6755f2.mo1375y();
/* 2832 */                                      ae3VarM6755f2.m9593A();
/* 2835 */                                      kb1.m6061n(zzidVar5);
/* 2842 */                                      kb1.m6058k(zzidVar5.zzA());
/* 2845 */                                      byte[] bArrZzcc9 = zzidVar5.zzcc();
/* 2855 */                                      long jM1694k5 = ae3VarM6755f2.f15676b.m6761i0().m1694k0(bArrZzcc9);
/* 2861 */                                      ContentValues contentValues6 = new ContentValues();
/* 2870 */                                      contentValues6.put("app_id", zzidVar5.zzA());
/* 2879 */                                      contentValues6.put("metadata_fingerprint", Long.valueOf(jM1694k5));
/* 2884 */                                      contentValues6.put("metadata", bArrZzcc9);
/* 2895 */                                      ae3VarM6755f2.m261q0().insertWithOnConflict("raw_events_metadata", null, contentValues6, 4);
/* 2898 */                                      ae3VarM6755f3 = mp3Var.m6755f0();
/* 2902 */                                      zzbe zzbeVar6 = oe3Var2.f14732f;
/* 2904 */                                      Objects.requireNonNull(zzbeVar6);
/* 2913 */                                      it2 = zzbeVar6.f4207a.keySet().iterator();
                                                while (true) {
/* 2921 */                                          if (it2.hasNext()) {
/* 2937 */                                              vi3 vi3VarM6754e5 = mp3Var.m6754e0();
/* 2941 */                                              String str35 = oe3Var2.f14727a;
/* 2945 */                                              zM9290P = vi3VarM6754e5.m9290P(str35, oe3Var2.f14728b);
/* 2967 */                                              ud3 ud3VarM223F4 = mp3Var.m6755f0().m223F0(false, false, false, false, str35, mp3Var.m6756g());
/* 2973 */                                              if (zM9290P) {
                                                        }
/* 2993 */                                              i3 = i;
                                                        break;
                                                    }
/* 2933 */                                          if ("_r".equals(it2.next())) {
                                                    }
/* 2935 */                                          i3 = 1;
                                                    break;
                                                }
/* 2994 */                                      ae3VarM6755f3.mo1375y();
/* 2997 */                                      ae3VarM6755f3.m9593A();
/* 3000 */                                      str15 = oe3Var2.f14727a;
/* 3002 */                                      kb1.m6058k(str15);
/* 3015 */                                      byte[] bArrZzcc10 = ae3VarM6755f3.f15676b.m6761i0().m1688b0(oe3Var2).zzcc();
/* 3021 */                                      contentValues = new ContentValues();
/* 3024 */                                      contentValues.put("app_id", str15);
/* 3031 */                                      contentValues.put("name", oe3Var2.f14728b);
/* 3042 */                                      contentValues.put("timestamp", Long.valueOf(oe3Var2.f14730d));
/* 3049 */                                      contentValues.put("metadata_fingerprint", Long.valueOf(jM1694k5));
/* 3054 */                                      contentValues.put(SharedDataContentProvider.BASE_PATH, bArrZzcc10);
/* 3063 */                                      contentValues.put("realtime", Integer.valueOf(i3));
/* 3081 */                                      if (ae3VarM6755f3.m261q0().insert("raw_events", null, contentValues) == -1) {
/* 3101 */                                          ((ij3) ae3VarM6755f3.f16749a).mo4557a().m9016D().m8511b(uh3.m9013H(str15), "Failed to insert raw event (got -1). appId");
                                                } else {
/* 3109 */                                          mp3Var.f13908Z = 0L;
                                                }
/* 3190 */                                      mp3Var.m6755f0().m259o0();
/* 3197 */                                      mp3Var.m6755f0().m260p0();
/* 3200 */                                      mp3Var.m6739L();
/* 3231 */                                      mp3Var.mo4557a().m9019G().m8511b(Long.valueOf(((System.nanoTime() - jNanoTime) + 500000) / 1000000), "Background event processing time, ms");
/* 3234 */                                      return;
                                            }
/* 2428 */                                  str11 = str11;
/* 2434 */                                  ij3Var2.m4568p().m4240B();
/* 2439 */                                  zzicVarZzaE.zzF(Build.MODEL);
/* 2446 */                                  ij3Var2.m4568p().m4240B();
/* 2451 */                                  zzicVarZzaE.zzE(Build.VERSION.RELEASE);
/* 2463 */                                  zzicVarZzaE.zzI((int) ij3Var2.m4568p().m6641D());
/* 2474 */                                  zzicVarZzaE.zzH(ij3Var2.m4568p().m6642E());
/* 2481 */                                  zzicVarZzaE.zzay(zzrVar.f4253h0);
/* 2488 */                                  if (ij3Var2.m4560d()) {
/* 2490 */                                      zzicVarZzaE.zzK();
/* 2498 */                                      if (!TextUtils.isEmpty(null)) {
/* 2500 */                                          zzicVarZzaE.zzam(null);
                                                }
                                            }
/* 2507 */                                  di3VarM219D0 = m6755f0().m219D0(str6);
/* 2511 */                                  if (di3VarM219D0 == null) {
/* 2517 */                                      di3VarM219D0 = new di3(ij3Var2, str6);
/* 2520 */                                      mp3Var = this;
/* 2526 */                                      di3VarM219D0.m3095F(mp3Var.m6772o(ok3VarM7190j2));
/* 2531 */                                      di3VarM219D0.m3100K(zzrVar.f4235V);
/* 2536 */                                      di3VarM219D0.m3097H(str11);
/* 2543 */                                      if (ok3VarM7190j2.m7189i(nk3Var)) {
/* 2553 */                                          di3VarM219D0.m3098I(mp3Var.f13938w.m8815E(str6, z9));
                                                }
/* 2562 */                                      di3VarM219D0.m3113e(0L);
/* 2565 */                                      di3VarM219D0.m3101L(0L);
/* 2568 */                                      di3VarM219D0.m3102M(0L);
/* 2573 */                                      di3VarM219D0.m3104O(str14);
/* 2578 */                                      di3VarM219D0.m3106Q(j2);
/* 2583 */                                      di3VarM219D0.m3107R(str13);
/* 2588 */                                      di3VarM219D0.m3108S(j6);
/* 2593 */                                      di3VarM219D0.m3109a(j8);
/* 2598 */                                      di3VarM219D0.m3112d(z10);
/* 2603 */                                      di3VarM219D0.m3111c(j4);
/* 2610 */                                      i = 0;
/* 2611 */                                      mp3Var.m6755f0().m221E0(di3VarM219D0, false);
                                            } else {
/* 2615 */                                      i = 0;
/* 2616 */                                      mp3Var = this;
                                            }
/* 2624 */                                  if (ok3VarM7190j2.m7189i(nk3.ANALYTICS_STORAGE)) {
/* 2636 */                                      String strM3094E6 = di3VarM219D0.m3094E();
/* 2640 */                                      kb1.m6061n(strM3094E6);
/* 2643 */                                      zzicVarZzaE.zzW(strM3094E6);
                                            }
/* 2654 */                                  if (!TextUtils.isEmpty(di3VarM219D0.m3099J())) {
/* 2656 */                                      String strM3099J6 = di3VarM219D0.m3099J();
/* 2660 */                                      kb1.m6061n(strM3099J6);
/* 2663 */                                      zzicVarZzaE.zzah(strM3099J6);
                                            }
/* 2670 */                                  listM267w0 = mp3Var.m6755f0().m267w0(str6);
/* 2674 */                                  i2 = i;
/* 2679 */                                  while (i2 < listM267w0.size()) {
/* 2681 */                                      zzit zzitVarZzm6 = zziu.zzm();
/* 2693 */                                      zzitVarZzm6.zzb(((rp3) listM267w0.get(i2)).f16226c);
/* 2704 */                                      zzitVarZzm6.zza(((rp3) listM267w0.get(i2)).f16227d);
/* 2719 */                                      mp3Var.m6761i0().m1684X(zzitVarZzm6, ((rp3) listM267w0.get(i2)).f16228e);
/* 2722 */                                      zzicVarZzaE.zzp(zzitVarZzm6);
/* 2739 */                                      if ("_sid".equals(((rp3) listM267w0.get(i2)).f16226c)) {
/* 2743 */                                          bj3 bj3Var16 = di3VarM219D0.f7242a.f9659i;
/* 2745 */                                          ij3.m4555l(bj3Var16);
/* 2748 */                                          bj3Var16.mo1375y();
/* 2757 */                                          if (di3VarM219D0.f7264w != 0) {
/* 2759 */                                              ci3VarM6761i0 = mp3Var.m6761i0();
/* 2767 */                                              if (TextUtils.isEmpty(str12)) {
/* 2769 */                                                  str16 = str12;
/* 2771 */                                                  jM1694k0 = 0;
                                                        } else {
/* 2780 */                                                  str16 = str12;
/* 2786 */                                                  jM1694k0 = ci3VarM6761i0.m1694k0(str16.getBytes(Charset.forName("UTF-8")));
                                                        }
/* 2792 */                                              bj3 bj3Var17 = di3VarM219D0.f7242a.f9659i;
/* 2794 */                                              ij3.m4555l(bj3Var17);
/* 2797 */                                              bj3Var17.mo1375y();
/* 2804 */                                              if (jM1694k0 != di3VarM219D0.f7264w) {
/* 2806 */                                                  zzicVarZzaE.zzav();
                                                        }
                                                    } else {
/* 2810 */                                              str16 = str12;
                                                    }
                                                } else {
/* 2810 */                                          str16 = str12;
                                                }
/* 2812 */                                      i2++;
/* 2814 */                                      str12 = str16;
                                            }
/* 2818 */                                  ae3VarM6755f2 = mp3Var.m6755f0();
/* 2827 */                                  zzid zzidVar6 = (zzid) zzicVarZzaE.zzbc();
/* 2829 */                                  ae3VarM6755f2.mo1375y();
/* 2832 */                                  ae3VarM6755f2.m9593A();
/* 2835 */                                  kb1.m6061n(zzidVar6);
/* 2842 */                                  kb1.m6058k(zzidVar6.zzA());
/* 2845 */                                  byte[] bArrZzcc11 = zzidVar6.zzcc();
/* 2855 */                                  long jM1694k6 = ae3VarM6755f2.f15676b.m6761i0().m1694k0(bArrZzcc11);
/* 2861 */                                  ContentValues contentValues7 = new ContentValues();
/* 2870 */                                  contentValues7.put("app_id", zzidVar6.zzA());
/* 2879 */                                  contentValues7.put("metadata_fingerprint", Long.valueOf(jM1694k6));
/* 2884 */                                  contentValues7.put("metadata", bArrZzcc11);
/* 2895 */                                  ae3VarM6755f2.m261q0().insertWithOnConflict("raw_events_metadata", null, contentValues7, 4);
/* 2898 */                                  ae3VarM6755f3 = mp3Var.m6755f0();
/* 2902 */                                  zzbe zzbeVar7 = oe3Var2.f14732f;
/* 2904 */                                  Objects.requireNonNull(zzbeVar7);
/* 2913 */                                  it2 = zzbeVar7.f4207a.keySet().iterator();
                                            while (true) {
/* 2921 */                                      if (it2.hasNext()) {
/* 2937 */                                          vi3 vi3VarM6754e6 = mp3Var.m6754e0();
/* 2941 */                                          String str36 = oe3Var2.f14727a;
/* 2945 */                                          zM9290P = vi3VarM6754e6.m9290P(str36, oe3Var2.f14728b);
/* 2967 */                                          ud3 ud3VarM223F5 = mp3Var.m6755f0().m223F0(false, false, false, false, str36, mp3Var.m6756g());
/* 2973 */                                          if (zM9290P) {
                                                    }
/* 2993 */                                          i3 = i;
                                                    break;
                                                }
/* 2933 */                                      if ("_r".equals(it2.next())) {
                                                }
/* 2935 */                                      i3 = 1;
                                                break;
                                            }
/* 2994 */                                  ae3VarM6755f3.mo1375y();
/* 2997 */                                  ae3VarM6755f3.m9593A();
/* 3000 */                                  str15 = oe3Var2.f14727a;
/* 3002 */                                  kb1.m6058k(str15);
/* 3015 */                                  byte[] bArrZzcc12 = ae3VarM6755f3.f15676b.m6761i0().m1688b0(oe3Var2).zzcc();
/* 3021 */                                  contentValues = new ContentValues();
/* 3024 */                                  contentValues.put("app_id", str15);
/* 3031 */                                  contentValues.put("name", oe3Var2.f14728b);
/* 3042 */                                  contentValues.put("timestamp", Long.valueOf(oe3Var2.f14730d));
/* 3049 */                                  contentValues.put("metadata_fingerprint", Long.valueOf(jM1694k6));
/* 3054 */                                  contentValues.put(SharedDataContentProvider.BASE_PATH, bArrZzcc12);
/* 3063 */                                  contentValues.put("realtime", Integer.valueOf(i3));
/* 3081 */                                  if (ae3VarM6755f3.m261q0().insert("raw_events", null, contentValues) == -1) {
/* 3101 */                                      ((ij3) ae3VarM6755f3.f16749a).mo4557a().m9016D().m8511b(uh3.m9013H(str15), "Failed to insert raw event (got -1). appId");
                                            } else {
/* 3109 */                                      mp3Var.f13908Z = 0L;
                                            }
/* 3190 */                                  mp3Var.m6755f0().m259o0();
/* 3197 */                                  mp3Var.m6755f0().m260p0();
/* 3200 */                                  mp3Var.m6739L();
/* 3231 */                                  mp3Var.mo4557a().m9019G().m8511b(Long.valueOf(((System.nanoTime() - jNanoTime) + 500000) / 1000000), "Background event processing time, ms");
/* 3234 */                                  return;
/* 3239 */                                  mp3Var.m6755f0().m260p0();
/* 3242 */                                  throw th;
                                        }
/* 1007 */                              if (jIntValue % 1000 == 1) {
/* 1029 */                                  mo4557a().m9016D().m8512c(uh3.m9013H(str5), "Data loss. Too many events logged. appId, count", Long.valueOf(ud3VarM225G0.f17478b));
                                        }
/* 1036 */                              m6755f0().m259o0();
/* 1589 */                              m6755f0().m260p0();
                                    }
/* 766 */                           ae3VarM6755f0.m261q0().execSQL("delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '!_ltv!_%' escape '!'order by set_timestamp desc limit ?,10);", new String[]{str22, str22, String.valueOf(iM7404H)});
                                } catch (SQLiteException e6) {
/* 789 */                           ((ij3) ae3VarM6755f0.f16749a).mo4557a().m9016D().m8512c(uh3.m9013H(str22), "Error pruning currencies. appId", e6);
                                }
/* 727 */                       ae3VarM6755f0 = m6755f0();
/* 741 */                       iM7404H = m6753d0().m7404H(str22, vg3.f18101T) - 1;
/* 743 */                       kb1.m6058k(str22);
/* 746 */                       ae3VarM6755f0.mo1375y();
/* 749 */                       ae3VarM6755f0.m9593A();
/* 794 */                       String str37 = zzbgVarM9580c.f4210c;
/* 802 */                       ((xt0) mo4562f()).getClass();
/* 815 */                       str4 = str22;
/* 817 */                       rp3Var = new rp3(str4, str37, strConcat, System.currentTimeMillis(), Long.valueOf(jRound));
/* 724 */                       rp3Var2 = rp3Var;
/* 829 */                       if (!m6755f0().m265u0(rp3Var2)) {
/* 857 */                           mo4557a().m9016D().m8513d("Too many unique user properties are set. Ignoring user property. appId", uh3.m9013H(str4), ij3Var2.m4565m().m6658c(rp3Var2.f16226c), rp3Var2.f16228e);
/* 860 */                           m6763j0();
/* 873 */                           up3.m9062P(ac3Var3, str4, 9, null, null, 0);
/* 876 */                           ac3Var = ac3Var3;
                                }
/* 883 */                       zM9074x0 = up3.m9074x0(str26);
/* 887 */                       zEquals = "_err".equals(str26);
/* 891 */                       m6763j0();
/* 894 */                       if (zzbeVar == null) {
/* 896 */                           length = 0;
                                } else {
/* 907 */                           it = zzbeVar.f4207a.keySet().iterator();
/* 911 */                           length = 0;
/* 917 */                           while (it.hasNext()) {
/* 925 */                               objM2164D1 = zzbeVar.m2164D1(it.next());
/* 931 */                               if (objM2164D1 instanceof Parcelable[]) {
/* 939 */                                   length += (long) ((Parcelable[]) objM2164D1).length;
                                        }
                                    }
                                }
/* 952 */                       str5 = str4;
/* 968 */                       ud3VarM225G0 = m6755f0().m225G0(m6756g(), str5, length + 1, true, zM9074x0, false, zEquals, false, false, false);
/* 976 */                       long j14 = ud3VarM225G0.f17478b;
/* 978 */                       m6753d0();
/* 997 */                       jIntValue = j14 - ((long) ((Integer) vg3.f18147l.m9011a(null)).intValue());
/* 1002 */                      if (jIntValue <= 0) {
/* 1041 */                          if (zM9074x0) {
/* 1043 */                              long j15 = ud3VarM225G0.f17477a;
/* 1045 */                              m6753d0();
/* 1064 */                              jIntValue2 = j15 - ((long) ((Integer) vg3.f18151n.m9011a(null)).intValue());
/* 1067 */                              if (jIntValue2 > 0) {
/* 1073 */                                  if (jIntValue2 % 1000 == 1) {
/* 1095 */                                      mo4557a().m9016D().m8512c(uh3.m9013H(str5), "Data loss. Too many public events logged. appId, count", Long.valueOf(ud3VarM225G0.f17477a));
                                            }
/* 1098 */                                  m6763j0();
/* 1113 */                                  up3.m9062P(ac3Var, str5, 16, "_ev", zzbgVarM9580c.f4208a, 0);
/* 1120 */                                  m6755f0().m259o0();
                                        }
                                    }
/* 1125 */                          str6 = str5;
/* 1127 */                          if (zEquals) {
/* 1154 */                              jMax = ud3VarM225G0.f17480d - ((long) Math.max(0, Math.min(1000000, m6753d0().m7404H(str6, vg3.f18149m))));
/* 1157 */                              if (jMax > 0) {
/* 1161 */                                  if (jMax == 1) {
/* 1183 */                                      mo4557a().m9016D().m8512c(uh3.m9013H(str6), "Too many error events logged. appId, count", Long.valueOf(ud3VarM225G0.f17480d));
                                            }
/* 1190 */                                  m6755f0().m259o0();
                                        }
                                    }
/* 1195 */                          bundleM2167G1 = zzbeVar.m2167G1();
/* 1199 */                          up3 up3VarM6763j3 = m6763j0();
/* 1205 */                          String str213 = zzbgVarM9580c.f4210c;
/* 1207 */                          up3VarM6763j3.m9094O(str213, "_o", bundleM2167G1);
/* 1222 */                          if (m6763j0().m9098Z(str6, zzrVar.f4259m0)) {
/* 1234 */                              m6763j0().m9094O(1L, "_dbg", bundleM2167G1);
/* 1241 */                              m6763j0().m9094O(1L, "_r", bundleM2167G1);
                                    }
/* 1250 */                          if ("_s".equals(str26)) {
/* 1262 */                              obj2 = rp3VarM266v0.f16228e;
/* 1266 */                              if (obj2 instanceof Long) {
/* 1272 */                                  m6763j0().m9094O(obj2, "_sno", bundleM2167G1);
                                        }
                                    }
/* 1286 */                          if (m6753d0().m7406J(null, vg3.f18110X0)) {
/* 1304 */                              obj = bundleM2167G1.get(FirebaseAnalytics.Param.VALUE);
/* 1310 */                              if (obj instanceof String) {
/* 1314 */                                  double d3 = Double.parseDouble((String) obj);
/* 1318 */                                  bundleM2167G1.remove(FirebaseAnalytics.Param.VALUE);
/* 1321 */                                  bundleM2167G1.putDouble(FirebaseAnalytics.Param.VALUE, d3);
                                        }
                                    }
/* 1324 */                          ae3VarM6755f1 = m6755f0();
/* 1328 */                          kb1.m6058k(str6);
/* 1331 */                          ae3VarM6755f1.mo1375y();
/* 1334 */                          ae3VarM6755f1.m9593A();
/* 1375 */                          jDelete = ae3VarM6755f1.m261q0().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str6, String.valueOf(Math.max(0, Math.min(1000000, ((ij3) ae3VarM6755f1.f16749a).f9651d.m7404H(str6, vg3.f18157q))))});
/* 1407 */                          if (jDelete > 0) {
/* 1427 */                              mo4557a().m9017E().m8512c(uh3.m9013H(str6), "Data lost. Too many events stored on disk, deleted. appId", Long.valueOf(jDelete));
                                    }
/* 1432 */                          ij3Var = this.f13905W;
/* 1454 */                          oe3Var = new oe3(ij3Var, zzbgVarM9580c.f4210c, str6, zzbgVarM9580c.f4208a, zzbgVarM9580c.f4211d, 0L, bundleM2167G1);
/* 1461 */                          ae3 ae3VarM6755f6 = m6755f0();
/* 1465 */                          str7 = oe3Var.f14728b;
/* 1467 */                          String str214 = str17;
/* 1469 */                          pe3VarM246Z = ae3VarM6755f6.m246Z(str214, str6, str7);
/* 1473 */                          if (pe3VarM246Z == null) {
/* 1479 */                              jM238R = m6755f0().m238R(str6);
/* 1483 */                              pd3VarM6753d0 = m6753d0();
/* 1487 */                              pd3VarM6753d0.getClass();
/* 1490 */                              ug3Var = vg3.f18107W;
/* 1508 */                              ac3Var2 = ac3Var;
/* 1513 */                              if (jM238R >= Math.max(Math.min(pd3VarM6753d0.m7404H(str6, ug3Var), 2000), 500)) {
                                        }
/* 1595 */                              ac3Var = ac3Var2;
/* 1621 */                              pe3VarM7412a = new pe3(str6, str7, 0L, 0L, 0L, oe3Var.f14730d, 0L, null, null, null, null);
/* 1624 */                              str6 = str6;
                                    } else {
/* 1632 */                              oe3Var = oe3Var.m7140a(ij3Var, pe3VarM246Z.f15085f);
/* 1638 */                              pe3VarM7412a = pe3VarM246Z.m7412a(oe3Var.f14730d);
                                    }
/* 1626 */                          oe3Var2 = oe3Var;
/* 1647 */                          m6755f0().m247a0(str214, pe3VarM7412a);
/* 1654 */                          mo4558b().mo1375y();
/* 1657 */                          m6765k0();
/* 1660 */                          String str215 = oe3Var2.f14727a;
/* 1662 */                          kb1.m6058k(str215);
/* 1669 */                          kb1.m6054g(str215.equals(str6));
/* 1672 */                          zzicVarZzaE = zzid.zzaE();
/* 1677 */                          zzicVarZzaE.zza(1);
/* 1682 */                          zzicVarZzaE.zzC("android");
/* 1689 */                          if (!TextUtils.isEmpty(str6)) {
/* 1691 */                              zzicVarZzaE.zzL(str6);
                                    }
/* 1698 */                          if (TextUtils.isEmpty(str3)) {
/* 1700 */                              str8 = str3;
/* 1702 */                              zzicVarZzaE.zzJ(str8);
                                    } else {
/* 1706 */                              str8 = str3;
                                    }
/* 1712 */                          if (TextUtils.isEmpty(str2)) {
/* 1714 */                              str9 = str2;
/* 1716 */                              zzicVarZzaE.zzM(str9);
                                    } else {
/* 1720 */                              str9 = str2;
                                    }
/* 1726 */                          if (TextUtils.isEmpty(str)) {
/* 1728 */                              str10 = str;
/* 1730 */                              zzicVarZzaE.zzau(str10);
                                    } else {
/* 1734 */                              str10 = str;
                                    }
/* 1741 */                          if (j7 != -2147483648L) {
/* 1743 */                              j = j7;
/* 1746 */                              zzicVarZzaE.zzaj((int) j);
                                    } else {
/* 1753 */                              j = j7;
                                    }
/* 1756 */                          zzicVarZzaE.zzN(j6);
/* 1763 */                          if (TextUtils.isEmpty(str23)) {
/* 1767 */                              str11 = str23;
/* 1769 */                              zzicVarZzaE.zzad(str11);
                                    } else {
/* 1775 */                              str11 = str23;
                                    }
/* 1777 */                          kb1.m6061n(str6);
/* 1786 */                          str12 = str10;
/* 1796 */                          ok3VarM7190j = m6752d(str6).m7190j(ok3.m7182c(100, str18));
/* 1804 */                          zzicVarZzaE.zzat(ok3VarM7190j.m7187f());
/* 1807 */                          zzql.zza();
/* 1816 */                          zM7406J = m6753d0().m7406J(str6, vg3.f18094P0);
/* 1820 */                          nk3Var = nk3.AD_STORAGE;
/* 1822 */                          if (zM7406J) {
/* 1824 */                              m6763j0();
/* 1831 */                              if (up3.m9066V(str6)) {
/* 1835 */                                  zzicVarZzaE.zzaH(zzrVar.f4257k0);
/* 1838 */                                  j2 = j;
/* 1840 */                                  j3 = zzrVar.f4258l0;
/* 1848 */                                  if (!ok3VarM7190j.m7189i(nk3Var)) {
/* 1858 */                                      j3 = (j3 & (-2)) | 32;
                                            }
/* 1862 */                                  if (j3 == 1) {
/* 1864 */                                      z = true;
                                            } else {
/* 1866 */                                      z = false;
                                            }
/* 1867 */                                  zzicVarZzaE.zzaz(z);
/* 1872 */                                  if (j3 != 0) {
/* 1876 */                                      zzhd zzhdVarZzh3 = zzhe.zzh();
/* 1884 */                                      if ((j3 & 1) != 0) {
/* 1886 */                                          z2 = true;
                                                } else {
/* 1888 */                                          z2 = false;
                                                }
/* 1889 */                                      zzhdVarZzh3.zza(z2);
/* 1898 */                                      if ((j3 & 2) != 0) {
/* 1900 */                                          z3 = true;
                                                } else {
/* 1902 */                                          z3 = false;
                                                }
/* 1903 */                                      zzhdVarZzh3.zzb(z3);
/* 1912 */                                      if ((j3 & 4) != 0) {
/* 1914 */                                          z4 = true;
                                                } else {
/* 1916 */                                          z4 = false;
                                                }
/* 1917 */                                      zzhdVarZzh3.zzc(z4);
/* 1926 */                                      if ((j3 & 8) != 0) {
/* 1928 */                                          z5 = true;
                                                } else {
/* 1930 */                                          z5 = false;
                                                }
/* 1931 */                                      zzhdVarZzh3.zzd(z5);
/* 1940 */                                      if ((j3 & 16) != 0) {
/* 1942 */                                          z6 = true;
                                                } else {
/* 1944 */                                          z6 = false;
                                                }
/* 1945 */                                      zzhdVarZzh3.zze(z6);
/* 1952 */                                      if ((j3 & 32) != 0) {
/* 1954 */                                          z7 = true;
                                                } else {
/* 1956 */                                          z7 = false;
                                                }
/* 1957 */                                      zzhdVarZzh3.zzf(z7);
/* 1966 */                                      if ((j3 & 64) != 0) {
/* 1968 */                                          z8 = true;
                                                } else {
/* 1970 */                                          z8 = false;
                                                }
/* 1971 */                                      zzhdVarZzh3.zzg(z8);
/* 1980 */                                      zzicVarZzaE.zzaI((zzhe) zzhdVarZzh3.zzbc());
                                            }
                                        } else {
/* 1984 */                                  j2 = j;
                                        }
                                    } else {
/* 1984 */                              j2 = j;
                                    }
/* 1988 */                          if (j8 != 0) {
/* 1992 */                              zzicVarZzaE.zzY(j8);
/* 1995 */                              j8 = j8;
                                    }
/* 1999 */                          zzicVarZzaE.zzar(j4);
/* 2002 */                          ci3 ci3VarM6761i3 = m6761i0();
/* 2028 */                          zzjqVarZza = zzjq.zza(ci3VarM6761i3.f15676b.f13905W.mo4561e().getContentResolver(), zzka.zza("com.google.android.gms.measurement"), vc0.f17978b);
/* 2032 */                          if (zzjqVarZza == null) {
/* 2034 */                              mapZzb = Collections.EMPTY_MAP;
                                    } else {
/* 2037 */                              mapZzb = zzjqVarZza.zzb();
                                    }
/* 2041 */                          if (mapZzb == null) {
/* 2049 */                              str13 = str8;
/* 2051 */                              str14 = str9;
/* 2053 */                              arrayList = null;
                                    } else {
/* 2049 */                              str13 = str8;
/* 2051 */                              str14 = str9;
/* 2053 */                              arrayList = null;
                                    }
/* 2202 */                          if (arrayList != null) {
/* 2204 */                              zzicVarZzaE.zzaq(arrayList);
                                    }
/* 2220 */                          if (m6753d0().m7406J(null, vg3.f18120b1)) {
/* 2222 */                              zzicVarZzaE.zzaP(HttpUrl.FRAGMENT_ENCODE_SET);
                                    }
/* 2235 */                          ok3VarM7190j2 = m6752d(str6).m7190j(ok3.m7182c(100, str18));
/* 2243 */                          if (ok3VarM7190j2.m7189i(nk3Var)) {
/* 2428 */                              str11 = str11;
/* 2434 */                              ij3Var2.m4568p().m4240B();
/* 2439 */                              zzicVarZzaE.zzF(Build.MODEL);
/* 2446 */                              ij3Var2.m4568p().m4240B();
/* 2451 */                              zzicVarZzaE.zzE(Build.VERSION.RELEASE);
/* 2463 */                              zzicVarZzaE.zzI((int) ij3Var2.m4568p().m6641D());
/* 2474 */                              zzicVarZzaE.zzH(ij3Var2.m4568p().m6642E());
/* 2481 */                              zzicVarZzaE.zzay(zzrVar.f4253h0);
/* 2488 */                              if (ij3Var2.m4560d()) {
/* 2490 */                                  zzicVarZzaE.zzK();
/* 2498 */                                  if (!TextUtils.isEmpty(null)) {
/* 2500 */                                      zzicVarZzaE.zzam(null);
                                            }
                                        }
/* 2507 */                              di3VarM219D0 = m6755f0().m219D0(str6);
/* 2511 */                              if (di3VarM219D0 == null) {
/* 2517 */                                  di3VarM219D0 = new di3(ij3Var2, str6);
/* 2520 */                                  mp3Var = this;
/* 2526 */                                  di3VarM219D0.m3095F(mp3Var.m6772o(ok3VarM7190j2));
/* 2531 */                                  di3VarM219D0.m3100K(zzrVar.f4235V);
/* 2536 */                                  di3VarM219D0.m3097H(str11);
/* 2543 */                                  if (ok3VarM7190j2.m7189i(nk3Var)) {
/* 2553 */                                      di3VarM219D0.m3098I(mp3Var.f13938w.m8815E(str6, z9));
                                            }
/* 2562 */                                  di3VarM219D0.m3113e(0L);
/* 2565 */                                  di3VarM219D0.m3101L(0L);
/* 2568 */                                  di3VarM219D0.m3102M(0L);
/* 2573 */                                  di3VarM219D0.m3104O(str14);
/* 2578 */                                  di3VarM219D0.m3106Q(j2);
/* 2583 */                                  di3VarM219D0.m3107R(str13);
/* 2588 */                                  di3VarM219D0.m3108S(j6);
/* 2593 */                                  di3VarM219D0.m3109a(j8);
/* 2598 */                                  di3VarM219D0.m3112d(z10);
/* 2603 */                                  di3VarM219D0.m3111c(j4);
/* 2610 */                                  i = 0;
/* 2611 */                                  mp3Var.m6755f0().m221E0(di3VarM219D0, false);
                                        } else {
/* 2615 */                                  i = 0;
/* 2616 */                                  mp3Var = this;
                                        }
/* 2624 */                              if (ok3VarM7190j2.m7189i(nk3.ANALYTICS_STORAGE)) {
/* 2636 */                                  String strM3094E7 = di3VarM219D0.m3094E();
/* 2640 */                                  kb1.m6061n(strM3094E7);
/* 2643 */                                  zzicVarZzaE.zzW(strM3094E7);
                                        }
/* 2654 */                              if (!TextUtils.isEmpty(di3VarM219D0.m3099J())) {
/* 2656 */                                  String strM3099J7 = di3VarM219D0.m3099J();
/* 2660 */                                  kb1.m6061n(strM3099J7);
/* 2663 */                                  zzicVarZzaE.zzah(strM3099J7);
                                        }
/* 2670 */                              listM267w0 = mp3Var.m6755f0().m267w0(str6);
/* 2674 */                              i2 = i;
/* 2679 */                              while (i2 < listM267w0.size()) {
/* 2681 */                                  zzit zzitVarZzm7 = zziu.zzm();
/* 2693 */                                  zzitVarZzm7.zzb(((rp3) listM267w0.get(i2)).f16226c);
/* 2704 */                                  zzitVarZzm7.zza(((rp3) listM267w0.get(i2)).f16227d);
/* 2719 */                                  mp3Var.m6761i0().m1684X(zzitVarZzm7, ((rp3) listM267w0.get(i2)).f16228e);
/* 2722 */                                  zzicVarZzaE.zzp(zzitVarZzm7);
/* 2739 */                                  if ("_sid".equals(((rp3) listM267w0.get(i2)).f16226c)) {
/* 2743 */                                      bj3 bj3Var18 = di3VarM219D0.f7242a.f9659i;
/* 2745 */                                      ij3.m4555l(bj3Var18);
/* 2748 */                                      bj3Var18.mo1375y();
/* 2757 */                                      if (di3VarM219D0.f7264w != 0) {
/* 2759 */                                          ci3VarM6761i0 = mp3Var.m6761i0();
/* 2767 */                                          if (TextUtils.isEmpty(str12)) {
/* 2769 */                                              str16 = str12;
/* 2771 */                                              jM1694k0 = 0;
                                                    } else {
/* 2780 */                                              str16 = str12;
/* 2786 */                                              jM1694k0 = ci3VarM6761i0.m1694k0(str16.getBytes(Charset.forName("UTF-8")));
                                                    }
/* 2792 */                                          bj3 bj3Var19 = di3VarM219D0.f7242a.f9659i;
/* 2794 */                                          ij3.m4555l(bj3Var19);
/* 2797 */                                          bj3Var19.mo1375y();
/* 2804 */                                          if (jM1694k0 != di3VarM219D0.f7264w) {
/* 2806 */                                              zzicVarZzaE.zzav();
                                                    }
                                                } else {
/* 2810 */                                          str16 = str12;
                                                }
                                            } else {
/* 2810 */                                      str16 = str12;
                                            }
/* 2812 */                                  i2++;
/* 2814 */                                  str12 = str16;
                                        }
/* 2818 */                              ae3VarM6755f2 = mp3Var.m6755f0();
/* 2827 */                              zzid zzidVar7 = (zzid) zzicVarZzaE.zzbc();
/* 2829 */                              ae3VarM6755f2.mo1375y();
/* 2832 */                              ae3VarM6755f2.m9593A();
/* 2835 */                              kb1.m6061n(zzidVar7);
/* 2842 */                              kb1.m6058k(zzidVar7.zzA());
/* 2845 */                              byte[] bArrZzcc13 = zzidVar7.zzcc();
/* 2855 */                              long jM1694k7 = ae3VarM6755f2.f15676b.m6761i0().m1694k0(bArrZzcc13);
/* 2861 */                              ContentValues contentValues8 = new ContentValues();
/* 2870 */                              contentValues8.put("app_id", zzidVar7.zzA());
/* 2879 */                              contentValues8.put("metadata_fingerprint", Long.valueOf(jM1694k7));
/* 2884 */                              contentValues8.put("metadata", bArrZzcc13);
/* 2895 */                              ae3VarM6755f2.m261q0().insertWithOnConflict("raw_events_metadata", null, contentValues8, 4);
/* 2898 */                              ae3VarM6755f3 = mp3Var.m6755f0();
/* 2902 */                              zzbe zzbeVar8 = oe3Var2.f14732f;
/* 2904 */                              Objects.requireNonNull(zzbeVar8);
/* 2913 */                              it2 = zzbeVar8.f4207a.keySet().iterator();
                                        while (true) {
/* 2921 */                                  if (it2.hasNext()) {
/* 2937 */                                      vi3 vi3VarM6754e7 = mp3Var.m6754e0();
/* 2941 */                                      String str38 = oe3Var2.f14727a;
/* 2945 */                                      zM9290P = vi3VarM6754e7.m9290P(str38, oe3Var2.f14728b);
/* 2967 */                                      ud3 ud3VarM223F6 = mp3Var.m6755f0().m223F0(false, false, false, false, str38, mp3Var.m6756g());
/* 2973 */                                      if (zM9290P) {
                                                }
/* 2993 */                                      i3 = i;
                                                break;
                                            }
/* 2933 */                                  if ("_r".equals(it2.next())) {
                                            }
/* 2935 */                                  i3 = 1;
                                            break;
                                        }
/* 2994 */                              ae3VarM6755f3.mo1375y();
/* 2997 */                              ae3VarM6755f3.m9593A();
/* 3000 */                              str15 = oe3Var2.f14727a;
/* 3002 */                              kb1.m6058k(str15);
/* 3015 */                              byte[] bArrZzcc14 = ae3VarM6755f3.f15676b.m6761i0().m1688b0(oe3Var2).zzcc();
/* 3021 */                              contentValues = new ContentValues();
/* 3024 */                              contentValues.put("app_id", str15);
/* 3031 */                              contentValues.put("name", oe3Var2.f14728b);
/* 3042 */                              contentValues.put("timestamp", Long.valueOf(oe3Var2.f14730d));
/* 3049 */                              contentValues.put("metadata_fingerprint", Long.valueOf(jM1694k7));
/* 3054 */                              contentValues.put(SharedDataContentProvider.BASE_PATH, bArrZzcc14);
/* 3063 */                              contentValues.put("realtime", Integer.valueOf(i3));
/* 3081 */                              if (ae3VarM6755f3.m261q0().insert("raw_events", null, contentValues) == -1) {
/* 3101 */                                  ((ij3) ae3VarM6755f3.f16749a).mo4557a().m9016D().m8511b(uh3.m9013H(str15), "Failed to insert raw event (got -1). appId");
                                        } else {
/* 3109 */                                  mp3Var.f13908Z = 0L;
                                        }
/* 3190 */                              mp3Var.m6755f0().m259o0();
/* 3197 */                              mp3Var.m6755f0().m260p0();
/* 3200 */                              mp3Var.m6739L();
/* 3231 */                              mp3Var.mo4557a().m9019G().m8511b(Long.valueOf(((System.nanoTime() - jNanoTime) + 500000) / 1000000), "Background event processing time, ms");
/* 3234 */                              return;
                                    }
/* 2428 */                          str11 = str11;
/* 2434 */                          ij3Var2.m4568p().m4240B();
/* 2439 */                          zzicVarZzaE.zzF(Build.MODEL);
/* 2446 */                          ij3Var2.m4568p().m4240B();
/* 2451 */                          zzicVarZzaE.zzE(Build.VERSION.RELEASE);
/* 2463 */                          zzicVarZzaE.zzI((int) ij3Var2.m4568p().m6641D());
/* 2474 */                          zzicVarZzaE.zzH(ij3Var2.m4568p().m6642E());
/* 2481 */                          zzicVarZzaE.zzay(zzrVar.f4253h0);
/* 2488 */                          if (ij3Var2.m4560d()) {
/* 2490 */                              zzicVarZzaE.zzK();
/* 2498 */                              if (!TextUtils.isEmpty(null)) {
/* 2500 */                                  zzicVarZzaE.zzam(null);
                                        }
                                    }
/* 2507 */                          di3VarM219D0 = m6755f0().m219D0(str6);
/* 2511 */                          if (di3VarM219D0 == null) {
/* 2517 */                              di3VarM219D0 = new di3(ij3Var2, str6);
/* 2520 */                              mp3Var = this;
/* 2526 */                              di3VarM219D0.m3095F(mp3Var.m6772o(ok3VarM7190j2));
/* 2531 */                              di3VarM219D0.m3100K(zzrVar.f4235V);
/* 2536 */                              di3VarM219D0.m3097H(str11);
/* 2543 */                              if (ok3VarM7190j2.m7189i(nk3Var)) {
/* 2553 */                                  di3VarM219D0.m3098I(mp3Var.f13938w.m8815E(str6, z9));
                                        }
/* 2562 */                              di3VarM219D0.m3113e(0L);
/* 2565 */                              di3VarM219D0.m3101L(0L);
/* 2568 */                              di3VarM219D0.m3102M(0L);
/* 2573 */                              di3VarM219D0.m3104O(str14);
/* 2578 */                              di3VarM219D0.m3106Q(j2);
/* 2583 */                              di3VarM219D0.m3107R(str13);
/* 2588 */                              di3VarM219D0.m3108S(j6);
/* 2593 */                              di3VarM219D0.m3109a(j8);
/* 2598 */                              di3VarM219D0.m3112d(z10);
/* 2603 */                              di3VarM219D0.m3111c(j4);
/* 2610 */                              i = 0;
/* 2611 */                              mp3Var.m6755f0().m221E0(di3VarM219D0, false);
                                    } else {
/* 2615 */                              i = 0;
/* 2616 */                              mp3Var = this;
                                    }
/* 2624 */                          if (ok3VarM7190j2.m7189i(nk3.ANALYTICS_STORAGE)) {
/* 2636 */                              String strM3094E8 = di3VarM219D0.m3094E();
/* 2640 */                              kb1.m6061n(strM3094E8);
/* 2643 */                              zzicVarZzaE.zzW(strM3094E8);
                                    }
/* 2654 */                          if (!TextUtils.isEmpty(di3VarM219D0.m3099J())) {
/* 2656 */                              String strM3099J8 = di3VarM219D0.m3099J();
/* 2660 */                              kb1.m6061n(strM3099J8);
/* 2663 */                              zzicVarZzaE.zzah(strM3099J8);
                                    }
/* 2670 */                          listM267w0 = mp3Var.m6755f0().m267w0(str6);
/* 2674 */                          i2 = i;
/* 2679 */                          while (i2 < listM267w0.size()) {
/* 2681 */                              zzit zzitVarZzm8 = zziu.zzm();
/* 2693 */                              zzitVarZzm8.zzb(((rp3) listM267w0.get(i2)).f16226c);
/* 2704 */                              zzitVarZzm8.zza(((rp3) listM267w0.get(i2)).f16227d);
/* 2719 */                              mp3Var.m6761i0().m1684X(zzitVarZzm8, ((rp3) listM267w0.get(i2)).f16228e);
/* 2722 */                              zzicVarZzaE.zzp(zzitVarZzm8);
/* 2739 */                              if ("_sid".equals(((rp3) listM267w0.get(i2)).f16226c)) {
/* 2743 */                                  bj3 bj3Var110 = di3VarM219D0.f7242a.f9659i;
/* 2745 */                                  ij3.m4555l(bj3Var110);
/* 2748 */                                  bj3Var110.mo1375y();
/* 2757 */                                  if (di3VarM219D0.f7264w != 0) {
/* 2759 */                                      ci3VarM6761i0 = mp3Var.m6761i0();
/* 2767 */                                      if (TextUtils.isEmpty(str12)) {
/* 2769 */                                          str16 = str12;
/* 2771 */                                          jM1694k0 = 0;
                                                } else {
/* 2780 */                                          str16 = str12;
/* 2786 */                                          jM1694k0 = ci3VarM6761i0.m1694k0(str16.getBytes(Charset.forName("UTF-8")));
                                                }
/* 2792 */                                      bj3 bj3Var111 = di3VarM219D0.f7242a.f9659i;
/* 2794 */                                      ij3.m4555l(bj3Var111);
/* 2797 */                                      bj3Var111.mo1375y();
/* 2804 */                                      if (jM1694k0 != di3VarM219D0.f7264w) {
/* 2806 */                                          zzicVarZzaE.zzav();
                                                }
                                            } else {
/* 2810 */                                      str16 = str12;
                                            }
                                        } else {
/* 2810 */                                  str16 = str12;
                                        }
/* 2812 */                              i2++;
/* 2814 */                              str12 = str16;
                                    }
/* 2818 */                          ae3VarM6755f2 = mp3Var.m6755f0();
/* 2827 */                          zzid zzidVar8 = (zzid) zzicVarZzaE.zzbc();
/* 2829 */                          ae3VarM6755f2.mo1375y();
/* 2832 */                          ae3VarM6755f2.m9593A();
/* 2835 */                          kb1.m6061n(zzidVar8);
/* 2842 */                          kb1.m6058k(zzidVar8.zzA());
/* 2845 */                          byte[] bArrZzcc15 = zzidVar8.zzcc();
/* 2855 */                          long jM1694k8 = ae3VarM6755f2.f15676b.m6761i0().m1694k0(bArrZzcc15);
/* 2861 */                          ContentValues contentValues9 = new ContentValues();
/* 2870 */                          contentValues9.put("app_id", zzidVar8.zzA());
/* 2879 */                          contentValues9.put("metadata_fingerprint", Long.valueOf(jM1694k8));
/* 2884 */                          contentValues9.put("metadata", bArrZzcc15);
/* 2895 */                          ae3VarM6755f2.m261q0().insertWithOnConflict("raw_events_metadata", null, contentValues9, 4);
/* 2898 */                          ae3VarM6755f3 = mp3Var.m6755f0();
/* 2902 */                          zzbe zzbeVar9 = oe3Var2.f14732f;
/* 2904 */                          Objects.requireNonNull(zzbeVar9);
/* 2913 */                          it2 = zzbeVar9.f4207a.keySet().iterator();
                                    while (true) {
/* 2921 */                              if (it2.hasNext()) {
/* 2937 */                                  vi3 vi3VarM6754e8 = mp3Var.m6754e0();
/* 2941 */                                  String str39 = oe3Var2.f14727a;
/* 2945 */                                  zM9290P = vi3VarM6754e8.m9290P(str39, oe3Var2.f14728b);
/* 2967 */                                  ud3 ud3VarM223F7 = mp3Var.m6755f0().m223F0(false, false, false, false, str39, mp3Var.m6756g());
/* 2973 */                                  if (zM9290P) {
                                            }
/* 2993 */                                  i3 = i;
                                            break;
                                        }
/* 2933 */                              if ("_r".equals(it2.next())) {
                                        }
/* 2935 */                              i3 = 1;
                                        break;
                                    }
/* 2994 */                          ae3VarM6755f3.mo1375y();
/* 2997 */                          ae3VarM6755f3.m9593A();
/* 3000 */                          str15 = oe3Var2.f14727a;
/* 3002 */                          kb1.m6058k(str15);
/* 3015 */                          byte[] bArrZzcc16 = ae3VarM6755f3.f15676b.m6761i0().m1688b0(oe3Var2).zzcc();
/* 3021 */                          contentValues = new ContentValues();
/* 3024 */                          contentValues.put("app_id", str15);
/* 3031 */                          contentValues.put("name", oe3Var2.f14728b);
/* 3042 */                          contentValues.put("timestamp", Long.valueOf(oe3Var2.f14730d));
/* 3049 */                          contentValues.put("metadata_fingerprint", Long.valueOf(jM1694k8));
/* 3054 */                          contentValues.put(SharedDataContentProvider.BASE_PATH, bArrZzcc16);
/* 3063 */                          contentValues.put("realtime", Integer.valueOf(i3));
/* 3081 */                          if (ae3VarM6755f3.m261q0().insert("raw_events", null, contentValues) == -1) {
/* 3101 */                              ((ij3) ae3VarM6755f3.f16749a).mo4557a().m9016D().m8511b(uh3.m9013H(str15), "Failed to insert raw event (got -1). appId");
                                    } else {
/* 3109 */                              mp3Var.f13908Z = 0L;
                                    }
/* 3190 */                          mp3Var.m6755f0().m259o0();
/* 3197 */                          mp3Var.m6755f0().m260p0();
/* 3200 */                          mp3Var.m6739L();
/* 3231 */                          mp3Var.mo4557a().m9019G().m8511b(Long.valueOf(((System.nanoTime() - jNanoTime) + 500000) / 1000000), "Background event processing time, ms");
/* 3234 */                          return;
/* 3239 */                          mp3Var.m6755f0().m260p0();
/* 3242 */                          throw th;
                                }
/* 1007 */                      if (jIntValue % 1000 == 1) {
/* 1029 */                          mo4557a().m9016D().m8512c(uh3.m9013H(str5), "Data loss. Too many events logged. appId, count", Long.valueOf(ud3VarM225G0.f17478b));
                                }
/* 1036 */                      m6755f0().m259o0();
/* 1589 */                      m6755f0().m260p0();
                            }
/* 526 */                   ac3Var = ac3Var3;
/* 883 */                   zM9074x0 = up3.m9074x0(str26);
/* 887 */                   zEquals = "_err".equals(str26);
/* 891 */                   m6763j0();
/* 894 */                   if (zzbeVar == null) {
/* 896 */                       length = 0;
                            } else {
/* 907 */                       it = zzbeVar.f4207a.keySet().iterator();
/* 911 */                       length = 0;
/* 917 */                       while (it.hasNext()) {
/* 925 */                           objM2164D1 = zzbeVar.m2164D1(it.next());
/* 931 */                           if (objM2164D1 instanceof Parcelable[]) {
/* 939 */                               length += (long) ((Parcelable[]) objM2164D1).length;
                                    }
                                }
                            }
/* 952 */                   str5 = str4;
/* 968 */                   ud3VarM225G0 = m6755f0().m225G0(m6756g(), str5, length + 1, true, zM9074x0, false, zEquals, false, false, false);
/* 976 */                   long j16 = ud3VarM225G0.f17478b;
/* 978 */                   m6753d0();
/* 997 */                   jIntValue = j16 - ((long) ((Integer) vg3.f18147l.m9011a(null)).intValue());
/* 1002 */                  if (jIntValue <= 0) {
/* 1041 */                      if (zM9074x0) {
/* 1043 */                          long j17 = ud3VarM225G0.f17477a;
/* 1045 */                          m6753d0();
/* 1064 */                          jIntValue2 = j17 - ((long) ((Integer) vg3.f18151n.m9011a(null)).intValue());
/* 1067 */                          if (jIntValue2 > 0) {
/* 1073 */                              if (jIntValue2 % 1000 == 1) {
/* 1095 */                                  mo4557a().m9016D().m8512c(uh3.m9013H(str5), "Data loss. Too many public events logged. appId, count", Long.valueOf(ud3VarM225G0.f17477a));
                                        }
/* 1098 */                              m6763j0();
/* 1113 */                              up3.m9062P(ac3Var, str5, 16, "_ev", zzbgVarM9580c.f4208a, 0);
/* 1120 */                              m6755f0().m259o0();
                                    }
                                }
/* 1125 */                      str6 = str5;
/* 1127 */                      if (zEquals) {
/* 1154 */                          jMax = ud3VarM225G0.f17480d - ((long) Math.max(0, Math.min(1000000, m6753d0().m7404H(str6, vg3.f18149m))));
/* 1157 */                          if (jMax > 0) {
/* 1161 */                              if (jMax == 1) {
/* 1183 */                                  mo4557a().m9016D().m8512c(uh3.m9013H(str6), "Too many error events logged. appId, count", Long.valueOf(ud3VarM225G0.f17480d));
                                        }
/* 1190 */                              m6755f0().m259o0();
                                    }
                                }
/* 1195 */                      bundleM2167G1 = zzbeVar.m2167G1();
/* 1199 */                      up3 up3VarM6763j4 = m6763j0();
/* 1205 */                      String str216 = zzbgVarM9580c.f4210c;
/* 1207 */                      up3VarM6763j4.m9094O(str216, "_o", bundleM2167G1);
/* 1222 */                      if (m6763j0().m9098Z(str6, zzrVar.f4259m0)) {
/* 1234 */                          m6763j0().m9094O(1L, "_dbg", bundleM2167G1);
/* 1241 */                          m6763j0().m9094O(1L, "_r", bundleM2167G1);
                                }
/* 1250 */                      if ("_s".equals(str26)) {
/* 1262 */                          obj2 = rp3VarM266v0.f16228e;
/* 1266 */                          if (obj2 instanceof Long) {
/* 1272 */                              m6763j0().m9094O(obj2, "_sno", bundleM2167G1);
                                    }
                                }
/* 1286 */                      if (m6753d0().m7406J(null, vg3.f18110X0)) {
/* 1304 */                          obj = bundleM2167G1.get(FirebaseAnalytics.Param.VALUE);
/* 1310 */                          if (obj instanceof String) {
/* 1314 */                              double d4 = Double.parseDouble((String) obj);
/* 1318 */                              bundleM2167G1.remove(FirebaseAnalytics.Param.VALUE);
/* 1321 */                              bundleM2167G1.putDouble(FirebaseAnalytics.Param.VALUE, d4);
                                    }
                                }
/* 1324 */                      ae3VarM6755f1 = m6755f0();
/* 1328 */                      kb1.m6058k(str6);
/* 1331 */                      ae3VarM6755f1.mo1375y();
/* 1334 */                      ae3VarM6755f1.m9593A();
/* 1375 */                      jDelete = ae3VarM6755f1.m261q0().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str6, String.valueOf(Math.max(0, Math.min(1000000, ((ij3) ae3VarM6755f1.f16749a).f9651d.m7404H(str6, vg3.f18157q))))});
/* 1407 */                      if (jDelete > 0) {
/* 1427 */                          mo4557a().m9017E().m8512c(uh3.m9013H(str6), "Data lost. Too many events stored on disk, deleted. appId", Long.valueOf(jDelete));
                                }
/* 1432 */                      ij3Var = this.f13905W;
/* 1454 */                      oe3Var = new oe3(ij3Var, zzbgVarM9580c.f4210c, str6, zzbgVarM9580c.f4208a, zzbgVarM9580c.f4211d, 0L, bundleM2167G1);
/* 1461 */                      ae3 ae3VarM6755f7 = m6755f0();
/* 1465 */                      str7 = oe3Var.f14728b;
/* 1467 */                      String str217 = str17;
/* 1469 */                      pe3VarM246Z = ae3VarM6755f7.m246Z(str217, str6, str7);
/* 1473 */                      if (pe3VarM246Z == null) {
/* 1479 */                          jM238R = m6755f0().m238R(str6);
/* 1483 */                          pd3VarM6753d0 = m6753d0();
/* 1487 */                          pd3VarM6753d0.getClass();
/* 1490 */                          ug3Var = vg3.f18107W;
/* 1508 */                          ac3Var2 = ac3Var;
/* 1513 */                          if (jM238R >= Math.max(Math.min(pd3VarM6753d0.m7404H(str6, ug3Var), 2000), 500)) {
                                    }
/* 1595 */                          ac3Var = ac3Var2;
/* 1621 */                          pe3VarM7412a = new pe3(str6, str7, 0L, 0L, 0L, oe3Var.f14730d, 0L, null, null, null, null);
/* 1624 */                          str6 = str6;
                                } else {
/* 1632 */                          oe3Var = oe3Var.m7140a(ij3Var, pe3VarM246Z.f15085f);
/* 1638 */                          pe3VarM7412a = pe3VarM246Z.m7412a(oe3Var.f14730d);
                                }
/* 1626 */                      oe3Var2 = oe3Var;
/* 1647 */                      m6755f0().m247a0(str217, pe3VarM7412a);
/* 1654 */                      mo4558b().mo1375y();
/* 1657 */                      m6765k0();
/* 1660 */                      String str218 = oe3Var2.f14727a;
/* 1662 */                      kb1.m6058k(str218);
/* 1669 */                      kb1.m6054g(str218.equals(str6));
/* 1672 */                      zzicVarZzaE = zzid.zzaE();
/* 1677 */                      zzicVarZzaE.zza(1);
/* 1682 */                      zzicVarZzaE.zzC("android");
/* 1689 */                      if (!TextUtils.isEmpty(str6)) {
/* 1691 */                          zzicVarZzaE.zzL(str6);
                                }
/* 1698 */                      if (TextUtils.isEmpty(str3)) {
/* 1700 */                          str8 = str3;
/* 1702 */                          zzicVarZzaE.zzJ(str8);
                                } else {
/* 1706 */                          str8 = str3;
                                }
/* 1712 */                      if (TextUtils.isEmpty(str2)) {
/* 1714 */                          str9 = str2;
/* 1716 */                          zzicVarZzaE.zzM(str9);
                                } else {
/* 1720 */                          str9 = str2;
                                }
/* 1726 */                      if (TextUtils.isEmpty(str)) {
/* 1728 */                          str10 = str;
/* 1730 */                          zzicVarZzaE.zzau(str10);
                                } else {
/* 1734 */                          str10 = str;
                                }
/* 1741 */                      if (j7 != -2147483648L) {
/* 1743 */                          j = j7;
/* 1746 */                          zzicVarZzaE.zzaj((int) j);
                                } else {
/* 1753 */                          j = j7;
                                }
/* 1756 */                      zzicVarZzaE.zzN(j6);
/* 1763 */                      if (TextUtils.isEmpty(str23)) {
/* 1767 */                          str11 = str23;
/* 1769 */                          zzicVarZzaE.zzad(str11);
                                } else {
/* 1775 */                          str11 = str23;
                                }
/* 1777 */                      kb1.m6061n(str6);
/* 1786 */                      str12 = str10;
/* 1796 */                      ok3VarM7190j = m6752d(str6).m7190j(ok3.m7182c(100, str18));
/* 1804 */                      zzicVarZzaE.zzat(ok3VarM7190j.m7187f());
/* 1807 */                      zzql.zza();
/* 1816 */                      zM7406J = m6753d0().m7406J(str6, vg3.f18094P0);
/* 1820 */                      nk3Var = nk3.AD_STORAGE;
/* 1822 */                      if (zM7406J) {
/* 1824 */                          m6763j0();
/* 1831 */                          if (up3.m9066V(str6)) {
/* 1835 */                              zzicVarZzaE.zzaH(zzrVar.f4257k0);
/* 1838 */                              j2 = j;
/* 1840 */                              j3 = zzrVar.f4258l0;
/* 1848 */                              if (!ok3VarM7190j.m7189i(nk3Var)) {
/* 1858 */                                  j3 = (j3 & (-2)) | 32;
                                        }
/* 1862 */                              if (j3 == 1) {
/* 1864 */                                  z = true;
                                        } else {
/* 1866 */                                  z = false;
                                        }
/* 1867 */                              zzicVarZzaE.zzaz(z);
/* 1872 */                              if (j3 != 0) {
/* 1876 */                                  zzhd zzhdVarZzh4 = zzhe.zzh();
/* 1884 */                                  if ((j3 & 1) != 0) {
/* 1886 */                                      z2 = true;
                                            } else {
/* 1888 */                                      z2 = false;
                                            }
/* 1889 */                                  zzhdVarZzh4.zza(z2);
/* 1898 */                                  if ((j3 & 2) != 0) {
/* 1900 */                                      z3 = true;
                                            } else {
/* 1902 */                                      z3 = false;
                                            }
/* 1903 */                                  zzhdVarZzh4.zzb(z3);
/* 1912 */                                  if ((j3 & 4) != 0) {
/* 1914 */                                      z4 = true;
                                            } else {
/* 1916 */                                      z4 = false;
                                            }
/* 1917 */                                  zzhdVarZzh4.zzc(z4);
/* 1926 */                                  if ((j3 & 8) != 0) {
/* 1928 */                                      z5 = true;
                                            } else {
/* 1930 */                                      z5 = false;
                                            }
/* 1931 */                                  zzhdVarZzh4.zzd(z5);
/* 1940 */                                  if ((j3 & 16) != 0) {
/* 1942 */                                      z6 = true;
                                            } else {
/* 1944 */                                      z6 = false;
                                            }
/* 1945 */                                  zzhdVarZzh4.zze(z6);
/* 1952 */                                  if ((j3 & 32) != 0) {
/* 1954 */                                      z7 = true;
                                            } else {
/* 1956 */                                      z7 = false;
                                            }
/* 1957 */                                  zzhdVarZzh4.zzf(z7);
/* 1966 */                                  if ((j3 & 64) != 0) {
/* 1968 */                                      z8 = true;
                                            } else {
/* 1970 */                                      z8 = false;
                                            }
/* 1971 */                                  zzhdVarZzh4.zzg(z8);
/* 1980 */                                  zzicVarZzaE.zzaI((zzhe) zzhdVarZzh4.zzbc());
                                        }
                                    } else {
/* 1984 */                              j2 = j;
                                    }
                                } else {
/* 1984 */                          j2 = j;
                                }
/* 1988 */                      if (j8 != 0) {
/* 1992 */                          zzicVarZzaE.zzY(j8);
/* 1995 */                          j8 = j8;
                                }
/* 1999 */                      zzicVarZzaE.zzar(j4);
/* 2002 */                      ci3 ci3VarM6761i4 = m6761i0();
/* 2028 */                      zzjqVarZza = zzjq.zza(ci3VarM6761i4.f15676b.f13905W.mo4561e().getContentResolver(), zzka.zza("com.google.android.gms.measurement"), vc0.f17978b);
/* 2032 */                      if (zzjqVarZza == null) {
/* 2034 */                          mapZzb = Collections.EMPTY_MAP;
                                } else {
/* 2037 */                          mapZzb = zzjqVarZza.zzb();
                                }
/* 2041 */                      if (mapZzb == null) {
/* 2049 */                          str13 = str8;
/* 2051 */                          str14 = str9;
/* 2053 */                          arrayList = null;
                                } else {
/* 2049 */                          str13 = str8;
/* 2051 */                          str14 = str9;
/* 2053 */                          arrayList = null;
                                }
/* 2202 */                      if (arrayList != null) {
/* 2204 */                          zzicVarZzaE.zzaq(arrayList);
                                }
/* 2220 */                      if (m6753d0().m7406J(null, vg3.f18120b1)) {
/* 2222 */                          zzicVarZzaE.zzaP(HttpUrl.FRAGMENT_ENCODE_SET);
                                }
/* 2235 */                      ok3VarM7190j2 = m6752d(str6).m7190j(ok3.m7182c(100, str18));
/* 2243 */                      if (ok3VarM7190j2.m7189i(nk3Var)) {
/* 2428 */                          str11 = str11;
/* 2434 */                          ij3Var2.m4568p().m4240B();
/* 2439 */                          zzicVarZzaE.zzF(Build.MODEL);
/* 2446 */                          ij3Var2.m4568p().m4240B();
/* 2451 */                          zzicVarZzaE.zzE(Build.VERSION.RELEASE);
/* 2463 */                          zzicVarZzaE.zzI((int) ij3Var2.m4568p().m6641D());
/* 2474 */                          zzicVarZzaE.zzH(ij3Var2.m4568p().m6642E());
/* 2481 */                          zzicVarZzaE.zzay(zzrVar.f4253h0);
/* 2488 */                          if (ij3Var2.m4560d()) {
/* 2490 */                              zzicVarZzaE.zzK();
/* 2498 */                              if (!TextUtils.isEmpty(null)) {
/* 2500 */                                  zzicVarZzaE.zzam(null);
                                        }
                                    }
/* 2507 */                          di3VarM219D0 = m6755f0().m219D0(str6);
/* 2511 */                          if (di3VarM219D0 == null) {
/* 2517 */                              di3VarM219D0 = new di3(ij3Var2, str6);
/* 2520 */                              mp3Var = this;
/* 2526 */                              di3VarM219D0.m3095F(mp3Var.m6772o(ok3VarM7190j2));
/* 2531 */                              di3VarM219D0.m3100K(zzrVar.f4235V);
/* 2536 */                              di3VarM219D0.m3097H(str11);
/* 2543 */                              if (ok3VarM7190j2.m7189i(nk3Var)) {
/* 2553 */                                  di3VarM219D0.m3098I(mp3Var.f13938w.m8815E(str6, z9));
                                        }
/* 2562 */                              di3VarM219D0.m3113e(0L);
/* 2565 */                              di3VarM219D0.m3101L(0L);
/* 2568 */                              di3VarM219D0.m3102M(0L);
/* 2573 */                              di3VarM219D0.m3104O(str14);
/* 2578 */                              di3VarM219D0.m3106Q(j2);
/* 2583 */                              di3VarM219D0.m3107R(str13);
/* 2588 */                              di3VarM219D0.m3108S(j6);
/* 2593 */                              di3VarM219D0.m3109a(j8);
/* 2598 */                              di3VarM219D0.m3112d(z10);
/* 2603 */                              di3VarM219D0.m3111c(j4);
/* 2610 */                              i = 0;
/* 2611 */                              mp3Var.m6755f0().m221E0(di3VarM219D0, false);
                                    } else {
/* 2615 */                              i = 0;
/* 2616 */                              mp3Var = this;
                                    }
/* 2624 */                          if (ok3VarM7190j2.m7189i(nk3.ANALYTICS_STORAGE)) {
/* 2636 */                              String strM3094E9 = di3VarM219D0.m3094E();
/* 2640 */                              kb1.m6061n(strM3094E9);
/* 2643 */                              zzicVarZzaE.zzW(strM3094E9);
                                    }
/* 2654 */                          if (!TextUtils.isEmpty(di3VarM219D0.m3099J())) {
/* 2656 */                              String strM3099J9 = di3VarM219D0.m3099J();
/* 2660 */                              kb1.m6061n(strM3099J9);
/* 2663 */                              zzicVarZzaE.zzah(strM3099J9);
                                    }
/* 2670 */                          listM267w0 = mp3Var.m6755f0().m267w0(str6);
/* 2674 */                          i2 = i;
/* 2679 */                          while (i2 < listM267w0.size()) {
/* 2681 */                              zzit zzitVarZzm9 = zziu.zzm();
/* 2693 */                              zzitVarZzm9.zzb(((rp3) listM267w0.get(i2)).f16226c);
/* 2704 */                              zzitVarZzm9.zza(((rp3) listM267w0.get(i2)).f16227d);
/* 2719 */                              mp3Var.m6761i0().m1684X(zzitVarZzm9, ((rp3) listM267w0.get(i2)).f16228e);
/* 2722 */                              zzicVarZzaE.zzp(zzitVarZzm9);
/* 2739 */                              if ("_sid".equals(((rp3) listM267w0.get(i2)).f16226c)) {
/* 2743 */                                  bj3 bj3Var112 = di3VarM219D0.f7242a.f9659i;
/* 2745 */                                  ij3.m4555l(bj3Var112);
/* 2748 */                                  bj3Var112.mo1375y();
/* 2757 */                                  if (di3VarM219D0.f7264w != 0) {
/* 2759 */                                      ci3VarM6761i0 = mp3Var.m6761i0();
/* 2767 */                                      if (TextUtils.isEmpty(str12)) {
/* 2769 */                                          str16 = str12;
/* 2771 */                                          jM1694k0 = 0;
                                                } else {
/* 2780 */                                          str16 = str12;
/* 2786 */                                          jM1694k0 = ci3VarM6761i0.m1694k0(str16.getBytes(Charset.forName("UTF-8")));
                                                }
/* 2792 */                                      bj3 bj3Var113 = di3VarM219D0.f7242a.f9659i;
/* 2794 */                                      ij3.m4555l(bj3Var113);
/* 2797 */                                      bj3Var113.mo1375y();
/* 2804 */                                      if (jM1694k0 != di3VarM219D0.f7264w) {
/* 2806 */                                          zzicVarZzaE.zzav();
                                                }
                                            } else {
/* 2810 */                                      str16 = str12;
                                            }
                                        } else {
/* 2810 */                                  str16 = str12;
                                        }
/* 2812 */                              i2++;
/* 2814 */                              str12 = str16;
                                    }
/* 2818 */                          ae3VarM6755f2 = mp3Var.m6755f0();
/* 2827 */                          zzid zzidVar9 = (zzid) zzicVarZzaE.zzbc();
/* 2829 */                          ae3VarM6755f2.mo1375y();
/* 2832 */                          ae3VarM6755f2.m9593A();
/* 2835 */                          kb1.m6061n(zzidVar9);
/* 2842 */                          kb1.m6058k(zzidVar9.zzA());
/* 2845 */                          byte[] bArrZzcc17 = zzidVar9.zzcc();
/* 2855 */                          long jM1694k9 = ae3VarM6755f2.f15676b.m6761i0().m1694k0(bArrZzcc17);
/* 2861 */                          ContentValues contentValues10 = new ContentValues();
/* 2870 */                          contentValues10.put("app_id", zzidVar9.zzA());
/* 2879 */                          contentValues10.put("metadata_fingerprint", Long.valueOf(jM1694k9));
/* 2884 */                          contentValues10.put("metadata", bArrZzcc17);
/* 2895 */                          ae3VarM6755f2.m261q0().insertWithOnConflict("raw_events_metadata", null, contentValues10, 4);
/* 2898 */                          ae3VarM6755f3 = mp3Var.m6755f0();
/* 2902 */                          zzbe zzbeVar10 = oe3Var2.f14732f;
/* 2904 */                          Objects.requireNonNull(zzbeVar10);
/* 2913 */                          it2 = zzbeVar10.f4207a.keySet().iterator();
                                    while (true) {
/* 2921 */                              if (it2.hasNext()) {
/* 2937 */                                  vi3 vi3VarM6754e9 = mp3Var.m6754e0();
/* 2941 */                                  String str310 = oe3Var2.f14727a;
/* 2945 */                                  zM9290P = vi3VarM6754e9.m9290P(str310, oe3Var2.f14728b);
/* 2967 */                                  ud3 ud3VarM223F8 = mp3Var.m6755f0().m223F0(false, false, false, false, str310, mp3Var.m6756g());
/* 2973 */                                  if (zM9290P) {
                                            }
/* 2993 */                                  i3 = i;
                                            break;
                                        }
/* 2933 */                              if ("_r".equals(it2.next())) {
                                        }
/* 2935 */                              i3 = 1;
                                        break;
                                    }
/* 2994 */                          ae3VarM6755f3.mo1375y();
/* 2997 */                          ae3VarM6755f3.m9593A();
/* 3000 */                          str15 = oe3Var2.f14727a;
/* 3002 */                          kb1.m6058k(str15);
/* 3015 */                          byte[] bArrZzcc18 = ae3VarM6755f3.f15676b.m6761i0().m1688b0(oe3Var2).zzcc();
/* 3021 */                          contentValues = new ContentValues();
/* 3024 */                          contentValues.put("app_id", str15);
/* 3031 */                          contentValues.put("name", oe3Var2.f14728b);
/* 3042 */                          contentValues.put("timestamp", Long.valueOf(oe3Var2.f14730d));
/* 3049 */                          contentValues.put("metadata_fingerprint", Long.valueOf(jM1694k9));
/* 3054 */                          contentValues.put(SharedDataContentProvider.BASE_PATH, bArrZzcc18);
/* 3063 */                          contentValues.put("realtime", Integer.valueOf(i3));
/* 3081 */                          if (ae3VarM6755f3.m261q0().insert("raw_events", null, contentValues) == -1) {
/* 3101 */                              ((ij3) ae3VarM6755f3.f16749a).mo4557a().m9016D().m8511b(uh3.m9013H(str15), "Failed to insert raw event (got -1). appId");
                                    } else {
/* 3109 */                              mp3Var.f13908Z = 0L;
                                    }
/* 3190 */                          mp3Var.m6755f0().m259o0();
/* 3197 */                          mp3Var.m6755f0().m260p0();
/* 3200 */                          mp3Var.m6739L();
/* 3231 */                          mp3Var.mo4557a().m9019G().m8511b(Long.valueOf(((System.nanoTime() - jNanoTime) + 500000) / 1000000), "Background event processing time, ms");
/* 3234 */                          return;
                                }
/* 2428 */                      str11 = str11;
/* 2434 */                      ij3Var2.m4568p().m4240B();
/* 2439 */                      zzicVarZzaE.zzF(Build.MODEL);
/* 2446 */                      ij3Var2.m4568p().m4240B();
/* 2451 */                      zzicVarZzaE.zzE(Build.VERSION.RELEASE);
/* 2463 */                      zzicVarZzaE.zzI((int) ij3Var2.m4568p().m6641D());
/* 2474 */                      zzicVarZzaE.zzH(ij3Var2.m4568p().m6642E());
/* 2481 */                      zzicVarZzaE.zzay(zzrVar.f4253h0);
/* 2488 */                      if (ij3Var2.m4560d()) {
/* 2490 */                          zzicVarZzaE.zzK();
/* 2498 */                          if (!TextUtils.isEmpty(null)) {
/* 2500 */                              zzicVarZzaE.zzam(null);
                                    }
                                }
/* 2507 */                      di3VarM219D0 = m6755f0().m219D0(str6);
/* 2511 */                      if (di3VarM219D0 == null) {
/* 2517 */                          di3VarM219D0 = new di3(ij3Var2, str6);
/* 2520 */                          mp3Var = this;
/* 2526 */                          di3VarM219D0.m3095F(mp3Var.m6772o(ok3VarM7190j2));
/* 2531 */                          di3VarM219D0.m3100K(zzrVar.f4235V);
/* 2536 */                          di3VarM219D0.m3097H(str11);
/* 2543 */                          if (ok3VarM7190j2.m7189i(nk3Var)) {
/* 2553 */                              di3VarM219D0.m3098I(mp3Var.f13938w.m8815E(str6, z9));
                                    }
/* 2562 */                          di3VarM219D0.m3113e(0L);
/* 2565 */                          di3VarM219D0.m3101L(0L);
/* 2568 */                          di3VarM219D0.m3102M(0L);
/* 2573 */                          di3VarM219D0.m3104O(str14);
/* 2578 */                          di3VarM219D0.m3106Q(j2);
/* 2583 */                          di3VarM219D0.m3107R(str13);
/* 2588 */                          di3VarM219D0.m3108S(j6);
/* 2593 */                          di3VarM219D0.m3109a(j8);
/* 2598 */                          di3VarM219D0.m3112d(z10);
/* 2603 */                          di3VarM219D0.m3111c(j4);
/* 2610 */                          i = 0;
/* 2611 */                          mp3Var.m6755f0().m221E0(di3VarM219D0, false);
                                } else {
/* 2615 */                          i = 0;
/* 2616 */                          mp3Var = this;
                                }
/* 2624 */                      if (ok3VarM7190j2.m7189i(nk3.ANALYTICS_STORAGE)) {
/* 2636 */                          String strM3094E10 = di3VarM219D0.m3094E();
/* 2640 */                          kb1.m6061n(strM3094E10);
/* 2643 */                          zzicVarZzaE.zzW(strM3094E10);
                                }
/* 2654 */                      if (!TextUtils.isEmpty(di3VarM219D0.m3099J())) {
/* 2656 */                          String strM3099J10 = di3VarM219D0.m3099J();
/* 2660 */                          kb1.m6061n(strM3099J10);
/* 2663 */                          zzicVarZzaE.zzah(strM3099J10);
                                }
/* 2670 */                      listM267w0 = mp3Var.m6755f0().m267w0(str6);
/* 2674 */                      i2 = i;
/* 2679 */                      while (i2 < listM267w0.size()) {
/* 2681 */                          zzit zzitVarZzm10 = zziu.zzm();
/* 2693 */                          zzitVarZzm10.zzb(((rp3) listM267w0.get(i2)).f16226c);
/* 2704 */                          zzitVarZzm10.zza(((rp3) listM267w0.get(i2)).f16227d);
/* 2719 */                          mp3Var.m6761i0().m1684X(zzitVarZzm10, ((rp3) listM267w0.get(i2)).f16228e);
/* 2722 */                          zzicVarZzaE.zzp(zzitVarZzm10);
/* 2739 */                          if ("_sid".equals(((rp3) listM267w0.get(i2)).f16226c)) {
/* 2743 */                              bj3 bj3Var114 = di3VarM219D0.f7242a.f9659i;
/* 2745 */                              ij3.m4555l(bj3Var114);
/* 2748 */                              bj3Var114.mo1375y();
/* 2757 */                              if (di3VarM219D0.f7264w != 0) {
/* 2759 */                                  ci3VarM6761i0 = mp3Var.m6761i0();
/* 2767 */                                  if (TextUtils.isEmpty(str12)) {
/* 2769 */                                      str16 = str12;
/* 2771 */                                      jM1694k0 = 0;
                                            } else {
/* 2780 */                                      str16 = str12;
/* 2786 */                                      jM1694k0 = ci3VarM6761i0.m1694k0(str16.getBytes(Charset.forName("UTF-8")));
                                            }
/* 2792 */                                  bj3 bj3Var115 = di3VarM219D0.f7242a.f9659i;
/* 2794 */                                  ij3.m4555l(bj3Var115);
/* 2797 */                                  bj3Var115.mo1375y();
/* 2804 */                                  if (jM1694k0 != di3VarM219D0.f7264w) {
/* 2806 */                                      zzicVarZzaE.zzav();
                                            }
                                        } else {
/* 2810 */                                  str16 = str12;
                                        }
                                    } else {
/* 2810 */                              str16 = str12;
                                    }
/* 2812 */                          i2++;
/* 2814 */                          str12 = str16;
                                }
/* 2818 */                      ae3VarM6755f2 = mp3Var.m6755f0();
/* 2827 */                      zzid zzidVar10 = (zzid) zzicVarZzaE.zzbc();
/* 2829 */                      ae3VarM6755f2.mo1375y();
/* 2832 */                      ae3VarM6755f2.m9593A();
/* 2835 */                      kb1.m6061n(zzidVar10);
/* 2842 */                      kb1.m6058k(zzidVar10.zzA());
/* 2845 */                      byte[] bArrZzcc19 = zzidVar10.zzcc();
/* 2855 */                      long jM1694k10 = ae3VarM6755f2.f15676b.m6761i0().m1694k0(bArrZzcc19);
/* 2861 */                      ContentValues contentValues11 = new ContentValues();
/* 2870 */                      contentValues11.put("app_id", zzidVar10.zzA());
/* 2879 */                      contentValues11.put("metadata_fingerprint", Long.valueOf(jM1694k10));
/* 2884 */                      contentValues11.put("metadata", bArrZzcc19);
/* 2895 */                      ae3VarM6755f2.m261q0().insertWithOnConflict("raw_events_metadata", null, contentValues11, 4);
/* 2898 */                      ae3VarM6755f3 = mp3Var.m6755f0();
/* 2902 */                      zzbe zzbeVar11 = oe3Var2.f14732f;
/* 2904 */                      Objects.requireNonNull(zzbeVar11);
/* 2913 */                      it2 = zzbeVar11.f4207a.keySet().iterator();
                                while (true) {
/* 2921 */                          if (it2.hasNext()) {
/* 2937 */                              vi3 vi3VarM6754e10 = mp3Var.m6754e0();
/* 2941 */                              String str311 = oe3Var2.f14727a;
/* 2945 */                              zM9290P = vi3VarM6754e10.m9290P(str311, oe3Var2.f14728b);
/* 2967 */                              ud3 ud3VarM223F9 = mp3Var.m6755f0().m223F0(false, false, false, false, str311, mp3Var.m6756g());
/* 2973 */                              if (zM9290P) {
                                        }
/* 2993 */                              i3 = i;
                                        break;
                                    }
/* 2933 */                          if ("_r".equals(it2.next())) {
                                    }
/* 2935 */                          i3 = 1;
                                    break;
                                }
/* 2994 */                      ae3VarM6755f3.mo1375y();
/* 2997 */                      ae3VarM6755f3.m9593A();
/* 3000 */                      str15 = oe3Var2.f14727a;
/* 3002 */                      kb1.m6058k(str15);
/* 3015 */                      byte[] bArrZzcc110 = ae3VarM6755f3.f15676b.m6761i0().m1688b0(oe3Var2).zzcc();
/* 3021 */                      contentValues = new ContentValues();
/* 3024 */                      contentValues.put("app_id", str15);
/* 3031 */                      contentValues.put("name", oe3Var2.f14728b);
/* 3042 */                      contentValues.put("timestamp", Long.valueOf(oe3Var2.f14730d));
/* 3049 */                      contentValues.put("metadata_fingerprint", Long.valueOf(jM1694k10));
/* 3054 */                      contentValues.put(SharedDataContentProvider.BASE_PATH, bArrZzcc110);
/* 3063 */                      contentValues.put("realtime", Integer.valueOf(i3));
/* 3081 */                      if (ae3VarM6755f3.m261q0().insert("raw_events", null, contentValues) == -1) {
/* 3101 */                          ((ij3) ae3VarM6755f3.f16749a).mo4557a().m9016D().m8511b(uh3.m9013H(str15), "Failed to insert raw event (got -1). appId");
                                } else {
/* 3109 */                          mp3Var.f13908Z = 0L;
                                }
/* 3190 */                      mp3Var.m6755f0().m259o0();
/* 3197 */                      mp3Var.m6755f0().m260p0();
/* 3200 */                      mp3Var.m6739L();
/* 3231 */                      mp3Var.mo4557a().m9019G().m8511b(Long.valueOf(((System.nanoTime() - jNanoTime) + 500000) / 1000000), "Background event processing time, ms");
/* 3234 */                      return;
/* 3239 */                      mp3Var.m6755f0().m260p0();
/* 3242 */                      throw th;
                            }
/* 1007 */                  if (jIntValue % 1000 == 1) {
/* 1029 */                      mo4557a().m9016D().m8512c(uh3.m9013H(str5), "Data loss. Too many events logged. appId, count", Long.valueOf(ud3VarM225G0.f17478b));
                            }
/* 1036 */                  m6755f0().m259o0();
/* 1589 */                  m6755f0().m260p0();
                        }
/* 879 */               str4 = str22;
/* 526 */               ac3Var = ac3Var3;
/* 883 */               zM9074x0 = up3.m9074x0(str26);
/* 887 */               zEquals = "_err".equals(str26);
/* 891 */               m6763j0();
/* 894 */               if (zzbeVar == null) {
/* 896 */                   length = 0;
                        } else {
/* 907 */                   it = zzbeVar.f4207a.keySet().iterator();
/* 911 */                   length = 0;
/* 917 */                   while (it.hasNext()) {
/* 925 */                       objM2164D1 = zzbeVar.m2164D1(it.next());
/* 931 */                       if (objM2164D1 instanceof Parcelable[]) {
/* 939 */                           length += (long) ((Parcelable[]) objM2164D1).length;
                                }
                            }
                        }
/* 952 */               str5 = str4;
/* 968 */               ud3VarM225G0 = m6755f0().m225G0(m6756g(), str5, length + 1, true, zM9074x0, false, zEquals, false, false, false);
/* 976 */               long j18 = ud3VarM225G0.f17478b;
/* 978 */               m6753d0();
/* 997 */               jIntValue = j18 - ((long) ((Integer) vg3.f18147l.m9011a(null)).intValue());
/* 1002 */              if (jIntValue <= 0) {
/* 1041 */                  if (zM9074x0) {
/* 1043 */                      long j19 = ud3VarM225G0.f17477a;
/* 1045 */                      m6753d0();
/* 1064 */                      jIntValue2 = j19 - ((long) ((Integer) vg3.f18151n.m9011a(null)).intValue());
/* 1067 */                      if (jIntValue2 > 0) {
/* 1073 */                          if (jIntValue2 % 1000 == 1) {
/* 1095 */                              mo4557a().m9016D().m8512c(uh3.m9013H(str5), "Data loss. Too many public events logged. appId, count", Long.valueOf(ud3VarM225G0.f17477a));
                                    }
/* 1098 */                          m6763j0();
/* 1113 */                          up3.m9062P(ac3Var, str5, 16, "_ev", zzbgVarM9580c.f4208a, 0);
/* 1120 */                          m6755f0().m259o0();
                                }
                            }
/* 1125 */                  str6 = str5;
/* 1127 */                  if (zEquals) {
/* 1154 */                      jMax = ud3VarM225G0.f17480d - ((long) Math.max(0, Math.min(1000000, m6753d0().m7404H(str6, vg3.f18149m))));
/* 1157 */                      if (jMax > 0) {
/* 1161 */                          if (jMax == 1) {
/* 1183 */                              mo4557a().m9016D().m8512c(uh3.m9013H(str6), "Too many error events logged. appId, count", Long.valueOf(ud3VarM225G0.f17480d));
                                    }
/* 1190 */                          m6755f0().m259o0();
                                }
                            }
/* 1195 */                  bundleM2167G1 = zzbeVar.m2167G1();
/* 1199 */                  up3 up3VarM6763j5 = m6763j0();
/* 1205 */                  String str219 = zzbgVarM9580c.f4210c;
/* 1207 */                  up3VarM6763j5.m9094O(str219, "_o", bundleM2167G1);
/* 1222 */                  if (m6763j0().m9098Z(str6, zzrVar.f4259m0)) {
/* 1234 */                      m6763j0().m9094O(1L, "_dbg", bundleM2167G1);
/* 1241 */                      m6763j0().m9094O(1L, "_r", bundleM2167G1);
                            }
/* 1250 */                  if ("_s".equals(str26)) {
/* 1262 */                      obj2 = rp3VarM266v0.f16228e;
/* 1266 */                      if (obj2 instanceof Long) {
/* 1272 */                          m6763j0().m9094O(obj2, "_sno", bundleM2167G1);
                                }
                            }
/* 1286 */                  if (m6753d0().m7406J(null, vg3.f18110X0)) {
/* 1304 */                      obj = bundleM2167G1.get(FirebaseAnalytics.Param.VALUE);
/* 1310 */                      if (obj instanceof String) {
/* 1314 */                          double d5 = Double.parseDouble((String) obj);
/* 1318 */                          bundleM2167G1.remove(FirebaseAnalytics.Param.VALUE);
/* 1321 */                          bundleM2167G1.putDouble(FirebaseAnalytics.Param.VALUE, d5);
                                }
                            }
/* 1324 */                  ae3VarM6755f1 = m6755f0();
/* 1328 */                  kb1.m6058k(str6);
/* 1331 */                  ae3VarM6755f1.mo1375y();
/* 1334 */                  ae3VarM6755f1.m9593A();
/* 1375 */                  jDelete = ae3VarM6755f1.m261q0().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str6, String.valueOf(Math.max(0, Math.min(1000000, ((ij3) ae3VarM6755f1.f16749a).f9651d.m7404H(str6, vg3.f18157q))))});
/* 1407 */                  if (jDelete > 0) {
/* 1427 */                      mo4557a().m9017E().m8512c(uh3.m9013H(str6), "Data lost. Too many events stored on disk, deleted. appId", Long.valueOf(jDelete));
                            }
/* 1432 */                  ij3Var = this.f13905W;
/* 1454 */                  oe3Var = new oe3(ij3Var, zzbgVarM9580c.f4210c, str6, zzbgVarM9580c.f4208a, zzbgVarM9580c.f4211d, 0L, bundleM2167G1);
/* 1461 */                  ae3 ae3VarM6755f8 = m6755f0();
/* 1465 */                  str7 = oe3Var.f14728b;
/* 1467 */                  String str2110 = str17;
/* 1469 */                  pe3VarM246Z = ae3VarM6755f8.m246Z(str2110, str6, str7);
/* 1473 */                  if (pe3VarM246Z == null) {
/* 1479 */                      jM238R = m6755f0().m238R(str6);
/* 1483 */                      pd3VarM6753d0 = m6753d0();
/* 1487 */                      pd3VarM6753d0.getClass();
/* 1490 */                      ug3Var = vg3.f18107W;
/* 1508 */                      ac3Var2 = ac3Var;
/* 1513 */                      if (jM238R >= Math.max(Math.min(pd3VarM6753d0.m7404H(str6, ug3Var), 2000), 500)) {
                                }
/* 1595 */                      ac3Var = ac3Var2;
/* 1621 */                      pe3VarM7412a = new pe3(str6, str7, 0L, 0L, 0L, oe3Var.f14730d, 0L, null, null, null, null);
/* 1624 */                      str6 = str6;
                            } else {
/* 1632 */                      oe3Var = oe3Var.m7140a(ij3Var, pe3VarM246Z.f15085f);
/* 1638 */                      pe3VarM7412a = pe3VarM246Z.m7412a(oe3Var.f14730d);
                            }
/* 1626 */                  oe3Var2 = oe3Var;
/* 1647 */                  m6755f0().m247a0(str2110, pe3VarM7412a);
/* 1654 */                  mo4558b().mo1375y();
/* 1657 */                  m6765k0();
/* 1660 */                  String str2111 = oe3Var2.f14727a;
/* 1662 */                  kb1.m6058k(str2111);
/* 1669 */                  kb1.m6054g(str2111.equals(str6));
/* 1672 */                  zzicVarZzaE = zzid.zzaE();
/* 1677 */                  zzicVarZzaE.zza(1);
/* 1682 */                  zzicVarZzaE.zzC("android");
/* 1689 */                  if (!TextUtils.isEmpty(str6)) {
/* 1691 */                      zzicVarZzaE.zzL(str6);
                            }
/* 1698 */                  if (TextUtils.isEmpty(str3)) {
/* 1700 */                      str8 = str3;
/* 1702 */                      zzicVarZzaE.zzJ(str8);
                            } else {
/* 1706 */                      str8 = str3;
                            }
/* 1712 */                  if (TextUtils.isEmpty(str2)) {
/* 1714 */                      str9 = str2;
/* 1716 */                      zzicVarZzaE.zzM(str9);
                            } else {
/* 1720 */                      str9 = str2;
                            }
/* 1726 */                  if (TextUtils.isEmpty(str)) {
/* 1728 */                      str10 = str;
/* 1730 */                      zzicVarZzaE.zzau(str10);
                            } else {
/* 1734 */                      str10 = str;
                            }
/* 1741 */                  if (j7 != -2147483648L) {
/* 1743 */                      j = j7;
/* 1746 */                      zzicVarZzaE.zzaj((int) j);
                            } else {
/* 1753 */                      j = j7;
                            }
/* 1756 */                  zzicVarZzaE.zzN(j6);
/* 1763 */                  if (TextUtils.isEmpty(str23)) {
/* 1767 */                      str11 = str23;
/* 1769 */                      zzicVarZzaE.zzad(str11);
                            } else {
/* 1775 */                      str11 = str23;
                            }
/* 1777 */                  kb1.m6061n(str6);
/* 1786 */                  str12 = str10;
/* 1796 */                  ok3VarM7190j = m6752d(str6).m7190j(ok3.m7182c(100, str18));
/* 1804 */                  zzicVarZzaE.zzat(ok3VarM7190j.m7187f());
/* 1807 */                  zzql.zza();
/* 1816 */                  zM7406J = m6753d0().m7406J(str6, vg3.f18094P0);
/* 1820 */                  nk3Var = nk3.AD_STORAGE;
/* 1822 */                  if (zM7406J) {
/* 1824 */                      m6763j0();
/* 1831 */                      if (up3.m9066V(str6)) {
/* 1835 */                          zzicVarZzaE.zzaH(zzrVar.f4257k0);
/* 1838 */                          j2 = j;
/* 1840 */                          j3 = zzrVar.f4258l0;
/* 1848 */                          if (!ok3VarM7190j.m7189i(nk3Var)) {
/* 1858 */                              j3 = (j3 & (-2)) | 32;
                                    }
/* 1862 */                          if (j3 == 1) {
/* 1864 */                              z = true;
                                    } else {
/* 1866 */                              z = false;
                                    }
/* 1867 */                          zzicVarZzaE.zzaz(z);
/* 1872 */                          if (j3 != 0) {
/* 1876 */                              zzhd zzhdVarZzh5 = zzhe.zzh();
/* 1884 */                              if ((j3 & 1) != 0) {
/* 1886 */                                  z2 = true;
                                        } else {
/* 1888 */                                  z2 = false;
                                        }
/* 1889 */                              zzhdVarZzh5.zza(z2);
/* 1898 */                              if ((j3 & 2) != 0) {
/* 1900 */                                  z3 = true;
                                        } else {
/* 1902 */                                  z3 = false;
                                        }
/* 1903 */                              zzhdVarZzh5.zzb(z3);
/* 1912 */                              if ((j3 & 4) != 0) {
/* 1914 */                                  z4 = true;
                                        } else {
/* 1916 */                                  z4 = false;
                                        }
/* 1917 */                              zzhdVarZzh5.zzc(z4);
/* 1926 */                              if ((j3 & 8) != 0) {
/* 1928 */                                  z5 = true;
                                        } else {
/* 1930 */                                  z5 = false;
                                        }
/* 1931 */                              zzhdVarZzh5.zzd(z5);
/* 1940 */                              if ((j3 & 16) != 0) {
/* 1942 */                                  z6 = true;
                                        } else {
/* 1944 */                                  z6 = false;
                                        }
/* 1945 */                              zzhdVarZzh5.zze(z6);
/* 1952 */                              if ((j3 & 32) != 0) {
/* 1954 */                                  z7 = true;
                                        } else {
/* 1956 */                                  z7 = false;
                                        }
/* 1957 */                              zzhdVarZzh5.zzf(z7);
/* 1966 */                              if ((j3 & 64) != 0) {
/* 1968 */                                  z8 = true;
                                        } else {
/* 1970 */                                  z8 = false;
                                        }
/* 1971 */                              zzhdVarZzh5.zzg(z8);
/* 1980 */                              zzicVarZzaE.zzaI((zzhe) zzhdVarZzh5.zzbc());
                                    }
                                } else {
/* 1984 */                          j2 = j;
                                }
                            } else {
/* 1984 */                      j2 = j;
                            }
/* 1988 */                  if (j8 != 0) {
/* 1992 */                      zzicVarZzaE.zzY(j8);
/* 1995 */                      j8 = j8;
                            }
/* 1999 */                  zzicVarZzaE.zzar(j4);
/* 2002 */                  ci3 ci3VarM6761i5 = m6761i0();
/* 2028 */                  zzjqVarZza = zzjq.zza(ci3VarM6761i5.f15676b.f13905W.mo4561e().getContentResolver(), zzka.zza("com.google.android.gms.measurement"), vc0.f17978b);
/* 2032 */                  if (zzjqVarZza == null) {
/* 2034 */                      mapZzb = Collections.EMPTY_MAP;
                            } else {
/* 2037 */                      mapZzb = zzjqVarZza.zzb();
                            }
/* 2041 */                  if (mapZzb == null) {
/* 2049 */                      str13 = str8;
/* 2051 */                      str14 = str9;
/* 2053 */                      arrayList = null;
                            } else {
/* 2049 */                      str13 = str8;
/* 2051 */                      str14 = str9;
/* 2053 */                      arrayList = null;
                            }
/* 2202 */                  if (arrayList != null) {
/* 2204 */                      zzicVarZzaE.zzaq(arrayList);
                            }
/* 2220 */                  if (m6753d0().m7406J(null, vg3.f18120b1)) {
/* 2222 */                      zzicVarZzaE.zzaP(HttpUrl.FRAGMENT_ENCODE_SET);
                            }
/* 2235 */                  ok3VarM7190j2 = m6752d(str6).m7190j(ok3.m7182c(100, str18));
/* 2243 */                  if (ok3VarM7190j2.m7189i(nk3Var)) {
/* 2428 */                      str11 = str11;
/* 2434 */                      ij3Var2.m4568p().m4240B();
/* 2439 */                      zzicVarZzaE.zzF(Build.MODEL);
/* 2446 */                      ij3Var2.m4568p().m4240B();
/* 2451 */                      zzicVarZzaE.zzE(Build.VERSION.RELEASE);
/* 2463 */                      zzicVarZzaE.zzI((int) ij3Var2.m4568p().m6641D());
/* 2474 */                      zzicVarZzaE.zzH(ij3Var2.m4568p().m6642E());
/* 2481 */                      zzicVarZzaE.zzay(zzrVar.f4253h0);
/* 2488 */                      if (ij3Var2.m4560d()) {
/* 2490 */                          zzicVarZzaE.zzK();
/* 2498 */                          if (!TextUtils.isEmpty(null)) {
/* 2500 */                              zzicVarZzaE.zzam(null);
                                    }
                                }
/* 2507 */                      di3VarM219D0 = m6755f0().m219D0(str6);
/* 2511 */                      if (di3VarM219D0 == null) {
/* 2517 */                          di3VarM219D0 = new di3(ij3Var2, str6);
/* 2520 */                          mp3Var = this;
/* 2526 */                          di3VarM219D0.m3095F(mp3Var.m6772o(ok3VarM7190j2));
/* 2531 */                          di3VarM219D0.m3100K(zzrVar.f4235V);
/* 2536 */                          di3VarM219D0.m3097H(str11);
/* 2543 */                          if (ok3VarM7190j2.m7189i(nk3Var)) {
/* 2553 */                              di3VarM219D0.m3098I(mp3Var.f13938w.m8815E(str6, z9));
                                    }
/* 2562 */                          di3VarM219D0.m3113e(0L);
/* 2565 */                          di3VarM219D0.m3101L(0L);
/* 2568 */                          di3VarM219D0.m3102M(0L);
/* 2573 */                          di3VarM219D0.m3104O(str14);
/* 2578 */                          di3VarM219D0.m3106Q(j2);
/* 2583 */                          di3VarM219D0.m3107R(str13);
/* 2588 */                          di3VarM219D0.m3108S(j6);
/* 2593 */                          di3VarM219D0.m3109a(j8);
/* 2598 */                          di3VarM219D0.m3112d(z10);
/* 2603 */                          di3VarM219D0.m3111c(j4);
/* 2610 */                          i = 0;
/* 2611 */                          mp3Var.m6755f0().m221E0(di3VarM219D0, false);
                                } else {
/* 2615 */                          i = 0;
/* 2616 */                          mp3Var = this;
                                }
/* 2624 */                      if (ok3VarM7190j2.m7189i(nk3.ANALYTICS_STORAGE)) {
/* 2636 */                          String strM3094E11 = di3VarM219D0.m3094E();
/* 2640 */                          kb1.m6061n(strM3094E11);
/* 2643 */                          zzicVarZzaE.zzW(strM3094E11);
                                }
/* 2654 */                      if (!TextUtils.isEmpty(di3VarM219D0.m3099J())) {
/* 2656 */                          String strM3099J11 = di3VarM219D0.m3099J();
/* 2660 */                          kb1.m6061n(strM3099J11);
/* 2663 */                          zzicVarZzaE.zzah(strM3099J11);
                                }
/* 2670 */                      listM267w0 = mp3Var.m6755f0().m267w0(str6);
/* 2674 */                      i2 = i;
/* 2679 */                      while (i2 < listM267w0.size()) {
/* 2681 */                          zzit zzitVarZzm11 = zziu.zzm();
/* 2693 */                          zzitVarZzm11.zzb(((rp3) listM267w0.get(i2)).f16226c);
/* 2704 */                          zzitVarZzm11.zza(((rp3) listM267w0.get(i2)).f16227d);
/* 2719 */                          mp3Var.m6761i0().m1684X(zzitVarZzm11, ((rp3) listM267w0.get(i2)).f16228e);
/* 2722 */                          zzicVarZzaE.zzp(zzitVarZzm11);
/* 2739 */                          if ("_sid".equals(((rp3) listM267w0.get(i2)).f16226c)) {
/* 2743 */                              bj3 bj3Var116 = di3VarM219D0.f7242a.f9659i;
/* 2745 */                              ij3.m4555l(bj3Var116);
/* 2748 */                              bj3Var116.mo1375y();
/* 2757 */                              if (di3VarM219D0.f7264w != 0) {
/* 2759 */                                  ci3VarM6761i0 = mp3Var.m6761i0();
/* 2767 */                                  if (TextUtils.isEmpty(str12)) {
/* 2769 */                                      str16 = str12;
/* 2771 */                                      jM1694k0 = 0;
                                            } else {
/* 2780 */                                      str16 = str12;
/* 2786 */                                      jM1694k0 = ci3VarM6761i0.m1694k0(str16.getBytes(Charset.forName("UTF-8")));
                                            }
/* 2792 */                                  bj3 bj3Var117 = di3VarM219D0.f7242a.f9659i;
/* 2794 */                                  ij3.m4555l(bj3Var117);
/* 2797 */                                  bj3Var117.mo1375y();
/* 2804 */                                  if (jM1694k0 != di3VarM219D0.f7264w) {
/* 2806 */                                      zzicVarZzaE.zzav();
                                            }
                                        } else {
/* 2810 */                                  str16 = str12;
                                        }
                                    } else {
/* 2810 */                              str16 = str12;
                                    }
/* 2812 */                          i2++;
/* 2814 */                          str12 = str16;
                                }
/* 2818 */                      ae3VarM6755f2 = mp3Var.m6755f0();
/* 2827 */                      zzid zzidVar11 = (zzid) zzicVarZzaE.zzbc();
/* 2829 */                      ae3VarM6755f2.mo1375y();
/* 2832 */                      ae3VarM6755f2.m9593A();
/* 2835 */                      kb1.m6061n(zzidVar11);
/* 2842 */                      kb1.m6058k(zzidVar11.zzA());
/* 2845 */                      byte[] bArrZzcc111 = zzidVar11.zzcc();
/* 2855 */                      long jM1694k11 = ae3VarM6755f2.f15676b.m6761i0().m1694k0(bArrZzcc111);
/* 2861 */                      ContentValues contentValues12 = new ContentValues();
/* 2870 */                      contentValues12.put("app_id", zzidVar11.zzA());
/* 2879 */                      contentValues12.put("metadata_fingerprint", Long.valueOf(jM1694k11));
/* 2884 */                      contentValues12.put("metadata", bArrZzcc111);
/* 2895 */                      ae3VarM6755f2.m261q0().insertWithOnConflict("raw_events_metadata", null, contentValues12, 4);
/* 2898 */                      ae3VarM6755f3 = mp3Var.m6755f0();
/* 2902 */                      zzbe zzbeVar12 = oe3Var2.f14732f;
/* 2904 */                      Objects.requireNonNull(zzbeVar12);
/* 2913 */                      it2 = zzbeVar12.f4207a.keySet().iterator();
                                while (true) {
/* 2921 */                          if (it2.hasNext()) {
/* 2937 */                              vi3 vi3VarM6754e11 = mp3Var.m6754e0();
/* 2941 */                              String str312 = oe3Var2.f14727a;
/* 2945 */                              zM9290P = vi3VarM6754e11.m9290P(str312, oe3Var2.f14728b);
/* 2967 */                              ud3 ud3VarM223F10 = mp3Var.m6755f0().m223F0(false, false, false, false, str312, mp3Var.m6756g());
/* 2973 */                              if (zM9290P) {
                                        }
/* 2993 */                              i3 = i;
                                        break;
                                    }
/* 2933 */                          if ("_r".equals(it2.next())) {
                                    }
/* 2935 */                          i3 = 1;
                                    break;
                                }
/* 2994 */                      ae3VarM6755f3.mo1375y();
/* 2997 */                      ae3VarM6755f3.m9593A();
/* 3000 */                      str15 = oe3Var2.f14727a;
/* 3002 */                      kb1.m6058k(str15);
/* 3015 */                      byte[] bArrZzcc112 = ae3VarM6755f3.f15676b.m6761i0().m1688b0(oe3Var2).zzcc();
/* 3021 */                      contentValues = new ContentValues();
/* 3024 */                      contentValues.put("app_id", str15);
/* 3031 */                      contentValues.put("name", oe3Var2.f14728b);
/* 3042 */                      contentValues.put("timestamp", Long.valueOf(oe3Var2.f14730d));
/* 3049 */                      contentValues.put("metadata_fingerprint", Long.valueOf(jM1694k11));
/* 3054 */                      contentValues.put(SharedDataContentProvider.BASE_PATH, bArrZzcc112);
/* 3063 */                      contentValues.put("realtime", Integer.valueOf(i3));
/* 3081 */                      if (ae3VarM6755f3.m261q0().insert("raw_events", null, contentValues) == -1) {
/* 3101 */                          ((ij3) ae3VarM6755f3.f16749a).mo4557a().m9016D().m8511b(uh3.m9013H(str15), "Failed to insert raw event (got -1). appId");
                                } else {
/* 3109 */                          mp3Var.f13908Z = 0L;
                                }
/* 3190 */                      mp3Var.m6755f0().m259o0();
/* 3197 */                      mp3Var.m6755f0().m260p0();
/* 3200 */                      mp3Var.m6739L();
/* 3231 */                      mp3Var.mo4557a().m9019G().m8511b(Long.valueOf(((System.nanoTime() - jNanoTime) + 500000) / 1000000), "Background event processing time, ms");
/* 3234 */                      return;
                            }
/* 2428 */                  str11 = str11;
/* 2434 */                  ij3Var2.m4568p().m4240B();
/* 2439 */                  zzicVarZzaE.zzF(Build.MODEL);
/* 2446 */                  ij3Var2.m4568p().m4240B();
/* 2451 */                  zzicVarZzaE.zzE(Build.VERSION.RELEASE);
/* 2463 */                  zzicVarZzaE.zzI((int) ij3Var2.m4568p().m6641D());
/* 2474 */                  zzicVarZzaE.zzH(ij3Var2.m4568p().m6642E());
/* 2481 */                  zzicVarZzaE.zzay(zzrVar.f4253h0);
/* 2488 */                  if (ij3Var2.m4560d()) {
/* 2490 */                      zzicVarZzaE.zzK();
/* 2498 */                      if (!TextUtils.isEmpty(null)) {
/* 2500 */                          zzicVarZzaE.zzam(null);
                                }
                            }
/* 2507 */                  di3VarM219D0 = m6755f0().m219D0(str6);
/* 2511 */                  if (di3VarM219D0 == null) {
/* 2517 */                      di3VarM219D0 = new di3(ij3Var2, str6);
/* 2520 */                      mp3Var = this;
/* 2526 */                      di3VarM219D0.m3095F(mp3Var.m6772o(ok3VarM7190j2));
/* 2531 */                      di3VarM219D0.m3100K(zzrVar.f4235V);
/* 2536 */                      di3VarM219D0.m3097H(str11);
/* 2543 */                      if (ok3VarM7190j2.m7189i(nk3Var)) {
/* 2553 */                          di3VarM219D0.m3098I(mp3Var.f13938w.m8815E(str6, z9));
                                }
/* 2562 */                      di3VarM219D0.m3113e(0L);
/* 2565 */                      di3VarM219D0.m3101L(0L);
/* 2568 */                      di3VarM219D0.m3102M(0L);
/* 2573 */                      di3VarM219D0.m3104O(str14);
/* 2578 */                      di3VarM219D0.m3106Q(j2);
/* 2583 */                      di3VarM219D0.m3107R(str13);
/* 2588 */                      di3VarM219D0.m3108S(j6);
/* 2593 */                      di3VarM219D0.m3109a(j8);
/* 2598 */                      di3VarM219D0.m3112d(z10);
/* 2603 */                      di3VarM219D0.m3111c(j4);
/* 2610 */                      i = 0;
/* 2611 */                      mp3Var.m6755f0().m221E0(di3VarM219D0, false);
                            } else {
/* 2615 */                      i = 0;
/* 2616 */                      mp3Var = this;
                            }
/* 2624 */                  if (ok3VarM7190j2.m7189i(nk3.ANALYTICS_STORAGE)) {
/* 2636 */                      String strM3094E12 = di3VarM219D0.m3094E();
/* 2640 */                      kb1.m6061n(strM3094E12);
/* 2643 */                      zzicVarZzaE.zzW(strM3094E12);
                            }
/* 2654 */                  if (!TextUtils.isEmpty(di3VarM219D0.m3099J())) {
/* 2656 */                      String strM3099J12 = di3VarM219D0.m3099J();
/* 2660 */                      kb1.m6061n(strM3099J12);
/* 2663 */                      zzicVarZzaE.zzah(strM3099J12);
                            }
/* 2670 */                  listM267w0 = mp3Var.m6755f0().m267w0(str6);
/* 2674 */                  i2 = i;
/* 2679 */                  while (i2 < listM267w0.size()) {
/* 2681 */                      zzit zzitVarZzm12 = zziu.zzm();
/* 2693 */                      zzitVarZzm12.zzb(((rp3) listM267w0.get(i2)).f16226c);
/* 2704 */                      zzitVarZzm12.zza(((rp3) listM267w0.get(i2)).f16227d);
/* 2719 */                      mp3Var.m6761i0().m1684X(zzitVarZzm12, ((rp3) listM267w0.get(i2)).f16228e);
/* 2722 */                      zzicVarZzaE.zzp(zzitVarZzm12);
/* 2739 */                      if ("_sid".equals(((rp3) listM267w0.get(i2)).f16226c)) {
/* 2743 */                          bj3 bj3Var118 = di3VarM219D0.f7242a.f9659i;
/* 2745 */                          ij3.m4555l(bj3Var118);
/* 2748 */                          bj3Var118.mo1375y();
/* 2757 */                          if (di3VarM219D0.f7264w != 0) {
/* 2759 */                              ci3VarM6761i0 = mp3Var.m6761i0();
/* 2767 */                              if (TextUtils.isEmpty(str12)) {
/* 2769 */                                  str16 = str12;
/* 2771 */                                  jM1694k0 = 0;
                                        } else {
/* 2780 */                                  str16 = str12;
/* 2786 */                                  jM1694k0 = ci3VarM6761i0.m1694k0(str16.getBytes(Charset.forName("UTF-8")));
                                        }
/* 2792 */                              bj3 bj3Var119 = di3VarM219D0.f7242a.f9659i;
/* 2794 */                              ij3.m4555l(bj3Var119);
/* 2797 */                              bj3Var119.mo1375y();
/* 2804 */                              if (jM1694k0 != di3VarM219D0.f7264w) {
/* 2806 */                                  zzicVarZzaE.zzav();
                                        }
                                    } else {
/* 2810 */                              str16 = str12;
                                    }
                                } else {
/* 2810 */                          str16 = str12;
                                }
/* 2812 */                      i2++;
/* 2814 */                      str12 = str16;
                            }
/* 2818 */                  ae3VarM6755f2 = mp3Var.m6755f0();
/* 2827 */                  zzid zzidVar12 = (zzid) zzicVarZzaE.zzbc();
/* 2829 */                  ae3VarM6755f2.mo1375y();
/* 2832 */                  ae3VarM6755f2.m9593A();
/* 2835 */                  kb1.m6061n(zzidVar12);
/* 2842 */                  kb1.m6058k(zzidVar12.zzA());
/* 2845 */                  byte[] bArrZzcc113 = zzidVar12.zzcc();
/* 2855 */                  long jM1694k12 = ae3VarM6755f2.f15676b.m6761i0().m1694k0(bArrZzcc113);
/* 2861 */                  ContentValues contentValues13 = new ContentValues();
/* 2870 */                  contentValues13.put("app_id", zzidVar12.zzA());
/* 2879 */                  contentValues13.put("metadata_fingerprint", Long.valueOf(jM1694k12));
/* 2884 */                  contentValues13.put("metadata", bArrZzcc113);
/* 2895 */                  ae3VarM6755f2.m261q0().insertWithOnConflict("raw_events_metadata", null, contentValues13, 4);
/* 2898 */                  ae3VarM6755f3 = mp3Var.m6755f0();
/* 2902 */                  zzbe zzbeVar13 = oe3Var2.f14732f;
/* 2904 */                  Objects.requireNonNull(zzbeVar13);
/* 2913 */                  it2 = zzbeVar13.f4207a.keySet().iterator();
                            while (true) {
/* 2921 */                      if (it2.hasNext()) {
/* 2937 */                          vi3 vi3VarM6754e12 = mp3Var.m6754e0();
/* 2941 */                          String str313 = oe3Var2.f14727a;
/* 2945 */                          zM9290P = vi3VarM6754e12.m9290P(str313, oe3Var2.f14728b);
/* 2967 */                          ud3 ud3VarM223F11 = mp3Var.m6755f0().m223F0(false, false, false, false, str313, mp3Var.m6756g());
/* 2973 */                          if (zM9290P) {
                                    }
/* 2993 */                          i3 = i;
                                    break;
                                }
/* 2933 */                      if ("_r".equals(it2.next())) {
                                }
/* 2935 */                      i3 = 1;
                                break;
                            }
/* 2994 */                  ae3VarM6755f3.mo1375y();
/* 2997 */                  ae3VarM6755f3.m9593A();
/* 3000 */                  str15 = oe3Var2.f14727a;
/* 3002 */                  kb1.m6058k(str15);
/* 3015 */                  byte[] bArrZzcc114 = ae3VarM6755f3.f15676b.m6761i0().m1688b0(oe3Var2).zzcc();
/* 3021 */                  contentValues = new ContentValues();
/* 3024 */                  contentValues.put("app_id", str15);
/* 3031 */                  contentValues.put("name", oe3Var2.f14728b);
/* 3042 */                  contentValues.put("timestamp", Long.valueOf(oe3Var2.f14730d));
/* 3049 */                  contentValues.put("metadata_fingerprint", Long.valueOf(jM1694k12));
/* 3054 */                  contentValues.put(SharedDataContentProvider.BASE_PATH, bArrZzcc114);
/* 3063 */                  contentValues.put("realtime", Integer.valueOf(i3));
/* 3081 */                  if (ae3VarM6755f3.m261q0().insert("raw_events", null, contentValues) == -1) {
/* 3101 */                      ((ij3) ae3VarM6755f3.f16749a).mo4557a().m9016D().m8511b(uh3.m9013H(str15), "Failed to insert raw event (got -1). appId");
                            } else {
/* 3109 */                      mp3Var.f13908Z = 0L;
                            }
/* 3190 */                  mp3Var.m6755f0().m259o0();
/* 3197 */                  mp3Var.m6755f0().m260p0();
/* 3200 */                  mp3Var.m6739L();
/* 3231 */                  mp3Var.mo4557a().m9019G().m8511b(Long.valueOf(((System.nanoTime() - jNanoTime) + 500000) / 1000000), "Background event processing time, ms");
/* 3234 */                  return;
/* 3239 */                  mp3Var.m6755f0().m260p0();
/* 3242 */                  throw th;
                        }
/* 1007 */              if (jIntValue % 1000 == 1) {
/* 1029 */                  mo4557a().m9016D().m8512c(uh3.m9013H(str5), "Data loss. Too many events logged. appId, count", Long.valueOf(ud3VarM225G0.f17478b));
                        }
/* 1036 */              m6755f0().m259o0();
/* 1589 */              m6755f0().m260p0();
                    } catch (Throwable th3) {
/* 494 */               th = th3;
/* 495 */               mp3Var = this;
                    }
                }

                /* JADX INFO: renamed from: l0 */
                public final void m6767l0(zzr zzrVar) {
/* 5 */             mo4558b().mo1375y();
/* 8 */             m6765k0();
/* 11 */            String str = zzrVar.f4240a;
/* 13 */            kb1.m6058k(str);
/* 20 */            ok3 ok3VarM7182c = ok3.m7182c(zzrVar.f4255i0, zzrVar.f4247d0);
/* 24 */            m6752d(str);
/* 35 */            mo4557a().f17534Y.m8512c(str, "Setting storage consent for package", ok3VarM7182c);
/* 42 */            mo4558b().mo1375y();
/* 45 */            m6765k0();
/* 50 */            this.f13928m0.put(str, ok3VarM7182c);
/* 53 */            ae3 ae3Var = this.f13913c;
/* 55 */            m6728S(ae3Var);
/* 58 */            ae3Var.m252g0(str, ok3VarM7182c);
                }

                /* JADX INFO: renamed from: m */
                public final void m6768m(di3 di3Var, zzic zzicVar) {
                    ac3 ac3Var;
                    zziu zziuVar;
                    rd3 rd3Var;
/* 9 */             mo4558b().mo1375y();
/* 12 */            m6765k0();
/* 15 */            String strZzaA = zzicVar.zzaA();
/* 23 */            EnumMap enumMap = new EnumMap(nk3.class);
/* 26 */            int length = strZzaA.length();
/* 34 */            int length2 = nk3.values().length;
/* 35 */            rd3 rd3Var2 = rd3.UNSET;
/* 37 */            int i = 0;
/* 38 */            if (length < length2 || strZzaA.charAt(0) != '1') {
/* 102 */               ac3Var = new ac3();
                    } else {
/* 49 */                nk3[] nk3VarArrValues = nk3.values();
/* 53 */                int length3 = nk3VarArrValues.length;
/* 54 */                int i2 = 0;
/* 55 */                int i3 = 1;
/* 56 */                while (i2 < length3) {
/* 58 */                    nk3 nk3Var = nk3VarArrValues[i2];
/* 60 */                    int i4 = i3 + 1;
/* 62 */                    char cCharAt = strZzaA.charAt(i3);
/* 66 */                    rd3[] rd3VarArrValues = rd3.values();
/* 70 */                    int length4 = rd3VarArrValues.length;
/* 71 */                    int i5 = i;
                            while (true) {
/* 72 */                        if (i5 >= length4) {
/* 85 */                            rd3Var = rd3Var2;
                                    break;
                                }
/* 74 */                        rd3Var = rd3VarArrValues[i5];
/* 78 */                        if (rd3Var.f16010a == cCharAt) {
                                    break;
                                } else {
/* 81 */                            i5++;
                                }
                            }
/* 86 */                    enumMap.put(nk3Var, rd3Var);
/* 89 */                    i2++;
/* 91 */                    i3 = i4;
/* 92 */                    i = 0;
                        }
/* 96 */                ac3Var = new ac3(enumMap);
                    }
/* 105 */           String strM3093D = di3Var.m3093D();
/* 113 */           mo4558b().mo1375y();
/* 116 */           m6765k0();
/* 119 */           ok3 ok3VarM6752d = m6752d(strM3093D);
/* 123 */           EnumMap enumMap2 = ok3VarM6752d.f14792a;
/* 125 */           nk3 nk3Var2 = nk3.AD_STORAGE;
/* 131 */           lk3 lk3Var = (lk3) enumMap2.get(nk3Var2);
/* 133 */           lk3 lk3Var2 = lk3.UNINITIALIZED;
/* 135 */           if (lk3Var == null) {
/* 137 */               lk3Var = lk3Var2;
                    }
/* 138 */           int i6 = ok3VarM6752d.f14793b;
/* 140 */           int iOrdinal = lk3Var.ordinal();
/* 144 */           rd3 rd3Var3 = rd3.REMOTE_ENFORCED_DEFAULT;
/* 146 */           rd3 rd3Var4 = rd3.FAILSAFE;
/* 151 */           if (iOrdinal == 1) {
/* 165 */               ac3Var.m202g(nk3Var2, rd3Var3);
                    } else if (iOrdinal == 2 || iOrdinal == 3) {
/* 161 */               ac3Var.m201f(nk3Var2, i6);
                    } else {
/* 157 */               ac3Var.m202g(nk3Var2, rd3Var4);
                    }
/* 168 */           nk3 nk3Var3 = nk3.ANALYTICS_STORAGE;
/* 174 */           lk3 lk3Var3 = (lk3) enumMap2.get(nk3Var3);
/* 176 */           if (lk3Var3 != null) {
/* 179 */               lk3Var2 = lk3Var3;
                    }
/* 180 */           int iOrdinal2 = lk3Var2.ordinal();
/* 185 */           if (iOrdinal2 == 1) {
/* 199 */               ac3Var.m202g(nk3Var3, rd3Var3);
                    } else if (iOrdinal2 == 2 || iOrdinal2 == 3) {
/* 195 */               ac3Var.m201f(nk3Var3, i6);
                    } else {
/* 191 */               ac3Var.m202g(nk3Var3, rd3Var4);
                    }
/* 202 */           String strM3093D2 = di3Var.m3093D();
/* 210 */           mo4558b().mo1375y();
/* 213 */           m6765k0();
/* 224 */           ce3 ce3VarM6775p0 = m6775p0(strM3093D2, m6771n0(strM3093D2), m6752d(strM3093D2), ac3Var);
/* 228 */           String str = ce3VarM6775p0.f2869d;
/* 230 */           Boolean bool = ce3VarM6775p0.f2868c;
/* 232 */           kb1.m6061n(bool);
/* 239 */           zzicVar.zzaD(bool.booleanValue());
/* 246 */           if (!TextUtils.isEmpty(str)) {
/* 248 */               zzicVar.zzaF(str);
                    }
/* 255 */           mo4558b().mo1375y();
/* 258 */           m6765k0();
/* 265 */           Iterator it = zzicVar.zzk().iterator();
/* 291 */           do {
/* 275 */               if (!it.hasNext()) {
/* 294 */                   zziuVar = null;
                            break;
                        }
/* 281 */               zziuVar = (zziu) it.next();
/* 291 */           } while (!"_npa".equals(zziuVar.zzc()));
/* 295 */           if (zziuVar != null) {
/* 299 */               EnumMap enumMap3 = (EnumMap) ac3Var.f184b;
/* 301 */               nk3 nk3Var4 = nk3.AD_PERSONALIZATION;
/* 307 */               rd3 rd3Var5 = (rd3) enumMap3.get(nk3Var4);
/* 309 */               if (rd3Var5 == null) {
/* 311 */                   rd3Var5 = rd3Var2;
                        }
/* 312 */               if (rd3Var5 == rd3Var2) {
/* 316 */                   ae3 ae3Var = this.f13913c;
/* 318 */                   m6728S(ae3Var);
/* 325 */                   rp3 rp3VarM266v0 = ae3Var.m266v0(di3Var.m3093D(), "_npa");
/* 329 */                   rd3 rd3Var6 = rd3.MANIFEST;
/* 331 */                   rd3 rd3Var7 = rd3.API;
/* 333 */                   if (rp3VarM266v0 != null) {
/* 335 */                       String str2 = rp3VarM266v0.f16225b;
/* 343 */                       if ("tcf".equals(str2)) {
/* 347 */                           ac3Var.m202g(nk3Var4, rd3.TCF);
                                } else if ("app".equals(str2)) {
/* 360 */                           ac3Var.m202g(nk3Var4, rd3Var7);
                                } else {
/* 365 */                           ac3Var.m202g(nk3Var4, rd3Var6);
                                }
                            } else {
/* 369 */                       Boolean boolM3131w = di3Var.m3131w();
/* 373 */                       if (boolM3131w == null || ((boolM3131w.booleanValue() && zziuVar.zzg() != 1) || !(boolM3131w.booleanValue() || zziuVar.zzg() == 0))) {
/* 412 */                           ac3Var.m202g(nk3Var4, rd3Var7);
                                } else {
/* 408 */                           ac3Var.m202g(nk3Var4, rd3Var6);
                                }
                            }
                        }
                    } else {
/* 420 */               int iM6732D = m6732D(di3Var.m3093D(), ac3Var);
/* 424 */               zzit zzitVarZzm = zziu.zzm();
/* 428 */               zzitVarZzm.zzb("_npa");
/* 437 */               ((xt0) mo4562f()).getClass();
/* 444 */               zzitVarZzm.zza(System.currentTimeMillis());
/* 448 */               zzitVarZzm.zze(iM6732D);
/* 457 */               zzicVar.zzo((zziu) zzitVarZzm.zzbc());
/* 474 */               mo4557a().f17534Y.m8512c("non_personalized_ads(_npa)", "Setting user property", Integer.valueOf(iM6732D));
                    }
/* 481 */           zzicVar.zzaB(ac3Var.toString());
/* 484 */           String strM3093D3 = di3Var.m3093D();
/* 488 */           vi3 vi3Var = this.f13909a;
/* 490 */           vi3Var.mo1375y();
/* 493 */           vi3Var.m9282F(strM3093D3);
/* 496 */           zzgf zzgfVarM9295U = vi3Var.m9295U(strM3093D3);
/* 518 */           boolean z = zzgfVarM9295U == null || !zzgfVarM9295U.zzd() || zzgfVarM9295U.zze();
/* 519 */           List listZzb = zzicVar.zzb();
/* 528 */           for (int i7 = 0; i7 < listZzb.size(); i7++) {
/* 546 */               if ("_tcf".equals(((zzhs) listZzb.get(i7)).zzd())) {
/* 558 */                   zzhr zzhrVar = (zzhr) ((zzhs) listZzb.get(i7)).zzcl();
/* 560 */                   List listZza = zzhrVar.zza();
/* 569 */                   for (int i8 = 0; i8 < listZza.size(); i8++) {
/* 587 */                       if ("_tcfd".equals(((zzhw) listZza.get(i8)).zzb())) {
/* 595 */                           String strZzd = ((zzhw) listZza.get(i8)).zzd();
/* 599 */                           if (z && strZzd.length() > 4) {
/* 609 */                               char[] charArray = strZzd.toCharArray();
/* 613 */                               int i9 = 1;
                                        while (true) {
/* 618 */                                   if (i9 >= 64) {
/* 634 */                                       i9 = 0;
                                                break;
                                            } else if (charArray[4] == "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i9)) {
                                                break;
                                            } else {
/* 631 */                                       i9++;
                                            }
                                        }
/* 642 */                               charArray[4] = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i9 | 1);
/* 644 */                               strZzd = String.valueOf(charArray);
                                    }
/* 648 */                           zzhv zzhvVarZzn = zzhw.zzn();
/* 652 */                           zzhvVarZzn.zzb("_tcfd");
/* 655 */                           zzhvVarZzn.zzd(strZzd);
/* 658 */                           zzhrVar.zze(i8, zzhvVarZzn);
                                    break;
                                }
                            }
/* 667 */                   zzicVar.zzf(i7, zzhrVar);
/* 670 */                   return;
                        }
                    }
                }

                /* JADX INFO: renamed from: m0 */
                public final void m6769m0(zzr zzrVar) {
/* 5 */             mo4558b().mo1375y();
/* 8 */             m6765k0();
/* 11 */            String str = zzrVar.f4240a;
/* 13 */            kb1.m6058k(str);
/* 18 */            ce3 ce3VarM1646b = ce3.m1646b(zzrVar.f4256j0);
/* 30 */            mo4557a().f17534Y.m8512c(str, "Setting DMA consent for package", ce3VarM1646b);
/* 37 */            mo4558b().mo1375y();
/* 40 */            m6765k0();
/* 53 */            lk3 lk3VarM1648a = ce3.m1647c(100, m6773o0(str)).m1648a();
/* 59 */            this.f13929n0.put(str, ce3VarM1646b);
/* 62 */            ae3 ae3Var = this.f13913c;
/* 64 */            m6728S(ae3Var);
/* 67 */            kb1.m6061n(str);
/* 70 */            kb1.m6061n(ce3VarM1646b);
/* 73 */            ae3Var.mo1375y();
/* 76 */            ae3Var.m9593A();
/* 79 */            ok3 ok3VarM241U = ae3Var.m241U(str);
/* 83 */            ok3 ok3Var = ok3.f14791c;
/* 85 */            if (ok3VarM241U == ok3Var) {
/* 87 */                ae3Var.m252g0(str, ok3Var);
                    }
/* 92 */            ContentValues contentValues = new ContentValues();
/* 97 */            contentValues.put("app_id", str);
/* 104 */           contentValues.put("dma_consent_settings", ce3VarM1646b.f2867b);
/* 107 */           ae3Var.m245Y(contentValues);
/* 118 */           lk3 lk3VarM1648a2 = ce3.m1647c(100, m6773o0(str)).m1648a();
/* 126 */           mo4558b().mo1375y();
/* 129 */           m6765k0();
/* 133 */           lk3 lk3Var = lk3.GRANTED;
/* 136 */           lk3 lk3Var2 = lk3.DENIED;
/* 144 */           boolean z = lk3VarM1648a == lk3Var2 && lk3VarM1648a2 == lk3Var;
/* 145 */           boolean z2 = lk3VarM1648a == lk3Var && lk3VarM1648a2 == lk3Var2;
/* 151 */           if (z || z2) {
/* 165 */               mo4557a().f17534Y.m8511b(str, "Generated _dcu event for");
/* 170 */               Bundle bundle = new Bundle();
/* 173 */               ae3 ae3Var2 = this.f13913c;
/* 175 */               m6728S(ae3Var2);
/* 205 */               if (ae3Var2.m223F0(false, false, false, false, str, m6756g()).f17482f < m6753d0().m7404H(str, vg3.f18150m0)) {
/* 211 */                   bundle.putLong("_r", 1L);
/* 214 */                   ae3 ae3Var3 = this.f13913c;
/* 216 */                   m6728S(ae3Var3);
/* 245 */                   mo4557a().f17534Y.m8512c(str, "_dcu realtime event count", Long.valueOf(ae3Var3.m223F0(false, false, true, false, str, m6756g()).f17482f));
                        }
/* 252 */               this.f13936u0.m200e(str, "_dcu", bundle);
                    }
                }

                /* JADX INFO: renamed from: n */
                public final void m6770n(di3 di3Var, zzic zzicVar) {
                    Serializable serializableM1666O;
/* 9 */             mo4558b().mo1375y();
/* 12 */            m6765k0();
/* 15 */            zzgx zzgxVarZzr = zzha.zzr();
/* 19 */            ij3 ij3Var = di3Var.f7242a;
/* 21 */            bj3 bj3Var = ij3Var.f9659i;
/* 23 */            ij3.m4555l(bj3Var);
/* 26 */            bj3Var.mo1375y();
/* 29 */            byte[] bArr = di3Var.f7230H;
/* 31 */            if (bArr != null) {
                        try {
/* 37 */                    zzgxVarZzr = (zzgx) ci3.m1677m0(zzgxVarZzr, bArr);
                        } catch (zzmq unused) {
/* 57 */                    mo4557a().f17541w.m8511b(uh3.m9013H(di3Var.m3093D()), "Failed to parse locally stored ad campaign info. appId");
                        }
                    }
/* 64 */            Iterator it = zzicVar.zzb().iterator();
                    while (true) {
/* 73 */                if (!it.hasNext()) {
                            break;
                        }
/* 79 */                zzhs zzhsVar = (zzhs) it.next();
/* 91 */                if (zzhsVar.zzd().equals("_cmp")) {
/* 95 */                    zzhw zzhwVarM1661H = ci3.m1661H(zzhsVar, "gclid");
/* 103 */                   Serializable serializableM1666O2 = zzhwVarM1661H == null ? null : ci3.m1666O(zzhwVarM1661H);
/* 107 */                   Serializable serializable = HttpUrl.FRAGMENT_ENCODE_SET;
/* 109 */                   if (serializableM1666O2 == null) {
/* 111 */                       serializableM1666O2 = HttpUrl.FRAGMENT_ENCODE_SET;
                            }
/* 112 */                   String str = (String) serializableM1666O2;
/* 116 */                   zzhw zzhwVarM1661H2 = ci3.m1661H(zzhsVar, "gbraid");
/* 124 */                   Serializable serializableM1666O3 = zzhwVarM1661H2 == null ? null : ci3.m1666O(zzhwVarM1661H2);
/* 128 */                   if (serializableM1666O3 == null) {
/* 130 */                       serializableM1666O3 = HttpUrl.FRAGMENT_ENCODE_SET;
                            }
/* 131 */                   String str2 = (String) serializableM1666O3;
/* 135 */                   zzhw zzhwVarM1661H3 = ci3.m1661H(zzhsVar, "gad_source");
/* 143 */                   Serializable serializableM1666O4 = zzhwVarM1661H3 == null ? null : ci3.m1666O(zzhwVarM1661H3);
/* 147 */                   if (serializableM1666O4 != null) {
/* 150 */                       serializable = serializableM1666O4;
                            }
/* 151 */                   String str3 = (String) serializable;
/* 163 */                   String[] strArrSplit = ((String) vg3.f18138h1.m9011a(null)).split(",");
/* 167 */                   m6761i0();
/* 172 */                   HashMap map = new HashMap();
/* 187 */                   for (zzhw zzhwVar : zzhsVar.zza()) {
/* 207 */                       if (Arrays.asList(strArrSplit).contains(zzhwVar.zzb()) && (serializableM1666O = ci3.m1666O(zzhwVar)) != null) {
/* 219 */                           map.put(zzhwVar.zzb(), serializableM1666O);
                                }
                            }
/* 227 */                   if (!map.isEmpty()) {
/* 237 */                       zzhw zzhwVarM1661H4 = ci3.m1661H(zzhsVar, "click_timestamp");
/* 245 */                       Serializable serializableM1666O5 = zzhwVarM1661H4 == null ? null : ci3.m1666O(zzhwVarM1661H4);
/* 255 */                       long jLongValue = ((Long) (serializableM1666O5 != null ? serializableM1666O5 : 0L)).longValue();
/* 261 */                       if (jLongValue <= 0) {
/* 263 */                           jLongValue = zzhsVar.zzf();
                                }
/* 269 */                       zzhw zzhwVarM1661H5 = ci3.m1661H(zzhsVar, "_cis");
/* 286 */                       if ("referrer API v2".equals(zzhwVarM1661H5 != null ? ci3.m1666O(zzhwVarM1661H5) : null)) {
/* 294 */                           if (jLongValue > zzgxVarZzr.zzo()) {
/* 300 */                               if (str.isEmpty()) {
/* 302 */                                   zzgxVarZzr.zzj();
                                        } else {
/* 306 */                                   zzgxVarZzr.zzi(str);
                                        }
/* 313 */                               if (str2.isEmpty()) {
/* 315 */                                   zzgxVarZzr.zzl();
                                        } else {
/* 319 */                                   zzgxVarZzr.zzk(str2);
                                        }
/* 326 */                               if (str3.isEmpty()) {
/* 328 */                                   zzgxVarZzr.zzn();
                                        } else {
/* 332 */                                   zzgxVarZzr.zzm(str3);
                                        }
/* 335 */                               zzgxVarZzr.zzp(jLongValue);
/* 338 */                               zzgxVarZzr.zzs();
/* 345 */                               zzgxVarZzr.zzt(m6733E(zzhsVar));
                                    }
                                } else if (jLongValue > zzgxVarZzr.zzg()) {
/* 362 */                           if (str.isEmpty()) {
/* 364 */                               zzgxVarZzr.zzb();
                                    } else {
/* 368 */                               zzgxVarZzr.zza(str);
                                    }
/* 375 */                           if (str2.isEmpty()) {
/* 377 */                               zzgxVarZzr.zzd();
                                    } else {
/* 381 */                               zzgxVarZzr.zzc(str2);
                                    }
/* 388 */                           if (str3.isEmpty()) {
/* 390 */                               zzgxVarZzr.zzf();
                                    } else {
/* 394 */                               zzgxVarZzr.zze(str3);
                                    }
/* 397 */                           zzgxVarZzr.zzh(jLongValue);
/* 400 */                           zzgxVarZzr.zzq();
/* 407 */                           zzgxVarZzr.zzr(m6733E(zzhsVar));
                                }
                            }
                        }
                    }
/* 426 */           if (!((zzha) zzgxVarZzr.zzbc()).equals(zzha.zzs())) {
/* 436 */               zzicVar.zzaM((zzha) zzgxVarZzr.zzbc());
                    }
/* 445 */           byte[] bArrZzcc = ((zzha) zzgxVarZzr.zzbc()).zzcc();
/* 449 */           bj3 bj3Var2 = ij3Var.f9659i;
/* 451 */           ij3.m4555l(bj3Var2);
/* 454 */           bj3Var2.mo1375y();
/* 468 */           di3Var.f7239Q |= di3Var.f7230H != bArrZzcc;
/* 470 */           di3Var.f7230H = bArrZzcc;
/* 476 */           if (di3Var.m3123o()) {
/* 478 */               ae3 ae3Var = this.f13913c;
/* 480 */               m6728S(ae3Var);
/* 483 */               ae3Var.m221E0(di3Var, false);
                    }
/* 496 */           if (m6753d0().m7406J(null, vg3.f18135g1)) {
/* 498 */               ae3 ae3Var2 = this.f13913c;
/* 500 */               m6728S(ae3Var2);
/* 509 */               ae3Var2.m264t0(di3Var.m3093D(), "_lgclid");
                    }
                }

                /* JADX INFO: renamed from: n0 */
                public final ce3 m6771n0(String str) {
/* 5 */             mo4558b().mo1375y();
/* 8 */             m6765k0();
/* 11 */            HashMap map = this.f13929n0;
/* 17 */            ce3 ce3Var = (ce3) map.get(str);
/* 19 */            if (ce3Var != null) {
/* 53 */                return ce3Var;
                    }
/* 21 */            ae3 ae3Var = this.f13913c;
/* 23 */            m6728S(ae3Var);
/* 26 */            kb1.m6061n(str);
/* 29 */            ae3Var.mo1375y();
/* 32 */            ae3Var.m9593A();
/* 45 */            ce3 ce3VarM1646b = ce3.m1646b(ae3Var.m244X("select dma_consent_settings from consent_settings where app_id=? limit 1;", new String[]{str}));
/* 49 */            map.put(str, ce3VarM1646b);
/* 52 */            return ce3VarM1646b;
                }

                /* JADX INFO: renamed from: o */
                public final String m6772o(ok3 ok3Var) {
/* 7 */             if (!ok3Var.m7189i(nk3.ANALYTICS_STORAGE)) {
/* 43 */                return null;
                    }
/* 11 */            byte[] bArr = new byte[16];
/* 21 */            m6763j0().m9116w0().nextBytes(bArr);
/* 38 */            return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r11v2 */
                /* JADX WARN: Type inference failed for: r11v6 */
                /* JADX WARN: Type inference failed for: r11v7 */
                /* JADX INFO: renamed from: o0 */
                public final Bundle m6773o0(String str) {
/* 5 */             mo4558b().mo1375y();
/* 8 */             m6765k0();
/* 11 */            vi3 vi3Var = this.f13909a;
/* 13 */            m6728S(vi3Var);
/* 21 */            if (vi3Var.m9295U(str) == null) {
/* 20 */                return null;
                    }
/* 26 */            Bundle bundle = new Bundle();
/* 29 */            ok3 ok3VarM6752d = m6752d(str);
/* 35 */            Bundle bundle2 = new Bundle();
/* 44 */            Iterator it = ok3VarM6752d.f14792a.entrySet().iterator();
                    while (true) {
/* 58 */                if (!it.hasNext()) {
                            break;
                        }
/* 64 */                Map.Entry entry = (Map.Entry) it.next();
/* 72 */                int iOrdinal = ((lk3) entry.getValue()).ordinal();
/* 80 */                String str2 = iOrdinal != 2 ? iOrdinal != 3 ? null : "granted" : "denied";
/* 83 */                if (str2 != null) {
/* 93 */                    bundle2.putString(((nk3) entry.getKey()).f14353a, str2);
                        }
                    }
/* 97 */            bundle.putAll(bundle2);
/* 109 */           ce3 ce3VarM6775p0 = m6775p0(str, m6771n0(str), ok3VarM6752d, new ac3());
/* 115 */           Bundle bundle3 = new Bundle();
/* 132 */           for (Map.Entry entry2 : ce3VarM6775p0.f2870e.entrySet()) {
/* 146 */               int iOrdinal2 = ((lk3) entry2.getValue()).ordinal();
/* 154 */               String str3 = iOrdinal2 != 2 ? iOrdinal2 != 3 ? null : "granted" : "denied";
/* 159 */               if (str3 != null) {
/* 169 */                   bundle3.putString(((nk3) entry2.getKey()).f14353a, str3);
                        }
                    }
/* 173 */           Boolean bool = ce3VarM6775p0.f2868c;
/* 175 */           if (bool != null) {
/* 183 */               bundle3.putString("is_dma_region", bool.toString());
                    }
/* 186 */           String str4 = ce3VarM6775p0.f2869d;
/* 188 */           if (str4 != null) {
/* 192 */               bundle3.putString("cps_display_str", str4);
                    }
/* 195 */           bundle.putAll(bundle3);
/* 198 */           ae3 ae3Var = this.f13913c;
/* 200 */           m6728S(ae3Var);
/* 205 */           rp3 rp3VarM266v0 = ae3Var.m266v0(str, "_npa");
/* 239 */           bundle.putString("ad_personalization", 1 != (rp3VarM266v0 != null ? rp3VarM266v0.f16228e.equals(1L) : m6732D(str, new ac3())) ? "granted" : "denied");
/* 242 */           return bundle;
                }

                /* JADX INFO: renamed from: p */
                public final void m6774p(ArrayList arrayList) {
/* 7 */             kb1.m6054g(!arrayList.isEmpty());
/* 12 */            if (this.f13925j0 != null) {
/* 22 */                mo4557a().f17538f.m8510a("Set uploading progress before finishing the previous upload");
                    } else {
/* 31 */                this.f13925j0 = new ArrayList(arrayList);
                    }
                }

                /* JADX INFO: renamed from: p0 */
                public final ce3 m6775p0(String str, ce3 ce3Var, ok3 ok3Var, ac3 ac3Var) {
                    nk3 nk3VarM9279K;
                    lk3 lk3VarM9280D;
/* 1 */             vi3 vi3Var = this.f13909a;
/* 3 */             m6728S(vi3Var);
/* 6 */             zzgf zzgfVarM9295U = vi3Var.m9295U(str);
/* 12 */            int i = 90;
/* 14 */            lk3 lk3Var = lk3.DENIED;
/* 16 */            nk3 nk3Var = nk3.AD_USER_DATA;
/* 18 */            if (zzgfVarM9295U == null) {
/* 24 */                if (ce3Var.m1648a() == lk3Var) {
/* 26 */                    i = ce3Var.f2866a;
/* 28 */                    ac3Var.m201f(nk3Var, i);
                        } else {
/* 34 */                    ac3Var.m202g(nk3Var, rd3.FAILSAFE);
                        }
/* 43 */                return new ce3(Boolean.FALSE, i, Boolean.TRUE, "-");
                    }
/* 47 */            lk3 lk3VarM1648a = ce3Var.m1648a();
/* 53 */            lk3 lk3Var2 = lk3.GRANTED;
/* 55 */            if (lk3VarM1648a == lk3Var2 || lk3VarM1648a == lk3Var) {
/* 181 */               i = ce3Var.f2866a;
/* 183 */               ac3Var.m201f(nk3Var, i);
                    } else {
/* 61 */                lk3 lk3Var3 = lk3.POLICY;
/* 63 */                lk3 lk3Var4 = lk3.UNINITIALIZED;
/* 65 */                if (lk3VarM1648a != lk3Var3 || (lk3VarM9280D = vi3Var.m9280D(str, nk3Var)) == lk3Var4) {
/* 81 */                    vi3Var.mo1375y();
/* 84 */                    vi3Var.m9282F(str);
/* 87 */                    zzgf zzgfVarM9295U2 = vi3Var.m9295U(str);
/* 91 */                    if (zzgfVarM9295U2 != null) {
/* 98 */                        Iterator it = zzgfVarM9295U2.zzb().iterator();
                                while (true) {
/* 106 */                           if (!it.hasNext()) {
/* 133 */                               nk3VarM9279K = null;
                                        break;
                                    }
/* 112 */                           zzfw zzfwVar = (zzfw) it.next();
/* 122 */                           if (nk3Var == vi3.m9279K(zzfwVar.zzb())) {
/* 128 */                               nk3VarM9279K = vi3.m9279K(zzfwVar.zzc());
                                        break;
                                    }
                                }
                            } else {
/* 133 */                       nk3VarM9279K = null;
                                break;
                            }
/* 134 */                   EnumMap enumMap = ok3Var.f14792a;
/* 136 */                   nk3 nk3Var2 = nk3.AD_STORAGE;
/* 142 */                   lk3 lk3Var5 = (lk3) enumMap.get(nk3Var2);
/* 144 */                   if (lk3Var5 != null) {
/* 147 */                       lk3Var4 = lk3Var5;
                            }
/* 154 */                   boolean z = lk3Var4 == lk3Var2 || lk3Var4 == lk3Var;
/* 155 */                   if (nk3VarM9279K == nk3Var2 && z) {
/* 161 */                       ac3Var.m202g(nk3Var, rd3.REMOTE_DELEGATION);
/* 164 */                       lk3VarM1648a = lk3Var4;
                            } else {
/* 168 */                       ac3Var.m202g(nk3Var, rd3.REMOTE_DEFAULT);
/* 179 */                       lk3VarM1648a = true != vi3Var.m9294T(str, nk3Var) ? lk3Var : lk3Var2;
                            }
                        } else {
/* 75 */                    ac3Var.m202g(nk3Var, rd3.REMOTE_ENFORCED_DEFAULT);
/* 78 */                    lk3VarM1648a = lk3VarM9280D;
                        }
                    }
/* 186 */           vi3Var.mo1375y();
/* 189 */           vi3Var.m9282F(str);
/* 192 */           zzgf zzgfVarM9295U3 = vi3Var.m9295U(str);
/* 196 */           boolean z2 = zzgfVarM9295U3 == null || !zzgfVarM9295U3.zzd() || zzgfVarM9295U3.zze();
/* 212 */           m6728S(vi3Var);
/* 215 */           vi3Var.mo1375y();
/* 218 */           vi3Var.m9282F(str);
/* 223 */           TreeSet treeSet = new TreeSet();
/* 226 */           zzgf zzgfVarM9295U4 = vi3Var.m9295U(str);
/* 230 */           if (zzgfVarM9295U4 != null) {
/* 237 */               Iterator it2 = zzgfVarM9295U4.zzc().iterator();
/* 245 */               while (it2.hasNext()) {
/* 257 */                   treeSet.add(((zzgc) it2.next()).zza());
                        }
                    }
/* 261 */           if (lk3VarM1648a == lk3Var || treeSet.isEmpty()) {
/* 298 */               return new ce3(Boolean.FALSE, i, Boolean.valueOf(z2), "-");
                    }
/* 272 */           Boolean bool = Boolean.TRUE;
/* 274 */           Boolean boolValueOf = Boolean.valueOf(z2);
/* 278 */           String strJoin = HttpUrl.FRAGMENT_ENCODE_SET;
/* 280 */           if (z2) {
/* 282 */               strJoin = TextUtils.join(HttpUrl.FRAGMENT_ENCODE_SET, treeSet);
                    }
/* 286 */           return new ce3(bool, i, boolValueOf, strJoin);
                }

                /* JADX WARN: Code duplicated, block: B:73:0x01ad A[Catch: all -> 0x0028, TryCatch #4 {all -> 0x0028, blocks: (B:3:0x000e, B:5:0x001b, B:8:0x002b, B:10:0x0031, B:11:0x003e, B:13:0x0046, B:14:0x004b, B:16:0x0056, B:17:0x0063, B:19:0x006e, B:20:0x007e, B:22:0x00aa, B:24:0x00b0, B:25:0x00b3, B:27:0x00cc, B:28:0x00e1, B:30:0x00f2, B:32:0x00f8, B:35:0x010d, B:45:0x012c, B:47:0x0131, B:48:0x0134, B:49:0x0135, B:50:0x013a, B:55:0x017f, B:71:0x01a7, B:73:0x01ad, B:75:0x01b8, B:79:0x01c3, B:80:0x01c6, B:33:0x00fd, B:37:0x0111, B:42:0x0119), top: B:91:0x000e, inners: #2 }] */
                /* JADX WARN: Code duplicated, block: B:75:0x01b8 A[Catch: all -> 0x0028, TRY_LEAVE, TryCatch #4 {all -> 0x0028, blocks: (B:3:0x000e, B:5:0x001b, B:8:0x002b, B:10:0x0031, B:11:0x003e, B:13:0x0046, B:14:0x004b, B:16:0x0056, B:17:0x0063, B:19:0x006e, B:20:0x007e, B:22:0x00aa, B:24:0x00b0, B:25:0x00b3, B:27:0x00cc, B:28:0x00e1, B:30:0x00f2, B:32:0x00f8, B:35:0x010d, B:45:0x012c, B:47:0x0131, B:48:0x0134, B:49:0x0135, B:50:0x013a, B:55:0x017f, B:71:0x01a7, B:73:0x01ad, B:75:0x01b8, B:79:0x01c3, B:80:0x01c6, B:33:0x00fd, B:37:0x0111, B:42:0x0119), top: B:91:0x000e, inners: #2 }] */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r11v0, types: [mp3] */
                /* JADX WARN: Type inference failed for: r1v13, types: [long] */
                /* JADX WARN: Type inference failed for: r1v14 */
                /* JADX WARN: Type inference failed for: r1v18 */
                /* JADX WARN: Type inference failed for: r1v19 */
                /* JADX WARN: Type inference failed for: r1v23, types: [android.database.Cursor] */
                /* JADX WARN: Type inference failed for: r1v26, types: [android.database.Cursor] */
                /* JADX WARN: Type inference failed for: r7v0 */
                /* JADX WARN: Type inference failed for: r7v1 */
                /* JADX WARN: Type inference failed for: r7v2, types: [android.database.Cursor] */
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                /* JADX INFO: renamed from: q */
                public final void m6776q() {
                    SQLiteException e;
                    di3 di3VarM219D0;
/* 5 */             mo4558b().mo1375y();
/* 8 */             m6765k0();
/* 12 */            this.f13921g0 = true;
                    try {
/* 15 */                ij3 ij3Var = this.f13905W;
/* 17 */                ij3Var.getClass();
/* 24 */                Boolean bool = ij3Var.m4567o().f15189e;
/* 26 */                if (bool == null) {
/* 36 */                    mo4557a().f17541w.m8510a("Upload data called on the client side before use of service was decided");
                        } else if (bool.booleanValue()) {
/* 58 */                    mo4557a().f17538f.m8510a("Upload called in the client side when service should be used");
                        } else if (this.f13908Z > 0) {
/* 71 */                    m6739L();
                        } else {
/* 80 */                    mo4558b().mo1375y();
/* 85 */                    if (this.f13925j0 != null) {
/* 95 */                        mo4557a().f17534Y.m8510a("Uploading requested multiple times");
                            } else {
/* 100 */                       ci3 ci3Var = this.f13911b;
/* 102 */                       m6728S(ci3Var);
/* 109 */                       if (ci3Var.m1683T()) {
/* 133 */                           ((xt0) mo4562f()).getClass();
/* 136 */                           ?? CurrentTimeMillis = System.currentTimeMillis();
/* 146 */                           ?? r7 = 0;
/* 146 */                           cursorRawQuery = null;
/* 146 */                           Cursor cursorRawQuery = null;
/* 146 */                           string = null;
/* 146 */                           string = null;
/* 146 */                           String string = null;
/* 147 */                           int iM7404H = m6753d0().m7404H(null, vg3.f18140i0);
/* 151 */                           m6753d0();
/* 166 */                           long jLongValue = CurrentTimeMillis - ((Long) vg3.f18127e.m9011a(null)).longValue();
/* 169 */                           for (int i = 0; i < iM7404H && m6735G(null, jLongValue); i++) {
                                    }
/* 180 */                           zzql.zza();
/* 187 */                           mo4558b().mo1375y();
/* 190 */                           m6734F();
/* 197 */                           long jM4932a = this.f13938w.f17198v.m4932a();
/* 203 */                           if (jM4932a != 0) {
/* 223 */                               mo4557a().f17533X.m8511b(Long.valueOf(Math.abs(CurrentTimeMillis - jM4932a)), "Uploading events. Elapsed time since last upload attempt (ms)");
                                    }
/* 226 */                           ae3 ae3Var = this.f13913c;
/* 228 */                           m6728S(ae3Var);
/* 231 */                           String strM226H = ae3Var.m226H();
/* 239 */                           long j = -1;
/* 241 */                           if (TextUtils.isEmpty(strM226H)) {
                                        try {
/* 315 */                                   this.f13927l0 = -1L;
/* 317 */                                   ae3 ae3Var2 = this.f13913c;
/* 319 */                                   m6728S(ae3Var2);
/* 322 */                                   m6753d0();
/* 337 */                                   long jLongValue2 = CurrentTimeMillis - ((Long) vg3.f18127e.m9011a(null)).longValue();
/* 338 */                                   ae3Var2.mo1375y();
/* 341 */                                   ae3Var2.m9593A();
                                            try {
/* 358 */                                       CurrentTimeMillis = ae3Var2.m261q0().rawQuery("select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;", new String[]{String.valueOf(jLongValue2)});
                                                try {
/* 366 */                                           if (CurrentTimeMillis.moveToFirst()) {
/* 392 */                                               string = CurrentTimeMillis.getString(0);
                                                    } else {
/* 372 */                                               uh3 uh3Var = ((ij3) ae3Var2.f16749a).f9655f;
/* 374 */                                               ij3.m4555l(uh3Var);
/* 381 */                                               uh3Var.f17534Y.m8510a("No expired configs for apps with pending events");
                                                    }
                                                } catch (SQLiteException e2) {
/* 390 */                                           e = e2;
/* 409 */                                           uh3 uh3Var2 = ((ij3) ae3Var2.f16749a).f9655f;
/* 411 */                                           ij3.m4555l(uh3Var2);
/* 418 */                                           uh3Var2.f17538f.m8511b(e, "Error selecting expired configs");
/* 421 */                                           if (CurrentTimeMillis != 0) {
                                                    }
/* 428 */                                           if (!TextUtils.isEmpty(string)) {
/* 430 */                                               ae3 ae3Var3 = this.f13913c;
/* 432 */                                               m6728S(ae3Var3);
/* 435 */                                               di3VarM219D0 = ae3Var3.m219D0(string);
/* 439 */                                               if (di3VarM219D0 != null) {
/* 441 */                                                   m6784y(di3VarM219D0);
                                                        }
                                                    }
/* 444 */                                           this.f13921g0 = false;
/* 446 */                                           m6740M();
                                                }
                                            } catch (SQLiteException e3) {
/* 403 */                                       e = e3;
/* 404 */                                       CurrentTimeMillis = 0;
                                            } catch (Throwable th) {
/* 400 */                                       th = th;
/* 450 */                                       if (r7 != 0) {
/* 452 */                                           r7.close();
                                                }
/* 455 */                                       throw th;
                                            }
/* 384 */                                   CurrentTimeMillis.close();
/* 428 */                                   if (!TextUtils.isEmpty(string)) {
/* 430 */                                       ae3 ae3Var4 = this.f13913c;
/* 432 */                                       m6728S(ae3Var4);
/* 435 */                                       di3VarM219D0 = ae3Var4.m219D0(string);
/* 439 */                                       if (di3VarM219D0 != null) {
/* 441 */                                           m6784y(di3VarM219D0);
                                                }
                                            }
                                        } catch (Throwable th2) {
/* 388 */                                   th = th2;
/* 397 */                                   r7 = CurrentTimeMillis;
                                        }
                                    } else {
/* 247 */                               if (this.f13927l0 == -1) {
/* 249 */                                   ae3 ae3Var5 = this.f13913c;
/* 251 */                                   m6728S(ae3Var5);
                                            try {
                                                try {
/* 260 */                                           cursorRawQuery = ae3Var5.m261q0().rawQuery("select rowid from raw_events order by rowid desc limit 1;", null);
/* 268 */                                           if (cursorRawQuery.moveToFirst()) {
/* 274 */                                               j = cursorRawQuery.getLong(0);
                                                    }
                                                } catch (SQLiteException e4) {
/* 286 */                                           uh3 uh3Var3 = ((ij3) ae3Var5.f16749a).f9655f;
/* 288 */                                           ij3.m4555l(uh3Var3);
/* 295 */                                           uh3Var3.f17538f.m8511b(e4, "Error querying raw events");
/* 298 */                                           if (cursorRawQuery != null) {
                                                    }
/* 301 */                                           this.f13927l0 = j;
/* 310 */                                           m6777r(strM226H, CurrentTimeMillis);
/* 444 */                                           this.f13921g0 = false;
/* 446 */                                           m6740M();
                                                }
/* 270 */                                       cursorRawQuery.close();
/* 301 */                                       this.f13927l0 = j;
                                            } catch (Throwable th3) {
/* 304 */                                       if (cursorRawQuery != null) {
/* 306 */                                           cursorRawQuery.close();
                                                }
/* 309 */                                       throw th3;
                                            }
                                        }
/* 310 */                               m6777r(strM226H, CurrentTimeMillis);
                                    }
                                } else {
/* 119 */                           mo4557a().f17534Y.m8510a("Network not connected, ignoring upload request");
/* 122 */                           m6739L();
                                }
                            }
                        }
/* 444 */               this.f13921g0 = false;
/* 446 */               m6740M();
                    } catch (Throwable th4) {
/* 456 */               this.f13921g0 = false;
/* 458 */               m6740M();
/* 461 */               throw th4;
                    }
                }

                /* JADX WARN: Code duplicated, block: B:113:0x022a  */
                /* JADX WARN: Code duplicated, block: B:115:0x023e  */
                /* JADX WARN: Code duplicated, block: B:117:0x024b  */
                /* JADX WARN: Code duplicated, block: B:119:0x0257  */
                /* JADX WARN: Code duplicated, block: B:149:0x0380  */
                /* JADX WARN: Code duplicated, block: B:154:0x03da  */
                /* JADX WARN: Code duplicated, block: B:179:0x045e A[LOOP:10: B:155:0x03dc->B:179:0x045e, LOOP_END] */
                /* JADX WARN: Code duplicated, block: B:17:0x006f A[PHI: r0 r11 r24
  0x006f: PHI (r0v113 java.util.List) = (r0v8 java.util.List), (r0v135 java.util.List) binds: [B:108:0x021e, B:16:0x006d] A[DONT_GENERATE, DONT_INLINE]
  0x006f: PHI (r11v50 android.database.Cursor) = (r11v5 android.database.Cursor), (r11v52 android.database.Cursor) binds: [B:108:0x021e, B:16:0x006d] A[DONT_GENERATE, DONT_INLINE]
  0x006f: PHI (r24v7 long) = (r24v2 long), (r24v8 long) binds: [B:108:0x021e, B:16:0x006d] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Code duplicated, block: B:180:0x0464  */
                /* JADX WARN: Code duplicated, block: B:191:0x0496  */
                /* JADX WARN: Code duplicated, block: B:195:0x04a4  */
                /* JADX WARN: Code duplicated, block: B:197:0x04b6  */
                /* JADX WARN: Code duplicated, block: B:203:0x04e5  */
                /* JADX WARN: Code duplicated, block: B:206:0x04f3  */
                /* JADX WARN: Code duplicated, block: B:208:0x050c  */
                /* JADX WARN: Code duplicated, block: B:210:0x050f  */
                /* JADX WARN: Code duplicated, block: B:212:0x0515 A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:213:0x0517  */
                /* JADX WARN: Code duplicated, block: B:214:0x0519  */
                /* JADX WARN: Code duplicated, block: B:215:0x051b  */
                /* JADX WARN: Code duplicated, block: B:216:0x051d  */
                /* JADX WARN: Code duplicated, block: B:217:0x0522  */
                /* JADX WARN: Code duplicated, block: B:220:0x0532  */
                /* JADX WARN: Code duplicated, block: B:222:0x0535  */
                /* JADX WARN: Code duplicated, block: B:223:0x0537  */
                /* JADX WARN: Code duplicated, block: B:228:0x0570  */
                /* JADX WARN: Code duplicated, block: B:230:0x0574  */
                /* JADX WARN: Code duplicated, block: B:234:0x057d  */
                /* JADX WARN: Code duplicated, block: B:237:0x058b  */
                /* JADX WARN: Code duplicated, block: B:240:0x0595  */
                /* JADX WARN: Code duplicated, block: B:245:0x05b1  */
                /* JADX WARN: Code duplicated, block: B:248:0x05b8  */
                /* JADX WARN: Code duplicated, block: B:251:0x05cd  */
                /* JADX WARN: Code duplicated, block: B:257:0x05fb  */
                /* JADX WARN: Code duplicated, block: B:260:0x0607  */
                /* JADX WARN: Code duplicated, block: B:264:0x0632  */
                /* JADX WARN: Code duplicated, block: B:266:0x0673  */
                /* JADX WARN: Code duplicated, block: B:268:0x0678  */
                /* JADX WARN: Code duplicated, block: B:270:0x0680  */
                /* JADX WARN: Code duplicated, block: B:273:0x0688  */
                /* JADX WARN: Code duplicated, block: B:275:0x068d  */
                /* JADX WARN: Code duplicated, block: B:278:0x069a  */
                /* JADX WARN: Code duplicated, block: B:282:0x06ad  */
                /* JADX WARN: Code duplicated, block: B:285:0x06ca  */
                /* JADX WARN: Code duplicated, block: B:289:0x06f2  */
                /* JADX WARN: Code duplicated, block: B:293:0x0707  */
                /* JADX WARN: Code duplicated, block: B:296:0x071a  */
                /* JADX WARN: Code duplicated, block: B:301:0x0736  */
                /* JADX WARN: Code duplicated, block: B:303:0x073e  */
                /* JADX WARN: Code duplicated, block: B:307:0x074d  */
                /* JADX WARN: Code duplicated, block: B:309:0x0759  */
                /* JADX WARN: Code duplicated, block: B:312:0x0774  */
                /* JADX WARN: Code duplicated, block: B:317:0x0790  */
                /* JADX WARN: Code duplicated, block: B:319:0x079e  */
                /* JADX WARN: Code duplicated, block: B:321:0x07af  */
                /* JADX WARN: Code duplicated, block: B:322:0x07b1  */
                /* JADX WARN: Code duplicated, block: B:325:0x07b6 A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:326:0x07b8  */
                /* JADX WARN: Code duplicated, block: B:327:0x07ba  */
                /* JADX WARN: Code duplicated, block: B:329:0x07be  */
                /* JADX WARN: Code duplicated, block: B:333:0x07d3  */
                /* JADX WARN: Code duplicated, block: B:339:0x0803  */
                /* JADX WARN: Code duplicated, block: B:342:0x0814  */
                /* JADX WARN: Code duplicated, block: B:346:0x082a A[LOOP:7: B:344:0x0824->B:346:0x082a, LOOP_END] */
                /* JADX WARN: Code duplicated, block: B:349:0x0855  */
                /* JADX WARN: Code duplicated, block: B:350:0x0858  */
                /* JADX WARN: Code duplicated, block: B:353:0x086d  */
                /* JADX WARN: Code duplicated, block: B:356:0x089f A[LOOP:8: B:354:0x0899->B:356:0x089f, LOOP_END] */
                /* JADX WARN: Code duplicated, block: B:359:0x08d5  */
                /* JADX WARN: Code duplicated, block: B:361:0x0923  */
                /* JADX WARN: Code duplicated, block: B:363:0x092b  */
                /* JADX WARN: Code duplicated, block: B:365:0x0938  */
                /* JADX WARN: Code duplicated, block: B:368:0x0946  */
                /* JADX WARN: Code duplicated, block: B:370:0x0949  */
                /* JADX WARN: Code duplicated, block: B:373:0x0956 A[LOOP:9: B:371:0x0950->B:373:0x0956, LOOP_END] */
                /* JADX WARN: Code duplicated, block: B:376:0x0991  */
                /* JADX WARN: Code duplicated, block: B:378:0x09b5  */
                /* JADX WARN: Code duplicated, block: B:379:0x09b9  */
                /* JADX WARN: Code duplicated, block: B:380:0x09c9  */
                /* JADX WARN: Code duplicated, block: B:383:0x09d9  */
                /* JADX WARN: Code duplicated, block: B:385:0x09e8  */
                /* JADX WARN: Code duplicated, block: B:440:0x05a9 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:441:0x05ae A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:442:? A[LOOP:2: B:238:0x058f->B:442:?, LOOP_END, SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:446:0x05dd A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:447:0x0788 A[EDGE_INSN: B:447:0x0788->B:315:0x0788 BREAK  A[LOOP:4: B:262:0x062e->B:314:0x077a], SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:449:0x077a A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:450:0x0729 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:452:0x06fc A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:453:0x06e4 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:457:0x07e8 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:458:0x07df A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:459:? A[LOOP:6: B:331:0x07cd->B:459:?, LOOP_END, SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:463:0x041d A[EDGE_INSN: B:463:0x041d->B:168:0x041d BREAK  A[LOOP:10: B:155:0x03dc->B:179:0x045e], SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:467:0x0538 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:484:? A[RETURN, SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:485:? A[RETURN, SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:488:? A[RETURN, SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:489:? A[RETURN, SYNTHETIC] */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r11v2 */
                /* JADX WARN: Type inference failed for: r11v3, types: [boolean] */
                /* JADX WARN: Type inference failed for: r11v53 */
                /* JADX WARN: Type inference failed for: r14v0 */
                /* JADX WARN: Type inference failed for: r14v1, types: [android.database.Cursor] */
                /* JADX WARN: Type inference failed for: r14v2 */
                /* JADX WARN: Type inference failed for: r33v0, types: [mp3] */
                /* JADX INFO: renamed from: r */
                public final void m6777r(String str, long j) throws Throwable {
                    ?? r14;
                    long j2;
                    Cursor cursorQuery;
                    List list;
                    List<Pair> list2;
                    ug3 ug3Var;
                    boolean zM7406J;
                    nk3 nk3Var;
                    int i;
                    List listSubList;
                    ok3 ok3VarM6752d;
                    nk3 nk3Var2;
                    zzhz zzhzVarZzh;
                    int size;
                    ArrayList arrayList;
                    boolean z;
                    boolean zM7189i;
                    boolean zM7189i2;
                    boolean zM7406J2;
                    yo3 yo3Var;
                    xo3 xo3VarM10166A;
                    int i2;
                    List list3;
                    ij3 ij3Var;
                    zzib zzibVar;
                    ArrayList arrayList2;
                    zl3 zl3Var;
                    boolean z2;
                    boolean z3;
                    String strM1689c0;
                    ci3 ci3Var;
                    Iterator it;
                    String string;
                    zzhz zzhzVarZzi;
                    String strM9287M;
                    ArrayList arrayList3;
                    Iterator it2;
                    String strZzh;
                    zzib zzibVar2;
                    zzhz zzhzVar;
                    int i3;
                    Intent intent;
                    Context contextMo4561e;
                    zzhz zzhzVarZzh2;
                    String strM9287M2;
                    boolean zIsEmpty;
                    zl3 zl3Var2;
                    zl3 zl3Var3;
                    xo3 xo3Var;
                    zzic zzicVar;
                    boolean z4;
                    boolean z5;
                    String strZzP;
                    ArrayList arrayList4;
                    Iterator it3;
                    boolean z6;
                    boolean z7;
                    Long lValueOf;
                    Long lValueOf2;
                    boolean z8;
                    boolean z9;
                    List list4;
                    int i4;
                    zzhs zzhsVar;
                    zzhw zzhwVarM1661H;
                    zzhw zzhwVarM1661H2;
                    zzis zzisVarM10012b;
                    Iterator it4;
                    String strZzG;
                    int i5;
                    zzid zzidVar;
                    zzid zzidVar2;
                    List list5;
                    boolean zIsEmpty2;
                    ArrayList arrayList5;
                    ij3 ij3Var2;
                    ArrayList arrayList6;
                    Cursor cursor;
                    ij3 ij3Var3;
                    Cursor cursorQuery2;
                    List list6;
                    Iterator it5;
                    boolean z10;
                    zzic zzicVar2;
                    zzgf zzgfVarM9295U;
                    ArrayList arrayList7;
                    Iterator it6;
                    int iZzb;
                    Iterator it7;
                    int i6;
                    int i7;
                    int iZzd;
                    SQLiteDatabase sQLiteDatabaseM261q0;
                    long jCurrentTimeMillis;
                    ae3 ae3Var;
                    long jZzg;
                    long jZzg2;
/* 3 */             String str2 = str;
/* 15 */            int iM7404H = m6753d0().m7404H(str2, vg3.f18136h);
/* 29 */            int i8 = 0;
/* 30 */            int iMax = Math.max(0, m6753d0().m7404H(str2, vg3.f18139i));
/* 34 */            ae3 ae3VarM6755f0 = m6755f0();
/* 40 */            ij3 ij3Var4 = (ij3) ae3VarM6755f0.f16749a;
/* 42 */            ae3VarM6755f0.mo1375y();
/* 45 */            ae3VarM6755f0.m9593A();
/* 48 */            int i9 = 1;
/* 54 */            kb1.m6054g(iM7404H > 0);
/* 61 */            ?? r11 = iMax > 0 ? 1 : 0;
/* 62 */            kb1.m6054g(r11);
/* 65 */            kb1.m6058k(str2);
                    try {
                        try {
                            try {
/* 74 */                        j2 = -1;
                                try {
/* 100 */                           cursorQuery = ae3VarM6755f0.m261q0().query("queue", new String[]{"rowid", SharedDataContentProvider.BASE_PATH, "retry_count"}, "app_id=?", new String[]{str2}, null, null, "rowid", String.valueOf(iM7404H));
                                    try {
/* 108 */                               if (cursorQuery.moveToFirst()) {
/* 128 */                                   ArrayList arrayList8 = new ArrayList();
/* 131 */                                   int length = 0;
                                            while (true) {
/* 132 */                                       long j3 = cursorQuery.getLong(i8);
                                                try {
/* 136 */                                           byte[] blob = cursorQuery.getBlob(i9);
/* 142 */                                           ci3 ci3VarM6761i0 = ae3VarM6755f0.f15676b.m6761i0();
                                                    try {
/* 148 */                                               ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(blob);
/* 153 */                                               GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
/* 158 */                                               ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
/* 163 */                                               byte[] bArr = new byte[Segment.SHARE_MINIMUM];
/* 165 */                                               ae3Var = ae3VarM6755f0;
                                                        while (true) {
                                                            try {
/* 167 */                                                       int i10 = gZIPInputStream.read(bArr);
/* 171 */                                                       if (i10 <= 0) {
                                                                    break;
                                                                }
/* 424 */                                                       ij3Var4 = ij3Var4;
                                                                try {
/* 427 */                                                           byteArrayOutputStream.write(bArr, 0, i10);
/* 430 */                                                           ij3Var4 = ij3Var4;
                                                                } catch (IOException e) {
/* 434 */                                                           e = e;
                                                                }
                                                            } catch (IOException e2) {
/* 420 */                                                       e = e2;
/* 421 */                                                       ij3Var4 = ij3Var4;
                                                            }
                                                            try {
/* 454 */                                                       ((ij3) ci3VarM6761i0.f16749a).mo4557a().m9016D().m8511b(e, "Failed to ungzip content");
/* 457 */                                                       throw e;
                                                            } catch (IOException e3) {
/* 458 */                                                       e = e3;
/* 481 */                                                       ij3Var4.mo4557a().m9016D().m8512c(uh3.m9013H(str2), "Failed to unzip queued bundle. appId", e);
                                                                try {
/* 488 */                                                           if (cursorQuery.moveToNext()) {
                                                                        break;
                                                                    } else {
                                                                        break;
                                                                    }
/* 501 */                                                           cursorQuery.close();
                                                                    list2 = arrayList8;
                                                                } catch (SQLiteException e4) {
/* 460 */                                                           e = e4;
/* 538 */                                                           ij3Var4.mo4557a().m9016D().m8512c(uh3.m9013H(str2), "Error querying bundles. appId", e);
/* 541 */                                                           list = Collections.EMPTY_LIST;
/* 543 */                                                           if (cursorQuery != null) {
/* 112 */                                                               cursorQuery.close();
                                                                    }
/* 115 */                                                           list2 = list;
                                                                }
/* 551 */                                                       if (list2.isEmpty()) {
/* 2596 */                                                          return;
                                                                }
/* 555 */                                                       com.google.android.gms.internal.measurement.zzpk.zza();
/* 558 */                                                       pd3 pd3VarM6753d0 = m6753d0();
/* 562 */                                                       ug3Var = vg3.f18141i1;
/* 565 */                                                       zM7406J = pd3VarM6753d0.m7406J(null, ug3Var);
/* 571 */                                                       nk3Var = nk3.ANALYTICS_STORAGE;
/* 573 */                                                       if (zM7406J) {
/* 575 */                                                           com.google.android.gms.internal.measurement.zzpk.zza();
/* 586 */                                                           if (!m6753d0().m7406J(null, ug3Var)) {
/* 1397 */                                                              i = 34;
                                                                        list5 = list2;
                                                                    } else if (m6752d(str).m7189i(nk3Var)) {
/* 897 */                                                               i = 34;
/* 905 */                                                               arrayList5 = new ArrayList(list2.size());
/* 908 */                                                               ae3 ae3VarM6755f1 = m6755f0();
/* 914 */                                                               ij3Var2 = (ij3) ae3VarM6755f1.f16749a;
/* 916 */                                                               kb1.m6058k(str2);
/* 919 */                                                               ae3VarM6755f1.mo1375y();
/* 922 */                                                               ae3VarM6755f1.m9593A();
/* 927 */                                                               arrayList6 = new ArrayList();
/* 934 */                                                               sQLiteDatabaseM261q0 = ae3VarM6755f1.m261q0();
/* 944 */                                                               ((xt0) ij3Var2.mo4562f()).getClass();
/* 947 */                                                               jCurrentTimeMillis = System.currentTimeMillis();
/* 975 */                                                               cursorQuery2 = sQLiteDatabaseM261q0.query("no_data_mode_events", new String[]{SharedDataContentProvider.BASE_PATH}, "app_id=? AND timestamp_millis <= CAST(? AS INTEGER)", new String[]{str2, String.valueOf(jCurrentTimeMillis)}, null, null, "rowid", null);
/* 985 */                                                               if (cursorQuery2.moveToFirst()) {
/* 987 */                                                                   ij3Var3 = ij3Var2;
                                                                            while (true) {
/* 1010 */                                                                      arrayList6.add((zzhs) ((zzhr) ci3.m1677m0(zzhs.zzk(), cursorQuery2.getBlob(0))).zzbc());
/* 1052 */                                                                      if (!cursorQuery2.moveToNext()) {
                                                                                    break;
                                                                                    break;
                                                                                } else {
/* 1119 */                                                                          cursorQuery2 = cursorQuery2;
/* 1121 */                                                                          arrayList6 = arrayList6;
                                                                                }
                                                                            }
/* 1054 */                                                                  cursorQuery2.close();
/* 1067 */                                                                  int iDelete = sQLiteDatabaseM261q0.delete("no_data_mode_events", "app_id=? AND timestamp_millis <= CAST(? AS INTEGER)", new String[]{str2, String.valueOf(jCurrentTimeMillis)});
/* 1075 */                                                                  sh3 sh3VarM9019G = ij3Var3.mo4557a().m9019G();
/* 1091 */                                                                  StringBuilder sb = new StringBuilder(String.valueOf(iDelete).length() + 34);
/* 1094 */                                                                  sb.append("Pruned ");
/* 1097 */                                                                  sb.append(iDelete);
/* 1100 */                                                                  sb.append(" NO_DATA mode events. appId");
/* 1107 */                                                                  sh3VarM9019G.m8511b(str2, sb.toString());
                                                                        } else {
/* 1127 */                                                                  arrayList6 = arrayList6;
/* 1129 */                                                                  cursorQuery2.close();
                                                                        }
/* 1132 */                                                              list6 = arrayList6;
/* 1178 */                                                              it5 = list2.iterator();
/* 1182 */                                                              z10 = true;
/* 1187 */                                                              while (it5.hasNext()) {
/* 1193 */                                                                  Pair pair = (Pair) it5.next();
/* 1203 */                                                                  zzicVar2 = (zzic) ((zzid) pair.first).zzcl();
/* 1205 */                                                                  if (z10) {
/* 1213 */                                                                      List listZzb = zzicVar2.zzb();
/* 1217 */                                                                      zzicVar2.zzi();
/* 1220 */                                                                      zzicVar2.zzh(list6);
/* 1223 */                                                                      zzicVar2.zzh(listZzb);
/* 1226 */                                                                      z10 = false;
                                                                            }
/* 1227 */                                                                  zzhh zzhhVarZzb = zzho.zzb();
/* 1235 */                                                                  zzgfVarM9295U = m6754e0().m9295U(str2);
/* 1241 */                                                                  arrayList7 = new ArrayList();
/* 1244 */                                                                  if (zzgfVarM9295U != null) {
/* 1258 */                                                                      it6 = zzgfVarM9295U.zza().iterator();
/* 1266 */                                                                      while (it6.hasNext()) {
/* 1272 */                                                                          zzfu zzfuVar = (zzfu) it6.next();
/* 1274 */                                                                          Iterator it8 = it5;
/* 1276 */                                                                          zzhk zzhkVarZza = zzhl.zza();
/* 1284 */                                                                          boolean z11 = z10;
/* 1286 */                                                                          iZzb = zzfuVar.zzb() - 1;
/* 1288 */                                                                          List list7 = list6;
/* 1291 */                                                                          if (iZzb != 1) {
/* 1315 */                                                                              it7 = it6;
/* 1317 */                                                                              i6 = 3;
/* 1318 */                                                                              i7 = 2;
                                                                                    } else if (iZzb != 2) {
/* 1297 */                                                                              it7 = it6;
/* 1299 */                                                                              i6 = 3;
/* 1300 */                                                                              if (iZzb != 3) {
/* 1308 */                                                                                  i7 = 4;
                                                                                        } else if (iZzb != 4) {
/* 1304 */                                                                                  i7 = 1;
                                                                                        } else {
/* 1306 */                                                                                  i7 = 5;
                                                                                        }
                                                                                    } else {
/* 1310 */                                                                              it7 = it6;
/* 1312 */                                                                              i6 = 3;
/* 1313 */                                                                              i7 = 3;
                                                                                    }
/* 1319 */                                                                          zzhkVarZza.zza(i7);
/* 1326 */                                                                          iZzd = zzfuVar.zzd() - 1;
/* 1329 */                                                                          if (iZzd != 1) {
/* 1336 */                                                                              i6 = 2;
                                                                                    } else if (iZzd != 2) {
/* 1334 */                                                                              i6 = 1;
                                                                                    }
/* 1337 */                                                                          zzhkVarZza.zzb(i6);
/* 1346 */                                                                          arrayList7.add((zzhl) zzhkVarZza.zzbc());
/* 1349 */                                                                          it5 = it8;
/* 1351 */                                                                          list6 = list7;
/* 1353 */                                                                          z10 = z11;
/* 1355 */                                                                          it6 = it7;
                                                                                }
                                                                            }
/* 1246 */                                                                  Iterator it9 = it5;
/* 1248 */                                                                  boolean z12 = z10;
/* 1250 */                                                                  List list8 = list6;
/* 1358 */                                                                  zzhhVarZzb.zza(arrayList7);
/* 1361 */                                                                  zzicVar2.zzaQ(zzhhVarZzb);
/* 1378 */                                                                  arrayList5.add(Pair.create((zzid) zzicVar2.zzbc(), (Long) pair.second));
/* 1381 */                                                                  it5 = it9;
/* 1383 */                                                                  list6 = list8;
/* 1385 */                                                                  z10 = z12;
                                                                        }
/* 1389 */                                                              list5 = arrayList5;
                                                                    } else {
/* 897 */                                                               i = 34;
/* 905 */                                                               arrayList5 = new ArrayList(list2.size());
/* 908 */                                                               ae3 ae3VarM6755f2 = m6755f0();
/* 914 */                                                               ij3Var2 = (ij3) ae3VarM6755f2.f16749a;
/* 916 */                                                               kb1.m6058k(str2);
/* 919 */                                                               ae3VarM6755f2.mo1375y();
/* 922 */                                                               ae3VarM6755f2.m9593A();
/* 927 */                                                               arrayList6 = new ArrayList();
                                                                        try {
                                                                            try {
/* 934 */                                                                       sQLiteDatabaseM261q0 = ae3VarM6755f2.m261q0();
/* 944 */                                                                       ((xt0) ij3Var2.mo4562f()).getClass();
/* 947 */                                                                       jCurrentTimeMillis = System.currentTimeMillis();
/* 975 */                                                                       cursorQuery2 = sQLiteDatabaseM261q0.query("no_data_mode_events", new String[]{SharedDataContentProvider.BASE_PATH}, "app_id=? AND timestamp_millis <= CAST(? AS INTEGER)", new String[]{str2, String.valueOf(jCurrentTimeMillis)}, null, null, "rowid", null);
                                                                                try {
                                                                                    try {
/* 985 */                                                                               if (cursorQuery2.moveToFirst()) {
/* 987 */                                                                                   ij3Var3 = ij3Var2;
                                                                                            while (true) {
                                                                                                try {
                                                                                                    try {
/* 1010 */                                                                                              arrayList6.add((zzhs) ((zzhr) ci3.m1677m0(zzhs.zzk(), cursorQuery2.getBlob(0))).zzbc());
                                                                                                    } catch (zzmq e5) {
/* 1045 */                                                                                              ij3Var3.mo4557a().f17531V.m8512c(uh3.m9013H(str2), "Failed to parse stored NO_DATA mode event, appId", e5);
                                                                                                    }
                                                                                                    try {
                                                                                                        try {
/* 1052 */                                                                                                  if (!cursorQuery2.moveToNext()) {
                                                                                                                break;
                                                                                                            }
/* 1119 */                                                                                                  cursorQuery2 = cursorQuery2;
/* 1121 */                                                                                                  arrayList6 = arrayList6;
                                                                                                        } catch (SQLiteException e6) {
/* 1117 */                                                                                                  e = e6;
/* 1168 */                                                                                                  ij3Var3.mo4557a().m9016D().m8512c(uh3.m9013H(str2), "Error flushing NO_DATA mode events. appId", e);
/* 1171 */                                                                                                  list6 = Collections.EMPTY_LIST;
/* 1173 */                                                                                                  if (cursorQuery2 != null) {
/* 1175 */                                                                                                      cursorQuery2.close();
                                                                                                            }
                                                                                                        }
                                                                                                    } catch (Throwable th) {
/* 1115 */                                                                                              th = th;
/* 1135 */                                                                                              cursor = cursorQuery2;
/* 1391 */                                                                                              if (cursor != null) {
/* 1393 */                                                                                                  cursor.close();
                                                                                                        }
/* 1396 */                                                                                              throw th;
                                                                                                    }
                                                                                                } catch (SQLiteException e7) {
/* 1023 */                                                                                          e = e7;
/* 1024 */                                                                                          cursorQuery2 = cursorQuery2;
/* 1168 */                                                                                          ij3Var3.mo4557a().m9016D().m8512c(uh3.m9013H(str2), "Error flushing NO_DATA mode events. appId", e);
/* 1171 */                                                                                          list6 = Collections.EMPTY_LIST;
/* 1173 */                                                                                          if (cursorQuery2 != null) {
/* 1175 */                                                                                              cursorQuery2.close();
                                                                                                    }
/* 1178 */                                                                                          it5 = list2.iterator();
/* 1182 */                                                                                          z10 = true;
/* 1187 */                                                                                          while (it5.hasNext()) {
/* 1193 */                                                                                              Pair pair2 = (Pair) it5.next();
/* 1203 */                                                                                              zzicVar2 = (zzic) ((zzid) pair2.first).zzcl();
/* 1205 */                                                                                              if (z10) {
/* 1213 */                                                                                                  List listZzb2 = zzicVar2.zzb();
/* 1217 */                                                                                                  zzicVar2.zzi();
/* 1220 */                                                                                                  zzicVar2.zzh(list6);
/* 1223 */                                                                                                  zzicVar2.zzh(listZzb2);
/* 1226 */                                                                                                  z10 = false;
                                                                                                        }
/* 1227 */                                                                                              zzhh zzhhVarZzb2 = zzho.zzb();
/* 1235 */                                                                                              zzgfVarM9295U = m6754e0().m9295U(str2);
/* 1241 */                                                                                              arrayList7 = new ArrayList();
/* 1244 */                                                                                              if (zzgfVarM9295U != null) {
/* 1258 */                                                                                                  it6 = zzgfVarM9295U.zza().iterator();
/* 1266 */                                                                                                  while (it6.hasNext()) {
/* 1272 */                                                                                                      zzfu zzfuVar2 = (zzfu) it6.next();
/* 1274 */                                                                                                      Iterator it10 = it5;
/* 1276 */                                                                                                      zzhk zzhkVarZza2 = zzhl.zza();
/* 1284 */                                                                                                      boolean z13 = z10;
/* 1286 */                                                                                                      iZzb = zzfuVar2.zzb() - 1;
/* 1288 */                                                                                                      List list9 = list6;
/* 1291 */                                                                                                      if (iZzb != 1) {
/* 1315 */                                                                                                          it7 = it6;
/* 1317 */                                                                                                          i6 = 3;
/* 1318 */                                                                                                          i7 = 2;
                                                                                                                } else if (iZzb != 2) {
/* 1297 */                                                                                                          it7 = it6;
/* 1299 */                                                                                                          i6 = 3;
/* 1300 */                                                                                                          if (iZzb != 3) {
/* 1308 */                                                                                                              i7 = 4;
                                                                                                                    } else if (iZzb != 4) {
/* 1304 */                                                                                                              i7 = 1;
                                                                                                                    } else {
/* 1306 */                                                                                                              i7 = 5;
                                                                                                                    }
                                                                                                                } else {
/* 1310 */                                                                                                          it7 = it6;
/* 1312 */                                                                                                          i6 = 3;
/* 1313 */                                                                                                          i7 = 3;
                                                                                                                }
/* 1319 */                                                                                                      zzhkVarZza2.zza(i7);
/* 1326 */                                                                                                      iZzd = zzfuVar2.zzd() - 1;
/* 1329 */                                                                                                      if (iZzd != 1) {
/* 1336 */                                                                                                          i6 = 2;
                                                                                                                } else if (iZzd != 2) {
/* 1334 */                                                                                                          i6 = 1;
                                                                                                                }
/* 1337 */                                                                                                      zzhkVarZza2.zzb(i6);
/* 1346 */                                                                                                      arrayList7.add((zzhl) zzhkVarZza2.zzbc());
/* 1349 */                                                                                                      it5 = it10;
/* 1351 */                                                                                                      list6 = list9;
/* 1353 */                                                                                                      z10 = z13;
/* 1355 */                                                                                                      it6 = it7;
                                                                                                            }
                                                                                                        }
/* 1246 */                                                                                              Iterator it11 = it5;
/* 1248 */                                                                                              boolean z14 = z10;
/* 1250 */                                                                                              List list10 = list6;
/* 1358 */                                                                                              zzhhVarZzb2.zza(arrayList7);
/* 1361 */                                                                                              zzicVar2.zzaQ(zzhhVarZzb2);
/* 1378 */                                                                                              arrayList5.add(Pair.create((zzid) zzicVar2.zzbc(), (Long) pair2.second));
/* 1381 */                                                                                              it5 = it11;
/* 1383 */                                                                                              list6 = list10;
/* 1385 */                                                                                              z10 = z14;
                                                                                                    }
/* 1389 */                                                                                          list5 = arrayList5;
/* 1399 */                                                                                          zIsEmpty2 = list5.isEmpty();
                                                                                                    listSubList = list5;
/* 1403 */                                                                                          if (zIsEmpty2) {
/* 2596 */                                                                                              return;
                                                                                                    }
/* 1408 */                                                                                          ok3VarM6752d = m6752d(str);
/* 1412 */                                                                                          nk3Var2 = nk3.AD_STORAGE;
/* 1418 */                                                                                          if (ok3VarM6752d.m7189i(nk3Var2)) {
/* 1420 */                                                                                              it4 = listSubList.iterator();
                                                                                                        while (true) {
/* 1428 */                                                                                                  if (it4.hasNext()) {
/* 1455 */                                                                                                      strZzG = null;
                                                                                                                break;
                                                                                                            }
/* 1438 */                                                                                                  zzidVar2 = (zzid) ((Pair) it4.next()).first;
/* 1448 */                                                                                                  if (!zzidVar2.zzG().isEmpty()) {
/* 1450 */                                                                                                      strZzG = zzidVar2.zzG();
                                                                                                                break;
                                                                                                            }
                                                                                                        }
/* 1456 */                                                                                              if (strZzG != null) {
/* 1463 */                                                                                                  for (i5 = 0; i5 < listSubList.size(); i5++) {
/* 1473 */                                                                                                      zzidVar = (zzid) ((Pair) listSubList.get(i5)).first;
/* 1483 */                                                                                                      if (!zzidVar.zzG().isEmpty()) {
/* 1497 */                                                                                                          listSubList = listSubList.subList(0, i5);
                                                                                                                    break;
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
/* 1505 */                                                                                          zzhzVarZzh = zzib.zzh();
/* 1509 */                                                                                          size = listSubList.size();
/* 1519 */                                                                                          arrayList = new ArrayList(listSubList.size());
/* 1530 */                                                                                          if (m6753d0().m7397A(str2)) {
/* 1544 */                                                                                              z = false;
                                                                                                    } else {
/* 1544 */                                                                                              z = false;
                                                                                                    }
/* 1549 */                                                                                          zM7189i = m6752d(str).m7189i(nk3Var2);
/* 1557 */                                                                                          zM7189i2 = m6752d(str).m7189i(nk3Var);
/* 1561 */                                                                                          zzqu.zza();
/* 1570 */                                                                                          zM7406J2 = m6753d0().m7406J(str2, vg3.f18088M0);
/* 1574 */                                                                                          yo3Var = this.f13903U;
/* 1576 */                                                                                          xo3VarM10166A = yo3Var.m10166A(str2);
/* 1582 */                                                                                          i2 = 0;
                                                                                                    list3 = listSubList;
                                                                                                    while (true) {
/* 1583 */                                                                                              ij3Var = this.f13905W;
/* 1585 */                                                                                              if (i2 < size) {
                                                                                                            break;
                                                                                                        }
/* 1605 */                                                                                              zzicVar = (zzic) ((zzid) ((Pair) list3.get(i2)).first).zzcl();
/* 1611 */                                                                                              int i11 = size;
/* 1621 */                                                                                              arrayList.add((Long) ((Pair) list3.get(i2)).second);
/* 1628 */                                                                                              m6753d0().m7401E();
/* 1631 */                                                                                              z4 = zM7189i2;
/* 1632 */                                                                                              z5 = zM7406J2;
/* 1637 */                                                                                              zzicVar.zzO(130000L);
/* 1640 */                                                                                              zzicVar.zzs(j);
/* 1643 */                                                                                              ij3Var.getClass();
/* 1647 */                                                                                              zzicVar.zzae(false);
/* 1650 */                                                                                              if (!z) {
/* 1652 */                                                                                                  zzicVar.zzan();
                                                                                                        }
/* 1655 */                                                                                              if (!zM7189i) {
/* 1657 */                                                                                                  zzicVar.zzR();
/* 1660 */                                                                                                  zzicVar.zzU();
                                                                                                        }
/* 1663 */                                                                                              if (!z4) {
/* 1665 */                                                                                                  zzicVar.zzX();
                                                                                                        }
/* 1668 */                                                                                              m6781v(zzicVar, str2);
/* 1671 */                                                                                              if (!z5) {
/* 1673 */                                                                                                  zzicVar.zzav();
                                                                                                        }
/* 1676 */                                                                                              if (!z4) {
/* 1678 */                                                                                                  zzicVar.zzag();
                                                                                                        }
/* 1681 */                                                                                              strZzP = zzicVar.zzP();
/* 1689 */                                                                                              if (TextUtils.isEmpty(strZzP)) {
/* 1716 */                                                                                                  arrayList4 = new ArrayList(zzicVar.zzb());
/* 1719 */                                                                                                  it3 = arrayList4.iterator();
/* 1723 */                                                                                                  z6 = z4;
/* 1725 */                                                                                                  z7 = z;
/* 1727 */                                                                                                  lValueOf = null;
/* 1728 */                                                                                                  lValueOf2 = null;
/* 1729 */                                                                                                  z8 = false;
/* 1731 */                                                                                                  z9 = false;
/* 1737 */                                                                                                  while (it3.hasNext()) {
/* 1743 */                                                                                                      it3 = it3;
/* 1747 */                                                                                                      zzhsVar = (zzhs) it3.next();
/* 1749 */                                                                                                      list3 = list3;
/* 1755 */                                                                                                      i2 = i2;
/* 1763 */                                                                                                      if ("_fx".equals(zzhsVar.zzd())) {
/* 1765 */                                                                                                          it3.remove();
/* 1774 */                                                                                                          z8 = true;
                                                                                                                } else if ("_f".equals(zzhsVar.zzd())) {
/* 1789 */                                                                                                          m6761i0();
/* 1794 */                                                                                                          zzhwVarM1661H = ci3.m1661H(zzhsVar, "_pfo");
/* 1798 */                                                                                                          if (zzhwVarM1661H != null) {
/* 1804 */                                                                                                              lValueOf = Long.valueOf(zzhwVarM1661H.zzf());
                                                                                                                    }
/* 1808 */                                                                                                          m6761i0();
/* 1813 */                                                                                                          zzhwVarM1661H2 = ci3.m1661H(zzhsVar, "_uwa");
/* 1817 */                                                                                                          if (zzhwVarM1661H2 != null) {
/* 1823 */                                                                                                              lValueOf2 = Long.valueOf(zzhwVarM1661H2.zzf());
                                                                                                                    }
                                                                                                                } else {
/* 1834 */                                                                                                          list3 = list3;
/* 1836 */                                                                                                          it3 = it3;
/* 1838 */                                                                                                          i2 = i2;
                                                                                                                }
/* 1776 */                                                                                                      z9 = true;
                                                                                                            }
/* 1841 */                                                                                                  list4 = list3;
/* 1843 */                                                                                                  i4 = i2;
/* 1845 */                                                                                                  if (z8) {
/* 1847 */                                                                                                      zzicVar.zzi();
/* 1850 */                                                                                                      zzicVar.zzh(arrayList4);
                                                                                                            }
/* 1853 */                                                                                                  if (z9) {
/* 1860 */                                                                                                      m6780u(zzicVar.zzK(), true, lValueOf, lValueOf2);
                                                                                                            }
                                                                                                        } else {
/* 1716 */                                                                                                  arrayList4 = new ArrayList(zzicVar.zzb());
/* 1719 */                                                                                                  it3 = arrayList4.iterator();
/* 1723 */                                                                                                  z6 = z4;
/* 1725 */                                                                                                  z7 = z;
/* 1727 */                                                                                                  lValueOf = null;
/* 1728 */                                                                                                  lValueOf2 = null;
/* 1729 */                                                                                                  z8 = false;
/* 1731 */                                                                                                  z9 = false;
/* 1737 */                                                                                                  while (it3.hasNext()) {
/* 1743 */                                                                                                      it3 = it3;
/* 1747 */                                                                                                      zzhsVar = (zzhs) it3.next();
/* 1749 */                                                                                                      list3 = list3;
/* 1755 */                                                                                                      i2 = i2;
/* 1763 */                                                                                                      if ("_fx".equals(zzhsVar.zzd())) {
/* 1765 */                                                                                                          it3.remove();
/* 1774 */                                                                                                          z8 = true;
                                                                                                                } else if ("_f".equals(zzhsVar.zzd())) {
/* 1789 */                                                                                                          m6761i0();
/* 1794 */                                                                                                          zzhwVarM1661H = ci3.m1661H(zzhsVar, "_pfo");
/* 1798 */                                                                                                          if (zzhwVarM1661H != null) {
/* 1804 */                                                                                                              lValueOf = Long.valueOf(zzhwVarM1661H.zzf());
                                                                                                                    }
/* 1808 */                                                                                                          m6761i0();
/* 1813 */                                                                                                          zzhwVarM1661H2 = ci3.m1661H(zzhsVar, "_uwa");
/* 1817 */                                                                                                          if (zzhwVarM1661H2 != null) {
/* 1823 */                                                                                                              lValueOf2 = Long.valueOf(zzhwVarM1661H2.zzf());
                                                                                                                    }
                                                                                                                } else {
/* 1834 */                                                                                                          list3 = list3;
/* 1836 */                                                                                                          it3 = it3;
/* 1838 */                                                                                                          i2 = i2;
                                                                                                                }
/* 1776 */                                                                                                      z9 = true;
                                                                                                            }
/* 1841 */                                                                                                  list4 = list3;
/* 1843 */                                                                                                  i4 = i2;
/* 1845 */                                                                                                  if (z8) {
/* 1847 */                                                                                                      zzicVar.zzi();
/* 1850 */                                                                                                      zzicVar.zzh(arrayList4);
                                                                                                            }
/* 1853 */                                                                                                  if (z9) {
/* 1860 */                                                                                                      m6780u(zzicVar.zzK(), true, lValueOf, lValueOf2);
                                                                                                            }
                                                                                                        }
/* 1867 */                                                                                              if (zzicVar.zzc() != 0) {
/* 1880 */                                                                                                  if (m6753d0().m7406J(str2, vg3.f18068C0)) {
/* 1900 */                                                                                                      zzicVar.zzas(m6761i0().m1694k0(((zzid) zzicVar.zzbc()).zzcc()));
                                                                                                            }
/* 1903 */                                                                                                  zzisVarM10012b = xo3VarM10166A.m10012b();
/* 1907 */                                                                                                  if (zzisVarM10012b != null) {
/* 1909 */                                                                                                      zzicVar.zzaN(zzisVarM10012b);
                                                                                                            }
/* 1912 */                                                                                                  zzhzVarZzh.zze(zzicVar);
                                                                                                        }
/* 1915 */                                                                                              i2 = i4 + 1;
/* 1917 */                                                                                              zM7406J2 = z5;
/* 1919 */                                                                                              size = i11;
/* 1921 */                                                                                              zM7189i2 = z6;
/* 1923 */                                                                                              z = z7;
/* 1925 */                                                                                              list3 = list4;
                                                                                                    }
/* 1935 */                                                                                          if (zzhzVarZzh.zzb() == 0) {
/* 1937 */                                                                                              m6774p(arrayList);
/* 1947 */                                                                                              m6783x(false, 204, null, null, str2, Collections.EMPTY_LIST);
/* 1950 */                                                                                              return;
                                                                                                    }
/* 1955 */                                                                                          zzibVar = (zzib) zzhzVarZzh.zzbc();
/* 1959 */                                                                                          arrayList2 = new ArrayList();
/* 1962 */                                                                                          zl3Var = xo3VarM10166A.f19299c;
/* 1966 */                                                                                          if (zl3Var == zl3.SGTM_CLIENT) {
/* 1968 */                                                                                              z2 = true;
                                                                                                    } else {
/* 1970 */                                                                                              z2 = false;
                                                                                                    }
/* 1973 */                                                                                          if (zl3Var != zl3.SGTM) {
/* 1975 */                                                                                              if (z2) {
/* 1977 */                                                                                                  z3 = true;
                                                                                                        } else {
/* 1979 */                                                                                                  strM1689c0 = null;
                                                                                                        }
/* 2511 */                                                                                              ci3Var = this.f13911b;
/* 2513 */                                                                                              m6728S(ci3Var);
/* 2520 */                                                                                              if (ci3Var.m1683T()) {
/* 2535 */                                                                                                  if (Log.isLoggable(mo4557a().m9021J(), 2)) {
/* 2541 */                                                                                                      strM1689c0 = m6761i0().m1689c0(zzibVar);
                                                                                                            }
/* 2546 */                                                                                                  m6761i0();
/* 2549 */                                                                                                  byte[] bArrZzcc = zzibVar.zzcc();
/* 2553 */                                                                                                  m6774p(arrayList);
/* 2560 */                                                                                                  this.f13938w.f17199w.m4933b(j);
/* 2578 */                                                                                                  mo4557a().m9019G().m8513d("Uploading data. app, uncompressed size, data", str2, Integer.valueOf(bArrZzcc.length), strM1689c0);
/* 2582 */                                                                                                  this.f13920f0 = true;
/* 2584 */                                                                                                  m6728S(ci3Var);
/* 2593 */                                                                                                  ci3Var.m1685Y(str2, xo3VarM10166A, zzibVar, new bp3(this, str2, arrayList2, 0));
/* 2596 */                                                                                                  return;
                                                                                                        }
/* 2596 */                                                                                              return;
                                                                                                    }
/* 1983 */                                                                                          z3 = z2;
/* 1994 */                                                                                          it = ((zzib) zzhzVarZzh.zzbc()).zza().iterator();
                                                                                                    while (true) {
/* 2002 */                                                                                              if (it.hasNext()) {
/* 2014 */                                                                                                  if (((zzid) it.next()).zzY()) {
/* 2020 */                                                                                                      string = UUID.randomUUID().toString();
                                                                                                                break;
                                                                                                            }
                                                                                                        } else {
/* 2025 */                                                                                                  string = null;
                                                                                                            break;
                                                                                                        }
                                                                                                    }
/* 2030 */                                                                                          zzib zzibVar3 = (zzib) zzhzVarZzh.zzbc();
/* 2036 */                                                                                          mo4558b().mo1375y();
/* 2039 */                                                                                          m6765k0();
/* 2042 */                                                                                          zzhzVarZzi = zzib.zzi(zzibVar3);
/* 2050 */                                                                                          if (!TextUtils.isEmpty(string)) {
/* 2052 */                                                                                              zzhzVarZzi.zzi(string);
                                                                                                    }
/* 2059 */                                                                                          strM9287M = m6754e0().m9287M(str2);
/* 2067 */                                                                                          if (!TextUtils.isEmpty(strM9287M)) {
/* 2069 */                                                                                              zzhzVarZzi.zzj(strM9287M);
                                                                                                    }
/* 2074 */                                                                                          arrayList3 = new ArrayList();
/* 2081 */                                                                                          it2 = zzibVar3.zza().iterator();
/* 2089 */                                                                                          while (it2.hasNext()) {
/* 2097 */                                                                                              zzic zzicVarZzaF = zzid.zzaF((zzid) it2.next());
/* 2101 */                                                                                              zzicVarZzaF.zzan();
/* 2110 */                                                                                              arrayList3.add((zzid) zzicVarZzaF.zzbc());
                                                                                                    }
/* 2114 */                                                                                          zzhzVarZzi.zzg();
/* 2117 */                                                                                          zzhzVarZzi.zzf(arrayList3);
/* 2124 */                                                                                          sh3 sh3VarM9019G2 = mo4557a().m9019G();
/* 2132 */                                                                                          if (TextUtils.isEmpty(string)) {
/* 2134 */                                                                                              strZzh = "null";
                                                                                                    } else {
/* 2137 */                                                                                              strZzh = zzhzVarZzi.zzh();
                                                                                                    }
/* 2143 */                                                                                          sh3VarM9019G2.m8511b(strZzh, "[sgtm] Processed MeasurementBatch for sGTM with sgtmJoinId: ");
/* 2150 */                                                                                          zzibVar2 = (zzib) zzhzVarZzi.zzbc();
/* 2156 */                                                                                          if (TextUtils.isEmpty(string)) {
/* 2375 */                                                                                              strM1689c0 = null;
                                                                                                    } else {
/* 2162 */                                                                                              zzib zzibVar4 = (zzib) zzhzVarZzh.zzbc();
/* 2168 */                                                                                              mo4558b().mo1375y();
/* 2171 */                                                                                              m6765k0();
/* 2174 */                                                                                              zzhzVarZzh2 = zzib.zzh();
/* 2188 */                                                                                              mo4557a().m9019G().m8511b(string, "[sgtm] Processing Google Signal, sgtmJoinId:");
/* 2191 */                                                                                              zzhzVarZzh2.zzi(string);
/* 2206 */                                                                                              for (zzid zzidVar3 : zzibVar4.zza()) {
/* 2214 */                                                                                                  zzic zzicVarZzaE = zzid.zzaE();
/* 2222 */                                                                                                  zzicVarZzaE.zzam(zzidVar3.zzZ());
/* 2229 */                                                                                                  zzicVarZzaE.zzaJ(zzidVar3.zzav());
/* 2232 */                                                                                                  zzhzVarZzh2.zze(zzicVarZzaE);
                                                                                                        }
/* 2240 */                                                                                              zzib zzibVar5 = (zzib) zzhzVarZzh2.zzbc();
/* 2248 */                                                                                              strM9287M2 = yo3Var.f15676b.m6754e0().m9287M(str2);
/* 2252 */                                                                                              zIsEmpty = TextUtils.isEmpty(strM9287M2);
/* 2256 */                                                                                              zl3Var2 = zl3.GOOGLE_SIGNAL;
/* 2258 */                                                                                              zl3Var3 = zl3.GOOGLE_SIGNAL_PENDING;
/* 2260 */                                                                                              if (zIsEmpty) {
/* 2348 */                                                                                                  strM1689c0 = null;
/* 2357 */                                                                                                  String str3 = (String) vg3.f18161s.m9011a(null);
/* 2359 */                                                                                                  if (z3) {
/* 2361 */                                                                                                      zl3Var2 = zl3Var3;
                                                                                                            }
/* 2364 */                                                                                                  xo3Var = new xo3(str3, Collections.EMPTY_MAP, zl3Var2, null);
                                                                                                        } else {
/* 2271 */                                                                                                  Uri uri = Uri.parse((String) vg3.f18161s.m9011a(null));
/* 2275 */                                                                                                  Uri.Builder builderBuildUpon = uri.buildUpon();
/* 2279 */                                                                                                  String authority = uri.getAuthority();
/* 2307 */                                                                                                  StringBuilder sb2 = new StringBuilder(String.valueOf(strM9287M2).length() + 1 + String.valueOf(authority).length());
/* 2310 */                                                                                                  sb2.append(strM9287M2);
/* 2315 */                                                                                                  sb2.append(".");
/* 2318 */                                                                                                  sb2.append(authority);
/* 2325 */                                                                                                  builderBuildUpon.authority(sb2.toString());
/* 2334 */                                                                                                  String string2 = builderBuildUpon.build().toString();
/* 2338 */                                                                                                  if (z3) {
/* 2340 */                                                                                                      zl3Var2 = zl3Var3;
                                                                                                            }
/* 2343 */                                                                                                  strM1689c0 = null;
/* 2344 */                                                                                                  xo3Var = new xo3(string2, Collections.EMPTY_MAP, zl3Var2, null);
                                                                                                        }
/* 2371 */                                                                                              arrayList2.add(Pair.create(zzibVar5, xo3Var));
                                                                                                    }
/* 2376 */                                                                                          if (z3) {
/* 2506 */                                                                                              str2 = str;
/* 2508 */                                                                                              zzibVar = zzibVar2;
/* 2511 */                                                                                              ci3Var = this.f13911b;
/* 2513 */                                                                                              m6728S(ci3Var);
/* 2520 */                                                                                              if (ci3Var.m1683T()) {
/* 2535 */                                                                                                  if (Log.isLoggable(mo4557a().m9021J(), 2)) {
/* 2541 */                                                                                                      strM1689c0 = m6761i0().m1689c0(zzibVar);
                                                                                                            }
/* 2546 */                                                                                                  m6761i0();
/* 2549 */                                                                                                  byte[] bArrZzcc2 = zzibVar.zzcc();
/* 2553 */                                                                                                  m6774p(arrayList);
/* 2560 */                                                                                                  this.f13938w.f17199w.m4933b(j);
/* 2578 */                                                                                                  mo4557a().m9019G().m8513d("Uploading data. app, uncompressed size, data", str2, Integer.valueOf(bArrZzcc2.length), strM1689c0);
/* 2582 */                                                                                                  this.f13920f0 = true;
/* 2584 */                                                                                                  m6728S(ci3Var);
/* 2593 */                                                                                                  ci3Var.m1685Y(str2, xo3VarM10166A, zzibVar, new bp3(this, str2, arrayList2, 0));
/* 2596 */                                                                                                  return;
                                                                                                        }
/* 2596 */                                                                                              return;
                                                                                                    }
/* 2382 */                                                                                          zzhzVar = (zzhz) zzibVar2.zzcl();
/* 2389 */                                                                                          for (i3 = 0; i3 < zzibVar2.zzb(); i3++) {
/* 2399 */                                                                                              zzic zzicVar3 = (zzic) zzibVar2.zzc(i3).zzcl();
/* 2401 */                                                                                              zzicVar3.zzt();
/* 2404 */                                                                                              zzicVar3.zzaO(j);
/* 2407 */                                                                                              zzhzVar.zzd(i3, zzicVar3);
                                                                                                    }
/* 2423 */                                                                                          arrayList2.add(Pair.create((zzib) zzhzVar.zzbc(), xo3VarM10166A));
/* 2426 */                                                                                          m6774p(arrayList);
/* 2437 */                                                                                          m6783x(false, 204, null, null, str, arrayList2);
/* 2448 */                                                                                          if (m6778s(str, xo3VarM10166A.m10011a())) {
/* 2460 */                                                                                              mo4557a().m9019G().m8511b(str, "[sgtm] Sending sgtm batches available notification to app");
/* 2465 */                                                                                              intent = new Intent();
/* 2470 */                                                                                              intent.setAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
/* 2473 */                                                                                              intent.setPackage(str);
/* 2476 */                                                                                              contextMo4561e = ij3Var.mo4561e();
/* 2484 */                                                                                              if (Build.VERSION.SDK_INT < i) {
/* 2486 */                                                                                                  contextMo4561e.sendBroadcast(intent);
                                                                                                        } else {
/* 2 */                                                                                                     contextMo4561e.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
/* 1054 */                                                                                  cursorQuery2.close();
                                                                                            try {
/* 1067 */                                                                                      int iDelete2 = sQLiteDatabaseM261q0.delete("no_data_mode_events", "app_id=? AND timestamp_millis <= CAST(? AS INTEGER)", new String[]{str2, String.valueOf(jCurrentTimeMillis)});
/* 1075 */                                                                                      sh3 sh3VarM9019G3 = ij3Var3.mo4557a().m9019G();
/* 1091 */                                                                                      StringBuilder sb3 = new StringBuilder(String.valueOf(iDelete2).length() + 34);
/* 1094 */                                                                                      sb3.append("Pruned ");
/* 1097 */                                                                                      sb3.append(iDelete2);
/* 1100 */                                                                                      sb3.append(" NO_DATA mode events. appId");
/* 1107 */                                                                                      sh3VarM9019G3.m8511b(str2, sb3.toString());
                                                                                            } catch (SQLiteException e8) {
/* 1113 */                                                                                      e = e8;
/* 1152 */                                                                                      cursorQuery2 = null;
/* 1168 */                                                                                      ij3Var3.mo4557a().m9016D().m8512c(uh3.m9013H(str2), "Error flushing NO_DATA mode events. appId", e);
/* 1171 */                                                                                      list6 = Collections.EMPTY_LIST;
/* 1173 */                                                                                      if (cursorQuery2 != null) {
/* 1175 */                                                                                          cursorQuery2.close();
                                                                                                }
                                                                                            }
                                                                                        } else {
/* 1127 */                                                                                  arrayList6 = arrayList6;
/* 1129 */                                                                                  cursorQuery2.close();
                                                                                        }
/* 1132 */                                                                              list6 = arrayList6;
                                                                                    } catch (Throwable th2) {
/* 1018 */                                                                              th = th2;
/* 1019 */                                                                              cursorQuery2 = cursorQuery2;
/* 1135 */                                                                              cursor = cursorQuery2;
/* 1391 */                                                                              if (cursor != null) {
/* 1393 */                                                                                  cursor.close();
                                                                                        }
/* 1396 */                                                                              throw th;
                                                                                    }
                                                                                } catch (SQLiteException e9) {
/* 1139 */                                                                          e = e9;
/* 1140 */                                                                          cursorQuery2 = cursorQuery2;
/* 1142 */                                                                          ij3Var3 = ij3Var2;
                                                                                }
                                                                            } catch (SQLiteException e10) {
/* 1145 */                                                                      e = e10;
/* 1146 */                                                                      ij3Var3 = ij3Var2;
                                                                            }
/* 1178 */                                                                  it5 = list2.iterator();
/* 1182 */                                                                  z10 = true;
/* 1187 */                                                                  while (it5.hasNext()) {
/* 1193 */                                                                      Pair pair3 = (Pair) it5.next();
/* 1203 */                                                                      zzicVar2 = (zzic) ((zzid) pair3.first).zzcl();
/* 1205 */                                                                      if (z10) {
/* 1213 */                                                                          List listZzb3 = zzicVar2.zzb();
/* 1217 */                                                                          zzicVar2.zzi();
/* 1220 */                                                                          zzicVar2.zzh(list6);
/* 1223 */                                                                          zzicVar2.zzh(listZzb3);
/* 1226 */                                                                          z10 = false;
                                                                                }
/* 1227 */                                                                      zzhh zzhhVarZzb3 = zzho.zzb();
/* 1235 */                                                                      zzgfVarM9295U = m6754e0().m9295U(str2);
/* 1241 */                                                                      arrayList7 = new ArrayList();
/* 1244 */                                                                      if (zzgfVarM9295U != null) {
/* 1258 */                                                                          it6 = zzgfVarM9295U.zza().iterator();
/* 1266 */                                                                          while (it6.hasNext()) {
/* 1272 */                                                                              zzfu zzfuVar3 = (zzfu) it6.next();
/* 1274 */                                                                              Iterator it12 = it5;
/* 1276 */                                                                              zzhk zzhkVarZza3 = zzhl.zza();
/* 1284 */                                                                              boolean z15 = z10;
/* 1286 */                                                                              iZzb = zzfuVar3.zzb() - 1;
/* 1288 */                                                                              List list11 = list6;
/* 1291 */                                                                              if (iZzb != 1) {
/* 1315 */                                                                                  it7 = it6;
/* 1317 */                                                                                  i6 = 3;
/* 1318 */                                                                                  i7 = 2;
                                                                                        } else if (iZzb != 2) {
/* 1297 */                                                                                  it7 = it6;
/* 1299 */                                                                                  i6 = 3;
/* 1300 */                                                                                  if (iZzb != 3) {
/* 1308 */                                                                                      i7 = 4;
                                                                                            } else if (iZzb != 4) {
/* 1304 */                                                                                      i7 = 1;
                                                                                            } else {
/* 1306 */                                                                                      i7 = 5;
                                                                                            }
                                                                                        } else {
/* 1310 */                                                                                  it7 = it6;
/* 1312 */                                                                                  i6 = 3;
/* 1313 */                                                                                  i7 = 3;
                                                                                        }
/* 1319 */                                                                              zzhkVarZza3.zza(i7);
/* 1326 */                                                                              iZzd = zzfuVar3.zzd() - 1;
/* 1329 */                                                                              if (iZzd != 1) {
/* 1336 */                                                                                  i6 = 2;
                                                                                        } else if (iZzd != 2) {
/* 1334 */                                                                                  i6 = 1;
                                                                                        }
/* 1337 */                                                                              zzhkVarZza3.zzb(i6);
/* 1346 */                                                                              arrayList7.add((zzhl) zzhkVarZza3.zzbc());
/* 1349 */                                                                              it5 = it12;
/* 1351 */                                                                              list6 = list11;
/* 1353 */                                                                              z10 = z15;
/* 1355 */                                                                              it6 = it7;
                                                                                    }
                                                                                }
/* 1246 */                                                                      Iterator it13 = it5;
/* 1248 */                                                                      boolean z16 = z10;
/* 1250 */                                                                      List list12 = list6;
/* 1358 */                                                                      zzhhVarZzb3.zza(arrayList7);
/* 1361 */                                                                      zzicVar2.zzaQ(zzhhVarZzb3);
/* 1378 */                                                                      arrayList5.add(Pair.create((zzid) zzicVar2.zzbc(), (Long) pair3.second));
/* 1381 */                                                                      it5 = it13;
/* 1383 */                                                                      list6 = list12;
/* 1385 */                                                                      z10 = z16;
                                                                            }
/* 1389 */                                                                  list5 = arrayList5;
                                                                        } catch (Throwable th3) {
/* 1111 */                                                                  th = th3;
/* 1149 */                                                                  cursor = null;
/* 1391 */                                                                  if (cursor != null) {
/* 1393 */                                                                      cursor.close();
                                                                            }
/* 1396 */                                                                  throw th;
                                                                        }
                                                                    }
/* 1399 */                                                          zIsEmpty2 = list5.isEmpty();
                                                                    listSubList = list5;
/* 1403 */                                                          if (zIsEmpty2) {
/* 2596 */                                                              return;
                                                                    }
                                                                } else {
/* 1406 */                                                          i = 34;
                                                                    listSubList = list2;
                                                                }
/* 1408 */                                                      ok3VarM6752d = m6752d(str);
/* 1412 */                                                      nk3Var2 = nk3.AD_STORAGE;
/* 1418 */                                                      if (ok3VarM6752d.m7189i(nk3Var2)) {
/* 1420 */                                                          it4 = listSubList.iterator();
                                                                    while (true) {
/* 1428 */                                                              if (it4.hasNext()) {
/* 1455 */                                                                  strZzG = null;
                                                                            break;
                                                                        }
/* 1438 */                                                              zzidVar2 = (zzid) ((Pair) it4.next()).first;
/* 1448 */                                                              if (!zzidVar2.zzG().isEmpty()) {
/* 1450 */                                                                  strZzG = zzidVar2.zzG();
                                                                            break;
                                                                        }
                                                                    }
/* 1456 */                                                          if (strZzG != null) {
/* 1463 */                                                              while (i5 < listSubList.size()) {
/* 1473 */                                                                  zzidVar = (zzid) ((Pair) listSubList.get(i5)).first;
/* 1483 */                                                                  if (!zzidVar.zzG().isEmpty()) {
/* 1497 */                                                                      listSubList = listSubList.subList(0, i5);
                                                                                break;
                                                                            }
                                                                        }
                                                                    }
                                                                }
/* 1505 */                                                      zzhzVarZzh = zzib.zzh();
/* 1509 */                                                      size = listSubList.size();
/* 1519 */                                                      arrayList = new ArrayList(listSubList.size());
/* 1530 */                                                      if (m6753d0().m7397A(str2)) {
/* 1544 */                                                          z = false;
                                                                } else {
/* 1544 */                                                          z = false;
                                                                }
/* 1549 */                                                      zM7189i = m6752d(str).m7189i(nk3Var2);
/* 1557 */                                                      zM7189i2 = m6752d(str).m7189i(nk3Var);
/* 1561 */                                                      zzqu.zza();
/* 1570 */                                                      zM7406J2 = m6753d0().m7406J(str2, vg3.f18088M0);
/* 1574 */                                                      yo3Var = this.f13903U;
/* 1576 */                                                      xo3VarM10166A = yo3Var.m10166A(str2);
/* 1582 */                                                      i2 = 0;
                                                                list3 = listSubList;
                                                                while (true) {
/* 1583 */                                                          ij3Var = this.f13905W;
/* 1585 */                                                          if (i2 < size) {
                                                                        break;
                                                                        break;
                                                                    }
/* 1605 */                                                          zzicVar = (zzic) ((zzid) ((Pair) list3.get(i2)).first).zzcl();
/* 1611 */                                                          int i12 = size;
/* 1621 */                                                          arrayList.add((Long) ((Pair) list3.get(i2)).second);
/* 1628 */                                                          m6753d0().m7401E();
/* 1631 */                                                          z4 = zM7189i2;
/* 1632 */                                                          z5 = zM7406J2;
/* 1637 */                                                          zzicVar.zzO(130000L);
/* 1640 */                                                          zzicVar.zzs(j);
/* 1643 */                                                          ij3Var.getClass();
/* 1647 */                                                          zzicVar.zzae(false);
/* 1650 */                                                          if (!z) {
/* 1652 */                                                              zzicVar.zzan();
                                                                    }
/* 1655 */                                                          if (!zM7189i) {
/* 1657 */                                                              zzicVar.zzR();
/* 1660 */                                                              zzicVar.zzU();
                                                                    }
/* 1663 */                                                          if (!z4) {
/* 1665 */                                                              zzicVar.zzX();
                                                                    }
/* 1668 */                                                          m6781v(zzicVar, str2);
/* 1671 */                                                          if (!z5) {
/* 1673 */                                                              zzicVar.zzav();
                                                                    }
/* 1676 */                                                          if (!z4) {
/* 1678 */                                                              zzicVar.zzag();
                                                                    }
/* 1681 */                                                          strZzP = zzicVar.zzP();
/* 1689 */                                                          if (TextUtils.isEmpty(strZzP)) {
/* 1716 */                                                              arrayList4 = new ArrayList(zzicVar.zzb());
/* 1719 */                                                              it3 = arrayList4.iterator();
/* 1723 */                                                              z6 = z4;
/* 1725 */                                                              z7 = z;
/* 1727 */                                                              lValueOf = null;
/* 1728 */                                                              lValueOf2 = null;
/* 1729 */                                                              z8 = false;
/* 1731 */                                                              z9 = false;
/* 1737 */                                                              while (it3.hasNext()) {
/* 1743 */                                                                  it3 = it3;
/* 1747 */                                                                  zzhsVar = (zzhs) it3.next();
/* 1749 */                                                                  list3 = list3;
/* 1755 */                                                                  i2 = i2;
/* 1763 */                                                                  if ("_fx".equals(zzhsVar.zzd())) {
/* 1765 */                                                                      it3.remove();
/* 1774 */                                                                      z8 = true;
                                                                            } else if ("_f".equals(zzhsVar.zzd())) {
/* 1789 */                                                                      m6761i0();
/* 1794 */                                                                      zzhwVarM1661H = ci3.m1661H(zzhsVar, "_pfo");
/* 1798 */                                                                      if (zzhwVarM1661H != null) {
/* 1804 */                                                                          lValueOf = Long.valueOf(zzhwVarM1661H.zzf());
                                                                                }
/* 1808 */                                                                      m6761i0();
/* 1813 */                                                                      zzhwVarM1661H2 = ci3.m1661H(zzhsVar, "_uwa");
/* 1817 */                                                                      if (zzhwVarM1661H2 != null) {
/* 1823 */                                                                          lValueOf2 = Long.valueOf(zzhwVarM1661H2.zzf());
                                                                                }
                                                                            } else {
/* 1834 */                                                                      list3 = list3;
/* 1836 */                                                                      it3 = it3;
/* 1838 */                                                                      i2 = i2;
                                                                            }
/* 1776 */                                                                  z9 = true;
                                                                        }
/* 1841 */                                                              list4 = list3;
/* 1843 */                                                              i4 = i2;
/* 1845 */                                                              if (z8) {
/* 1847 */                                                                  zzicVar.zzi();
/* 1850 */                                                                  zzicVar.zzh(arrayList4);
                                                                        }
/* 1853 */                                                              if (z9) {
/* 1860 */                                                                  m6780u(zzicVar.zzK(), true, lValueOf, lValueOf2);
                                                                        }
                                                                    } else {
/* 1716 */                                                              arrayList4 = new ArrayList(zzicVar.zzb());
/* 1719 */                                                              it3 = arrayList4.iterator();
/* 1723 */                                                              z6 = z4;
/* 1725 */                                                              z7 = z;
/* 1727 */                                                              lValueOf = null;
/* 1728 */                                                              lValueOf2 = null;
/* 1729 */                                                              z8 = false;
/* 1731 */                                                              z9 = false;
/* 1737 */                                                              while (it3.hasNext()) {
/* 1743 */                                                                  it3 = it3;
/* 1747 */                                                                  zzhsVar = (zzhs) it3.next();
/* 1749 */                                                                  list3 = list3;
/* 1755 */                                                                  i2 = i2;
/* 1763 */                                                                  if ("_fx".equals(zzhsVar.zzd())) {
/* 1765 */                                                                      it3.remove();
/* 1774 */                                                                      z8 = true;
                                                                            } else if ("_f".equals(zzhsVar.zzd())) {
/* 1789 */                                                                      m6761i0();
/* 1794 */                                                                      zzhwVarM1661H = ci3.m1661H(zzhsVar, "_pfo");
/* 1798 */                                                                      if (zzhwVarM1661H != null) {
/* 1804 */                                                                          lValueOf = Long.valueOf(zzhwVarM1661H.zzf());
                                                                                }
/* 1808 */                                                                      m6761i0();
/* 1813 */                                                                      zzhwVarM1661H2 = ci3.m1661H(zzhsVar, "_uwa");
/* 1817 */                                                                      if (zzhwVarM1661H2 != null) {
/* 1823 */                                                                          lValueOf2 = Long.valueOf(zzhwVarM1661H2.zzf());
                                                                                }
                                                                            } else {
/* 1834 */                                                                      list3 = list3;
/* 1836 */                                                                      it3 = it3;
/* 1838 */                                                                      i2 = i2;
                                                                            }
/* 1776 */                                                                  z9 = true;
                                                                        }
/* 1841 */                                                              list4 = list3;
/* 1843 */                                                              i4 = i2;
/* 1845 */                                                              if (z8) {
/* 1847 */                                                                  zzicVar.zzi();
/* 1850 */                                                                  zzicVar.zzh(arrayList4);
                                                                        }
/* 1853 */                                                              if (z9) {
/* 1860 */                                                                  m6780u(zzicVar.zzK(), true, lValueOf, lValueOf2);
                                                                        }
                                                                    }
/* 1867 */                                                          if (zzicVar.zzc() != 0) {
/* 1880 */                                                              if (m6753d0().m7406J(str2, vg3.f18068C0)) {
/* 1900 */                                                                  zzicVar.zzas(m6761i0().m1694k0(((zzid) zzicVar.zzbc()).zzcc()));
                                                                        }
/* 1903 */                                                              zzisVarM10012b = xo3VarM10166A.m10012b();
/* 1907 */                                                              if (zzisVarM10012b != null) {
/* 1909 */                                                                  zzicVar.zzaN(zzisVarM10012b);
                                                                        }
/* 1912 */                                                              zzhzVarZzh.zze(zzicVar);
                                                                    }
/* 1915 */                                                          i2 = i4 + 1;
/* 1917 */                                                          zM7406J2 = z5;
/* 1919 */                                                          size = i12;
/* 1921 */                                                          zM7189i2 = z6;
/* 1923 */                                                          z = z7;
/* 1925 */                                                          list3 = list4;
                                                                }
/* 1935 */                                                      if (zzhzVarZzh.zzb() == 0) {
/* 1937 */                                                          m6774p(arrayList);
/* 1947 */                                                          m6783x(false, 204, null, null, str2, Collections.EMPTY_LIST);
/* 1950 */                                                          return;
                                                                }
/* 1955 */                                                      zzibVar = (zzib) zzhzVarZzh.zzbc();
/* 1959 */                                                      arrayList2 = new ArrayList();
/* 1962 */                                                      zl3Var = xo3VarM10166A.f19299c;
/* 1966 */                                                      if (zl3Var == zl3.SGTM_CLIENT) {
/* 1968 */                                                          z2 = true;
                                                                } else {
/* 1970 */                                                          z2 = false;
                                                                }
/* 1973 */                                                      if (zl3Var != zl3.SGTM) {
/* 1975 */                                                          if (z2) {
/* 1977 */                                                              z3 = true;
                                                                    } else {
/* 1979 */                                                              strM1689c0 = null;
                                                                    }
/* 2511 */                                                          ci3Var = this.f13911b;
/* 2513 */                                                          m6728S(ci3Var);
/* 2520 */                                                          if (ci3Var.m1683T()) {
/* 2535 */                                                              if (Log.isLoggable(mo4557a().m9021J(), 2)) {
/* 2541 */                                                                  strM1689c0 = m6761i0().m1689c0(zzibVar);
                                                                        }
/* 2546 */                                                              m6761i0();
/* 2549 */                                                              byte[] bArrZzcc3 = zzibVar.zzcc();
/* 2553 */                                                              m6774p(arrayList);
/* 2560 */                                                              this.f13938w.f17199w.m4933b(j);
/* 2578 */                                                              mo4557a().m9019G().m8513d("Uploading data. app, uncompressed size, data", str2, Integer.valueOf(bArrZzcc3.length), strM1689c0);
/* 2582 */                                                              this.f13920f0 = true;
/* 2584 */                                                              m6728S(ci3Var);
/* 2593 */                                                              ci3Var.m1685Y(str2, xo3VarM10166A, zzibVar, new bp3(this, str2, arrayList2, 0));
/* 2596 */                                                              return;
                                                                    }
/* 2596 */                                                          return;
                                                                }
/* 1983 */                                                      z3 = z2;
/* 1994 */                                                      it = ((zzib) zzhzVarZzh.zzbc()).zza().iterator();
                                                                while (true) {
/* 2002 */                                                          if (it.hasNext()) {
/* 2014 */                                                              if (((zzid) it.next()).zzY()) {
/* 2020 */                                                                  string = UUID.randomUUID().toString();
                                                                            break;
                                                                        }
                                                                    } else {
/* 2025 */                                                              string = null;
                                                                        break;
                                                                    }
                                                                }
/* 2030 */                                                      zzib zzibVar6 = (zzib) zzhzVarZzh.zzbc();
/* 2036 */                                                      mo4558b().mo1375y();
/* 2039 */                                                      m6765k0();
/* 2042 */                                                      zzhzVarZzi = zzib.zzi(zzibVar6);
/* 2050 */                                                      if (!TextUtils.isEmpty(string)) {
/* 2052 */                                                          zzhzVarZzi.zzi(string);
                                                                }
/* 2059 */                                                      strM9287M = m6754e0().m9287M(str2);
/* 2067 */                                                      if (!TextUtils.isEmpty(strM9287M)) {
/* 2069 */                                                          zzhzVarZzi.zzj(strM9287M);
                                                                }
/* 2074 */                                                      arrayList3 = new ArrayList();
/* 2081 */                                                      it2 = zzibVar6.zza().iterator();
/* 2089 */                                                      while (it2.hasNext()) {
/* 2097 */                                                          zzic zzicVarZzaF2 = zzid.zzaF((zzid) it2.next());
/* 2101 */                                                          zzicVarZzaF2.zzan();
/* 2110 */                                                          arrayList3.add((zzid) zzicVarZzaF2.zzbc());
                                                                }
/* 2114 */                                                      zzhzVarZzi.zzg();
/* 2117 */                                                      zzhzVarZzi.zzf(arrayList3);
/* 2124 */                                                      sh3 sh3VarM9019G4 = mo4557a().m9019G();
/* 2132 */                                                      if (TextUtils.isEmpty(string)) {
/* 2134 */                                                          strZzh = "null";
                                                                } else {
/* 2137 */                                                          strZzh = zzhzVarZzi.zzh();
                                                                }
/* 2143 */                                                      sh3VarM9019G4.m8511b(strZzh, "[sgtm] Processed MeasurementBatch for sGTM with sgtmJoinId: ");
/* 2150 */                                                      zzibVar2 = (zzib) zzhzVarZzi.zzbc();
/* 2156 */                                                      if (TextUtils.isEmpty(string)) {
/* 2162 */                                                          zzib zzibVar7 = (zzib) zzhzVarZzh.zzbc();
/* 2168 */                                                          mo4558b().mo1375y();
/* 2171 */                                                          m6765k0();
/* 2174 */                                                          zzhzVarZzh2 = zzib.zzh();
/* 2188 */                                                          mo4557a().m9019G().m8511b(string, "[sgtm] Processing Google Signal, sgtmJoinId:");
/* 2191 */                                                          zzhzVarZzh2.zzi(string);
/* 2206 */                                                          while (r0.hasNext()) {
/* 2214 */                                                              zzic zzicVarZzaE2 = zzid.zzaE();
/* 2222 */                                                              zzicVarZzaE2.zzam(zzidVar3.zzZ());
/* 2229 */                                                              zzicVarZzaE2.zzaJ(zzidVar3.zzav());
/* 2232 */                                                              zzhzVarZzh2.zze(zzicVarZzaE2);
                                                                    }
/* 2240 */                                                          zzib zzibVar8 = (zzib) zzhzVarZzh2.zzbc();
/* 2248 */                                                          strM9287M2 = yo3Var.f15676b.m6754e0().m9287M(str2);
/* 2252 */                                                          zIsEmpty = TextUtils.isEmpty(strM9287M2);
/* 2256 */                                                          zl3Var2 = zl3.GOOGLE_SIGNAL;
/* 2258 */                                                          zl3Var3 = zl3.GOOGLE_SIGNAL_PENDING;
/* 2260 */                                                          if (zIsEmpty) {
/* 2271 */                                                              Uri uri2 = Uri.parse((String) vg3.f18161s.m9011a(null));
/* 2275 */                                                              Uri.Builder builderBuildUpon2 = uri2.buildUpon();
/* 2279 */                                                              String authority2 = uri2.getAuthority();
/* 2307 */                                                              StringBuilder sb4 = new StringBuilder(String.valueOf(strM9287M2).length() + 1 + String.valueOf(authority2).length());
/* 2310 */                                                              sb4.append(strM9287M2);
/* 2315 */                                                              sb4.append(".");
/* 2318 */                                                              sb4.append(authority2);
/* 2325 */                                                              builderBuildUpon2.authority(sb4.toString());
/* 2334 */                                                              String string3 = builderBuildUpon2.build().toString();
/* 2338 */                                                              if (z3) {
/* 2340 */                                                                  zl3Var2 = zl3Var3;
                                                                        }
/* 2343 */                                                              strM1689c0 = null;
/* 2344 */                                                              xo3Var = new xo3(string3, Collections.EMPTY_MAP, zl3Var2, null);
                                                                    } else {
/* 2348 */                                                              strM1689c0 = null;
/* 2357 */                                                              String str4 = (String) vg3.f18161s.m9011a(null);
/* 2359 */                                                              if (z3) {
/* 2361 */                                                                  zl3Var2 = zl3Var3;
                                                                        }
/* 2364 */                                                              xo3Var = new xo3(str4, Collections.EMPTY_MAP, zl3Var2, null);
                                                                    }
/* 2371 */                                                          arrayList2.add(Pair.create(zzibVar8, xo3Var));
                                                                } else {
/* 2375 */                                                          strM1689c0 = null;
                                                                }
/* 2376 */                                                      if (z3) {
/* 2506 */                                                          str2 = str;
/* 2508 */                                                          zzibVar = zzibVar2;
/* 2511 */                                                          ci3Var = this.f13911b;
/* 2513 */                                                          m6728S(ci3Var);
/* 2520 */                                                          if (ci3Var.m1683T()) {
/* 2535 */                                                              if (Log.isLoggable(mo4557a().m9021J(), 2)) {
/* 2541 */                                                                  strM1689c0 = m6761i0().m1689c0(zzibVar);
                                                                        }
/* 2546 */                                                              m6761i0();
/* 2549 */                                                              byte[] bArrZzcc4 = zzibVar.zzcc();
/* 2553 */                                                              m6774p(arrayList);
/* 2560 */                                                              this.f13938w.f17199w.m4933b(j);
/* 2578 */                                                              mo4557a().m9019G().m8513d("Uploading data. app, uncompressed size, data", str2, Integer.valueOf(bArrZzcc4.length), strM1689c0);
/* 2582 */                                                              this.f13920f0 = true;
/* 2584 */                                                              m6728S(ci3Var);
/* 2593 */                                                              ci3Var.m1685Y(str2, xo3VarM10166A, zzibVar, new bp3(this, str2, arrayList2, 0));
/* 2596 */                                                              return;
                                                                    }
/* 2596 */                                                          return;
                                                                }
/* 2382 */                                                      zzhzVar = (zzhz) zzibVar2.zzcl();
/* 2389 */                                                      while (i3 < zzibVar2.zzb()) {
/* 2399 */                                                          zzic zzicVar4 = (zzic) zzibVar2.zzc(i3).zzcl();
/* 2401 */                                                          zzicVar4.zzt();
/* 2404 */                                                          zzicVar4.zzaO(j);
/* 2407 */                                                          zzhzVar.zzd(i3, zzicVar4);
                                                                }
/* 2423 */                                                      arrayList2.add(Pair.create((zzib) zzhzVar.zzbc(), xo3VarM10166A));
/* 2426 */                                                      m6774p(arrayList);
/* 2437 */                                                      m6783x(false, 204, null, null, str, arrayList2);
/* 2448 */                                                      if (m6778s(str, xo3VarM10166A.m10011a())) {
/* 2460 */                                                          mo4557a().m9019G().m8511b(str, "[sgtm] Sending sgtm batches available notification to app");
/* 2465 */                                                          intent = new Intent();
/* 2470 */                                                          intent.setAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
/* 2473 */                                                          intent.setPackage(str);
/* 2476 */                                                          contextMo4561e = ij3Var.mo4561e();
/* 2484 */                                                          if (Build.VERSION.SDK_INT < i) {
/* 2486 */                                                              contextMo4561e.sendBroadcast(intent);
                                                                    } else {
/* 2 */                                                                 contextMo4561e.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
                                                                    }
                                                                }
                                                            }
                                                        }
/* 173 */                                               gZIPInputStream.close();
/* 176 */                                               byteArrayInputStream.close();
/* 179 */                                               byte[] byteArray = byteArrayOutputStream.toByteArray();
/* 187 */                                               if (!arrayList8.isEmpty() && byteArray.length + length > iMax) {
                                                            break;
                                                        }
                                                        try {
/* 203 */                                                   zzic zzicVar5 = (zzic) ci3.m1677m0(zzid.zzaE(), byteArray);
/* 209 */                                                   if (!arrayList8.isEmpty()) {
/* 220 */                                                       zzid zzidVar4 = (zzid) ((Pair) arrayList8.get(0)).first;
/* 226 */                                                       zzid zzidVar5 = (zzid) zzicVar5.zzbc();
/* 240 */                                                       if (!zzidVar4.zzaf().equals(zzidVar5.zzaf()) || !zzidVar4.zzam().equals(zzidVar5.zzam()) || zzidVar4.zzao() != zzidVar5.zzao() || !zzidVar4.zzaq().equals(zzidVar5.zzaq())) {
                                                                    break;
                                                                }
/* 284 */                                                       Iterator it14 = zzidVar4.zzf().iterator();
                                                                while (true) {
/* 294 */                                                           if (!it14.hasNext()) {
/* 322 */                                                               jZzg = -1;
                                                                        break;
                                                                    }
/* 300 */                                                           zziu zziuVar = (zziu) it14.next();
/* 302 */                                                           Iterator it15 = it14;
/* 312 */                                                           if ("_npa".equals(zziuVar.zzc())) {
/* 314 */                                                               jZzg = zziuVar.zzg();
                                                                        break;
                                                                    }
/* 319 */                                                           it14 = it15;
                                                                }
/* 328 */                                                       Iterator it16 = zzidVar5.zzf().iterator();
                                                                while (true) {
/* 336 */                                                           if (!it16.hasNext()) {
/* 359 */                                                               jZzg2 = -1;
                                                                        break;
                                                                    }
/* 342 */                                                           zziu zziuVar2 = (zziu) it16.next();
/* 352 */                                                           if ("_npa".equals(zziuVar2.zzc())) {
/* 354 */                                                               jZzg2 = zziuVar2.zzg();
                                                                        break;
                                                                    }
                                                                }
/* 363 */                                                       if (jZzg != jZzg2) {
                                                                    break;
                                                                }
                                                            }
/* 370 */                                                   if (!cursorQuery.isNull(2)) {
/* 376 */                                                       zzicVar5.zzao(cursorQuery.getInt(2));
                                                            }
/* 380 */                                                   length += byteArray.length;
/* 395 */                                                   arrayList8.add(Pair.create((zzid) zzicVar5.zzbc(), Long.valueOf(j3)));
                                                        } catch (IOException e11) {
/* 416 */                                                   ij3Var4.mo4557a().m9016D().m8512c(uh3.m9013H(str2), "Failed to merge queued bundle. appId", e11);
                                                        }
/* 398 */                                               ij3Var4 = ij3Var4;
/* 488 */                                               if (cursorQuery.moveToNext() || length > iMax) {
                                                            break;
                                                            break;
                                                        }
/* 493 */                                               ae3VarM6755f0 = ae3Var;
/* 495 */                                               ij3Var4 = ij3Var4;
/* 497 */                                               i8 = 0;
/* 498 */                                               i9 = 1;
                                                    } catch (IOException e12) {
/* 436 */                                               e = e12;
/* 437 */                                               ae3Var = ae3VarM6755f0;
                                                    }
                                                } catch (IOException e13) {
/* 462 */                                           e = e13;
/* 463 */                                           ae3Var = ae3VarM6755f0;
/* 465 */                                           ij3Var4 = ij3Var4;
                                                }
                                            }
/* 501 */                                   cursorQuery.close();
                                            list2 = arrayList8;
                                        } else {
/* 110 */                                   list = Collections.EMPTY_LIST;
/* 112 */                                   cursorQuery.close();
/* 115 */                                   list2 = list;
                                        }
                                    } catch (SQLiteException e14) {
/* 121 */                               e = e14;
/* 122 */                               ij3Var4 = ij3Var4;
                                    }
                                } catch (SQLiteException e15) {
/* 510 */                           e = e15;
/* 523 */                           cursorQuery = null;
/* 538 */                           ij3Var4.mo4557a().m9016D().m8512c(uh3.m9013H(str2), "Error querying bundles. appId", e);
/* 541 */                           list = Collections.EMPTY_LIST;
/* 543 */                           if (cursorQuery != null) {
/* 112 */                               cursorQuery.close();
                                    }
/* 115 */                           list2 = list;
/* 551 */                           if (list2.isEmpty()) {
/* 2596 */                              return;
                                    }
/* 555 */                           com.google.android.gms.internal.measurement.zzpk.zza();
/* 558 */                           pd3 pd3VarM6753d1 = m6753d0();
/* 562 */                           ug3Var = vg3.f18141i1;
/* 565 */                           zM7406J = pd3VarM6753d1.m7406J(null, ug3Var);
/* 571 */                           nk3Var = nk3.ANALYTICS_STORAGE;
/* 573 */                           if (zM7406J) {
/* 575 */                               com.google.android.gms.internal.measurement.zzpk.zza();
/* 586 */                               if (!m6753d0().m7406J(null, ug3Var)) {
/* 1397 */                                  i = 34;
                                            list5 = list2;
                                        } else if (m6752d(str).m7189i(nk3Var)) {
/* 897 */                                   i = 34;
/* 905 */                                   arrayList5 = new ArrayList(list2.size());
/* 908 */                                   ae3 ae3VarM6755f3 = m6755f0();
/* 914 */                                   ij3Var2 = (ij3) ae3VarM6755f3.f16749a;
/* 916 */                                   kb1.m6058k(str2);
/* 919 */                                   ae3VarM6755f3.mo1375y();
/* 922 */                                   ae3VarM6755f3.m9593A();
/* 927 */                                   arrayList6 = new ArrayList();
/* 934 */                                   sQLiteDatabaseM261q0 = ae3VarM6755f3.m261q0();
/* 944 */                                   ((xt0) ij3Var2.mo4562f()).getClass();
/* 947 */                                   jCurrentTimeMillis = System.currentTimeMillis();
/* 975 */                                   cursorQuery2 = sQLiteDatabaseM261q0.query("no_data_mode_events", new String[]{SharedDataContentProvider.BASE_PATH}, "app_id=? AND timestamp_millis <= CAST(? AS INTEGER)", new String[]{str2, String.valueOf(jCurrentTimeMillis)}, null, null, "rowid", null);
/* 985 */                                   if (cursorQuery2.moveToFirst()) {
/* 987 */                                       ij3Var3 = ij3Var2;
                                                while (true) {
/* 1010 */                                          arrayList6.add((zzhs) ((zzhr) ci3.m1677m0(zzhs.zzk(), cursorQuery2.getBlob(0))).zzbc());
/* 1052 */                                          if (!cursorQuery2.moveToNext()) {
                                                        break;
                                                        break;
                                                    } else {
/* 1119 */                                              cursorQuery2 = cursorQuery2;
/* 1121 */                                              arrayList6 = arrayList6;
                                                    }
                                                }
/* 1054 */                                      cursorQuery2.close();
/* 1067 */                                      int iDelete3 = sQLiteDatabaseM261q0.delete("no_data_mode_events", "app_id=? AND timestamp_millis <= CAST(? AS INTEGER)", new String[]{str2, String.valueOf(jCurrentTimeMillis)});
/* 1075 */                                      sh3 sh3VarM9019G5 = ij3Var3.mo4557a().m9019G();
/* 1091 */                                      StringBuilder sb5 = new StringBuilder(String.valueOf(iDelete3).length() + 34);
/* 1094 */                                      sb5.append("Pruned ");
/* 1097 */                                      sb5.append(iDelete3);
/* 1100 */                                      sb5.append(" NO_DATA mode events. appId");
/* 1107 */                                      sh3VarM9019G5.m8511b(str2, sb5.toString());
                                            } else {
/* 1127 */                                      arrayList6 = arrayList6;
/* 1129 */                                      cursorQuery2.close();
                                            }
/* 1132 */                                  list6 = arrayList6;
/* 1178 */                                  it5 = list2.iterator();
/* 1182 */                                  z10 = true;
/* 1187 */                                  while (it5.hasNext()) {
/* 1193 */                                      Pair pair4 = (Pair) it5.next();
/* 1203 */                                      zzicVar2 = (zzic) ((zzid) pair4.first).zzcl();
/* 1205 */                                      if (z10) {
/* 1213 */                                          List listZzb4 = zzicVar2.zzb();
/* 1217 */                                          zzicVar2.zzi();
/* 1220 */                                          zzicVar2.zzh(list6);
/* 1223 */                                          zzicVar2.zzh(listZzb4);
/* 1226 */                                          z10 = false;
                                                }
/* 1227 */                                      zzhh zzhhVarZzb4 = zzho.zzb();
/* 1235 */                                      zzgfVarM9295U = m6754e0().m9295U(str2);
/* 1241 */                                      arrayList7 = new ArrayList();
/* 1244 */                                      if (zzgfVarM9295U != null) {
/* 1258 */                                          it6 = zzgfVarM9295U.zza().iterator();
/* 1266 */                                          while (it6.hasNext()) {
/* 1272 */                                              zzfu zzfuVar4 = (zzfu) it6.next();
/* 1274 */                                              Iterator it17 = it5;
/* 1276 */                                              zzhk zzhkVarZza4 = zzhl.zza();
/* 1284 */                                              boolean z17 = z10;
/* 1286 */                                              iZzb = zzfuVar4.zzb() - 1;
/* 1288 */                                              List list13 = list6;
/* 1291 */                                              if (iZzb != 1) {
/* 1315 */                                                  it7 = it6;
/* 1317 */                                                  i6 = 3;
/* 1318 */                                                  i7 = 2;
                                                        } else if (iZzb != 2) {
/* 1297 */                                                  it7 = it6;
/* 1299 */                                                  i6 = 3;
/* 1300 */                                                  if (iZzb != 3) {
/* 1308 */                                                      i7 = 4;
                                                            } else if (iZzb != 4) {
/* 1304 */                                                      i7 = 1;
                                                            } else {
/* 1306 */                                                      i7 = 5;
                                                            }
                                                        } else {
/* 1310 */                                                  it7 = it6;
/* 1312 */                                                  i6 = 3;
/* 1313 */                                                  i7 = 3;
                                                        }
/* 1319 */                                              zzhkVarZza4.zza(i7);
/* 1326 */                                              iZzd = zzfuVar4.zzd() - 1;
/* 1329 */                                              if (iZzd != 1) {
/* 1336 */                                                  i6 = 2;
                                                        } else if (iZzd != 2) {
/* 1334 */                                                  i6 = 1;
                                                        }
/* 1337 */                                              zzhkVarZza4.zzb(i6);
/* 1346 */                                              arrayList7.add((zzhl) zzhkVarZza4.zzbc());
/* 1349 */                                              it5 = it17;
/* 1351 */                                              list6 = list13;
/* 1353 */                                              z10 = z17;
/* 1355 */                                              it6 = it7;
                                                    }
                                                }
/* 1246 */                                      Iterator it18 = it5;
/* 1248 */                                      boolean z18 = z10;
/* 1250 */                                      List list14 = list6;
/* 1358 */                                      zzhhVarZzb4.zza(arrayList7);
/* 1361 */                                      zzicVar2.zzaQ(zzhhVarZzb4);
/* 1378 */                                      arrayList5.add(Pair.create((zzid) zzicVar2.zzbc(), (Long) pair4.second));
/* 1381 */                                      it5 = it18;
/* 1383 */                                      list6 = list14;
/* 1385 */                                      z10 = z18;
                                            }
/* 1389 */                                  list5 = arrayList5;
                                        } else {
/* 897 */                                   i = 34;
/* 905 */                                   arrayList5 = new ArrayList(list2.size());
/* 908 */                                   ae3 ae3VarM6755f4 = m6755f0();
/* 914 */                                   ij3Var2 = (ij3) ae3VarM6755f4.f16749a;
/* 916 */                                   kb1.m6058k(str2);
/* 919 */                                   ae3VarM6755f4.mo1375y();
/* 922 */                                   ae3VarM6755f4.m9593A();
/* 927 */                                   arrayList6 = new ArrayList();
/* 934 */                                   sQLiteDatabaseM261q0 = ae3VarM6755f4.m261q0();
/* 944 */                                   ((xt0) ij3Var2.mo4562f()).getClass();
/* 947 */                                   jCurrentTimeMillis = System.currentTimeMillis();
/* 975 */                                   cursorQuery2 = sQLiteDatabaseM261q0.query("no_data_mode_events", new String[]{SharedDataContentProvider.BASE_PATH}, "app_id=? AND timestamp_millis <= CAST(? AS INTEGER)", new String[]{str2, String.valueOf(jCurrentTimeMillis)}, null, null, "rowid", null);
/* 985 */                                   if (cursorQuery2.moveToFirst()) {
/* 987 */                                       ij3Var3 = ij3Var2;
                                                while (true) {
/* 1010 */                                          arrayList6.add((zzhs) ((zzhr) ci3.m1677m0(zzhs.zzk(), cursorQuery2.getBlob(0))).zzbc());
/* 1052 */                                          if (!cursorQuery2.moveToNext()) {
                                                        break;
                                                        break;
                                                    } else {
/* 1119 */                                              cursorQuery2 = cursorQuery2;
/* 1121 */                                              arrayList6 = arrayList6;
                                                    }
                                                }
/* 1054 */                                      cursorQuery2.close();
/* 1067 */                                      int iDelete4 = sQLiteDatabaseM261q0.delete("no_data_mode_events", "app_id=? AND timestamp_millis <= CAST(? AS INTEGER)", new String[]{str2, String.valueOf(jCurrentTimeMillis)});
/* 1075 */                                      sh3 sh3VarM9019G6 = ij3Var3.mo4557a().m9019G();
/* 1091 */                                      StringBuilder sb6 = new StringBuilder(String.valueOf(iDelete4).length() + 34);
/* 1094 */                                      sb6.append("Pruned ");
/* 1097 */                                      sb6.append(iDelete4);
/* 1100 */                                      sb6.append(" NO_DATA mode events. appId");
/* 1107 */                                      sh3VarM9019G6.m8511b(str2, sb6.toString());
                                            } else {
/* 1127 */                                      arrayList6 = arrayList6;
/* 1129 */                                      cursorQuery2.close();
                                            }
/* 1132 */                                  list6 = arrayList6;
/* 1178 */                                  it5 = list2.iterator();
/* 1182 */                                  z10 = true;
/* 1187 */                                  while (it5.hasNext()) {
/* 1193 */                                      Pair pair5 = (Pair) it5.next();
/* 1203 */                                      zzicVar2 = (zzic) ((zzid) pair5.first).zzcl();
/* 1205 */                                      if (z10) {
/* 1213 */                                          List listZzb5 = zzicVar2.zzb();
/* 1217 */                                          zzicVar2.zzi();
/* 1220 */                                          zzicVar2.zzh(list6);
/* 1223 */                                          zzicVar2.zzh(listZzb5);
/* 1226 */                                          z10 = false;
                                                }
/* 1227 */                                      zzhh zzhhVarZzb5 = zzho.zzb();
/* 1235 */                                      zzgfVarM9295U = m6754e0().m9295U(str2);
/* 1241 */                                      arrayList7 = new ArrayList();
/* 1244 */                                      if (zzgfVarM9295U != null) {
/* 1258 */                                          it6 = zzgfVarM9295U.zza().iterator();
/* 1266 */                                          while (it6.hasNext()) {
/* 1272 */                                              zzfu zzfuVar5 = (zzfu) it6.next();
/* 1274 */                                              Iterator it19 = it5;
/* 1276 */                                              zzhk zzhkVarZza5 = zzhl.zza();
/* 1284 */                                              boolean z19 = z10;
/* 1286 */                                              iZzb = zzfuVar5.zzb() - 1;
/* 1288 */                                              List list15 = list6;
/* 1291 */                                              if (iZzb != 1) {
/* 1315 */                                                  it7 = it6;
/* 1317 */                                                  i6 = 3;
/* 1318 */                                                  i7 = 2;
                                                        } else if (iZzb != 2) {
/* 1297 */                                                  it7 = it6;
/* 1299 */                                                  i6 = 3;
/* 1300 */                                                  if (iZzb != 3) {
/* 1308 */                                                      i7 = 4;
                                                            } else if (iZzb != 4) {
/* 1304 */                                                      i7 = 1;
                                                            } else {
/* 1306 */                                                      i7 = 5;
                                                            }
                                                        } else {
/* 1310 */                                                  it7 = it6;
/* 1312 */                                                  i6 = 3;
/* 1313 */                                                  i7 = 3;
                                                        }
/* 1319 */                                              zzhkVarZza5.zza(i7);
/* 1326 */                                              iZzd = zzfuVar5.zzd() - 1;
/* 1329 */                                              if (iZzd != 1) {
/* 1336 */                                                  i6 = 2;
                                                        } else if (iZzd != 2) {
/* 1334 */                                                  i6 = 1;
                                                        }
/* 1337 */                                              zzhkVarZza5.zzb(i6);
/* 1346 */                                              arrayList7.add((zzhl) zzhkVarZza5.zzbc());
/* 1349 */                                              it5 = it19;
/* 1351 */                                              list6 = list15;
/* 1353 */                                              z10 = z19;
/* 1355 */                                              it6 = it7;
                                                    }
                                                }
/* 1246 */                                      Iterator it110 = it5;
/* 1248 */                                      boolean z110 = z10;
/* 1250 */                                      List list16 = list6;
/* 1358 */                                      zzhhVarZzb5.zza(arrayList7);
/* 1361 */                                      zzicVar2.zzaQ(zzhhVarZzb5);
/* 1378 */                                      arrayList5.add(Pair.create((zzid) zzicVar2.zzbc(), (Long) pair5.second));
/* 1381 */                                      it5 = it110;
/* 1383 */                                      list6 = list16;
/* 1385 */                                      z10 = z110;
                                            }
/* 1389 */                                  list5 = arrayList5;
                                        }
/* 1399 */                              zIsEmpty2 = list5.isEmpty();
                                        listSubList = list5;
/* 1403 */                              if (zIsEmpty2) {
/* 2596 */                                  return;
                                        }
                                    } else {
/* 1406 */                              i = 34;
                                        listSubList = list2;
                                    }
/* 1408 */                          ok3VarM6752d = m6752d(str);
/* 1412 */                          nk3Var2 = nk3.AD_STORAGE;
/* 1418 */                          if (ok3VarM6752d.m7189i(nk3Var2)) {
/* 1420 */                              it4 = listSubList.iterator();
                                        while (true) {
/* 1428 */                                  if (it4.hasNext()) {
/* 1455 */                                      strZzG = null;
                                                break;
                                            }
/* 1438 */                                  zzidVar2 = (zzid) ((Pair) it4.next()).first;
/* 1448 */                                  if (!zzidVar2.zzG().isEmpty()) {
/* 1450 */                                      strZzG = zzidVar2.zzG();
                                                break;
                                            }
                                        }
/* 1456 */                              if (strZzG != null) {
/* 1463 */                                  while (i5 < listSubList.size()) {
/* 1473 */                                      zzidVar = (zzid) ((Pair) listSubList.get(i5)).first;
/* 1483 */                                      if (!zzidVar.zzG().isEmpty()) {
/* 1497 */                                          listSubList = listSubList.subList(0, i5);
                                                    break;
                                                }
                                            }
                                        }
                                    }
/* 1505 */                          zzhzVarZzh = zzib.zzh();
/* 1509 */                          size = listSubList.size();
/* 1519 */                          arrayList = new ArrayList(listSubList.size());
/* 1530 */                          if (m6753d0().m7397A(str2)) {
/* 1544 */                              z = false;
                                    } else {
/* 1544 */                              z = false;
                                    }
/* 1549 */                          zM7189i = m6752d(str).m7189i(nk3Var2);
/* 1557 */                          zM7189i2 = m6752d(str).m7189i(nk3Var);
/* 1561 */                          zzqu.zza();
/* 1570 */                          zM7406J2 = m6753d0().m7406J(str2, vg3.f18088M0);
/* 1574 */                          yo3Var = this.f13903U;
/* 1576 */                          xo3VarM10166A = yo3Var.m10166A(str2);
/* 1582 */                          i2 = 0;
                                    list3 = listSubList;
                                    while (true) {
/* 1583 */                              ij3Var = this.f13905W;
/* 1585 */                              if (i2 < size) {
                                            break;
                                            break;
                                        }
/* 1605 */                              zzicVar = (zzic) ((zzid) ((Pair) list3.get(i2)).first).zzcl();
/* 1611 */                              int i13 = size;
/* 1621 */                              arrayList.add((Long) ((Pair) list3.get(i2)).second);
/* 1628 */                              m6753d0().m7401E();
/* 1631 */                              z4 = zM7189i2;
/* 1632 */                              z5 = zM7406J2;
/* 1637 */                              zzicVar.zzO(130000L);
/* 1640 */                              zzicVar.zzs(j);
/* 1643 */                              ij3Var.getClass();
/* 1647 */                              zzicVar.zzae(false);
/* 1650 */                              if (!z) {
/* 1652 */                                  zzicVar.zzan();
                                        }
/* 1655 */                              if (!zM7189i) {
/* 1657 */                                  zzicVar.zzR();
/* 1660 */                                  zzicVar.zzU();
                                        }
/* 1663 */                              if (!z4) {
/* 1665 */                                  zzicVar.zzX();
                                        }
/* 1668 */                              m6781v(zzicVar, str2);
/* 1671 */                              if (!z5) {
/* 1673 */                                  zzicVar.zzav();
                                        }
/* 1676 */                              if (!z4) {
/* 1678 */                                  zzicVar.zzag();
                                        }
/* 1681 */                              strZzP = zzicVar.zzP();
/* 1689 */                              if (TextUtils.isEmpty(strZzP)) {
/* 1716 */                                  arrayList4 = new ArrayList(zzicVar.zzb());
/* 1719 */                                  it3 = arrayList4.iterator();
/* 1723 */                                  z6 = z4;
/* 1725 */                                  z7 = z;
/* 1727 */                                  lValueOf = null;
/* 1728 */                                  lValueOf2 = null;
/* 1729 */                                  z8 = false;
/* 1731 */                                  z9 = false;
/* 1737 */                                  while (it3.hasNext()) {
/* 1743 */                                      it3 = it3;
/* 1747 */                                      zzhsVar = (zzhs) it3.next();
/* 1749 */                                      list3 = list3;
/* 1755 */                                      i2 = i2;
/* 1763 */                                      if ("_fx".equals(zzhsVar.zzd())) {
/* 1765 */                                          it3.remove();
/* 1774 */                                          z8 = true;
                                                } else if ("_f".equals(zzhsVar.zzd())) {
/* 1789 */                                          m6761i0();
/* 1794 */                                          zzhwVarM1661H = ci3.m1661H(zzhsVar, "_pfo");
/* 1798 */                                          if (zzhwVarM1661H != null) {
/* 1804 */                                              lValueOf = Long.valueOf(zzhwVarM1661H.zzf());
                                                    }
/* 1808 */                                          m6761i0();
/* 1813 */                                          zzhwVarM1661H2 = ci3.m1661H(zzhsVar, "_uwa");
/* 1817 */                                          if (zzhwVarM1661H2 != null) {
/* 1823 */                                              lValueOf2 = Long.valueOf(zzhwVarM1661H2.zzf());
                                                    }
                                                } else {
/* 1834 */                                          list3 = list3;
/* 1836 */                                          it3 = it3;
/* 1838 */                                          i2 = i2;
                                                }
/* 1776 */                                      z9 = true;
                                            }
/* 1841 */                                  list4 = list3;
/* 1843 */                                  i4 = i2;
/* 1845 */                                  if (z8) {
/* 1847 */                                      zzicVar.zzi();
/* 1850 */                                      zzicVar.zzh(arrayList4);
                                            }
/* 1853 */                                  if (z9) {
/* 1860 */                                      m6780u(zzicVar.zzK(), true, lValueOf, lValueOf2);
                                            }
                                        } else {
/* 1716 */                                  arrayList4 = new ArrayList(zzicVar.zzb());
/* 1719 */                                  it3 = arrayList4.iterator();
/* 1723 */                                  z6 = z4;
/* 1725 */                                  z7 = z;
/* 1727 */                                  lValueOf = null;
/* 1728 */                                  lValueOf2 = null;
/* 1729 */                                  z8 = false;
/* 1731 */                                  z9 = false;
/* 1737 */                                  while (it3.hasNext()) {
/* 1743 */                                      it3 = it3;
/* 1747 */                                      zzhsVar = (zzhs) it3.next();
/* 1749 */                                      list3 = list3;
/* 1755 */                                      i2 = i2;
/* 1763 */                                      if ("_fx".equals(zzhsVar.zzd())) {
/* 1765 */                                          it3.remove();
/* 1774 */                                          z8 = true;
                                                } else if ("_f".equals(zzhsVar.zzd())) {
/* 1789 */                                          m6761i0();
/* 1794 */                                          zzhwVarM1661H = ci3.m1661H(zzhsVar, "_pfo");
/* 1798 */                                          if (zzhwVarM1661H != null) {
/* 1804 */                                              lValueOf = Long.valueOf(zzhwVarM1661H.zzf());
                                                    }
/* 1808 */                                          m6761i0();
/* 1813 */                                          zzhwVarM1661H2 = ci3.m1661H(zzhsVar, "_uwa");
/* 1817 */                                          if (zzhwVarM1661H2 != null) {
/* 1823 */                                              lValueOf2 = Long.valueOf(zzhwVarM1661H2.zzf());
                                                    }
                                                } else {
/* 1834 */                                          list3 = list3;
/* 1836 */                                          it3 = it3;
/* 1838 */                                          i2 = i2;
                                                }
/* 1776 */                                      z9 = true;
                                            }
/* 1841 */                                  list4 = list3;
/* 1843 */                                  i4 = i2;
/* 1845 */                                  if (z8) {
/* 1847 */                                      zzicVar.zzi();
/* 1850 */                                      zzicVar.zzh(arrayList4);
                                            }
/* 1853 */                                  if (z9) {
/* 1860 */                                      m6780u(zzicVar.zzK(), true, lValueOf, lValueOf2);
                                            }
                                        }
/* 1867 */                              if (zzicVar.zzc() != 0) {
/* 1880 */                                  if (m6753d0().m7406J(str2, vg3.f18068C0)) {
/* 1900 */                                      zzicVar.zzas(m6761i0().m1694k0(((zzid) zzicVar.zzbc()).zzcc()));
                                            }
/* 1903 */                                  zzisVarM10012b = xo3VarM10166A.m10012b();
/* 1907 */                                  if (zzisVarM10012b != null) {
/* 1909 */                                      zzicVar.zzaN(zzisVarM10012b);
                                            }
/* 1912 */                                  zzhzVarZzh.zze(zzicVar);
                                        }
/* 1915 */                              i2 = i4 + 1;
/* 1917 */                              zM7406J2 = z5;
/* 1919 */                              size = i13;
/* 1921 */                              zM7189i2 = z6;
/* 1923 */                              z = z7;
/* 1925 */                              list3 = list4;
                                    }
/* 1935 */                          if (zzhzVarZzh.zzb() == 0) {
/* 1937 */                              m6774p(arrayList);
/* 1947 */                              m6783x(false, 204, null, null, str2, Collections.EMPTY_LIST);
/* 1950 */                              return;
                                    }
/* 1955 */                          zzibVar = (zzib) zzhzVarZzh.zzbc();
/* 1959 */                          arrayList2 = new ArrayList();
/* 1962 */                          zl3Var = xo3VarM10166A.f19299c;
/* 1966 */                          if (zl3Var == zl3.SGTM_CLIENT) {
/* 1968 */                              z2 = true;
                                    } else {
/* 1970 */                              z2 = false;
                                    }
/* 1973 */                          if (zl3Var != zl3.SGTM) {
/* 1975 */                              if (z2) {
/* 1977 */                                  z3 = true;
                                        } else {
/* 1979 */                                  strM1689c0 = null;
                                        }
/* 2511 */                              ci3Var = this.f13911b;
/* 2513 */                              m6728S(ci3Var);
/* 2520 */                              if (ci3Var.m1683T()) {
/* 2535 */                                  if (Log.isLoggable(mo4557a().m9021J(), 2)) {
/* 2541 */                                      strM1689c0 = m6761i0().m1689c0(zzibVar);
                                            }
/* 2546 */                                  m6761i0();
/* 2549 */                                  byte[] bArrZzcc5 = zzibVar.zzcc();
/* 2553 */                                  m6774p(arrayList);
/* 2560 */                                  this.f13938w.f17199w.m4933b(j);
/* 2578 */                                  mo4557a().m9019G().m8513d("Uploading data. app, uncompressed size, data", str2, Integer.valueOf(bArrZzcc5.length), strM1689c0);
/* 2582 */                                  this.f13920f0 = true;
/* 2584 */                                  m6728S(ci3Var);
/* 2593 */                                  ci3Var.m1685Y(str2, xo3VarM10166A, zzibVar, new bp3(this, str2, arrayList2, 0));
/* 2596 */                                  return;
                                        }
/* 2596 */                              return;
                                    }
/* 1983 */                          z3 = z2;
/* 1994 */                          it = ((zzib) zzhzVarZzh.zzbc()).zza().iterator();
                                    while (true) {
/* 2002 */                              if (it.hasNext()) {
/* 2014 */                                  if (((zzid) it.next()).zzY()) {
/* 2020 */                                      string = UUID.randomUUID().toString();
                                                break;
                                            }
                                        } else {
/* 2025 */                                  string = null;
                                            break;
                                        }
                                    }
/* 2030 */                          zzib zzibVar9 = (zzib) zzhzVarZzh.zzbc();
/* 2036 */                          mo4558b().mo1375y();
/* 2039 */                          m6765k0();
/* 2042 */                          zzhzVarZzi = zzib.zzi(zzibVar9);
/* 2050 */                          if (!TextUtils.isEmpty(string)) {
/* 2052 */                              zzhzVarZzi.zzi(string);
                                    }
/* 2059 */                          strM9287M = m6754e0().m9287M(str2);
/* 2067 */                          if (!TextUtils.isEmpty(strM9287M)) {
/* 2069 */                              zzhzVarZzi.zzj(strM9287M);
                                    }
/* 2074 */                          arrayList3 = new ArrayList();
/* 2081 */                          it2 = zzibVar9.zza().iterator();
/* 2089 */                          while (it2.hasNext()) {
/* 2097 */                              zzic zzicVarZzaF3 = zzid.zzaF((zzid) it2.next());
/* 2101 */                              zzicVarZzaF3.zzan();
/* 2110 */                              arrayList3.add((zzid) zzicVarZzaF3.zzbc());
                                    }
/* 2114 */                          zzhzVarZzi.zzg();
/* 2117 */                          zzhzVarZzi.zzf(arrayList3);
/* 2124 */                          sh3 sh3VarM9019G7 = mo4557a().m9019G();
/* 2132 */                          if (TextUtils.isEmpty(string)) {
/* 2134 */                              strZzh = "null";
                                    } else {
/* 2137 */                              strZzh = zzhzVarZzi.zzh();
                                    }
/* 2143 */                          sh3VarM9019G7.m8511b(strZzh, "[sgtm] Processed MeasurementBatch for sGTM with sgtmJoinId: ");
/* 2150 */                          zzibVar2 = (zzib) zzhzVarZzi.zzbc();
/* 2156 */                          if (TextUtils.isEmpty(string)) {
/* 2162 */                              zzib zzibVar10 = (zzib) zzhzVarZzh.zzbc();
/* 2168 */                              mo4558b().mo1375y();
/* 2171 */                              m6765k0();
/* 2174 */                              zzhzVarZzh2 = zzib.zzh();
/* 2188 */                              mo4557a().m9019G().m8511b(string, "[sgtm] Processing Google Signal, sgtmJoinId:");
/* 2191 */                              zzhzVarZzh2.zzi(string);
/* 2206 */                              while (r0.hasNext()) {
/* 2214 */                                  zzic zzicVarZzaE3 = zzid.zzaE();
/* 2222 */                                  zzicVarZzaE3.zzam(zzidVar3.zzZ());
/* 2229 */                                  zzicVarZzaE3.zzaJ(zzidVar3.zzav());
/* 2232 */                                  zzhzVarZzh2.zze(zzicVarZzaE3);
                                        }
/* 2240 */                              zzib zzibVar11 = (zzib) zzhzVarZzh2.zzbc();
/* 2248 */                              strM9287M2 = yo3Var.f15676b.m6754e0().m9287M(str2);
/* 2252 */                              zIsEmpty = TextUtils.isEmpty(strM9287M2);
/* 2256 */                              zl3Var2 = zl3.GOOGLE_SIGNAL;
/* 2258 */                              zl3Var3 = zl3.GOOGLE_SIGNAL_PENDING;
/* 2260 */                              if (zIsEmpty) {
/* 2271 */                                  Uri uri3 = Uri.parse((String) vg3.f18161s.m9011a(null));
/* 2275 */                                  Uri.Builder builderBuildUpon3 = uri3.buildUpon();
/* 2279 */                                  String authority3 = uri3.getAuthority();
/* 2307 */                                  StringBuilder sb7 = new StringBuilder(String.valueOf(strM9287M2).length() + 1 + String.valueOf(authority3).length());
/* 2310 */                                  sb7.append(strM9287M2);
/* 2315 */                                  sb7.append(".");
/* 2318 */                                  sb7.append(authority3);
/* 2325 */                                  builderBuildUpon3.authority(sb7.toString());
/* 2334 */                                  String string4 = builderBuildUpon3.build().toString();
/* 2338 */                                  if (z3) {
/* 2340 */                                      zl3Var2 = zl3Var3;
                                            }
/* 2343 */                                  strM1689c0 = null;
/* 2344 */                                  xo3Var = new xo3(string4, Collections.EMPTY_MAP, zl3Var2, null);
                                        } else {
/* 2348 */                                  strM1689c0 = null;
/* 2357 */                                  String str5 = (String) vg3.f18161s.m9011a(null);
/* 2359 */                                  if (z3) {
/* 2361 */                                      zl3Var2 = zl3Var3;
                                            }
/* 2364 */                                  xo3Var = new xo3(str5, Collections.EMPTY_MAP, zl3Var2, null);
                                        }
/* 2371 */                              arrayList2.add(Pair.create(zzibVar11, xo3Var));
                                    } else {
/* 2375 */                              strM1689c0 = null;
                                    }
/* 2376 */                          if (z3) {
/* 2506 */                              str2 = str;
/* 2508 */                              zzibVar = zzibVar2;
/* 2511 */                              ci3Var = this.f13911b;
/* 2513 */                              m6728S(ci3Var);
/* 2520 */                              if (ci3Var.m1683T()) {
/* 2535 */                                  if (Log.isLoggable(mo4557a().m9021J(), 2)) {
/* 2541 */                                      strM1689c0 = m6761i0().m1689c0(zzibVar);
                                            }
/* 2546 */                                  m6761i0();
/* 2549 */                                  byte[] bArrZzcc6 = zzibVar.zzcc();
/* 2553 */                                  m6774p(arrayList);
/* 2560 */                                  this.f13938w.f17199w.m4933b(j);
/* 2578 */                                  mo4557a().m9019G().m8513d("Uploading data. app, uncompressed size, data", str2, Integer.valueOf(bArrZzcc6.length), strM1689c0);
/* 2582 */                                  this.f13920f0 = true;
/* 2584 */                                  m6728S(ci3Var);
/* 2593 */                                  ci3Var.m1685Y(str2, xo3VarM10166A, zzibVar, new bp3(this, str2, arrayList2, 0));
/* 2596 */                                  return;
                                        }
/* 2596 */                              return;
                                    }
/* 2382 */                          zzhzVar = (zzhz) zzibVar2.zzcl();
/* 2389 */                          while (i3 < zzibVar2.zzb()) {
/* 2399 */                              zzic zzicVar6 = (zzic) zzibVar2.zzc(i3).zzcl();
/* 2401 */                              zzicVar6.zzt();
/* 2404 */                              zzicVar6.zzaO(j);
/* 2407 */                              zzhzVar.zzd(i3, zzicVar6);
                                    }
/* 2423 */                          arrayList2.add(Pair.create((zzib) zzhzVar.zzbc(), xo3VarM10166A));
/* 2426 */                          m6774p(arrayList);
/* 2437 */                          m6783x(false, 204, null, null, str, arrayList2);
/* 2448 */                          if (m6778s(str, xo3VarM10166A.m10011a())) {
/* 2460 */                              mo4557a().m9019G().m8511b(str, "[sgtm] Sending sgtm batches available notification to app");
/* 2465 */                              intent = new Intent();
/* 2470 */                              intent.setAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
/* 2473 */                              intent.setPackage(str);
/* 2476 */                              contextMo4561e = ij3Var.mo4561e();
/* 2484 */                              if (Build.VERSION.SDK_INT < i) {
/* 2486 */                                  contextMo4561e.sendBroadcast(intent);
                                        } else {
/* 2 */                                     contextMo4561e.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
                                        }
                                    }
                                }
                            } catch (SQLiteException e16) {
/* 514 */                       e = e16;
/* 517 */                       j2 = -1;
                            }
/* 551 */                   if (list2.isEmpty()) {
/* 2596 */                      return;
                            }
/* 555 */                   com.google.android.gms.internal.measurement.zzpk.zza();
/* 558 */                   pd3 pd3VarM6753d2 = m6753d0();
/* 562 */                   ug3Var = vg3.f18141i1;
/* 565 */                   zM7406J = pd3VarM6753d2.m7406J(null, ug3Var);
/* 571 */                   nk3Var = nk3.ANALYTICS_STORAGE;
/* 573 */                   if (zM7406J) {
/* 575 */                       com.google.android.gms.internal.measurement.zzpk.zza();
/* 586 */                       if (!m6753d0().m7406J(null, ug3Var)) {
/* 1397 */                          i = 34;
                                    list5 = list2;
                                } else if (m6752d(str).m7189i(nk3Var) || !m6754e0().m9281E(str2)) {
/* 897 */                           i = 34;
/* 905 */                           arrayList5 = new ArrayList(list2.size());
/* 908 */                           ae3 ae3VarM6755f5 = m6755f0();
/* 914 */                           ij3Var2 = (ij3) ae3VarM6755f5.f16749a;
/* 916 */                           kb1.m6058k(str2);
/* 919 */                           ae3VarM6755f5.mo1375y();
/* 922 */                           ae3VarM6755f5.m9593A();
/* 927 */                           arrayList6 = new ArrayList();
/* 934 */                           sQLiteDatabaseM261q0 = ae3VarM6755f5.m261q0();
/* 944 */                           ((xt0) ij3Var2.mo4562f()).getClass();
/* 947 */                           jCurrentTimeMillis = System.currentTimeMillis();
/* 975 */                           cursorQuery2 = sQLiteDatabaseM261q0.query("no_data_mode_events", new String[]{SharedDataContentProvider.BASE_PATH}, "app_id=? AND timestamp_millis <= CAST(? AS INTEGER)", new String[]{str2, String.valueOf(jCurrentTimeMillis)}, null, null, "rowid", null);
/* 985 */                           if (cursorQuery2.moveToFirst()) {
/* 987 */                               ij3Var3 = ij3Var2;
                                        while (true) {
/* 1010 */                                  arrayList6.add((zzhs) ((zzhr) ci3.m1677m0(zzhs.zzk(), cursorQuery2.getBlob(0))).zzbc());
/* 1052 */                                  if (!cursorQuery2.moveToNext()) {
                                                break;
                                                break;
                                            } else {
/* 1119 */                                      cursorQuery2 = cursorQuery2;
/* 1121 */                                      arrayList6 = arrayList6;
                                            }
                                        }
/* 1054 */                              cursorQuery2.close();
/* 1067 */                              int iDelete5 = sQLiteDatabaseM261q0.delete("no_data_mode_events", "app_id=? AND timestamp_millis <= CAST(? AS INTEGER)", new String[]{str2, String.valueOf(jCurrentTimeMillis)});
/* 1075 */                              sh3 sh3VarM9019G8 = ij3Var3.mo4557a().m9019G();
/* 1091 */                              StringBuilder sb8 = new StringBuilder(String.valueOf(iDelete5).length() + 34);
/* 1094 */                              sb8.append("Pruned ");
/* 1097 */                              sb8.append(iDelete5);
/* 1100 */                              sb8.append(" NO_DATA mode events. appId");
/* 1107 */                              sh3VarM9019G8.m8511b(str2, sb8.toString());
                                    } else {
/* 1127 */                              arrayList6 = arrayList6;
/* 1129 */                              cursorQuery2.close();
                                    }
/* 1132 */                          list6 = arrayList6;
/* 1178 */                          it5 = list2.iterator();
/* 1182 */                          z10 = true;
/* 1187 */                          while (it5.hasNext()) {
/* 1193 */                              Pair pair6 = (Pair) it5.next();
/* 1203 */                              zzicVar2 = (zzic) ((zzid) pair6.first).zzcl();
/* 1205 */                              if (z10 && !list6.isEmpty()) {
/* 1213 */                                  List listZzb6 = zzicVar2.zzb();
/* 1217 */                                  zzicVar2.zzi();
/* 1220 */                                  zzicVar2.zzh(list6);
/* 1223 */                                  zzicVar2.zzh(listZzb6);
/* 1226 */                                  z10 = false;
                                        }
/* 1227 */                              zzhh zzhhVarZzb6 = zzho.zzb();
/* 1235 */                              zzgfVarM9295U = m6754e0().m9295U(str2);
/* 1241 */                              arrayList7 = new ArrayList();
/* 1244 */                              if (zzgfVarM9295U != null) {
/* 1258 */                                  it6 = zzgfVarM9295U.zza().iterator();
/* 1266 */                                  while (it6.hasNext()) {
/* 1272 */                                      zzfu zzfuVar6 = (zzfu) it6.next();
/* 1274 */                                      Iterator it111 = it5;
/* 1276 */                                      zzhk zzhkVarZza6 = zzhl.zza();
/* 1284 */                                      boolean z111 = z10;
/* 1286 */                                      iZzb = zzfuVar6.zzb() - 1;
/* 1288 */                                      List list17 = list6;
/* 1291 */                                      if (iZzb != 1) {
/* 1315 */                                          it7 = it6;
/* 1317 */                                          i6 = 3;
/* 1318 */                                          i7 = 2;
                                                } else if (iZzb != 2) {
/* 1297 */                                          it7 = it6;
/* 1299 */                                          i6 = 3;
/* 1300 */                                          if (iZzb != 3) {
/* 1308 */                                              i7 = 4;
                                                    } else if (iZzb != 4) {
/* 1304 */                                              i7 = 1;
                                                    } else {
/* 1306 */                                              i7 = 5;
                                                    }
                                                } else {
/* 1310 */                                          it7 = it6;
/* 1312 */                                          i6 = 3;
/* 1313 */                                          i7 = 3;
                                                }
/* 1319 */                                      zzhkVarZza6.zza(i7);
/* 1326 */                                      iZzd = zzfuVar6.zzd() - 1;
/* 1329 */                                      if (iZzd != 1) {
/* 1336 */                                          i6 = 2;
                                                } else if (iZzd != 2) {
/* 1334 */                                          i6 = 1;
                                                }
/* 1337 */                                      zzhkVarZza6.zzb(i6);
/* 1346 */                                      arrayList7.add((zzhl) zzhkVarZza6.zzbc());
/* 1349 */                                      it5 = it111;
/* 1351 */                                      list6 = list17;
/* 1353 */                                      z10 = z111;
/* 1355 */                                      it6 = it7;
                                            }
                                        }
/* 1246 */                              Iterator it112 = it5;
/* 1248 */                              boolean z112 = z10;
/* 1250 */                              List list18 = list6;
/* 1358 */                              zzhhVarZzb6.zza(arrayList7);
/* 1361 */                              zzicVar2.zzaQ(zzhhVarZzb6);
/* 1378 */                              arrayList5.add(Pair.create((zzid) zzicVar2.zzbc(), (Long) pair6.second));
/* 1381 */                              it5 = it112;
/* 1383 */                              list6 = list18;
/* 1385 */                              z10 = z112;
                                    }
/* 1389 */                          list5 = arrayList5;
                                } else {
/* 624 */                           List listAsList = Arrays.asList(((String) vg3.f18144j1.m9011a(null)).split(","));
/* 636 */                           for (Pair pair7 : list2) {
                                        try {
/* 656 */                                   m6755f0().m228I(((Long) pair7.second).longValue());
/* 675 */                                   for (zzhs zzhsVar2 : ((zzid) pair7.first).zzc()) {
/* 691 */                                       if (listAsList.contains(zzhsVar2.zzd())) {
/* 701 */                                           if (zzhsVar2.zzd().equals("_f") || zzhsVar2.zzd().equals("_v")) {
/* 724 */                                               zzhr zzhrVar = (zzhr) zzhsVar2.zzcl();
/* 726 */                                               m6761i0();
/* 737 */                                               ci3.m1659F(zzhrVar, "_dac", 1L);
/* 744 */                                               zzhsVar2 = (zzhs) zzhrVar.zzbc();
                                                    }
/* 746 */                                           ae3 ae3VarM6755f6 = m6755f0();
/* 750 */                                           ae3VarM6755f6.mo1375y();
/* 753 */                                           ae3VarM6755f6.m9593A();
/* 756 */                                           kb1.m6061n(zzhsVar2);
/* 759 */                                           kb1.m6058k(str2);
/* 764 */                                           ij3 ij3Var5 = (ij3) ae3VarM6755f6.f16749a;
                                                    try {
/* 778 */                                               ij3Var5.mo4557a().m9019G().m8511b(zzhsVar2, "Caching events in NO_DATA mode");
/* 783 */                                               ContentValues contentValues = new ContentValues();
/* 788 */                                               contentValues.put("app_id", str2);
/* 793 */                                               zzhs zzhsVar3 = zzhsVar2;
/* 799 */                                               contentValues.put("name", zzhsVar3.zzd());
/* 806 */                                               contentValues.put(SharedDataContentProvider.BASE_PATH, zzhsVar3.zzcc());
/* 819 */                                               contentValues.put("timestamp_millis", Long.valueOf(zzhsVar3.zzf()));
                                                        try {
/* 833 */                                                   if (ae3VarM6755f6.m261q0().insert("no_data_mode_events", null, contentValues) == j2) {
/* 849 */                                                       ij3Var5.mo4557a().m9016D().m8511b(uh3.m9013H(str2), "Failed to insert NO_DATA mode event (got -1). appId");
                                                            }
                                                        } catch (SQLiteException e17) {
/* 873 */                                                   ((ij3) ae3VarM6755f6.f16749a).mo4557a().m9016D().m8512c(uh3.m9013H(str2), "Error storing NO_DATA mode event. appId", e17);
                                                        }
                                                    } catch (SQLiteException unused) {
/* 886 */                                               mo4557a().f17531V.m8511b(str2, "Failed handling NO_DATA mode bundles. appId");
                                                    }
                                                }
                                            }
                                        } catch (SQLiteException unused2) {
                                        }
                                    }
/* 891 */                           i = 34;
/* 893 */                           list5 = Collections.EMPTY_LIST;
                                }
/* 1399 */                      zIsEmpty2 = list5.isEmpty();
                                listSubList = list5;
/* 1403 */                      if (zIsEmpty2) {
/* 2596 */                          return;
                                }
                            } else {
/* 1406 */                      i = 34;
                                listSubList = list2;
                            }
/* 1408 */                  ok3VarM6752d = m6752d(str);
/* 1412 */                  nk3Var2 = nk3.AD_STORAGE;
/* 1418 */                  if (ok3VarM6752d.m7189i(nk3Var2)) {
/* 1420 */                      it4 = listSubList.iterator();
                                while (true) {
/* 1428 */                          if (it4.hasNext()) {
/* 1455 */                              strZzG = null;
                                        break;
                                    }
/* 1438 */                          zzidVar2 = (zzid) ((Pair) it4.next()).first;
/* 1448 */                          if (!zzidVar2.zzG().isEmpty()) {
/* 1450 */                              strZzG = zzidVar2.zzG();
                                        break;
                                    }
                                }
/* 1456 */                      if (strZzG != null) {
/* 1463 */                          while (i5 < listSubList.size()) {
/* 1473 */                              zzidVar = (zzid) ((Pair) listSubList.get(i5)).first;
/* 1483 */                              if (!zzidVar.zzG().isEmpty() && !zzidVar.zzG().equals(strZzG)) {
/* 1497 */                                  listSubList = listSubList.subList(0, i5);
                                            break;
                                        }
                                    }
                                }
                            }
/* 1505 */                  zzhzVarZzh = zzib.zzh();
/* 1509 */                  size = listSubList.size();
/* 1519 */                  arrayList = new ArrayList(listSubList.size());
/* 1530 */                  if (m6753d0().m7397A(str2) || !m6752d(str).m7189i(nk3Var2)) {
/* 1544 */                      z = false;
                            } else {
/* 1542 */                      z = true;
                            }
/* 1549 */                  zM7189i = m6752d(str).m7189i(nk3Var2);
/* 1557 */                  zM7189i2 = m6752d(str).m7189i(nk3Var);
/* 1561 */                  zzqu.zza();
/* 1570 */                  zM7406J2 = m6753d0().m7406J(str2, vg3.f18088M0);
/* 1574 */                  yo3Var = this.f13903U;
/* 1576 */                  xo3VarM10166A = yo3Var.m10166A(str2);
/* 1582 */                  i2 = 0;
                            list3 = listSubList;
                            while (true) {
/* 1583 */                      ij3Var = this.f13905W;
/* 1585 */                      if (i2 < size) {
                                    break;
                                    break;
                                }
/* 1605 */                      zzicVar = (zzic) ((zzid) ((Pair) list3.get(i2)).first).zzcl();
/* 1611 */                      int i14 = size;
/* 1621 */                      arrayList.add((Long) ((Pair) list3.get(i2)).second);
/* 1628 */                      m6753d0().m7401E();
/* 1631 */                      z4 = zM7189i2;
/* 1632 */                      z5 = zM7406J2;
/* 1637 */                      zzicVar.zzO(130000L);
/* 1640 */                      zzicVar.zzs(j);
/* 1643 */                      ij3Var.getClass();
/* 1647 */                      zzicVar.zzae(false);
/* 1650 */                      if (!z) {
/* 1652 */                          zzicVar.zzan();
                                }
/* 1655 */                      if (!zM7189i) {
/* 1657 */                          zzicVar.zzR();
/* 1660 */                          zzicVar.zzU();
                                }
/* 1663 */                      if (!z4) {
/* 1665 */                          zzicVar.zzX();
                                }
/* 1668 */                      m6781v(zzicVar, str2);
/* 1671 */                      if (!z5) {
/* 1673 */                          zzicVar.zzav();
                                }
/* 1676 */                      if (!z4) {
/* 1678 */                          zzicVar.zzag();
                                }
/* 1681 */                      strZzP = zzicVar.zzP();
/* 1689 */                      if (TextUtils.isEmpty(strZzP) || strZzP.equals("00000000-0000-0000-0000-000000000000")) {
/* 1716 */                          arrayList4 = new ArrayList(zzicVar.zzb());
/* 1719 */                          it3 = arrayList4.iterator();
/* 1723 */                          z6 = z4;
/* 1725 */                          z7 = z;
/* 1727 */                          lValueOf = null;
/* 1728 */                          lValueOf2 = null;
/* 1729 */                          z8 = false;
/* 1731 */                          z9 = false;
/* 1737 */                          while (it3.hasNext()) {
/* 1743 */                              it3 = it3;
/* 1747 */                              zzhsVar = (zzhs) it3.next();
/* 1749 */                              list3 = list3;
/* 1755 */                              i2 = i2;
/* 1763 */                              if ("_fx".equals(zzhsVar.zzd())) {
/* 1765 */                                  it3.remove();
/* 1774 */                                  z8 = true;
                                        } else if ("_f".equals(zzhsVar.zzd())) {
/* 1789 */                                  m6761i0();
/* 1794 */                                  zzhwVarM1661H = ci3.m1661H(zzhsVar, "_pfo");
/* 1798 */                                  if (zzhwVarM1661H != null) {
/* 1804 */                                      lValueOf = Long.valueOf(zzhwVarM1661H.zzf());
                                            }
/* 1808 */                                  m6761i0();
/* 1813 */                                  zzhwVarM1661H2 = ci3.m1661H(zzhsVar, "_uwa");
/* 1817 */                                  if (zzhwVarM1661H2 != null) {
/* 1823 */                                      lValueOf2 = Long.valueOf(zzhwVarM1661H2.zzf());
                                            }
                                        } else {
/* 1834 */                                  list3 = list3;
/* 1836 */                                  it3 = it3;
/* 1838 */                                  i2 = i2;
                                        }
/* 1776 */                              z9 = true;
                                    }
/* 1841 */                          list4 = list3;
/* 1843 */                          i4 = i2;
/* 1845 */                          if (z8) {
/* 1847 */                              zzicVar.zzi();
/* 1850 */                              zzicVar.zzh(arrayList4);
                                    }
/* 1853 */                          if (z9) {
/* 1860 */                              m6780u(zzicVar.zzK(), true, lValueOf, lValueOf2);
                                    }
                                } else {
/* 1700 */                          z6 = z4;
/* 1702 */                          z7 = z;
/* 1704 */                          list4 = list3;
/* 1706 */                          i4 = i2;
                                }
/* 1867 */                      if (zzicVar.zzc() != 0) {
/* 1880 */                          if (m6753d0().m7406J(str2, vg3.f18068C0)) {
/* 1900 */                              zzicVar.zzas(m6761i0().m1694k0(((zzid) zzicVar.zzbc()).zzcc()));
                                    }
/* 1903 */                          zzisVarM10012b = xo3VarM10166A.m10012b();
/* 1907 */                          if (zzisVarM10012b != null) {
/* 1909 */                              zzicVar.zzaN(zzisVarM10012b);
                                    }
/* 1912 */                          zzhzVarZzh.zze(zzicVar);
                                }
/* 1915 */                      i2 = i4 + 1;
/* 1917 */                      zM7406J2 = z5;
/* 1919 */                      size = i14;
/* 1921 */                      zM7189i2 = z6;
/* 1923 */                      z = z7;
/* 1925 */                      list3 = list4;
                            }
/* 1935 */                  if (zzhzVarZzh.zzb() == 0) {
/* 1937 */                      m6774p(arrayList);
/* 1947 */                      m6783x(false, 204, null, null, str2, Collections.EMPTY_LIST);
/* 1950 */                      return;
                            }
/* 1955 */                  zzibVar = (zzib) zzhzVarZzh.zzbc();
/* 1959 */                  arrayList2 = new ArrayList();
/* 1962 */                  zl3Var = xo3VarM10166A.f19299c;
/* 1966 */                  if (zl3Var == zl3.SGTM_CLIENT) {
/* 1968 */                      z2 = true;
                            } else {
/* 1970 */                      z2 = false;
                            }
/* 1973 */                  if (zl3Var != zl3.SGTM) {
/* 1975 */                      if (z2) {
/* 1977 */                          z3 = true;
                                } else {
/* 1979 */                          strM1689c0 = null;
                                }
/* 2511 */                      ci3Var = this.f13911b;
/* 2513 */                      m6728S(ci3Var);
/* 2520 */                      if (ci3Var.m1683T()) {
/* 2535 */                          if (Log.isLoggable(mo4557a().m9021J(), 2)) {
/* 2541 */                              strM1689c0 = m6761i0().m1689c0(zzibVar);
                                    }
/* 2546 */                          m6761i0();
/* 2549 */                          byte[] bArrZzcc7 = zzibVar.zzcc();
/* 2553 */                          m6774p(arrayList);
/* 2560 */                          this.f13938w.f17199w.m4933b(j);
/* 2578 */                          mo4557a().m9019G().m8513d("Uploading data. app, uncompressed size, data", str2, Integer.valueOf(bArrZzcc7.length), strM1689c0);
/* 2582 */                          this.f13920f0 = true;
/* 2584 */                          m6728S(ci3Var);
/* 2593 */                          ci3Var.m1685Y(str2, xo3VarM10166A, zzibVar, new bp3(this, str2, arrayList2, 0));
/* 2596 */                          return;
                                }
/* 2596 */                      return;
                            }
/* 1983 */                  z3 = z2;
/* 1994 */                  it = ((zzib) zzhzVarZzh.zzbc()).zza().iterator();
                            while (true) {
/* 2002 */                      if (it.hasNext()) {
/* 2014 */                          if (((zzid) it.next()).zzY()) {
/* 2020 */                              string = UUID.randomUUID().toString();
                                        break;
                                    }
                                } else {
/* 2025 */                          string = null;
                                    break;
                                }
                            }
/* 2030 */                  zzib zzibVar12 = (zzib) zzhzVarZzh.zzbc();
/* 2036 */                  mo4558b().mo1375y();
/* 2039 */                  m6765k0();
/* 2042 */                  zzhzVarZzi = zzib.zzi(zzibVar12);
/* 2050 */                  if (!TextUtils.isEmpty(string)) {
/* 2052 */                      zzhzVarZzi.zzi(string);
                            }
/* 2059 */                  strM9287M = m6754e0().m9287M(str2);
/* 2067 */                  if (!TextUtils.isEmpty(strM9287M)) {
/* 2069 */                      zzhzVarZzi.zzj(strM9287M);
                            }
/* 2074 */                  arrayList3 = new ArrayList();
/* 2081 */                  it2 = zzibVar12.zza().iterator();
/* 2089 */                  while (it2.hasNext()) {
/* 2097 */                      zzic zzicVarZzaF4 = zzid.zzaF((zzid) it2.next());
/* 2101 */                      zzicVarZzaF4.zzan();
/* 2110 */                      arrayList3.add((zzid) zzicVarZzaF4.zzbc());
                            }
/* 2114 */                  zzhzVarZzi.zzg();
/* 2117 */                  zzhzVarZzi.zzf(arrayList3);
/* 2124 */                  sh3 sh3VarM9019G9 = mo4557a().m9019G();
/* 2132 */                  if (TextUtils.isEmpty(string)) {
/* 2134 */                      strZzh = "null";
                            } else {
/* 2137 */                      strZzh = zzhzVarZzi.zzh();
                            }
/* 2143 */                  sh3VarM9019G9.m8511b(strZzh, "[sgtm] Processed MeasurementBatch for sGTM with sgtmJoinId: ");
/* 2150 */                  zzibVar2 = (zzib) zzhzVarZzi.zzbc();
/* 2156 */                  if (TextUtils.isEmpty(string)) {
/* 2162 */                      zzib zzibVar13 = (zzib) zzhzVarZzh.zzbc();
/* 2168 */                      mo4558b().mo1375y();
/* 2171 */                      m6765k0();
/* 2174 */                      zzhzVarZzh2 = zzib.zzh();
/* 2188 */                      mo4557a().m9019G().m8511b(string, "[sgtm] Processing Google Signal, sgtmJoinId:");
/* 2191 */                      zzhzVarZzh2.zzi(string);
/* 2206 */                      while (r0.hasNext()) {
/* 2214 */                          zzic zzicVarZzaE4 = zzid.zzaE();
/* 2222 */                          zzicVarZzaE4.zzam(zzidVar3.zzZ());
/* 2229 */                          zzicVarZzaE4.zzaJ(zzidVar3.zzav());
/* 2232 */                          zzhzVarZzh2.zze(zzicVarZzaE4);
                                }
/* 2240 */                      zzib zzibVar14 = (zzib) zzhzVarZzh2.zzbc();
/* 2248 */                      strM9287M2 = yo3Var.f15676b.m6754e0().m9287M(str2);
/* 2252 */                      zIsEmpty = TextUtils.isEmpty(strM9287M2);
/* 2256 */                      zl3Var2 = zl3.GOOGLE_SIGNAL;
/* 2258 */                      zl3Var3 = zl3.GOOGLE_SIGNAL_PENDING;
/* 2260 */                      if (zIsEmpty) {
/* 2271 */                          Uri uri4 = Uri.parse((String) vg3.f18161s.m9011a(null));
/* 2275 */                          Uri.Builder builderBuildUpon4 = uri4.buildUpon();
/* 2279 */                          String authority4 = uri4.getAuthority();
/* 2307 */                          StringBuilder sb9 = new StringBuilder(String.valueOf(strM9287M2).length() + 1 + String.valueOf(authority4).length());
/* 2310 */                          sb9.append(strM9287M2);
/* 2315 */                          sb9.append(".");
/* 2318 */                          sb9.append(authority4);
/* 2325 */                          builderBuildUpon4.authority(sb9.toString());
/* 2334 */                          String string5 = builderBuildUpon4.build().toString();
/* 2338 */                          if (z3) {
/* 2340 */                              zl3Var2 = zl3Var3;
                                    }
/* 2343 */                          strM1689c0 = null;
/* 2344 */                          xo3Var = new xo3(string5, Collections.EMPTY_MAP, zl3Var2, null);
                                } else {
/* 2348 */                          strM1689c0 = null;
/* 2357 */                          String str6 = (String) vg3.f18161s.m9011a(null);
/* 2359 */                          if (z3) {
/* 2361 */                              zl3Var2 = zl3Var3;
                                    }
/* 2364 */                          xo3Var = new xo3(str6, Collections.EMPTY_MAP, zl3Var2, null);
                                }
/* 2371 */                      arrayList2.add(Pair.create(zzibVar14, xo3Var));
                            } else {
/* 2375 */                      strM1689c0 = null;
                            }
/* 2376 */                  if (z3) {
/* 2506 */                      str2 = str;
/* 2508 */                      zzibVar = zzibVar2;
/* 2511 */                      ci3Var = this.f13911b;
/* 2513 */                      m6728S(ci3Var);
/* 2520 */                      if (ci3Var.m1683T()) {
/* 2535 */                          if (Log.isLoggable(mo4557a().m9021J(), 2)) {
/* 2541 */                              strM1689c0 = m6761i0().m1689c0(zzibVar);
                                    }
/* 2546 */                          m6761i0();
/* 2549 */                          byte[] bArrZzcc8 = zzibVar.zzcc();
/* 2553 */                          m6774p(arrayList);
/* 2560 */                          this.f13938w.f17199w.m4933b(j);
/* 2578 */                          mo4557a().m9019G().m8513d("Uploading data. app, uncompressed size, data", str2, Integer.valueOf(bArrZzcc8.length), strM1689c0);
/* 2582 */                          this.f13920f0 = true;
/* 2584 */                          m6728S(ci3Var);
/* 2593 */                          ci3Var.m1685Y(str2, xo3VarM10166A, zzibVar, new bp3(this, str2, arrayList2, 0));
/* 2596 */                          return;
                                }
/* 2596 */                      return;
                            }
/* 2382 */                  zzhzVar = (zzhz) zzibVar2.zzcl();
/* 2389 */                  while (i3 < zzibVar2.zzb()) {
/* 2399 */                      zzic zzicVar7 = (zzic) zzibVar2.zzc(i3).zzcl();
/* 2401 */                      zzicVar7.zzt();
/* 2404 */                      zzicVar7.zzaO(j);
/* 2407 */                      zzhzVar.zzd(i3, zzicVar7);
                            }
/* 2423 */                  arrayList2.add(Pair.create((zzib) zzhzVar.zzbc(), xo3VarM10166A));
/* 2426 */                  m6774p(arrayList);
/* 2437 */                  m6783x(false, 204, null, null, str, arrayList2);
/* 2448 */                  if (m6778s(str, xo3VarM10166A.m10011a())) {
/* 2460 */                      mo4557a().m9019G().m8511b(str, "[sgtm] Sending sgtm batches available notification to app");
/* 2465 */                      intent = new Intent();
/* 2470 */                      intent.setAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
/* 2473 */                      intent.setPackage(str);
/* 2476 */                      contextMo4561e = ij3Var.mo4561e();
/* 2484 */                      if (Build.VERSION.SDK_INT < i) {
/* 2486 */                          contextMo4561e.sendBroadcast(intent);
                                } else {
/* 2 */                             contextMo4561e.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
                                }
                            }
                        } catch (Throwable th4) {
/* 508 */                   th = th4;
/* 520 */                   r14 = 0;
/* 2597 */                  if (r14 != 0) {
/* 2599 */                      r14.close();
                            }
/* 2602 */                  throw th;
                        }
                    } catch (Throwable th5) {
/* 118 */               th = th5;
/* 505 */               r14 = r11;
                    }
                }

                /* JADX INFO: renamed from: s */
                public final boolean m6778s(String str, String str2) {
/* 1 */             ae3 ae3Var = this.f13913c;
/* 3 */             m6728S(ae3Var);
/* 6 */             di3 di3VarM219D0 = ae3Var.m219D0(str);
/* 10 */            HashMap map = this.f13931p0;
/* 13 */            if (di3VarM219D0 != null && m6763j0().m9098Z(str, di3VarM219D0.m3092C())) {
/* 30 */                map.remove(str2);
/* 12 */                return true;
                    }
/* 38 */            kp3 kp3Var = (kp3) map.get(str2);
/* 40 */            if (kp3Var != null) {
/* 51 */                ((xt0) kp3Var.f12970a.mo4562f()).getClass();
/* 62 */                if (System.currentTimeMillis() < kp3Var.f12972c) {
/* 65 */                    return false;
                        }
                    }
/* 12 */            return true;
                }

                /* JADX INFO: renamed from: t */
                public final void m6779t(String str) {
                    zzib zzibVar;
/* 5 */             mo4558b().mo1375y();
/* 8 */             m6765k0();
/* 11 */            int i = 1;
/* 12 */            this.f13921g0 = true;
                    try {
/* 15 */                ij3 ij3Var = this.f13905W;
/* 17 */                ij3Var.getClass();
/* 24 */                Boolean bool = ij3Var.m4567o().f15189e;
/* 26 */                if (bool == null) {
/* 36 */                    mo4557a().f17541w.m8510a("Upload data called on the client side before use of service was decided");
                        } else if (bool.booleanValue()) {
/* 58 */                    mo4557a().f17538f.m8510a("Upload called in the client side when service should be used");
                        } else if (this.f13908Z > 0) {
/* 71 */                    m6739L();
                        } else {
/* 76 */                    ci3 ci3Var = this.f13911b;
/* 78 */                    m6728S(ci3Var);
/* 85 */                    if (ci3Var.m1683T()) {
/* 103 */                       ae3 ae3Var = this.f13913c;
/* 105 */                       m6728S(ae3Var);
/* 112 */                       if (ae3Var.m222F(str)) {
/* 127 */                           ae3 ae3Var2 = this.f13913c;
/* 129 */                           m6728S(ae3Var2);
/* 132 */                           kb1.m6058k(str);
/* 135 */                           ae3Var2.mo1375y();
/* 138 */                           ae3Var2.m9593A();
/* 151 */                           List listM220E = ae3Var2.m220E(str, zzon.m2196D1(zl3.GOOGLE_SIGNAL), 1);
/* 168 */                           pp3 pp3Var = listM220E.isEmpty() ? null : (pp3) listM220E.get(0);
/* 170 */                           if (pp3Var != null && (zzibVar = pp3Var.f15235b) != null) {
/* 188 */                               mo4557a().f17534Y.m8513d("[sgtm] Uploading data from upload queue. appId, type, url", str, pp3Var.f15238e, pp3Var.f15236c);
/* 191 */                               byte[] bArrZzcc = zzibVar.zzcc();
/* 208 */                               if (Log.isLoggable(mo4557a().m9021J(), 2)) {
/* 210 */                                   ci3 ci3Var2 = this.f13923i;
/* 212 */                                   m6728S(ci3Var2);
/* 232 */                                   mo4557a().f17534Y.m8513d("[sgtm] Uploading data from upload queue. appId, uncompressed size, data", str, Integer.valueOf(bArrZzcc.length), ci3Var2.m1689c0(zzibVar));
                                        }
/* 243 */                               xo3 xo3Var = new xo3(pp3Var.f15236c, pp3Var.f15237d, pp3Var.f15238e, null);
/* 246 */                               this.f13920f0 = true;
/* 248 */                               ci3 ci3Var3 = this.f13911b;
/* 250 */                               m6728S(ci3Var3);
/* 258 */                               ci3Var3.m1685Y(str, xo3Var, zzibVar, new bp3(this, str, pp3Var, i));
                                    }
                                } else {
/* 122 */                           mo4557a().f17534Y.m8511b(str, "[sgtm] Upload queue has no batches for appId");
                                }
                            } else {
/* 95 */                        mo4557a().f17534Y.m8510a("Network not connected, ignoring upload request");
/* 98 */                        m6739L();
                            }
                        }
                    } finally {
/* 267 */               this.f13921g0 = false;
/* 269 */               m6740M();
                    }
                }

                /* JADX INFO: renamed from: u */
                public final void m6780u(String str, boolean z, Long l, Long l2) {
/* 1 */             ae3 ae3Var = this.f13913c;
/* 3 */             m6728S(ae3Var);
/* 6 */             di3 di3VarM219D0 = ae3Var.m219D0(str);
/* 10 */            if (di3VarM219D0 != null) {
/* 12 */                ij3 ij3Var = di3VarM219D0.f7242a;
/* 14 */                bj3 bj3Var = ij3Var.f9659i;
/* 16 */                ij3.m4555l(bj3Var);
/* 19 */                bj3Var.mo1375y();
/* 34 */                di3VarM219D0.f7239Q |= di3VarM219D0.f7266y != z;
/* 36 */                di3VarM219D0.f7266y = z;
/* 38 */                bj3 bj3Var2 = ij3Var.f9659i;
/* 40 */                ij3.m4555l(bj3Var2);
/* 43 */                bj3Var2.mo1375y();
/* 56 */                di3VarM219D0.f7239Q |= !Objects.equals(di3VarM219D0.f7267z, l);
/* 58 */                di3VarM219D0.f7267z = l;
/* 60 */                bj3 bj3Var3 = ij3Var.f9659i;
/* 62 */                ij3.m4555l(bj3Var3);
/* 65 */                bj3Var3.mo1375y();
/* 78 */                di3VarM219D0.f7239Q |= !Objects.equals(di3VarM219D0.f7223A, l2);
/* 80 */                di3VarM219D0.f7223A = l2;
/* 86 */                if (di3VarM219D0.m3123o()) {
/* 88 */                    ae3 ae3Var2 = this.f13913c;
/* 90 */                    m6728S(ae3Var2);
/* 93 */                    ae3Var2.m221E0(di3VarM219D0, false);
                        }
                    }
                }

                /* JADX WARN: Code duplicated, block: B:40:0x00f4  */
                /* JADX INFO: renamed from: v */
                public final void m6781v(zzic zzicVar, String str) {
                    int iM1678n0;
                    int iIndexOf;
/* 1 */             vi3 vi3Var = this.f13909a;
/* 3 */             m6728S(vi3Var);
/* 6 */             vi3Var.mo1375y();
/* 9 */             vi3Var.m9282F(str);
/* 12 */            C1024id c1024id = vi3Var.f18212e;
/* 19 */            Set set = (Set) c1024id.getOrDefault(str, null);
/* 21 */            if (set != null) {
/* 23 */                zzicVar.zzaw(set);
                    }
/* 26 */            m6728S(vi3Var);
/* 29 */            vi3Var.mo1375y();
/* 32 */            vi3Var.m9282F(str);
/* 39 */            if (c1024id.getOrDefault(str, null) != null && (((Set) c1024id.getOrDefault(str, null)).contains("device_model") || ((Set) c1024id.getOrDefault(str, null)).contains("device_info"))) {
/* 70 */                zzicVar.zzG();
                    }
/* 73 */            m6728S(vi3Var);
/* 81 */            if (vi3Var.m9292R(str)) {
/* 83 */                String strZzD = zzicVar.zzD();
/* 91 */                if (!TextUtils.isEmpty(strZzD) && (iIndexOf = strZzD.indexOf(".")) != -1) {
/* 106 */                   zzicVar.zzE(strZzD.substring(0, iIndexOf));
                        }
                    }
/* 109 */           m6728S(vi3Var);
/* 112 */           vi3Var.mo1375y();
/* 115 */           vi3Var.m9282F(str);
/* 122 */           if (c1024id.getOrDefault(str, null) != null && ((Set) c1024id.getOrDefault(str, null)).contains("user_id") && (iM1678n0 = ci3.m1678n0(zzicVar, "_id")) != -1) {
/* 146 */               zzicVar.zzr(iM1678n0);
                    }
/* 149 */           m6728S(vi3Var);
/* 152 */           vi3Var.mo1375y();
/* 155 */           vi3Var.m9282F(str);
/* 162 */           if (c1024id.getOrDefault(str, null) != null && ((Set) c1024id.getOrDefault(str, null)).contains("google_signals")) {
/* 178 */               zzicVar.zzan();
                    }
/* 181 */           m6728S(vi3Var);
/* 188 */           if (vi3Var.m9293S(str)) {
/* 190 */               zzicVar.zzX();
/* 203 */               if (m6752d(str).m7189i(nk3.ANALYTICS_STORAGE)) {
/* 205 */                   HashMap map = this.f13930o0;
/* 211 */                   jp3 jp3Var = (jp3) map.get(str);
/* 213 */                   if (jp3Var != null) {
/* 227 */                       long jM7403G = m6753d0().m7403G(str, vg3.f18146k0) + jp3Var.f12418b;
/* 234 */                       ((xt0) mo4562f()).getClass();
/* 243 */                       if (jM7403G < SystemClock.elapsedRealtime()) {
/* 255 */                           jp3Var = new jp3(this, m6763j0().m9112r0());
/* 258 */                           map.put(str, jp3Var);
                                }
                            } else {
/* 255 */                       jp3Var = new jp3(this, m6763j0().m9112r0());
/* 258 */                       map.put(str, jp3Var);
                            }
/* 263 */                   zzicVar.zzax(jp3Var.f12417a);
                        }
                    }
/* 266 */           m6728S(vi3Var);
/* 269 */           vi3Var.mo1375y();
/* 272 */           vi3Var.m9282F(str);
/* 279 */           if (c1024id.getOrDefault(str, null) == null || !((Set) c1024id.getOrDefault(str, null)).contains("enhanced_user_id")) {
/* 298 */               return;
                    }
/* 295 */           zzicVar.zzav();
                }

                /* JADX INFO: renamed from: w */
                public final void m6782w(String str, zzhv zzhvVar, Bundle bundle, String str2) {
                    int iMax;
/* 17 */            List listUnmodifiableList = Collections.unmodifiableList(Arrays.asList("_o", "_sn", "_sc", "_si"));
/* 35 */            if (up3.m9067X(zzhvVar.zza()) || up3.m9067X(str)) {
/* 67 */                pd3 pd3VarM6753d0 = m6753d0();
/* 71 */                pd3VarM6753d0.getClass();
/* 88 */                iMax = Math.max(Math.max(Math.min(pd3VarM6753d0.m7404H(str2, vg3.f18137h0), 500), 100), NotificationCompat.FLAG_LOCAL_ONLY);
                    } else {
/* 44 */                pd3 pd3VarM6753d1 = m6753d0();
/* 48 */                pd3VarM6753d1.getClass();
/* 61 */                iMax = Math.max(Math.min(pd3VarM6753d1.m7404H(str2, vg3.f18137h0), 500), 100);
                    }
                    long j = iMax;
/* 106 */           long jCodePointCount = zzhvVar.zzc().codePointCount(0, zzhvVar.zzc().length());
/* 111 */           m6763j0();
/* 114 */           String strZza = zzhvVar.zza();
/* 118 */           m6753d0();
/* 124 */           String strM9060E = up3.m9060E(40, strZza, true);
/* 130 */           if (jCodePointCount <= j || listUnmodifiableList.contains(zzhvVar.zza())) {
/* 247 */               return;
                    }
/* 152 */           if ("_ev".equals(zzhvVar.zza())) {
/* 154 */               m6763j0();
/* 157 */               String strZzc = zzhvVar.zzc();
/* 161 */               pd3 pd3VarM6753d2 = m6753d0();
/* 165 */               pd3VarM6753d2.getClass();
/* 190 */               bundle.putString("_ev", up3.m9060E(Math.max(Math.max(Math.min(pd3VarM6753d2.m7404H(str2, vg3.f18137h0), 500), 100), NotificationCompat.FLAG_LOCAL_ONLY), strZzc, true));
/* 193 */               return;
                    }
/* 206 */           mo4557a().f17531V.m8512c(strM9060E, "Param value is too long; discarded. Name, value length", Long.valueOf(jCodePointCount));
/* 219 */           if (bundle.getLong("_err") == 0) {
/* 223 */               bundle.putLong("_err", 4L);
/* 230 */               if (bundle.getString("_ev") == null) {
/* 232 */                   bundle.putString("_ev", strM9060E);
/* 237 */                   bundle.putLong("_el", jCodePointCount);
                        }
                    }
/* 244 */           bundle.remove(zzhvVar.zza());
                }

                /* JADX WARN: Code duplicated, block: B:105:0x00a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:106:0x0159 A[EDGE_INSN: B:106:0x0159->B:52:0x0159 BREAK  A[LOOP:0: B:33:0x00fb->B:108:0x00fb], SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:107:0x0119 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:109:0x00fb A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:112:0x019f A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:113:0x0177 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:22:0x0093 A[Catch: all -> 0x0018, PHI: r0
  0x0093: PHI (r0v2 int) = (r0v0 int), (r0v37 int) binds: [B:9:0x0025, B:15:0x0030] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #1 {all -> 0x0018, blocks: (B:4:0x0015, B:8:0x001d, B:16:0x0032, B:21:0x0086, B:20:0x0072, B:22:0x0093, B:24:0x00a8, B:27:0x00c0, B:29:0x00ce, B:31:0x00ea, B:81:0x0226, B:83:0x0239, B:85:0x0244, B:93:0x0263, B:87:0x024a, B:89:0x0253, B:91:0x0259, B:92:0x025d, B:94:0x0266, B:95:0x026e, B:30:0x00df, B:96:0x026f), top: B:102:0x0015, inners: #3 }] */
                /* JADX WARN: Code duplicated, block: B:29:0x00ce A[Catch: all -> 0x0018, SQLiteException -> 0x00bd, TryCatch #3 {SQLiteException -> 0x00bd, blocks: (B:24:0x00a8, B:27:0x00c0, B:29:0x00ce, B:31:0x00ea, B:81:0x0226, B:83:0x0239, B:85:0x0244, B:93:0x0263, B:87:0x024a, B:89:0x0253, B:91:0x0259, B:92:0x025d, B:94:0x0266, B:95:0x026e, B:30:0x00df), top: B:105:0x00a8, outer: #1 }] */
                /* JADX WARN: Code duplicated, block: B:30:0x00df A[Catch: all -> 0x0018, SQLiteException -> 0x00bd, TryCatch #3 {SQLiteException -> 0x00bd, blocks: (B:24:0x00a8, B:27:0x00c0, B:29:0x00ce, B:31:0x00ea, B:81:0x0226, B:83:0x0239, B:85:0x0244, B:93:0x0263, B:87:0x024a, B:89:0x0253, B:91:0x0259, B:92:0x025d, B:94:0x0266, B:95:0x026e, B:30:0x00df), top: B:105:0x00a8, outer: #1 }] */
                /* JADX WARN: Code duplicated, block: B:36:0x0105 A[Catch: all -> 0x0156, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0156, blocks: (B:32:0x00f2, B:33:0x00fb, B:36:0x0105, B:39:0x0119, B:41:0x0125, B:42:0x0127, B:46:0x013e, B:48:0x0148, B:52:0x0159, B:53:0x015e, B:55:0x0164, B:57:0x0177, B:59:0x018e, B:60:0x0190, B:62:0x01a2, B:64:0x01be, B:66:0x01e4, B:67:0x01f3, B:68:0x01f7, B:70:0x01fd, B:71:0x0204, B:74:0x0212, B:76:0x0216, B:79:0x021d, B:80:0x021e), top: B:101:0x00f2, inners: #2 }] */
                /* JADX WARN: Code duplicated, block: B:41:0x0125 A[Catch: all -> 0x0156, TryCatch #0 {all -> 0x0156, blocks: (B:32:0x00f2, B:33:0x00fb, B:36:0x0105, B:39:0x0119, B:41:0x0125, B:42:0x0127, B:46:0x013e, B:48:0x0148, B:52:0x0159, B:53:0x015e, B:55:0x0164, B:57:0x0177, B:59:0x018e, B:60:0x0190, B:62:0x01a2, B:64:0x01be, B:66:0x01e4, B:67:0x01f3, B:68:0x01f7, B:70:0x01fd, B:71:0x0204, B:74:0x0212, B:76:0x0216, B:79:0x021d, B:80:0x021e), top: B:101:0x00f2, inners: #2 }] */
                /* JADX WARN: Code duplicated, block: B:44:0x013a  */
                /* JADX WARN: Code duplicated, block: B:55:0x0164 A[Catch: all -> 0x0156, TryCatch #0 {all -> 0x0156, blocks: (B:32:0x00f2, B:33:0x00fb, B:36:0x0105, B:39:0x0119, B:41:0x0125, B:42:0x0127, B:46:0x013e, B:48:0x0148, B:52:0x0159, B:53:0x015e, B:55:0x0164, B:57:0x0177, B:59:0x018e, B:60:0x0190, B:62:0x01a2, B:64:0x01be, B:66:0x01e4, B:67:0x01f3, B:68:0x01f7, B:70:0x01fd, B:71:0x0204, B:74:0x0212, B:76:0x0216, B:79:0x021d, B:80:0x021e), top: B:101:0x00f2, inners: #2 }] */
                /* JADX WARN: Code duplicated, block: B:59:0x018e A[Catch: all -> 0x0156, TryCatch #0 {all -> 0x0156, blocks: (B:32:0x00f2, B:33:0x00fb, B:36:0x0105, B:39:0x0119, B:41:0x0125, B:42:0x0127, B:46:0x013e, B:48:0x0148, B:52:0x0159, B:53:0x015e, B:55:0x0164, B:57:0x0177, B:59:0x018e, B:60:0x0190, B:62:0x01a2, B:64:0x01be, B:66:0x01e4, B:67:0x01f3, B:68:0x01f7, B:70:0x01fd, B:71:0x0204, B:74:0x0212, B:76:0x0216, B:79:0x021d, B:80:0x021e), top: B:101:0x00f2, inners: #2 }] */
                /* JADX WARN: Code duplicated, block: B:64:0x01be A[Catch: all -> 0x0156, TryCatch #0 {all -> 0x0156, blocks: (B:32:0x00f2, B:33:0x00fb, B:36:0x0105, B:39:0x0119, B:41:0x0125, B:42:0x0127, B:46:0x013e, B:48:0x0148, B:52:0x0159, B:53:0x015e, B:55:0x0164, B:57:0x0177, B:59:0x018e, B:60:0x0190, B:62:0x01a2, B:64:0x01be, B:66:0x01e4, B:67:0x01f3, B:68:0x01f7, B:70:0x01fd, B:71:0x0204, B:74:0x0212, B:76:0x0216, B:79:0x021d, B:80:0x021e), top: B:101:0x00f2, inners: #2 }] */
                /* JADX WARN: Code duplicated, block: B:66:0x01e4 A[Catch: all -> 0x0156, TryCatch #0 {all -> 0x0156, blocks: (B:32:0x00f2, B:33:0x00fb, B:36:0x0105, B:39:0x0119, B:41:0x0125, B:42:0x0127, B:46:0x013e, B:48:0x0148, B:52:0x0159, B:53:0x015e, B:55:0x0164, B:57:0x0177, B:59:0x018e, B:60:0x0190, B:62:0x01a2, B:64:0x01be, B:66:0x01e4, B:67:0x01f3, B:68:0x01f7, B:70:0x01fd, B:71:0x0204, B:74:0x0212, B:76:0x0216, B:79:0x021d, B:80:0x021e), top: B:101:0x00f2, inners: #2 }] */
                /* JADX WARN: Code duplicated, block: B:70:0x01fd A[Catch: all -> 0x0156, TRY_LEAVE, TryCatch #0 {all -> 0x0156, blocks: (B:32:0x00f2, B:33:0x00fb, B:36:0x0105, B:39:0x0119, B:41:0x0125, B:42:0x0127, B:46:0x013e, B:48:0x0148, B:52:0x0159, B:53:0x015e, B:55:0x0164, B:57:0x0177, B:59:0x018e, B:60:0x0190, B:62:0x01a2, B:64:0x01be, B:66:0x01e4, B:67:0x01f3, B:68:0x01f7, B:70:0x01fd, B:71:0x0204, B:74:0x0212, B:76:0x0216, B:79:0x021d, B:80:0x021e), top: B:101:0x00f2, inners: #2 }] */
                /* JADX WARN: Code duplicated, block: B:83:0x0239 A[Catch: all -> 0x0018, SQLiteException -> 0x00bd, TryCatch #3 {SQLiteException -> 0x00bd, blocks: (B:24:0x00a8, B:27:0x00c0, B:29:0x00ce, B:31:0x00ea, B:81:0x0226, B:83:0x0239, B:85:0x0244, B:93:0x0263, B:87:0x024a, B:89:0x0253, B:91:0x0259, B:92:0x025d, B:94:0x0266, B:95:0x026e, B:30:0x00df), top: B:105:0x00a8, outer: #1 }] */
                /* JADX WARN: Code duplicated, block: B:85:0x0244 A[Catch: all -> 0x0018, SQLiteException -> 0x00bd, TryCatch #3 {SQLiteException -> 0x00bd, blocks: (B:24:0x00a8, B:27:0x00c0, B:29:0x00ce, B:31:0x00ea, B:81:0x0226, B:83:0x0239, B:85:0x0244, B:93:0x0263, B:87:0x024a, B:89:0x0253, B:91:0x0259, B:92:0x025d, B:94:0x0266, B:95:0x026e, B:30:0x00df), top: B:105:0x00a8, outer: #1 }] */
                /* JADX WARN: Code duplicated, block: B:87:0x024a A[Catch: all -> 0x0018, SQLiteException -> 0x00bd, TryCatch #3 {SQLiteException -> 0x00bd, blocks: (B:24:0x00a8, B:27:0x00c0, B:29:0x00ce, B:31:0x00ea, B:81:0x0226, B:83:0x0239, B:85:0x0244, B:93:0x0263, B:87:0x024a, B:89:0x0253, B:91:0x0259, B:92:0x025d, B:94:0x0266, B:95:0x026e, B:30:0x00df), top: B:105:0x00a8, outer: #1 }] */
                /* JADX WARN: Code duplicated, block: B:89:0x0253 A[Catch: all -> 0x0018, SQLiteException -> 0x00bd, TryCatch #3 {SQLiteException -> 0x00bd, blocks: (B:24:0x00a8, B:27:0x00c0, B:29:0x00ce, B:31:0x00ea, B:81:0x0226, B:83:0x0239, B:85:0x0244, B:93:0x0263, B:87:0x024a, B:89:0x0253, B:91:0x0259, B:92:0x025d, B:94:0x0266, B:95:0x026e, B:30:0x00df), top: B:105:0x00a8, outer: #1 }] */
                /* JADX WARN: Code duplicated, block: B:92:0x025d A[Catch: all -> 0x0018, SQLiteException -> 0x00bd, TryCatch #3 {SQLiteException -> 0x00bd, blocks: (B:24:0x00a8, B:27:0x00c0, B:29:0x00ce, B:31:0x00ea, B:81:0x0226, B:83:0x0239, B:85:0x0244, B:93:0x0263, B:87:0x024a, B:89:0x0253, B:91:0x0259, B:92:0x025d, B:94:0x0266, B:95:0x026e, B:30:0x00df), top: B:105:0x00a8, outer: #1 }] */
                /* JADX INFO: renamed from: x */
                public final void m6783x(boolean z, int i, Throwable th, byte[] bArr, String str, List list) {
                    byte[] bArr2;
                    Integer numValueOf;
                    HashMap map;
                    Iterator it;
                    boolean zHasNext;
                    zl3 zl3Var;
                    Iterator it2;
                    List listM220E;
                    ae3 ae3Var;
                    long j;
                    zzib zzibVar;
                    xo3 xo3Var;
                    Map map2;
                    zzib zzibVar2;
                    xo3 xo3Var2;
                    zl3 zl3Var2;
                    zl3 zl3Var3;
                    Map map3;
                    long jM218D;
/* 3 */             int i2 = i;
/* 7 */             ci3 ci3Var = this.f13911b;
/* 13 */            mo4558b().mo1375y();
/* 16 */            m6765k0();
/* 20 */            if (bArr == null) {
                        try {
/* 22 */                    bArr2 = new byte[0];
                        } catch (Throwable th2) {
/* 673 */                   this.f13920f0 = false;
/* 675 */                   m6740M();
/* 678 */                   throw th2;
                        }
                    } else {
/* 28 */                bArr2 = bArr;
                    }
/* 30 */            ArrayList<Long> arrayList = this.f13925j0;
/* 32 */            kb1.m6061n(arrayList);
/* 36 */            this.f13925j0 = null;
/* 38 */            if (z) {
/* 42 */                if (i2 == 200) {
/* 49 */                    if (th != null) {
/* 152 */                       sh3 sh3Var = mo4557a().f17534Y;
/* 156 */                       numValueOf = Integer.valueOf(i2);
/* 164 */                       sh3Var.m8512c(numValueOf, "Network upload successful with code, uploadAttempted", Boolean.valueOf(z));
/* 167 */                       if (z) {
/* 171 */                           C1268s c1268s = this.f13938w.f17198v;
/* 179 */                           ((xt0) mo4562f()).getClass();
/* 186 */                           c1268s.m4933b(System.currentTimeMillis());
                                }
/* 199 */                       this.f13938w.f17199w.m4933b(0L);
/* 202 */                       m6739L();
/* 205 */                       if (z) {
/* 220 */                           mo4557a().f17534Y.m8512c(numValueOf, "Successful upload. Got network response. code, size", Integer.valueOf(bArr2.length));
                                } else {
/* 232 */                           mo4557a().f17534Y.m8510a("Purged empty bundles");
                                }
/* 235 */                       ae3 ae3Var2 = this.f13913c;
/* 237 */                       m6728S(ae3Var2);
/* 240 */                       ae3Var2.m258n0();
/* 245 */                       map = new HashMap();
/* 248 */                       it = list.iterator();
                                while (true) {
/* 252 */                           zHasNext = it.hasNext();
/* 258 */                           zl3Var = zl3.SGTM_CLIENT;
/* 260 */                           if (!zHasNext) {
                                        break;
                                        break;
                                    }
/* 266 */                           Pair pair = (Pair) it.next();
/* 270 */                           zzibVar2 = (zzib) pair.first;
/* 274 */                           xo3Var2 = (xo3) pair.second;
/* 276 */                           zl3Var2 = xo3Var2.f19299c;
/* 278 */                           zl3Var3 = xo3Var2.f19299c;
/* 280 */                           if (zl3Var2 != zl3Var) {
/* 282 */                               ae3 ae3Var3 = this.f13913c;
/* 284 */                               m6728S(ae3Var3);
/* 288 */                               String str2 = xo3Var2.f19297a;
/* 290 */                               map3 = xo3Var2.f19298b;
/* 292 */                               if (map3 == null) {
/* 294 */                                   map3 = Collections.EMPTY_MAP;
                                        }
/* 307 */                               jM218D = ae3Var3.m218D(str, zzibVar2, str2, map3, zl3Var3, null);
/* 313 */                               if (zl3Var3 == zl3.GOOGLE_SIGNAL_PENDING) {
/* 337 */                                   map.put(zzibVar2.zze(), Long.valueOf(jM218D));
                                        }
                                    }
                                }
/* 347 */                       it2 = list.iterator();
/* 355 */                       while (it2.hasNext()) {
/* 361 */                           Pair pair2 = (Pair) it2.next();
/* 366 */                           zzibVar = (zzib) pair2.first;
/* 370 */                           xo3Var = (xo3) pair2.second;
/* 374 */                           if (xo3Var.f19299c == zl3Var) {
/* 385 */                               Long l = (Long) map.get(zzibVar.zze());
/* 387 */                               ae3 ae3Var4 = this.f13913c;
/* 389 */                               m6728S(ae3Var4);
/* 392 */                               zl3 zl3Var4 = zl3Var;
/* 393 */                               String str3 = xo3Var.f19297a;
/* 395 */                               map2 = xo3Var.f19298b;
/* 397 */                               if (map2 == null) {
/* 399 */                                   map2 = Collections.EMPTY_MAP;
                                        }
/* 410 */                               ae3Var4.m218D(str, zzibVar, str3, map2, xo3Var.f19299c, l);
/* 413 */                               zl3Var = zl3Var4;
                                    }
                                }
/* 423 */                       ae3 ae3Var5 = this.f13913c;
/* 425 */                       m6728S(ae3Var5);
/* 437 */                       listM220E = ae3Var5.m220E(str, zzon.m2196D1(zl3Var), 1);
/* 445 */                       if (!listM220E.isEmpty()) {
/* 453 */                           j = ((pp3) listM220E.get(0)).f15239f;
/* 461 */                           ((xt0) mo4562f()).getClass();
/* 483 */                           if (System.currentTimeMillis() > ((Long) vg3.f18073F.m9011a(null)).longValue() + j) {
/* 497 */                               mo4557a().f17541w.m8512c(str, "[sgtm] client batches are queued too long. appId, creationTime", Long.valueOf(j));
                                    }
                                }
/* 508 */                       for (Long l2 : arrayList) {
/* 517 */                           ae3 ae3Var6 = this.f13913c;
/* 519 */                           m6728S(ae3Var6);
/* 526 */                           ae3Var6.m228I(l2.longValue());
                                }
/* 543 */                       ae3 ae3Var7 = this.f13913c;
/* 545 */                       m6728S(ae3Var7);
/* 548 */                       ae3Var7.m259o0();
/* 551 */                       ae3 ae3Var8 = this.f13913c;
/* 553 */                       m6728S(ae3Var8);
/* 556 */                       ae3Var8.m260p0();
/* 559 */                       this.f13926k0 = null;
/* 561 */                       m6728S(ci3Var);
/* 568 */                       if (ci3Var.m1683T()) {
/* 570 */                           ae3Var = this.f13913c;
/* 572 */                           m6728S(ae3Var);
/* 579 */                           if (ae3Var.m222F(str)) {
/* 581 */                               m6779t(str);
                                    } else {
/* 587 */                               m6728S(ci3Var);
/* 594 */                               if (ci3Var.m1683T()) {
/* 606 */                                   this.f13927l0 = -1L;
/* 608 */                                   m6739L();
                                        } else {
/* 606 */                                   this.f13927l0 = -1L;
/* 608 */                                   m6739L();
                                        }
                                    }
                                } else {
/* 587 */                           m6728S(ci3Var);
/* 594 */                           if (ci3Var.m1683T()) {
/* 606 */                               this.f13927l0 = -1L;
/* 608 */                               m6739L();
                                    } else {
/* 606 */                               this.f13927l0 = -1L;
/* 608 */                               m6739L();
                                    }
                                }
/* 612 */                       this.f13908Z = 0L;
                            }
                        } else if (i2 == 204) {
/* 48 */                    i2 = 204;
/* 49 */                    if (th != null) {
/* 152 */                       sh3 sh3Var2 = mo4557a().f17534Y;
/* 156 */                       numValueOf = Integer.valueOf(i2);
/* 164 */                       sh3Var2.m8512c(numValueOf, "Network upload successful with code, uploadAttempted", Boolean.valueOf(z));
/* 167 */                       if (z) {
/* 171 */                           C1268s c1268s2 = this.f13938w.f17198v;
/* 179 */                           ((xt0) mo4562f()).getClass();
/* 186 */                           c1268s2.m4933b(System.currentTimeMillis());
                                }
/* 199 */                       this.f13938w.f17199w.m4933b(0L);
/* 202 */                       m6739L();
/* 205 */                       if (z) {
/* 220 */                           mo4557a().f17534Y.m8512c(numValueOf, "Successful upload. Got network response. code, size", Integer.valueOf(bArr2.length));
                                } else {
/* 232 */                           mo4557a().f17534Y.m8510a("Purged empty bundles");
                                }
/* 235 */                       ae3 ae3Var9 = this.f13913c;
/* 237 */                       m6728S(ae3Var9);
/* 240 */                       ae3Var9.m258n0();
/* 245 */                       map = new HashMap();
/* 248 */                       it = list.iterator();
                                while (true) {
/* 252 */                           zHasNext = it.hasNext();
/* 258 */                           zl3Var = zl3.SGTM_CLIENT;
/* 260 */                           if (!zHasNext) {
                                        break;
                                        break;
                                    }
/* 266 */                           Pair pair3 = (Pair) it.next();
/* 270 */                           zzibVar2 = (zzib) pair3.first;
/* 274 */                           xo3Var2 = (xo3) pair3.second;
/* 276 */                           zl3Var2 = xo3Var2.f19299c;
/* 278 */                           zl3Var3 = xo3Var2.f19299c;
/* 280 */                           if (zl3Var2 != zl3Var) {
/* 282 */                               ae3 ae3Var10 = this.f13913c;
/* 284 */                               m6728S(ae3Var10);
/* 288 */                               String str4 = xo3Var2.f19297a;
/* 290 */                               map3 = xo3Var2.f19298b;
/* 292 */                               if (map3 == null) {
/* 294 */                                   map3 = Collections.EMPTY_MAP;
                                        }
/* 307 */                               jM218D = ae3Var10.m218D(str, zzibVar2, str4, map3, zl3Var3, null);
/* 313 */                               if (zl3Var3 == zl3.GOOGLE_SIGNAL_PENDING) {
/* 337 */                                   map.put(zzibVar2.zze(), Long.valueOf(jM218D));
                                        }
                                    }
                                }
/* 347 */                       it2 = list.iterator();
/* 355 */                       while (it2.hasNext()) {
/* 361 */                           Pair pair4 = (Pair) it2.next();
/* 366 */                           zzibVar = (zzib) pair4.first;
/* 370 */                           xo3Var = (xo3) pair4.second;
/* 374 */                           if (xo3Var.f19299c == zl3Var) {
/* 385 */                               Long l3 = (Long) map.get(zzibVar.zze());
/* 387 */                               ae3 ae3Var11 = this.f13913c;
/* 389 */                               m6728S(ae3Var11);
/* 392 */                               zl3 zl3Var5 = zl3Var;
/* 393 */                               String str5 = xo3Var.f19297a;
/* 395 */                               map2 = xo3Var.f19298b;
/* 397 */                               if (map2 == null) {
/* 399 */                                   map2 = Collections.EMPTY_MAP;
                                        }
/* 410 */                               ae3Var11.m218D(str, zzibVar, str5, map2, xo3Var.f19299c, l3);
/* 413 */                               zl3Var = zl3Var5;
                                    }
                                }
/* 423 */                       ae3 ae3Var12 = this.f13913c;
/* 425 */                       m6728S(ae3Var12);
/* 437 */                       listM220E = ae3Var12.m220E(str, zzon.m2196D1(zl3Var), 1);
/* 445 */                       if (!listM220E.isEmpty()) {
/* 453 */                           j = ((pp3) listM220E.get(0)).f15239f;
/* 461 */                           ((xt0) mo4562f()).getClass();
/* 483 */                           if (System.currentTimeMillis() > ((Long) vg3.f18073F.m9011a(null)).longValue() + j) {
/* 497 */                               mo4557a().f17541w.m8512c(str, "[sgtm] client batches are queued too long. appId, creationTime", Long.valueOf(j));
                                    }
                                }
/* 508 */                       while (r2.hasNext()) {
/* 517 */                           ae3 ae3Var13 = this.f13913c;
/* 519 */                           m6728S(ae3Var13);
/* 526 */                           ae3Var13.m228I(l2.longValue());
                                }
/* 543 */                       ae3 ae3Var14 = this.f13913c;
/* 545 */                       m6728S(ae3Var14);
/* 548 */                       ae3Var14.m259o0();
/* 551 */                       ae3 ae3Var15 = this.f13913c;
/* 553 */                       m6728S(ae3Var15);
/* 556 */                       ae3Var15.m260p0();
/* 559 */                       this.f13926k0 = null;
/* 561 */                       m6728S(ci3Var);
/* 568 */                       if (ci3Var.m1683T()) {
/* 570 */                           ae3Var = this.f13913c;
/* 572 */                           m6728S(ae3Var);
/* 579 */                           if (ae3Var.m222F(str)) {
/* 581 */                               m6779t(str);
                                    } else {
/* 587 */                               m6728S(ci3Var);
/* 594 */                               if (ci3Var.m1683T()) {
/* 606 */                                   this.f13927l0 = -1L;
/* 608 */                                   m6739L();
                                        } else {
/* 606 */                                   this.f13927l0 = -1L;
/* 608 */                                   m6739L();
                                        }
                                    }
                                } else {
/* 587 */                           m6728S(ci3Var);
/* 594 */                           if (ci3Var.m1683T()) {
/* 606 */                               this.f13927l0 = -1L;
/* 608 */                               m6739L();
                                    } else {
/* 606 */                               this.f13927l0 = -1L;
/* 608 */                               m6739L();
                                    }
                                }
/* 612 */                       this.f13908Z = 0L;
                            }
                        }
/* 55 */                String str6 = new String(bArr2, StandardCharsets.UTF_8);
/* 84 */                mo4557a().f17531V.m8513d("Network upload failed. Will retry later. code, error", Integer.valueOf(i2), th, str6.substring(0, Math.min(32, str6.length())));
/* 89 */                C1268s c1268s3 = this.f13938w.f17199w;
/* 97 */                ((xt0) mo4562f()).getClass();
/* 104 */               c1268s3.m4933b(System.currentTimeMillis());
/* 109 */               if (i2 == 503 || i2 == 429) {
/* 117 */                   C1268s c1268s4 = this.f13938w.f17197i;
/* 125 */                   ((xt0) mo4562f()).getClass();
/* 132 */                   c1268s4.m4933b(System.currentTimeMillis());
                        }
/* 135 */               ae3 ae3Var16 = this.f13913c;
/* 137 */               m6728S(ae3Var16);
/* 140 */               ae3Var16.m231K(arrayList);
/* 143 */               m6739L();
                    } else {
/* 152 */               sh3 sh3Var3 = mo4557a().f17534Y;
/* 156 */               numValueOf = Integer.valueOf(i2);
/* 164 */               sh3Var3.m8512c(numValueOf, "Network upload successful with code, uploadAttempted", Boolean.valueOf(z));
/* 167 */               if (z) {
                            try {
/* 171 */                       C1268s c1268s5 = this.f13938w.f17198v;
/* 179 */                       ((xt0) mo4562f()).getClass();
/* 186 */                       c1268s5.m4933b(System.currentTimeMillis());
                            } catch (SQLiteException e) {
/* 632 */                       mo4557a().f17538f.m8511b(e, "Database error while trying to delete uploaded bundles");
/* 641 */                       ((xt0) mo4562f()).getClass();
/* 648 */                       this.f13908Z = SystemClock.elapsedRealtime();
/* 664 */                       mo4557a().f17534Y.m8511b(Long.valueOf(this.f13908Z), "Disable upload, time");
                            }
                        }
/* 199 */               this.f13938w.f17199w.m4933b(0L);
/* 202 */               m6739L();
/* 205 */               if (z) {
/* 220 */                   mo4557a().f17534Y.m8512c(numValueOf, "Successful upload. Got network response. code, size", Integer.valueOf(bArr2.length));
                        } else {
/* 232 */                   mo4557a().f17534Y.m8510a("Purged empty bundles");
                        }
/* 235 */               ae3 ae3Var17 = this.f13913c;
/* 237 */               m6728S(ae3Var17);
/* 240 */               ae3Var17.m258n0();
                        try {
/* 245 */                   map = new HashMap();
/* 248 */                   it = list.iterator();
                            while (true) {
/* 252 */                       zHasNext = it.hasNext();
/* 258 */                       zl3Var = zl3.SGTM_CLIENT;
/* 260 */                       if (!zHasNext) {
                                    break;
                                }
/* 266 */                       Pair pair5 = (Pair) it.next();
/* 270 */                       zzibVar2 = (zzib) pair5.first;
/* 274 */                       xo3Var2 = (xo3) pair5.second;
/* 276 */                       zl3Var2 = xo3Var2.f19299c;
/* 278 */                       zl3Var3 = xo3Var2.f19299c;
/* 280 */                       if (zl3Var2 != zl3Var) {
/* 282 */                           ae3 ae3Var18 = this.f13913c;
/* 284 */                           m6728S(ae3Var18);
/* 288 */                           String str7 = xo3Var2.f19297a;
/* 290 */                           map3 = xo3Var2.f19298b;
/* 292 */                           if (map3 == null) {
/* 294 */                               map3 = Collections.EMPTY_MAP;
                                    }
/* 307 */                           jM218D = ae3Var18.m218D(str, zzibVar2, str7, map3, zl3Var3, null);
/* 313 */                           if (zl3Var3 == zl3.GOOGLE_SIGNAL_PENDING && jM218D != -1 && !zzibVar2.zze().isEmpty()) {
/* 337 */                               map.put(zzibVar2.zze(), Long.valueOf(jM218D));
                                    }
                                }
                            }
/* 347 */                   it2 = list.iterator();
/* 355 */                   while (it2.hasNext()) {
/* 361 */                       Pair pair6 = (Pair) it2.next();
/* 366 */                       zzibVar = (zzib) pair6.first;
/* 370 */                       xo3Var = (xo3) pair6.second;
/* 374 */                       if (xo3Var.f19299c == zl3Var) {
/* 385 */                           Long l4 = (Long) map.get(zzibVar.zze());
/* 387 */                           ae3 ae3Var19 = this.f13913c;
/* 389 */                           m6728S(ae3Var19);
/* 392 */                           zl3 zl3Var6 = zl3Var;
/* 393 */                           String str8 = xo3Var.f19297a;
/* 395 */                           map2 = xo3Var.f19298b;
/* 397 */                           if (map2 == null) {
/* 399 */                               map2 = Collections.EMPTY_MAP;
                                    }
/* 410 */                           ae3Var19.m218D(str, zzibVar, str8, map2, xo3Var.f19299c, l4);
/* 413 */                           zl3Var = zl3Var6;
                                }
                            }
/* 423 */                   ae3 ae3Var110 = this.f13913c;
/* 425 */                   m6728S(ae3Var110);
/* 437 */                   listM220E = ae3Var110.m220E(str, zzon.m2196D1(zl3Var), 1);
/* 445 */                   if (!listM220E.isEmpty()) {
/* 453 */                       j = ((pp3) listM220E.get(0)).f15239f;
/* 461 */                       ((xt0) mo4562f()).getClass();
/* 483 */                       if (System.currentTimeMillis() > ((Long) vg3.f18073F.m9011a(null)).longValue() + j) {
/* 497 */                           mo4557a().f17541w.m8512c(str, "[sgtm] client batches are queued too long. appId, creationTime", Long.valueOf(j));
                                }
                            }
/* 508 */                   while (r2.hasNext()) {
                                try {
/* 517 */                           ae3 ae3Var111 = this.f13913c;
/* 519 */                           m6728S(ae3Var111);
/* 526 */                           ae3Var111.m228I(l2.longValue());
                                } catch (SQLiteException e2) {
/* 531 */                           ArrayList arrayList2 = this.f13926k0;
/* 533 */                           if (arrayList2 == null || !arrayList2.contains(l2)) {
/* 542 */                               throw e2;
                                    }
                                }
                            }
/* 543 */                   ae3 ae3Var112 = this.f13913c;
/* 545 */                   m6728S(ae3Var112);
/* 548 */                   ae3Var112.m259o0();
/* 551 */                   ae3 ae3Var113 = this.f13913c;
/* 553 */                   m6728S(ae3Var113);
/* 556 */                   ae3Var113.m260p0();
/* 559 */                   this.f13926k0 = null;
/* 561 */                   m6728S(ci3Var);
/* 568 */                   if (ci3Var.m1683T()) {
/* 570 */                       ae3Var = this.f13913c;
/* 572 */                       m6728S(ae3Var);
/* 579 */                       if (ae3Var.m222F(str)) {
/* 581 */                           m6779t(str);
                                } else {
/* 587 */                           m6728S(ci3Var);
/* 594 */                           if (ci3Var.m1683T() || !m6738J()) {
/* 606 */                               this.f13927l0 = -1L;
/* 608 */                               m6739L();
                                    } else {
/* 602 */                               m6776q();
                                    }
                                }
                            } else {
/* 587 */                       m6728S(ci3Var);
/* 594 */                       if (ci3Var.m1683T()) {
/* 606 */                           this.f13927l0 = -1L;
/* 608 */                           m6739L();
                                } else {
/* 606 */                           this.f13927l0 = -1L;
/* 608 */                           m6739L();
                                }
                            }
/* 612 */                   this.f13908Z = 0L;
                        } catch (Throwable th3) {
/* 615 */                   ae3 ae3Var20 = this.f13913c;
/* 617 */                   m6728S(ae3Var20);
/* 620 */                   ae3Var20.m260p0();
/* 623 */                   throw th3;
                        }
                    }
/* 667 */           this.f13920f0 = false;
/* 669 */           m6740M();
                }

                /* JADX INFO: renamed from: y */
                public final void m6784y(di3 di3Var) {
                    C1024id c1024id;
                    C1024id c1024id2;
/* 5 */             mo4558b().mo1375y();
/* 16 */            if (TextUtils.isEmpty(di3Var.m3096G())) {
/* 18 */                String strM3093D = di3Var.m3093D();
/* 22 */                kb1.m6061n(strM3093D);
/* 31 */                m6785z(strM3093D, 204, null, null, null);
/* 34 */                return;
                    }
/* 36 */            String strM3093D2 = di3Var.m3093D();
/* 40 */            kb1.m6061n(strM3093D2);
/* 51 */            mo4557a().f17534Y.m8511b(strM3093D2, "Fetching remote configuration");
/* 54 */            vi3 vi3Var = this.f13909a;
/* 56 */            m6728S(vi3Var);
/* 59 */            zzgl zzglVarM9286L = vi3Var.m9286L(strM3093D2);
/* 63 */            m6728S(vi3Var);
/* 66 */            vi3Var.mo1375y();
/* 76 */            String str = (String) vi3Var.f18209X.getOrDefault(strM3093D2, null);
/* 78 */            if (zzglVarM9286L != null) {
/* 84 */                if (TextUtils.isEmpty(str)) {
/* 97 */                    c1024id2 = null;
                        } else {
/* 88 */                    c1024id2 = new C1024id();
/* 93 */                    c1024id2.put("If-Modified-Since", str);
                        }
/* 98 */                m6728S(vi3Var);
/* 101 */               vi3Var.mo1375y();
/* 110 */               String str2 = (String) vi3Var.f18210Y.getOrDefault(strM3093D2, null);
/* 116 */               if (!TextUtils.isEmpty(str2)) {
/* 118 */                   if (c1024id2 == null) {
/* 122 */                       c1024id2 = new C1024id();
                            }
/* 128 */                   c1024id2.put("If-None-Match", str2);
                        }
/* 131 */               c1024id = c1024id2;
                    } else {
/* 133 */               c1024id = null;
                    }
/* 135 */           this.f13918e0 = true;
/* 137 */           ci3 ci3Var = this.f13911b;
/* 139 */           m6728S(ci3Var);
/* 144 */           qf3 qf3Var = new qf3(this);
/* 149 */           ij3 ij3Var = (ij3) ci3Var.f16749a;
/* 151 */           ci3Var.mo1375y();
/* 154 */           ci3Var.m9593A();
/* 159 */           yo3 yo3Var = ci3Var.f15676b.f13903U;
/* 163 */           Uri.Builder builder = new Uri.Builder();
/* 212 */           Uri.Builder builderAppendQueryParameter = builder.scheme((String) vg3.f18130f.m9011a(null)).encodedAuthority((String) vg3.f18133g.m9011a(null)).path("config/app/".concat(String.valueOf(di3Var.m3096G()))).appendQueryParameter("platform", "android");
/* 222 */           ((ij3) yo3Var.f16749a).f9651d.m7401E();
/* 242 */           builderAppendQueryParameter.appendQueryParameter("gmp_version", String.valueOf(130000L)).appendQueryParameter("runtime_version", "0");
/* 249 */           String string = builder.build().toString();
                    try {
/* 258 */               URL url = new URI(string).toURL();
/* 262 */               bj3 bj3Var = ij3Var.f9659i;
/* 264 */               ij3.m4555l(bj3Var);
/* 277 */               bj3Var.m1373L(new eu0(ci3Var, di3Var.m3093D(), url, (byte[]) null, c1024id, qf3Var));
                    } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused) {
/* 281 */               uh3 uh3Var = ij3Var.f9655f;
/* 283 */               ij3.m4555l(uh3Var);
/* 298 */               uh3Var.f17538f.m8512c(uh3.m9013H(di3Var.m3093D()), "Failed to parse config URL. Not fetching. appId", string);
                    }
                }

                /* JADX WARN: Code duplicated, block: B:14:0x0047 A[PHI: r11
  0x0047: PHI (r11v13 int) = (r11v2 int), (r11v0 int) binds: [B:15:0x0049, B:12:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Code duplicated, block: B:16:0x004b  */
                /* JADX WARN: Code duplicated, block: B:54:0x0162 A[Catch: all -> 0x005f, TryCatch #1 {all -> 0x005f, blocks: (B:8:0x0030, B:18:0x004e, B:55:0x0165, B:26:0x006c, B:31:0x00ce, B:30:0x00ba, B:32:0x00d3, B:36:0x00e4, B:40:0x00fa, B:42:0x0114, B:44:0x012f, B:46:0x0138, B:48:0x013e, B:49:0x0142, B:51:0x014b, B:53:0x015a, B:54:0x0162, B:43:0x0120, B:37:0x00eb, B:39:0x00f4), top: B:64:0x0030, outer: #0 }] */
                /* JADX INFO: renamed from: z */
                public final void m6785z(String str, int i, Throwable th, byte[] bArr, Map map) {
                    boolean z;
/* 1 */             ci3 ci3Var = this.f13911b;
/* 7 */             mo4558b().mo1375y();
/* 10 */            m6765k0();
/* 13 */            kb1.m6058k(str);
/* 17 */            if (bArr == null) {
                        try {
/* 19 */                    bArr = new byte[0];
                        } catch (Throwable th2) {
/* 389 */                   this.f13918e0 = false;
/* 391 */                   m6740M();
/* 394 */                   throw th2;
                        }
                    }
/* 29 */            sh3 sh3Var = mo4557a().f17534Y;
/* 34 */            Integer numValueOf = Integer.valueOf(bArr.length);
/* 38 */            sh3Var.m8511b(numValueOf, "onConfigFetched. Response size");
/* 41 */            ae3 ae3Var = this.f13913c;
/* 43 */            m6728S(ae3Var);
/* 46 */            ae3Var.m258n0();
                    try {
/* 49 */                ae3 ae3Var2 = this.f13913c;
/* 51 */                m6728S(ae3Var2);
/* 54 */                di3 di3VarM219D0 = ae3Var2.m219D0(str);
/* 62 */                if (i == 200 || i == 204) {
/* 74 */                    if (th == null) {
/* 76 */                        z = true;
                            } else {
/* 72 */                        z = false;
                            }
                        } else if (i == 304) {
/* 70 */                    i = 304;
/* 74 */                    if (th == null) {
/* 76 */                        z = true;
                            } else {
/* 72 */                        z = false;
                            }
                        } else {
/* 72 */                    z = false;
                        }
/* 77 */                if (di3VarM219D0 == null) {
/* 91 */                    mo4557a().f17541w.m8511b(uh3.m9013H(str), "App does not exist in onConfigFetched. appId");
                        } else {
/* 102 */                   vi3 vi3Var = this.f13909a;
/* 104 */                   if (z || i == 404) {
/* 214 */                       String strM6725K = m6725K("Last-Modified", map);
/* 220 */                       String strM6725K2 = m6725K("ETag", map);
/* 224 */                       if (i == 404 || i == 304) {
/* 236 */                           m6728S(vi3Var);
/* 243 */                           if (vi3Var.m9286L(str) == null) {
/* 245 */                               m6728S(vi3Var);
/* 248 */                               vi3Var.m9288N(str, null, null, null);
                                    }
                                } else {
/* 229 */                           m6728S(vi3Var);
/* 232 */                           vi3Var.m9288N(str, strM6725K, strM6725K2, bArr);
                                }
/* 257 */                       ((xt0) mo4562f()).getClass();
/* 264 */                       di3VarM219D0.m3114f(System.currentTimeMillis());
/* 267 */                       ae3 ae3Var3 = this.f13913c;
/* 269 */                       m6728S(ae3Var3);
/* 272 */                       ae3Var3.m221E0(di3VarM219D0, false);
/* 275 */                       if (i == 404) {
/* 285 */                           mo4557a().f17531V.m8511b(str, "Config not found. Using empty config. appId");
                                } else {
/* 301 */                           mo4557a().f17534Y.m8512c(Integer.valueOf(i), "Successfully fetched config. Got network response. code, size", numValueOf);
                                }
/* 304 */                       m6728S(ci3Var);
/* 311 */                       if (ci3Var.m1683T() && m6738J()) {
/* 319 */                           m6776q();
                                } else {
/* 323 */                           m6728S(ci3Var);
/* 330 */                           if (ci3Var.m1683T()) {
/* 332 */                               ae3 ae3Var4 = this.f13913c;
/* 334 */                               m6728S(ae3Var4);
/* 345 */                               if (ae3Var4.m222F(di3VarM219D0.m3093D())) {
/* 351 */                                   m6779t(di3VarM219D0.m3093D());
                                        } else {
/* 355 */                                   m6739L();
                                        }
                                    } else {
/* 355 */                               m6739L();
                                    }
                                }
                            } else {
/* 115 */                       ((xt0) mo4562f()).getClass();
/* 122 */                       di3VarM219D0.m3115g(System.currentTimeMillis());
/* 125 */                       ae3 ae3Var5 = this.f13913c;
/* 127 */                       m6728S(ae3Var5);
/* 130 */                       ae3Var5.m221E0(di3VarM219D0, false);
/* 145 */                       mo4557a().f17534Y.m8512c(Integer.valueOf(i), "Fetching config failed. code, error", th);
/* 148 */                       m6728S(vi3Var);
/* 151 */                       vi3Var.mo1375y();
/* 156 */                       vi3Var.f18209X.put(str, null);
/* 161 */                       C1268s c1268s = this.f13938w.f17199w;
/* 169 */                       ((xt0) mo4562f()).getClass();
/* 176 */                       c1268s.m4933b(System.currentTimeMillis());
/* 181 */                       if (i == 503 || i == 429) {
/* 189 */                           C1268s c1268s2 = this.f13938w.f17197i;
/* 197 */                           ((xt0) mo4562f()).getClass();
/* 204 */                           c1268s2.m4933b(System.currentTimeMillis());
                                }
/* 207 */                       m6739L();
                            }
                        }
/* 358 */               ae3 ae3Var6 = this.f13913c;
/* 360 */               m6728S(ae3Var6);
/* 363 */               ae3Var6.m259o0();
/* 366 */               ae3 ae3Var7 = this.f13913c;
/* 368 */               m6728S(ae3Var7);
/* 371 */               ae3Var7.m260p0();
/* 374 */               this.f13918e0 = false;
/* 376 */               m6740M();
                    } catch (Throwable th3) {
/* 380 */               ae3 ae3Var8 = this.f13913c;
/* 382 */               m6728S(ae3Var8);
/* 385 */               ae3Var8.m260p0();
/* 388 */               throw th3;
                    }
                }
            }
