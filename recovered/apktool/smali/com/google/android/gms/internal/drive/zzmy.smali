.class public final Lcom/google/android/gms/internal/drive/zzmy;
.super Ljava/lang/Object;


# static fields
.field private static final zzvr:Lcom/google/android/gms/internal/drive/zzmy;


# instance fields
.field private count:I

.field private zznh:Z

.field private zzrr:I

.field private zzue:[Ljava/lang/Object;

.field private zzvs:[I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/drive/zzmy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    new-array v2, v1, [I

    .line 5
    .line 6
    new-array v3, v1, [Ljava/lang/Object;

    .line 7
    .line 8
    invoke-direct {v0, v1, v2, v3, v1}, Lcom/google/android/gms/internal/drive/zzmy;-><init>(I[I[Ljava/lang/Object;Z)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lcom/google/android/gms/internal/drive/zzmy;->zzvr:Lcom/google/android/gms/internal/drive/zzmy;

    .line 12
    .line 13
    return-void
.end method

.method private constructor <init>()V
    .locals 4

    const/16 v0, 0x8

    .line 16
    new-array v1, v0, [I

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-direct {p0, v3, v1, v0, v2}, Lcom/google/android/gms/internal/drive/zzmy;-><init>(I[I[Ljava/lang/Object;Z)V

    return-void
.end method

.method private constructor <init>(I[I[Ljava/lang/Object;Z)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, -0x1

    .line 5
    iput v0, p0, Lcom/google/android/gms/internal/drive/zzmy;->zzrr:I

    .line 6
    .line 7
    iput p1, p0, Lcom/google/android/gms/internal/drive/zzmy;->count:I

    .line 8
    .line 9
    iput-object p2, p0, Lcom/google/android/gms/internal/drive/zzmy;->zzvs:[I

    .line 10
    .line 11
    iput-object p3, p0, Lcom/google/android/gms/internal/drive/zzmy;->zzue:[Ljava/lang/Object;

    .line 12
    .line 13
    iput-boolean p4, p0, Lcom/google/android/gms/internal/drive/zzmy;->zznh:Z

    .line 14
    .line 15
    return-void
.end method

.method public static zza(Lcom/google/android/gms/internal/drive/zzmy;Lcom/google/android/gms/internal/drive/zzmy;)Lcom/google/android/gms/internal/drive/zzmy;
    .locals 6

    .line 53
    iget v0, p0, Lcom/google/android/gms/internal/drive/zzmy;->count:I

    iget v1, p1, Lcom/google/android/gms/internal/drive/zzmy;->count:I

    add-int/2addr v0, v1

    .line 54
    iget-object v1, p0, Lcom/google/android/gms/internal/drive/zzmy;->zzvs:[I

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v1

    .line 55
    iget-object v2, p1, Lcom/google/android/gms/internal/drive/zzmy;->zzvs:[I

    iget v3, p0, Lcom/google/android/gms/internal/drive/zzmy;->count:I

    iget v4, p1, Lcom/google/android/gms/internal/drive/zzmy;->count:I

    const/4 v5, 0x0

    invoke-static {v2, v5, v1, v3, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 56
    iget-object v2, p0, Lcom/google/android/gms/internal/drive/zzmy;->zzue:[Ljava/lang/Object;

    invoke-static {v2, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v2

    .line 57
    iget-object v3, p1, Lcom/google/android/gms/internal/drive/zzmy;->zzue:[Ljava/lang/Object;

    iget p0, p0, Lcom/google/android/gms/internal/drive/zzmy;->count:I

    iget p1, p1, Lcom/google/android/gms/internal/drive/zzmy;->count:I

    invoke-static {v3, v5, v2, p0, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 58
    new-instance p0, Lcom/google/android/gms/internal/drive/zzmy;

    const/4 p1, 0x1

    invoke-direct {p0, v0, v1, v2, p1}, Lcom/google/android/gms/internal/drive/zzmy;-><init>(I[I[Ljava/lang/Object;Z)V

    return-object p0
.end method

.method private static zzb(ILjava/lang/Object;Lcom/google/android/gms/internal/drive/zzns;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    ushr-int/lit8 v0, p0, 0x3

    .line 2
    .line 3
    and-int/lit8 p0, p0, 0x7

    .line 4
    .line 5
    if-eqz p0, :cond_5

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    if-eq p0, v1, :cond_4

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    if-eq p0, v1, :cond_3

    .line 12
    .line 13
    const/4 v1, 0x3

    .line 14
    if-eq p0, v1, :cond_1

    .line 15
    .line 16
    const/4 v1, 0x5

    .line 17
    if-ne p0, v1, :cond_0

    .line 18
    .line 19
    check-cast p1, Ljava/lang/Integer;

    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    invoke-interface {p2, v0, p0}, Lcom/google/android/gms/internal/drive/zzns;->zzf(II)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/drive/zzkq;->zzdl()Lcom/google/android/gms/internal/drive/zzkr;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-static {p0}, Lds0;->p(Ljava/lang/Throwable;)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_1
    invoke-interface {p2}, Lcom/google/android/gms/internal/drive/zzns;->zzcd()I

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    sget v1, Lcom/google/android/gms/internal/drive/zzkk$zze;->zzsi:I

    .line 42
    .line 43
    if-ne p0, v1, :cond_2

    .line 44
    .line 45
    invoke-interface {p2, v0}, Lcom/google/android/gms/internal/drive/zzns;->zzak(I)V

    .line 46
    .line 47
    .line 48
    check-cast p1, Lcom/google/android/gms/internal/drive/zzmy;

    .line 49
    .line 50
    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/drive/zzmy;->zzb(Lcom/google/android/gms/internal/drive/zzns;)V

    .line 51
    .line 52
    .line 53
    invoke-interface {p2, v0}, Lcom/google/android/gms/internal/drive/zzns;->zzal(I)V

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :cond_2
    invoke-interface {p2, v0}, Lcom/google/android/gms/internal/drive/zzns;->zzal(I)V

    .line 58
    .line 59
    .line 60
    check-cast p1, Lcom/google/android/gms/internal/drive/zzmy;

    .line 61
    .line 62
    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/drive/zzmy;->zzb(Lcom/google/android/gms/internal/drive/zzns;)V

    .line 63
    .line 64
    .line 65
    invoke-interface {p2, v0}, Lcom/google/android/gms/internal/drive/zzns;->zzak(I)V

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :cond_3
    check-cast p1, Lcom/google/android/gms/internal/drive/zzjc;

    .line 70
    .line 71
    invoke-interface {p2, v0, p1}, Lcom/google/android/gms/internal/drive/zzns;->zza(ILcom/google/android/gms/internal/drive/zzjc;)V

    .line 72
    .line 73
    .line 74
    return-void

    .line 75
    :cond_4
    check-cast p1, Ljava/lang/Long;

    .line 76
    .line 77
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 78
    .line 79
    .line 80
    move-result-wide p0

    .line 81
    invoke-interface {p2, v0, p0, p1}, Lcom/google/android/gms/internal/drive/zzns;->zzc(IJ)V

    .line 82
    .line 83
    .line 84
    return-void

    .line 85
    :cond_5
    check-cast p1, Ljava/lang/Long;

    .line 86
    .line 87
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 88
    .line 89
    .line 90
    move-result-wide p0

    .line 91
    invoke-interface {p2, v0, p0, p1}, Lcom/google/android/gms/internal/drive/zzns;->zzi(IJ)V

    .line 92
    .line 93
    .line 94
    return-void
.end method

.method public static zzfa()Lcom/google/android/gms/internal/drive/zzmy;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/drive/zzmy;->zzvr:Lcom/google/android/gms/internal/drive/zzmy;

    .line 2
    .line 3
    return-object v0
.end method

.method public static zzfb()Lcom/google/android/gms/internal/drive/zzmy;
    .locals 1

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/drive/zzmy;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/google/android/gms/internal/drive/zzmy;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 8

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v1, 0x0

    .line 6
    if-nez p1, :cond_1

    .line 7
    .line 8
    return v1

    .line 9
    :cond_1
    instance-of v2, p1, Lcom/google/android/gms/internal/drive/zzmy;

    .line 10
    .line 11
    if-nez v2, :cond_2

    .line 12
    .line 13
    return v1

    .line 14
    :cond_2
    check-cast p1, Lcom/google/android/gms/internal/drive/zzmy;

    .line 15
    .line 16
    iget v2, p0, Lcom/google/android/gms/internal/drive/zzmy;->count:I

    .line 17
    .line 18
    iget v3, p1, Lcom/google/android/gms/internal/drive/zzmy;->count:I

    .line 19
    .line 20
    if-ne v2, v3, :cond_7

    .line 21
    .line 22
    iget-object v3, p0, Lcom/google/android/gms/internal/drive/zzmy;->zzvs:[I

    .line 23
    .line 24
    iget-object v4, p1, Lcom/google/android/gms/internal/drive/zzmy;->zzvs:[I

    .line 25
    .line 26
    move v5, v1

    .line 27
    :goto_0
    if-ge v5, v2, :cond_4

    .line 28
    .line 29
    aget v6, v3, v5

    .line 30
    .line 31
    aget v7, v4, v5

    .line 32
    .line 33
    if-eq v6, v7, :cond_3

    .line 34
    .line 35
    goto :goto_2

    .line 36
    :cond_3
    add-int/lit8 v5, v5, 0x1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_4
    iget-object v2, p0, Lcom/google/android/gms/internal/drive/zzmy;->zzue:[Ljava/lang/Object;

    .line 40
    .line 41
    iget-object p1, p1, Lcom/google/android/gms/internal/drive/zzmy;->zzue:[Ljava/lang/Object;

    .line 42
    .line 43
    iget p0, p0, Lcom/google/android/gms/internal/drive/zzmy;->count:I

    .line 44
    .line 45
    move v3, v1

    .line 46
    :goto_1
    if-ge v3, p0, :cond_6

    .line 47
    .line 48
    aget-object v4, v2, v3

    .line 49
    .line 50
    aget-object v5, p1, v3

    .line 51
    .line 52
    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    if-nez v4, :cond_5

    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_5
    add-int/lit8 v3, v3, 0x1

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_6
    return v0

    .line 63
    :cond_7
    :goto_2
    return v1
.end method

.method public final hashCode()I
    .locals 8

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/drive/zzmy;->count:I

    .line 2
    .line 3
    add-int/lit16 v1, v0, 0x20f

    .line 4
    .line 5
    mul-int/lit8 v1, v1, 0x1f

    .line 6
    .line 7
    iget-object v2, p0, Lcom/google/android/gms/internal/drive/zzmy;->zzvs:[I

    .line 8
    .line 9
    const/16 v3, 0x11

    .line 10
    .line 11
    const/4 v4, 0x0

    .line 12
    move v6, v3

    .line 13
    move v5, v4

    .line 14
    :goto_0
    if-ge v5, v0, :cond_0

    .line 15
    .line 16
    mul-int/lit8 v6, v6, 0x1f

    .line 17
    .line 18
    aget v7, v2, v5

    .line 19
    .line 20
    add-int/2addr v6, v7

    .line 21
    add-int/lit8 v5, v5, 0x1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    add-int/2addr v1, v6

    .line 25
    mul-int/lit8 v1, v1, 0x1f

    .line 26
    .line 27
    iget-object v0, p0, Lcom/google/android/gms/internal/drive/zzmy;->zzue:[Ljava/lang/Object;

    .line 28
    .line 29
    iget p0, p0, Lcom/google/android/gms/internal/drive/zzmy;->count:I

    .line 30
    .line 31
    :goto_1
    if-ge v4, p0, :cond_1

    .line 32
    .line 33
    mul-int/lit8 v3, v3, 0x1f

    .line 34
    .line 35
    aget-object v2, v0, v4

    .line 36
    .line 37
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    add-int/2addr v3, v2

    .line 42
    add-int/lit8 v4, v4, 0x1

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_1
    add-int/2addr v1, v3

    .line 46
    return v1
.end method

.method public final zza(Lcom/google/android/gms/internal/drive/zzns;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Lcom/google/android/gms/internal/drive/zzns;->zzcd()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    sget v1, Lcom/google/android/gms/internal/drive/zzkk$zze;->zzsj:I

    .line 6
    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    iget v0, p0, Lcom/google/android/gms/internal/drive/zzmy;->count:I

    .line 10
    .line 11
    add-int/lit8 v0, v0, -0x1

    .line 12
    .line 13
    :goto_0
    if-ltz v0, :cond_1

    .line 14
    .line 15
    iget-object v1, p0, Lcom/google/android/gms/internal/drive/zzmy;->zzvs:[I

    .line 16
    .line 17
    aget v1, v1, v0

    .line 18
    .line 19
    ushr-int/lit8 v1, v1, 0x3

    .line 20
    .line 21
    iget-object v2, p0, Lcom/google/android/gms/internal/drive/zzmy;->zzue:[Ljava/lang/Object;

    .line 22
    .line 23
    aget-object v2, v2, v0

    .line 24
    .line 25
    invoke-interface {p1, v1, v2}, Lcom/google/android/gms/internal/drive/zzns;->zza(ILjava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    add-int/lit8 v0, v0, -0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const/4 v0, 0x0

    .line 32
    :goto_1
    iget v1, p0, Lcom/google/android/gms/internal/drive/zzmy;->count:I

    .line 33
    .line 34
    if-ge v0, v1, :cond_1

    .line 35
    .line 36
    iget-object v1, p0, Lcom/google/android/gms/internal/drive/zzmy;->zzvs:[I

    .line 37
    .line 38
    aget v1, v1, v0

    .line 39
    .line 40
    ushr-int/lit8 v1, v1, 0x3

    .line 41
    .line 42
    iget-object v2, p0, Lcom/google/android/gms/internal/drive/zzmy;->zzue:[Ljava/lang/Object;

    .line 43
    .line 44
    aget-object v2, v2, v0

    .line 45
    .line 46
    invoke-interface {p1, v1, v2}, Lcom/google/android/gms/internal/drive/zzns;->zza(ILjava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    add-int/lit8 v0, v0, 0x1

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_1
    return-void
.end method

.method public final zza(Ljava/lang/StringBuilder;I)V
    .locals 3

    const/4 v0, 0x0

    .line 59
    :goto_0
    iget v1, p0, Lcom/google/android/gms/internal/drive/zzmy;->count:I

    if-ge v0, v1, :cond_0

    .line 60
    iget-object v1, p0, Lcom/google/android/gms/internal/drive/zzmy;->zzvs:[I

    aget v1, v1, v0

    ushr-int/lit8 v1, v1, 0x3

    .line 61
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/drive/zzmy;->zzue:[Ljava/lang/Object;

    aget-object v2, v2, v0

    invoke-static {p1, p2, v1, v2}, Lcom/google/android/gms/internal/drive/zzlt;->zza(Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/Object;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final zzb(ILjava/lang/Object;)V
    .locals 3

    .line 101
    iget-boolean v0, p0, Lcom/google/android/gms/internal/drive/zzmy;->zznh:Z

    if-eqz v0, :cond_2

    .line 102
    iget v0, p0, Lcom/google/android/gms/internal/drive/zzmy;->count:I

    iget-object v1, p0, Lcom/google/android/gms/internal/drive/zzmy;->zzvs:[I

    array-length v2, v1

    if-ne v0, v2, :cond_1

    const/4 v2, 0x4

    if-ge v0, v2, :cond_0

    const/16 v2, 0x8

    goto :goto_0

    :cond_0
    shr-int/lit8 v2, v0, 0x1

    :goto_0
    add-int/2addr v0, v2

    .line 103
    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/internal/drive/zzmy;->zzvs:[I

    .line 104
    iget-object v1, p0, Lcom/google/android/gms/internal/drive/zzmy;->zzue:[Ljava/lang/Object;

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/drive/zzmy;->zzue:[Ljava/lang/Object;

    .line 105
    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/drive/zzmy;->zzvs:[I

    iget v1, p0, Lcom/google/android/gms/internal/drive/zzmy;->count:I

    aput p1, v0, v1

    .line 106
    iget-object p1, p0, Lcom/google/android/gms/internal/drive/zzmy;->zzue:[Ljava/lang/Object;

    aput-object p2, p1, v1

    add-int/lit8 v1, v1, 0x1

    .line 107
    iput v1, p0, Lcom/google/android/gms/internal/drive/zzmy;->count:I

    return-void

    .line 108
    :cond_2
    invoke-static {}, Lf42;->p()V

    return-void
.end method

.method public final zzb(Lcom/google/android/gms/internal/drive/zzns;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 95
    iget v0, p0, Lcom/google/android/gms/internal/drive/zzmy;->count:I

    if-nez v0, :cond_0

    goto :goto_2

    .line 96
    :cond_0
    invoke-interface {p1}, Lcom/google/android/gms/internal/drive/zzns;->zzcd()I

    move-result v0

    sget v1, Lcom/google/android/gms/internal/drive/zzkk$zze;->zzsi:I

    if-ne v0, v1, :cond_1

    const/4 v0, 0x0

    .line 97
    :goto_0
    iget v1, p0, Lcom/google/android/gms/internal/drive/zzmy;->count:I

    if-ge v0, v1, :cond_2

    .line 98
    iget-object v1, p0, Lcom/google/android/gms/internal/drive/zzmy;->zzvs:[I

    aget v1, v1, v0

    iget-object v2, p0, Lcom/google/android/gms/internal/drive/zzmy;->zzue:[Ljava/lang/Object;

    aget-object v2, v2, v0

    invoke-static {v1, v2, p1}, Lcom/google/android/gms/internal/drive/zzmy;->zzb(ILjava/lang/Object;Lcom/google/android/gms/internal/drive/zzns;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 99
    :cond_1
    iget v0, p0, Lcom/google/android/gms/internal/drive/zzmy;->count:I

    add-int/lit8 v0, v0, -0x1

    :goto_1
    if-ltz v0, :cond_2

    .line 100
    iget-object v1, p0, Lcom/google/android/gms/internal/drive/zzmy;->zzvs:[I

    aget v1, v1, v0

    iget-object v2, p0, Lcom/google/android/gms/internal/drive/zzmy;->zzue:[Ljava/lang/Object;

    aget-object v2, v2, v0

    invoke-static {v1, v2, p1}, Lcom/google/android/gms/internal/drive/zzmy;->zzb(ILjava/lang/Object;Lcom/google/android/gms/internal/drive/zzns;)V

    add-int/lit8 v0, v0, -0x1

    goto :goto_1

    :cond_2
    :goto_2
    return-void
.end method

.method public final zzbp()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/google/android/gms/internal/drive/zzmy;->zznh:Z

    .line 3
    .line 4
    return-void
.end method

.method public final zzcx()I
    .locals 6

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/drive/zzmy;->zzrr:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-eq v0, v1, :cond_0

    .line 5
    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    move v1, v0

    .line 9
    :goto_0
    iget v2, p0, Lcom/google/android/gms/internal/drive/zzmy;->count:I

    .line 10
    .line 11
    if-ge v0, v2, :cond_6

    .line 12
    .line 13
    iget-object v2, p0, Lcom/google/android/gms/internal/drive/zzmy;->zzvs:[I

    .line 14
    .line 15
    aget v2, v2, v0

    .line 16
    .line 17
    ushr-int/lit8 v3, v2, 0x3

    .line 18
    .line 19
    and-int/lit8 v2, v2, 0x7

    .line 20
    .line 21
    if-eqz v2, :cond_5

    .line 22
    .line 23
    const/4 v4, 0x1

    .line 24
    if-eq v2, v4, :cond_4

    .line 25
    .line 26
    const/4 v5, 0x2

    .line 27
    if-eq v2, v5, :cond_3

    .line 28
    .line 29
    const/4 v5, 0x3

    .line 30
    if-eq v2, v5, :cond_2

    .line 31
    .line 32
    const/4 v4, 0x5

    .line 33
    if-ne v2, v4, :cond_1

    .line 34
    .line 35
    iget-object v2, p0, Lcom/google/android/gms/internal/drive/zzmy;->zzue:[Ljava/lang/Object;

    .line 36
    .line 37
    aget-object v2, v2, v0

    .line 38
    .line 39
    check-cast v2, Ljava/lang/Integer;

    .line 40
    .line 41
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/drive/zzjr;->zzj(II)I

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    :goto_1
    add-int/2addr v2, v1

    .line 50
    move v1, v2

    .line 51
    goto :goto_2

    .line 52
    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/drive/zzkq;->zzdl()Lcom/google/android/gms/internal/drive/zzkr;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    invoke-static {p0}, Lio/sentry/u2;->o(Ljava/lang/Throwable;)V

    .line 57
    .line 58
    .line 59
    const/4 p0, 0x0

    .line 60
    return p0

    .line 61
    :cond_2
    invoke-static {v3}, Lcom/google/android/gms/internal/drive/zzjr;->zzab(I)I

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    shl-int/2addr v2, v4

    .line 66
    iget-object v3, p0, Lcom/google/android/gms/internal/drive/zzmy;->zzue:[Ljava/lang/Object;

    .line 67
    .line 68
    aget-object v3, v3, v0

    .line 69
    .line 70
    check-cast v3, Lcom/google/android/gms/internal/drive/zzmy;

    .line 71
    .line 72
    invoke-virtual {v3}, Lcom/google/android/gms/internal/drive/zzmy;->zzcx()I

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    add-int/2addr v3, v2

    .line 77
    add-int/2addr v3, v1

    .line 78
    move v1, v3

    .line 79
    goto :goto_2

    .line 80
    :cond_3
    iget-object v2, p0, Lcom/google/android/gms/internal/drive/zzmy;->zzue:[Ljava/lang/Object;

    .line 81
    .line 82
    aget-object v2, v2, v0

    .line 83
    .line 84
    check-cast v2, Lcom/google/android/gms/internal/drive/zzjc;

    .line 85
    .line 86
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/drive/zzjr;->zzc(ILcom/google/android/gms/internal/drive/zzjc;)I

    .line 87
    .line 88
    .line 89
    move-result v2

    .line 90
    goto :goto_1

    .line 91
    :cond_4
    iget-object v2, p0, Lcom/google/android/gms/internal/drive/zzmy;->zzue:[Ljava/lang/Object;

    .line 92
    .line 93
    aget-object v2, v2, v0

    .line 94
    .line 95
    check-cast v2, Ljava/lang/Long;

    .line 96
    .line 97
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 98
    .line 99
    .line 100
    move-result-wide v4

    .line 101
    invoke-static {v3, v4, v5}, Lcom/google/android/gms/internal/drive/zzjr;->zzg(IJ)I

    .line 102
    .line 103
    .line 104
    move-result v2

    .line 105
    goto :goto_1

    .line 106
    :cond_5
    iget-object v2, p0, Lcom/google/android/gms/internal/drive/zzmy;->zzue:[Ljava/lang/Object;

    .line 107
    .line 108
    aget-object v2, v2, v0

    .line 109
    .line 110
    check-cast v2, Ljava/lang/Long;

    .line 111
    .line 112
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 113
    .line 114
    .line 115
    move-result-wide v4

    .line 116
    invoke-static {v3, v4, v5}, Lcom/google/android/gms/internal/drive/zzjr;->zze(IJ)I

    .line 117
    .line 118
    .line 119
    move-result v2

    .line 120
    goto :goto_1

    .line 121
    :goto_2
    add-int/lit8 v0, v0, 0x1

    .line 122
    .line 123
    goto :goto_0

    .line 124
    :cond_6
    iput v1, p0, Lcom/google/android/gms/internal/drive/zzmy;->zzrr:I

    .line 125
    .line 126
    return v1
.end method

.method public final zzfc()I
    .locals 4

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/drive/zzmy;->zzrr:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-eq v0, v1, :cond_0

    .line 5
    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    move v1, v0

    .line 9
    :goto_0
    iget v2, p0, Lcom/google/android/gms/internal/drive/zzmy;->count:I

    .line 10
    .line 11
    if-ge v0, v2, :cond_1

    .line 12
    .line 13
    iget-object v2, p0, Lcom/google/android/gms/internal/drive/zzmy;->zzvs:[I

    .line 14
    .line 15
    aget v2, v2, v0

    .line 16
    .line 17
    ushr-int/lit8 v2, v2, 0x3

    .line 18
    .line 19
    iget-object v3, p0, Lcom/google/android/gms/internal/drive/zzmy;->zzue:[Ljava/lang/Object;

    .line 20
    .line 21
    aget-object v3, v3, v0

    .line 22
    .line 23
    check-cast v3, Lcom/google/android/gms/internal/drive/zzjc;

    .line 24
    .line 25
    invoke-static {v2, v3}, Lcom/google/android/gms/internal/drive/zzjr;->zzd(ILcom/google/android/gms/internal/drive/zzjc;)I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    add-int/2addr v1, v2

    .line 30
    add-int/lit8 v0, v0, 0x1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    iput v1, p0, Lcom/google/android/gms/internal/drive/zzmy;->zzrr:I

    .line 34
    .line 35
    return v1
.end method
