.class public final Lcom/google/android/gms/internal/drive/zzez;
.super Lcom/google/android/gms/internal/drive/zzkk;

# interfaces
.implements Lcom/google/android/gms/internal/drive/zzls;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/drive/zzez$zza;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/drive/zzkk<",
        "Lcom/google/android/gms/internal/drive/zzez;",
        "Lcom/google/android/gms/internal/drive/zzez$zza;",
        ">;",
        "Lcom/google/android/gms/internal/drive/zzls;"
    }
.end annotation


# static fields
.field private static final zzhj:Lcom/google/android/gms/internal/drive/zzez;

.field private static volatile zzhk:Lcom/google/android/gms/internal/drive/zzmb;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/drive/zzmb<",
            "Lcom/google/android/gms/internal/drive/zzez;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private zzhd:I

.field private zzhe:I

.field private zzhf:J

.field private zzhg:J

.field private zzhh:J

.field private zzhi:B


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/drive/zzez;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/google/android/gms/internal/drive/zzez;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/google/android/gms/internal/drive/zzez;->zzhj:Lcom/google/android/gms/internal/drive/zzez;

    .line 7
    .line 8
    const-class v1, Lcom/google/android/gms/internal/drive/zzez;

    .line 9
    .line 10
    invoke-static {v1, v0}, Lcom/google/android/gms/internal/drive/zzkk;->zza(Ljava/lang/Class;Lcom/google/android/gms/internal/drive/zzkk;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/drive/zzkk;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x2

    .line 5
    iput-byte v0, p0, Lcom/google/android/gms/internal/drive/zzez;->zzhi:B

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    iput v0, p0, Lcom/google/android/gms/internal/drive/zzez;->zzhe:I

    .line 9
    .line 10
    const-wide/16 v0, -0x1

    .line 11
    .line 12
    iput-wide v0, p0, Lcom/google/android/gms/internal/drive/zzez;->zzhf:J

    .line 13
    .line 14
    iput-wide v0, p0, Lcom/google/android/gms/internal/drive/zzez;->zzhg:J

    .line 15
    .line 16
    iput-wide v0, p0, Lcom/google/android/gms/internal/drive/zzez;->zzhh:J

    .line 17
    .line 18
    return-void
.end method

.method private final setSequenceNumber(J)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/drive/zzez;->zzhd:I

    .line 2
    .line 3
    or-int/lit8 v0, v0, 0x2

    .line 4
    .line 5
    iput v0, p0, Lcom/google/android/gms/internal/drive/zzez;->zzhd:I

    .line 6
    .line 7
    iput-wide p1, p0, Lcom/google/android/gms/internal/drive/zzez;->zzhf:J

    .line 8
    .line 9
    return-void
.end method

.method private final zza(J)V
    .locals 1

    .line 95
    iget v0, p0, Lcom/google/android/gms/internal/drive/zzez;->zzhd:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Lcom/google/android/gms/internal/drive/zzez;->zzhd:I

    .line 96
    iput-wide p1, p0, Lcom/google/android/gms/internal/drive/zzez;->zzhg:J

    return-void
.end method

.method public static synthetic zza(Lcom/google/android/gms/internal/drive/zzez;I)V
    .locals 0

    const/4 p1, 0x1

    .line 97
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/drive/zzez;->zzj(I)V

    return-void
.end method

.method public static synthetic zza(Lcom/google/android/gms/internal/drive/zzez;J)V
    .locals 0

    .line 98
    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/drive/zzez;->setSequenceNumber(J)V

    return-void
.end method

.method public static zzaj()Lcom/google/android/gms/internal/drive/zzez$zza;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/drive/zzez;->zzhj:Lcom/google/android/gms/internal/drive/zzez;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/drive/zzkk;->zzcw()Lcom/google/android/gms/internal/drive/zzkk$zza;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/google/android/gms/internal/drive/zzez$zza;

    .line 8
    .line 9
    return-object v0
.end method

.method public static synthetic zzak()Lcom/google/android/gms/internal/drive/zzez;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/drive/zzez;->zzhj:Lcom/google/android/gms/internal/drive/zzez;

    .line 2
    .line 3
    return-object v0
.end method

.method private final zzb(J)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/drive/zzez;->zzhd:I

    .line 2
    .line 3
    or-int/lit8 v0, v0, 0x8

    .line 4
    .line 5
    iput v0, p0, Lcom/google/android/gms/internal/drive/zzez;->zzhd:I

    .line 6
    .line 7
    iput-wide p1, p0, Lcom/google/android/gms/internal/drive/zzez;->zzhh:J

    .line 8
    .line 9
    return-void
.end method

.method public static synthetic zzb(Lcom/google/android/gms/internal/drive/zzez;J)V
    .locals 0

    .line 10
    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/drive/zzez;->zza(J)V

    return-void
.end method

.method public static synthetic zzc(Lcom/google/android/gms/internal/drive/zzez;J)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/drive/zzez;->zzb(J)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final zzj(I)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/drive/zzez;->zzhd:I

    .line 2
    .line 3
    or-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    iput v0, p0, Lcom/google/android/gms/internal/drive/zzez;->zzhd:I

    .line 6
    .line 7
    iput p1, p0, Lcom/google/android/gms/internal/drive/zzez;->zzhe:I

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final zza(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    sget-object p3, Lcom/google/android/gms/internal/drive/zzfa;->zzhl:[I

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    sub-int/2addr p1, v0

    .line 5
    aget p1, p3, p1

    .line 6
    .line 7
    const/4 p3, 0x0

    .line 8
    packed-switch p1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    invoke-static {}, Lf42;->p()V

    .line 12
    .line 13
    .line 14
    return-object p3

    .line 15
    :pswitch_0
    if-nez p2, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    :cond_0
    int-to-byte p1, v0

    .line 19
    iput-byte p1, p0, Lcom/google/android/gms/internal/drive/zzez;->zzhi:B

    .line 20
    .line 21
    return-object p3

    .line 22
    :pswitch_1
    iget-byte p0, p0, Lcom/google/android/gms/internal/drive/zzez;->zzhi:B

    .line 23
    .line 24
    invoke-static {p0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0

    .line 29
    :pswitch_2
    sget-object p0, Lcom/google/android/gms/internal/drive/zzez;->zzhk:Lcom/google/android/gms/internal/drive/zzmb;

    .line 30
    .line 31
    if-nez p0, :cond_2

    .line 32
    .line 33
    const-class p1, Lcom/google/android/gms/internal/drive/zzez;

    .line 34
    .line 35
    monitor-enter p1

    .line 36
    :try_start_0
    sget-object p0, Lcom/google/android/gms/internal/drive/zzez;->zzhk:Lcom/google/android/gms/internal/drive/zzmb;

    .line 37
    .line 38
    if-nez p0, :cond_1

    .line 39
    .line 40
    new-instance p0, Lcom/google/android/gms/internal/drive/zzkk$zzb;

    .line 41
    .line 42
    sget-object p2, Lcom/google/android/gms/internal/drive/zzez;->zzhj:Lcom/google/android/gms/internal/drive/zzez;

    .line 43
    .line 44
    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/drive/zzkk$zzb;-><init>(Lcom/google/android/gms/internal/drive/zzkk;)V

    .line 45
    .line 46
    .line 47
    sput-object p0, Lcom/google/android/gms/internal/drive/zzez;->zzhk:Lcom/google/android/gms/internal/drive/zzmb;

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :catchall_0
    move-exception p0

    .line 51
    goto :goto_1

    .line 52
    :cond_1
    :goto_0
    monitor-exit p1

    .line 53
    return-object p0

    .line 54
    :goto_1
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 55
    throw p0

    .line 56
    :cond_2
    return-object p0

    .line 57
    :pswitch_3
    sget-object p0, Lcom/google/android/gms/internal/drive/zzez;->zzhj:Lcom/google/android/gms/internal/drive/zzez;

    .line 58
    .line 59
    return-object p0

    .line 60
    :pswitch_4
    const-string p0, "zzhd"

    .line 61
    .line 62
    const-string p1, "zzhe"

    .line 63
    .line 64
    const-string p2, "zzhf"

    .line 65
    .line 66
    const-string p3, "zzhg"

    .line 67
    .line 68
    const-string v0, "zzhh"

    .line 69
    .line 70
    filled-new-array {p0, p1, p2, p3, v0}, [Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    const-string p1, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0004\u0001\u0504\u0000\u0002\u0510\u0001\u0003\u0510\u0002\u0004\u0510\u0003"

    .line 75
    .line 76
    sget-object p2, Lcom/google/android/gms/internal/drive/zzez;->zzhj:Lcom/google/android/gms/internal/drive/zzez;

    .line 77
    .line 78
    invoke-static {p2, p1, p0}, Lcom/google/android/gms/internal/drive/zzkk;->zza(Lcom/google/android/gms/internal/drive/zzlq;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    return-object p0

    .line 83
    :pswitch_5
    new-instance p0, Lcom/google/android/gms/internal/drive/zzez$zza;

    .line 84
    .line 85
    invoke-direct {p0, p3}, Lcom/google/android/gms/internal/drive/zzez$zza;-><init>(Lcom/google/android/gms/internal/drive/zzfa;)V

    .line 86
    .line 87
    .line 88
    return-object p0

    .line 89
    :pswitch_6
    new-instance p0, Lcom/google/android/gms/internal/drive/zzez;

    .line 90
    .line 91
    invoke-direct {p0}, Lcom/google/android/gms/internal/drive/zzez;-><init>()V

    .line 92
    .line 93
    .line 94
    return-object p0

    .line 95
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
