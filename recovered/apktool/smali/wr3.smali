.class public final Lwr3;
.super Leo3;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field private static final zzi:Lwr3;


# instance fields
.field private zza:I

.field private zze:I

.field private zzf:Ljava/lang/String;

.field private zzg:Z

.field private zzh:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lwr3;

    .line 2
    .line 3
    invoke-direct {v0}, Lwr3;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lwr3;->zzi:Lwr3;

    .line 7
    .line 8
    const-class v1, Lwr3;

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
    const-string v0, ""

    .line 5
    .line 6
    iput-object v0, p0, Lwr3;->zzf:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method

.method public static o([BLon3;)Lwr3;
    .locals 1

    .line 1
    sget-object v0, Lwr3;->zzi:Lwr3;

    .line 2
    .line 3
    invoke-static {v0, p0, p1}, Leo3;->i(Leo3;[BLon3;)Leo3;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lwr3;

    .line 8
    .line 9
    return-object p0
.end method

.method public static p()Lwr3;
    .locals 1

    .line 1
    sget-object v0, Lwr3;->zzi:Lwr3;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public final l(ILeo3;)Ljava/lang/Object;
    .locals 6

    .line 1
    add-int/lit8 p1, p1, -0x1

    .line 2
    .line 3
    if-eqz p1, :cond_4

    .line 4
    .line 5
    const/4 p0, 0x2

    .line 6
    if-eq p1, p0, :cond_3

    .line 7
    .line 8
    const/4 p0, 0x3

    .line 9
    if-eq p1, p0, :cond_2

    .line 10
    .line 11
    const/4 p0, 0x4

    .line 12
    if-eq p1, p0, :cond_1

    .line 13
    .line 14
    const/4 p0, 0x5

    .line 15
    if-eq p1, p0, :cond_0

    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    return-object p0

    .line 19
    :cond_0
    sget-object p0, Lwr3;->zzi:Lwr3;

    .line 20
    .line 21
    return-object p0

    .line 22
    :cond_1
    new-instance p0, Lfm3;

    .line 23
    .line 24
    sget-object p1, Lwr3;->zzi:Lwr3;

    .line 25
    .line 26
    invoke-direct {p0, p1}, Lzn3;-><init>(Leo3;)V

    .line 27
    .line 28
    .line 29
    return-object p0

    .line 30
    :cond_2
    new-instance p0, Lwr3;

    .line 31
    .line 32
    invoke-direct {p0}, Lwr3;-><init>()V

    .line 33
    .line 34
    .line 35
    return-object p0

    .line 36
    :cond_3
    sget-object v2, Lqm3;->f:Lqm3;

    .line 37
    .line 38
    const-string v4, "zzg"

    .line 39
    .line 40
    const-string v5, "zzh"

    .line 41
    .line 42
    const-string v0, "zza"

    .line 43
    .line 44
    const-string v1, "zze"

    .line 45
    .line 46
    const-string v3, "zzf"

    .line 47
    .line 48
    filled-new-array/range {v0 .. v5}, [Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    sget-object p1, Lwr3;->zzi:Lwr3;

    .line 53
    .line 54
    new-instance p2, Laq3;

    .line 55
    .line 56
    const-string v0, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u1008\u0001\u0003\u1007\u0002\u0004\u1004\u0003"

    .line 57
    .line 58
    invoke-direct {p2, p1, v0, p0}, Laq3;-><init>(Ltm3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    return-object p2

    .line 62
    :cond_4
    const/4 p0, 0x1

    .line 63
    invoke-static {p0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    return-object p0
.end method
