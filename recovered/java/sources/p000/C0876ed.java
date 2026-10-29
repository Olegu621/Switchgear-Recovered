            package p000;

            import android.util.Rational;
            import com.google.android.material.button.MaterialButton;
            import com.google.android.material.button.MaterialButtonToggleGroup;
            import java.util.Comparator;
            import kotlin.jvm.functions.Function1;
            
            /* JADX INFO: renamed from: ed */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0876ed implements Comparator {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f7627a;

                /* JADX INFO: renamed from: b */
                public final Object f7628b;

                public /* synthetic */ C0876ed(Object obj, int i) {
/* 1 */             this.f7627a = i;
/* 3 */             this.f7628b = obj;
                }

                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
/* 1 */             int i = this.f7627a;
/* 3 */             Object obj3 = this.f7628b;
                    switch (i) {
                        case 0:
/* 120 */                   Function1 function1 = (Function1) obj3;
/* 132 */                   return String.CASE_INSENSITIVE_ORDER.compare(function1.invoke(obj), function1.invoke(obj2));
                        case 1:
/* 51 */                    MaterialButton materialButton = (MaterialButton) obj;
/* 53 */                    MaterialButton materialButton2 = (MaterialButton) obj2;
/* 55 */                    MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) obj3;
/* 69 */                    int iCompareTo = Boolean.valueOf(materialButton.f4542b0).compareTo(Boolean.valueOf(materialButton2.f4542b0));
/* 73 */                    if (iCompareTo != 0) {
/* 119 */                       return iCompareTo;
                            }
/* 92 */                    int iCompareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
                            return iCompareTo2 != 0 ? iCompareTo2 : Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton)).compareTo(Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton2)));
                        default:
/* 10 */                    Rational rational = (Rational) obj2;
/* 12 */                    Rational rational2 = (Rational) obj3;
/* 14 */                    float fFloatValue = ((Rational) obj).floatValue();
/* 18 */                    float fFloatValue2 = rational2.floatValue();
/* 28 */                    float f = fFloatValue > fFloatValue2 ? fFloatValue2 / fFloatValue : fFloatValue / fFloatValue2;
/* 30 */                    float fFloatValue3 = rational.floatValue();
/* 34 */                    float fFloatValue4 = rational2.floatValue();
/* 46 */                    return Float.compare(fFloatValue3 > fFloatValue4 ? fFloatValue4 / fFloatValue3 : fFloatValue3 / fFloatValue4, f);
                    }
                }
            }
