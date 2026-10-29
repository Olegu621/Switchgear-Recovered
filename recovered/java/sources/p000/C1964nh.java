            package p000;

            import android.content.Context;
            import android.content.res.ColorStateList;
            import android.content.res.Resources;
            import android.content.res.TypedArray;
            import android.content.res.XmlResourceParser;
            import android.text.TextUtils;
            import android.util.AttributeSet;
            import android.util.Xml;
            import com.google.android.material.R$dimen;
            import com.google.android.material.R$plurals;
            import com.google.android.material.R$string;
            import com.google.android.material.R$style;
            import com.google.android.material.R$styleable;
            import com.google.android.material.badge.BadgeState$State;
            import java.io.IOException;
            import java.util.Locale;
            import org.xmlpull.v1.XmlPullParserException;
            
            /* JADX INFO: renamed from: nh */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1964nh {

                /* JADX INFO: renamed from: a */
                public final BadgeState$State f14262a;

                /* JADX INFO: renamed from: b */
                public final BadgeState$State f14263b;

                /* JADX INFO: renamed from: c */
                public final float f14264c;

                /* JADX INFO: renamed from: d */
                public final float f14265d;

                /* JADX INFO: renamed from: e */
                public final float f14266e;

                public C1964nh(Context context, BadgeState$State badgeState$State) {
                    AttributeSet attributeSetAsAttributeSet;
                    int styleAttribute;
                    int next;
/* 1 */             int i = C1927mh.f13768Z;
/* 3 */             int i2 = C1927mh.f13767Y;
/* 13 */            this.f14263b = new BadgeState$State();
/* 19 */            badgeState$State = badgeState$State == null ? new BadgeState$State() : badgeState$State;
/* 22 */            int i3 = badgeState$State.f4425a;
/* 26 */            if (i3 != 0) {
                        try {
/* 34 */                    XmlResourceParser xml = context.getResources().getXml(i3);
/* 45 */                    do {
/* 38 */                        next = xml.next();
/* 43 */                        if (next == 2) {
                                    break;
                                }
/* 45 */                    } while (next != 1);
/* 47 */                    if (next != 2) {
/* 108 */                       throw new XmlPullParserException("No start tag found");
                            }
/* 57 */                    if (!TextUtils.equals(xml.getName(), "badge")) {
/* 100 */                       throw new XmlPullParserException("Must have a <" + ((Object) "badge") + "> start tag");
                            }
/* 59 */                    attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
/* 63 */                    styleAttribute = attributeSetAsAttributeSet.getStyleAttribute();
                        } catch (IOException | XmlPullParserException e) {
/* 129 */                   Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load badge resource ID #0x" + Integer.toHexString(i3));
/* 132 */                   notFoundException.initCause(e);
/* 135 */                   throw notFoundException;
                        }
                    } else {
/* 136 */               attributeSetAsAttributeSet = null;
/* 137 */               styleAttribute = 0;
                    }
/* 148 */           TypedArray typedArrayM8213d = rn2.m8213d(context, attributeSetAsAttributeSet, R$styleable.Badge, i, styleAttribute == 0 ? i2 : styleAttribute, new int[0]);
/* 152 */           Resources resources = context.getResources();
/* 169 */           this.f14264c = typedArrayM8213d.getDimensionPixelSize(R$styleable.Badge_badgeRadius, resources.getDimensionPixelSize(R$dimen.mtrl_badge_radius));
/* 184 */           this.f14266e = typedArrayM8213d.getDimensionPixelSize(R$styleable.Badge_badgeWidePadding, resources.getDimensionPixelSize(R$dimen.mtrl_badge_long_text_horizontal_padding));
/* 199 */           this.f14265d = typedArrayM8213d.getDimensionPixelSize(R$styleable.Badge_badgeWithTextRadius, resources.getDimensionPixelSize(R$dimen.mtrl_badge_with_text_radius));
/* 201 */           BadgeState$State badgeState$State2 = this.f14263b;
/* 203 */           int i4 = badgeState$State.f4431d;
/* 210 */           badgeState$State2.f4431d = i4 == -2 ? 255 : i4;
/* 212 */           CharSequence charSequence = badgeState$State.f4435v;
/* 222 */           badgeState$State2.f4435v = charSequence == null ? context.getString(R$string.mtrl_badge_numberless_content_description) : charSequence;
/* 224 */           BadgeState$State badgeState$State3 = this.f14263b;
/* 226 */           int i5 = badgeState$State.f4436w;
/* 232 */           badgeState$State3.f4436w = i5 == 0 ? R$plurals.mtrl_badge_content_description : i5;
/* 234 */           int i6 = badgeState$State.f4419U;
/* 240 */           badgeState$State3.f4419U = i6 == 0 ? R$string.mtrl_exceed_max_badge_number_content_description : i6;
/* 242 */           Boolean bool = badgeState$State.f4421W;
/* 260 */           badgeState$State3.f4421W = Boolean.valueOf(bool == null || bool.booleanValue());
/* 262 */           BadgeState$State badgeState$State4 = this.f14263b;
/* 264 */           int i7 = badgeState$State.f4433f;
/* 275 */           badgeState$State4.f4433f = i7 == -2 ? typedArrayM8213d.getInt(R$styleable.Badge_maxCharacterCount, 4) : i7;
/* 277 */           int i8 = badgeState$State.f4432e;
/* 279 */           if (i8 != -2) {
/* 283 */               this.f14263b.f4432e = i8;
                    } else {
/* 288 */               boolean zHasValue = typedArrayM8213d.hasValue(R$styleable.Badge_number);
/* 292 */               BadgeState$State badgeState$State5 = this.f14263b;
/* 294 */               if (zHasValue) {
/* 302 */                   badgeState$State5.f4432e = typedArrayM8213d.getInt(R$styleable.Badge_number, 0);
                        } else {
/* 306 */                   badgeState$State5.f4432e = -1;
                        }
                    }
/* 308 */           BadgeState$State badgeState$State6 = this.f14263b;
/* 310 */           Integer num = badgeState$State.f4427b;
/* 333 */           badgeState$State6.f4427b = Integer.valueOf(num == null ? de3.m3033o(context, typedArrayM8213d, R$styleable.Badge_backgroundColor).getDefaultColor() : num.intValue());
/* 335 */           Integer num2 = badgeState$State.f4429c;
/* 337 */           if (num2 != null) {
/* 341 */               this.f14263b.f4429c = num2;
                    } else if (typedArrayM8213d.hasValue(R$styleable.Badge_badgeTextColor)) {
/* 369 */               this.f14263b.f4429c = Integer.valueOf(de3.m3033o(context, typedArrayM8213d, R$styleable.Badge_badgeTextColor).getDefaultColor());
                    } else {
/* 372 */               int i9 = R$style.TextAppearance_MaterialComponents_Badge;
/* 376 */               TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i9, R$styleable.TextAppearance);
/* 383 */               typedArrayObtainStyledAttributes.getDimension(R$styleable.TextAppearance_android_textSize, 0.0f);
/* 388 */               ColorStateList colorStateListM3033o = de3.m3033o(context, typedArrayObtainStyledAttributes, R$styleable.TextAppearance_android_textColor);
/* 394 */               de3.m3033o(context, typedArrayObtainStyledAttributes, R$styleable.TextAppearance_android_textColorHint);
/* 399 */               de3.m3033o(context, typedArrayObtainStyledAttributes, R$styleable.TextAppearance_android_textColorLink);
/* 404 */               typedArrayObtainStyledAttributes.getInt(R$styleable.TextAppearance_android_textStyle, 0);
/* 409 */               typedArrayObtainStyledAttributes.getInt(R$styleable.TextAppearance_android_typeface, 1);
/* 412 */               int i10 = R$styleable.TextAppearance_fontFamily;
/* 420 */               i10 = typedArrayObtainStyledAttributes.hasValue(i10) ? i10 : R$styleable.TextAppearance_android_fontFamily;
/* 424 */               typedArrayObtainStyledAttributes.getResourceId(i10, 0);
/* 427 */               typedArrayObtainStyledAttributes.getString(i10);
/* 432 */               typedArrayObtainStyledAttributes.getBoolean(R$styleable.TextAppearance_textAllCaps, false);
/* 437 */               de3.m3033o(context, typedArrayObtainStyledAttributes, R$styleable.TextAppearance_android_shadowColor);
/* 442 */               typedArrayObtainStyledAttributes.getFloat(R$styleable.TextAppearance_android_shadowDx, 0.0f);
/* 447 */               typedArrayObtainStyledAttributes.getFloat(R$styleable.TextAppearance_android_shadowDy, 0.0f);
/* 452 */               typedArrayObtainStyledAttributes.getFloat(R$styleable.TextAppearance_android_shadowRadius, 0.0f);
/* 455 */               typedArrayObtainStyledAttributes.recycle();
/* 460 */               TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i9, R$styleable.MaterialTextAppearance);
/* 466 */               typedArrayObtainStyledAttributes2.hasValue(R$styleable.MaterialTextAppearance_android_letterSpacing);
/* 471 */               typedArrayObtainStyledAttributes2.getFloat(R$styleable.MaterialTextAppearance_android_letterSpacing, 0.0f);
/* 474 */               typedArrayObtainStyledAttributes2.recycle();
/* 487 */               this.f14263b.f4429c = Integer.valueOf(colorStateListM3033o.getDefaultColor());
                    }
/* 489 */           BadgeState$State badgeState$State7 = this.f14263b;
/* 491 */           Integer num3 = badgeState$State.f4420V;
/* 513 */           badgeState$State7.f4420V = Integer.valueOf(num3 == null ? typedArrayM8213d.getInt(R$styleable.Badge_badgeGravity, 8388661) : num3.intValue());
/* 515 */           BadgeState$State badgeState$State8 = this.f14263b;
/* 517 */           Integer num4 = badgeState$State.f4422X;
/* 536 */           badgeState$State8.f4422X = Integer.valueOf(num4 == null ? typedArrayM8213d.getDimensionPixelOffset(R$styleable.Badge_horizontalOffset, 0) : num4.intValue());
/* 561 */           this.f14263b.f4423Y = Integer.valueOf(badgeState$State.f4422X == null ? typedArrayM8213d.getDimensionPixelOffset(R$styleable.Badge_verticalOffset, 0) : badgeState$State.f4423Y.intValue());
/* 563 */           BadgeState$State badgeState$State9 = this.f14263b;
/* 565 */           Integer num5 = badgeState$State.f4424Z;
/* 590 */           badgeState$State9.f4424Z = Integer.valueOf(num5 == null ? typedArrayM8213d.getDimensionPixelOffset(R$styleable.Badge_horizontalOffsetWithText, badgeState$State9.f4422X.intValue()) : num5.intValue());
/* 592 */           BadgeState$State badgeState$State10 = this.f14263b;
/* 594 */           Integer num6 = badgeState$State.f4426a0;
/* 619 */           badgeState$State10.f4426a0 = Integer.valueOf(num6 == null ? typedArrayM8213d.getDimensionPixelOffset(R$styleable.Badge_verticalOffsetWithText, badgeState$State10.f4423Y.intValue()) : num6.intValue());
/* 621 */           BadgeState$State badgeState$State11 = this.f14263b;
/* 623 */           Integer num7 = badgeState$State.f4428b0;
/* 637 */           badgeState$State11.f4428b0 = Integer.valueOf(num7 == null ? 0 : num7.intValue());
/* 639 */           BadgeState$State badgeState$State12 = this.f14263b;
/* 641 */           Integer num8 = badgeState$State.f4430c0;
/* 654 */           badgeState$State12.f4430c0 = Integer.valueOf(num8 != null ? num8.intValue() : 0);
/* 656 */           typedArrayM8213d.recycle();
/* 659 */           Locale locale = badgeState$State.f4434i;
/* 661 */           BadgeState$State badgeState$State13 = this.f14263b;
/* 663 */           if (locale == null) {
/* 671 */               badgeState$State13.f4434i = Locale.getDefault(Locale.Category.FORMAT);
                    } else {
/* 674 */               badgeState$State13.f4434i = locale;
                    }
/* 676 */           this.f14262a = badgeState$State;
                }
            }
