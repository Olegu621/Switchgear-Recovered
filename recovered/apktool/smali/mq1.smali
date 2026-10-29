.class public final Lmq1;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Liz1;


# static fields
.field public static final c:Lds0;

.field public static final d:Lgy;


# instance fields
.field public a:Lds0;

.field public volatile b:Liz1;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lds0;

    .line 2
    .line 3
    const/16 v1, 0x11

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lds0;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lmq1;->c:Lds0;

    .line 9
    .line 10
    new-instance v0, Lgy;

    .line 11
    .line 12
    const/4 v1, 0x5

    .line 13
    invoke-direct {v0, v1}, Lgy;-><init>(I)V

    .line 14
    .line 15
    .line 16
    sput-object v0, Lmq1;->d:Lgy;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lmq1;->b:Liz1;

    .line 2
    .line 3
    invoke-interface {p0}, Liz1;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method
