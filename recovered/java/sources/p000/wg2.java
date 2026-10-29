            package p000;

            import android.content.Context;
            import android.content.res.TypedArray;
            import android.content.res.XmlResourceParser;
            import android.util.Xml;
            import androidx.constraintlayout.widget.R$styleable;
            import java.util.ArrayList;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class wg2 {

                /* JADX INFO: renamed from: a */
                public final int f18617a;

                /* JADX INFO: renamed from: b */
                public final ArrayList f18618b = new ArrayList();

                /* JADX INFO: renamed from: c */
                public final int f18619c;

                public wg2(Context context, XmlResourceParser xmlResourceParser) {
/* 12 */            this.f18619c = -1;
/* 20 */            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), R$styleable.State);
/* 24 */            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
/* 29 */            for (int i = 0; i < indexCount; i++) {
/* 31 */                int index = typedArrayObtainStyledAttributes.getIndex(i);
/* 37 */                if (index == R$styleable.State_android_id) {
/* 45 */                    this.f18617a = typedArrayObtainStyledAttributes.getResourceId(index, this.f18617a);
                        } else if (index == R$styleable.State_constraints) {
/* 54 */                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f18619c);
/* 58 */                    this.f18619c = resourceId;
/* 64 */                    String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
/* 72 */                    context.getResources().getResourceName(resourceId);
/* 77 */                    "layout".equals(resourceTypeName);
                        }
                    }
/* 83 */            typedArrayObtainStyledAttributes.recycle();
                }
            }
