            package p000;

            import android.content.Context;
            import android.content.SharedPreferences;
            import android.content.pm.ApplicationInfo;
            import android.content.pm.PackageManager;
            import android.os.Bundle;
            import com.google.firebase.messaging.FirebaseMessaging;
            import java.util.ArrayList;
            import java.util.Iterator;
            
            /* JADX INFO: renamed from: tj */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 43 */    public final class C2220tj {

                /* JADX INFO: renamed from: a */
                public final Object f17121a;

                /* JADX INFO: renamed from: b */
                public boolean f17122b;

                /* JADX INFO: renamed from: c */
                public Object f17123c;

                /* JADX INFO: renamed from: d */
                public Object f17124d;

                public C2220tj(C2183sj c2183sj, int i) throws yl0 {
                    switch (i) {
                        case 1:
/* 29 */                    this.f17121a = c2183sj;
/* 36 */                    this.f17123c = new ArrayList();
/* 41 */                    this.f17124d = new int[5];
/* 43 */                    return;
                        default:
/* 7 */                     int i2 = c2183sj.f16652b;
/* 11 */                    if (i2 < 21 || (i2 & 3) != 1) {
/* 25 */                        throw yl0.m10156a();
                            }
/* 18 */                    this.f17121a = c2183sj;
/* 20 */                    return;
                    }
                }

                /* JADX INFO: renamed from: a */
                public static float m8793a(int[] iArr, int i) {
/* 17 */            return ((i - iArr[4]) - iArr[3]) - (iArr[2] / 2.0f);
                }

                /* JADX INFO: renamed from: b */
                public static void m8794b(int[] iArr) {
/* 4 */             for (int i = 0; i < iArr.length; i++) {
/* 6 */                 iArr[i] = 0;
                    }
                }

                /* JADX INFO: renamed from: d */
                public static boolean m8795d(int[] iArr) {
/* 3 */             int i = 0;
/* 5 */             for (int i2 = 0; i2 < 5; i2++) {
/* 7 */                 int i3 = iArr[i2];
/* 9 */                 if (i3 == 0) {
/* 1 */                     return false;
                        }
/* 12 */                i += i3;
                    }
/* 17 */            if (i < 7) {
/* 1 */                 return false;
                    }
/* 23 */            float f = i / 7.0f;
/* 26 */            float f2 = f / 2.0f;
                    return Math.abs(f - ((float) iArr[0])) < f2 && Math.abs(f - ((float) iArr[1])) < f2 && Math.abs((f * 3.0f) - ((float) iArr[2])) < 3.0f * f2 && Math.abs(f - ((float) iArr[3])) < f2 && Math.abs(f - ((float) iArr[4])) < f2;
                }

                /* JADX INFO: renamed from: c */
                public int m8796c(int i, int i2, int i3) {
/* 1 */             boolean z = this.f17122b;
/* 5 */             C2183sj c2183sj = (C2183sj) this.f17121a;
                    return z ? c2183sj.m8516b(i2, i) : c2183sj.m8516b(i, i2) ? (i3 << 1) | 1 : i3 << 1;
                }

                /* JADX WARN: Code duplicated, block: B:65:0x00f6  */
                /* JADX WARN: Code duplicated, block: B:72:0x0113 A[ADDED_TO_REGION, LOOP:10: B:72:0x0113->B:77:0x011f, LOOP_START, PHI: r12
  0x0113: PHI (r12v5 int) = (r12v4 int), (r12v20 int) binds: [B:70:0x010d, B:77:0x011f] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r12v21 */
                /* JADX WARN: Type inference failed for: r12v22, types: [int] */
                /* JADX WARN: Type inference failed for: r12v23, types: [int] */
                /* JADX WARN: Type inference failed for: r12v24, types: [int] */
                /* JADX WARN: Type inference failed for: r12v38 */
                /* JADX WARN: Type inference failed for: r12v39 */
                /* JADX WARN: Type inference failed for: r12v40 */
                /* JADX WARN: Type inference failed for: r12v41 */
                /* JADX WARN: Type inference failed for: r12v42 */
                /* JADX WARN: Type inference failed for: r14v32, types: [int] */
                /* JADX WARN: Type inference failed for: r14v33, types: [int] */
                /* JADX WARN: Type inference failed for: r14v34, types: [int] */
                /* JADX WARN: Type inference failed for: r17v12 */
                /* JADX WARN: Type inference failed for: r17v13 */
                /* JADX WARN: Type inference failed for: r17v4, types: [boolean] */
                /* JADX WARN: Type inference failed for: r2v1, types: [java.util.ArrayList] */
                /* JADX WARN: Type inference failed for: r4v5 */
                /* JADX WARN: Type inference failed for: r4v6, types: [int] */
                /* JADX WARN: Type inference failed for: r4v9 */
                /* JADX WARN: Type inference failed for: r6v18, types: [int] */
                /* JADX WARN: Type inference failed for: r6v22, types: [int] */
                /* JADX WARN: Type inference failed for: r6v26, types: [int] */
                /* JADX WARN: Type inference failed for: r6v31 */
                /* JADX WARN: Type inference failed for: r6v32 */
                /* JADX WARN: Type inference failed for: r6v8 */
                /* JADX WARN: Type inference failed for: r6v9, types: [int] */
                /* JADX WARN: Type inference failed for: r7v28 */
                /* JADX WARN: Type inference failed for: r7v6 */
                /* JADX WARN: Type inference failed for: r7v7, types: [int] */
                /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:72:0x0113
                    	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
                    	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
                    	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
                    	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
                    	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
                    	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
                    	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
                    	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
                    	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
                    	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
                    	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
                    	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
                    	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
                    */
                /* JADX INFO: renamed from: e */
                public boolean m8797e(int r20, int r21, int[] r22) {
                    /*
                        Method dump skipped, instruction units count: 810
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p000.C2220tj.m8797e(int, int, int[]):boolean");
                }

                /* JADX INFO: renamed from: f */
                public boolean m8798f() {
/* 3 */             ArrayList<ni0> arrayList = (ArrayList) this.f17123c;
/* 5 */             int size = arrayList.size();
/* 14 */            float fAbs = 0.0f;
/* 15 */            int i = 0;
/* 16 */            float f = 0.0f;
/* 21 */            for (ni0 ni0Var : arrayList) {
/* 32 */                if (ni0Var.f14275d >= 2) {
/* 34 */                    i++;
/* 38 */                    f += ni0Var.f14274c;
                        }
                    }
/* 41 */            if (i >= 3) {
/* 45 */                float f2 = f / size;
/* 47 */                Iterator it = arrayList.iterator();
/* 55 */                while (it.hasNext()) {
/* 70 */                    fAbs += Math.abs(((ni0) it.next()).f14274c - f2);
                        }
/* 78 */                if (fAbs <= f * 0.05f) {
/* 80 */                    return true;
                        }
                    }
/* 13 */            return false;
                }

                /* JADX INFO: renamed from: g */
                public synchronized void m8799g() {
                    try {
/* 4 */                 if (this.f17122b) {
/* 7 */                     return;
                        }
/* 8 */                 Boolean boolM8801i = m8801i();
/* 12 */                this.f17123c = boolM8801i;
/* 14 */                if (boolM8801i == null) {
/* 20 */                    s80 s80Var = new s80(15);
/* 27 */                    xe0 xe0Var = (xe0) ((li2) this.f17121a);
/* 31 */                    xe0Var.m9756a(xe0Var.f19055c, s80Var);
                        }
/* 38 */                this.f17122b = true;
                    } catch (Throwable th) {
/* 43 */                throw th;
                    }
                }

                /* JADX INFO: renamed from: h */
                public synchronized boolean m8800h() {
                    boolean z;
                    boolean zBooleanValue;
                    try {
/* 2 */                 m8799g();
/* 7 */                 Boolean bool = (Boolean) this.f17123c;
/* 9 */                 if (bool != null) {
/* 11 */                    zBooleanValue = bool.booleanValue();
                        } else {
/* 22 */                    vi0 vi0Var = ((FirebaseMessaging) this.f17124d).f5297a;
/* 24 */                    vi0Var.m9274a();
/* 33 */                    a40 a40Var = (a40) vi0Var.f18198g.get();
                            synchronized (a40Var) {
/* 36 */                        z = a40Var.f78a;
                            }
/* 39 */                    zBooleanValue = z;
                        }
                    } catch (Throwable th) {
/* 46 */                throw th;
                    }
/* 41 */            return zBooleanValue;
                }

                /* JADX INFO: renamed from: i */
                public Boolean m8801i() {
                    ApplicationInfo applicationInfo;
                    Bundle bundle;
/* 7 */             vi0 vi0Var = ((FirebaseMessaging) this.f17124d).f5297a;
/* 9 */             vi0Var.m9274a();
/* 12 */            Context context = vi0Var.f18192a;
/* 17 */            SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
/* 27 */            if (sharedPreferences.contains("auto_init")) {
/* 33 */                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
                    }
                    try {
/* 38 */                PackageManager packageManager = context.getPackageManager();
/* 42 */                if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
/* 77 */                    return null;
                        }
/* 72 */                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
                    } catch (PackageManager.NameNotFoundException unused) {
/* 77 */                return null;
                    }
                }

                /* JADX INFO: renamed from: j */
                public zl0 m8802j() {
/* 3 */             zl0 zl0Var = (zl0) this.f17124d;
/* 5 */             if (zl0Var != null) {
/* 7 */                 return zl0Var;
                    }
/* 8 */             int iM8796c = 0;
/* 10 */            int iM8796c2 = 0;
/* 14 */            for (int i = 0; i < 6; i++) {
/* 16 */                iM8796c2 = m8796c(i, 8, iM8796c2);
                    }
/* 32 */            int iM8796c3 = m8796c(8, 7, m8796c(8, 8, m8796c(7, 8, iM8796c2)));
/* 37 */            for (int i2 = 5; i2 >= 0; i2--) {
/* 39 */                iM8796c3 = m8796c(8, i2, iM8796c3);
                    }
/* 50 */            int i3 = ((C2183sj) this.f17121a).f16652b;
/* 52 */            int i4 = i3 - 7;
/* 56 */            for (int i5 = i3 - 1; i5 >= i4; i5--) {
/* 58 */                iM8796c = m8796c(8, i5, iM8796c);
                    }
/* 67 */            for (int i6 = i3 - 8; i6 < i3; i6++) {
/* 69 */                iM8796c = m8796c(i6, 8, iM8796c);
                    }
/* 76 */            zl0 zl0VarM10401a = zl0.m10401a(iM8796c3, iM8796c);
/* 80 */            if (zl0VarM10401a == null) {
/* 87 */                zl0VarM10401a = zl0.m10401a(iM8796c3 ^ 21522, iM8796c ^ 21522);
                    }
/* 91 */            this.f17124d = zl0VarM10401a;
/* 93 */            if (zl0VarM10401a != null) {
/* 95 */                return zl0VarM10401a;
                    }
/* 100 */           throw yl0.m10156a();
                }

                /* JADX INFO: renamed from: k */
                public f23 m8803k() {
/* 3 */             f23 f23Var = (f23) this.f17123c;
/* 5 */             if (f23Var != null) {
/* 7 */                 return f23Var;
                    }
/* 12 */            int i = ((C2183sj) this.f17121a).f16652b;
/* 16 */            int i2 = (i - 17) / 4;
/* 19 */            if (i2 <= 6) {
/* 21 */                return f23.m3636c(i2);
                    }
/* 26 */            int i3 = i - 11;
/* 29 */            int iM8796c = 0;
/* 31 */            int iM8796c2 = 0;
/* 32 */            for (int i4 = 5; i4 >= 0; i4--) {
/* 36 */                for (int i5 = i - 9; i5 >= i3; i5--) {
/* 38 */                    iM8796c2 = m8796c(i5, i4, iM8796c2);
                        }
                    }
/* 48 */            f23 f23VarM3635b = f23.m3635b(iM8796c2);
/* 52 */            if (f23VarM3635b != null && (f23VarM3635b.f7979a * 4) + 17 == i) {
/* 62 */                this.f17123c = f23VarM3635b;
/* 64 */                return f23VarM3635b;
                    }
/* 65 */            for (int i6 = 5; i6 >= 0; i6--) {
/* 69 */                for (int i7 = i - 9; i7 >= i3; i7--) {
/* 71 */                    iM8796c = m8796c(i6, i7, iM8796c);
                        }
                    }
/* 81 */            f23 f23VarM3635b2 = f23.m3635b(iM8796c);
/* 85 */            if (f23VarM3635b2 == null || (f23VarM3635b2.f7979a * 4) + 17 != i) {
/* 102 */               throw yl0.m10156a();
                    }
/* 95 */            this.f17123c = f23VarM3635b2;
/* 97 */            return f23VarM3635b2;
                }

                /* JADX INFO: renamed from: l */
                public void m8804l() {
/* 5 */             if (((zl0) this.f17124d) == null) {
/* 50 */                return;
                    }
/* 20 */            int i = AbstractC0886en.m3496E(8)[((zl0) this.f17124d).f20235b];
/* 24 */            C2183sj c2183sj = (C2183sj) this.f17121a;
/* 26 */            int i2 = c2183sj.f16652b;
/* 30 */            for (int i3 = 0; i3 < i2; i3++) {
/* 33 */                for (int i4 = 0; i4 < i2; i4++) {
/* 39 */                    if (AbstractC0886en.m3497a(i, i3, i4)) {
/* 41 */                        c2183sj.m8515a(i4, i3);
                            }
                        }
                    }
                }

                /* JADX INFO: renamed from: m */
                public String m8805m() {
/* 3 */             if (!this.f17122b) {
/* 6 */                 this.f17122b = true;
/* 10 */                ki3 ki3Var = (ki3) this.f17124d;
/* 25 */                this.f17123c = ki3Var.m6113D().getString((String) this.f17121a, null);
                    }
/* 29 */            return (String) this.f17123c;
                }

                /* JADX INFO: renamed from: n */
                public void m8806n(String str) {
/* 9 */             SharedPreferences.Editor editorEdit = ((ki3) this.f17124d).m6113D().edit();
/* 17 */            editorEdit.putString((String) this.f17121a, str);
/* 20 */            editorEdit.apply();
/* 23 */            this.f17123c = str;
                }

/* 44 */        public C2220tj(ki3 ki3Var, String str) {
                    this.f17124d = ki3Var;
/* 46 */            kb1.m6058k(str);
                    this.f17121a = str;
                }

/* 46 */        public C2220tj(FirebaseMessaging firebaseMessaging, li2 li2Var) {
                    this.f17124d = firebaseMessaging;
/* 48 */            this.f17121a = li2Var;
                }
            }
