.class public final Ln60;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static final f:Ljava/util/logging/Logger;


# instance fields
.field public final a:Lec;

.field public final b:Ljava/util/concurrent/Executor;

.field public final c:Lei1;

.field public final d:Ls52;

.field public final e:Ls52;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Lyr2;

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
    sput-object v0, Ln60;->f:Ljava/util/logging/Logger;

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>(Ljava/util/concurrent/Executor;Lei1;Lec;Ls52;Ls52;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ln60;->b:Ljava/util/concurrent/Executor;

    .line 5
    .line 6
    iput-object p2, p0, Ln60;->c:Lei1;

    .line 7
    .line 8
    iput-object p3, p0, Ln60;->a:Lec;

    .line 9
    .line 10
    iput-object p4, p0, Ln60;->d:Ls52;

    .line 11
    .line 12
    iput-object p5, p0, Ln60;->e:Ls52;

    .line 13
    .line 14
    return-void
.end method
