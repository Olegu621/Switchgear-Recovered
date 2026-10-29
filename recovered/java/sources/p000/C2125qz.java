            package p000;

            import android.content.Context;
            import android.content.res.TypedArray;
            import android.content.res.XmlResourceParser;
            import android.util.Xml;
            import android.view.LayoutInflater;
            import android.view.ViewGroup;
            import androidx.constraintlayout.widget.C0077d;
            import androidx.constraintlayout.widget.ConstraintLayout;
            import androidx.constraintlayout.widget.R$styleable;
            import java.util.ArrayList;
            
            /* JADX INFO: renamed from: qz */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2125qz {

                /* JADX INFO: renamed from: a */
                public final int f15805a;

                /* JADX INFO: renamed from: b */
                public final ArrayList f15806b = new ArrayList();

                /* JADX INFO: renamed from: c */
                public final int f15807c;

                /* JADX INFO: renamed from: d */
                public final C0077d f15808d;

                public C2125qz(Context context, XmlResourceParser xmlResourceParser) {
/* 12 */            this.f15807c = -1;
/* 20 */            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), R$styleable.State);
/* 24 */            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
/* 29 */            for (int i = 0; i < indexCount; i++) {
/* 31 */                int index = typedArrayObtainStyledAttributes.getIndex(i);
/* 37 */                if (index == R$styleable.State_android_id) {
/* 45 */                    this.f15805a = typedArrayObtainStyledAttributes.getResourceId(index, this.f15805a);
                        } else if (index == R$styleable.State_constraints) {
/* 54 */                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f15807c);
/* 58 */                    this.f15807c = resourceId;
/* 64 */                    String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
/* 72 */                    context.getResources().getResourceName(resourceId);
/* 81 */                    if ("layout".equals(resourceTypeName)) {
/* 85 */                        C0077d c0077d = new C0077d();
/* 88 */                        this.f15808d = c0077d;
/* 101 */                       c0077d.m539e((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                            }
                        }
                    }
/* 107 */           typedArrayObtainStyledAttributes.recycle();
                }
            }
