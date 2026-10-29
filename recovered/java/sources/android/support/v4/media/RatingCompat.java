            package android.support.v4.media;

            import android.media.Rating;
            import android.os.Parcel;
            import android.os.Parcelable;
            import io.sentry.android.core.AbstractC1245n0;
            import java.lang.annotation.Retention;
            import java.lang.annotation.RetentionPolicy;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class RatingCompat implements Parcelable {
                public static final Parcelable.Creator<RatingCompat> CREATOR = new Parcelable.Creator<RatingCompat>() { // from class: android.support.v4.media.RatingCompat.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public RatingCompat createFromParcel(Parcel parcel) {
/* 11 */                return new RatingCompat(parcel.readInt(), parcel.readFloat());
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
/* 5 */             public RatingCompat[] newArray(int i) {
/* 6 */                 return new RatingCompat[i];
                    }
                };
                public static final int RATING_3_STARS = 3;
                public static final int RATING_4_STARS = 4;
                public static final int RATING_5_STARS = 5;
                public static final int RATING_HEART = 1;
                public static final int RATING_NONE = 0;
                private static final float RATING_NOT_RATED = -1.0f;
                public static final int RATING_PERCENTAGE = 6;
                public static final int RATING_THUMB_UP_DOWN = 2;
                private static final String TAG = "Rating";
                private Object mRatingObj;
                private final int mRatingStyle;
                private final float mRatingValue;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Retention(RetentionPolicy.SOURCE)
                public @interface StarStyle {
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Retention(RetentionPolicy.SOURCE)
                public @interface Style {
                }

                public RatingCompat(int i, float f) {
/* 4 */             this.mRatingStyle = i;
/* 6 */             this.mRatingValue = f;
                }

                public static RatingCompat fromRating(Object obj) {
/* 1 */             RatingCompat ratingCompatNewUnratedRating = null;
/* 2 */             if (obj != null) {
/* 5 */                 Rating rating = (Rating) obj;
/* 7 */                 int ratingStyle = rating.getRatingStyle();
/* 15 */                if (rating.isRated()) {
                            switch (ratingStyle) {
                                case 1:
/* 52 */                            ratingCompatNewUnratedRating = newHeartRating(rating.hasHeart());
                                    break;
                                case 2:
/* 43 */                            ratingCompatNewUnratedRating = newThumbRating(rating.isThumbUp());
                                    break;
                                case 3:
                                case 4:
                                case 5:
/* 34 */                            ratingCompatNewUnratedRating = newStarRating(ratingStyle, rating.getStarRating());
                                    break;
                                case 6:
/* 25 */                            ratingCompatNewUnratedRating = newPercentageRating(rating.getPercentRating());
                                    break;
                                default:
/* 1 */                             return null;
                            }
                        } else {
/* 57 */                    ratingCompatNewUnratedRating = newUnratedRating(ratingStyle);
                        }
/* 61 */                ratingCompatNewUnratedRating.mRatingObj = obj;
                    }
/* 63 */            return ratingCompatNewUnratedRating;
                }

                public static RatingCompat newHeartRating(boolean z) {
/* 10 */            return new RatingCompat(1, z ? 1.0f : 0.0f);
                }

                public static RatingCompat newPercentageRating(float f) {
/* 4 */             if (f >= 0.0f && f <= 100.0f) {
/* 16 */                return new RatingCompat(6, f);
                    }
/* 24 */            AbstractC1245n0.m4876d(TAG, "Invalid percentage-based rating value");
/* 27 */            return null;
                }

                public static RatingCompat newStarRating(int i, float f) {
                    float f2;
/* 5 */             if (i == 3) {
/* 42 */                f2 = 3.0f;
                    } else if (i == 4) {
/* 39 */                f2 = 4.0f;
                    } else {
/* 11 */                if (i != 5) {
/* 32 */                    AbstractC1245n0.m4876d(TAG, "Invalid rating style (" + i + ") for a star rating");
/* 2 */                     return null;
                        }
/* 36 */                f2 = 5.0f;
                    }
/* 47 */            if (f >= 0.0f && f <= f2) {
/* 56 */                return new RatingCompat(i, f);
                    }
/* 62 */            AbstractC1245n0.m4876d(TAG, "Trying to set out of range star-based rating");
/* 2 */             return null;
                }

                public static RatingCompat newThumbRating(boolean z) {
/* 10 */            return new RatingCompat(2, z ? 1.0f : 0.0f);
                }

                public static RatingCompat newUnratedRating(int i) {
                    switch (i) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
/* 10 */                    return new RatingCompat(i, RATING_NOT_RATED);
                        default:
/* 4 */                     return null;
                    }
                }

                @Override // android.os.Parcelable
                public int describeContents() {
/* 1 */             return this.mRatingStyle;
                }

                public float getPercentRating() {
                    return (this.mRatingStyle == 6 && isRated()) ? this.mRatingValue : RATING_NOT_RATED;
                }

                public Object getRating() {
/* 3 */             if (this.mRatingObj == null) {
/* 5 */                 boolean zIsRated = isRated();
/* 9 */                 int i = this.mRatingStyle;
/* 11 */                if (zIsRated) {
                            switch (i) {
                                case 1:
/* 59 */                            this.mRatingObj = Rating.newHeartRating(hasHeart());
                                    break;
                                case 2:
/* 48 */                            this.mRatingObj = Rating.newThumbRating(isThumbUp());
                                    break;
                                case 3:
                                case 4:
                                case 5:
/* 37 */                            this.mRatingObj = Rating.newStarRating(i, getStarRating());
                                    break;
                                case 6:
/* 26 */                            this.mRatingObj = Rating.newPercentageRating(getPercentRating());
                                    break;
                                default:
/* 16 */                            return null;
                            }
                        } else {
/* 66 */                    this.mRatingObj = Rating.newUnratedRating(i);
                        }
                    }
/* 68 */            return this.mRatingObj;
                }

                public int getRatingStyle() {
/* 1 */             return this.mRatingStyle;
                }

                public float getStarRating() {
/* 1 */             int i = this.mRatingStyle;
                    return ((i == 3 || i == 4 || i == 5) && isRated()) ? this.mRatingValue : RATING_NOT_RATED;
                }

                public boolean hasHeart() {
                    return this.mRatingStyle == 1 && this.mRatingValue == 1.0f;
                }

                public boolean isRated() {
                    return this.mRatingValue >= 0.0f;
                }

                public boolean isThumbUp() {
                    return this.mRatingStyle == 2 && this.mRatingValue == 1.0f;
                }

                public String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("Rating:style=");
/* 10 */            sb.append(this.mRatingStyle);
/* 15 */            sb.append(" rating=");
/* 18 */            float f = this.mRatingValue;
/* 32 */            sb.append(f < 0.0f ? "unrated" : String.valueOf(f));
/* 35 */            return sb.toString();
                }

                @Override // android.os.Parcelable
                public void writeToParcel(Parcel parcel, int i) {
/* 3 */             parcel.writeInt(this.mRatingStyle);
/* 8 */             parcel.writeFloat(this.mRatingValue);
                }
            }
