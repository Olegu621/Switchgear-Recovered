            package com.google.android.material.divider;

            import android.content.Context;
            import android.content.res.TypedArray;
            import android.graphics.Canvas;
            import android.graphics.Rect;
            import android.graphics.drawable.ShapeDrawable;
            import android.util.AttributeSet;
            import android.view.View;
            import androidx.recyclerview.widget.AbstractC0130h;
            import androidx.recyclerview.widget.RecyclerView;
            import com.google.android.material.R$attr;
            import com.google.android.material.R$dimen;
            import com.google.android.material.R$style;
            import com.google.android.material.R$styleable;
            import java.util.WeakHashMap;
            import p000.AbstractC0886en;
            import p000.C1951n4;
            import p000.de3;
            import p000.e33;
            import p000.rn2;
            import p000.s90;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class MaterialDividerItemDecoration extends AbstractC0130h {

                /* JADX INFO: renamed from: i */
                public static final int f4712i = R$style.Widget_MaterialComponents_MaterialDivider;

                /* JADX INFO: renamed from: a */
                public final ShapeDrawable f4713a;

                /* JADX INFO: renamed from: b */
                public final int f4714b;

                /* JADX INFO: renamed from: c */
                public final int f4715c;

                /* JADX INFO: renamed from: d */
                public final int f4716d;

                /* JADX INFO: renamed from: e */
                public final int f4717e;

                /* JADX INFO: renamed from: f */
                public final int f4718f;

                /* JADX INFO: renamed from: g */
                public final boolean f4719g;

                /* JADX INFO: renamed from: h */
                public final Rect f4720h;

                public MaterialDividerItemDecoration(Context context, AttributeSet attributeSet, int i) {
/* 1 */             int i2 = R$attr.materialDividerStyle;
/* 11 */            this.f4720h = new Rect();
/* 22 */            TypedArray typedArrayM8213d = rn2.m8213d(context, attributeSet, R$styleable.MaterialDivider, i2, f4712i, new int[0]);
/* 36 */            this.f4715c = de3.m3033o(context, typedArrayM8213d, R$styleable.MaterialDivider_dividerColor).getDefaultColor();
/* 54 */            this.f4714b = typedArrayM8213d.getDimensionPixelSize(R$styleable.MaterialDivider_dividerThickness, context.getResources().getDimensionPixelSize(R$dimen.material_divider_thickness));
/* 62 */            this.f4717e = typedArrayM8213d.getDimensionPixelOffset(R$styleable.MaterialDivider_dividerInsetStart, 0);
/* 70 */            this.f4718f = typedArrayM8213d.getDimensionPixelOffset(R$styleable.MaterialDivider_dividerInsetEnd, 0);
/* 79 */            this.f4719g = typedArrayM8213d.getBoolean(R$styleable.MaterialDivider_lastItemDecorated, true);
/* 81 */            typedArrayM8213d.recycle();
/* 86 */            ShapeDrawable shapeDrawable = new ShapeDrawable();
/* 89 */            int i3 = this.f4715c;
/* 91 */            this.f4715c = i3;
/* 93 */            this.f4713a = shapeDrawable;
/* 95 */            s90.m8447g(shapeDrawable, i3);
/* 98 */            if (i == 0 || i == 1) {
/* 116 */               this.f4716d = i;
                    } else {
/* 111 */               C1951n4.m6859j(AbstractC0886en.m3505i(i, "Invalid orientation: ", ". It should be either HORIZONTAL or VERTICAL"));
/* 115 */               throw null;
                    }
                }

                @Override // androidx.recyclerview.widget.AbstractC0130h
                /* JADX INFO: renamed from: a */
                public final void mo962a(Rect rect, View view) {
/* 2 */             rect.set(0, 0, 0, 0);
/* 5 */             int i = this.f4714b;
/* 7 */             int i2 = this.f4716d;
/* 10 */            ShapeDrawable shapeDrawable = this.f4713a;
/* 12 */            if (i2 == 1) {
/* 19 */                rect.bottom = shapeDrawable.getIntrinsicHeight() + i;
                    } else {
/* 27 */                rect.right = shapeDrawable.getIntrinsicWidth() + i;
                    }
                }

                @Override // androidx.recyclerview.widget.AbstractC0130h
                /* JADX INFO: renamed from: b */
                public final void mo963b(Canvas canvas, RecyclerView recyclerView) {
                    int height;
                    int paddingTop;
                    int width;
                    int paddingLeft;
/* 5 */             if (recyclerView.getLayoutManager() == null) {
/* 7 */                 return;
                    }
/* 8 */             ShapeDrawable shapeDrawable = this.f4713a;
/* 10 */            int i = this.f4714b;
/* 12 */            int i2 = 0;
/* 13 */            int i3 = this.f4718f;
/* 15 */            int i4 = this.f4717e;
/* 18 */            int i5 = this.f4716d;
/* 20 */            Rect rect = this.f4720h;
/* 22 */            if (i5 != 1) {
/* 139 */               canvas.save();
/* 146 */               if (recyclerView.getClipToPadding()) {
/* 148 */                   paddingTop = recyclerView.getPaddingTop();
/* 160 */                   height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
/* 174 */                   canvas.clipRect(recyclerView.getPaddingLeft(), paddingTop, recyclerView.getWidth() - recyclerView.getPaddingRight(), height);
                        } else {
/* 178 */                   height = recyclerView.getHeight();
/* 182 */                   paddingTop = 0;
                        }
/* 183 */               int i6 = paddingTop + i4;
/* 184 */               int i7 = height - i3;
/* 185 */               int childCount = recyclerView.getChildCount();
/* 189 */               while (i2 < childCount) {
/* 191 */                   View childAt = recyclerView.getChildAt(i2);
/* 199 */                   recyclerView.getLayoutManager().getClass();
/* 202 */                   RecyclerView.m844K(rect, childAt);
/* 215 */                   int iRound = Math.round(childAt.getTranslationX()) + rect.right;
/* 223 */                   shapeDrawable.setBounds((iRound - shapeDrawable.getIntrinsicWidth()) - i, i6, iRound, i7);
/* 226 */                   shapeDrawable.draw(canvas);
/* 229 */                   i2++;
                        }
/* 232 */               canvas.restore();
/* 235 */               return;
                    }
/* 24 */            canvas.save();
/* 31 */            if (recyclerView.getClipToPadding()) {
/* 33 */                paddingLeft = recyclerView.getPaddingLeft();
/* 45 */                width = recyclerView.getWidth() - recyclerView.getPaddingRight();
/* 59 */                canvas.clipRect(paddingLeft, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
                    } else {
/* 63 */                width = recyclerView.getWidth();
/* 67 */                paddingLeft = 0;
                    }
/* 68 */            WeakHashMap weakHashMap = e33.f7494a;
/* 74 */            boolean z = recyclerView.getLayoutDirection() == 1;
/* 83 */            int i8 = paddingLeft + (z ? i3 : i4);
/* 84 */            if (z) {
/* 86 */                i3 = i4;
                    }
/* 87 */            int i9 = width - i3;
/* 88 */            int childCount2 = recyclerView.getChildCount();
/* 94 */            if (!this.f4719g) {
/* 97 */                childCount2--;
                    }
/* 99 */            while (i2 < childCount2) {
/* 101 */               View childAt2 = recyclerView.getChildAt(i2);
/* 105 */               RecyclerView.m844K(rect, childAt2);
/* 118 */               int iRound2 = Math.round(childAt2.getTranslationY()) + rect.bottom;
/* 126 */               shapeDrawable.setBounds(i8, (iRound2 - shapeDrawable.getIntrinsicHeight()) - i, i9, iRound2);
/* 129 */               shapeDrawable.draw(canvas);
/* 132 */               i2++;
                    }
/* 135 */           canvas.restore();
                }
            }
