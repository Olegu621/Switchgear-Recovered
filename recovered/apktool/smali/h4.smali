.class public final Lh4;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lnx1;


# static fields
.field public static final a:Ljava/util/logging/Logger;

.field public static final b:Lh4;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Lh4;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, Lh4;->a:Ljava/util/logging/Logger;

    .line 12
    .line 13
    new-instance v0, Lh4;

    .line 14
    .line 15
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 16
    .line 17
    .line 18
    sput-object v0, Lh4;->b:Lh4;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Class;
    .locals 0

    .line 1
    const-class p0, Lc4;

    .line 2
    .line 3
    return-object p0
.end method

.method public final b(Lra2;)Ljava/lang/Object;
    .locals 0

    .line 1
    new-instance p0, Lg4;

    .line 2
    .line 3
    invoke-direct {p0, p1}, Lg4;-><init>(Lra2;)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public final c()Ljava/lang/Class;
    .locals 0

    .line 1
    const-class p0, Lc4;

    .line 2
    .line 3
    return-object p0
.end method
