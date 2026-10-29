.class public Lxhpgvfjuz/r;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static a:Lxhpgvfjuz/G;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lxhpgvfjuz/k;

    invoke-direct {v0}, Lxhpgvfjuz/k;-><init>()V

    sput-object v0, Lxhpgvfjuz/r;->a:Lxhpgvfjuz/G;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(I)Ljava/lang/String;
    .locals 1

    sget-object v0, Lxhpgvfjuz/r;->a:Lxhpgvfjuz/G;

    invoke-interface {v0, p0}, Lxhpgvfjuz/G;->a(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static a()V
    .locals 1

    invoke-static {}, Lxhpgvfjuz/r;->b()Lxhpgvfjuz/G;

    move-result-object v0

    sput-object v0, Lxhpgvfjuz/r;->a:Lxhpgvfjuz/G;

    return-void
.end method

.method private static b()Lxhpgvfjuz/G;
    .locals 1

    new-instance v0, Lxhpgvfjuz/k;

    invoke-direct {v0}, Lxhpgvfjuz/k;-><init>()V

    return-object v0
.end method
