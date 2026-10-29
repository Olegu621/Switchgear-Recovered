.class final Lcom/google/android/gms/internal/drive/zzjq;
.super Lcom/google/android/gms/internal/drive/zzjo;


# instance fields
.field private final buffer:[B

.field private limit:I

.field private pos:I

.field private final zzoc:Z

.field private zzod:I

.field private zzoe:I

.field private zzof:I


# direct methods
.method private constructor <init>([BIIZ)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/drive/zzjo;-><init>(Lcom/google/android/gms/internal/drive/zzjp;)V

    .line 3
    .line 4
    .line 5
    const v0, 0x7fffffff

    .line 6
    .line 7
    .line 8
    iput v0, p0, Lcom/google/android/gms/internal/drive/zzjq;->zzof:I

    .line 9
    .line 10
    iput-object p1, p0, Lcom/google/android/gms/internal/drive/zzjq;->buffer:[B

    .line 11
    .line 12
    add-int/2addr p3, p2

    .line 13
    iput p3, p0, Lcom/google/android/gms/internal/drive/zzjq;->limit:I

    .line 14
    .line 15
    iput p2, p0, Lcom/google/android/gms/internal/drive/zzjq;->pos:I

    .line 16
    .line 17
    iput p2, p0, Lcom/google/android/gms/internal/drive/zzjq;->zzoe:I

    .line 18
    .line 19
    iput-boolean p4, p0, Lcom/google/android/gms/internal/drive/zzjq;->zzoc:Z

    .line 20
    .line 21
    return-void
.end method

.method public synthetic constructor <init>([BIIZLcom/google/android/gms/internal/drive/zzjp;)V
    .locals 0

    .line 22
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/google/android/gms/internal/drive/zzjq;-><init>([BIIZ)V

    return-void
.end method


# virtual methods
.method public final zzbz()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/drive/zzjq;->pos:I

    .line 2
    .line 3
    iget p0, p0, Lcom/google/android/gms/internal/drive/zzjq;->zzoe:I

    .line 4
    .line 5
    sub-int/2addr v0, p0

    .line 6
    return v0
.end method

.method public final zzv(I)I
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/drive/zzkq;
        }
    .end annotation

    .line 1
    if-ltz p1, :cond_2

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/google/android/gms/internal/drive/zzjq;->zzbz()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    add-int/2addr p1, v0

    .line 8
    iget v0, p0, Lcom/google/android/gms/internal/drive/zzjq;->zzof:I

    .line 9
    .line 10
    if-gt p1, v0, :cond_1

    .line 11
    .line 12
    iput p1, p0, Lcom/google/android/gms/internal/drive/zzjq;->zzof:I

    .line 13
    .line 14
    iget v1, p0, Lcom/google/android/gms/internal/drive/zzjq;->limit:I

    .line 15
    .line 16
    iget v2, p0, Lcom/google/android/gms/internal/drive/zzjq;->zzod:I

    .line 17
    .line 18
    add-int/2addr v1, v2

    .line 19
    iput v1, p0, Lcom/google/android/gms/internal/drive/zzjq;->limit:I

    .line 20
    .line 21
    iget v2, p0, Lcom/google/android/gms/internal/drive/zzjq;->zzoe:I

    .line 22
    .line 23
    sub-int v2, v1, v2

    .line 24
    .line 25
    if-le v2, p1, :cond_0

    .line 26
    .line 27
    sub-int/2addr v2, p1

    .line 28
    iput v2, p0, Lcom/google/android/gms/internal/drive/zzjq;->zzod:I

    .line 29
    .line 30
    sub-int/2addr v1, v2

    .line 31
    iput v1, p0, Lcom/google/android/gms/internal/drive/zzjq;->limit:I

    .line 32
    .line 33
    return v0

    .line 34
    :cond_0
    const/4 p1, 0x0

    .line 35
    iput p1, p0, Lcom/google/android/gms/internal/drive/zzjq;->zzod:I

    .line 36
    .line 37
    return v0

    .line 38
    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/drive/zzkq;->zzdi()Lcom/google/android/gms/internal/drive/zzkq;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    throw p0

    .line 43
    :cond_2
    invoke-static {}, Lcom/google/android/gms/internal/drive/zzkq;->zzdj()Lcom/google/android/gms/internal/drive/zzkq;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    throw p0
.end method
