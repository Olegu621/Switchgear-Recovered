            package p000;

            import android.hardware.camera2.CameraCaptureSession;
            import android.hardware.camera2.CameraCharacteristics;
            import android.hardware.camera2.CaptureRequest;
            import android.hardware.camera2.TotalCaptureResult;
            import android.os.Build;
            import android.util.Range;
            import android.view.View;
            import android.view.ViewGroup;
            import androidx.appcompat.widget.ActionMenuView;
            import androidx.appcompat.widget.C0062b;
            import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
            import com.google.android.gms.internal.play_billing.zze;
            import com.google.android.gms.internal.play_billing.zzlk;
            import com.google.android.material.bottomsheet.BottomSheetBehavior;
            import com.usercentrics.sdk.p009v2.settings.data.ConsentDisclosureObject;
            import io.sentry.android.core.AbstractC1245n0;
            import io.sentry.config.AbstractC1417a;
            import java.io.File;
            import java.io.FileOutputStream;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collections;
            import java.util.LinkedList;
            import java.util.List;
            import java.util.Objects;
            import kotlin.jvm.internal.Intrinsics;
            import kotlin.text.C1852e;
            import kotlin.text.StringsKt;
            import okhttp3.internal.p013ws.WebSocketProtocol;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 60 */    public class zr3 implements t93, j53, fp1, dh1 {

                /* JADX INFO: renamed from: d */
                public static final zr3 f20309d = new zr3(true, (String) null, (Exception) null);

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f20310a;

                /* JADX INFO: renamed from: b */
                public boolean f20311b;

                /* JADX INFO: renamed from: c */
                public Object f20312c;

                /* JADX WARN: Code duplicated, block: B:12:0x0039  */
                public zr3(C0962gp c0962gp) {
/* 1 */             boolean z = true;
/* 2 */             this.f20310a = 1;
/* 8 */             this.f20311b = false;
/* 20 */            this.f20312c = (Range) c0962gp.m3981a(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
/* 26 */            if (Build.VERSION.SDK_INT >= 34) {
/* 42 */                int[] iArr = (int[]) ((CameraCharacteristics) c0962gp.f8757b.f15492b).get(CameraCharacteristics.CONTROL_AVAILABLE_SETTINGS_OVERRIDES);
/* 44 */                if (iArr != null) {
/* 48 */                    for (int i : iArr) {
/* 52 */                        if (i != 1) {
                                }
                            }
/* 58 */                    z = false;
                        } else {
/* 58 */                    z = false;
                        }
                    } else {
/* 58 */                z = false;
                    }
/* 59 */            this.f20311b = z;
                }

                /* JADX INFO: renamed from: B */
                public static zr3 m10427B(String str) {
/* 5 */             return new zr3(false, str, (Exception) null);
                }

                /* JADX INFO: renamed from: C */
                public static zr3 m10428C(String str, Exception exc) {
/* 4 */             return new zr3(false, str, exc);
                }

                /* JADX INFO: renamed from: A */
                public void m10429A(zzlk zzlkVar) {
/* 5 */             if (this.f20311b) {
/* 9 */                 zze.zzl("BillingLogger", "Skipping logging since initialization failed.");
/* 12 */                return;
                    }
                    try {
/* 23 */                ((C0168b5) this.f20312c).m1246A(new C2105qf(zzlkVar, null));
                    } catch (Throwable unused) {
/* 29 */                zze.zzl("BillingLogger", "logging failed.");
                    }
                }

                @Override // p000.t93
                /* JADX INFO: renamed from: a */
                public void mo3990a(TotalCaptureResult totalCaptureResult) {
                }

                /* JADX INFO: renamed from: b */
                public CameraCaptureSession.CaptureCallback m10430b(CameraCaptureSession.CaptureCallback captureCallback) {
/* 3 */             if (!this.f20311b) {
/* 54 */                return captureCallback;
                    }
/* 8 */             C0997hn c0997hn = new C0997hn(3);
/* 13 */            s81 s81Var = (s81) c0997hn.f9152b;
/* 19 */            ((List) this.f20312c).add(s81Var);
/* 33 */            s81Var.mo3676a(new RunnableC2558zo(11, this, c0997hn, s81Var), pg3.m7428g());
/* 51 */            return new C0150ao(Arrays.asList(c0997hn, captureCallback));
                }

                /* JADX INFO: renamed from: c */
                public boolean m10431c() {
/* 1 */             return this.f20311b;
                }

                @Override // p000.dh1
                /* JADX INFO: renamed from: d */
                public void mo2938d(jg1 jg1Var, boolean z) {
                    C0062b c0062b;
/* 3 */             xp2 xp2Var = (xp2) this.f20312c;
/* 7 */             if (this.f20311b) {
/* 9 */                 return;
                    }
/* 11 */            this.f20311b = true;
/* 17 */            ActionMenuView actionMenuView = xp2Var.f19302a.f762a.f696a;
/* 19 */            if (actionMenuView != null && (c0062b = actionMenuView.f461h0) != null) {
/* 25 */                c0062b.m424j();
/* 28 */                C0829d2 c0829d2 = c0062b.f749f0;
/* 30 */                if (c0829d2 != null && c0829d2.m10351b()) {
/* 40 */                    c0829d2.f20144i.dismiss();
                        }
                    }
/* 47 */            xp2Var.f19303b.onPanelClosed(108, jg1Var);
/* 51 */            this.f20311b = false;
                }

                @Override // p000.t93
                /* JADX INFO: renamed from: e */
                public float mo3993e() {
/* 11 */            return ((Float) ((Range) this.f20312c).getUpper()).floatValue();
                }

                /* JADX INFO: renamed from: f */
                public s81 m10432f() {
/* 3 */             List list = (List) this.f20312c;
/* 9 */             if (list.isEmpty()) {
/* 11 */                return tw0.f17292c;
                    }
/* 31 */            f81 f81Var = new f81(new ArrayList(new ArrayList(list)), false, pg3.m7428g());
/* 38 */            ds0 ds0Var = new ds0(29);
/* 54 */            return w11.m9453w(w11.m9399I(f81Var, new gr0(ds0Var), pg3.m7428g()));
                }

                @Override // p000.t93
                /* JADX INFO: renamed from: g */
                public void mo3994g(d52 d52Var) {
/* 11 */            d52Var.m2932F(CaptureRequest.CONTROL_ZOOM_RATIO, Float.valueOf(1.0f));
/* 16 */            if (!this.f20311b || Build.VERSION.SDK_INT < 34) {
/* 36 */                return;
                    }
/* 33 */            d52Var.m2932F(CaptureRequest.CONTROL_SETTINGS_OVERRIDE, 1);
                }

                @Override // p000.t93
                /* JADX INFO: renamed from: h */
                public float mo3995h() {
/* 11 */            return ((Float) ((Range) this.f20312c).getLower()).floatValue();
                }

                /* JADX WARN: Code duplicated, block: B:22:0x0036  */
                /* JADX INFO: renamed from: i */
                public boolean m10433i(CharSequence charSequence, int i) {
/* 1 */             char c = 0;
/* 2 */             if (charSequence == null || i < 0 || charSequence.length() - i < 0) {
/* 70 */                f42.m3649e();
/* 1 */                 return false;
                    }
/* 17 */            if (((dc0) this.f20312c) == null) {
/* 19 */                return m10431c();
                    }
/* 26 */            c = 2;
/* 28 */            for (int i2 = 0; i2 < i && c == 2; i2++) {
/* 36 */                byte directionality = Character.getDirectionality(charSequence.charAt(i2));
/* 40 */                zr3 zr3Var = en2.f7808a;
/* 42 */                if (directionality == 0) {
/* 55 */                    c = 1;
                            continue;
                        } else if (directionality != 1 && directionality != 2) {
                            switch (directionality) {
                                case 14:
                                case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 55 */                            c = 1;
                                    continue;
                                case 16:
                                case 17:
                                    break;
                                default:
/* 51 */                            c = 2;
                                    continue;
                            }
                        }
                    }
/* 59 */            if (c == 0) {
/* 27 */                return true;
                    }
/* 61 */            if (c != 1) {
/* 63 */                return m10431c();
                    }
/* 1 */             return false;
                }

                /* JADX INFO: renamed from: j */
                public void m10434j(int i, String str, String str2, Throwable th) {
/* 3 */             if (this.f20311b) {
/* 9 */                 String strM3508l = AbstractC0886en.m3508l(str, " : ", str2);
/* 13 */                int iM3520y = AbstractC0886en.m3520y(i);
/* 18 */                if (iM3520y != 0) {
/* 22 */                    if (iM3520y == 1) {
/* 32 */                        AbstractC1245n0.m4891s("Helpshift", strM3508l, th);
                            } else if (iM3520y == 2) {
/* 28 */                        AbstractC1245n0.m4877e("Helpshift", strM3508l, th);
                            }
                        }
/* 38 */                aa1 aa1Var = (aa1) this.f20312c;
/* 40 */                if (aa1Var != null) {
/* 42 */                    File file = aa1Var.f141d;
/* 44 */                    long jCurrentTimeMillis = System.currentTimeMillis();
/* 52 */                    long id = Thread.currentThread().getId();
/* 60 */                    if (aa1Var.f140c == null) {
                                try {
/* 71 */                            aa1Var.f140c = AbstractC1417a.m5166d(file, new FileOutputStream(file, true), true);
                                } catch (Exception e) {
/* 94 */                            AbstractC1245n0.m4877e("Heplshift_LogCollector", "Error opening debug log file: " + file.getAbsolutePath(), e);
/* 118 */                           return;
                                }
                            }
                            try {
/* 107 */                       aa1Var.f138a.submit(new z91(aa1Var, jCurrentTimeMillis, id, i, strM3508l, th));
                            } catch (Exception e2) {
/* 115 */                       AbstractC1245n0.m4877e("Heplshift_LogCollector", "Error submitting to executor", e2);
                            }
                        }
                    }
                }

                /* JADX INFO: renamed from: k */
                public lv1 m10435k() {
                    String string;
                    List list;
/* 3 */             C1773iy c1773iy = (C1773iy) this.f20312c;
/* 7 */             hu1 hu1Var = (hu1) c1773iy.f11961i;
/* 11 */            StringBuilder sb = new StringBuilder();
/* 16 */            if (this.f20311b) {
/* 20 */                sb.append(hu1Var.f9299C);
/* 25 */                sb.append("\n\n");
                    }
/* 30 */            Boolean bool = (Boolean) c1773iy.f11959e;
/* 38 */            if (bool != null) {
/* 57 */                sb.append(fm0.m3785k("• ", hu1Var.f9300D, ": ", bool.booleanValue() ? hu1Var.f9298B : hu1Var.f9319q, "\n"));
                    }
/* 62 */            Long l = (Long) c1773iy.f11955a;
/* 64 */            if (l != null) {
/* 71 */                String strM4380a = hu1Var.m4380a(l.longValue());
/* 95 */                sb.append("• " + hu1Var.f9313k + ": " + strM4380a);
/* 98 */                sb.append("\n");
                    }
/* 103 */           Boolean bool2 = (Boolean) c1773iy.f11960f;
/* 105 */           if (bool2 != null) {
/* 116 */               String str = bool2.booleanValue() ? hu1Var.f9298B : hu1Var.f9319q;
/* 138 */               sb.append("• " + hu1Var.f9301E + ": " + str);
/* 141 */               sb.append("\n");
                    }
/* 159 */           String str2 = Intrinsics.m6216a((Boolean) c1773iy.f11956b, Boolean.TRUE) ? hu1Var.f9298B : hu1Var.f9319q;
/* 181 */           sb.append("• " + hu1Var.f9320r + ": " + str2);
/* 186 */           String str3 = hu1Var.f9324v;
/* 190 */           String string2 = sb.toString();
/* 196 */           ConsentDisclosureObject consentDisclosureObject = (ConsentDisclosureObject) c1773iy.f11958d;
/* 200 */           String str4 = (String) c1773iy.f11957c;
/* 202 */           ArrayList arrayListM3367E = null;
/* 202 */           tv1Var = null;
/* 202 */           tv1 tv1Var = null;
/* 203 */           if (str4 != null) {
/* 209 */               string = StringsKt.m6239O(str4).toString();
/* 217 */               if (!StringsKt.m6228D(string)) {
/* 238 */                   string = StringsKt.m6240z(string, "://", false) ? C1852e.m6261k(string, "http://", "https://") : "https://".concat(string);
                        }
                    } else {
/* 243 */               string = null;
                    }
/* 256 */           if (!((consentDisclosureObject == null || (list = consentDisclosureObject.f6401a) == null) ? true : list.isEmpty()) || (string != null && !StringsKt.m6228D(string))) {
/* 269 */               String str5 = hu1Var.f9325w;
/* 271 */               if (consentDisclosureObject != null) {
/* 276 */                   od0 od0Var = od0.f14715a;
/* 278 */                   od0Var.getClass();
/* 284 */                   arrayListM3367E = new C0875ec(consentDisclosureObject, hu1Var, od0Var).m3367E();
                        }
/* 288 */               tv1Var = new tv1(str5, string, arrayListM3367E);
                    }
/* 295 */           return new lv1(str3, new uv1(string2, tv1Var));
                }

                /* JADX INFO: renamed from: l */
                public void m10436l() {
/* 2 */             this.f20311b = false;
                }

                /* JADX INFO: renamed from: m */
                public void mo5924m(byte b) {
/* 10 */            ((C1954n7) this.f20312c).m6910p(String.valueOf(b));
                }

                /* JADX INFO: renamed from: n */
                public void m10437n(char c) {
/* 3 */             C1954n7 c1954n7 = (C1954n7) this.f20312c;
/* 8 */             c1954n7.m6898c(c1954n7.f14151b, 1);
/* 13 */            char[] cArr = (char[]) c1954n7.f14152c;
/* 15 */            int i = c1954n7.f14151b;
/* 19 */            c1954n7.f14151b = i + 1;
/* 21 */            cArr[i] = c;
                }

                @Override // p000.t93
                /* JADX INFO: renamed from: o */
                public void mo4000o() {
                }

                /* JADX WARN: Code duplicated, block: B:33:0x007b  */
                @Override // p000.j53
                /* JADX INFO: renamed from: p */
                public m83 mo3876p(View view, m83 m83Var, k53 k53Var) {
                    boolean z;
/* 1 */             j83 j83Var = m83Var.f13660a;
/* 4 */             ly0 ly0VarMo2970f = j83Var.mo2970f(7);
/* 10 */            ly0 ly0VarMo2970f2 = j83Var.mo2970f(32);
/* 16 */            BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f20312c;
/* 18 */            int i = ly0VarMo2970f.f13529b;
/* 20 */            int i2 = ly0VarMo2970f.f13530c;
/* 22 */            int i3 = ly0VarMo2970f.f13528a;
/* 24 */            bottomSheetBehavior.f4525v = i;
/* 26 */            boolean zM6036J = kb1.m6036J(view);
/* 30 */            int paddingBottom = view.getPaddingBottom();
/* 34 */            int paddingLeft = view.getPaddingLeft();
/* 38 */            int paddingRight = view.getPaddingRight();
/* 42 */            boolean z2 = bottomSheetBehavior.f4517n;
/* 44 */            if (z2) {
/* 46 */                int iM6621a = m83Var.m6621a();
/* 50 */                bottomSheetBehavior.f4524u = iM6621a;
/* 54 */                paddingBottom = iM6621a + k53Var.f12608d;
                    }
/* 57 */            if (bottomSheetBehavior.f4518o) {
/* 66 */                paddingLeft = (zM6036J ? k53Var.f12607c : k53Var.f12605a) + i3;
                    }
/* 69 */            if (bottomSheetBehavior.f4519p) {
/* 78 */                paddingRight = (zM6036J ? k53Var.f12605a : k53Var.f12607c) + i2;
                    }
/* 84 */            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
/* 88 */            boolean z3 = true;
/* 89 */            if (!bottomSheetBehavior.f4521r || marginLayoutParams.leftMargin == i3) {
/* 99 */                z = false;
                    } else {
/* 95 */                marginLayoutParams.leftMargin = i3;
/* 97 */                z = true;
                    }
/* 102 */           if (bottomSheetBehavior.f4522s && marginLayoutParams.rightMargin != i2) {
/* 108 */               marginLayoutParams.rightMargin = i2;
/* 110 */               z = true;
                    }
/* 113 */           if (bottomSheetBehavior.f4523t) {
/* 115 */               int i4 = marginLayoutParams.topMargin;
/* 117 */               int i5 = ly0VarMo2970f.f13529b;
/* 119 */               if (i4 != i5) {
/* 121 */                   marginLayoutParams.topMargin = i5;
                        } else {
/* 124 */                   z3 = z;
                        }
                    } else {
/* 124 */               z3 = z;
                    }
/* 125 */           if (z3) {
/* 127 */               view.setLayoutParams(marginLayoutParams);
                    }
/* 134 */           view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
/* 137 */           boolean z4 = this.f20311b;
/* 139 */           if (z4) {
/* 143 */               bottomSheetBehavior.f4515l = ly0VarMo2970f2.f13531d;
                    }
/* 145 */           if (!z2 && !z4) {
/* 150 */               return m83Var;
                    }
/* 151 */           bottomSheetBehavior.m2261H();
/* 154 */           return m83Var;
                }

                @Override // p000.fp1
                /* JADX INFO: renamed from: q */
                public void mo3429q(Object obj) {
/* 9 */             SignInHubActivity signInHubActivity = (SignInHubActivity) ((er0) this.f20312c).f7853b;
/* 15 */            signInHubActivity.setResult(signInHubActivity.f3407e, signInHubActivity.f3408f);
/* 18 */            signInHubActivity.finish();
/* 22 */            this.f20311b = true;
                }

                /* JADX INFO: renamed from: r */
                public void mo5925r(int i) {
/* 10 */            ((C1954n7) this.f20312c).m6910p(String.valueOf(i));
                }

                /* JADX INFO: renamed from: s */
                public void mo5926s(long j) {
/* 9 */             ((C1954n7) this.f20312c).m6910p(String.valueOf(j));
                }

                /* JADX INFO: renamed from: t */
                public void mo5927t(short s) {
/* 10 */            ((C1954n7) this.f20312c).m6910p(String.valueOf(s));
                }

                public String toString() {
                    switch (this.f20310a) {
                        case 6:
/* 15 */                    return ((er0) this.f20312c).toString();
                        default:
/* 6 */                     return super.toString();
                    }
                }

                /* JADX INFO: renamed from: u */
                public void m10438u(String str) {
                    byte b;
/* 1 */             str.getClass();
/* 6 */             C1954n7 c1954n7 = (C1954n7) this.f20312c;
/* 16 */            c1954n7.m6898c(c1954n7.f14151b, str.length() + 2);
/* 21 */            char[] cArr = (char[]) c1954n7.f14152c;
/* 23 */            int i = c1954n7.f14151b;
/* 25 */            int i2 = i + 1;
/* 29 */            cArr[i] = '\"';
/* 31 */            int length = str.length();
/* 36 */            str.getChars(0, length, cArr, i2);
/* 39 */            int i3 = length + i2;
/* 40 */            int i4 = i2;
/* 41 */            while (i4 < i3) {
/* 43 */                char c = cArr[i4];
/* 45 */                byte[] bArr = sh2.f16632b;
/* 48 */                if (c < bArr.length && bArr[c] != 0) {
/* 56 */                    int length2 = str.length();
/* 61 */                    for (int i5 = i4 - i2; i5 < length2; i5++) {
/* 63 */                        c1954n7.m6898c(i4, 2);
/* 66 */                        char cCharAt = str.charAt(i5);
/* 70 */                        byte[] bArr2 = sh2.f16632b;
/* 73 */                        if (cCharAt >= bArr2.length || (b = bArr2[cCharAt]) == 0) {
/* 83 */                            int i6 = i4 + 1;
/* 86 */                            ((char[]) c1954n7.f14152c)[i4] = cCharAt;
/* 88 */                            i4 = i6;
                                } else if (b == 1) {
/* 94 */                            String str2 = sh2.f16631a[cCharAt];
/* 96 */                            str2.getClass();
/* 103 */                           c1954n7.m6898c(i4, str2.length());
/* 114 */                           str2.getChars(0, str2.length(), (char[]) c1954n7.f14152c, i4);
/* 121 */                           int length3 = str2.length() + i4;
/* 122 */                           c1954n7.f14151b = length3;
/* 124 */                           i4 = length3;
                                } else {
/* 128 */                           char[] cArr2 = (char[]) c1954n7.f14152c;
/* 132 */                           cArr2[i4] = '\\';
/* 137 */                           cArr2[i4 + 1] = (char) b;
/* 139 */                           i4 += 2;
/* 141 */                           c1954n7.f14151b = i4;
                                }
                            }
/* 157 */                   c1954n7.m6898c(i4, 1);
/* 166 */                   ((char[]) c1954n7.f14152c)[i4] = '\"';
/* 168 */                   c1954n7.f14151b = i4 + 1;
/* 170 */                   return;
                        }
/* 171 */               i4++;
                    }
/* 177 */           cArr[i3] = '\"';
/* 179 */           c1954n7.f14151b = i3 + 1;
                }

                /* JADX INFO: renamed from: v */
                public void m10439v() {
                }

                /* JADX INFO: renamed from: w */
                public void m10440w() {
/* 7 */             LinkedList linkedList = new LinkedList((List) this.f20312c);
/* 14 */            while (!linkedList.isEmpty()) {
/* 20 */                s81 s81Var = (s81) linkedList.poll();
/* 22 */                Objects.requireNonNull(s81Var);
/* 28 */                s81Var.cancel(true);
                    }
                }

                /* JADX INFO: renamed from: x */
                public void m10441x() {
                }

                /* JADX INFO: renamed from: y */
                public void mo10020y() {
                }

                @Override // p000.dh1
                /* JADX INFO: renamed from: z */
                public boolean mo2942z(jg1 jg1Var) {
/* 9 */             ((xp2) this.f20312c).f19303b.onMenuOpened(108, jg1Var);
/* 12 */            return true;
                }

/* 61 */        public /* synthetic */ zr3(int i, Object obj, boolean z) {
/* 62 */            this.f20310a = i;
                    this.f20312c = obj;
                    this.f20311b = z;
                }

/* 62 */        public /* synthetic */ zr3(Object obj, int i) {
/* 63 */            this.f20310a = i;
                    this.f20312c = obj;
                }

/* 63 */        public zr3(boolean z, String str, Exception exc) {
                    this.f20310a = 0;
                    this.f20311b = z;
                    this.f20312c = exc;
                }

/* 64 */        public zr3(C1954n7 c1954n7) {
                    this.f20310a = 3;
/* 66 */            this.f20312c = c1954n7;
/* 67 */            this.f20311b = true;
                }

/* 67 */        public zr3(boolean z, boolean z2) {
                    this.f20310a = 5;
/* 69 */            this.f20311b = z2;
                }

/* 69 */        public /* synthetic */ zr3() {
/* 70 */            this.f20310a = 11;
                }

/* 70 */        public zr3(boolean z) {
                    this.f20310a = 7;
/* 73 */            this.f20312c = Collections.synchronizedList(new ArrayList());
/* 74 */            this.f20311b = z;
                }

/* 74 */        public zr3(C1799jn c1799jn, y92 y92Var) {
                    this.f20310a = 4;
/* 76 */            this.f20311b = false;
/* 77 */            this.f20312c = new C0828d1(2);
                }

                /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
/* 77 */        public zr3(dc0 dc0Var, boolean z) {
/* 78 */            this(dc0Var, 9);
                    this.f20310a = 9;
/* 79 */            this.f20311b = z;
                }

/* 79 */        public zr3(lc3 lc3Var, er0 er0Var) {
                    this.f20310a = 6;
/* 81 */            this.f20311b = false;
/* 82 */            this.f20312c = er0Var;
                }
            }
