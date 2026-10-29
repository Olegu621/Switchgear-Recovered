            package p000;

            import android.content.Context;
            import android.content.DialogInterface;
            import android.content.res.TypedArray;
            import android.graphics.drawable.Drawable;
            import android.os.Message;
            import android.view.View;
            import android.view.ViewGroup;
            import android.view.ViewParent;
            import android.view.ViewStub;
            import android.view.Window;
            import android.widget.Button;
            import android.widget.ImageView;
            import android.widget.ListAdapter;
            import android.widget.TextView;
            import androidx.appcompat.R$attr;
            import androidx.appcompat.R$styleable;
            import androidx.appcompat.app.AlertController$RecycleListView;
            import androidx.core.widget.NestedScrollView;
            import java.lang.ref.WeakReference;
            
            /* JADX INFO: renamed from: m7 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1917m7 {

                /* JADX INFO: renamed from: A */
                public final int f13607A;

                /* JADX INFO: renamed from: B */
                public final int f13608B;

                /* JADX INFO: renamed from: C */
                public final int f13609C;

                /* JADX INFO: renamed from: D */
                public final boolean f13610D;

                /* JADX INFO: renamed from: E */
                public final HandlerC1821k7 f13611E;

                /* JADX INFO: renamed from: a */
                public final Context f13613a;

                /* JADX INFO: renamed from: b */
                public final DialogInterfaceC1991o7 f13614b;

                /* JADX INFO: renamed from: c */
                public final Window f13615c;

                /* JADX INFO: renamed from: d */
                public CharSequence f13616d;

                /* JADX INFO: renamed from: e */
                public String f13617e;

                /* JADX INFO: renamed from: f */
                public AlertController$RecycleListView f13618f;

                /* JADX INFO: renamed from: g */
                public View f13619g;

                /* JADX INFO: renamed from: i */
                public Button f13621i;

                /* JADX INFO: renamed from: j */
                public CharSequence f13622j;

                /* JADX INFO: renamed from: k */
                public Message f13623k;

                /* JADX INFO: renamed from: l */
                public Button f13624l;

                /* JADX INFO: renamed from: m */
                public CharSequence f13625m;

                /* JADX INFO: renamed from: n */
                public Message f13626n;

                /* JADX INFO: renamed from: o */
                public Button f13627o;

                /* JADX INFO: renamed from: p */
                public CharSequence f13628p;

                /* JADX INFO: renamed from: q */
                public Message f13629q;

                /* JADX INFO: renamed from: r */
                public NestedScrollView f13630r;

                /* JADX INFO: renamed from: s */
                public Drawable f13631s;

                /* JADX INFO: renamed from: t */
                public ImageView f13632t;

                /* JADX INFO: renamed from: u */
                public TextView f13633u;

                /* JADX INFO: renamed from: v */
                public TextView f13634v;

                /* JADX INFO: renamed from: w */
                public View f13635w;

                /* JADX INFO: renamed from: x */
                public ListAdapter f13636x;

                /* JADX INFO: renamed from: z */
                public final int f13638z;

                /* JADX INFO: renamed from: h */
                public boolean f13620h = false;

                /* JADX INFO: renamed from: y */
                public int f13637y = -1;

                /* JADX INFO: renamed from: F */
                public final ViewOnClickListenerC2239u1 f13612F = new ViewOnClickListenerC2239u1(this, 1);

                public C1917m7(Context context, DialogInterfaceC1991o7 dialogInterfaceC1991o7, Window window) {
/* 18 */            this.f13613a = context;
/* 20 */            this.f13614b = dialogInterfaceC1991o7;
/* 22 */            this.f13615c = window;
/* 26 */            HandlerC1821k7 handlerC1821k7 = new HandlerC1821k7();
/* 34 */            handlerC1821k7.f12625a = new WeakReference(dialogInterfaceC1991o7);
/* 36 */            this.f13611E = handlerC1821k7;
/* 43 */            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, R$styleable.AlertDialog, R$attr.alertDialogStyle, 0);
/* 53 */            this.f13638z = typedArrayObtainStyledAttributes.getResourceId(R$styleable.AlertDialog_android_layout, 0);
/* 57 */            typedArrayObtainStyledAttributes.getResourceId(R$styleable.AlertDialog_buttonPanelSideLayout, 0);
/* 66 */            this.f13607A = typedArrayObtainStyledAttributes.getResourceId(R$styleable.AlertDialog_listLayout, 0);
/* 70 */            typedArrayObtainStyledAttributes.getResourceId(R$styleable.AlertDialog_multiChoiceItemLayout, 0);
/* 79 */            this.f13608B = typedArrayObtainStyledAttributes.getResourceId(R$styleable.AlertDialog_singleChoiceItemLayout, 0);
/* 87 */            this.f13609C = typedArrayObtainStyledAttributes.getResourceId(R$styleable.AlertDialog_listItemLayout, 0);
/* 95 */            this.f13610D = typedArrayObtainStyledAttributes.getBoolean(R$styleable.AlertDialog_showTitle, true);
/* 99 */            typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.AlertDialog_buttonIconDimen, 0);
/* 102 */           typedArrayObtainStyledAttributes.recycle();
/* 109 */           dialogInterfaceC1991o7.m7108c().mo4504g(1);
                }

                /* JADX INFO: renamed from: a */
                public static boolean m6612a(View view) {
/* 6 */             if (view.onCheckIsTextEditor()) {
/* 5 */                 return true;
                    }
/* 12 */            if (!(view instanceof ViewGroup)) {
/* 11 */                return false;
                    }
/* 15 */            ViewGroup viewGroup = (ViewGroup) view;
/* 17 */            int childCount = viewGroup.getChildCount();
/* 21 */            while (childCount > 0) {
/* 23 */                childCount--;
/* 33 */                if (m6612a(viewGroup.getChildAt(childCount))) {
/* 5 */                     return true;
                        }
                    }
/* 11 */            return false;
                }

                /* JADX INFO: renamed from: b */
                public static ViewGroup m6613b(View view, View view2) {
/* 1 */             if (view == null) {
/* 5 */                 if (view2 instanceof ViewStub) {
/* 9 */                     view2 = ((ViewStub) view2).inflate();
                        }
/* 13 */                return (ViewGroup) view2;
                    }
/* 16 */            if (view2 != null) {
/* 18 */                ViewParent parent = view2.getParent();
/* 24 */                if (parent instanceof ViewGroup) {
/* 28 */                    ((ViewGroup) parent).removeView(view2);
                        }
                    }
/* 33 */            if (view instanceof ViewStub) {
/* 37 */                view = ((ViewStub) view).inflate();
                    }
/* 41 */            return (ViewGroup) view;
                }

                /* JADX INFO: renamed from: c */
                public final void m6614c(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
/* 10 */            Message messageObtainMessage = onClickListener != null ? this.f13611E.obtainMessage(i, onClickListener) : null;
/* 12 */            if (i == -3) {
/* 36 */                this.f13628p = charSequence;
/* 38 */                this.f13629q = messageObtainMessage;
                    } else if (i == -2) {
/* 31 */                this.f13625m = charSequence;
/* 33 */                this.f13626n = messageObtainMessage;
                    } else if (i != -1) {
/* 27 */                C1951n4.m6859j("Button does not exist");
                    } else {
/* 20 */                this.f13622j = charSequence;
/* 22 */                this.f13623k = messageObtainMessage;
                    }
                }
            }
