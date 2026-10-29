            package p000;

            import android.graphics.RectF;
            import android.graphics.drawable.Drawable;
            import android.os.Looper;
            import android.view.View;
            import androidx.camera.camera2.internal.compat.quirk.UseTorchAsFlashQuirk;
            import com.google.android.gms.internal.measurement.zzoy;
            import com.google.android.gms.internal.measurement.zzpe;
            import com.google.android.gms.internal.measurement.zzpk;
            import com.google.android.gms.internal.measurement.zzpw;
            import com.google.android.gms.internal.measurement.zzql;
            import com.google.android.gms.internal.measurement.zzrd;
            import com.google.android.gms.internal.play_billing.zzlk;
            import com.google.android.material.tabs.TabLayout;
            import io.flutter.Build;
            import io.flutter.plugin.editing.FlutterTextUtils;
            import java.util.ArrayList;
            import java.util.List;
            import kotlin.collections.C1839a;
            import kotlin.collections.CollectionsKt;
            import kotlin.coroutines.InterfaceC1845f;
            import kotlin.text.StringsKt;
            import okhttp3.internal.p013ws.WebSocketProtocol;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 12 */    public class q62 implements mm1, InterfaceC2512yv, InterfaceC1845f, te3, er2 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f15428a;

                /* JADX INFO: renamed from: b */
                public static final /* synthetic */ q62 f15418b = new q62(12);

                /* JADX INFO: renamed from: c */
                public static final /* synthetic */ q62 f15420c = new q62(13);

                /* JADX INFO: renamed from: d */
                public static final /* synthetic */ q62 f15422d = new q62(14);

                /* JADX INFO: renamed from: e */
                public static final /* synthetic */ q62 f15423e = new q62(15);

                /* JADX INFO: renamed from: f */
                public static final /* synthetic */ q62 f15424f = new q62(16);

                /* JADX INFO: renamed from: i */
                public static final /* synthetic */ q62 f15425i = new q62(17);

                /* JADX INFO: renamed from: v */
                public static final /* synthetic */ q62 f15426v = new q62(18);

                /* JADX INFO: renamed from: w */
                public static final /* synthetic */ q62 f15427w = new q62(19);

                /* JADX INFO: renamed from: U */
                public static final /* synthetic */ q62 f15411U = new q62(20);

                /* JADX INFO: renamed from: V */
                public static final /* synthetic */ q62 f15412V = new q62(21);

                /* JADX INFO: renamed from: W */
                public static final /* synthetic */ q62 f15413W = new q62(22);

                /* JADX INFO: renamed from: X */
                public static final /* synthetic */ q62 f15414X = new q62(23);

                /* JADX INFO: renamed from: Y */
                public static final /* synthetic */ q62 f15415Y = new q62(24);

                /* JADX INFO: renamed from: Z */
                public static final /* synthetic */ q62 f15416Z = new q62(25);

                /* JADX INFO: renamed from: a0 */
                public static final /* synthetic */ q62 f15417a0 = new q62(26);

                /* JADX INFO: renamed from: b0 */
                public static final /* synthetic */ q62 f15419b0 = new q62(28);

                /* JADX INFO: renamed from: c0 */
                public static final /* synthetic */ q62 f15421c0 = new q62(29);

                public q62(er0 er0Var) {
/* 3 */             this.f15428a = 8;
/* 10 */            er0Var.m3579d(UseTorchAsFlashQuirk.class);
                }

                /* JADX INFO: renamed from: b */
                public static RectF m7731b(TabLayout tabLayout, View view) {
/* 1 */             if (view == null) {
/* 5 */                 return new RectF();
                    }
/* 11 */            if (tabLayout.f4983p0 || !(view instanceof lm2)) {
/* 107 */               return new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                    }
/* 17 */            lm2 lm2Var = (lm2) view;
/* 19 */            int contentWidth = lm2Var.getContentWidth();
/* 23 */            int contentHeight = lm2Var.getContentHeight();
/* 37 */            int iM6028A = (int) kb1.m6028A(lm2Var.getContext(), 24);
/* 38 */            if (contentWidth < iM6028A) {
/* 40 */                contentWidth = iM6028A;
                    }
/* 50 */            int right = (lm2Var.getRight() + lm2Var.getLeft()) / 2;
/* 61 */            int bottom = (lm2Var.getBottom() + lm2Var.getTop()) / 2;
/* 63 */            int i = contentWidth / 2;
/* 81 */            return new RectF(right - i, bottom - (contentHeight / 2), i + right, (right / 2) + bottom);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r10v0, types: [java.util.List] */
                /* JADX WARN: Type inference failed for: r2v3, types: [nd0] */
                /* JADX WARN: Type inference failed for: r2v5, types: [java.util.ArrayList] */
                /* JADX WARN: Type inference failed for: r2v6, types: [java.util.ArrayList] */
                /* JADX WARN: Type inference failed for: r2v7 */
                /* JADX WARN: Type inference failed for: r2v8, types: [java.util.ArrayList] */
                /* JADX INFO: renamed from: d */
                public static st2 m7732d(cu1 cu1Var, yv1 yv1Var, ac1 ac1Var) {
                    ArrayList arrayList;
                    ?? M6183B;
/* 5 */             ac1Var.getClass();
/* 8 */             vv1 vv1Var = cu1Var.f6911d;
/* 22 */            fw2 fw2Var = vv1Var != null ? new fw2(vv1Var, yv1Var) : null;
/* 23 */            List<vv1> list = cu1Var.f6913f;
/* 27 */            if (list != null) {
/* 35 */                ArrayList arrayList2 = new ArrayList(C2122qw.m8020h(list, 10));
/* 46 */                for (vv1 vv1Var2 : list) {
/* 65 */                    arrayList2.add(new fw2(vv1Var2, ac1Var.m190u(cu1Var.f6908a, vv1Var2)));
                        }
/* 69 */                arrayList = arrayList2;
                    } else {
/* 71 */                arrayList = null;
                    }
/* 74 */            String str = cu1Var.f6908a;
/* 76 */            String str2 = cu1Var.f6909b;
/* 78 */            String str3 = cu1Var.f6910c;
/* 80 */            pg3 pg3Var = cu1Var.f6912e;
/* 84 */            if (pg3Var instanceof ov1) {
/* 88 */                ArrayList<mv1> arrayList3 = ((ov1) pg3Var).f14905i;
/* 96 */                M6183B = new ArrayList(C2122qw.m8020h(arrayList3, 10));
/* 107 */               for (mv1 mv1Var : arrayList3) {
/* 115 */                   vv1 vv1Var3 = mv1Var.f14033b;
/* 117 */                   String str4 = mv1Var.f14032a;
/* 139 */                   M6183B.add(new kw2(str4, mv1Var.f14035d, vv1Var3 != null ? new fw2(vv1Var3, ac1Var.m190u(str4, vv1Var3)) : null));
                        }
                    } else if (pg3Var instanceof qv1) {
/* 151 */               M6183B = m7733e((qv1) pg3Var);
                    } else if (pg3Var instanceof iv1) {
/* 160 */               iv1 iv1Var = (iv1) pg3Var;
/* 164 */               ArrayList arrayListM7733e = m7733e(iv1Var.f11942i);
/* 168 */               jv1 jv1Var = iv1Var.f11943v;
/* 195 */               M6183B = CollectionsKt.m6183B(arrayListM7733e, C1839a.m6210b(new zt2(AbstractC0886en.m3508l(jv1Var.f12505a, ": ", jv1Var.f12506b), null, null, null, 14)));
                    } else {
/* 200 */               M6183B = nd0.f14189a;
                    }
/* 203 */           return new st2(str, str2, str3, fw2Var, M6183B, arrayList);
                }

                /* JADX INFO: renamed from: e */
                public static ArrayList m7733e(qv1 qv1Var) {
/* 25 */            ArrayList arrayList = new ArrayList(new C2546zc(new zt2[]{new zt2(null, qv1Var.f15779v, null, null, 13)}, true));
/* 34 */            if (!StringsKt.m6228D(qv1Var.f15780w)) {
/* 49 */                arrayList.add(new zt2(qv1Var.f15778i, qv1Var.f15780w, null, null, 12));
                    }
/* 52 */            return arrayList;
                }

                /* JADX INFO: renamed from: g */
                public static final boolean m7734g() {
                    return Looper.myLooper() == Looper.getMainLooper();
                }

                @Override // p000.InterfaceC2512yv
                /* JADX INFO: renamed from: a */
                public long mo7340a() {
/* 1 */             return System.currentTimeMillis();
                }

                @Override // p000.er2, p000.so0
                public Object apply(Object obj) {
/* 3 */             return ((zzlk) obj).zzh();
                }

                /* JADX INFO: renamed from: c */
                public boolean mo1181c(CharSequence charSequence) {
/* 1 */             return charSequence instanceof tt1;
                }

                /* JADX INFO: renamed from: f */
                public void mo3909f(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
/* 1 */             RectF rectFM7731b = m7731b(tabLayout, view);
/* 5 */             RectF rectFM7731b2 = m7731b(tabLayout, view2);
/* 41 */            drawable.setBounds(AbstractC2246u8.m8972c((int) rectFM7731b.left, f, (int) rectFM7731b2.left), drawable.getBounds().top, AbstractC2246u8.m8972c((int) rectFM7731b.right, f, (int) rectFM7731b2.right), drawable.getBounds().bottom);
                }

                @Override // p000.te3
                public /* synthetic */ Object zza() {
                    switch (this.f15428a) {
                        case 12:
/* 179 */                   return new Boolean(zzpe.zza());
                        case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 169 */                   return new Boolean(zzpk.zzb());
                        case 14:
/* 159 */                   return new Boolean(zzpw.zza());
                        case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 142 */                   List list = vg3.f18115a;
/* 148 */                   return Boolean.valueOf(zzql.zzd());
                        case 16:
/* 131 */                   List list2 = vg3.f18115a;
/* 137 */                   return Boolean.valueOf(zzrd.zzb());
                        case 17:
/* 124 */                   List list3 = vg3.f18115a;
/* 126 */                   return zzoy.zze();
                        case 18:
/* 112 */                   List list4 = vg3.f18115a;
/* 119 */                   return Integer.valueOf((int) zzoy.zzal());
                        case 19:
/* 100 */                   List list5 = vg3.f18115a;
/* 107 */                   return Integer.valueOf((int) zzoy.zzak());
                        case 20:
/* 88 */                    List list6 = vg3.f18115a;
/* 95 */                    return Integer.valueOf((int) zzoy.zzr());
                        case Build.API_LEVELS.API_21 /* 21 */:
/* 81 */                    List list7 = vg3.f18115a;
/* 83 */                    return zzoy.zzn();
                        case Build.API_LEVELS.API_22 /* 22 */:
/* 74 */                    List list8 = vg3.f18115a;
/* 76 */                    return zzoy.zzN();
                        case Build.API_LEVELS.API_23 /* 23 */:
/* 63 */                    List list9 = vg3.f18115a;
/* 69 */                    return Long.valueOf(zzoy.zzA());
                        case 24:
/* 52 */                    List list10 = vg3.f18115a;
/* 58 */                    return Long.valueOf(zzoy.zzJ());
                        case Build.API_LEVELS.API_25 /* 25 */:
/* 40 */                    List list11 = vg3.f18115a;
/* 47 */                    return Integer.valueOf((int) zzoy.zzK());
                        case Build.API_LEVELS.API_26 /* 26 */:
/* 28 */                    List list12 = vg3.f18115a;
/* 35 */                    return Integer.valueOf((int) zzoy.zzO());
                        case Build.API_LEVELS.API_27 /* 27 */:
                        default:
/* 6 */                     List list13 = vg3.f18115a;
/* 12 */                    return Long.valueOf(zzoy.zzf());
                        case Build.API_LEVELS.API_28 /* 28 */:
/* 17 */                    List list14 = vg3.f18115a;
/* 23 */                    return Long.valueOf(zzoy.zzQ());
                    }
                }

/* 13 */        public /* synthetic */ q62(int i) {
/* 14 */            this.f15428a = i;
                }
            }
