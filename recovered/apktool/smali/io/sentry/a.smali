.class public final Lio/sentry/a;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final a:[B

.field public final b:Lio/sentry/protocol/k0;

.field public final c:Lbh0;

.field public final d:Ljava/lang/String;

.field public final e:Ljava/lang/String;

.field public final f:Ljava/lang/String;

.field public final g:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lbh0;)V
    .locals 1

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 44
    iput-object v0, p0, Lio/sentry/a;->a:[B

    .line 45
    iput-object v0, p0, Lio/sentry/a;->b:Lio/sentry/protocol/k0;

    .line 46
    iput-object p1, p0, Lio/sentry/a;->c:Lbh0;

    .line 47
    const-string p1, "screenshot.png"

    iput-object p1, p0, Lio/sentry/a;->e:Ljava/lang/String;

    .line 48
    const-string p1, "image/png"

    iput-object p1, p0, Lio/sentry/a;->f:Ljava/lang/String;

    .line 49
    const-string p1, "event.attachment"

    iput-object p1, p0, Lio/sentry/a;->g:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lio/sentry/protocol/k0;)V
    .locals 1

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 37
    iput-object v0, p0, Lio/sentry/a;->a:[B

    .line 38
    iput-object p1, p0, Lio/sentry/a;->b:Lio/sentry/protocol/k0;

    .line 39
    iput-object v0, p0, Lio/sentry/a;->c:Lbh0;

    .line 40
    const-string p1, "view-hierarchy.json"

    iput-object p1, p0, Lio/sentry/a;->e:Ljava/lang/String;

    .line 41
    const-string p1, "application/json"

    iput-object p1, p0, Lio/sentry/a;->f:Ljava/lang/String;

    .line 42
    const-string p1, "event.view_hierarchy"

    iput-object p1, p0, Lio/sentry/a;->g:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lio/sentry/a;->d:Ljava/lang/String;

    .line 14
    .line 15
    iput-object v0, p0, Lio/sentry/a;->e:Ljava/lang/String;

    .line 16
    .line 17
    const/4 p1, 0x0

    .line 18
    iput-object p1, p0, Lio/sentry/a;->b:Lio/sentry/protocol/k0;

    .line 19
    .line 20
    iput-object p1, p0, Lio/sentry/a;->c:Lbh0;

    .line 21
    .line 22
    iput-object p1, p0, Lio/sentry/a;->f:Ljava/lang/String;

    .line 23
    .line 24
    const-string p1, "event.attachment"

    .line 25
    .line 26
    iput-object p1, p0, Lio/sentry/a;->g:Ljava/lang/String;

    .line 27
    .line 28
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[B)V
    .locals 0

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    iput-object p4, p0, Lio/sentry/a;->a:[B

    const/4 p4, 0x0

    .line 31
    iput-object p4, p0, Lio/sentry/a;->b:Lio/sentry/protocol/k0;

    .line 32
    iput-object p4, p0, Lio/sentry/a;->c:Lbh0;

    .line 33
    iput-object p1, p0, Lio/sentry/a;->e:Ljava/lang/String;

    .line 34
    iput-object p2, p0, Lio/sentry/a;->f:Ljava/lang/String;

    .line 35
    iput-object p3, p0, Lio/sentry/a;->g:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>([BLjava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 50
    const-string v0, "event.attachment"

    invoke-direct {p0, p2, p3, v0, p1}, Lio/sentry/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[B)V

    return-void
.end method
