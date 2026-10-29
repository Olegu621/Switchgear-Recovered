.class public abstract Lmc0;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static final a:Ljava/util/EnumSet;

.field public static final b:I

.field public static final c:I

.field public static final d:I

.field public static final e:J

.field public static final f:J

.field public static final g:I

.field public static final h:I

.field public static final i:Z

.field public static final j:Ljava/util/concurrent/TimeUnit;

.field public static final k:J

.field public static final l:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, Lbm2;->a:Lbm2;

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;)Ljava/util/EnumSet;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    sput-object v0, Lmc0;->a:Ljava/util/EnumSet;

    .line 11
    .line 12
    const/16 v0, 0x19

    .line 13
    .line 14
    sput v0, Lmc0;->b:I

    .line 15
    .line 16
    const/4 v0, 0x5

    .line 17
    sput v0, Lmc0;->c:I

    .line 18
    .line 19
    sput v0, Lmc0;->d:I

    .line 20
    .line 21
    const-wide/32 v0, 0x9c40

    .line 22
    .line 23
    .line 24
    sput-wide v0, Lmc0;->e:J

    .line 25
    .line 26
    sput-wide v0, Lmc0;->f:J

    .line 27
    .line 28
    const/16 v0, 0x1e

    .line 29
    .line 30
    sput v0, Lmc0;->g:I

    .line 31
    .line 32
    const/16 v1, 0xf

    .line 33
    .line 34
    sput v1, Lmc0;->h:I

    .line 35
    .line 36
    const/4 v1, 0x1

    .line 37
    sput-boolean v1, Lmc0;->i:Z

    .line 38
    .line 39
    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 40
    .line 41
    sput-object v1, Lmc0;->j:Ljava/util/concurrent/TimeUnit;

    .line 42
    .line 43
    sget-object v1, Lib0;->i:Lib0;

    .line 44
    .line 45
    invoke-static {v0, v1}, Lmn0;->D(ILib0;)J

    .line 46
    .line 47
    .line 48
    move-result-wide v0

    .line 49
    sput-wide v0, Lmc0;->k:J

    .line 50
    .line 51
    const-wide/16 v0, 0x3e8

    .line 52
    .line 53
    sput-wide v0, Lmc0;->l:J

    .line 54
    .line 55
    return-void
.end method
