.class public final Lcom/google/android/recaptcha/internal/zzxp;
.super Lcom/google/android/recaptcha/internal/zzsn;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lcom/google/android/recaptcha/internal/zztt;


# static fields
.field private static final zzb:Lcom/google/android/recaptcha/internal/zzxp;

.field private static volatile zzd:Lcom/google/android/recaptcha/internal/zzua;


# instance fields
.field private zze:Lcom/google/android/recaptcha/internal/zzqm;

.field private zzf:Ljava/lang/String;

.field private zzg:J

.field private zzh:Lcom/google/android/recaptcha/internal/zzqm;

.field private zzi:Ljava/lang/String;

.field private zzj:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/recaptcha/internal/zzxp;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/google/android/recaptcha/internal/zzxp;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/google/android/recaptcha/internal/zzxp;->zzb:Lcom/google/android/recaptcha/internal/zzxp;

    .line 7
    .line 8
    const-class v1, Lcom/google/android/recaptcha/internal/zzxp;

    .line 9
    .line 10
    invoke-static {v1, v0}, Lcom/google/android/recaptcha/internal/zzsn;->zzI(Ljava/lang/Class;Lcom/google/android/recaptcha/internal/zzsn;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/google/android/recaptcha/internal/zzsn;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lcom/google/android/recaptcha/internal/zzqm;->zzb:Lcom/google/android/recaptcha/internal/zzqm;

    .line 5
    .line 6
    iput-object v0, p0, Lcom/google/android/recaptcha/internal/zzxp;->zze:Lcom/google/android/recaptcha/internal/zzqm;

    .line 7
    .line 8
    const-string v1, ""

    .line 9
    .line 10
    iput-object v1, p0, Lcom/google/android/recaptcha/internal/zzxp;->zzf:Ljava/lang/String;

    .line 11
    .line 12
    iput-object v0, p0, Lcom/google/android/recaptcha/internal/zzxp;->zzh:Lcom/google/android/recaptcha/internal/zzqm;

    .line 13
    .line 14
    iput-object v1, p0, Lcom/google/android/recaptcha/internal/zzxp;->zzi:Ljava/lang/String;

    .line 15
    .line 16
    iput-object v1, p0, Lcom/google/android/recaptcha/internal/zzxp;->zzj:Ljava/lang/String;

    .line 17
    .line 18
    return-void
.end method

.method public static bridge synthetic zzj()Lcom/google/android/recaptcha/internal/zzxp;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/recaptcha/internal/zzxp;->zzb:Lcom/google/android/recaptcha/internal/zzxp;

    .line 2
    .line 3
    return-object v0
.end method

.method public static zzk()Lcom/google/android/recaptcha/internal/zzxp;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/recaptcha/internal/zzxp;->zzb:Lcom/google/android/recaptcha/internal/zzxp;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public final zzf()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/google/android/recaptcha/internal/zzxp;->zzg:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final zzg()Lcom/google/android/recaptcha/internal/zzqm;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/recaptcha/internal/zzxp;->zzh:Lcom/google/android/recaptcha/internal/zzqm;

    .line 2
    .line 3
    return-object p0
.end method

.method public final zzh(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    add-int/lit8 p1, p1, -0x1

    .line 2
    .line 3
    if-eqz p1, :cond_7

    .line 4
    .line 5
    const/4 p0, 0x2

    .line 6
    if-eq p1, p0, :cond_6

    .line 7
    .line 8
    const/4 p0, 0x3

    .line 9
    if-eq p1, p0, :cond_5

    .line 10
    .line 11
    const/4 p0, 0x4

    .line 12
    const/4 p2, 0x0

    .line 13
    if-eq p1, p0, :cond_4

    .line 14
    .line 15
    const/4 p0, 0x5

    .line 16
    if-eq p1, p0, :cond_3

    .line 17
    .line 18
    const/4 p0, 0x6

    .line 19
    if-ne p1, p0, :cond_2

    .line 20
    .line 21
    sget-object p0, Lcom/google/android/recaptcha/internal/zzxp;->zzd:Lcom/google/android/recaptcha/internal/zzua;

    .line 22
    .line 23
    if-nez p0, :cond_1

    .line 24
    .line 25
    const-class p1, Lcom/google/android/recaptcha/internal/zzxp;

    .line 26
    .line 27
    monitor-enter p1

    .line 28
    :try_start_0
    sget-object p0, Lcom/google/android/recaptcha/internal/zzxp;->zzd:Lcom/google/android/recaptcha/internal/zzua;

    .line 29
    .line 30
    if-nez p0, :cond_0

    .line 31
    .line 32
    new-instance p0, Lcom/google/android/recaptcha/internal/zzsi;

    .line 33
    .line 34
    sget-object p2, Lcom/google/android/recaptcha/internal/zzxp;->zzb:Lcom/google/android/recaptcha/internal/zzxp;

    .line 35
    .line 36
    invoke-direct {p0, p2}, Lcom/google/android/recaptcha/internal/zzsi;-><init>(Lcom/google/android/recaptcha/internal/zzsn;)V

    .line 37
    .line 38
    .line 39
    sput-object p0, Lcom/google/android/recaptcha/internal/zzxp;->zzd:Lcom/google/android/recaptcha/internal/zzua;

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :catchall_0
    move-exception v0

    .line 43
    move-object p0, v0

    .line 44
    goto :goto_1

    .line 45
    :cond_0
    :goto_0
    monitor-exit p1

    .line 46
    return-object p0

    .line 47
    :goto_1
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    throw p0

    .line 49
    :cond_1
    return-object p0

    .line 50
    :cond_2
    throw p2

    .line 51
    :cond_3
    sget-object p0, Lcom/google/android/recaptcha/internal/zzxp;->zzb:Lcom/google/android/recaptcha/internal/zzxp;

    .line 52
    .line 53
    return-object p0

    .line 54
    :cond_4
    new-instance p0, Lcom/google/android/recaptcha/internal/zzxo;

    .line 55
    .line 56
    invoke-direct {p0, p2}, Lcom/google/android/recaptcha/internal/zzxo;-><init>(Lcom/google/android/recaptcha/internal/zzyc;)V

    .line 57
    .line 58
    .line 59
    return-object p0

    .line 60
    :cond_5
    new-instance p0, Lcom/google/android/recaptcha/internal/zzxp;

    .line 61
    .line 62
    invoke-direct {p0}, Lcom/google/android/recaptcha/internal/zzxp;-><init>()V

    .line 63
    .line 64
    .line 65
    return-object p0

    .line 66
    :cond_6
    const-string v0, "zze"

    .line 67
    .line 68
    const-string v1, "zzf"

    .line 69
    .line 70
    const-string v2, "zzg"

    .line 71
    .line 72
    const-string v3, "zzh"

    .line 73
    .line 74
    const-string v4, "zzi"

    .line 75
    .line 76
    const-string v5, "zzj"

    .line 77
    .line 78
    filled-new-array/range {v0 .. v5}, [Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    sget-object p1, Lcom/google/android/recaptcha/internal/zzxp;->zzb:Lcom/google/android/recaptcha/internal/zzxp;

    .line 83
    .line 84
    const-string p2, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\n\u0002\u0208\u0003\u0002\u0004\n\u0005\u0208\u0006\u0208"

    .line 85
    .line 86
    invoke-static {p1, p2, p0}, Lcom/google/android/recaptcha/internal/zzsn;->zzF(Lcom/google/android/recaptcha/internal/zzts;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    return-object p0

    .line 91
    :cond_7
    const/4 p0, 0x1

    .line 92
    invoke-static {p0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    return-object p0
.end method

.method public final zzi()Lcom/google/android/recaptcha/internal/zzqm;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/recaptcha/internal/zzxp;->zze:Lcom/google/android/recaptcha/internal/zzqm;

    .line 2
    .line 3
    return-object p0
.end method

.method public final zzl()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/recaptcha/internal/zzxp;->zzf:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method
