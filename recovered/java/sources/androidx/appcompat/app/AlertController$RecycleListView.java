            package androidx.appcompat.app;

            import android.content.Context;
            import android.content.res.TypedArray;
            import android.util.AttributeSet;
            import android.widget.ListView;
            import androidx.appcompat.R$styleable;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class AlertController$RecycleListView extends ListView {

                /* JADX INFO: renamed from: a */
                public final int f360a;

                /* JADX INFO: renamed from: b */
                public final int f361b;

                public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
/* 1 */             super(context, attributeSet);
/* 6 */             TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.RecycleListView);
/* 17 */            this.f361b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.RecycleListView_paddingBottomNoButtons, -1);
/* 25 */            this.f360a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.RecycleListView_paddingTopNoTitle, -1);
                }
            }
