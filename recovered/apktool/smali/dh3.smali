.class public abstract Ldh3;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static final a:Lph3;

.field public static final b:Lph3;

.field public static final c:Lph3;

.field public static final d:Lph3;

.field public static final e:Lch3;

.field public static final f:Lph3;

.field public static final g:Lch3;

.field public static final h:Lph3;


# direct methods
.method static constructor <clinit>()V
    .locals 13

    .line 1
    new-instance v0, Lph3;

    .line 2
    .line 3
    const-string v1, "cause"

    .line 4
    .line 5
    const-class v2, Ljava/lang/Throwable;

    .line 6
    .line 7
    const/4 v6, 0x0

    .line 8
    invoke-direct {v0, v1, v2, v6, v6}, Lph3;-><init>(Ljava/lang/String;Ljava/lang/Class;ZZ)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Ldh3;->a:Lph3;

    .line 12
    .line 13
    new-instance v0, Lph3;

    .line 14
    .line 15
    const-string v1, "ratelimit_count"

    .line 16
    .line 17
    const-class v2, Ljava/lang/Integer;

    .line 18
    .line 19
    invoke-direct {v0, v1, v2, v6, v6}, Lph3;-><init>(Ljava/lang/String;Ljava/lang/Class;ZZ)V

    .line 20
    .line 21
    .line 22
    sput-object v0, Ldh3;->b:Lph3;

    .line 23
    .line 24
    new-instance v0, Lph3;

    .line 25
    .line 26
    const-string v1, "ratelimit_period"

    .line 27
    .line 28
    const-class v3, Lpg3;

    .line 29
    .line 30
    invoke-direct {v0, v1, v3, v6, v6}, Lph3;-><init>(Ljava/lang/String;Ljava/lang/Class;ZZ)V

    .line 31
    .line 32
    .line 33
    sput-object v0, Ldh3;->c:Lph3;

    .line 34
    .line 35
    new-instance v0, Lph3;

    .line 36
    .line 37
    const-string v1, "skipped"

    .line 38
    .line 39
    invoke-direct {v0, v1, v2, v6, v6}, Lph3;-><init>(Ljava/lang/String;Ljava/lang/Class;ZZ)V

    .line 40
    .line 41
    .line 42
    sput-object v0, Ldh3;->d:Lph3;

    .line 43
    .line 44
    new-instance v7, Lch3;

    .line 45
    .line 46
    const/4 v12, 0x0

    .line 47
    const-string v8, "group_by"

    .line 48
    .line 49
    const-class v9, Ljava/lang/Object;

    .line 50
    .line 51
    const/4 v10, 0x1

    .line 52
    move v11, v10

    .line 53
    invoke-direct/range {v7 .. v12}, Lch3;-><init>(Ljava/lang/String;Ljava/lang/Class;ZZI)V

    .line 54
    .line 55
    .line 56
    sput-object v7, Ldh3;->e:Lch3;

    .line 57
    .line 58
    new-instance v0, Lph3;

    .line 59
    .line 60
    const-string v1, "forced"

    .line 61
    .line 62
    const-class v2, Ljava/lang/Boolean;

    .line 63
    .line 64
    invoke-direct {v0, v1, v2, v6, v6}, Lph3;-><init>(Ljava/lang/String;Ljava/lang/Class;ZZ)V

    .line 65
    .line 66
    .line 67
    sput-object v0, Ldh3;->f:Lph3;

    .line 68
    .line 69
    new-instance v3, Lch3;

    .line 70
    .line 71
    const-string v4, "tags"

    .line 72
    .line 73
    const/4 v8, 0x1

    .line 74
    const-class v5, Lkk3;

    .line 75
    .line 76
    move v7, v10

    .line 77
    invoke-direct/range {v3 .. v8}, Lch3;-><init>(Ljava/lang/String;Ljava/lang/Class;ZZI)V

    .line 78
    .line 79
    .line 80
    sput-object v3, Ldh3;->g:Lch3;

    .line 81
    .line 82
    new-instance v0, Lph3;

    .line 83
    .line 84
    const-string v1, "stack_size"

    .line 85
    .line 86
    const-class v2, Lai3;

    .line 87
    .line 88
    invoke-direct {v0, v1, v2, v6, v6}, Lph3;-><init>(Ljava/lang/String;Ljava/lang/Class;ZZ)V

    .line 89
    .line 90
    .line 91
    sput-object v0, Ldh3;->h:Lph3;

    .line 92
    .line 93
    return-void
.end method
