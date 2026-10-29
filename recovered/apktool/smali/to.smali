.class public final Lto;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lgw0;


# instance fields
.field public final a:Lso;


# direct methods
.method public constructor <init>(Lso;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lto;->a:Lso;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a()Lnm2;
    .locals 0

    .line 1
    iget-object p0, p0, Lto;->a:Lso;

    .line 2
    .line 3
    invoke-interface {p0}, Lso;->a()Lnm2;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final b()J
    .locals 2

    .line 1
    iget-object p0, p0, Lto;->a:Lso;

    .line 2
    .line 3
    invoke-interface {p0}, Lso;->b()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method
