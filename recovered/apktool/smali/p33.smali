.class public final Lp33;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static final d:Lnt1;


# instance fields
.field public a:I

.field public b:Lm12;

.field public c:Lm12;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lnt1;

    .line 2
    .line 3
    const/16 v1, 0x14

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lnt1;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lp33;->d:Lnt1;

    .line 9
    .line 10
    return-void
.end method

.method public static a()Lp33;
    .locals 1

    .line 1
    sget-object v0, Lp33;->d:Lnt1;

    .line 2
    .line 3
    invoke-virtual {v0}, Lnt1;->a()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lp33;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    new-instance v0, Lp33;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-object v0
.end method
