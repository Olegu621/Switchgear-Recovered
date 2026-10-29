.class public final Ltr3;
.super Leo3;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field private static final zzm:Ltr3;


# instance fields
.field private zza:I

.field private zze:Lro3;

.field private zzf:Lpr3;

.field private zzg:Lnr3;

.field private zzh:Ljr3;

.field private zzi:Lhr3;

.field private zzj:Lrr3;

.field private zzk:Lir3;

.field private zzl:B


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ltr3;

    .line 2
    .line 3
    invoke-direct {v0}, Ltr3;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ltr3;->zzm:Ltr3;

    .line 7
    .line 8
    const-class v1, Ltr3;

    .line 9
    .line 10
    invoke-static {v1, v0}, Leo3;->f(Ljava/lang/Class;Leo3;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Leo3;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x2

    .line 5
    iput-byte v0, p0, Ltr3;->zzl:B

    .line 6
    .line 7
    sget-object v0, Lzp3;->d:Lzp3;

    .line 8
    .line 9
    iput-object v0, p0, Ltr3;->zze:Lro3;

    .line 10
    .line 11
    return-void
.end method

.method public static o([BLon3;)Ltr3;
    .locals 1

    .line 1
    sget-object v0, Ltr3;->zzm:Ltr3;

    .line 2
    .line 3
    invoke-static {v0, p0, p1}, Leo3;->i(Leo3;[BLon3;)Leo3;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ltr3;

    .line 8
    .line 9
    return-object p0
.end method

.method public static p()Lsr3;
    .locals 3

    .line 1
    sget-object v0, Ltr3;->zzm:Ltr3;

    .line 2
    .line 3
    const/4 v1, 0x5

    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-virtual {v0, v1, v2}, Ltr3;->l(ILeo3;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lzn3;

    .line 10
    .line 11
    check-cast v0, Lsr3;

    .line 12
    .line 13
    return-object v0
.end method


# virtual methods
.method public final l(ILeo3;)Ljava/lang/Object;
    .locals 9

    .line 1
    add-int/lit8 p1, p1, -0x1

    .line 2
    .line 3
    if-eqz p1, :cond_5

    .line 4
    .line 5
    const/4 v0, 0x2

    .line 6
    if-eq p1, v0, :cond_4

    .line 7
    .line 8
    const/4 v0, 0x3

    .line 9
    if-eq p1, v0, :cond_3

    .line 10
    .line 11
    const/4 v0, 0x4

    .line 12
    if-eq p1, v0, :cond_2

    .line 13
    .line 14
    const/4 v0, 0x5

    .line 15
    if-eq p1, v0, :cond_1

    .line 16
    .line 17
    if-nez p2, :cond_0

    .line 18
    .line 19
    const/4 p1, 0x0

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 p1, 0x1

    .line 22
    :goto_0
    iput-byte p1, p0, Ltr3;->zzl:B

    .line 23
    .line 24
    const/4 p0, 0x0

    .line 25
    return-object p0

    .line 26
    :cond_1
    sget-object p0, Ltr3;->zzm:Ltr3;

    .line 27
    .line 28
    return-object p0

    .line 29
    :cond_2
    new-instance p0, Lsr3;

    .line 30
    .line 31
    sget-object p1, Ltr3;->zzm:Ltr3;

    .line 32
    .line 33
    invoke-direct {p0, p1}, Lzn3;-><init>(Leo3;)V

    .line 34
    .line 35
    .line 36
    return-object p0

    .line 37
    :cond_3
    new-instance p0, Ltr3;

    .line 38
    .line 39
    invoke-direct {p0}, Ltr3;-><init>()V

    .line 40
    .line 41
    .line 42
    return-object p0

    .line 43
    :cond_4
    const-string v7, "zzj"

    .line 44
    .line 45
    const-string v8, "zzk"

    .line 46
    .line 47
    const-string v0, "zza"

    .line 48
    .line 49
    const-string v1, "zze"

    .line 50
    .line 51
    const-class v2, Ltr3;

    .line 52
    .line 53
    const-string v3, "zzf"

    .line 54
    .line 55
    const-string v4, "zzg"

    .line 56
    .line 57
    const-string v5, "zzh"

    .line 58
    .line 59
    const-string v6, "zzi"

    .line 60
    .line 61
    filled-new-array/range {v0 .. v8}, [Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    sget-object p1, Ltr3;->zzm:Ltr3;

    .line 66
    .line 67
    new-instance p2, Laq3;

    .line 68
    .line 69
    const-string v0, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0007\u0001\u041b\u0002\u1409\u0000\u0003\u1409\u0001\u0004\u1409\u0002\u0005\u1409\u0003\u0006\u1409\u0004\u0007\u1409\u0005"

    .line 70
    .line 71
    invoke-direct {p2, p1, v0, p0}, Laq3;-><init>(Ltm3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    return-object p2

    .line 75
    :cond_5
    iget-byte p0, p0, Ltr3;->zzl:B

    .line 76
    .line 77
    invoke-static {p0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    return-object p0
.end method
