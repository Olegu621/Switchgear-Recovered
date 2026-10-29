            package p000;

            import android.content.Context;
            import android.os.Bundle;
            import android.os.Looper;
            import android.security.keystore.KeyGenParameterSpec;
            import android.util.SparseArray;
            import androidx.core.app.NotificationCompat;
            import com.google.android.gms.common.data.DataHolder;
            import com.google.android.gms.internal.common.zzg;
            import com.google.android.gms.internal.games_v2.zzah;
            import java.security.GeneralSecurityException;
            import java.security.KeyStore;
            import java.security.ProviderException;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collection;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.Map;
            import javax.crypto.KeyGenerator;
            import kotlin.jvm.internal.Intrinsics;
            import kotlinx.serialization.descriptors.SerialDescriptor;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 105 */   public final class bx0 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f2629a;

                /* JADX INFO: renamed from: b */
                public Object f2630b;

                /* JADX INFO: renamed from: c */
                public int f2631c;

                /* JADX INFO: renamed from: d */
                public Object f2632d;

                public bx0(DataHolder dataHolder) {
/* 2 */             this.f2629a = 5;
/* 9 */             this.f2631c = dataHolder.f3467e;
/* 16 */            this.f2632d = new SparseArray();
/* 18 */            int i = dataHolder.f3470v;
/* 27 */            kb1.m6054g(i == 3);
/* 30 */            int i2 = 0;
/* 31 */            while (i2 < i) {
/* 33 */                int iM2016H1 = dataHolder.m2016H1(i2);
/* 37 */                if (i2 == 0) {
/* 41 */                    dataHolder.m2015G1(0, iM2016H1, "leaderboardId");
/* 50 */                    this.f2630b = dataHolder.m2015G1(0, iM2016H1, "playerId");
/* 52 */                    i2 = 0;
                        }
/* 59 */                if (dataHolder.m2012D1(i2, iM2016H1, "hasResult")) {
/* 100 */                   ((SparseArray) this.f2632d).put(dataHolder.m2013E1(i2, iM2016H1, "timeSpan"), new q72(dataHolder.m2014F1(i2, iM2016H1, "rawScore"), dataHolder.m2015G1(i2, iM2016H1, "formattedScore"), dataHolder.m2015G1(i2, iM2016H1, "scoreTag"), dataHolder.m2012D1(i2, iM2016H1, "newBest")));
                        }
/* 103 */               i2++;
                    }
                }

                /* JADX INFO: renamed from: a */
                public C0204c5 m1455a() {
/* 1 */             int i = this.f2631c;
/* 4 */             if (i == 0 && ((KeyGenParameterSpec) this.f2632d) == null) {
/* 15 */                C1951n4.m6859j("build() called before setKeyGenParameterSpec or setKeyScheme.");
/* 3 */                 return null;
                    }
/* 23 */            if (i == 1) {
/* 62 */                this.f2632d = new KeyGenParameterSpec.Builder((String) this.f2630b, 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setKeySize(NotificationCompat.FLAG_LOCAL_ONLY).build();
                    }
/* 66 */            KeyGenParameterSpec keyGenParameterSpec = (KeyGenParameterSpec) this.f2632d;
/* 68 */            if (keyGenParameterSpec == null) {
/* 270 */               C1951n4.m6868s("KeyGenParameterSpec was null after build() check");
/* 3 */                 return null;
                    }
/* 70 */            Object obj = qc1.f15485a;
/* 76 */            if (keyGenParameterSpec.getKeySize() != 256) {
/* 267 */               throw new IllegalArgumentException("invalid key size, want 256 bits got " + keyGenParameterSpec.getKeySize() + " bits");
                    }
/* 92 */            if (!Arrays.equals(keyGenParameterSpec.getBlockModes(), new String[]{"GCM"})) {
/* 235 */               C1951n4.m6865p(Arrays.toString(keyGenParameterSpec.getBlockModes()), "invalid block mode, want GCM got ");
/* 3 */                 return null;
                    }
/* 98 */            if (keyGenParameterSpec.getPurposes() != 3) {
/* 221 */               s80.m8429j(keyGenParameterSpec.getPurposes(), "invalid purposes mode, want PURPOSE_ENCRYPT | PURPOSE_DECRYPT got ");
/* 3 */                 return null;
                    }
/* 114 */           if (!Arrays.equals(keyGenParameterSpec.getEncryptionPaddings(), new String[]{"NoPadding"})) {
/* 211 */               C1951n4.m6865p(Arrays.toString(keyGenParameterSpec.getEncryptionPaddings()), "invalid padding mode, want NoPadding got ");
/* 3 */                 return null;
                    }
/* 120 */           if (keyGenParameterSpec.isUserAuthenticationRequired() && keyGenParameterSpec.getUserAuthenticationValidityDurationSeconds() < 1) {
/* 131 */               C1951n4.m6859j("per-operation authentication is not supported (UserAuthenticationValidityDurationSeconds must be >0)");
/* 3 */                 return null;
                    }
                    synchronized (qc1.f15485a) {
/* 138 */               String keystoreAlias = keyGenParameterSpec.getKeystoreAlias();
/* 144 */               KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
/* 148 */               keyStore.load(null);
/* 155 */               if (!keyStore.containsAlias(keystoreAlias)) {
                            try {
/* 161 */                       KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
/* 165 */                       keyGenerator.init(keyGenParameterSpec);
/* 168 */                       keyGenerator.generateKey();
                            } catch (ProviderException e) {
/* 182 */                       throw new GeneralSecurityException(e.getMessage(), e);
                            }
                        }
                    }
/* 194 */           return new C0204c5(keyGenParameterSpec.getKeystoreAlias(), (KeyGenParameterSpec) this.f2632d);
                }

                /* JADX INFO: renamed from: b */
                public y22 m1456b() {
/* 3 */             ax0 ax0Var = (ax0) this.f2632d;
/* 5 */             if (ax0Var != null) {
/* 33 */                throw ax0Var.m1177a();
                    }
/* 13 */            y22 y22VarM10086b = y22.m10086b(this.f2631c, (Object[]) this.f2630b, this);
/* 19 */            ax0 ax0Var2 = (ax0) this.f2632d;
/* 21 */            if (ax0Var2 == null) {
/* 23 */                return y22VarM10086b;
                    }
/* 28 */            throw ax0Var2.m1177a();
                }

                /* JADX INFO: renamed from: c */
                public String m1457c() {
/* 5 */             StringBuilder sb = new StringBuilder("$");
/* 10 */            int i = this.f2631c + 1;
/* 13 */            for (int i2 = 0; i2 < i; i2++) {
/* 19 */                Object obj = ((Object[]) this.f2630b)[i2];
/* 23 */                if (obj instanceof SerialDescriptor) {
/* 25 */                    SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
/* 33 */                    boolean zM6216a = Intrinsics.m6216a(serialDescriptor.mo134e(), ei2.f7699l);
/* 39 */                    int[] iArr = (int[]) this.f2632d;
/* 41 */                    if (!zM6216a) {
/* 68 */                        int i3 = iArr[i2];
/* 70 */                        if (i3 >= 0) {
/* 74 */                            sb.append(".");
/* 81 */                            sb.append(serialDescriptor.mo136g(i3));
                                }
                            } else if (iArr[i2] != -1) {
/* 50 */                        sb.append("[");
/* 59 */                        sb.append(((int[]) this.f2632d)[i2]);
/* 64 */                        sb.append("]");
                            }
                        } else if (obj != dc0.f7094U) {
/* 91 */                    sb.append("['");
/* 94 */                    sb.append(obj);
/* 99 */                    sb.append("']");
                        }
                    }
/* 105 */           return sb.toString();
                }

                /* JADX INFO: renamed from: d */
                public void m1458d(Object obj, Object obj2) {
/* 5 */             int i = (this.f2631c + 1) * 2;
/* 9 */             Object[] objArr = (Object[]) this.f2630b;
/* 12 */            if (i > objArr.length) {
/* 23 */                this.f2630b = Arrays.copyOf(objArr, mn0.m6698n(objArr.length, i));
                    }
/* 25 */            if (obj == null) {
/* 88 */                String strValueOf = String.valueOf(obj2);
/* 100 */               StringBuilder sb = new StringBuilder(strValueOf.length() + 24);
/* 105 */               sb.append("null key in entry: null=");
/* 108 */               sb.append(strValueOf);
/* 118 */               throw new NullPointerException(sb.toString());
                    }
/* 27 */            if (obj2 == null) {
/* 50 */                String strValueOf2 = String.valueOf(obj);
/* 62 */                StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 26);
/* 67 */                sb2.append("null value in entry: ");
/* 70 */                sb2.append(strValueOf2);
/* 75 */                sb2.append("=null");
/* 85 */                throw new NullPointerException(sb2.toString());
                    }
/* 31 */            Object[] objArr2 = (Object[]) this.f2630b;
/* 33 */            int i2 = this.f2631c;
/* 35 */            int i3 = i2 * 2;
/* 37 */            objArr2[i3] = obj;
/* 41 */            objArr2[i3 + 1] = obj2;
/* 45 */            this.f2631c = i2 + 1;
                }

                /* JADX INFO: renamed from: e */
                public void m1459e(Collection collection) {
/* 1 */             if (collection != null) {
/* 10 */                int size = (collection.size() + this.f2631c) * 2;
/* 14 */                Object[] objArr = (Object[]) this.f2630b;
/* 17 */                if (size > objArr.length) {
/* 28 */                    this.f2630b = Arrays.copyOf(objArr, mn0.m6698n(objArr.length, size));
                        }
                    }
/* 30 */            Iterator it = collection.iterator();
/* 38 */            while (it.hasNext()) {
/* 44 */                Map.Entry entry = (Map.Entry) it.next();
/* 54 */                m1458d(entry.getKey(), entry.getValue());
                    }
                }

                /* JADX INFO: renamed from: f */
                public void m1460f(AbstractC1812k abstractC1812k, if1 if1Var, zd1 zd1Var, td1 td1Var) {
/* 4 */             if (abstractC1812k instanceof he1) {
/* 6 */                 this.f2630b = null;
/* 12 */                this.f2631c++;
                    } else if (abstractC1812k instanceof vd1) {
/* 19 */                this.f2632d = null;
/* 22 */                this.f2631c = 0;
                    }
/* 24 */            if (zd1Var != null) {
/* 28 */                zd1 zd1Var2 = (zd1) this.f2630b;
/* 30 */                if (zd1Var2 != null) {
/* 34 */                    zd1Var2.f20100a = zd1Var.f20100a;
/* 36 */                    String str = zd1Var.f20101b;
/* 38 */                    if (str != null) {
/* 40 */                        zd1Var2.f20101b = str;
                            }
/* 42 */                    String str2 = zd1Var.f20102c;
/* 44 */                    if (str2 != null) {
/* 46 */                        zd1Var2.f20102c = str2;
                            }
/* 48 */                    Integer num = zd1Var.f20103d;
/* 50 */                    if (num != null) {
/* 60 */                        zd1Var2.f20103d = Integer.valueOf(num.intValue());
                            }
/* 62 */                    Double d = zd1Var.f20104e;
/* 64 */                    if (d != null) {
/* 74 */                        zd1Var2.f20104e = Double.valueOf(d.doubleValue());
                            }
/* 76 */                    Boolean bool = zd1Var.f20105f;
/* 78 */                    if (bool != null) {
/* 80 */                        zd1Var2.f20105f = bool;
                            }
                        }
/* 84 */                zd1 zd1Var3 = (zd1) this.f2630b;
/* 86 */                if (zd1Var3 != null) {
/* 89 */                    zd1Var = zd1Var3;
                        }
/* 90 */                this.f2630b = zd1Var;
/* 92 */                int i = this.f2631c;
/* 94 */                if (i > 0) {
/* 100 */                   zd1Var.f20103d = Integer.valueOf(i);
                        }
                    }
/* 102 */           if (td1Var != null) {
/* 106 */               td1 td1Var2 = (td1) this.f2632d;
/* 108 */               if (td1Var2 != null) {
/* 112 */                   td1Var2.f17046a = td1Var.f17046a;
/* 114 */                   String str3 = td1Var.f17047b;
/* 116 */                   if (str3 != null) {
/* 118 */                       td1Var2.f17047b = str3;
                            }
/* 120 */                   wd1 wd1Var = td1Var.f17048c;
/* 122 */                   if (wd1Var != null) {
/* 124 */                       td1Var2.f17048c = wd1Var;
                            }
/* 126 */                   Integer num2 = td1Var.f17049d;
/* 128 */                   if (num2 != null) {
/* 138 */                       td1Var2.f17049d = Integer.valueOf(num2.intValue());
                            }
                        }
/* 142 */               td1 td1Var3 = (td1) this.f2632d;
/* 144 */               if (td1Var3 != null) {
/* 147 */                   td1Var = td1Var3;
                        }
/* 148 */               this.f2632d = td1Var;
/* 152 */               if (td1Var.f17050e == null) {
/* 154 */                   Double dValueOf = if1Var.f9565a;
/* 156 */                   if (dValueOf == null) {
/* 160 */                       dValueOf = Double.valueOf(0.0d);
                            }
/* 164 */                   td1Var.f17050e = dValueOf;
                        }
                    }
                }

                /* JADX INFO: renamed from: g */
                public void m1461g(String str, x61 x61Var) {
/* 3 */             Map map = (Map) this.f2630b;
/* 9 */             if (map.containsKey(str)) {
/* 55 */                C1951n4.m6859j(fm0.m3790p(new StringBuilder(str.length() + 59), "LifecycleCallback with tag ", str, " already added to this fragment."));
/* 58 */                return;
                    }
/* 11 */            map.put(str, x61Var);
/* 16 */            if (this.f2631c > 0) {
/* 32 */                new zzg(Looper.getMainLooper()).post(new js0(this, x61Var, str));
                    }
                }

                /* JADX INFO: renamed from: h */
                public void m1462h(Bundle bundle) {
/* 2 */             this.f2631c = 1;
/* 4 */             this.f2632d = bundle;
/* 22 */            for (Map.Entry entry : ((Map) this.f2630b).entrySet()) {
/* 50 */                ((x61) entry.getValue()).onCreate(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
                    }
                }

                /* JADX INFO: renamed from: i */
                public void m1463i(Bundle bundle) {
/* 1 */             if (bundle == null) {
/* 52 */                return;
                    }
/* 20 */            for (Map.Entry entry : ((Map) this.f2630b).entrySet()) {
/* 30 */                Bundle bundle2 = new Bundle();
/* 39 */                ((x61) entry.getValue()).onSaveInstanceState(bundle2);
/* 48 */                bundle.putBundle((String) entry.getKey(), bundle2);
                    }
                }

                public String toString() {
                    switch (this.f2629a) {
                        case 1:
/* 81 */                    return m1457c();
                        case 5:
/* 13 */                    wc0 wc0Var = new wc0(this);
/* 22 */                    wc0Var.m9529d((String) this.f2630b, "PlayerId");
/* 33 */                    wc0Var.m9529d(Integer.valueOf(this.f2631c), "StatusCode");
/* 38 */                    for (int i = 0; i < 3; i++) {
/* 48 */                        q72 q72Var = (q72) ((SparseArray) this.f2632d).get(i);
/* 56 */                        wc0Var.m9529d(zzah.zza(i), "TimesSpan");
/* 70 */                        wc0Var.m9529d(q72Var == null ? "null" : q72Var.toString(), "Result");
                            }
/* 76 */                    return wc0Var.toString();
                        default:
/* 6 */                     return super.toString();
                    }
                }

/* 106 */       public /* synthetic */ bx0(int i, String str, ArrayList arrayList, int i2) {
/* 107 */           this.f2629a = i2;
                    this.f2631c = i;
                    this.f2632d = str;
                    this.f2630b = arrayList;
                }

/* 107 */       public bx0() {
                    this.f2629a = 7;
/* 110 */           this.f2630b = Collections.synchronizedMap(new C1024id());
                    this.f2631c = 0;
                }

/* 110 */       public /* synthetic */ bx0(byte b, int i) {
/* 111 */           this.f2629a = i;
                }

/* 111 */       public bx0(int i, String str, String str2) {
                    this.f2629a = 4;
/* 113 */           this.f2630b = str;
/* 114 */           this.f2632d = str2;
/* 115 */           this.f2631c = i;
                }

/* 115 */       public bx0(Context context) {
                    this.f2629a = 2;
/* 117 */           context.getApplicationContext();
/* 118 */           this.f2630b = "_androidx_security_master_key_";
                }

/* 118 */       public bx0(int i) {
                    this.f2629a = 0;
/* 120 */           this.f2630b = new Object[i * 2];
/* 121 */           this.f2631c = 0;
                }
            }
