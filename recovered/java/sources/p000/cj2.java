            package p000;

            import android.content.Context;
            import android.graphics.SurfaceTexture;
            import android.hardware.camera2.CameraCharacteristics;
            import android.hardware.camera2.params.StreamConfigurationMap;
            import android.media.CamcorderProfile;
            import android.media.MediaRecorder;
            import android.os.Build;
            import android.text.TextUtils;
            import android.util.Pair;
            import android.util.Range;
            import android.util.Rational;
            import android.util.Size;
            import androidx.camera.camera2.internal.compat.quirk.AspectRatioLegacyApi21Quirk;
            import androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk;
            import androidx.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk;
            import androidx.camera.camera2.internal.compat.quirk.Nexus4AndroidLTargetAspectRatioQuirk;
            import androidx.core.app.NotificationCompat;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.LinkedHashSet;
            import java.util.List;
            import java.util.Locale;
            import java.util.Set;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class cj2 {

                /* JADX INFO: renamed from: i */
                public final String f2949i;

                /* JADX INFO: renamed from: j */
                public final dc0 f2950j;

                /* JADX INFO: renamed from: k */
                public final C0962gp f2951k;

                /* JADX INFO: renamed from: l */
                public final gr0 f2952l;

                /* JADX INFO: renamed from: m */
                public final int f2953m;

                /* JADX INFO: renamed from: n */
                public final boolean f2954n;

                /* JADX INFO: renamed from: o */
                public final boolean f2955o;

                /* JADX INFO: renamed from: p */
                public final boolean f2956p;

                /* JADX INFO: renamed from: q */
                public final boolean f2957q;

                /* JADX INFO: renamed from: r */
                public final boolean f2958r;

                /* JADX INFO: renamed from: s */
                public C2330wg f2959s;

                /* JADX INFO: renamed from: u */
                public final c90 f2961u;

                /* JADX INFO: renamed from: x */
                public final C1822k8 f2964x;

                /* JADX INFO: renamed from: a */
                public final ArrayList f2941a = new ArrayList();

                /* JADX INFO: renamed from: b */
                public final ArrayList f2942b = new ArrayList();

                /* JADX INFO: renamed from: c */
                public final ArrayList f2943c = new ArrayList();

                /* JADX INFO: renamed from: d */
                public final ArrayList f2944d = new ArrayList();

                /* JADX INFO: renamed from: e */
                public final HashMap f2945e = new HashMap();

                /* JADX INFO: renamed from: f */
                public final ArrayList f2946f = new ArrayList();

                /* JADX INFO: renamed from: g */
                public final ArrayList f2947g = new ArrayList();

                /* JADX INFO: renamed from: h */
                public final ArrayList f2948h = new ArrayList();

                /* JADX INFO: renamed from: t */
                public final ArrayList f2960t = new ArrayList();

                /* JADX INFO: renamed from: v */
                public final p62 f2962v = new p62(5);

                /* JADX INFO: renamed from: w */
                public final md1 f2963w = new md1(1);

                public cj2(Context context, String str, C0816cq c0816cq, dc0 dc0Var) throws C1936mq {
                    int i;
                    List listSingletonList;
                    int[] outputFormats;
                    long[] jArr;
                    ej2 ej2Var;
                    int[] iArr;
/* 10 */            this.f2954n = false;
/* 11 */            this.f2955o = false;
/* 12 */            this.f2956p = false;
/* 13 */            this.f2957q = false;
/* 14 */            this.f2958r = false;
/* 20 */            str.getClass();
/* 21 */            this.f2949i = str;
/* 22 */            dc0Var.getClass();
/* 23 */            this.f2950j = dc0Var;
/* 24 */            this.f2952l = new gr0(26);
/* 25 */            this.f2961u = c90.m1546b(context);
                    try {
/* 26 */                C0962gp c0962gpM2831b = c0816cq.m2831b(str);
                        this.f2951k = c0962gpM2831b;
/* 27 */                Integer num = (Integer) c0962gpM2831b.m3981a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
/* 29 */                this.f2953m = num != null ? num.intValue() : 2;
/* 31 */                int[] iArr2 = (int[]) c0962gpM2831b.m3981a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
                        if (iArr2 != null) {
                            for (int i2 : iArr2) {
                                if (i2 == 3) {
/* 33 */                            this.f2954n = true;
                                } else if (i2 == 6) {
/* 34 */                            this.f2955o = true;
                                } else if (Build.VERSION.SDK_INT >= 31 && i2 == 16) {
/* 36 */                            this.f2958r = true;
                                }
                            }
                        }
/* 37 */                this.f2964x = new C1822k8(this.f2951k);
/* 38 */                ArrayList arrayList = this.f2941a;
                        int i3 = this.f2953m;
                        boolean z = this.f2954n;
                        boolean z2 = this.f2955o;
/* 39 */                ArrayList arrayList2 = new ArrayList();
/* 40 */                ArrayList arrayList3 = new ArrayList();
/* 41 */                dj2 dj2Var = new dj2();
/* 42 */                ej2 ej2Var2 = ej2.MAXIMUM;
                        fm0.m3795u(1, ej2Var2, 0L, dj2Var);
/* 43 */                dj2 dj2VarM3779e = fm0.m3779e(arrayList3, dj2Var);
/* 44 */                fm0.m3795u(3, ej2Var2, 0L, dj2VarM3779e);
/* 45 */                dj2 dj2VarM3779e2 = fm0.m3779e(arrayList3, dj2VarM3779e);
/* 46 */                fm0.m3795u(2, ej2Var2, 0L, dj2VarM3779e2);
/* 47 */                dj2 dj2VarM3779e3 = fm0.m3779e(arrayList3, dj2VarM3779e2);
                        ej2 ej2Var3 = ej2.PREVIEW;
/* 49 */                dj2VarM3779e3.m3140a(new C2143rg(1, ej2Var3, 0L));
/* 50 */                fm0.m3795u(3, ej2Var2, 0L, dj2VarM3779e3);
/* 51 */                dj2 dj2VarM3779e4 = fm0.m3779e(arrayList3, dj2VarM3779e3);
/* 53 */                dj2VarM3779e4.m3140a(new C2143rg(2, ej2Var3, 0L));
/* 54 */                fm0.m3795u(3, ej2Var2, 0L, dj2VarM3779e4);
/* 55 */                dj2 dj2VarM3779e5 = fm0.m3779e(arrayList3, dj2VarM3779e4);
/* 57 */                dj2VarM3779e5.m3140a(new C2143rg(1, ej2Var3, 0L));
/* 58 */                fm0.m3795u(1, ej2Var3, 0L, dj2VarM3779e5);
/* 59 */                dj2 dj2VarM3779e6 = fm0.m3779e(arrayList3, dj2VarM3779e5);
/* 61 */                dj2VarM3779e6.m3140a(new C2143rg(1, ej2Var3, 0L));
/* 62 */                fm0.m3795u(2, ej2Var3, 0L, dj2VarM3779e6);
/* 63 */                dj2 dj2VarM3779e7 = fm0.m3779e(arrayList3, dj2VarM3779e6);
/* 65 */                dj2VarM3779e7.m3140a(new C2143rg(1, ej2Var3, 0L));
/* 67 */                dj2VarM3779e7.m3140a(new C2143rg(2, ej2Var3, 0L));
/* 68 */                fm0.m3795u(3, ej2Var2, 0L, dj2VarM3779e7);
/* 69 */                arrayList3.add(dj2VarM3779e7);
/* 70 */                arrayList2.addAll(arrayList3);
/* 71 */                ej2 ej2Var4 = ej2.RECORD;
                        if (i3 == 0 || i3 == 1 || i3 == 3) {
/* 72 */                    ArrayList arrayList4 = new ArrayList();
/* 73 */                    dj2 dj2Var2 = new dj2();
/* 75 */                    dj2Var2.m3140a(new C2143rg(1, ej2Var3, 0L));
/* 76 */                    fm0.m3795u(1, ej2Var4, 0L, dj2Var2);
/* 77 */                    dj2 dj2VarM3779e8 = fm0.m3779e(arrayList4, dj2Var2);
/* 79 */                    dj2VarM3779e8.m3140a(new C2143rg(1, ej2Var3, 0L));
/* 80 */                    fm0.m3795u(2, ej2Var4, 0L, dj2VarM3779e8);
/* 81 */                    dj2 dj2VarM3779e9 = fm0.m3779e(arrayList4, dj2VarM3779e8);
/* 83 */                    dj2VarM3779e9.m3140a(new C2143rg(2, ej2Var3, 0L));
/* 84 */                    fm0.m3795u(2, ej2Var4, 0L, dj2VarM3779e9);
/* 85 */                    dj2 dj2VarM3779e10 = fm0.m3779e(arrayList4, dj2VarM3779e9);
/* 87 */                    dj2VarM3779e10.m3140a(new C2143rg(1, ej2Var3, 0L));
/* 89 */                    dj2VarM3779e10.m3140a(new C2143rg(1, ej2Var4, 0L));
/* 90 */                    fm0.m3795u(3, ej2Var4, 0L, dj2VarM3779e10);
/* 91 */                    dj2 dj2VarM3779e11 = fm0.m3779e(arrayList4, dj2VarM3779e10);
/* 93 */                    dj2VarM3779e11.m3140a(new C2143rg(1, ej2Var3, 0L));
/* 95 */                    dj2VarM3779e11.m3140a(new C2143rg(2, ej2Var4, 0L));
                            i = 3;
/* 96 */                    fm0.m3795u(3, ej2Var4, 0L, dj2VarM3779e11);
/* 97 */                    dj2 dj2VarM3779e12 = fm0.m3779e(arrayList4, dj2VarM3779e11);
/* 99 */                    dj2VarM3779e12.m3140a(new C2143rg(2, ej2Var3, 0L));
/* 101 */                   dj2VarM3779e12.m3140a(new C2143rg(2, ej2Var3, 0L));
/* 102 */                   fm0.m3795u(3, ej2Var2, 0L, dj2VarM3779e12);
/* 103 */                   arrayList4.add(dj2VarM3779e12);
/* 104 */                   arrayList2.addAll(arrayList4);
                        } else {
                            i = 3;
                        }
/* 105 */               ej2 ej2Var5 = ej2.VGA;
                        if (i3 == 1 || i3 == i) {
/* 106 */                   ArrayList arrayList5 = new ArrayList();
/* 107 */                   dj2 dj2Var3 = new dj2();
/* 109 */                   dj2Var3.m3140a(new C2143rg(1, ej2Var3, 0L));
/* 110 */                   fm0.m3795u(1, ej2Var2, 0L, dj2Var3);
/* 111 */                   dj2 dj2VarM3779e13 = fm0.m3779e(arrayList5, dj2Var3);
/* 113 */                   dj2VarM3779e13.m3140a(new C2143rg(1, ej2Var3, 0L));
/* 114 */                   fm0.m3795u(2, ej2Var2, 0L, dj2VarM3779e13);
/* 115 */                   dj2 dj2VarM3779e14 = fm0.m3779e(arrayList5, dj2VarM3779e13);
/* 117 */                   dj2VarM3779e14.m3140a(new C2143rg(2, ej2Var3, 0L));
/* 118 */                   fm0.m3795u(2, ej2Var2, 0L, dj2VarM3779e14);
/* 119 */                   dj2 dj2VarM3779e15 = fm0.m3779e(arrayList5, dj2VarM3779e14);
/* 121 */                   dj2VarM3779e15.m3140a(new C2143rg(1, ej2Var3, 0L));
/* 123 */                   dj2VarM3779e15.m3140a(new C2143rg(1, ej2Var3, 0L));
/* 124 */                   fm0.m3795u(3, ej2Var2, 0L, dj2VarM3779e15);
/* 125 */                   dj2 dj2VarM3779e16 = fm0.m3779e(arrayList5, dj2VarM3779e15);
/* 127 */                   dj2VarM3779e16.m3140a(new C2143rg(2, ej2Var5, 0L));
/* 129 */                   dj2VarM3779e16.m3140a(new C2143rg(1, ej2Var3, 0L));
/* 130 */                   fm0.m3795u(2, ej2Var2, 0L, dj2VarM3779e16);
/* 131 */                   dj2 dj2VarM3779e17 = fm0.m3779e(arrayList5, dj2VarM3779e16);
/* 133 */                   dj2VarM3779e17.m3140a(new C2143rg(2, ej2Var5, 0L));
/* 135 */                   dj2VarM3779e17.m3140a(new C2143rg(2, ej2Var3, 0L));
/* 136 */                   fm0.m3795u(2, ej2Var2, 0L, dj2VarM3779e17);
/* 137 */                   arrayList5.add(dj2VarM3779e17);
/* 138 */                   arrayList2.addAll(arrayList5);
                        }
                        if (z) {
/* 139 */                   ArrayList arrayList6 = new ArrayList();
/* 140 */                   dj2 dj2Var4 = new dj2();
/* 141 */                   fm0.m3795u(5, ej2Var2, 0L, dj2Var4);
/* 142 */                   dj2 dj2VarM3779e18 = fm0.m3779e(arrayList6, dj2Var4);
/* 144 */                   dj2VarM3779e18.m3140a(new C2143rg(1, ej2Var3, 0L));
/* 145 */                   fm0.m3795u(5, ej2Var2, 0L, dj2VarM3779e18);
/* 146 */                   dj2 dj2VarM3779e19 = fm0.m3779e(arrayList6, dj2VarM3779e18);
/* 148 */                   dj2VarM3779e19.m3140a(new C2143rg(2, ej2Var3, 0L));
/* 149 */                   fm0.m3795u(5, ej2Var2, 0L, dj2VarM3779e19);
/* 150 */                   dj2 dj2VarM3779e20 = fm0.m3779e(arrayList6, dj2VarM3779e19);
/* 152 */                   dj2VarM3779e20.m3140a(new C2143rg(1, ej2Var3, 0L));
/* 154 */                   dj2VarM3779e20.m3140a(new C2143rg(1, ej2Var3, 0L));
/* 155 */                   fm0.m3795u(5, ej2Var2, 0L, dj2VarM3779e20);
/* 156 */                   dj2 dj2VarM3779e21 = fm0.m3779e(arrayList6, dj2VarM3779e20);
/* 158 */                   dj2VarM3779e21.m3140a(new C2143rg(1, ej2Var3, 0L));
/* 160 */                   dj2VarM3779e21.m3140a(new C2143rg(2, ej2Var3, 0L));
/* 161 */                   fm0.m3795u(5, ej2Var2, 0L, dj2VarM3779e21);
/* 162 */                   dj2 dj2VarM3779e22 = fm0.m3779e(arrayList6, dj2VarM3779e21);
/* 164 */                   dj2VarM3779e22.m3140a(new C2143rg(2, ej2Var3, 0L));
/* 166 */                   dj2VarM3779e22.m3140a(new C2143rg(2, ej2Var3, 0L));
/* 167 */                   fm0.m3795u(5, ej2Var2, 0L, dj2VarM3779e22);
/* 168 */                   dj2 dj2VarM3779e23 = fm0.m3779e(arrayList6, dj2VarM3779e22);
/* 170 */                   dj2VarM3779e23.m3140a(new C2143rg(1, ej2Var3, 0L));
/* 172 */                   dj2VarM3779e23.m3140a(new C2143rg(3, ej2Var2, 0L));
/* 173 */                   fm0.m3795u(5, ej2Var2, 0L, dj2VarM3779e23);
/* 174 */                   dj2 dj2VarM3779e24 = fm0.m3779e(arrayList6, dj2VarM3779e23);
/* 176 */                   dj2VarM3779e24.m3140a(new C2143rg(2, ej2Var3, 0L));
/* 178 */                   dj2VarM3779e24.m3140a(new C2143rg(3, ej2Var2, 0L));
/* 179 */                   fm0.m3795u(5, ej2Var2, 0L, dj2VarM3779e24);
/* 180 */                   arrayList6.add(dj2VarM3779e24);
/* 181 */                   arrayList2.addAll(arrayList6);
                        }
                        if (z2 && i3 == 0) {
/* 182 */                   ArrayList arrayList7 = new ArrayList();
/* 183 */                   dj2 dj2Var5 = new dj2();
/* 185 */                   dj2Var5.m3140a(new C2143rg(1, ej2Var3, 0L));
/* 186 */                   fm0.m3795u(1, ej2Var2, 0L, dj2Var5);
/* 187 */                   dj2 dj2VarM3779e25 = fm0.m3779e(arrayList7, dj2Var5);
/* 189 */                   dj2VarM3779e25.m3140a(new C2143rg(1, ej2Var3, 0L));
/* 190 */                   fm0.m3795u(2, ej2Var2, 0L, dj2VarM3779e25);
/* 191 */                   dj2 dj2VarM3779e26 = fm0.m3779e(arrayList7, dj2VarM3779e25);
/* 193 */                   dj2VarM3779e26.m3140a(new C2143rg(2, ej2Var3, 0L));
/* 194 */                   fm0.m3795u(2, ej2Var2, 0L, dj2VarM3779e26);
/* 195 */                   arrayList7.add(dj2VarM3779e26);
/* 196 */                   arrayList2.addAll(arrayList7);
                        }
                        if (i3 == 3) {
/* 197 */                   ArrayList arrayList8 = new ArrayList();
/* 198 */                   dj2 dj2Var6 = new dj2();
/* 200 */                   dj2Var6.m3140a(new C2143rg(1, ej2Var3, 0L));
/* 202 */                   dj2Var6.m3140a(new C2143rg(1, ej2Var5, 0L));
/* 204 */                   dj2Var6.m3140a(new C2143rg(2, ej2Var2, 0L));
/* 205 */                   fm0.m3795u(5, ej2Var2, 0L, dj2Var6);
/* 206 */                   dj2 dj2VarM3779e27 = fm0.m3779e(arrayList8, dj2Var6);
/* 208 */                   dj2VarM3779e27.m3140a(new C2143rg(1, ej2Var3, 0L));
/* 210 */                   dj2VarM3779e27.m3140a(new C2143rg(1, ej2Var5, 0L));
/* 212 */                   dj2VarM3779e27.m3140a(new C2143rg(3, ej2Var2, 0L));
/* 213 */                   fm0.m3795u(5, ej2Var2, 0L, dj2VarM3779e27);
/* 214 */                   arrayList8.add(dj2VarM3779e27);
/* 215 */                   arrayList2.addAll(arrayList8);
                        }
/* 216 */               arrayList.addAll(arrayList2);
/* 217 */               gr0 gr0Var = this.f2952l;
                        String str2 = this.f2949i;
/* 218 */               if (((ExtraSupportedSurfaceCombinationsQuirk) gr0Var.f8789a) == null) {
/* 219 */                   listSingletonList = new ArrayList();
                        } else {
/* 220 */                   dj2 dj2Var7 = ExtraSupportedSurfaceCombinationsQuirk.f783a;
/* 221 */                   String str3 = Build.DEVICE;
                            if ("heroqltevzw".equalsIgnoreCase(str3) || "heroqltetmo".equalsIgnoreCase(str3)) {
/* 228 */                       ArrayList arrayList9 = new ArrayList();
                                listSingletonList = arrayList9;
/* 229 */                       if (str2.equals("1")) {
/* 230 */                           arrayList9.add(ExtraSupportedSurfaceCombinationsQuirk.f783a);
                                    listSingletonList = arrayList9;
                                }
                            } else {
/* 227 */                       listSingletonList = ((!"google".equalsIgnoreCase(Build.BRAND) ? false : ExtraSupportedSurfaceCombinationsQuirk.f785c.contains(Build.MODEL.toUpperCase(Locale.US))) || ExtraSupportedSurfaceCombinationsQuirk.m443b()) ? Collections.singletonList(ExtraSupportedSurfaceCombinationsQuirk.f784b) : Collections.EMPTY_LIST;
                            }
                        }
/* 231 */               arrayList.addAll(listSingletonList);
/* 232 */               if (this.f2958r) {
/* 233 */                   ArrayList arrayList10 = this.f2942b;
/* 234 */                   ArrayList arrayList11 = new ArrayList();
/* 235 */                   dj2 dj2Var8 = new dj2();
                            ej2 ej2Var6 = ej2.ULTRA_MAXIMUM;
/* 237 */                   dj2Var8.m3140a(new C2143rg(2, ej2Var6, 0L));
/* 239 */                   dj2Var8.m3140a(new C2143rg(1, ej2Var3, 0L));
/* 240 */                   fm0.m3795u(1, ej2Var4, 0L, dj2Var8);
/* 241 */                   dj2 dj2VarM3779e28 = fm0.m3779e(arrayList11, dj2Var8);
/* 243 */                   dj2VarM3779e28.m3140a(new C2143rg(3, ej2Var6, 0L));
/* 245 */                   dj2VarM3779e28.m3140a(new C2143rg(1, ej2Var3, 0L));
/* 246 */                   fm0.m3795u(1, ej2Var4, 0L, dj2VarM3779e28);
/* 247 */                   dj2 dj2VarM3779e29 = fm0.m3779e(arrayList11, dj2VarM3779e28);
/* 249 */                   dj2VarM3779e29.m3140a(new C2143rg(5, ej2Var6, 0L));
/* 251 */                   dj2VarM3779e29.m3140a(new C2143rg(1, ej2Var3, 0L));
/* 252 */                   fm0.m3795u(1, ej2Var4, 0L, dj2VarM3779e29);
/* 253 */                   dj2 dj2VarM3779e30 = fm0.m3779e(arrayList11, dj2VarM3779e29);
/* 255 */                   dj2VarM3779e30.m3140a(new C2143rg(2, ej2Var6, 0L));
/* 257 */                   dj2VarM3779e30.m3140a(new C2143rg(1, ej2Var3, 0L));
/* 258 */                   fm0.m3795u(3, ej2Var2, 0L, dj2VarM3779e30);
/* 259 */                   dj2 dj2VarM3779e31 = fm0.m3779e(arrayList11, dj2VarM3779e30);
/* 261 */                   dj2VarM3779e31.m3140a(new C2143rg(3, ej2Var6, 0L));
/* 263 */                   dj2VarM3779e31.m3140a(new C2143rg(1, ej2Var3, 0L));
/* 264 */                   fm0.m3795u(3, ej2Var2, 0L, dj2VarM3779e31);
/* 265 */                   dj2 dj2VarM3779e32 = fm0.m3779e(arrayList11, dj2VarM3779e31);
/* 267 */                   dj2VarM3779e32.m3140a(new C2143rg(5, ej2Var6, 0L));
/* 269 */                   dj2VarM3779e32.m3140a(new C2143rg(1, ej2Var3, 0L));
/* 270 */                   fm0.m3795u(3, ej2Var2, 0L, dj2VarM3779e32);
/* 271 */                   dj2 dj2VarM3779e33 = fm0.m3779e(arrayList11, dj2VarM3779e32);
/* 273 */                   dj2VarM3779e33.m3140a(new C2143rg(2, ej2Var6, 0L));
/* 275 */                   dj2VarM3779e33.m3140a(new C2143rg(1, ej2Var3, 0L));
/* 276 */                   fm0.m3795u(2, ej2Var2, 0L, dj2VarM3779e33);
/* 277 */                   dj2 dj2VarM3779e34 = fm0.m3779e(arrayList11, dj2VarM3779e33);
/* 279 */                   dj2VarM3779e34.m3140a(new C2143rg(3, ej2Var6, 0L));
/* 281 */                   dj2VarM3779e34.m3140a(new C2143rg(1, ej2Var3, 0L));
/* 282 */                   fm0.m3795u(2, ej2Var2, 0L, dj2VarM3779e34);
/* 283 */                   dj2 dj2VarM3779e35 = fm0.m3779e(arrayList11, dj2VarM3779e34);
/* 285 */                   dj2VarM3779e35.m3140a(new C2143rg(5, ej2Var6, 0L));
/* 287 */                   dj2VarM3779e35.m3140a(new C2143rg(1, ej2Var3, 0L));
/* 288 */                   fm0.m3795u(2, ej2Var2, 0L, dj2VarM3779e35);
/* 289 */                   dj2 dj2VarM3779e36 = fm0.m3779e(arrayList11, dj2VarM3779e35);
/* 291 */                   dj2VarM3779e36.m3140a(new C2143rg(2, ej2Var6, 0L));
/* 293 */                   dj2VarM3779e36.m3140a(new C2143rg(1, ej2Var3, 0L));
/* 294 */                   fm0.m3795u(5, ej2Var2, 0L, dj2VarM3779e36);
/* 295 */                   dj2 dj2VarM3779e37 = fm0.m3779e(arrayList11, dj2VarM3779e36);
/* 297 */                   dj2VarM3779e37.m3140a(new C2143rg(3, ej2Var6, 0L));
/* 299 */                   dj2VarM3779e37.m3140a(new C2143rg(1, ej2Var3, 0L));
/* 300 */                   fm0.m3795u(5, ej2Var2, 0L, dj2VarM3779e37);
/* 301 */                   dj2 dj2VarM3779e38 = fm0.m3779e(arrayList11, dj2VarM3779e37);
/* 303 */                   dj2VarM3779e38.m3140a(new C2143rg(5, ej2Var6, 0L));
/* 305 */                   dj2VarM3779e38.m3140a(new C2143rg(1, ej2Var3, 0L));
/* 306 */                   fm0.m3795u(5, ej2Var2, 0L, dj2VarM3779e38);
/* 307 */                   arrayList11.add(dj2VarM3779e38);
/* 308 */                   arrayList10.addAll(arrayList11);
                        }
/* 309 */               boolean zHasSystemFeature = context.getPackageManager().hasSystemFeature("android.hardware.camera.concurrent");
                        this.f2956p = zHasSystemFeature;
/* 310 */               ej2 ej2Var7 = ej2.s1440p;
                        if (zHasSystemFeature) {
/* 311 */                   ArrayList arrayList12 = this.f2943c;
/* 312 */                   ArrayList arrayList13 = new ArrayList();
/* 313 */                   dj2 dj2Var9 = new dj2();
/* 314 */                   fm0.m3795u(2, ej2Var7, 0L, dj2Var9);
/* 315 */                   dj2 dj2VarM3779e39 = fm0.m3779e(arrayList13, dj2Var9);
/* 316 */                   fm0.m3795u(1, ej2Var7, 0L, dj2VarM3779e39);
/* 317 */                   dj2 dj2VarM3779e40 = fm0.m3779e(arrayList13, dj2VarM3779e39);
/* 318 */                   fm0.m3795u(3, ej2Var7, 0L, dj2VarM3779e40);
/* 319 */                   dj2 dj2VarM3779e41 = fm0.m3779e(arrayList13, dj2VarM3779e40);
                            ej2 ej2Var8 = ej2.s720p;
/* 321 */                   dj2VarM3779e41.m3140a(new C2143rg(2, ej2Var8, 0L));
/* 322 */                   fm0.m3795u(3, ej2Var7, 0L, dj2VarM3779e41);
/* 323 */                   dj2 dj2VarM3779e42 = fm0.m3779e(arrayList13, dj2VarM3779e41);
/* 325 */                   dj2VarM3779e42.m3140a(new C2143rg(1, ej2Var8, 0L));
/* 326 */                   fm0.m3795u(3, ej2Var7, 0L, dj2VarM3779e42);
/* 327 */                   dj2 dj2VarM3779e43 = fm0.m3779e(arrayList13, dj2VarM3779e42);
/* 329 */                   dj2VarM3779e43.m3140a(new C2143rg(2, ej2Var8, 0L));
/* 330 */                   fm0.m3795u(2, ej2Var7, 0L, dj2VarM3779e43);
/* 331 */                   dj2 dj2VarM3779e44 = fm0.m3779e(arrayList13, dj2VarM3779e43);
/* 333 */                   dj2VarM3779e44.m3140a(new C2143rg(2, ej2Var8, 0L));
/* 334 */                   fm0.m3795u(1, ej2Var7, 0L, dj2VarM3779e44);
/* 335 */                   dj2 dj2VarM3779e45 = fm0.m3779e(arrayList13, dj2VarM3779e44);
/* 337 */                   dj2VarM3779e45.m3140a(new C2143rg(1, ej2Var8, 0L));
/* 338 */                   fm0.m3795u(2, ej2Var7, 0L, dj2VarM3779e45);
/* 339 */                   dj2 dj2VarM3779e46 = fm0.m3779e(arrayList13, dj2VarM3779e45);
/* 341 */                   dj2VarM3779e46.m3140a(new C2143rg(1, ej2Var8, 0L));
/* 342 */                   fm0.m3795u(1, ej2Var7, 0L, dj2VarM3779e46);
/* 343 */                   arrayList13.add(dj2VarM3779e46);
/* 344 */                   arrayList12.addAll(arrayList13);
                        }
/* 346 */               if (this.f2964x.f12643a) {
/* 347 */                   ArrayList arrayList14 = this.f2946f;
/* 348 */                   ArrayList arrayList15 = new ArrayList();
/* 349 */                   dj2 dj2Var10 = new dj2();
/* 350 */                   fm0.m3795u(1, ej2Var2, 0L, dj2Var10);
/* 351 */                   dj2 dj2VarM3779e47 = fm0.m3779e(arrayList15, dj2Var10);
/* 352 */                   fm0.m3795u(2, ej2Var2, 0L, dj2VarM3779e47);
/* 353 */                   dj2 dj2VarM3779e48 = fm0.m3779e(arrayList15, dj2VarM3779e47);
/* 355 */                   dj2VarM3779e48.m3140a(new C2143rg(1, ej2Var3, 0L));
/* 356 */                   fm0.m3795u(3, ej2Var2, 0L, dj2VarM3779e48);
/* 357 */                   dj2 dj2VarM3779e49 = fm0.m3779e(arrayList15, dj2VarM3779e48);
/* 359 */                   dj2VarM3779e49.m3140a(new C2143rg(1, ej2Var3, 0L));
/* 360 */                   fm0.m3795u(2, ej2Var2, 0L, dj2VarM3779e49);
/* 361 */                   dj2 dj2VarM3779e50 = fm0.m3779e(arrayList15, dj2VarM3779e49);
/* 363 */                   dj2VarM3779e50.m3140a(new C2143rg(2, ej2Var3, 0L));
/* 364 */                   fm0.m3795u(2, ej2Var2, 0L, dj2VarM3779e50);
/* 365 */                   dj2 dj2VarM3779e51 = fm0.m3779e(arrayList15, dj2VarM3779e50);
/* 367 */                   dj2VarM3779e51.m3140a(new C2143rg(1, ej2Var3, 0L));
/* 368 */                   fm0.m3795u(1, ej2Var4, 0L, dj2VarM3779e51);
/* 369 */                   dj2 dj2VarM3779e52 = fm0.m3779e(arrayList15, dj2VarM3779e51);
/* 371 */                   dj2VarM3779e52.m3140a(new C2143rg(1, ej2Var3, 0L));
/* 373 */                   dj2VarM3779e52.m3140a(new C2143rg(1, ej2Var4, 0L));
/* 374 */                   fm0.m3795u(2, ej2Var4, 0L, dj2VarM3779e52);
/* 375 */                   dj2 dj2VarM3779e53 = fm0.m3779e(arrayList15, dj2VarM3779e52);
/* 377 */                   dj2VarM3779e53.m3140a(new C2143rg(1, ej2Var3, 0L));
/* 379 */                   dj2VarM3779e53.m3140a(new C2143rg(1, ej2Var4, 0L));
/* 380 */                   fm0.m3795u(3, ej2Var4, 0L, dj2VarM3779e53);
/* 381 */                   arrayList15.add(dj2VarM3779e53);
/* 382 */                   arrayList14.addAll(arrayList15);
                        }
/* 384 */               ts0 ts0Var = (ts0) this.f2951k.m3982b().f177b;
/* 385 */               ts0Var.getClass();
                        try {
/* 386 */                   outputFormats = ((StreamConfigurationMap) ts0Var.f17248a).getOutputFormats();
                        } catch (IllegalArgumentException | NullPointerException e) {
/* 387 */                   hu0.m4317I0("StreamConfigurationMapCompatBaseImpl", "Failed to get output formats from StreamConfigurationMap", e);
                            outputFormats = null;
                        }
/* 388 */               int[] iArr3 = outputFormats != null ? (int[]) outputFormats.clone() : null;
                        if (iArr3 != null) {
                            for (int i4 : iArr3) {
                                if (i4 == 4101) {
/* 390 */                           ArrayList arrayList16 = this.f2947g;
/* 391 */                           ArrayList arrayList17 = new ArrayList();
/* 392 */                           dj2 dj2Var11 = new dj2();
/* 393 */                           fm0.m3795u(4, ej2Var2, 0L, dj2Var11);
/* 394 */                           dj2 dj2VarM3779e54 = fm0.m3779e(arrayList17, dj2Var11);
/* 396 */                           dj2VarM3779e54.m3140a(new C2143rg(1, ej2Var3, 0L));
/* 397 */                           fm0.m3795u(4, ej2Var2, 0L, dj2VarM3779e54);
/* 398 */                           arrayList17.add(dj2VarM3779e54);
/* 399 */                           arrayList16.addAll(arrayList17);
                                    break;
                                }
                            }
                        }
/* 400 */               C0962gp c0962gp = this.f2951k;
                        C1888lf c1888lf = nh2.f14269a;
/* 401 */               int i5 = Build.VERSION.SDK_INT;
/* 403 */               boolean z3 = (i5 < 33 || (jArr = (long[]) c0962gp.m3981a(CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES)) == null || jArr.length == 0) ? false : true;
/* 404 */               this.f2957q = z3;
                        if (!z3 || i5 < 33) {
                            ej2Var = ej2Var2;
                        } else {
/* 405 */                   ArrayList arrayList18 = this.f2948h;
/* 406 */                   ArrayList arrayList19 = new ArrayList();
/* 407 */                   dj2 dj2Var12 = new dj2();
/* 408 */                   fm0.m3795u(1, ej2Var7, 4L, dj2Var12);
/* 409 */                   dj2 dj2VarM3779e55 = fm0.m3779e(arrayList19, dj2Var12);
/* 410 */                   fm0.m3795u(2, ej2Var7, 4L, dj2VarM3779e55);
/* 411 */                   dj2 dj2VarM3779e56 = fm0.m3779e(arrayList19, dj2VarM3779e55);
/* 412 */                   fm0.m3795u(1, ej2Var4, 3L, dj2VarM3779e56);
/* 413 */                   dj2 dj2VarM3779e57 = fm0.m3779e(arrayList19, dj2VarM3779e56);
/* 414 */                   fm0.m3795u(2, ej2Var4, 3L, dj2VarM3779e57);
/* 415 */                   dj2 dj2VarM3779e58 = fm0.m3779e(arrayList19, dj2VarM3779e57);
/* 416 */                   fm0.m3795u(3, ej2Var2, 2L, dj2VarM3779e58);
/* 417 */                   dj2 dj2VarM3779e59 = fm0.m3779e(arrayList19, dj2VarM3779e58);
/* 418 */                   fm0.m3795u(2, ej2Var2, 2L, dj2VarM3779e59);
/* 419 */                   dj2 dj2VarM3779e60 = fm0.m3779e(arrayList19, dj2VarM3779e59);
/* 421 */                   dj2VarM3779e60.m3140a(new C2143rg(1, ej2Var3, 1L));
/* 422 */                   fm0.m3795u(3, ej2Var2, 2L, dj2VarM3779e60);
/* 423 */                   dj2 dj2VarM3779e61 = fm0.m3779e(arrayList19, dj2VarM3779e60);
/* 425 */                   dj2VarM3779e61.m3140a(new C2143rg(1, ej2Var3, 1L));
/* 426 */                   fm0.m3795u(2, ej2Var2, 2L, dj2VarM3779e61);
/* 427 */                   dj2 dj2VarM3779e62 = fm0.m3779e(arrayList19, dj2VarM3779e61);
/* 429 */                   dj2VarM3779e62.m3140a(new C2143rg(1, ej2Var3, 1L));
/* 430 */                   fm0.m3795u(1, ej2Var4, 3L, dj2VarM3779e62);
/* 431 */                   dj2 dj2VarM3779e63 = fm0.m3779e(arrayList19, dj2VarM3779e62);
/* 433 */                   dj2VarM3779e63.m3140a(new C2143rg(1, ej2Var3, 1L));
/* 434 */                   fm0.m3795u(2, ej2Var4, 3L, dj2VarM3779e63);
/* 435 */                   dj2 dj2VarM3779e64 = fm0.m3779e(arrayList19, dj2VarM3779e63);
/* 437 */                   dj2VarM3779e64.m3140a(new C2143rg(1, ej2Var3, 1L));
/* 438 */                   fm0.m3795u(2, ej2Var3, 1L, dj2VarM3779e64);
/* 439 */                   dj2 dj2VarM3779e65 = fm0.m3779e(arrayList19, dj2VarM3779e64);
/* 441 */                   dj2VarM3779e65.m3140a(new C2143rg(1, ej2Var3, 1L));
/* 443 */                   dj2VarM3779e65.m3140a(new C2143rg(1, ej2Var4, 3L));
/* 444 */                   fm0.m3795u(3, ej2Var4, 2L, dj2VarM3779e65);
/* 445 */                   dj2 dj2VarM3779e66 = fm0.m3779e(arrayList19, dj2VarM3779e65);
/* 447 */                   dj2VarM3779e66.m3140a(new C2143rg(1, ej2Var3, 1L));
/* 449 */                   dj2VarM3779e66.m3140a(new C2143rg(2, ej2Var4, 3L));
/* 450 */                   fm0.m3795u(3, ej2Var4, 2L, dj2VarM3779e66);
/* 451 */                   dj2 dj2VarM3779e67 = fm0.m3779e(arrayList19, dj2VarM3779e66);
/* 453 */                   dj2VarM3779e67.m3140a(new C2143rg(1, ej2Var3, 1L));
/* 455 */                   dj2VarM3779e67.m3140a(new C2143rg(2, ej2Var3, 1L));
                            ej2Var = ej2Var2;
/* 456 */                   fm0.m3795u(3, ej2Var, 2L, dj2VarM3779e67);
/* 457 */                   arrayList19.add(dj2VarM3779e67);
/* 458 */                   arrayList18.addAll(arrayList19);
                        }
/* 459 */               C0962gp c0962gp2 = this.f2951k;
/* 461 */               if (i5 >= 33 && (iArr = (int[]) c0962gp2.m3981a(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES)) != null && iArr.length != 0) {
                            for (int i6 : iArr) {
                                if (i6 == 2) {
/* 463 */                           if (Build.VERSION.SDK_INT < 33) {
                                        break;
                                    }
/* 464 */                           ArrayList arrayList20 = this.f2944d;
/* 465 */                           ArrayList arrayList21 = new ArrayList();
/* 466 */                           dj2 dj2Var13 = new dj2();
/* 467 */                           fm0.m3795u(1, ej2Var7, 0L, dj2Var13);
/* 468 */                           dj2 dj2VarM3779e68 = fm0.m3779e(arrayList21, dj2Var13);
/* 469 */                           fm0.m3795u(2, ej2Var7, 0L, dj2VarM3779e68);
/* 470 */                           dj2 dj2VarM3779e69 = fm0.m3779e(arrayList21, dj2VarM3779e68);
/* 472 */                           dj2VarM3779e69.m3140a(new C2143rg(1, ej2Var7, 0L));
/* 473 */                           fm0.m3795u(3, ej2Var, 0L, dj2VarM3779e69);
/* 474 */                           dj2 dj2VarM3779e70 = fm0.m3779e(arrayList21, dj2VarM3779e69);
/* 476 */                           dj2VarM3779e70.m3140a(new C2143rg(2, ej2Var7, 0L));
/* 477 */                           fm0.m3795u(3, ej2Var, 0L, dj2VarM3779e70);
/* 478 */                           dj2 dj2VarM3779e71 = fm0.m3779e(arrayList21, dj2VarM3779e70);
/* 480 */                           dj2VarM3779e71.m3140a(new C2143rg(1, ej2Var7, 0L));
/* 481 */                           fm0.m3795u(2, ej2Var, 0L, dj2VarM3779e71);
/* 482 */                           dj2 dj2VarM3779e72 = fm0.m3779e(arrayList21, dj2VarM3779e71);
/* 484 */                           dj2VarM3779e72.m3140a(new C2143rg(2, ej2Var7, 0L));
/* 485 */                           fm0.m3795u(2, ej2Var, 0L, dj2VarM3779e72);
/* 486 */                           dj2 dj2VarM3779e73 = fm0.m3779e(arrayList21, dj2VarM3779e72);
/* 488 */                           dj2VarM3779e73.m3140a(new C2143rg(1, ej2Var3, 0L));
/* 489 */                           fm0.m3795u(1, ej2Var7, 0L, dj2VarM3779e73);
/* 490 */                           dj2 dj2VarM3779e74 = fm0.m3779e(arrayList21, dj2VarM3779e73);
/* 492 */                           dj2VarM3779e74.m3140a(new C2143rg(2, ej2Var3, 0L));
/* 493 */                           fm0.m3795u(1, ej2Var7, 0L, dj2VarM3779e74);
/* 494 */                           dj2 dj2VarM3779e75 = fm0.m3779e(arrayList21, dj2VarM3779e74);
/* 496 */                           dj2VarM3779e75.m3140a(new C2143rg(1, ej2Var3, 0L));
/* 497 */                           fm0.m3795u(2, ej2Var7, 0L, dj2VarM3779e75);
/* 498 */                           dj2 dj2VarM3779e76 = fm0.m3779e(arrayList21, dj2VarM3779e75);
/* 500 */                           dj2VarM3779e76.m3140a(new C2143rg(2, ej2Var3, 0L));
/* 501 */                           fm0.m3795u(2, ej2Var7, 0L, dj2VarM3779e76);
/* 502 */                           arrayList21.add(dj2VarM3779e76);
/* 503 */                           arrayList20.addAll(arrayList21);
                                    break;
                                }
                            }
                        }
/* 504 */               m1703b();
                    } catch (C1897lo e2) {
/* 507 */               throw new C1936mq(e2);
                    }
                }

                /* JADX INFO: renamed from: c */
                public static Size m1699c(StreamConfigurationMap streamConfigurationMap, int i, boolean z) {
                    Size[] highResolutionOutputSizes;
/* 12 */            Size[] outputSizes = i == 34 ? streamConfigurationMap.getOutputSizes(SurfaceTexture.class) : streamConfigurationMap.getOutputSizes(i);
/* 16 */            if (outputSizes == null || outputSizes.length == 0) {
/* 77 */                return null;
                    }
/* 25 */            C1007hx c1007hx = new C1007hx(false);
/* 36 */            Size size = (Size) Collections.max(Arrays.asList(outputSizes), c1007hx);
/* 38 */            Size size2 = ue2.f17489a;
/* 40 */            if (z && (highResolutionOutputSizes = streamConfigurationMap.getHighResolutionOutputSizes(i)) != null && highResolutionOutputSizes.length > 0) {
/* 60 */                size2 = (Size) Collections.max(Arrays.asList(highResolutionOutputSizes), c1007hx);
                    }
/* 74 */            return (Size) Collections.max(Arrays.asList(size, size2), c1007hx);
                }

                /* JADX INFO: renamed from: e */
                public static int m1700e(Range range, Range range2) {
/* 30 */            de3.m3028j("Ranges must not intersect", (range.contains((Integer) range2.getUpper()) || range.contains((Integer) range2.getLower())) ? false : true);
                    return ((Integer) range.getLower()).intValue() > ((Integer) range2.getUpper()).intValue() ? ((Integer) range.getLower()).intValue() - ((Integer) range2.getUpper()).intValue() : ((Integer) range2.getLower()).intValue() - ((Integer) range.getUpper()).intValue();
                }

                /* JADX INFO: renamed from: f */
                public static int m1701f(Range range) {
/* 22 */            return (((Integer) range.getUpper()).intValue() - ((Integer) range.getLower()).intValue()) + 1;
                }

                /* JADX INFO: renamed from: a */
                public final boolean m1702a(C2106qg c2106qg, List list) {
                    List list2;
/* 1 */             HashMap map = this.f2945e;
/* 8 */             if (map.containsKey(c2106qg)) {
/* 14 */                list2 = (List) map.get(c2106qg);
                    } else {
/* 19 */                ArrayList arrayList = new ArrayList();
/* 22 */                boolean z = c2106qg.f15527d;
/* 24 */                int i = c2106qg.f15524a;
/* 26 */                if (!z) {
/* 36 */                    int i2 = c2106qg.f15525b;
/* 40 */                    if (i2 == 8) {
/* 42 */                        if (i != 1) {
/* 45 */                            ArrayList arrayList2 = this.f2941a;
/* 47 */                            if (i != 2) {
/* 51 */                                if (c2106qg.f15526c) {
/* 53 */                                    arrayList2 = this.f2944d;
                                        }
/* 55 */                                arrayList.addAll(arrayList2);
                                    } else {
/* 61 */                                arrayList.addAll(this.f2942b);
/* 64 */                                arrayList.addAll(arrayList2);
                                    }
                                } else {
/* 68 */                            list2 = this.f2943c;
                                }
/* 83 */                        map.put(c2106qg, list2);
                            } else if (i2 == 10 && i == 0) {
/* 79 */                        arrayList.addAll(this.f2946f);
                            }
                        } else if (i == 0) {
/* 32 */                    arrayList.addAll(this.f2947g);
                        }
/* 82 */                list2 = arrayList;
/* 83 */                map.put(c2106qg, list2);
                    }
/* 86 */            Iterator it = list2.iterator();
/* 91 */            boolean z2 = false;
/* 96 */            while (it.hasNext()) {
/* 112 */               z2 = ((dj2) it.next()).m3141c(list) != null;
/* 113 */               if (z2) {
                            break;
                        }
                    }
/* 115 */           return z2;
                }

                /* JADX INFO: renamed from: b */
                public final void m1703b() {
                    Size size;
                    Size size2;
                    Size size3;
/* 3 */             Size sizeM1550e = this.f2961u.m1550e();
                    try {
/* 10 */                int i = Integer.parseInt(this.f2949i);
/* 14 */                dc0 dc0Var = this.f2950j;
/* 20 */                CamcorderProfile camcorderProfileM2992g = null;
/* 28 */                CamcorderProfile camcorderProfileM2992g2 = dc0Var.m2994j(i, 1) ? dc0Var.m2992g(i, 1) : null;
/* 29 */                if (camcorderProfileM2992g2 == null) {
/* 43 */                    Size size4 = ue2.f17491c;
/* 51 */                    if (dc0Var.m2994j(i, 10)) {
/* 53 */                        camcorderProfileM2992g = dc0Var.m2992g(i, 10);
                            } else if (dc0Var.m2994j(i, 8)) {
/* 66 */                        camcorderProfileM2992g = dc0Var.m2992g(i, 8);
                            } else if (dc0Var.m2994j(i, 12)) {
/* 79 */                        camcorderProfileM2992g = dc0Var.m2992g(i, 12);
                            } else if (dc0Var.m2994j(i, 6)) {
/* 91 */                        camcorderProfileM2992g = dc0Var.m2992g(i, 6);
                            } else if (dc0Var.m2994j(i, 5)) {
/* 103 */                       camcorderProfileM2992g = dc0Var.m2992g(i, 5);
                            } else if (dc0Var.m2994j(i, 4)) {
/* 115 */                       camcorderProfileM2992g = dc0Var.m2992g(i, 4);
                            }
/* 119 */                   if (camcorderProfileM2992g != null) {
/* 127 */                       size2 = new Size(camcorderProfileM2992g.videoFrameWidth, camcorderProfileM2992g.videoFrameHeight);
                            } else {
/* 131 */                       size3 = size4;
                            }
/* 231 */                   this.f2959s = new C2330wg(ue2.f17490b, new HashMap(), sizeM1550e, new HashMap(), size3, new HashMap(), new HashMap());
                        }
/* 37 */                size2 = new Size(camcorderProfileM2992g2.videoFrameWidth, camcorderProfileM2992g2.videoFrameHeight);
                    } catch (NumberFormatException unused) {
/* 149 */               Size[] outputSizes = ((StreamConfigurationMap) ((ts0) this.f2951k.m3982b().f177b).f17248a).getOutputSizes(MediaRecorder.class);
/* 153 */               if (outputSizes == null) {
/* 155 */                   size = ue2.f17491c;
                        } else {
/* 164 */                   Arrays.sort(outputSizes, new C1007hx(true));
/* 167 */                   int length = outputSizes.length;
/* 168 */                   int i2 = 0;
                            while (true) {
/* 169 */                       if (i2 < length) {
/* 171 */                           Size size5 = outputSizes[i2];
/* 173 */                           int width = size5.getWidth();
/* 177 */                           Size size6 = ue2.f17493e;
/* 183 */                           if (width <= size6.getWidth() && size5.getHeight() <= size6.getHeight()) {
/* 195 */                               size2 = size5;
                                        break;
                                    }
/* 198 */                           i2++;
                                } else {
/* 201 */                           size = ue2.f17491c;
                                }
                            }
                        }
/* 157 */               size2 = size;
                        break;
                    }
/* 40 */            size3 = size2;
/* 231 */           this.f2959s = new C2330wg(ue2.f17490b, new HashMap(), sizeM1550e, new HashMap(), size3, new HashMap(), new HashMap());
                }

                /* JADX INFO: renamed from: d */
                public final List m1704d(C2106qg c2106qg, List list) {
/* 1 */             C1888lf c1888lf = nh2.f14269a;
/* 5 */             if (c2106qg.f15524a != 0 || c2106qg.f15525b != 8) {
/* 38 */                return null;
                    }
/* 15 */            Iterator it = this.f2948h.iterator();
/* 23 */            while (it.hasNext()) {
/* 31 */                List listM3141c = ((dj2) it.next()).m3141c(list);
/* 35 */                if (listM3141c != null) {
/* 37 */                    return listM3141c;
                        }
                    }
/* 38 */            return null;
                }

                /* JADX WARN: Code duplicated, block: B:420:0x09fa  */
                /* JADX WARN: Code duplicated, block: B:421:0x09fc  */
                /* JADX WARN: Code duplicated, block: B:487:0x0b4a  */
                /* JADX WARN: Code duplicated, block: B:573:0x0cf1  */
                /* JADX WARN: Code duplicated, block: B:575:0x0d05  */
                /* JADX WARN: Code duplicated, block: B:577:0x0d17  */
                /* JADX WARN: Code duplicated, block: B:579:0x0d1d  */
                /* JADX WARN: Code duplicated, block: B:581:0x0d21  */
                /* JADX WARN: Code duplicated, block: B:583:0x0d25  */
                /* JADX WARN: Code duplicated, block: B:585:0x0d29  */
                /* JADX WARN: Code duplicated, block: B:594:0x0d51  */
                /* JADX WARN: Code duplicated, block: B:596:0x0d5d  */
                /* JADX WARN: Code duplicated, block: B:598:0x0d75  */
                /* JADX WARN: Code duplicated, block: B:654:0x01b9 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:739:0x0d4a A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:740:0x0d46 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:741:0x0d42 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:742:0x0d8a A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:746:0x0d82 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:83:0x0240  */
                /* JADX WARN: Code duplicated, block: B:86:0x024a  */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r12v12, types: [java.util.List] */
                /* JADX WARN: Type inference failed for: r12v41 */
                /* JADX WARN: Type inference failed for: r12v42 */
                /* JADX WARN: Type inference failed for: r15v12 */
                /* JADX WARN: Type inference failed for: r15v13 */
                /* JADX WARN: Type inference failed for: r15v14, types: [android.util.Range] */
                /* JADX WARN: Type inference failed for: r15v15 */
                /* JADX WARN: Type inference failed for: r15v16, types: [android.util.Range] */
                /* JADX WARN: Type inference failed for: r15v17, types: [android.util.Range] */
                /* JADX WARN: Type inference failed for: r15v18 */
                /* JADX WARN: Type inference failed for: r15v19 */
                /* JADX WARN: Type inference failed for: r15v20 */
                /* JADX WARN: Type inference failed for: r15v21, types: [android.util.Range] */
                /* JADX WARN: Type inference failed for: r15v22 */
                /* JADX WARN: Type inference failed for: r15v23 */
                /* JADX WARN: Type inference failed for: r15v37 */
                /* JADX WARN: Type inference failed for: r15v38 */
                /* JADX WARN: Type inference failed for: r15v8 */
                /* JADX WARN: Type inference failed for: r15v9 */
                /* JADX WARN: Type inference failed for: r1v13, types: [java.util.List] */
                /* JADX WARN: Type inference failed for: r1v28 */
                /* JADX WARN: Type inference failed for: r1v75 */
                /* JADX WARN: Type inference failed for: r21v10 */
                /* JADX WARN: Type inference failed for: r21v6 */
                /* JADX WARN: Type inference failed for: r21v7 */
                /* JADX WARN: Type inference failed for: r21v8 */
                /* JADX WARN: Type inference failed for: r21v9, types: [android.util.Range] */
                /* JADX WARN: Type inference failed for: r26v3 */
                /* JADX WARN: Type inference failed for: r26v4, types: [android.util.Range] */
                /* JADX WARN: Type inference failed for: r26v5 */
                /* JADX WARN: Type inference failed for: r33v0, types: [cj2] */
                /* JADX WARN: Type inference failed for: r6v14, types: [java.util.List] */
                /* JADX WARN: Type inference failed for: r6v21 */
                /* JADX WARN: Type inference failed for: r6v23 */
                /* JADX WARN: Type inference failed for: r7v15 */
                /* JADX WARN: Type inference failed for: r7v16 */
                /* JADX WARN: Type inference failed for: r7v17 */
                /* JADX WARN: Type inference failed for: r7v67 */
                /* JADX WARN: Type inference failed for: r7v68 */
                /* JADX INFO: renamed from: g */
                public final Pair m1705g(int i, ArrayList arrayList, HashMap map, boolean z, boolean z2) {
                    boolean z3;
                    int i2;
                    String str;
                    boolean z4;
                    int i3;
                    HashMap map2;
                    HashMap map3;
                    ArrayList arrayList2;
                    Pair pair;
                    ArrayList arrayList3;
                    Object obj;
                    ArrayList arrayList4;
                    HashMap map4;
                    HashMap map5;
                    String str2;
                    ArrayList<zy2> arrayList5;
                    HashMap map6;
                    int i4;
                    int i5;
                    Object obj2;
                    String str3;
                    Object obj3;
                    ?? r12;
                    ?? r6;
                    ?? r1;
                    ?? r15;
                    HashMap map7;
                    int i6;
                    int i7;
                    HashMap map8;
                    int i8;
                    long j;
                    HashMap map9;
                    HashMap map10;
                    zy2 zy2Var;
                    C2069pg c2069pg;
                    C0998ho c0998hoM6979a;
                    C0017af c0017af;
                    C0998ho c0998hoM6979a2;
                    Size size;
                    Range range;
                    mb0 mb0Var;
                    Range range2;
                    Range[] rangeArr;
                    Range[] rangeArr2;
                    int i9;
                    ?? r7;
                    ?? r21;
                    Object obj4;
                    List list;
                    Object obj5;
                    long[] jArr;
                    int outputMinFrameDuration;
                    Rational rational;
                    Size sizeM441b;
                    boolean z5;
                    String str4;
                    int outputMinFrameDuration2;
                    mb0 mb0Var2;
                    Iterator it;
                    ArrayList arrayList6;
                    mb0 mb0VarM6005i;
                    Iterator it2;
                    mb0 mb0VarM7129a;
                    Iterator it3;
                    HashMap map11 = map;
/* 1 */             mb0 mb0Var3 = mb0.f13670c;
/* 3 */             c90 c90Var = this.f2961u;
/* 5 */             c90Var.f2773b = c90Var.m1548a();
/* 6 */             if (this.f2959s == null) {
/* 7 */                 m1703b();
                    } else {
/* 8 */                 Size sizeM1550e = this.f2961u.m1550e();
/* 9 */                 C2330wg c2330wg = this.f2959s;
/* 17 */                this.f2959s = new C2330wg(c2330wg.f18608a, c2330wg.f18609b, sizeM1550e, c2330wg.f18611d, c2330wg.f18612e, c2330wg.f18613f, c2330wg.f18614g);
                    }
/* 18 */            ArrayList<zy2> arrayList7 = new ArrayList(map11.keySet());
/* 20 */            ArrayList arrayList8 = new ArrayList();
/* 21 */            ArrayList arrayList9 = new ArrayList();
/* 22 */            Iterator it4 = arrayList7.iterator();
                    while (it4.hasNext()) {
/* 2 */                 Integer num = (Integer) ((zy2) it4.next()).mo7023b(zy2.f20388K, 0);
                        num.getClass();
/* 24 */                if (!arrayList9.contains(num)) {
/* 25 */                    arrayList9.add(num);
                        }
                    }
/* 26 */            Collections.sort(arrayList9);
/* 27 */            Collections.reverse(arrayList9);
/* 28 */            Iterator it5 = arrayList9.iterator();
                    while (it5.hasNext()) {
                        int iIntValue = ((Integer) it5.next()).intValue();
                        for (zy2 zy2Var2 : arrayList7) {
/* 2 */                     if (iIntValue == ((Integer) zy2Var2.mo7023b(zy2.f20388K, 0)).intValue()) {
/* 31 */                        arrayList8.add(Integer.valueOf(arrayList7.indexOf(zy2Var2)));
                            }
                        }
                    }
/* 32 */            C1822k8 c1822k8 = this.f2964x;
/* 33 */            qc3 qc3Var = (qc3) c1822k8.f12645c;
/* 34 */            LinkedHashSet linkedHashSet = new LinkedHashSet();
/* 35 */            Iterator it6 = arrayList.iterator();
                    while (it6.hasNext()) {
/* 37 */                linkedHashSet.add(((C0017af) it6.next()).f220d);
                    }
/* 39 */            Set setMo7381b = ((pb0) qc3Var.f15492b).mo7381b();
/* 40 */            HashSet hashSet = new HashSet(setMo7381b);
/* 41 */            Iterator it7 = linkedHashSet.iterator();
                    while (it7.hasNext()) {
/* 42 */                C1822k8.m6007m(hashSet, (mb0) it7.next(), qc3Var);
                    }
/* 43 */            ArrayList arrayList10 = new ArrayList();
/* 44 */            ArrayList arrayList11 = new ArrayList();
/* 45 */            ArrayList arrayList12 = new ArrayList();
/* 46 */            Iterator it8 = arrayList8.iterator();
                    while (it8.hasNext()) {
/* 47 */                zy2 zy2Var3 = (zy2) arrayList7.get(((Integer) it8.next()).intValue());
                        ArrayList arrayList13 = arrayList8;
/* 48 */                mb0 mb0Var4 = (mb0) zy2Var3.mo7023b(hw0.f9339p, mb0Var3);
/* 49 */                mb0Var4.getClass();
/* 50 */                if (mb0Var4.equals(mb0Var3)) {
/* 51 */                    arrayList12.add(zy2Var3);
                            it3 = it8;
                        } else {
                            it3 = it8;
/* 52 */                    int i10 = mb0Var4.f13677a;
                            int i11 = mb0Var4.f13678b;
                            if (i10 == 2 || ((i10 != 0 && i11 == 0) || (i10 == 0 && i11 != 0))) {
/* 54 */                        arrayList11.add(zy2Var3);
                            } else {
/* 53 */                        arrayList10.add(zy2Var3);
                            }
                        }
                        arrayList8 = arrayList13;
                        it8 = it3;
                    }
                    ArrayList arrayList14 = arrayList8;
/* 55 */            HashMap map12 = new HashMap();
/* 56 */            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
/* 57 */            ArrayList arrayList15 = new ArrayList();
/* 58 */            arrayList15.addAll(arrayList10);
/* 59 */            arrayList15.addAll(arrayList11);
/* 60 */            arrayList15.addAll(arrayList12);
/* 61 */            Iterator it9 = arrayList15.iterator();
                    while (true) {
                        Object obj6 = null;
                        if (!it9.hasNext()) {
                            ArrayList arrayList16 = arrayList7;
/* 104 */                   Iterator it10 = arrayList.iterator();
                            while (true) {
                                if (!it10.hasNext()) {
/* 106 */                           Iterator it11 = map11.keySet().iterator();
                                    while (true) {
                                        if (!it11.hasNext()) {
                                            z3 = false;
                                            break;
                                        }
/* 107 */                               if (((zy2) it11.next()).mo1175l() == 4101) {
                                        }
                                    }
                                } else if (((C0017af) it10.next()).f218b == 4101) {
                                }
                                z3 = true;
                                break;
                            }
/* 108 */                   String str5 = this.f2949i;
/* 109 */                   Iterator it12 = map12.values().iterator();
                            while (true) {
                                if (!it12.hasNext()) {
                                    i2 = 8;
                                    break;
                                }
/* 110 */                       if (((mb0) it12.next()).f13678b == 10) {
                                    i2 = 10;
                                    break;
                                }
                            }
                            if (i != 0 && z3) {
/* 114 */                       throw new IllegalArgumentException(fm0.m3785k("Camera device id is ", str5, ". Ultra HDR is not currently supported in ", i != 1 ? i != 2 ? "DEFAULT" : "ULTRA_HIGH_RESOLUTION_CAMERA" : "CONCURRENT_CAMERA", " camera mode."));
                            }
                            if (i != 0 && i2 == 10) {
/* 117 */                       throw new IllegalArgumentException(fm0.m3785k("Camera device id is ", str5, ". 10 bit dynamic range is not currently supported in ", i != 1 ? i != 2 ? "DEFAULT" : "ULTRA_HIGH_RESOLUTION_CAMERA" : "CONCURRENT_CAMERA", " camera mode."));
                            }
/* 118 */                   C2106qg c2106qg = new C2106qg(i, i2, z, z3);
/* 119 */                   ArrayList arrayList17 = new ArrayList();
/* 120 */                   Iterator it13 = arrayList.iterator();
                            while (it13.hasNext()) {
/* 122 */                       arrayList17.add(((C0017af) it13.next()).f217a);
                            }
/* 124 */                   C1007hx c1007hx = new C1007hx(false);
                            for (zy2 zy2Var4 : map11.keySet()) {
/* 126 */                       List list2 = (List) map11.get(zy2Var4);
/* 127 */                       de3.m3023e("No available output size is found for " + zy2Var4 + ".", (list2 == null || list2.isEmpty()) ? false : true);
/* 128 */                       Size size2 = (Size) Collections.min(list2, c1007hx);
/* 129 */                       int iMo1175l = zy2Var4.mo1175l();
/* 133 */                       arrayList17.add(C2143rg.m8156b(c2106qg.f15524a, iMo1175l, size2, m1707i(iMo1175l)));
                            }
/* 135 */                   String str6 = ".  May be attempting to bind too many use cases. Existing surfaces: ";
                            String str7 = " New configs: ";
/* 134 */                   boolean zM1702a = m1702a(c2106qg, arrayList17);
                            String str8 = "No supported surface combination is found for camera device - Id : ";
                            if (!zM1702a) {
/* 135 */                       s80.m8427h("No supported surface combination is found for camera device - Id : ", this.f2949i, ".  May be attempting to bind too many use cases. Existing surfaces: ", arrayList, " New configs: ", arrayList16);
                                return null;
                            }
/* 136 */                   Iterator it14 = arrayList.iterator();
                            Range rangeIntersect = null;
                            while (it14.hasNext()) {
/* 137 */                       Range range3 = ((C0017af) it14.next()).f223g;
                                if (rangeIntersect == null) {
                                    rangeIntersect = range3;
                                } else if (range3 != null) {
                                    try {
/* 138 */                               rangeIntersect = rangeIntersect.intersect(range3);
                                    } catch (IllegalArgumentException unused) {
                                    }
                                }
                            }
/* 139 */                   Iterator it15 = arrayList14.iterator();
                            Range range4 = rangeIntersect;
                            while (it15.hasNext()) {
                                ArrayList arrayList18 = arrayList16;
/* 141 */                       Range rangeIntersect2 = (Range) ((zy2) arrayList18.get(((Integer) it15.next()).intValue())).mo7023b(zy2.f20389L, obj6);
                                if (range4 == null) {
                                    range4 = rangeIntersect2;
                                } else if (rangeIntersect2 != null) {
                                    try {
/* 142 */                               rangeIntersect2 = range4.intersect(rangeIntersect2);
                                        range4 = rangeIntersect2;
                                    } catch (IllegalArgumentException unused2) {
                                    }
                                }
                                arrayList16 = arrayList18;
                                obj6 = null;
                                range4 = range4;
                            }
                            ArrayList arrayList19 = arrayList16;
/* 143 */                   HashMap map13 = new HashMap();
/* 144 */                   Iterator it16 = map11.keySet().iterator();
                            while (true) {
                                str = str8;
                                if (!it16.hasNext()) {
                                    break;
                                }
                                zy2 zy2Var5 = (zy2) it16.next();
/* 145 */                       ArrayList arrayList20 = new ArrayList();
/* 146 */                       HashMap map14 = new HashMap();
                                for (Size size3 : (List) map11.get(zy2Var5)) {
/* 148 */                           int iMo1175l2 = zy2Var5.mo1175l();
                                    Iterator it17 = it16;
/* 152 */                           ej2 ej2Var = C2143rg.m8156b(c2106qg.f15524a, iMo1175l2, size3, m1707i(iMo1175l2)).f16042b;
                                    if (range4 != null) {
                                        z5 = zM1702a;
                                        try {
                                            str4 = str6;
                                            try {
/* 156 */                                       outputMinFrameDuration2 = (int) (1.0E9d / ((StreamConfigurationMap) this.f2951k.m3981a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getOutputMinFrameDuration(iMo1175l2, size3));
                                            } catch (Exception unused3) {
                                                outputMinFrameDuration2 = 0;
                                            }
                                        } catch (Exception unused4) {
                                            str4 = str6;
                                        }
                                    } else {
                                        z5 = zM1702a;
                                        str4 = str6;
                                        outputMinFrameDuration2 = AbstractC0208c9.API_PRIORITY_OTHER;
                                    }
/* 157 */                           Set hashSet2 = (Set) map14.get(ej2Var);
                                    if (hashSet2 == null) {
/* 158 */                               hashSet2 = new HashSet();
/* 159 */                               map14.put(ej2Var, hashSet2);
                                    }
/* 160 */                           if (!hashSet2.contains(Integer.valueOf(outputMinFrameDuration2))) {
/* 161 */                               arrayList20.add(size3);
/* 162 */                               hashSet2.add(Integer.valueOf(outputMinFrameDuration2));
                                    }
                                    it16 = it17;
                                    zM1702a = z5;
                                    str6 = str4;
                                }
/* 163 */                       map13.put(zy2Var5, arrayList20);
                                map11 = map;
                                str8 = str;
                            }
                            boolean z6 = zM1702a;
                            String str9 = str6;
/* 164 */                   ArrayList arrayList21 = new ArrayList();
/* 165 */                   Iterator it18 = arrayList14.iterator();
                            while (it18.hasNext()) {
/* 166 */                       zy2 zy2Var6 = (zy2) arrayList19.get(((Integer) it18.next()).intValue());
/* 167 */                       List<Size> list3 = (List) map13.get(zy2Var6);
/* 168 */                       int iMo1175l3 = zy2Var6.mo1175l();
/* 169 */                       p62 p62Var = this.f2962v;
                                C0962gp c0962gp = this.f2951k;
                                p62Var.getClass();
/* 172 */                       if (((Nexus4AndroidLTargetAspectRatioQuirk) f80.f8038a.m3582h(Nexus4AndroidLTargetAspectRatioQuirk.class)) == null && ((AspectRatioLegacyApi21Quirk) de3.m3031m(c0962gp).m3582h(AspectRatioLegacyApi21Quirk.class)) == null) {
                                    rational = null;
                                } else {
/* 177 */                           Size size4 = (Size) m1707i(NotificationCompat.FLAG_LOCAL_ONLY).f18613f.get(Integer.valueOf(NotificationCompat.FLAG_LOCAL_ONLY));
/* 178 */                           rational = new Rational(size4.getWidth(), size4.getHeight());
                                }
                                if (rational != null) {
/* 179 */                           ArrayList arrayList22 = new ArrayList();
/* 180 */                           ArrayList arrayList23 = new ArrayList();
                                    for (Size size5 : list3) {
/* 182 */                               if (AbstractC2177sd.m8480a(rational, size5)) {
/* 183 */                                   arrayList22.add(size5);
                                        } else {
/* 184 */                                   arrayList23.add(size5);
                                        }
                                    }
/* 185 */                           arrayList23.addAll(0, arrayList22);
                                    list3 = arrayList23;
                                }
/* 186 */                       md1 md1Var = this.f2963w;
/* 187 */                       int iM8155a = C2143rg.m8155a(iMo1175l3);
/* 188 */                       if (md1Var.f13702a != null && (sizeM441b = ExtraCroppingQuirk.m441b(iM8155a)) != null) {
/* 190 */                           ArrayList arrayList24 = new ArrayList();
/* 191 */                           arrayList24.add(sizeM441b);
                                    for (Size size6 : list3) {
/* 193 */                               if (!size6.equals(sizeM441b)) {
/* 194 */                                   arrayList24.add(size6);
                                        }
                                    }
                                    list3 = arrayList24;
                                }
/* 195 */                       arrayList21.add(list3);
                            }
/* 196 */                   Iterator it19 = arrayList21.iterator();
                            int size7 = 1;
                            while (it19.hasNext()) {
/* 197 */                       size7 *= ((List) it19.next()).size();
                            }
                            if (size7 == 0) {
/* 413 */                       C1951n4.m6859j("Failed to find supported resolutions.");
                                return null;
                            }
/* 198 */                   ArrayList arrayList25 = new ArrayList();
                            for (int i12 = 0; i12 < size7; i12++) {
/* 200 */                       arrayList25.add(new ArrayList());
                            }
/* 201 */                   int size8 = size7 / ((List) arrayList21.get(0)).size();
                            int i13 = size7;
/* 202 */                   for (int i14 = 0; i14 < arrayList21.size(); i14++) {
/* 203 */                       List list4 = (List) arrayList21.get(i14);
                                for (int i15 = 0; i15 < size7; i15++) {
/* 207 */                           ((List) arrayList25.get(i15)).add((Size) list4.get((i15 % i13) / size8));
                                }
/* 208 */                       if (i14 < arrayList21.size() - 1) {
                                    i13 = size8;
/* 209 */                           size8 /= ((List) arrayList21.get(i14 + 1)).size();
                                }
                            }
/* 210 */                   HashMap map15 = new HashMap();
/* 211 */                   HashMap map16 = new HashMap();
/* 212 */                   HashMap map17 = new HashMap();
/* 213 */                   HashMap map18 = new HashMap();
/* 214 */                   C1888lf c1888lf = nh2.f14269a;
/* 215 */                   Iterator it20 = arrayList.iterator();
                            while (true) {
                                if (!it20.hasNext()) {
/* 220 */                           Iterator it21 = arrayList19.iterator();
                                    while (true) {
                                        if (!it21.hasNext()) {
                                            z4 = false;
                                            break;
                                        }
                                        zy2 zy2Var7 = (zy2) it21.next();
/* 221 */                               if (nh2.m6981c(zy2Var7, zy2Var7.mo7453t())) {
                                        }
                                    }
                                } else {
                                    C0017af c0017af2 = (C0017af) it20.next();
/* 219 */                           if (nh2.m6981c(c0017af2.f222f, (bz2) c0017af2.f221e.get(0))) {
                                    }
                                }
                                z4 = true;
                                break;
                            }
/* 222 */                   Iterator it22 = arrayList.iterator();
                            int iMin = AbstractC0208c9.API_PRIORITY_OTHER;
                            while (it22.hasNext()) {
                                C0017af c0017af3 = (C0017af) it22.next();
                                boolean z7 = z4;
                                Iterator it23 = it22;
                                try {
/* 228 */                           outputMinFrameDuration = (int) (1.0E9d / ((StreamConfigurationMap) this.f2951k.m3981a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getOutputMinFrameDuration(c0017af3.f218b, c0017af3.f219c));
                                } catch (Exception unused5) {
                                    outputMinFrameDuration = 0;
                                }
/* 229 */                       iMin = Math.min(iMin, outputMinFrameDuration);
                                z4 = z7;
                                it22 = it23;
                            }
                            boolean z8 = z4;
/* 230 */                   if (!this.f2957q || z8) {
                                i3 = iMin;
                                map2 = map17;
                                map3 = map18;
                                arrayList2 = arrayList14;
                                pair = null;
                                arrayList3 = arrayList19;
                                obj = null;
                            } else {
/* 231 */                       Iterator it24 = arrayList25.iterator();
                                Object obj7 = null;
                                loop25: while (true) {
                                    if (!it24.hasNext()) {
                                        i3 = iMin;
                                        map2 = map17;
                                        map3 = map18;
                                        arrayList2 = arrayList14;
                                        pair = null;
                                        arrayList3 = arrayList19;
                                        obj4 = obj7;
                                        break;
                                    }
                                    ArrayList arrayList26 = arrayList19;
                                    ArrayList arrayList27 = arrayList14;
/* 232 */                           Pair pairM1706h = m1706h(i, arrayList, (List) it24.next(), arrayList26, arrayList27, iMin, map17, map18);
                                    arrayList3 = arrayList26;
                                    HashMap map19 = map17;
                                    map3 = map18;
/* 233 */                           List listM1704d = m1704d(c2106qg, (List) pairM1706h.first);
                                    if (listM1704d != null) {
/* 234 */                               bz2 bz2Var = bz2.f2643e;
                                        int i16 = 0;
                                        while (true) {
                                            if (i16 < listM1704d.size()) {
                                                arrayList2 = arrayList27;
                                                i3 = iMin;
/* 236 */                                       long j2 = ((C2143rg) listM1704d.get(i16)).f16043c;
/* 237 */                                       if (map19.containsKey(Integer.valueOf(i16))) {
/* 239 */                                           List list5 = ((C0017af) map19.get(Integer.valueOf(i16))).f221e;
                                                    map2 = map19;
/* 242 */                                           if (nh2.m6980b(list5.size() == 1 ? (bz2) list5.get(0) : bz2Var, j2, list5)) {
                                                        i16++;
                                                        arrayList27 = arrayList2;
                                                        iMin = i3;
                                                        map19 = map2;
                                                        listM1704d = listM1704d;
                                                    } else {
                                                        list = null;
                                                        pair = null;
                                                    }
                                                } else {
                                                    map2 = map19;
/* 243 */                                           if (!map3.containsKey(Integer.valueOf(i16))) {
/* 251 */                                               C1951n4.m6856g("SurfaceConfig does not map to any use case");
                                                        return null;
                                                    }
/* 244 */                                           zy2 zy2Var8 = (zy2) map3.get(Integer.valueOf(i16));
/* 250 */                                           if (nh2.m6980b(zy2Var8.mo7453t(), j2, zy2Var8.mo7453t() == bz2Var ? (List) ((mh2) zy2Var8).mo7025e(mh2.f13782b) : Collections.EMPTY_LIST)) {
                                                        i16++;
                                                        arrayList27 = arrayList2;
                                                        iMin = i3;
                                                        map19 = map2;
                                                        listM1704d = listM1704d;
                                                    } else {
                                                        list = null;
                                                        pair = null;
                                                    }
                                                }
                                            } else {
                                                map2 = map19;
                                                arrayList2 = arrayList27;
                                                i3 = iMin;
                                                pair = null;
                                                list = listM1704d;
                                            }
                                        }
                                    } else {
                                        map2 = map19;
                                        arrayList2 = arrayList27;
                                        i3 = iMin;
                                        pair = null;
                                        list = listM1704d;
                                    }
                                    if (list != null) {
/* 252 */                               C0962gp c0962gp2 = this.f2951k;
/* 253 */                               if (Build.VERSION.SDK_INT >= 33 && (jArr = (long[]) c0962gp2.m3981a(CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES)) != null && jArr.length != 0) {
/* 256 */                                   HashSet hashSet3 = new HashSet();
                                            for (long j3 : jArr) {
/* 258 */                                       hashSet3.add(Long.valueOf(j3));
                                            }
/* 259 */                                   Iterator it25 = list.iterator();
/* 261 */                                   do {
                                                if (!it25.hasNext()) {
                                                    obj4 = list;
                                                    break loop25;
                                                }
/* 261 */                                   } while (hashSet3.contains(Long.valueOf(((C2143rg) it25.next()).f16043c)));
                                        }
                                        obj5 = pair;
                                    } else {
                                        obj5 = list;
                                    }
/* 262 */                           map2.clear();
/* 263 */                           map3.clear();
                                    map18 = map3;
                                    arrayList19 = arrayList3;
                                    iMin = i3;
                                    map17 = map2;
                                    arrayList14 = arrayList2;
                                    obj7 = obj5;
                                }
                                if (obj4 == null && !z6) {
/* 264 */                           s80.m8427h(str, this.f2949i, str9, arrayList, " New configs: ", arrayList3);
                                    return pair;
                                }
                                obj = obj4;
                            }
/* 265 */                   Iterator it26 = arrayList25.iterator();
                            Object obj8 = pair;
                            Object obj9 = obj8;
                            int iIntValue2 = AbstractC0208c9.API_PRIORITY_OTHER;
                            int i17 = AbstractC0208c9.API_PRIORITY_OTHER;
                            boolean z9 = false;
                            boolean z10 = false;
                            Object obj10 = obj;
                            while (true) {
                                if (it26.hasNext()) {
                                    List list6 = (List) it26.next();
                                    map4 = map3;
                                    str2 = str7;
                                    arrayList5 = arrayList3;
                                    int i18 = i3;
                                    map6 = map2;
                                    i4 = 0;
                                    i5 = 1;
                                    int i19 = iIntValue2;
                                    str3 = str;
                                    int i20 = i17;
                                    arrayList4 = arrayList2;
                                    map5 = map15;
                                    Object obj11 = obj10;
/* 266 */                           Pair pairM1706h2 = m1706h(i, arrayList, list6, arrayList5, arrayList4, i18, null, null);
/* 267 */                           List list7 = (List) pairM1706h2.first;
/* 268 */                           iIntValue2 = ((Integer) pairM1706h2.second).intValue();
/* 269 */                           boolean z11 = range4 == null || i18 <= iIntValue2 || iIntValue2 >= ((Integer) range4.getLower()).intValue();
/* 270 */                           if (!z9 && m1702a(c2106qg, list7)) {
                                        if (i19 == Integer.MAX_VALUE || i19 < iIntValue2) {
                                            i19 = iIntValue2;
                                            obj8 = list6;
                                        }
                                        if (z11) {
                                            if (z10) {
                                                obj3 = list6;
                                                i17 = i20;
                                                obj2 = obj11;
                                            } else {
                                                i19 = iIntValue2;
                                                obj8 = list6;
                                                z9 = true;
                                            }
                                        }
                                    }
/* 271 */                           if (obj11 != null && !z10 && m1704d(c2106qg, list7) != null) {
                                        if (i20 == Integer.MAX_VALUE || i20 < iIntValue2) {
                                            i20 = iIntValue2;
                                            obj9 = list6;
                                        }
                                        if (z11) {
                                            if (z9) {
                                                r6 = list6;
                                                r1 = obj8;
                                                i17 = iIntValue2;
                                                iIntValue2 = i19;
                                                r12 = obj11;
                                                break;
                                            }
                                            obj9 = list6;
                                            z10 = true;
                                            i17 = iIntValue2;
                                        }
                                        i3 = i18;
                                        obj10 = obj11;
                                        iIntValue2 = i19;
                                        str = str3;
                                        map2 = map6;
                                        map15 = map5;
                                        str7 = str2;
                                        arrayList3 = arrayList5;
                                        arrayList2 = arrayList4;
                                        map3 = map4;
                                    }
                                    i17 = i20;
                                    i3 = i18;
                                    obj10 = obj11;
                                    iIntValue2 = i19;
                                    str = str3;
                                    map2 = map6;
                                    map15 = map5;
                                    str7 = str2;
                                    arrayList3 = arrayList5;
                                    arrayList2 = arrayList4;
                                    map3 = map4;
                                } else {
                                    arrayList4 = arrayList2;
                                    map4 = map3;
                                    map5 = map15;
                                    str2 = str7;
                                    arrayList5 = arrayList3;
                                    map6 = map2;
                                    i4 = 0;
                                    i5 = 1;
                                    obj2 = obj10;
                                    str3 = str;
                                    obj3 = obj8;
                                }
                                r6 = obj9;
                                r1 = obj3;
                                r12 = obj2;
                                break;
                            }
                            if (r1 == 0) {
/* 412 */                       throw new IllegalArgumentException(str3 + this.f2949i + " and Hardware level: " + this.f2953m + ". May be the specified resolution is too large and not supported. Existing surfaces: " + arrayList + str2 + arrayList5);
                            }
                            if (range4 != null) {
/* 272 */                       Range range5 = C2069pg.f15101f;
                                if (range4.equals(range5) || (rangeArr = (Range[]) this.f2951k.m3981a(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES)) == null) {
                                    r15 = range5;
                                    break;
                                }
/* 275 */                       Range range6 = new Range(Integer.valueOf(Math.min(((Integer) range4.getLower()).intValue(), iIntValue2)), Integer.valueOf(Math.min(((Integer) range4.getUpper()).intValue(), iIntValue2)));
/* 278 */                       int length = rangeArr.length;
                                r15 = range5;
                                int i21 = i4;
                                int iM1701f = i21;
                                while (true) {
                                    if (i21 >= length) {
                                        rangeArr2 = rangeArr;
                                        break;
                                    }
                                    int i22 = i21;
                                    range5 = rangeArr2[i22];
                                    Range[] rangeArr3 = rangeArr2;
/* 279 */                           if (iIntValue2 >= ((Integer) range5.getLower()).intValue()) {
/* 280 */                               if (r15.equals(C2069pg.f15101f)) {
                                            rangeArr2 = rangeArr;
                                            r15 = r15;
                                            r15 = range5;
                                        }
                                        rangeArr2 = rangeArr;
                                        r15 = r15;
/* 281 */                               if (range5.equals(range6)) {
                                            r15 = range5;
                                            break;
                                        }
                                        try {
/* 283 */                                   int iM1701f2 = m1701f(range5.intersect(range6));
                                            if (iM1701f == 0) {
                                                iM1701f = iM1701f2;
                                                r7 = range5;
                                            } else if (iM1701f2 >= iM1701f) {
                                                try {
                                                    i9 = iM1701f;
                                                    r21 = r15;
/* 284 */                                           double dM1701f = m1701f(r15.intersect(range6));
                                                    try {
/* 285 */                                               double dM1701f2 = m1701f(range5.intersect(range6));
/* 286 */                                               double dM1701f3 = dM1701f2 / ((double) m1701f(range5));
/* 287 */                                               double dM1701f4 = dM1701f / ((double) m1701f(r21));
                                                        if (dM1701f2 > dM1701f) {
                                                            if (dM1701f3 >= 0.5d || dM1701f3 >= dM1701f4) {
                                                                r15 = range5;
                                                            } else {
                                                                r15 = r21;
                                                            }
                                                        } else if (dM1701f2 == dM1701f) {
/* 288 */                                                   if (dM1701f3 <= dM1701f4 && (dM1701f3 != dM1701f4 || ((Integer) range5.getLower()).intValue() <= ((Integer) r21.getLower()).intValue())) {
                                                                r15 = r21;
                                                            } else {
                                                                r15 = range5;
                                                            }
                                                        } else if (dM1701f4 >= 0.5d || dM1701f3 <= dM1701f4) {
                                                            r15 = r21;
                                                        } else {
                                                            r15 = range5;
                                                        }
                                                        try {
/* 289 */                                                   iM1701f = m1701f(range6.intersect(r15));
                                                            r7 = r15;
                                                        } catch (IllegalArgumentException unused6) {
/* 291 */                                                   if (i9 == 0 || (m1700e(range5, range6) >= m1700e(r15, range6) && (m1700e(range5, range6) != m1700e(r15, range6) || (((Integer) range5.getLower()).intValue() <= ((Integer) r15.getUpper()).intValue() && m1701f(range5) >= m1701f(r15))))) {
                                                                iM1701f = i9;
                                                            } else {
                                                                iM1701f = i9;
                                                                r7 = range5;
                                                            }
                                                            i21 = i22 + 1;
                                                            rangeArr2 = rangeArr3;
                                                            r15 = r15;
                                                        }
                                                    } catch (IllegalArgumentException unused7) {
                                                        r15 = r21;
                                                        if (i9 == 0) {
                                                        }
                                                        iM1701f = i9;
                                                        i21 = i22 + 1;
                                                        rangeArr2 = rangeArr3;
                                                        r15 = r15;
                                                    }
                                                } catch (IllegalArgumentException unused8) {
                                                    i9 = iM1701f;
                                                    r21 = r15;
                                                }
                                            } else {
                                                r7 = r15;
                                            }
                                        } catch (IllegalArgumentException unused9) {
                                            i9 = iM1701f;
                                        }
                                        r15 = r7;
                                    } else {
                                        rangeArr2 = rangeArr;
                                    }
                                    i21 = i22 + 1;
                                    rangeArr2 = rangeArr3;
                                    r15 = r15;
                                }
                            } else {
                                r15 = pair;
                            }
                            for (zy2 zy2Var9 : arrayList5) {
/* 298 */                       Size size9 = (Size) r1.get(arrayList4.indexOf(Integer.valueOf(arrayList5.indexOf(zy2Var9))));
/* 299 */                       Range range7 = C2069pg.f15101f;
                                if (size9 == null) {
/* 322 */                           C1951n4.m6868s("Null resolution");
                                    return pair;
                                }
/* 300 */                       Range range8 = C2069pg.f15101f;
                                if (range8 == null) {
/* 321 */                           C1951n4.m6868s("Null expectedFrameRateRange");
                                    return pair;
                                }
/* 301 */                       mb0 mb0Var5 = (mb0) map12.get(zy2Var9);
/* 302 */                       mb0Var5.getClass();
/* 303 */                       uk1 uk1VarM9034j = uk1.m9034j();
/* 304 */                       C1888lf c1888lf2 = C0998ho.f9166v;
                                if (zy2Var9.mo7028h(c1888lf2)) {
/* 306 */                           uk1VarM9034j.m9037p(c1888lf2, (Long) zy2Var9.mo7025e(c1888lf2));
                                }
/* 307 */                       C1888lf c1888lf3 = zy2.f20390M;
                                if (zy2Var9.mo7028h(c1888lf3)) {
/* 309 */                           uk1VarM9034j.m9037p(c1888lf3, (Boolean) zy2Var9.mo7025e(c1888lf3));
                                }
/* 310 */                       C1888lf c1888lf4 = aw0.f2117b;
                                if (zy2Var9.mo7028h(c1888lf4)) {
/* 312 */                           uk1VarM9034j.m9037p(c1888lf4, (Integer) zy2Var9.mo7025e(c1888lf4));
                                }
/* 313 */                       C1888lf c1888lf5 = hw0.f9338o;
                                if (zy2Var9.mo7028h(c1888lf5)) {
/* 315 */                           uk1VarM9034j.m9037p(c1888lf5, (Integer) zy2Var9.mo7025e(c1888lf5));
                                }
/* 320 */                       map16.put(zy2Var9, new C2069pg(size9, mb0Var5, r15 != 0 ? r15 : range8, new C0998ho(uk1VarM9034j), z2));
                                arrayList4 = arrayList4;
                            }
/* 323 */                   if (r12 == 0 || iIntValue2 != i17 || r1.size() != r6.size()) {
                                map7 = map5;
                                break;
                            }
                            int i23 = i4;
                            while (true) {
/* 324 */                       if (i23 >= r1.size()) {
/* 326 */                           C0962gp c0962gp3 = this.f2951k;
/* 327 */                           if (Build.VERSION.SDK_INT >= 33) {
/* 328 */                               ArrayList<zy2> arrayList28 = new ArrayList(map16.keySet());
/* 329 */                               Iterator it27 = arrayList.iterator();
                                        while (it27.hasNext()) {
/* 331 */                                   ((C0017af) it27.next()).f222f.getClass();
                                        }
/* 332 */                               Iterator it28 = arrayList28.iterator();
                                        while (it28.hasNext()) {
/* 333 */                                   C2069pg c2069pg2 = (C2069pg) map16.get((zy2) it28.next());
/* 334 */                                   c2069pg2.getClass();
/* 336 */                                   c2069pg2.f15105d.getClass();
                                        }
/* 1 */                                 long[] jArr2 = (long[]) c0962gp3.m3981a(CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES);
/* 338 */                               if (jArr2 != null && jArr2.length != 0) {
/* 339 */                                   HashSet hashSet4 = new HashSet();
/* 340 */                                   int length2 = jArr2.length;
                                            for (int i24 = i4; i24 < length2; i24++) {
/* 341 */                                       hashSet4.add(Long.valueOf(jArr2[i24]));
                                            }
/* 342 */                                   HashSet hashSet5 = new HashSet();
/* 343 */                                   Iterator it29 = arrayList.iterator();
                                            if (it29.hasNext()) {
                                                C0017af c0017af4 = (C0017af) it29.next();
/* 344 */                                       InterfaceC2235ty interfaceC2235ty = c0017af4.f222f;
/* 345 */                                       C1888lf c1888lf6 = C0998ho.f9166v;
                                                if (interfaceC2235ty.mo7028h(c1888lf6) && ((Long) c0017af4.f222f.mo7025e(c1888lf6)).longValue() != 0) {
                                                    i6 = i4;
                                                    i7 = i5;
                                                } else {
                                                    i7 = i4;
                                                    i6 = i5;
                                                }
                                            } else {
                                                i6 = i4;
                                                i7 = i6;
                                            }
                                            int i25 = i7;
                                            int i26 = i6;
                                            int i27 = i25;
                                            for (zy2 zy2Var10 : arrayList28) {
/* 349 */                                       C1888lf c1888lf7 = C0998ho.f9166v;
                                                if (zy2Var10.mo7028h(c1888lf7)) {
/* 351 */                                           Long l = (Long) zy2Var10.mo7025e(c1888lf7);
                                                    if (l.longValue() != 0) {
                                                        if (i26 != 0) {
/* 354 */                                                   C1951n4.m6859j("Either all use cases must have non-default stream use case assigned or none should have it");
                                                            return pair;
                                                        }
/* 353 */                                               hashSet5.add(l);
                                                        i27 = i5;
                                                    } else if (i27 != 0) {
/* 352 */                                               C1951n4.m6859j("Either all use cases must have non-default stream use case assigned or none should have it");
                                                        return pair;
                                                    }
                                                } else if (i27 != 0) {
/* 350 */                                           C1951n4.m6859j("Either all use cases must have non-default stream use case assigned or none should have it");
                                                    return pair;
                                                }
                                                i26 = i5;
                                            }
                                            if (i26 != 0) {
                                                map7 = map5;
                                                i8 = i4;
/* 383 */                                       while (i8 < r12.size()) {
/* 385 */                                           j = ((C2143rg) r12.get(i8)).f16043c;
                                                    map9 = map6;
/* 386 */                                           if (map9.containsKey(Integer.valueOf(i8))) {
/* 387 */                                               c0017af = (C0017af) map9.get(Integer.valueOf(i8));
/* 389 */                                               c0998hoM6979a2 = nh2.m6979a(c0017af.f222f, j);
                                                        if (c0998hoM6979a2 != null) {
/* 390 */                                                   size = c0017af.f219c;
/* 391 */                                                   Range range9 = C2069pg.f15101f;
                                                            if (size != null) {
/* 400 */                                                       C1951n4.m6868s("Null resolution");
                                                                return pair;
                                                            }
/* 392 */                                                   range = C2069pg.f15101f;
                                                            if (range != null) {
/* 399 */                                                       C1951n4.m6868s("Null expectedFrameRateRange");
                                                                return pair;
                                                            }
/* 393 */                                                   mb0Var = c0017af.f220d;
                                                            if (mb0Var != null) {
/* 398 */                                                       C1951n4.m6868s("Null dynamicRange");
                                                                return pair;
                                                            }
/* 394 */                                                   range2 = c0017af.f223g;
                                                            if (range2 != null) {
                                                                range = range2;
                                                            }
/* 397 */                                                   map7.put(c0017af, new C2069pg(size, mb0Var, range, c0998hoM6979a2, false));
                                                        }
                                                        map10 = map4;
                                                    } else {
                                                        map10 = map4;
/* 401 */                                               if (map10.containsKey(Integer.valueOf(i8))) {
/* 410 */                                                   C1951n4.m6856g("SurfaceConfig does not map to any use case");
                                                            return pair;
                                                        }
/* 402 */                                               zy2Var = (zy2) map10.get(Integer.valueOf(i8));
/* 403 */                                               c2069pg = (C2069pg) map16.get(zy2Var);
/* 405 */                                               c0998hoM6979a = nh2.m6979a(c2069pg.f15105d, j);
                                                        if (c0998hoM6979a != null) {
/* 406 */                                                   C0168b5 c0168b5M7414a = c2069pg.m7414a();
/* 407 */                                                   c0168b5M7414a.f2214e = c0998hoM6979a;
/* 409 */                                                   map16.put(zy2Var, c0168b5M7414a.m1266k());
                                                        }
                                                    }
                                                    i8++;
                                                    map6 = map9;
                                                    map4 = map10;
                                                }
                                                break;
                                                break;
                                            }
/* 355 */                                   Iterator it30 = hashSet5.iterator();
/* 356 */                                   do {
                                                if (!it30.hasNext()) {
/* 357 */                                           Iterator it31 = arrayList.iterator();
                                                    while (it31.hasNext()) {
                                                        C0017af c0017af5 = (C0017af) it31.next();
/* 358 */                                               InterfaceC2235ty interfaceC2235ty2 = c0017af5.f222f;
/* 361 */                                               C0998ho c0998hoM6979a3 = nh2.m6979a(interfaceC2235ty2, ((Long) interfaceC2235ty2.mo7025e(C0998ho.f9166v)).longValue());
                                                        if (c0998hoM6979a3 != null) {
/* 362 */                                                   Size size10 = c0017af5.f219c;
/* 363 */                                                   Range range10 = C2069pg.f15101f;
                                                            if (size10 == null) {
/* 372 */                                                       C1951n4.m6868s("Null resolution");
                                                                return pair;
                                                            }
/* 364 */                                                   Range range11 = C2069pg.f15101f;
                                                            if (range11 == null) {
/* 371 */                                                       C1951n4.m6868s("Null expectedFrameRateRange");
                                                                return pair;
                                                            }
/* 365 */                                                   mb0 mb0Var6 = c0017af5.f220d;
                                                            if (mb0Var6 == null) {
/* 370 */                                                       C1951n4.m6868s("Null dynamicRange");
                                                                return pair;
                                                            }
/* 366 */                                                   Range range12 = c0017af5.f223g;
                                                            Range range13 = range12 != null ? range12 : range11;
                                                            map8 = map5;
/* 369 */                                                   map8.put(c0017af5, new C2069pg(size10, mb0Var6, range13, c0998hoM6979a3, false));
                                                        } else {
                                                            map8 = map5;
                                                        }
                                                        map5 = map8;
                                                    }
                                                    map7 = map5;
                                                    for (zy2 zy2Var11 : arrayList28) {
/* 374 */                                               C2069pg c2069pg3 = (C2069pg) map16.get(zy2Var11);
/* 375 */                                               InterfaceC2235ty interfaceC2235ty3 = c2069pg3.f15105d;
/* 378 */                                               C0998ho c0998hoM6979a4 = nh2.m6979a(interfaceC2235ty3, ((Long) interfaceC2235ty3.mo7025e(C0998ho.f9166v)).longValue());
                                                        if (c0998hoM6979a4 != null) {
/* 379 */                                                   C0168b5 c0168b5M7414a2 = c2069pg3.m7414a();
/* 380 */                                                   c0168b5M7414a2.f2214e = c0998hoM6979a4;
/* 382 */                                                   map16.put(zy2Var11, c0168b5M7414a2.m1266k());
                                                        }
                                                    }
                                                    break;
                                                }
/* 356 */                                   } while (hashSet4.contains((Long) it30.next()));
                                            map7 = map5;
                                            i8 = i4;
/* 383 */                                   while (i8 < r12.size()) {
/* 385 */                                       j = ((C2143rg) r12.get(i8)).f16043c;
                                                map9 = map6;
/* 386 */                                       if (map9.containsKey(Integer.valueOf(i8))) {
/* 387 */                                           c0017af = (C0017af) map9.get(Integer.valueOf(i8));
/* 389 */                                           c0998hoM6979a2 = nh2.m6979a(c0017af.f222f, j);
                                                    if (c0998hoM6979a2 != null) {
/* 390 */                                               size = c0017af.f219c;
/* 391 */                                               Range range14 = C2069pg.f15101f;
                                                        if (size != null) {
/* 400 */                                                   C1951n4.m6868s("Null resolution");
                                                            return pair;
                                                        }
/* 392 */                                               range = C2069pg.f15101f;
                                                        if (range != null) {
/* 399 */                                                   C1951n4.m6868s("Null expectedFrameRateRange");
                                                            return pair;
                                                        }
/* 393 */                                               mb0Var = c0017af.f220d;
                                                        if (mb0Var != null) {
/* 398 */                                                   C1951n4.m6868s("Null dynamicRange");
                                                            return pair;
                                                        }
/* 394 */                                               range2 = c0017af.f223g;
                                                        if (range2 != null) {
                                                            range = range2;
                                                        }
/* 397 */                                               map7.put(c0017af, new C2069pg(size, mb0Var, range, c0998hoM6979a2, false));
                                                    }
                                                    map10 = map4;
                                                } else {
                                                    map10 = map4;
/* 401 */                                           if (map10.containsKey(Integer.valueOf(i8))) {
/* 410 */                                               C1951n4.m6856g("SurfaceConfig does not map to any use case");
                                                        return pair;
                                                    }
/* 402 */                                           zy2Var = (zy2) map10.get(Integer.valueOf(i8));
/* 403 */                                           c2069pg = (C2069pg) map16.get(zy2Var);
/* 405 */                                           c0998hoM6979a = nh2.m6979a(c2069pg.f15105d, j);
                                                    if (c0998hoM6979a != null) {
/* 406 */                                               C0168b5 c0168b5M7414a3 = c2069pg.m7414a();
/* 407 */                                               c0168b5M7414a3.f2214e = c0998hoM6979a;
/* 409 */                                               map16.put(zy2Var, c0168b5M7414a3.m1266k());
                                                    }
                                                }
                                                i8++;
                                                map6 = map9;
                                                map4 = map10;
                                            }
                                            break;
                                            break;
                                        }
                                        map7 = map5;
                                        i8 = i4;
/* 383 */                               while (i8 < r12.size()) {
/* 385 */                                   j = ((C2143rg) r12.get(i8)).f16043c;
                                            map9 = map6;
/* 386 */                                   if (map9.containsKey(Integer.valueOf(i8))) {
/* 387 */                                       c0017af = (C0017af) map9.get(Integer.valueOf(i8));
/* 389 */                                       c0998hoM6979a2 = nh2.m6979a(c0017af.f222f, j);
                                                if (c0998hoM6979a2 != null) {
/* 390 */                                           size = c0017af.f219c;
/* 391 */                                           Range range15 = C2069pg.f15101f;
                                                    if (size != null) {
/* 400 */                                               C1951n4.m6868s("Null resolution");
                                                        return pair;
                                                    }
/* 392 */                                           range = C2069pg.f15101f;
                                                    if (range != null) {
/* 399 */                                               C1951n4.m6868s("Null expectedFrameRateRange");
                                                        return pair;
                                                    }
/* 393 */                                           mb0Var = c0017af.f220d;
                                                    if (mb0Var != null) {
/* 398 */                                               C1951n4.m6868s("Null dynamicRange");
                                                        return pair;
                                                    }
/* 394 */                                           range2 = c0017af.f223g;
                                                    if (range2 != null) {
                                                        range = range2;
                                                    }
/* 397 */                                           map7.put(c0017af, new C2069pg(size, mb0Var, range, c0998hoM6979a2, false));
                                                }
                                                map10 = map4;
                                            } else {
                                                map10 = map4;
/* 401 */                                       if (map10.containsKey(Integer.valueOf(i8))) {
/* 410 */                                           C1951n4.m6856g("SurfaceConfig does not map to any use case");
                                                    return pair;
                                                }
/* 402 */                                       zy2Var = (zy2) map10.get(Integer.valueOf(i8));
/* 403 */                                       c2069pg = (C2069pg) map16.get(zy2Var);
/* 405 */                                       c0998hoM6979a = nh2.m6979a(c2069pg.f15105d, j);
                                                if (c0998hoM6979a != null) {
/* 406 */                                           C0168b5 c0168b5M7414a4 = c2069pg.m7414a();
/* 407 */                                           c0168b5M7414a4.f2214e = c0998hoM6979a;
/* 409 */                                           map16.put(zy2Var, c0168b5M7414a4.m1266k());
                                                }
                                            }
                                            i8++;
                                            map6 = map9;
                                            map4 = map10;
                                        }
                                        break;
                                        break;
                                    }
                                    map7 = map5;
                                    i8 = i4;
/* 383 */                           while (i8 < r12.size()) {
/* 385 */                               j = ((C2143rg) r12.get(i8)).f16043c;
                                        map9 = map6;
/* 386 */                               if (map9.containsKey(Integer.valueOf(i8))) {
/* 387 */                                   c0017af = (C0017af) map9.get(Integer.valueOf(i8));
/* 389 */                                   c0998hoM6979a2 = nh2.m6979a(c0017af.f222f, j);
                                            if (c0998hoM6979a2 != null) {
/* 390 */                                       size = c0017af.f219c;
/* 391 */                                       Range range16 = C2069pg.f15101f;
                                                if (size != null) {
/* 400 */                                           C1951n4.m6868s("Null resolution");
                                                    return pair;
                                                }
/* 392 */                                       range = C2069pg.f15101f;
                                                if (range != null) {
/* 399 */                                           C1951n4.m6868s("Null expectedFrameRateRange");
                                                    return pair;
                                                }
/* 393 */                                       mb0Var = c0017af.f220d;
                                                if (mb0Var != null) {
/* 398 */                                           C1951n4.m6868s("Null dynamicRange");
                                                    return pair;
                                                }
/* 394 */                                       range2 = c0017af.f223g;
                                                if (range2 != null) {
                                                    range = range2;
                                                }
/* 397 */                                       map7.put(c0017af, new C2069pg(size, mb0Var, range, c0998hoM6979a2, false));
                                            }
                                            map10 = map4;
                                        } else {
                                            map10 = map4;
/* 401 */                                   if (map10.containsKey(Integer.valueOf(i8))) {
/* 410 */                                       C1951n4.m6856g("SurfaceConfig does not map to any use case");
                                                return pair;
                                            }
/* 402 */                                   zy2Var = (zy2) map10.get(Integer.valueOf(i8));
/* 403 */                                   c2069pg = (C2069pg) map16.get(zy2Var);
/* 405 */                                   c0998hoM6979a = nh2.m6979a(c2069pg.f15105d, j);
                                            if (c0998hoM6979a != null) {
/* 406 */                                       C0168b5 c0168b5M7414a5 = c2069pg.m7414a();
/* 407 */                                       c0168b5M7414a5.f2214e = c0998hoM6979a;
/* 409 */                                       map16.put(zy2Var, c0168b5M7414a5.m1266k());
                                            }
                                        }
                                        i8++;
                                        map6 = map9;
                                        map4 = map10;
                                    }
                                    break;
                                }
/* 325 */                       if (!((Size) r1.get(i23)).equals(r6.get(i23))) {
                                    map7 = map5;
                                    break;
                                }
                                i23++;
                            }
/* 411 */                   return new Pair(map16, map7);
                        }
                        zy2 zy2Var12 = (zy2) it9.next();
/* 62 */                mb0 mb0Var7 = (mb0) zy2Var12.mo7023b(hw0.f9339p, mb0Var3);
/* 63 */                mb0Var7.getClass();
/* 65 */                mb0 mb0Var8 = mb0.f13671d;
                        if (!mb0Var7.m6635b()) {
                            mb0Var2 = mb0Var3;
/* 67 */                    int i28 = mb0Var7.f13677a;
                            it = it9;
/* 68 */                    int i29 = mb0Var7.f13678b;
                            arrayList6 = arrayList7;
                            if (i28 == 1 && i29 == 0) {
/* 69 */                        if (!hashSet.contains(mb0Var8)) {
                                    mb0VarM6005i = null;
                                    break;
                                }
                                mb0VarM6005i = mb0Var8;
                            } else {
/* 70 */                        mb0VarM6005i = C1822k8.m6005i(mb0Var7, linkedHashSet, hashSet);
                                if (mb0VarM6005i == null) {
/* 74 */                            mb0VarM6005i = C1822k8.m6005i(mb0Var7, linkedHashSet2, hashSet);
                                    if (mb0VarM6005i != null) {
/* 75 */                                mb0Var7.toString();
                                        mb0VarM6005i.toString();
/* 76 */                                hu0.m4312F0("DynamicRangeResolver");
                                    } else if (C1822k8.m6004c(mb0Var7, mb0Var8, hashSet)) {
/* 78 */                                mb0Var7.toString();
                                        mb0Var8.toString();
/* 79 */                                hu0.m4312F0("DynamicRangeResolver");
                                        mb0VarM6005i = mb0Var8;
                                    } else if (i28 == 2 && (i29 == 10 || i29 == 0)) {
/* 80 */                                LinkedHashSet linkedHashSet3 = new LinkedHashSet();
/* 81 */                                if (Build.VERSION.SDK_INT >= 33 && (mb0VarM7129a = ob0.m7129a((C0962gp) c1822k8.f12644b)) != null) {
/* 83 */                                    linkedHashSet3.add(mb0VarM7129a);
                                        }
/* 84 */                                linkedHashSet3.add(mb0.f13672e);
/* 85 */                                mb0 mb0VarM6005i2 = C1822k8.m6005i(mb0Var7, linkedHashSet3, hashSet);
                                        if (mb0VarM6005i2 == null) {
/* 88 */                                    it2 = hashSet.iterator();
                                            while (true) {
                                                if (it2.hasNext()) {
                                                    mb0VarM6005i = null;
                                                    break;
                                                }
                                                mb0VarM6005i = (mb0) it2.next();
                                                Iterator it32 = it2;
/* 89 */                                        de3.m3028j("Candidate dynamic range must be fully specified.", mb0VarM6005i.m6635b());
/* 90 */                                        if (!mb0VarM6005i.equals(mb0Var8)) {
/* 92 */                                            mb0Var7.toString();
                                                    mb0VarM6005i.toString();
/* 93 */                                            hu0.m4312F0("DynamicRangeResolver");
                                                    break;
                                                }
                                                it2 = it32;
                                            }
                                        } else {
/* 86 */                                    mb0Var7.toString();
                                            mb0VarM6005i2.toString();
/* 87 */                                    hu0.m4312F0("DynamicRangeResolver");
                                            mb0VarM6005i = mb0VarM6005i2;
                                        }
                                    } else {
/* 88 */                                it2 = hashSet.iterator();
                                        while (true) {
                                            if (it2.hasNext()) {
                                                mb0VarM6005i = null;
                                                break;
                                            }
                                            mb0VarM6005i = (mb0) it2.next();
                                            Iterator it33 = it2;
/* 89 */                                    de3.m3028j("Candidate dynamic range must be fully specified.", mb0VarM6005i.m6635b());
/* 90 */                                    if (!mb0VarM6005i.equals(mb0Var8) && C1822k8.m6003b(mb0Var7, mb0VarM6005i)) {
/* 92 */                                        mb0Var7.toString();
                                                mb0VarM6005i.toString();
/* 93 */                                        hu0.m4312F0("DynamicRangeResolver");
                                                break;
                                            }
                                            it2 = it33;
                                        }
                                    }
                                } else {
/* 72 */                            mb0Var7.toString();
                                    mb0VarM6005i.toString();
/* 73 */                            hu0.m4312F0("DynamicRangeResolver");
                                }
                            }
                        } else {
/* 66 */                    if (!hashSet.contains(mb0Var7)) {
                                mb0Var2 = mb0Var3;
                                arrayList6 = arrayList7;
                                it = it9;
                                mb0VarM6005i = null;
                                break;
                            }
                            mb0Var2 = mb0Var3;
                            arrayList6 = arrayList7;
                            it = it9;
                            mb0VarM6005i = mb0Var7;
                        }
                        if (mb0VarM6005i == null) {
/* 98 */                    String str10 = (String) zy2Var12.mo7025e(rm2.f16183D);
/* 99 */                    String strJoin = TextUtils.join("\n  ", setMo7381b);
/* 100 */                   String strJoin2 = TextUtils.join("\n  ", hashSet);
/* 101 */                   StringBuilder sb = new StringBuilder("Unable to resolve supported dynamic range. The dynamic range may not be supported on the device or may not be allowed concurrently with other attached use cases.\nUse case:\n  ");
                            sb.append(str10);
                            sb.append("\nRequested dynamic range:\n  ");
                            sb.append(mb0Var7);
                            sb.append("\nSupported dynamic ranges:\n  ");
/* 103 */                   C1951n4.m6859j(fm0.m3790p(sb, strJoin, "\nConstrained set of concurrent dynamic ranges:\n  ", strJoin2));
                            return null;
                        }
/* 94 */                C1822k8.m6007m(hashSet, mb0VarM6005i, qc3Var);
/* 95 */                map12.put(zy2Var12, mb0VarM6005i);
/* 96 */                if (!linkedHashSet.contains(mb0VarM6005i)) {
/* 97 */                    linkedHashSet2.add(mb0VarM6005i);
                        }
                        mb0Var3 = mb0Var2;
                        it9 = it;
                        arrayList7 = arrayList6;
                    }
                }

                /* JADX INFO: renamed from: h */
                public final Pair m1706h(int i, ArrayList arrayList, List list, ArrayList arrayList2, ArrayList arrayList3, int i2, HashMap map, HashMap map2) {
                    int outputMinFrameDuration;
/* 3 */             ArrayList arrayList4 = new ArrayList();
/* 6 */             Iterator it = arrayList.iterator();
/* 14 */            while (it.hasNext()) {
/* 20 */                C0017af c0017af = (C0017af) it.next();
/* 24 */                arrayList4.add(c0017af.f217a);
/* 27 */                if (map != null) {
/* 39 */                    map.put(Integer.valueOf(arrayList4.size() - 1), c0017af);
                        }
                    }
/* 49 */            for (int i3 = 0; i3 < list.size(); i3++) {
/* 55 */                Size size = (Size) list.get(i3);
/* 71 */                zy2 zy2Var = (zy2) arrayList2.get(((Integer) arrayList3.get(i3)).intValue());
/* 73 */                int iMo1175l = zy2Var.mo1175l();
/* 85 */                arrayList4.add(C2143rg.m8156b(i, iMo1175l, size, m1707i(iMo1175l)));
/* 88 */                if (map2 != null) {
/* 100 */                   map2.put(Integer.valueOf(arrayList4.size() - 1), zy2Var);
                        }
                        try {
/* 128 */                   outputMinFrameDuration = (int) (1.0E9d / ((StreamConfigurationMap) this.f2951k.m3981a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getOutputMinFrameDuration(zy2Var.mo1175l(), size));
                        } catch (Exception unused) {
/* 130 */                   outputMinFrameDuration = 0;
                        }
/* 131 */               i2 = Math.min(i2, outputMinFrameDuration);
                    }
/* 144 */           return new Pair(arrayList4, Integer.valueOf(i2));
                }

                /* JADX INFO: renamed from: i */
                public final C2330wg m1707i(int i) {
                    StreamConfigurationMap streamConfigurationMap;
/* 1 */             Integer numValueOf = Integer.valueOf(i);
/* 5 */             ArrayList arrayList = this.f2960t;
/* 11 */            if (!arrayList.contains(numValueOf)) {
/* 19 */                m1708j(this.f2959s.f18609b, ue2.f17492d, i);
/* 28 */                m1708j(this.f2959s.f18611d, ue2.f17494f, i);
/* 33 */                HashMap map = this.f2959s.f18613f;
/* 35 */                C0962gp c0962gp = this.f2951k;
/* 50 */                Size sizeM1699c = m1699c((StreamConfigurationMap) ((ts0) c0962gp.m3982b().f177b).f17248a, i, true);
/* 54 */                if (sizeM1699c != null) {
/* 60 */                    map.put(Integer.valueOf(i), sizeM1699c);
                        }
/* 65 */                HashMap map2 = this.f2959s.f18614g;
/* 71 */                if (Build.VERSION.SDK_INT >= 31 && this.f2958r && (streamConfigurationMap = (StreamConfigurationMap) c0962gp.m3981a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP_MAXIMUM_RESOLUTION)) != null) {
/* 99 */                    map2.put(Integer.valueOf(i), m1699c(streamConfigurationMap, i, true));
                        }
/* 106 */               arrayList.add(Integer.valueOf(i));
                    }
/* 109 */           return this.f2959s;
                }

                /* JADX INFO: renamed from: j */
                public final void m1708j(HashMap map, Size size, int i) {
/* 3 */             if (this.f2956p) {
/* 21 */                Size sizeM1699c = m1699c((StreamConfigurationMap) ((ts0) this.f2951k.m3982b().f177b).f17248a, i, false);
/* 25 */                Integer numValueOf = Integer.valueOf(i);
/* 29 */                if (sizeM1699c != null) {
/* 50 */                    size = (Size) Collections.min(Arrays.asList(size, sizeM1699c), new C1007hx(false));
                        }
/* 52 */                map.put(numValueOf, size);
                    }
                }
            }
