.class final Lcom/google/android/recaptcha/internal/zzoo;
.super Ljava/util/AbstractSet;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field final zza:I

.field final synthetic zzb:Lcom/google/android/recaptcha/internal/zzop;


# direct methods
.method public constructor <init>(Lcom/google/android/recaptcha/internal/zzop;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/recaptcha/internal/zzoo;->zzb:Lcom/google/android/recaptcha/internal/zzop;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/util/AbstractSet;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 p1, -0x1

    .line 7
    iput p1, p0, Lcom/google/android/recaptcha/internal/zzoo;->zza:I

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final contains(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    iget v0, p0, Lcom/google/android/recaptcha/internal/zzoo;->zza:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/android/recaptcha/internal/zzoo;->zzb:Lcom/google/android/recaptcha/internal/zzop;

    .line 4
    .line 5
    invoke-static {v1}, Lcom/google/android/recaptcha/internal/zzop;->zzc(Lcom/google/android/recaptcha/internal/zzop;)[Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {p0}, Lcom/google/android/recaptcha/internal/zzoo;->zzb()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    invoke-virtual {p0}, Lcom/google/android/recaptcha/internal/zzoo;->zza()I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    const/4 v3, -0x1

    .line 18
    if-ne v0, v3, :cond_0

    .line 19
    .line 20
    invoke-static {}, Lcom/google/android/recaptcha/internal/zzop;->zza()Ljava/util/Comparator;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-static {}, Lcom/google/android/recaptcha/internal/zzor;->zzb()Ljava/util/Comparator;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    :goto_0
    invoke-static {v1, v2, p0, p1, v0}, Ljava/util/Arrays;->binarySearch([Ljava/lang/Object;IILjava/lang/Object;Ljava/util/Comparator;)I

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    if-ltz p0, :cond_1

    .line 34
    .line 35
    const/4 p0, 0x1

    .line 36
    return p0

    .line 37
    :cond_1
    const/4 p0, 0x0

    .line 38
    return p0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    new-instance v0, Lcom/google/android/recaptcha/internal/zzon;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/google/android/recaptcha/internal/zzon;-><init>(Lcom/google/android/recaptcha/internal/zzoo;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final size()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/recaptcha/internal/zzoo;->zza()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Lcom/google/android/recaptcha/internal/zzoo;->zzb()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    sub-int/2addr v0, p0

    .line 10
    return v0
.end method

.method public final zza()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/recaptcha/internal/zzoo;->zza:I

    .line 2
    .line 3
    iget-object p0, p0, Lcom/google/android/recaptcha/internal/zzoo;->zzb:Lcom/google/android/recaptcha/internal/zzop;

    .line 4
    .line 5
    invoke-static {p0}, Lcom/google/android/recaptcha/internal/zzop;->zzb(Lcom/google/android/recaptcha/internal/zzop;)[I

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    add-int/lit8 v0, v0, 0x1

    .line 10
    .line 11
    aget p0, p0, v0

    .line 12
    .line 13
    return p0
.end method

.method public final zzb()I
    .locals 3

    .line 1
    iget v0, p0, Lcom/google/android/recaptcha/internal/zzoo;->zza:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    return v2

    .line 8
    :cond_0
    iget-object p0, p0, Lcom/google/android/recaptcha/internal/zzoo;->zzb:Lcom/google/android/recaptcha/internal/zzop;

    .line 9
    .line 10
    invoke-static {p0}, Lcom/google/android/recaptcha/internal/zzop;->zzb(Lcom/google/android/recaptcha/internal/zzop;)[I

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    aget p0, p0, v2

    .line 15
    .line 16
    return p0
.end method
