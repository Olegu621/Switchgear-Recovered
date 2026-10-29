            package androidx.constraintlayout.widget;

            import android.content.Context;
            import android.content.res.TypedArray;
            import android.content.res.XmlResourceParser;
            import android.graphics.drawable.ColorDrawable;
            import android.util.AttributeSet;
            import android.util.SparseIntArray;
            import android.util.Xml;
            import android.view.View;
            import android.view.ViewGroup;
            import androidx.constraintlayout.motion.widget.MotionLayout;
            import com.appsflyer.attribution.RequestError;
            import io.flutter.Build;
            import io.flutter.plugin.editing.FlutterTextUtils;
            import io.sentry.android.core.AbstractC1245n0;
            import java.io.IOException;
            import java.lang.reflect.InvocationTargetException;
            import java.util.Arrays;
            import java.util.HashMap;
            import java.util.HashSet;
            import java.util.Locale;
            import okhttp3.HttpUrl;
            import okhttp3.internal.p013ws.WebSocketProtocol;
            import org.xmlpull.v1.XmlPullParserException;
            import p000.C2088pz;
            import p000.C2131r4;
            import p000.C2236tz;
            import p000.C2274uz;
            import p000.C2312vz;
            import p000.C2349wz;
            import p000.C2479xz;
            import p000.de3;
            import p000.f42;
            import p000.qd2;
            
            /* JADX INFO: renamed from: androidx.constraintlayout.widget.d */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0077d {

                /* JADX INFO: renamed from: g */
                public static final int[] f1184g = {0, 4, 8};

                /* JADX INFO: renamed from: h */
                public static final SparseIntArray f1185h;

                /* JADX INFO: renamed from: i */
                public static final SparseIntArray f1186i;

                /* JADX INFO: renamed from: a */
                public String f1187a;

                /* JADX INFO: renamed from: b */
                public String f1188b = HttpUrl.FRAGMENT_ENCODE_SET;

                /* JADX INFO: renamed from: c */
                public int f1189c = 0;

                /* JADX INFO: renamed from: d */
                public final HashMap f1190d = new HashMap();

                /* JADX INFO: renamed from: e */
                public boolean f1191e = true;

                /* JADX INFO: renamed from: f */
                public final HashMap f1192f = new HashMap();

                static {
/* 13 */            SparseIntArray sparseIntArray = new SparseIntArray();
/* 16 */            f1185h = sparseIntArray;
/* 20 */            SparseIntArray sparseIntArray2 = new SparseIntArray();
/* 23 */            f1186i = sparseIntArray2;
/* 29 */            sparseIntArray.append(R$styleable.Constraint_layout_constraintLeft_toLeftOf, 25);
/* 36 */            sparseIntArray.append(R$styleable.Constraint_layout_constraintLeft_toRightOf, 26);
/* 43 */            sparseIntArray.append(R$styleable.Constraint_layout_constraintRight_toLeftOf, 29);
/* 50 */            sparseIntArray.append(R$styleable.Constraint_layout_constraintRight_toRightOf, 30);
/* 57 */            sparseIntArray.append(R$styleable.Constraint_layout_constraintTop_toTopOf, 36);
/* 64 */            sparseIntArray.append(R$styleable.Constraint_layout_constraintTop_toBottomOf, 35);
/* 69 */            sparseIntArray.append(R$styleable.Constraint_layout_constraintBottom_toTopOf, 4);
/* 75 */            sparseIntArray.append(R$styleable.Constraint_layout_constraintBottom_toBottomOf, 3);
/* 81 */            sparseIntArray.append(R$styleable.Constraint_layout_constraintBaseline_toBaselineOf, 1);
/* 88 */            sparseIntArray.append(R$styleable.Constraint_layout_constraintBaseline_toTopOf, 91);
/* 95 */            sparseIntArray.append(R$styleable.Constraint_layout_constraintBaseline_toBottomOf, 92);
/* 101 */           sparseIntArray.append(R$styleable.Constraint_layout_editor_absoluteX, 6);
/* 107 */           sparseIntArray.append(R$styleable.Constraint_layout_editor_absoluteY, 7);
/* 114 */           sparseIntArray.append(R$styleable.Constraint_layout_constraintGuide_begin, 17);
/* 121 */           sparseIntArray.append(R$styleable.Constraint_layout_constraintGuide_end, 18);
/* 128 */           sparseIntArray.append(R$styleable.Constraint_layout_constraintGuide_percent, 19);
/* 135 */           sparseIntArray.append(R$styleable.Constraint_guidelineUseRtl, 99);
/* 142 */           sparseIntArray.append(R$styleable.Constraint_android_orientation, 27);
/* 149 */           sparseIntArray.append(R$styleable.Constraint_layout_constraintStart_toEndOf, 32);
/* 156 */           sparseIntArray.append(R$styleable.Constraint_layout_constraintStart_toStartOf, 33);
/* 163 */           sparseIntArray.append(R$styleable.Constraint_layout_constraintEnd_toStartOf, 10);
/* 170 */           sparseIntArray.append(R$styleable.Constraint_layout_constraintEnd_toEndOf, 9);
/* 177 */           sparseIntArray.append(R$styleable.Constraint_layout_goneMarginLeft, 13);
/* 184 */           sparseIntArray.append(R$styleable.Constraint_layout_goneMarginTop, 16);
/* 191 */           sparseIntArray.append(R$styleable.Constraint_layout_goneMarginRight, 14);
/* 198 */           sparseIntArray.append(R$styleable.Constraint_layout_goneMarginBottom, 11);
/* 205 */           sparseIntArray.append(R$styleable.Constraint_layout_goneMarginStart, 15);
/* 212 */           sparseIntArray.append(R$styleable.Constraint_layout_goneMarginEnd, 12);
/* 219 */           sparseIntArray.append(R$styleable.Constraint_layout_constraintVertical_weight, 40);
/* 226 */           sparseIntArray.append(R$styleable.Constraint_layout_constraintHorizontal_weight, 39);
/* 233 */           sparseIntArray.append(R$styleable.Constraint_layout_constraintHorizontal_chainStyle, 41);
/* 240 */           sparseIntArray.append(R$styleable.Constraint_layout_constraintVertical_chainStyle, 42);
/* 247 */           sparseIntArray.append(R$styleable.Constraint_layout_constraintHorizontal_bias, 20);
/* 254 */           sparseIntArray.append(R$styleable.Constraint_layout_constraintVertical_bias, 37);
/* 260 */           sparseIntArray.append(R$styleable.Constraint_layout_constraintDimensionRatio, 5);
/* 267 */           sparseIntArray.append(R$styleable.Constraint_layout_constraintLeft_creator, 87);
/* 272 */           sparseIntArray.append(R$styleable.Constraint_layout_constraintTop_creator, 87);
/* 277 */           sparseIntArray.append(R$styleable.Constraint_layout_constraintRight_creator, 87);
/* 282 */           sparseIntArray.append(R$styleable.Constraint_layout_constraintBottom_creator, 87);
/* 287 */           sparseIntArray.append(R$styleable.Constraint_layout_constraintBaseline_creator, 87);
/* 294 */           sparseIntArray.append(R$styleable.Constraint_android_layout_marginLeft, 24);
/* 301 */           sparseIntArray.append(R$styleable.Constraint_android_layout_marginRight, 28);
/* 308 */           sparseIntArray.append(R$styleable.Constraint_android_layout_marginStart, 31);
/* 313 */           sparseIntArray.append(R$styleable.Constraint_android_layout_marginEnd, 8);
/* 320 */           sparseIntArray.append(R$styleable.Constraint_android_layout_marginTop, 34);
/* 326 */           sparseIntArray.append(R$styleable.Constraint_android_layout_marginBottom, 2);
/* 333 */           sparseIntArray.append(R$styleable.Constraint_android_layout_width, 23);
/* 340 */           sparseIntArray.append(R$styleable.Constraint_android_layout_height, 21);
/* 347 */           sparseIntArray.append(R$styleable.Constraint_layout_constraintWidth, 95);
/* 354 */           sparseIntArray.append(R$styleable.Constraint_layout_constraintHeight, 96);
/* 361 */           sparseIntArray.append(R$styleable.Constraint_android_visibility, 22);
/* 368 */           sparseIntArray.append(R$styleable.Constraint_android_alpha, 43);
/* 375 */           sparseIntArray.append(R$styleable.Constraint_android_elevation, 44);
/* 382 */           sparseIntArray.append(R$styleable.Constraint_android_rotationX, 45);
/* 389 */           sparseIntArray.append(R$styleable.Constraint_android_rotationY, 46);
/* 396 */           sparseIntArray.append(R$styleable.Constraint_android_rotation, 60);
/* 403 */           sparseIntArray.append(R$styleable.Constraint_android_scaleX, 47);
/* 410 */           sparseIntArray.append(R$styleable.Constraint_android_scaleY, 48);
/* 417 */           sparseIntArray.append(R$styleable.Constraint_android_transformPivotX, 49);
/* 424 */           sparseIntArray.append(R$styleable.Constraint_android_transformPivotY, 50);
/* 431 */           sparseIntArray.append(R$styleable.Constraint_android_translationX, 51);
/* 438 */           sparseIntArray.append(R$styleable.Constraint_android_translationY, 52);
/* 445 */           sparseIntArray.append(R$styleable.Constraint_android_translationZ, 53);
/* 452 */           sparseIntArray.append(R$styleable.Constraint_layout_constraintWidth_default, 54);
/* 459 */           sparseIntArray.append(R$styleable.Constraint_layout_constraintHeight_default, 55);
/* 466 */           sparseIntArray.append(R$styleable.Constraint_layout_constraintWidth_max, 56);
/* 473 */           sparseIntArray.append(R$styleable.Constraint_layout_constraintHeight_max, 57);
/* 480 */           sparseIntArray.append(R$styleable.Constraint_layout_constraintWidth_min, 58);
/* 487 */           sparseIntArray.append(R$styleable.Constraint_layout_constraintHeight_min, 59);
/* 494 */           sparseIntArray.append(R$styleable.Constraint_layout_constraintCircle, 61);
/* 501 */           sparseIntArray.append(R$styleable.Constraint_layout_constraintCircleRadius, 62);
/* 508 */           sparseIntArray.append(R$styleable.Constraint_layout_constraintCircleAngle, 63);
/* 515 */           sparseIntArray.append(R$styleable.Constraint_animateRelativeTo, 64);
/* 522 */           sparseIntArray.append(R$styleable.Constraint_transitionEasing, 65);
/* 529 */           sparseIntArray.append(R$styleable.Constraint_drawPath, 66);
/* 536 */           sparseIntArray.append(R$styleable.Constraint_transitionPathRotate, 67);
/* 543 */           sparseIntArray.append(R$styleable.Constraint_motionStagger, 79);
/* 550 */           sparseIntArray.append(R$styleable.Constraint_android_id, 38);
/* 557 */           sparseIntArray.append(R$styleable.Constraint_motionProgress, 68);
/* 564 */           sparseIntArray.append(R$styleable.Constraint_layout_constraintWidth_percent, 69);
/* 571 */           sparseIntArray.append(R$styleable.Constraint_layout_constraintHeight_percent, 70);
/* 578 */           sparseIntArray.append(R$styleable.Constraint_layout_wrapBehaviorInParent, 97);
/* 585 */           sparseIntArray.append(R$styleable.Constraint_chainUseRtl, 71);
/* 592 */           sparseIntArray.append(R$styleable.Constraint_barrierDirection, 72);
/* 599 */           sparseIntArray.append(R$styleable.Constraint_barrierMargin, 73);
/* 606 */           sparseIntArray.append(R$styleable.Constraint_constraint_referenced_ids, 74);
/* 613 */           sparseIntArray.append(R$styleable.Constraint_barrierAllowsGoneWidgets, 75);
/* 620 */           sparseIntArray.append(R$styleable.Constraint_pathMotionArc, 76);
/* 627 */           sparseIntArray.append(R$styleable.Constraint_layout_constraintTag, 77);
/* 634 */           sparseIntArray.append(R$styleable.Constraint_visibilityMode, 78);
/* 641 */           sparseIntArray.append(R$styleable.Constraint_layout_constrainedWidth, 80);
/* 648 */           sparseIntArray.append(R$styleable.Constraint_layout_constrainedHeight, 81);
/* 655 */           sparseIntArray.append(R$styleable.Constraint_polarRelativeTo, 82);
/* 662 */           sparseIntArray.append(R$styleable.Constraint_transformPivotTarget, 83);
/* 669 */           sparseIntArray.append(R$styleable.Constraint_quantizeMotionSteps, 84);
/* 676 */           sparseIntArray.append(R$styleable.Constraint_quantizeMotionPhase, 85);
/* 683 */           sparseIntArray.append(R$styleable.Constraint_quantizeMotionInterpolator, 86);
/* 688 */           sparseIntArray2.append(R$styleable.ConstraintOverride_layout_editor_absoluteY, 6);
/* 693 */           sparseIntArray2.append(R$styleable.ConstraintOverride_layout_editor_absoluteY, 7);
/* 698 */           sparseIntArray2.append(R$styleable.ConstraintOverride_android_orientation, 27);
/* 703 */           sparseIntArray2.append(R$styleable.ConstraintOverride_layout_goneMarginLeft, 13);
/* 708 */           sparseIntArray2.append(R$styleable.ConstraintOverride_layout_goneMarginTop, 16);
/* 713 */           sparseIntArray2.append(R$styleable.ConstraintOverride_layout_goneMarginRight, 14);
/* 718 */           sparseIntArray2.append(R$styleable.ConstraintOverride_layout_goneMarginBottom, 11);
/* 723 */           sparseIntArray2.append(R$styleable.ConstraintOverride_layout_goneMarginStart, 15);
/* 728 */           sparseIntArray2.append(R$styleable.ConstraintOverride_layout_goneMarginEnd, 12);
/* 733 */           sparseIntArray2.append(R$styleable.ConstraintOverride_layout_constraintVertical_weight, 40);
/* 738 */           sparseIntArray2.append(R$styleable.ConstraintOverride_layout_constraintHorizontal_weight, 39);
/* 745 */           sparseIntArray2.append(R$styleable.ConstraintOverride_layout_constraintHorizontal_chainStyle, 41);
/* 752 */           sparseIntArray2.append(R$styleable.ConstraintOverride_layout_constraintVertical_chainStyle, 42);
/* 759 */           sparseIntArray2.append(R$styleable.ConstraintOverride_layout_constraintHorizontal_bias, 20);
/* 766 */           sparseIntArray2.append(R$styleable.ConstraintOverride_layout_constraintVertical_bias, 37);
/* 772 */           sparseIntArray2.append(R$styleable.ConstraintOverride_layout_constraintDimensionRatio, 5);
/* 779 */           sparseIntArray2.append(R$styleable.ConstraintOverride_layout_constraintLeft_creator, 87);
/* 784 */           sparseIntArray2.append(R$styleable.ConstraintOverride_layout_constraintTop_creator, 87);
/* 789 */           sparseIntArray2.append(R$styleable.ConstraintOverride_layout_constraintRight_creator, 87);
/* 794 */           sparseIntArray2.append(R$styleable.ConstraintOverride_layout_constraintBottom_creator, 87);
/* 799 */           sparseIntArray2.append(R$styleable.ConstraintOverride_layout_constraintBaseline_creator, 87);
/* 806 */           sparseIntArray2.append(R$styleable.ConstraintOverride_android_layout_marginLeft, 24);
/* 813 */           sparseIntArray2.append(R$styleable.ConstraintOverride_android_layout_marginRight, 28);
/* 818 */           sparseIntArray2.append(R$styleable.ConstraintOverride_android_layout_marginStart, 31);
/* 825 */           sparseIntArray2.append(R$styleable.ConstraintOverride_android_layout_marginEnd, 8);
/* 832 */           sparseIntArray2.append(R$styleable.ConstraintOverride_android_layout_marginTop, 34);
/* 838 */           sparseIntArray2.append(R$styleable.ConstraintOverride_android_layout_marginBottom, 2);
/* 845 */           sparseIntArray2.append(R$styleable.ConstraintOverride_android_layout_width, 23);
/* 852 */           sparseIntArray2.append(R$styleable.ConstraintOverride_android_layout_height, 21);
/* 859 */           sparseIntArray2.append(R$styleable.ConstraintOverride_layout_constraintWidth, 95);
/* 866 */           sparseIntArray2.append(R$styleable.ConstraintOverride_layout_constraintHeight, 96);
/* 873 */           sparseIntArray2.append(R$styleable.ConstraintOverride_android_visibility, 22);
/* 880 */           sparseIntArray2.append(R$styleable.ConstraintOverride_android_alpha, 43);
/* 887 */           sparseIntArray2.append(R$styleable.ConstraintOverride_android_elevation, 44);
/* 894 */           sparseIntArray2.append(R$styleable.ConstraintOverride_android_rotationX, 45);
/* 901 */           sparseIntArray2.append(R$styleable.ConstraintOverride_android_rotationY, 46);
/* 908 */           sparseIntArray2.append(R$styleable.ConstraintOverride_android_rotation, 60);
/* 915 */           sparseIntArray2.append(R$styleable.ConstraintOverride_android_scaleX, 47);
/* 922 */           sparseIntArray2.append(R$styleable.ConstraintOverride_android_scaleY, 48);
/* 929 */           sparseIntArray2.append(R$styleable.ConstraintOverride_android_transformPivotX, 49);
/* 936 */           sparseIntArray2.append(R$styleable.ConstraintOverride_android_transformPivotY, 50);
/* 943 */           sparseIntArray2.append(R$styleable.ConstraintOverride_android_translationX, 51);
/* 950 */           sparseIntArray2.append(R$styleable.ConstraintOverride_android_translationY, 52);
/* 957 */           sparseIntArray2.append(R$styleable.ConstraintOverride_android_translationZ, 53);
/* 964 */           sparseIntArray2.append(R$styleable.ConstraintOverride_layout_constraintWidth_default, 54);
/* 971 */           sparseIntArray2.append(R$styleable.ConstraintOverride_layout_constraintHeight_default, 55);
/* 978 */           sparseIntArray2.append(R$styleable.ConstraintOverride_layout_constraintWidth_max, 56);
/* 985 */           sparseIntArray2.append(R$styleable.ConstraintOverride_layout_constraintHeight_max, 57);
/* 992 */           sparseIntArray2.append(R$styleable.ConstraintOverride_layout_constraintWidth_min, 58);
/* 999 */           sparseIntArray2.append(R$styleable.ConstraintOverride_layout_constraintHeight_min, 59);
/* 1006 */          sparseIntArray2.append(R$styleable.ConstraintOverride_layout_constraintCircleRadius, 62);
/* 1013 */          sparseIntArray2.append(R$styleable.ConstraintOverride_layout_constraintCircleAngle, 63);
/* 1020 */          sparseIntArray2.append(R$styleable.ConstraintOverride_animateRelativeTo, 64);
/* 1027 */          sparseIntArray2.append(R$styleable.ConstraintOverride_transitionEasing, 65);
/* 1034 */          sparseIntArray2.append(R$styleable.ConstraintOverride_drawPath, 66);
/* 1041 */          sparseIntArray2.append(R$styleable.ConstraintOverride_transitionPathRotate, 67);
/* 1048 */          sparseIntArray2.append(R$styleable.ConstraintOverride_motionStagger, 79);
/* 1055 */          sparseIntArray2.append(R$styleable.ConstraintOverride_android_id, 38);
/* 1062 */          sparseIntArray2.append(R$styleable.ConstraintOverride_motionTarget, 98);
/* 1069 */          sparseIntArray2.append(R$styleable.ConstraintOverride_motionProgress, 68);
/* 1076 */          sparseIntArray2.append(R$styleable.ConstraintOverride_layout_constraintWidth_percent, 69);
/* 1083 */          sparseIntArray2.append(R$styleable.ConstraintOverride_layout_constraintHeight_percent, 70);
/* 1090 */          sparseIntArray2.append(R$styleable.ConstraintOverride_chainUseRtl, 71);
/* 1097 */          sparseIntArray2.append(R$styleable.ConstraintOverride_barrierDirection, 72);
/* 1104 */          sparseIntArray2.append(R$styleable.ConstraintOverride_barrierMargin, 73);
/* 1111 */          sparseIntArray2.append(R$styleable.ConstraintOverride_constraint_referenced_ids, 74);
/* 1118 */          sparseIntArray2.append(R$styleable.ConstraintOverride_barrierAllowsGoneWidgets, 75);
/* 1125 */          sparseIntArray2.append(R$styleable.ConstraintOverride_pathMotionArc, 76);
/* 1132 */          sparseIntArray2.append(R$styleable.ConstraintOverride_layout_constraintTag, 77);
/* 1139 */          sparseIntArray2.append(R$styleable.ConstraintOverride_visibilityMode, 78);
/* 1146 */          sparseIntArray2.append(R$styleable.ConstraintOverride_layout_constrainedWidth, 80);
/* 1153 */          sparseIntArray2.append(R$styleable.ConstraintOverride_layout_constrainedHeight, 81);
/* 1160 */          sparseIntArray2.append(R$styleable.ConstraintOverride_polarRelativeTo, 82);
/* 1167 */          sparseIntArray2.append(R$styleable.ConstraintOverride_transformPivotTarget, 83);
/* 1174 */          sparseIntArray2.append(R$styleable.ConstraintOverride_quantizeMotionSteps, 84);
/* 1181 */          sparseIntArray2.append(R$styleable.ConstraintOverride_quantizeMotionPhase, 85);
/* 1188 */          sparseIntArray2.append(R$styleable.ConstraintOverride_quantizeMotionInterpolator, 86);
/* 1195 */          sparseIntArray2.append(R$styleable.ConstraintOverride_layout_wrapBehaviorInParent, 97);
                }

                /* JADX INFO: renamed from: d */
                public static C0076c m529d(Context context, XmlResourceParser xmlResourceParser) {
/* 1 */             AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlResourceParser);
/* 7 */             C0076c c0076c = new C0076c();
/* 12 */            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSetAsAttributeSet, R$styleable.ConstraintOverride);
/* 16 */            m535o(c0076c, typedArrayObtainStyledAttributes);
/* 19 */            typedArrayObtainStyledAttributes.recycle();
/* 22 */            return c0076c;
                }

                /* JADX INFO: renamed from: f */
                public static int[] m530f(Barrier barrier, String str) {
                    int iIntValue;
/* 3 */             String[] strArrSplit = str.split(",");
/* 7 */             Context context = barrier.getContext();
/* 12 */            int[] iArr = new int[strArrSplit.length];
/* 15 */            int i = 0;
/* 16 */            int i2 = 0;
/* 18 */            while (i < strArrSplit.length) {
/* 22 */                String strTrim = strArrSplit[i].trim();
/* 26 */                Object obj = null;
                        try {
/* 33 */                    iIntValue = R$id.class.getField(strTrim).getInt(null);
                        } catch (Exception unused) {
/* 38 */                    iIntValue = 0;
                        }
/* 39 */                if (iIntValue == 0) {
/* 51 */                    iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
                        }
/* 55 */                if (iIntValue == 0 && barrier.isInEditMode() && (barrier.getParent() instanceof ConstraintLayout)) {
/* 75 */                    ConstraintLayout constraintLayout = (ConstraintLayout) barrier.getParent();
/* 77 */                    if (strTrim != null) {
/* 79 */                        HashMap map = constraintLayout.f1057a0;
/* 81 */                        if (map != null && map.containsKey(strTrim)) {
/* 91 */                            obj = constraintLayout.f1057a0.get(strTrim);
                                }
                            } else {
/* 96 */                        constraintLayout.getClass();
                            }
/* 99 */                    if (obj != null && (obj instanceof Integer)) {
/* 107 */                       iIntValue = ((Integer) obj).intValue();
                            }
                        }
/* 113 */               iArr[i2] = iIntValue;
/* 115 */               i++;
/* 111 */               i2++;
                    }
                    return i2 != strArrSplit.length ? Arrays.copyOf(iArr, i2) : iArr;
                }

                /* JADX INFO: renamed from: g */
                public static C0076c m531g(Context context, AttributeSet attributeSet, boolean z) {
/* 3 */             C0076c c0076c = new C0076c();
/* 18 */            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z ? R$styleable.ConstraintOverride : R$styleable.Constraint);
/* 22 */            if (z) {
/* 24 */                m535o(c0076c, typedArrayObtainStyledAttributes);
                    } else {
/* 29 */                int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
/* 34 */                int i = 0;
                        while (true) {
/* 35 */                    C2274uz c2274uz = c0076c.f1180e;
/* 37 */                    if (i < indexCount) {
/* 39 */                        int index = typedArrayObtainStyledAttributes.getIndex(i);
/* 43 */                        int i2 = R$styleable.Constraint_android_id;
/* 45 */                        C2349wz c2349wz = c0076c.f1178c;
/* 47 */                        C2479xz c2479xz = c0076c.f1181f;
/* 49 */                        C2312vz c2312vz = c0076c.f1179d;
/* 52 */                        if (index != i2 && R$styleable.Constraint_android_layout_marginStart != index && R$styleable.Constraint_android_layout_marginEnd != index) {
/* 62 */                            c2312vz.f18389a = true;
/* 64 */                            c2274uz.f17773b = true;
/* 66 */                            c2349wz.f18870a = true;
/* 68 */                            c2479xz.f19406a = true;
                                }
/* 70 */                        SparseIntArray sparseIntArray = f1185h;
                                switch (sparseIntArray.get(index)) {
                                    case 1:
/* 1122 */                              c2274uz.f17803q = m532l(typedArrayObtainStyledAttributes, index, c2274uz.f17803q);
                                        break;
                                    case 2:
/* 1113 */                              c2274uz.f17754J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c2274uz.f17754J);
                                        break;
                                    case 3:
/* 1104 */                              c2274uz.f17801p = m532l(typedArrayObtainStyledAttributes, index, c2274uz.f17801p);
                                        break;
                                    case 4:
/* 1095 */                              c2274uz.f17799o = m532l(typedArrayObtainStyledAttributes, index, c2274uz.f17799o);
                                        break;
                                    case 5:
/* 1086 */                              c2274uz.f17812z = typedArrayObtainStyledAttributes.getString(index);
                                        break;
                                    case 6:
/* 1079 */                              c2274uz.f17748D = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c2274uz.f17748D);
                                        break;
                                    case 7:
/* 1070 */                              c2274uz.f17749E = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c2274uz.f17749E);
                                        break;
                                    case 8:
/* 1061 */                              c2274uz.f17755K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c2274uz.f17755K);
                                        break;
                                    case 9:
/* 1052 */                              c2274uz.f17809w = m532l(typedArrayObtainStyledAttributes, index, c2274uz.f17809w);
                                        break;
                                    case 10:
/* 1043 */                              c2274uz.f17808v = m532l(typedArrayObtainStyledAttributes, index, c2274uz.f17808v);
                                        break;
                                    case 11:
/* 1034 */                              c2274uz.f17761Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c2274uz.f17761Q);
                                        break;
                                    case 12:
/* 1025 */                              c2274uz.f17762R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c2274uz.f17762R);
                                        break;
                                    case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 1015 */                              c2274uz.f17758N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c2274uz.f17758N);
                                        break;
                                    case 14:
/* 1005 */                              c2274uz.f17760P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c2274uz.f17760P);
                                        break;
                                    case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 995 */                               c2274uz.f17763S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c2274uz.f17763S);
                                        break;
                                    case 16:
/* 985 */                               c2274uz.f17759O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c2274uz.f17759O);
                                        break;
                                    case 17:
/* 975 */                               c2274uz.f17779e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c2274uz.f17779e);
                                        break;
                                    case 18:
/* 965 */                               c2274uz.f17781f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c2274uz.f17781f);
                                        break;
                                    case 19:
/* 955 */                               c2274uz.f17783g = typedArrayObtainStyledAttributes.getFloat(index, c2274uz.f17783g);
                                        break;
                                    case 20:
/* 945 */                               c2274uz.f17810x = typedArrayObtainStyledAttributes.getFloat(index, c2274uz.f17810x);
                                        break;
                                    case Build.API_LEVELS.API_21 /* 21 */:
/* 935 */                               c2274uz.f17777d = typedArrayObtainStyledAttributes.getLayoutDimension(index, c2274uz.f17777d);
                                        break;
                                    case Build.API_LEVELS.API_22 /* 22 */:
/* 915 */                               int i3 = typedArrayObtainStyledAttributes.getInt(index, c2349wz.f18871b);
/* 919 */                               c2349wz.f18871b = i3;
/* 925 */                               c2349wz.f18871b = f1184g[i3];
                                        break;
                                    case Build.API_LEVELS.API_23 /* 23 */:
/* 909 */                               c2274uz.f17775c = typedArrayObtainStyledAttributes.getLayoutDimension(index, c2274uz.f17775c);
                                        break;
                                    case 24:
/* 899 */                               c2274uz.f17751G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c2274uz.f17751G);
                                        break;
                                    case Build.API_LEVELS.API_25 /* 25 */:
/* 889 */                               c2274uz.f17787i = m532l(typedArrayObtainStyledAttributes, index, c2274uz.f17787i);
                                        break;
                                    case Build.API_LEVELS.API_26 /* 26 */:
/* 879 */                               c2274uz.f17789j = m532l(typedArrayObtainStyledAttributes, index, c2274uz.f17789j);
                                        break;
                                    case Build.API_LEVELS.API_27 /* 27 */:
/* 869 */                               c2274uz.f17750F = typedArrayObtainStyledAttributes.getInt(index, c2274uz.f17750F);
                                        break;
                                    case Build.API_LEVELS.API_28 /* 28 */:
/* 859 */                               c2274uz.f17752H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c2274uz.f17752H);
                                        break;
                                    case Build.API_LEVELS.API_29 /* 29 */:
/* 849 */                               c2274uz.f17791k = m532l(typedArrayObtainStyledAttributes, index, c2274uz.f17791k);
                                        break;
                                    case Build.API_LEVELS.API_30 /* 30 */:
/* 839 */                               c2274uz.f17793l = m532l(typedArrayObtainStyledAttributes, index, c2274uz.f17793l);
                                        break;
                                    case Build.API_LEVELS.API_31 /* 31 */:
/* 829 */                               c2274uz.f17756L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c2274uz.f17756L);
                                        break;
                                    case 32:
/* 819 */                               c2274uz.f17806t = m532l(typedArrayObtainStyledAttributes, index, c2274uz.f17806t);
                                        break;
                                    case Build.API_LEVELS.API_33 /* 33 */:
/* 809 */                               c2274uz.f17807u = m532l(typedArrayObtainStyledAttributes, index, c2274uz.f17807u);
                                        break;
                                    case Build.API_LEVELS.API_34 /* 34 */:
/* 799 */                               c2274uz.f17753I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c2274uz.f17753I);
                                        break;
                                    case Build.API_LEVELS.API_35 /* 35 */:
/* 789 */                               c2274uz.f17797n = m532l(typedArrayObtainStyledAttributes, index, c2274uz.f17797n);
                                        break;
                                    case Build.API_LEVELS.API_36 /* 36 */:
/* 779 */                               c2274uz.f17795m = m532l(typedArrayObtainStyledAttributes, index, c2274uz.f17795m);
                                        break;
                                    case 37:
/* 769 */                               c2274uz.f17811y = typedArrayObtainStyledAttributes.getFloat(index, c2274uz.f17811y);
                                        break;
                                    case 38:
/* 759 */                               c0076c.f1176a = typedArrayObtainStyledAttributes.getResourceId(index, c0076c.f1176a);
                                        break;
                                    case 39:
/* 749 */                               c2274uz.f17766V = typedArrayObtainStyledAttributes.getFloat(index, c2274uz.f17766V);
                                        break;
                                    case RequestError.NETWORK_FAILURE /* 40 */:
/* 739 */                               c2274uz.f17765U = typedArrayObtainStyledAttributes.getFloat(index, c2274uz.f17765U);
                                        break;
                                    case RequestError.NO_DEV_KEY /* 41 */:
/* 729 */                               c2274uz.f17767W = typedArrayObtainStyledAttributes.getInt(index, c2274uz.f17767W);
                                        break;
                                    case 42:
/* 719 */                               c2274uz.f17768X = typedArrayObtainStyledAttributes.getInt(index, c2274uz.f17768X);
                                        break;
                                    case 43:
/* 709 */                               c2349wz.f18873d = typedArrayObtainStyledAttributes.getFloat(index, c2349wz.f18873d);
                                        break;
                                    case 44:
/* 691 */                               c2479xz.f19418m = true;
/* 699 */                               c2479xz.f19419n = typedArrayObtainStyledAttributes.getDimension(index, c2479xz.f19419n);
                                        break;
                                    case 45:
/* 687 */                               c2479xz.f19408c = typedArrayObtainStyledAttributes.getFloat(index, c2479xz.f19408c);
                                        break;
                                    case 46:
/* 677 */                               c2479xz.f19409d = typedArrayObtainStyledAttributes.getFloat(index, c2479xz.f19409d);
                                        break;
                                    case 47:
/* 667 */                               c2479xz.f19410e = typedArrayObtainStyledAttributes.getFloat(index, c2479xz.f19410e);
                                        break;
                                    case 48:
/* 657 */                               c2479xz.f19411f = typedArrayObtainStyledAttributes.getFloat(index, c2479xz.f19411f);
                                        break;
                                    case 49:
/* 647 */                               c2479xz.f19412g = typedArrayObtainStyledAttributes.getDimension(index, c2479xz.f19412g);
                                        break;
                                    case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
/* 637 */                               c2479xz.f19413h = typedArrayObtainStyledAttributes.getDimension(index, c2479xz.f19413h);
                                        break;
                                    case 51:
/* 627 */                               c2479xz.f19415j = typedArrayObtainStyledAttributes.getDimension(index, c2479xz.f19415j);
                                        break;
                                    case 52:
/* 617 */                               c2479xz.f19416k = typedArrayObtainStyledAttributes.getDimension(index, c2479xz.f19416k);
                                        break;
                                    case 53:
/* 607 */                               c2479xz.f19417l = typedArrayObtainStyledAttributes.getDimension(index, c2479xz.f19417l);
                                        break;
                                    case 54:
/* 597 */                               c2274uz.f17769Y = typedArrayObtainStyledAttributes.getInt(index, c2274uz.f17769Y);
                                        break;
                                    case 55:
/* 587 */                               c2274uz.f17770Z = typedArrayObtainStyledAttributes.getInt(index, c2274uz.f17770Z);
                                        break;
                                    case 56:
/* 577 */                               c2274uz.f17772a0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c2274uz.f17772a0);
                                        break;
                                    case 57:
/* 567 */                               c2274uz.f17774b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c2274uz.f17774b0);
                                        break;
                                    case 58:
/* 557 */                               c2274uz.f17776c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c2274uz.f17776c0);
                                        break;
                                    case 59:
/* 547 */                               c2274uz.f17778d0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c2274uz.f17778d0);
                                        break;
                                    case 60:
/* 537 */                               c2479xz.f19407b = typedArrayObtainStyledAttributes.getFloat(index, c2479xz.f19407b);
                                        break;
                                    case 61:
/* 527 */                               c2274uz.f17745A = m532l(typedArrayObtainStyledAttributes, index, c2274uz.f17745A);
                                        break;
                                    case 62:
/* 517 */                               c2274uz.f17746B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c2274uz.f17746B);
                                        break;
                                    case 63:
/* 507 */                               c2274uz.f17747C = typedArrayObtainStyledAttributes.getFloat(index, c2274uz.f17747C);
                                        break;
                                    case 64:
/* 497 */                               c2312vz.f18390b = m532l(typedArrayObtainStyledAttributes, index, c2312vz.f18390b);
                                        break;
                                    case 65:
/* 469 */                               if (typedArrayObtainStyledAttributes.peekValue(index).type != 3) {
/* 487 */                                   c2312vz.f18392d = C2131r4.f15856k[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                                        } else {
/* 475 */                                   c2312vz.f18392d = typedArrayObtainStyledAttributes.getString(index);
                                        }
                                        break;
                                    case 66:
/* 459 */                               c2312vz.f18394f = typedArrayObtainStyledAttributes.getInt(index, 0);
                                        break;
                                    case 67:
/* 451 */                               c2312vz.f18396h = typedArrayObtainStyledAttributes.getFloat(index, c2312vz.f18396h);
                                        break;
                                    case 68:
/* 441 */                               c2349wz.f18874e = typedArrayObtainStyledAttributes.getFloat(index, c2349wz.f18874e);
                                        break;
                                    case 69:
/* 431 */                               c2274uz.f17780e0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 70:
/* 421 */                               c2274uz.f17782f0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 71:
/* 410 */                               AbstractC1245n0.m4876d("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                        break;
                                    case 72:
/* 404 */                               c2274uz.f17784g0 = typedArrayObtainStyledAttributes.getInt(index, c2274uz.f17784g0);
                                        break;
                                    case 73:
/* 394 */                               c2274uz.f17786h0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c2274uz.f17786h0);
                                        break;
                                    case 74:
/* 384 */                               c2274uz.f17792k0 = typedArrayObtainStyledAttributes.getString(index);
                                        break;
                                    case 75:
/* 376 */                               c2274uz.f17800o0 = typedArrayObtainStyledAttributes.getBoolean(index, c2274uz.f17800o0);
                                        break;
                                    case 76:
/* 366 */                               c2312vz.f18393e = typedArrayObtainStyledAttributes.getInt(index, c2312vz.f18393e);
                                        break;
                                    case 77:
/* 356 */                               c2274uz.f17794l0 = typedArrayObtainStyledAttributes.getString(index);
                                        break;
                                    case 78:
/* 348 */                               c2349wz.f18872c = typedArrayObtainStyledAttributes.getInt(index, c2349wz.f18872c);
                                        break;
                                    case 79:
/* 338 */                               c2312vz.f18395g = typedArrayObtainStyledAttributes.getFloat(index, c2312vz.f18395g);
                                        break;
                                    case 80:
/* 328 */                               c2274uz.f17796m0 = typedArrayObtainStyledAttributes.getBoolean(index, c2274uz.f17796m0);
                                        break;
                                    case 81:
/* 318 */                               c2274uz.f17798n0 = typedArrayObtainStyledAttributes.getBoolean(index, c2274uz.f17798n0);
                                        break;
                                    case 82:
/* 308 */                               c2312vz.f18391c = typedArrayObtainStyledAttributes.getInteger(index, c2312vz.f18391c);
                                        break;
                                    case 83:
/* 298 */                               c2479xz.f19414i = m532l(typedArrayObtainStyledAttributes, index, c2479xz.f19414i);
                                        break;
                                    case 84:
/* 288 */                               c2312vz.f18398j = typedArrayObtainStyledAttributes.getInteger(index, c2312vz.f18398j);
                                        break;
                                    case 85:
/* 278 */                               c2312vz.f18397i = typedArrayObtainStyledAttributes.getFloat(index, c2312vz.f18397i);
                                        break;
                                    case 86:
/* 214 */                               int i4 = typedArrayObtainStyledAttributes.peekValue(index).type;
/* 218 */                               if (i4 == 1) {
/* 220 */                                   int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
/* 224 */                                   c2312vz.f18401m = resourceId;
/* 226 */                                   if (resourceId != -1) {
/* 228 */                                       c2312vz.f18400l = -2;
                                            }
                                        } else if (i4 != 3) {
/* 268 */                                   c2312vz.f18400l = typedArrayObtainStyledAttributes.getInteger(index, c2312vz.f18401m);
                                        } else {
/* 234 */                                   String string = typedArrayObtainStyledAttributes.getString(index);
/* 238 */                                   c2312vz.f18399k = string;
/* 246 */                                   if (string.indexOf("/") <= 0) {
/* 258 */                                       c2312vz.f18400l = -1;
                                            } else {
/* 252 */                                       c2312vz.f18401m = typedArrayObtainStyledAttributes.getResourceId(index, -1);
/* 254 */                                       c2312vz.f18400l = -2;
                                            }
                                        }
                                        break;
                                    case 87:
/* 205 */                               AbstractC1245n0.m4889q("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                                        break;
                                    case 88:
                                    case 89:
                                    case 90:
                                    default:
/* 112 */                               AbstractC1245n0.m4889q("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                                        break;
                                    case 91:
/* 173 */                               c2274uz.f17804r = m532l(typedArrayObtainStyledAttributes, index, c2274uz.f17804r);
                                        break;
                                    case 92:
/* 163 */                               c2274uz.f17805s = m532l(typedArrayObtainStyledAttributes, index, c2274uz.f17805s);
                                        break;
                                    case 93:
/* 153 */                               c2274uz.f17757M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c2274uz.f17757M);
                                        break;
                                    case 94:
/* 143 */                               c2274uz.f17764T = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c2274uz.f17764T);
                                        break;
                                    case 95:
/* 132 */                               m533m(c2274uz, typedArrayObtainStyledAttributes, index, 0);
                                        break;
                                    case 96:
/* 127 */                               m533m(c2274uz, typedArrayObtainStyledAttributes, index, 1);
                                        break;
                                    case 97:
/* 123 */                               c2274uz.f17802p0 = typedArrayObtainStyledAttributes.getInt(index, c2274uz.f17802p0);
                                        break;
                                }
/* 1124 */                      i++;
                            } else if (c2274uz.f17792k0 != null) {
/* 1133 */                      c2274uz.f17790j0 = null;
                            }
                        }
                    }
/* 1135 */          typedArrayObtainStyledAttributes.recycle();
/* 1138 */          return c0076c;
                }

                /* JADX INFO: renamed from: l */
                public static int m532l(TypedArray typedArray, int i, int i2) {
/* 1 */             int resourceId = typedArray.getResourceId(i, i2);
                    return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
                }

                /* JADX WARN: Code duplicated, block: B:123:? A[RETURN, SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:20:0x0036  */
                /* JADX WARN: Code duplicated, block: B:22:0x003a  */
                /* JADX WARN: Code duplicated, block: B:24:0x003f  */
                /* JADX WARN: Code duplicated, block: B:26:0x0044  */
                /* JADX WARN: Code duplicated, block: B:28:0x0048  */
                /* JADX WARN: Code duplicated, block: B:30:0x004c  */
                /* JADX WARN: Code duplicated, block: B:32:0x0051  */
                /* JADX WARN: Code duplicated, block: B:34:0x0056  */
                /* JADX WARN: Code duplicated, block: B:36:0x005a  */
                /* JADX WARN: Code duplicated, block: B:38:0x005e  */
                /* JADX WARN: Code duplicated, block: B:40:0x0067  */
                /* JADX INFO: renamed from: m */
                public static void m533m(Object obj, TypedArray typedArray, int i, int i2) {
                    int dimensionPixelSize;
                    C2236tz c2236tz;
                    C2274uz c2274uz;
                    ConstraintLayout.LayoutParams layoutParams;
/* 1 */             if (obj == null) {
/* 370 */               return;
                    }
/* 9 */             int i3 = typedArray.peekValue(i).type;
/* 16 */            boolean z = true;
/* 18 */            int i4 = 0;
/* 19 */            if (i3 != 3) {
/* 21 */                if (i3 != 5) {
/* 23 */                    dimensionPixelSize = typedArray.getInt(i, 0);
/* 29 */                    if (dimensionPixelSize == -4) {
/* 44 */                        i4 = -2;
                            } else if (dimensionPixelSize == -3 || (dimensionPixelSize != -2 && dimensionPixelSize != -1)) {
/* 39 */                        z = false;
                            }
/* 53 */                    if (obj instanceof ConstraintLayout.LayoutParams) {
/* 55 */                        layoutParams = (ConstraintLayout.LayoutParams) obj;
/* 57 */                        if (i2 == 0) {
/* 59 */                            ((ViewGroup.MarginLayoutParams) layoutParams).width = i4;
/* 61 */                            layoutParams.f1092W = z;
/* 63 */                            return;
                                } else {
/* 64 */                            ((ViewGroup.MarginLayoutParams) layoutParams).height = i4;
/* 66 */                            layoutParams.f1093X = z;
/* 68 */                            return;
                                }
                            }
/* 71 */                    if (obj instanceof C2274uz) {
/* 73 */                        c2274uz = (C2274uz) obj;
/* 75 */                        if (i2 == 0) {
/* 77 */                            c2274uz.f17775c = i4;
/* 79 */                            c2274uz.f17796m0 = z;
/* 81 */                            return;
                                } else {
/* 82 */                            c2274uz.f17777d = i4;
/* 84 */                            c2274uz.f17798n0 = z;
/* 86 */                            return;
                                }
                            }
/* 89 */                    if (obj instanceof C2236tz) {
/* 91 */                        c2236tz = (C2236tz) obj;
/* 93 */                        if (i2 == 0) {
/* 95 */                            c2236tz.m8927b(23, i4);
/* 100 */                           c2236tz.m8929d(80, z);
/* 103 */                           return;
                                } else {
/* 104 */                           c2236tz.m8927b(21, i4);
/* 109 */                           c2236tz.m8929d(81, z);
/* 112 */                           return;
                                }
                            }
/* 370 */                   return;
                        }
/* 46 */                dimensionPixelSize = typedArray.getDimensionPixelSize(i, 0);
/* 41 */                z = false;
/* 42 */                i4 = dimensionPixelSize;
/* 53 */                if (obj instanceof ConstraintLayout.LayoutParams) {
/* 55 */                    layoutParams = (ConstraintLayout.LayoutParams) obj;
/* 57 */                    if (i2 == 0) {
/* 59 */                        ((ViewGroup.MarginLayoutParams) layoutParams).width = i4;
/* 61 */                        layoutParams.f1092W = z;
/* 63 */                        return;
                            } else {
/* 64 */                        ((ViewGroup.MarginLayoutParams) layoutParams).height = i4;
/* 66 */                        layoutParams.f1093X = z;
/* 68 */                        return;
                            }
                        }
/* 71 */                if (obj instanceof C2274uz) {
/* 73 */                    c2274uz = (C2274uz) obj;
/* 75 */                    if (i2 == 0) {
/* 77 */                        c2274uz.f17775c = i4;
/* 79 */                        c2274uz.f17796m0 = z;
/* 81 */                        return;
                            } else {
/* 82 */                        c2274uz.f17777d = i4;
/* 84 */                        c2274uz.f17798n0 = z;
/* 86 */                        return;
                            }
                        }
/* 89 */                if (obj instanceof C2236tz) {
/* 91 */                    c2236tz = (C2236tz) obj;
/* 93 */                    if (i2 == 0) {
/* 95 */                        c2236tz.m8927b(23, i4);
/* 100 */                       c2236tz.m8929d(80, z);
/* 103 */                       return;
                            } else {
/* 104 */                       c2236tz.m8927b(21, i4);
/* 109 */                       c2236tz.m8929d(81, z);
/* 112 */                       return;
                            }
                        }
/* 370 */               return;
                    }
/* 113 */           String string = typedArray.getString(i);
/* 117 */           if (string == null) {
/* 370 */               return;
                    }
/* 123 */           int iIndexOf = string.indexOf(61);
/* 127 */           int length = string.length();
/* 131 */           if (iIndexOf <= 0 || iIndexOf >= length - 1) {
/* 370 */               return;
                    }
/* 136 */           String strSubstring = string.substring(0, iIndexOf);
/* 141 */           String strSubstring2 = string.substring(iIndexOf + 1);
/* 149 */           if (strSubstring2.length() > 0) {
/* 151 */               String strTrim = strSubstring.trim();
/* 155 */               String strTrim2 = strSubstring2.trim();
/* 165 */               if ("ratio".equalsIgnoreCase(strTrim)) {
/* 169 */                   if (obj instanceof ConstraintLayout.LayoutParams) {
/* 171 */                       ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) obj;
/* 173 */                       if (i2 == 0) {
/* 175 */                           ((ViewGroup.MarginLayoutParams) layoutParams2).width = 0;
                                } else {
/* 178 */                           ((ViewGroup.MarginLayoutParams) layoutParams2).height = 0;
                                }
/* 180 */                       m534n(layoutParams2, strTrim2);
/* 183 */                       return;
                            }
/* 186 */                   if (obj instanceof C2274uz) {
/* 190 */                       ((C2274uz) obj).f17812z = strTrim2;
/* 192 */                       return;
                            } else {
/* 195 */                       if (obj instanceof C2236tz) {
/* 199 */                           ((C2236tz) obj).m8928c(5, strTrim2);
/* 202 */                           return;
                                }
/* 370 */                       return;
                            }
                        }
                        try {
/* 209 */                   if ("weight".equalsIgnoreCase(strTrim)) {
/* 211 */                       float f = Float.parseFloat(strTrim2);
/* 217 */                       if (obj instanceof ConstraintLayout.LayoutParams) {
/* 219 */                           ConstraintLayout.LayoutParams layoutParams3 = (ConstraintLayout.LayoutParams) obj;
/* 221 */                           if (i2 == 0) {
/* 223 */                               ((ViewGroup.MarginLayoutParams) layoutParams3).width = 0;
/* 225 */                               layoutParams3.f1077H = f;
/* 227 */                               return;
                                    } else {
/* 228 */                               ((ViewGroup.MarginLayoutParams) layoutParams3).height = 0;
/* 230 */                               layoutParams3.f1078I = f;
/* 232 */                               return;
                                    }
                                }
/* 235 */                       if (obj instanceof C2274uz) {
/* 237 */                           C2274uz c2274uz2 = (C2274uz) obj;
/* 239 */                           if (i2 == 0) {
/* 241 */                               c2274uz2.f17775c = 0;
/* 243 */                               c2274uz2.f17766V = f;
/* 245 */                               return;
                                    } else {
/* 246 */                               c2274uz2.f17777d = 0;
/* 248 */                               c2274uz2.f17765U = f;
/* 250 */                               return;
                                    }
                                }
/* 253 */                       if (obj instanceof C2236tz) {
/* 255 */                           C2236tz c2236tz2 = (C2236tz) obj;
/* 257 */                           if (i2 == 0) {
/* 259 */                               c2236tz2.m8927b(23, 0);
/* 264 */                               c2236tz2.m8926a(f, 39);
/* 267 */                               return;
                                    } else {
/* 268 */                               c2236tz2.m8927b(21, 0);
/* 273 */                               c2236tz2.m8926a(f, 40);
/* 276 */                               return;
                                    }
                                }
/* 370 */                       return;
                            }
/* 283 */                   if ("parent".equalsIgnoreCase(strTrim)) {
/* 296 */                       float fMax = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(strTrim2)));
/* 303 */                       if (obj instanceof ConstraintLayout.LayoutParams) {
/* 305 */                           ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) obj;
/* 307 */                           if (i2 == 0) {
/* 309 */                               ((ViewGroup.MarginLayoutParams) layoutParams4).width = 0;
/* 311 */                               layoutParams4.f1087R = fMax;
/* 313 */                               layoutParams4.f1081L = 2;
/* 315 */                               return;
                                    } else {
/* 316 */                               ((ViewGroup.MarginLayoutParams) layoutParams4).height = 0;
/* 318 */                               layoutParams4.f1088S = fMax;
/* 320 */                               layoutParams4.f1082M = 2;
/* 322 */                               return;
                                    }
                                }
/* 325 */                       if (obj instanceof C2274uz) {
/* 327 */                           C2274uz c2274uz3 = (C2274uz) obj;
/* 329 */                           if (i2 == 0) {
/* 331 */                               c2274uz3.f17775c = 0;
/* 333 */                               c2274uz3.f17780e0 = fMax;
/* 335 */                               c2274uz3.f17769Y = 2;
/* 337 */                               return;
                                    } else {
/* 338 */                               c2274uz3.f17777d = 0;
/* 340 */                               c2274uz3.f17782f0 = fMax;
/* 342 */                               c2274uz3.f17770Z = 2;
/* 344 */                               return;
                                    }
                                }
/* 347 */                       if (obj instanceof C2236tz) {
/* 349 */                           C2236tz c2236tz3 = (C2236tz) obj;
/* 351 */                           if (i2 == 0) {
/* 353 */                               c2236tz3.m8927b(23, 0);
/* 358 */                               c2236tz3.m8927b(54, 2);
                                    } else {
/* 362 */                               c2236tz3.m8927b(21, 0);
/* 367 */                               c2236tz3.m8927b(55, 2);
                                    }
                                }
                            }
                        } catch (NumberFormatException unused) {
                        }
                    }
                }

                /* JADX INFO: renamed from: n */
                public static void m534n(ConstraintLayout.LayoutParams layoutParams, String str) {
/* 1 */             if (str != null) {
/* 3 */                 int length = str.length();
/* 9 */                 int iIndexOf = str.indexOf(44);
/* 13 */                int i = 0;
/* 15 */                int i2 = -1;
/* 16 */                if (iIndexOf > 0 && iIndexOf < length - 1) {
/* 22 */                    String strSubstring = str.substring(0, iIndexOf);
/* 32 */                    if (!strSubstring.equalsIgnoreCase("W")) {
/* 45 */                        i = strSubstring.equalsIgnoreCase("H") ? 1 : -1;
                            }
/* 47 */                    i2 = i;
/* 46 */                    i = iIndexOf + 1;
                        }
/* 51 */                int iIndexOf2 = str.indexOf(58);
                        try {
/* 55 */                    if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
/* 110 */                       String strSubstring2 = str.substring(i);
/* 118 */                       if (strSubstring2.length() > 0) {
/* 120 */                           Float.parseFloat(strSubstring2);
                                }
                            } else {
/* 60 */                        String strSubstring3 = str.substring(i, iIndexOf2);
/* 65 */                        String strSubstring4 = str.substring(iIndexOf2 + 1);
/* 73 */                        if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
/* 81 */                            float f = Float.parseFloat(strSubstring3);
/* 85 */                            float f2 = Float.parseFloat(strSubstring4);
/* 92 */                            if (f > 0.0f && f2 > 0.0f) {
/* 98 */                                if (i2 == 1) {
/* 101 */                                   Math.abs(f2 / f);
                                        } else {
/* 106 */                                   Math.abs(f / f2);
                                        }
                                    }
                                }
                            }
                        } catch (NumberFormatException unused) {
                        }
                    }
/* 123 */           layoutParams.f1076G = str;
                }

                /* JADX INFO: renamed from: o */
                public static void m535o(C0076c c0076c, TypedArray typedArray) {
                    char c;
/* 5 */             int indexCount = typedArray.getIndexCount();
/* 11 */            C2236tz c2236tz = new C2236tz();
/* 18 */            c2236tz.f17306a = new int[10];
/* 22 */            c2236tz.f17307b = new int[10];
/* 25 */            c2236tz.f17308c = 0;
/* 29 */            c2236tz.f17309d = new int[10];
/* 33 */            c2236tz.f17310e = new float[10];
/* 35 */            c2236tz.f17311f = 0;
/* 40 */            c2236tz.f17312g = new int[5];
/* 44 */            c2236tz.f17313h = new String[5];
/* 46 */            c2236tz.f17314i = 0;
/* 51 */            c2236tz.f17315j = new int[4];
/* 55 */            c2236tz.f17316k = new boolean[4];
/* 57 */            c2236tz.f17317l = 0;
/* 59 */            c0076c.f1183h = c2236tz;
/* 61 */            C2312vz c2312vz = c0076c.f1179d;
/* 63 */            c2312vz.f18389a = false;
/* 65 */            C2274uz c2274uz = c0076c.f1180e;
/* 67 */            c2274uz.f17773b = false;
/* 69 */            C2349wz c2349wz = c0076c.f1178c;
/* 71 */            c2349wz.f18870a = false;
/* 73 */            C2479xz c2479xz = c0076c.f1181f;
/* 75 */            c2479xz.f19406a = false;
/* 78 */            for (int i = 0; i < indexCount; i++) {
/* 80 */                int index = typedArray.getIndex(i);
/* 86 */                int i2 = f1186i.get(index);
/* 90 */                SparseIntArray sparseIntArray = f1185h;
                        switch (i2) {
                            case 2:
/* 1341 */                      c = 5;
/* 1349 */                      c2236tz.m8927b(2, typedArray.getDimensionPixelSize(index, c2274uz.f17754J));
                                break;
                            case 3:
                            case 4:
                            case 9:
                            case 10:
                            case Build.API_LEVELS.API_25 /* 25 */:
                            case Build.API_LEVELS.API_26 /* 26 */:
                            case Build.API_LEVELS.API_29 /* 29 */:
                            case Build.API_LEVELS.API_30 /* 30 */:
                            case 32:
                            case Build.API_LEVELS.API_33 /* 33 */:
                            case Build.API_LEVELS.API_35 /* 35 */:
                            case Build.API_LEVELS.API_36 /* 36 */:
                            case 61:
                            case 88:
                            case 89:
                            case 90:
                            case 91:
                            case 92:
                            default:
/* 129 */                       AbstractC1245n0.m4889q("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
/* 133 */                       c = 5;
                                break;
                            case 5:
/* 1335 */                      c = 5;
/* 1336 */                      c2236tz.m8928c(5, typedArray.getString(index));
                                break;
                            case 6:
/* 1325 */                      c2236tz.m8927b(6, typedArray.getDimensionPixelOffset(index, c2274uz.f17748D));
/* 133 */                       c = 5;
                                break;
                            case 7:
/* 1312 */                      c2236tz.m8927b(7, typedArray.getDimensionPixelOffset(index, c2274uz.f17749E));
/* 133 */                       c = 5;
                                break;
                            case 8:
/* 1299 */                      c2236tz.m8927b(8, typedArray.getDimensionPixelSize(index, c2274uz.f17755K));
/* 133 */                       c = 5;
                                break;
                            case 11:
/* 1285 */                      c2236tz.m8927b(11, typedArray.getDimensionPixelSize(index, c2274uz.f17761Q));
/* 133 */                       c = 5;
                                break;
                            case 12:
/* 1271 */                      c2236tz.m8927b(12, typedArray.getDimensionPixelSize(index, c2274uz.f17762R));
/* 133 */                       c = 5;
                                break;
                            case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 1257 */                      c2236tz.m8927b(13, typedArray.getDimensionPixelSize(index, c2274uz.f17758N));
/* 133 */                       c = 5;
                                break;
                            case 14:
/* 1243 */                      c2236tz.m8927b(14, typedArray.getDimensionPixelSize(index, c2274uz.f17760P));
/* 133 */                       c = 5;
                                break;
                            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 1229 */                      c2236tz.m8927b(15, typedArray.getDimensionPixelSize(index, c2274uz.f17763S));
/* 133 */                       c = 5;
                                break;
                            case 16:
/* 1215 */                      c2236tz.m8927b(16, typedArray.getDimensionPixelSize(index, c2274uz.f17759O));
/* 133 */                       c = 5;
                                break;
                            case 17:
/* 1201 */                      c2236tz.m8927b(17, typedArray.getDimensionPixelOffset(index, c2274uz.f17779e));
/* 133 */                       c = 5;
                                break;
                            case 18:
/* 1187 */                      c2236tz.m8927b(18, typedArray.getDimensionPixelOffset(index, c2274uz.f17781f));
/* 133 */                       c = 5;
                                break;
                            case 19:
/* 1173 */                      c2236tz.m8926a(typedArray.getFloat(index, c2274uz.f17783g), 19);
/* 133 */                       c = 5;
                                break;
                            case 20:
/* 1159 */                      c2236tz.m8926a(typedArray.getFloat(index, c2274uz.f17810x), 20);
/* 133 */                       c = 5;
                                break;
                            case Build.API_LEVELS.API_21 /* 21 */:
/* 1145 */                      c2236tz.m8927b(21, typedArray.getLayoutDimension(index, c2274uz.f17777d));
/* 133 */                       c = 5;
                                break;
                            case Build.API_LEVELS.API_22 /* 22 */:
/* 1131 */                      c2236tz.m8927b(22, f1184g[typedArray.getInt(index, c2349wz.f18871b)]);
/* 133 */                       c = 5;
                                break;
                            case Build.API_LEVELS.API_23 /* 23 */:
/* 1113 */                      c2236tz.m8927b(23, typedArray.getLayoutDimension(index, c2274uz.f17775c));
/* 133 */                       c = 5;
                                break;
                            case 24:
/* 1099 */                      c2236tz.m8927b(24, typedArray.getDimensionPixelSize(index, c2274uz.f17751G));
/* 133 */                       c = 5;
                                break;
                            case Build.API_LEVELS.API_27 /* 27 */:
/* 1085 */                      c2236tz.m8927b(27, typedArray.getInt(index, c2274uz.f17750F));
/* 133 */                       c = 5;
                                break;
                            case Build.API_LEVELS.API_28 /* 28 */:
/* 1071 */                      c2236tz.m8927b(28, typedArray.getDimensionPixelSize(index, c2274uz.f17752H));
/* 133 */                       c = 5;
                                break;
                            case Build.API_LEVELS.API_31 /* 31 */:
/* 1057 */                      c2236tz.m8927b(31, typedArray.getDimensionPixelSize(index, c2274uz.f17756L));
/* 133 */                       c = 5;
                                break;
                            case Build.API_LEVELS.API_34 /* 34 */:
/* 1043 */                      c2236tz.m8927b(34, typedArray.getDimensionPixelSize(index, c2274uz.f17753I));
/* 133 */                       c = 5;
                                break;
                            case 37:
/* 1029 */                      c2236tz.m8926a(typedArray.getFloat(index, c2274uz.f17811y), 37);
/* 133 */                       c = 5;
                                break;
                            case 38:
/* 1007 */                      int resourceId = typedArray.getResourceId(index, c0076c.f1176a);
/* 1011 */                      c0076c.f1176a = resourceId;
/* 1015 */                      c2236tz.m8927b(38, resourceId);
/* 133 */                       c = 5;
                                break;
                            case 39:
/* 999 */                       c2236tz.m8926a(typedArray.getFloat(index, c2274uz.f17766V), 39);
/* 133 */                       c = 5;
                                break;
                            case RequestError.NETWORK_FAILURE /* 40 */:
/* 985 */                       c2236tz.m8926a(typedArray.getFloat(index, c2274uz.f17765U), 40);
/* 133 */                       c = 5;
                                break;
                            case RequestError.NO_DEV_KEY /* 41 */:
/* 971 */                       c2236tz.m8927b(41, typedArray.getInt(index, c2274uz.f17767W));
/* 133 */                       c = 5;
                                break;
                            case 42:
/* 957 */                       c2236tz.m8927b(42, typedArray.getInt(index, c2274uz.f17768X));
/* 133 */                       c = 5;
                                break;
                            case 43:
/* 943 */                       c2236tz.m8926a(typedArray.getFloat(index, c2349wz.f18873d), 43);
/* 133 */                       c = 5;
                                break;
                            case 44:
/* 920 */                       c2236tz.m8929d(44, true);
/* 929 */                       c2236tz.m8926a(typedArray.getDimension(index, c2479xz.f19419n), 44);
/* 133 */                       c = 5;
                                break;
                            case 45:
/* 911 */                       c2236tz.m8926a(typedArray.getFloat(index, c2479xz.f19408c), 45);
/* 133 */                       c = 5;
                                break;
                            case 46:
/* 897 */                       c2236tz.m8926a(typedArray.getFloat(index, c2479xz.f19409d), 46);
/* 133 */                       c = 5;
                                break;
                            case 47:
/* 883 */                       c2236tz.m8926a(typedArray.getFloat(index, c2479xz.f19410e), 47);
/* 133 */                       c = 5;
                                break;
                            case 48:
/* 869 */                       c2236tz.m8926a(typedArray.getFloat(index, c2479xz.f19411f), 48);
/* 133 */                       c = 5;
                                break;
                            case 49:
/* 855 */                       c2236tz.m8926a(typedArray.getDimension(index, c2479xz.f19412g), 49);
/* 133 */                       c = 5;
                                break;
                            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
/* 841 */                       c2236tz.m8926a(typedArray.getDimension(index, c2479xz.f19413h), 50);
/* 133 */                       c = 5;
                                break;
                            case 51:
/* 827 */                       c2236tz.m8926a(typedArray.getDimension(index, c2479xz.f19415j), 51);
/* 133 */                       c = 5;
                                break;
                            case 52:
/* 813 */                       c2236tz.m8926a(typedArray.getDimension(index, c2479xz.f19416k), 52);
/* 133 */                       c = 5;
                                break;
                            case 53:
/* 799 */                       c2236tz.m8926a(typedArray.getDimension(index, c2479xz.f19417l), 53);
/* 133 */                       c = 5;
                                break;
                            case 54:
/* 785 */                       c2236tz.m8927b(54, typedArray.getInt(index, c2274uz.f17769Y));
/* 133 */                       c = 5;
                                break;
                            case 55:
/* 771 */                       c2236tz.m8927b(55, typedArray.getInt(index, c2274uz.f17770Z));
/* 133 */                       c = 5;
                                break;
                            case 56:
/* 757 */                       c2236tz.m8927b(56, typedArray.getDimensionPixelSize(index, c2274uz.f17772a0));
/* 133 */                       c = 5;
                                break;
                            case 57:
/* 743 */                       c2236tz.m8927b(57, typedArray.getDimensionPixelSize(index, c2274uz.f17774b0));
/* 133 */                       c = 5;
                                break;
                            case 58:
/* 729 */                       c2236tz.m8927b(58, typedArray.getDimensionPixelSize(index, c2274uz.f17776c0));
/* 133 */                       c = 5;
                                break;
                            case 59:
/* 715 */                       c2236tz.m8927b(59, typedArray.getDimensionPixelSize(index, c2274uz.f17778d0));
/* 133 */                       c = 5;
                                break;
                            case 60:
/* 701 */                       c2236tz.m8926a(typedArray.getFloat(index, c2479xz.f19407b), 60);
/* 133 */                       c = 5;
                                break;
                            case 62:
/* 687 */                       c2236tz.m8927b(62, typedArray.getDimensionPixelSize(index, c2274uz.f17746B));
/* 133 */                       c = 5;
                                break;
                            case 63:
/* 673 */                       c2236tz.m8926a(typedArray.getFloat(index, c2274uz.f17747C), 63);
/* 133 */                       c = 5;
                                break;
                            case 64:
/* 659 */                       c2236tz.m8927b(64, m532l(typedArray, index, c2312vz.f18390b));
/* 133 */                       c = 5;
                                break;
                            case 65:
/* 626 */                       if (typedArray.peekValue(index).type == 3) {
/* 632 */                           c2236tz.m8928c(65, typedArray.getString(index));
                                } else {
/* 645 */                           c2236tz.m8928c(65, C2131r4.f15856k[typedArray.getInteger(index, 0)]);
                                }
/* 133 */                       c = 5;
                                break;
                            case 66:
/* 611 */                       c2236tz.m8927b(66, typedArray.getInt(index, 0));
/* 133 */                       c = 5;
                                break;
                            case 67:
/* 599 */                       c2236tz.m8926a(typedArray.getFloat(index, c2312vz.f18396h), 67);
/* 133 */                       c = 5;
                                break;
                            case 68:
/* 586 */                       c2236tz.m8926a(typedArray.getFloat(index, c2349wz.f18874e), 68);
/* 133 */                       c = 5;
                                break;
                            case 69:
/* 573 */                       c2236tz.m8926a(typedArray.getFloat(index, 1.0f), 69);
/* 133 */                       c = 5;
                                break;
                            case 70:
/* 560 */                       c2236tz.m8926a(typedArray.getFloat(index, 1.0f), 70);
/* 133 */                       c = 5;
                                break;
                            case 71:
/* 547 */                       AbstractC1245n0.m4876d("ConstraintSet", "CURRENTLY UNSUPPORTED");
/* 133 */                       c = 5;
                                break;
                            case 72:
/* 540 */                       c2236tz.m8927b(72, typedArray.getInt(index, c2274uz.f17784g0));
/* 133 */                       c = 5;
                                break;
                            case 73:
/* 527 */                       c2236tz.m8927b(73, typedArray.getDimensionPixelSize(index, c2274uz.f17786h0));
/* 133 */                       c = 5;
                                break;
                            case 74:
/* 514 */                       c2236tz.m8928c(74, typedArray.getString(index));
/* 133 */                       c = 5;
                                break;
                            case 75:
/* 503 */                       c2236tz.m8929d(75, typedArray.getBoolean(index, c2274uz.f17800o0));
/* 133 */                       c = 5;
                                break;
                            case 76:
/* 490 */                       c2236tz.m8927b(76, typedArray.getInt(index, c2312vz.f18393e));
/* 133 */                       c = 5;
                                break;
                            case 77:
/* 477 */                       c2236tz.m8928c(77, typedArray.getString(index));
/* 133 */                       c = 5;
                                break;
                            case 78:
/* 466 */                       c2236tz.m8927b(78, typedArray.getInt(index, c2349wz.f18872c));
/* 133 */                       c = 5;
                                break;
                            case 79:
/* 453 */                       c2236tz.m8926a(typedArray.getFloat(index, c2312vz.f18395g), 79);
/* 133 */                       c = 5;
                                break;
                            case 80:
/* 440 */                       c2236tz.m8929d(80, typedArray.getBoolean(index, c2274uz.f17796m0));
/* 133 */                       c = 5;
                                break;
                            case 81:
/* 427 */                       c2236tz.m8929d(81, typedArray.getBoolean(index, c2274uz.f17798n0));
/* 133 */                       c = 5;
                                break;
                            case 82:
/* 414 */                       c2236tz.m8927b(82, typedArray.getInteger(index, c2312vz.f18391c));
/* 133 */                       c = 5;
                                break;
                            case 83:
/* 401 */                       c2236tz.m8927b(83, m532l(typedArray, index, c2479xz.f19414i));
/* 133 */                       c = 5;
                                break;
                            case 84:
/* 388 */                       c2236tz.m8927b(84, typedArray.getInteger(index, c2312vz.f18398j));
/* 133 */                       c = 5;
                                break;
                            case 85:
/* 375 */                       c2236tz.m8926a(typedArray.getFloat(index, c2312vz.f18397i), 85);
/* 133 */                       c = 5;
                                break;
                            case 86:
/* 277 */                       int i3 = typedArray.peekValue(index).type;
/* 285 */                       if (i3 == 1) {
/* 287 */                           int resourceId2 = typedArray.getResourceId(index, -1);
/* 291 */                           c2312vz.f18401m = resourceId2;
/* 293 */                           c2236tz.m8927b(89, resourceId2);
/* 298 */                           if (c2312vz.f18401m != -1) {
/* 300 */                               c2312vz.f18400l = -2;
/* 302 */                               c2236tz.m8927b(88, -2);
                                    }
                                } else if (i3 == 3) {
/* 310 */                           String string = typedArray.getString(index);
/* 314 */                           c2312vz.f18399k = string;
/* 318 */                           c2236tz.m8928c(90, string);
/* 329 */                           if (c2312vz.f18399k.indexOf("/") > 0) {
/* 331 */                               int resourceId3 = typedArray.getResourceId(index, -1);
/* 335 */                               c2312vz.f18401m = resourceId3;
/* 337 */                               c2236tz.m8927b(89, resourceId3);
/* 340 */                               c2312vz.f18400l = -2;
/* 342 */                               c2236tz.m8927b(88, -2);
                                    } else {
/* 347 */                               c2312vz.f18400l = -1;
/* 349 */                               c2236tz.m8927b(88, -1);
                                    }
                                } else {
/* 356 */                           int integer = typedArray.getInteger(index, c2312vz.f18401m);
/* 360 */                           c2312vz.f18400l = integer;
/* 362 */                           c2236tz.m8927b(88, integer);
                                }
/* 133 */                       c = 5;
                                break;
                            case 87:
/* 268 */                       AbstractC1245n0.m4889q("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
/* 133 */                       c = 5;
                                break;
                            case 93:
/* 236 */                       c2236tz.m8927b(93, typedArray.getDimensionPixelSize(index, c2274uz.f17757M));
/* 133 */                       c = 5;
                                break;
                            case 94:
/* 224 */                       c2236tz.m8927b(94, typedArray.getDimensionPixelSize(index, c2274uz.f17764T));
/* 133 */                       c = 5;
                                break;
                            case 95:
/* 211 */                       m533m(c2236tz, typedArray, index, 0);
/* 133 */                       c = 5;
                                break;
                            case 96:
/* 206 */                       m533m(c2236tz, typedArray, index, 1);
/* 133 */                       c = 5;
                                break;
                            case 97:
/* 201 */                       c2236tz.m8927b(97, typedArray.getInt(index, c2274uz.f17802p0));
/* 133 */                       c = 5;
                                break;
                            case 98:
/* 150 */                       if (MotionLayout.f875s1) {
/* 154 */                           int resourceId4 = typedArray.getResourceId(index, c0076c.f1176a);
/* 158 */                           c0076c.f1176a = resourceId4;
/* 160 */                           if (resourceId4 == -1) {
/* 166 */                               c0076c.f1177b = typedArray.getString(index);
                                    }
                                } else if (typedArray.peekValue(index).type == 3) {
/* 181 */                           c0076c.f1177b = typedArray.getString(index);
                                } else {
/* 190 */                           c0076c.f1176a = typedArray.getResourceId(index, c0076c.f1176a);
                                }
/* 133 */                       c = 5;
                                break;
                            case 99:
/* 144 */                       c2236tz.m8929d(99, typedArray.getBoolean(index, c2274uz.f17785h));
/* 133 */                       c = 5;
                                break;
                        }
                    }
                }

                /* JADX INFO: renamed from: a */
                public final void m536a(MotionLayout motionLayout) {
                    C0076c c0076c;
/* 1 */             int childCount = motionLayout.getChildCount();
/* 6 */             for (int i = 0; i < childCount; i++) {
/* 8 */                 View childAt = motionLayout.getChildAt(i);
/* 12 */                int id = childAt.getId();
/* 16 */                Integer numValueOf = Integer.valueOf(id);
/* 20 */                HashMap map = this.f1192f;
/* 26 */                if (!map.containsKey(numValueOf)) {
/* 48 */                    AbstractC1245n0.m4889q("ConstraintSet", "id unknown " + de3.m3040v(childAt));
                        } else if (this.f1191e && id == -1) {
/* 62 */                    f42.m3663s("All children of ConstraintLayout must have ids to use ConstraintSet");
/* 65 */                    return;
                        } else if (map.containsKey(Integer.valueOf(id)) && (c0076c = (C0076c) map.get(Integer.valueOf(id))) != null) {
/* 91 */                    C2088pz.m7617e(childAt, c0076c.f1182g);
                        }
                    }
                }

                /* JADX INFO: renamed from: b */
                public final void m537b(ConstraintLayout constraintLayout) {
/* 1 */             m538c(constraintLayout);
/* 5 */             constraintLayout.setConstraintSet(null);
/* 8 */             constraintLayout.requestLayout();
                }

                /* JADX INFO: renamed from: c */
                public final void m538c(ConstraintLayout constraintLayout) {
/* 1 */             int childCount = constraintLayout.getChildCount();
/* 7 */             HashMap map = this.f1192f;
/* 13 */            HashSet<Integer> hashSet = new HashSet(map.keySet());
/* 19 */            for (int i = 0; i < childCount; i++) {
/* 21 */                View childAt = constraintLayout.getChildAt(i);
/* 25 */                int id = childAt.getId();
/* 37 */                if (!map.containsKey(Integer.valueOf(id))) {
/* 59 */                    AbstractC1245n0.m4889q("ConstraintSet", "id unknown " + de3.m3040v(childAt));
                        } else {
/* 67 */                    if (this.f1191e && id == -1) {
/* 74 */                        f42.m3663s("All children of ConstraintLayout must have ids to use ConstraintSet");
/* 77 */                        return;
                            }
/* 78 */                    if (id != -1 && map.containsKey(Integer.valueOf(id))) {
/* 96 */                        hashSet.remove(Integer.valueOf(id));
/* 107 */                       C0076c c0076c = (C0076c) map.get(Integer.valueOf(id));
/* 109 */                       if (c0076c != null) {
/* 113 */                           C2349wz c2349wz = c0076c.f1178c;
/* 115 */                           C2274uz c2274uz = c0076c.f1180e;
/* 117 */                           C2479xz c2479xz = c0076c.f1181f;
/* 121 */                           if (childAt instanceof Barrier) {
/* 123 */                               c2274uz.f17788i0 = 1;
/* 126 */                               Barrier barrier = (Barrier) childAt;
/* 128 */                               barrier.setId(id);
/* 133 */                               barrier.setType(c2274uz.f17784g0);
/* 138 */                               barrier.setMargin(c2274uz.f17786h0);
/* 143 */                               barrier.setAllowsGoneWidget(c2274uz.f17800o0);
/* 146 */                               int[] iArr = c2274uz.f17790j0;
/* 148 */                               if (iArr != null) {
/* 150 */                                   barrier.setReferencedIds(iArr);
                                        } else {
/* 154 */                                   String str = c2274uz.f17792k0;
/* 156 */                                   if (str != null) {
/* 158 */                                       int[] iArrM530f = m530f(barrier, str);
/* 162 */                                       c2274uz.f17790j0 = iArrM530f;
/* 164 */                                       barrier.setReferencedIds(iArrM530f);
                                            }
                                        }
                                    }
/* 171 */                           ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
/* 173 */                           layoutParams.m520a();
/* 176 */                           c0076c.m525a(layoutParams);
/* 181 */                           C2088pz.m7617e(childAt, c0076c.f1182g);
/* 184 */                           childAt.setLayoutParams(layoutParams);
/* 189 */                           if (c2349wz.f18872c == 0) {
/* 193 */                               childAt.setVisibility(c2349wz.f18871b);
                                    }
/* 198 */                           childAt.setAlpha(c2349wz.f18873d);
/* 203 */                           childAt.setRotation(c2479xz.f19407b);
/* 208 */                           childAt.setRotationX(c2479xz.f19408c);
/* 213 */                           childAt.setRotationY(c2479xz.f19409d);
/* 218 */                           childAt.setScaleX(c2479xz.f19410e);
/* 223 */                           childAt.setScaleY(c2479xz.f19411f);
/* 228 */                           if (c2479xz.f19414i != -1) {
/* 238 */                               View viewFindViewById = ((View) childAt.getParent()).findViewById(c2479xz.f19414i);
/* 242 */                               if (viewFindViewById != null) {
/* 256 */                                   float bottom = (viewFindViewById.getBottom() + viewFindViewById.getTop()) / 2.0f;
/* 267 */                                   float right = (viewFindViewById.getRight() + viewFindViewById.getLeft()) / 2.0f;
/* 277 */                                   if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
/* 295 */                                       float left = right - childAt.getLeft();
/* 301 */                                       float top = bottom - childAt.getTop();
/* 302 */                                       childAt.setPivotX(left);
/* 305 */                                       childAt.setPivotY(top);
                                            }
                                        }
                                    } else {
/* 315 */                               if (!Float.isNaN(c2479xz.f19412g)) {
/* 319 */                                   childAt.setPivotX(c2479xz.f19412g);
                                        }
/* 328 */                               if (!Float.isNaN(c2479xz.f19413h)) {
/* 332 */                                   childAt.setPivotY(c2479xz.f19413h);
                                        }
                                    }
/* 337 */                           childAt.setTranslationX(c2479xz.f19415j);
/* 342 */                           childAt.setTranslationY(c2479xz.f19416k);
/* 347 */                           childAt.setTranslationZ(c2479xz.f19417l);
/* 352 */                           if (c2479xz.f19418m) {
/* 356 */                               childAt.setElevation(c2479xz.f19419n);
                                    }
                                }
                            }
                        }
                    }
/* 371 */           for (Integer num : hashSet) {
/* 383 */               C0076c c0076c2 = (C0076c) map.get(num);
/* 385 */               if (c0076c2 != null) {
/* 388 */                   C2274uz c2274uz2 = c0076c2.f1180e;
/* 392 */                   if (c2274uz2.f17788i0 == 1) {
/* 400 */                       Barrier barrier2 = new Barrier(constraintLayout.getContext());
/* 407 */                       barrier2.setId(num.intValue());
/* 410 */                       int[] iArr2 = c2274uz2.f17790j0;
/* 412 */                       if (iArr2 != null) {
/* 414 */                           barrier2.setReferencedIds(iArr2);
                                } else {
/* 418 */                           String str2 = c2274uz2.f17792k0;
/* 420 */                           if (str2 != null) {
/* 422 */                               int[] iArrM530f2 = m530f(barrier2, str2);
/* 426 */                               c2274uz2.f17790j0 = iArrM530f2;
/* 428 */                               barrier2.setReferencedIds(iArrM530f2);
                                    }
                                }
/* 433 */                       barrier2.setType(c2274uz2.f17784g0);
/* 438 */                       barrier2.setMargin(c2274uz2.f17786h0);
/* 441 */                       qd2 qd2Var = ConstraintLayout.f1052f0;
/* 445 */                       ConstraintLayout.LayoutParams layoutParams2 = new ConstraintLayout.LayoutParams();
/* 448 */                       barrier2.m511q();
/* 451 */                       c0076c2.m525a(layoutParams2);
/* 454 */                       constraintLayout.addView(barrier2, layoutParams2);
                            }
/* 459 */                   if (c2274uz2.f17771a) {
/* 467 */                       View guideline = new Guideline(constraintLayout.getContext());
/* 474 */                       guideline.setId(num.intValue());
/* 477 */                       qd2 qd2Var2 = ConstraintLayout.f1052f0;
/* 481 */                       ConstraintLayout.LayoutParams layoutParams3 = new ConstraintLayout.LayoutParams();
/* 484 */                       c0076c2.m525a(layoutParams3);
/* 487 */                       constraintLayout.addView(guideline, layoutParams3);
                            }
                        }
                    }
/* 491 */           for (int i2 = 0; i2 < childCount; i2++) {
/* 493 */               View childAt2 = constraintLayout.getChildAt(i2);
/* 499 */               if (childAt2 instanceof ConstraintHelper) {
/* 503 */                   ((ConstraintHelper) childAt2).mo460g(constraintLayout);
                        }
                    }
                }

                /* JADX INFO: renamed from: e */
                public final void m539e(ConstraintLayout constraintLayout) {
                    int i;
                    HashMap map;
                    HashMap map2;
/* 1 */             C0077d c0077d = this;
/* 3 */             int childCount = constraintLayout.getChildCount();
/* 7 */             HashMap map3 = c0077d.f1192f;
/* 9 */             map3.clear();
/* 13 */            int i2 = 0;
/* 14 */            while (i2 < childCount) {
/* 18 */                View childAt = constraintLayout.getChildAt(i2);
/* 27 */                ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
/* 29 */                int id = childAt.getId();
/* 35 */                if (c0077d.f1191e && id == -1) {
/* 43 */                    f42.m3663s("All children of ConstraintLayout must have ids to use ConstraintSet");
/* 46 */                    return;
                        }
/* 55 */                if (!map3.containsKey(Integer.valueOf(id))) {
/* 66 */                    map3.put(Integer.valueOf(id), new C0076c());
                        }
/* 78 */                C0076c c0076c = (C0076c) map3.get(Integer.valueOf(id));
/* 80 */                if (c0076c == null) {
/* 82 */                    i = childCount;
/* 84 */                    map = map3;
                        } else {
/* 88 */                    C2349wz c2349wz = c0076c.f1178c;
/* 90 */                    C2274uz c2274uz = c0076c.f1180e;
/* 92 */                    C2479xz c2479xz = c0076c.f1181f;
/* 96 */                    HashMap map4 = new HashMap();
/* 99 */                    Class<?> cls = childAt.getClass();
/* 103 */                   HashMap map5 = c0077d.f1190d;
/* 117 */                   for (String str : map5.keySet()) {
/* 131 */                       C2088pz c2088pz = (C2088pz) map5.get(str);
/* 133 */                       int i3 = childCount;
                                try {
/* 141 */                           if (str.equals("BackgroundColor")) {
/* 157 */                               map2 = map3;
                                        try {
/* 164 */                                   map4.put(str, new C2088pz(c2088pz, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                                        } catch (IllegalAccessException e) {
/* 170 */                                   e = e;
/* 227 */                                   e.printStackTrace();
                                        } catch (NoSuchMethodException e2) {
/* 172 */                                   e = e2;
/* 231 */                                   e.printStackTrace();
                                        } catch (InvocationTargetException e3) {
/* 168 */                                   e = e3;
/* 223 */                                   e.printStackTrace();
                                        }
                                    } else {
/* 186 */                               map2 = map3;
/* 219 */                               map4.put(str, new C2088pz(c2088pz, cls.getMethod("getMap" + str, null).invoke(childAt, null)));
                                    }
                                } catch (IllegalAccessException e4) {
/* 178 */                           e = e4;
/* 179 */                           map2 = map3;
                                } catch (NoSuchMethodException e5) {
/* 182 */                           e = e5;
/* 183 */                           map2 = map3;
                                } catch (InvocationTargetException e6) {
/* 174 */                           e = e6;
/* 175 */                           map2 = map3;
                                }
/* 236 */                       childCount = i3;
/* 238 */                       map3 = map2;
                            }
/* 241 */                   i = childCount;
/* 243 */                   map = map3;
/* 245 */                   c0076c.f1182g = map4;
/* 247 */                   c0076c.m527c(id, layoutParams);
/* 254 */                   c2349wz.f18871b = childAt.getVisibility();
/* 260 */                   c2349wz.f18873d = childAt.getAlpha();
/* 266 */                   c2479xz.f19407b = childAt.getRotation();
/* 272 */                   c2479xz.f19408c = childAt.getRotationX();
/* 278 */                   c2479xz.f19409d = childAt.getRotationY();
/* 284 */                   c2479xz.f19410e = childAt.getScaleX();
/* 290 */                   c2479xz.f19411f = childAt.getScaleY();
/* 292 */                   float pivotX = childAt.getPivotX();
/* 296 */                   float pivotY = childAt.getPivotY();
/* 305 */                   if (pivotX != 0.0d || pivotY != 0.0d) {
/* 312 */                       c2479xz.f19412g = pivotX;
/* 314 */                       c2479xz.f19413h = pivotY;
                            }
/* 320 */                   c2479xz.f19415j = childAt.getTranslationX();
/* 326 */                   c2479xz.f19416k = childAt.getTranslationY();
/* 332 */                   c2479xz.f19417l = childAt.getTranslationZ();
/* 336 */                   if (c2479xz.f19418m) {
/* 342 */                       c2479xz.f19419n = childAt.getElevation();
                            }
/* 346 */                   if (childAt instanceof Barrier) {
/* 348 */                       Barrier barrier = (Barrier) childAt;
/* 354 */                       c2274uz.f17800o0 = barrier.getAllowsGoneWidget();
/* 360 */                       c2274uz.f17790j0 = barrier.getReferencedIds();
/* 366 */                       c2274uz.f17784g0 = barrier.getType();
/* 372 */                       c2274uz.f17786h0 = barrier.getMargin();
                            }
                        }
/* 374 */               i2++;
/* 376 */               c0077d = this;
/* 378 */               childCount = i;
/* 380 */               map3 = map;
                    }
                }

                /* JADX INFO: renamed from: h */
                public final C0076c m540h(int i) {
/* 1 */             Integer numValueOf = Integer.valueOf(i);
/* 5 */             HashMap map = this.f1192f;
/* 11 */            if (!map.containsKey(numValueOf)) {
/* 22 */                map.put(Integer.valueOf(i), new C0076c());
                    }
/* 33 */            return (C0076c) map.get(Integer.valueOf(i));
                }

                /* JADX INFO: renamed from: i */
                public final C0076c m541i(int i) {
/* 1 */             Integer numValueOf = Integer.valueOf(i);
/* 5 */             HashMap map = this.f1192f;
/* 11 */            if (map.containsKey(numValueOf)) {
/* 21 */                return (C0076c) map.get(Integer.valueOf(i));
                    }
/* 24 */            return null;
                }

                /* JADX INFO: renamed from: j */
                public final void m542j(Context context, int i) {
/* 5 */             XmlResourceParser xml = context.getResources().getXml(i);
                    try {
/* 14 */                for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
/* 16 */                    if (eventType == 0) {
/* 59 */                        xml.getName();
                            } else if (eventType == 2) {
/* 22 */                        String name = xml.getName();
/* 31 */                        C0076c c0076cM531g = m531g(context, Xml.asAttributeSet(xml), false);
/* 41 */                        if (name.equalsIgnoreCase("Guideline")) {
/* 45 */                            c0076cM531g.f1180e.f17771a = true;
                                }
/* 55 */                        this.f1192f.put(Integer.valueOf(c0076cM531g.f1176a), c0076cM531g);
                            }
                        }
                    } catch (IOException e) {
/* 68 */                e.printStackTrace();
                    } catch (XmlPullParserException e2) {
/* 73 */                e2.printStackTrace();
                    }
                }

                /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                /* JADX INFO: renamed from: k */
                public final void m543k(Context context, XmlResourceParser xmlResourceParser) {
                    try {
/* 1 */                 int eventType = xmlResourceParser.getEventType();
/* 6 */                 C0076c c0076cM531g = null;
/* 8 */                 while (eventType != 1) {
/* 10 */                    if (eventType == 0) {
/* 419 */                       xmlResourceParser.getName();
                            } else if (eventType == 2) {
/* 89 */                        String name = xmlResourceParser.getName();
                                switch (name.hashCode()) {
                                    case -2025855158:
/* 380 */                               if (!name.equals("Layout")) {
                                            continue;
                                        } else {
/* 382 */                                   if (c0076cM531g == null) {
/* 418 */                                       throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                            }
/* 390 */                                   c0076cM531g.f1180e.m9149b(context, Xml.asAttributeSet(xmlResourceParser));
                                        }
                                        break;
                                    case -1984451626:
/* 335 */                               if (!name.equals("Motion")) {
                                            continue;
                                        } else {
/* 337 */                                   if (c0076cM531g == null) {
/* 373 */                                       throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                            }
/* 345 */                                   c0076cM531g.f1179d.m9356b(context, Xml.asAttributeSet(xmlResourceParser));
                                        }
                                        break;
                                    case -1962203927:
/* 318 */                               if (!name.equals("ConstraintOverride")) {
                                            continue;
                                        } else {
/* 324 */                                   c0076cM531g = m531g(context, Xml.asAttributeSet(xmlResourceParser), true);
                                        }
                                        break;
                                    case -1269513683:
/* 272 */                               if (!name.equals("PropertySet")) {
                                            continue;
                                        } else {
/* 274 */                                   if (c0076cM531g == null) {
/* 311 */                                       throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                            }
/* 282 */                                   c0076cM531g.f1178c.m9668a(context, Xml.asAttributeSet(xmlResourceParser));
                                        }
                                        break;
                                    case -1238332596:
/* 226 */                               if (!name.equals("Transform")) {
                                            continue;
                                        } else {
/* 228 */                                   if (c0076cM531g == null) {
/* 265 */                                       throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                            }
/* 236 */                                   c0076cM531g.f1181f.m10048b(context, Xml.asAttributeSet(xmlResourceParser));
                                        }
                                        break;
                                    case -71750448:
/* 202 */                               if (!name.equals("Guideline")) {
                                            continue;
                                        } else {
/* 208 */                                   c0076cM531g = m531g(context, Xml.asAttributeSet(xmlResourceParser), false);
/* 212 */                                   C2274uz c2274uz = c0076cM531g.f1180e;
/* 214 */                                   c2274uz.f17771a = true;
/* 216 */                                   c2274uz.f17773b = true;
                                        }
                                        break;
                                    case 366511058:
/* 160 */                               if (!name.equals("CustomMethod")) {
                                            continue;
                                        }
                                        break;
                                    case 1331510167:
/* 138 */                               if (!name.equals("Barrier")) {
                                            continue;
                                        } else {
/* 144 */                                   c0076cM531g = m531g(context, Xml.asAttributeSet(xmlResourceParser), false);
/* 150 */                                   c0076cM531g.f1180e.f17788i0 = 1;
                                        }
                                        break;
                                    case 1791837707:
/* 129 */                               if (!name.equals("CustomAttribute")) {
                                            continue;
                                        }
                                        break;
                                    case 1803088381:
/* 111 */                               if (!name.equals("Constraint")) {
                                            continue;
                                        } else {
/* 117 */                                   c0076cM531g = m531g(context, Xml.asAttributeSet(xmlResourceParser), false);
                                        }
                                        break;
                                    default:
                                        continue;
                                }
/* 162 */                       if (c0076cM531g == null) {
/* 195 */                           throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                }
/* 166 */                       C2088pz.m7616d(context, xmlResourceParser, c0076cM531g.f1182g);
                            } else if (eventType == 3) {
/* 26 */                        String lowerCase = xmlResourceParser.getName().toLowerCase(Locale.ROOT);
                                switch (lowerCase.hashCode()) {
                                    case -2075718416:
/* 73 */                                if (!lowerCase.equals("guideline")) {
                                            break;
                                        }
                                        break;
                                    case -190376483:
/* 64 */                                if (!lowerCase.equals("constraint")) {
                                        }
                                        break;
                                    case 426575017:
/* 55 */                                if (!lowerCase.equals("constraintoverride")) {
                                        }
                                        break;
                                    case 2146106725:
/* 45 */                                if (!lowerCase.equals("constraintset")) {
                                            continue;
                                        } else {
/* 437 */                                   return;
                                        }
                                        break;
                                    default:
                                        continue;
                                }
/* 83 */                        this.f1192f.put(Integer.valueOf(c0076cM531g.f1176a), c0076cM531g);
/* 86 */                        c0076cM531g = null;
                            }
/* 422 */                   eventType = xmlResourceParser.next();
                        }
                    } catch (IOException e) {
/* 429 */               e.printStackTrace();
                    } catch (XmlPullParserException e2) {
/* 434 */               e2.printStackTrace();
                    }
                }
            }
