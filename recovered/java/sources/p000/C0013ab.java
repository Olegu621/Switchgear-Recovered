            package p000;

            import android.content.res.TypedArray;
            import android.text.InputFilter;
            import android.util.AttributeSet;
            import android.widget.TextView;
            import androidx.appcompat.R$styleable;
            
            /* JADX INFO: renamed from: ab */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0013ab {

                /* JADX INFO: renamed from: a */
                public final TextView f154a;

                /* JADX INFO: renamed from: b */
                public final d52 f155b;

                public C0013ab(TextView textView) {
/* 4 */             this.f154a = textView;
/* 8 */             d52 d52Var = new d52();
/* 16 */            d52Var.f7001a = new gd0(textView);
/* 18 */            this.f155b = d52Var;
                }

                /* JADX INFO: renamed from: a */
                public final InputFilter[] m139a(InputFilter[] inputFilterArr) {
/* 7 */             return ((py0) this.f155b.f7001a).mo3724X(inputFilterArr);
                }

                /* JADX INFO: renamed from: b */
                public final void m140b(AttributeSet attributeSet, int i) {
/* 10 */            TypedArray typedArrayObtainStyledAttributes = this.f154a.getContext().obtainStyledAttributes(attributeSet, R$styleable.AppCompatTextView, i, 0);
                    try {
/* 25 */                boolean z = typedArrayObtainStyledAttributes.hasValue(R$styleable.AppCompatTextView_emojiCompatEnabled) ? typedArrayObtainStyledAttributes.getBoolean(R$styleable.AppCompatTextView_emojiCompatEnabled, true) : true;
/* 32 */                typedArrayObtainStyledAttributes.recycle();
/* 35 */                m142d(z);
                    } catch (Throwable th) {
/* 39 */                typedArrayObtainStyledAttributes.recycle();
/* 42 */                throw th;
                    }
                }

                /* JADX INFO: renamed from: c */
                public final void m141c(boolean z) {
/* 7 */             ((py0) this.f155b.f7001a).mo3726s0(z);
                }

                /* JADX INFO: renamed from: d */
                public final void m142d(boolean z) {
/* 7 */             ((py0) this.f155b.f7001a).mo3727t0(z);
                }
            }
