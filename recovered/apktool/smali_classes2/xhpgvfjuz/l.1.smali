.class Lxhpgvfjuz/l;
.super Ljava/util/TimerTask;
.source "SourceFile"


# static fields
.field private static final a:Ljava/lang/String; = "ShieldSDK"

.field private static final b:I = 0x1f4

.field private static final e:Ljava/util/Timer;

.field private static final f:I = 0x1f4

.field private static final g:I = 0x5dc


# instance fields
.field private c:I

.field private final d:Lxhpgvfjuz/G;

.field private h:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljava/util/Timer;

    const-string v1, "Pull Binding Cache Stats Logger"

    invoke-direct {v0, v1}, Ljava/util/Timer;-><init>(Ljava/lang/String;)V

    sput-object v0, Lxhpgvfjuz/l;->e:Ljava/util/Timer;

    return-void
.end method

.method private constructor <init>(Lxhpgvfjuz/G;)V
    .locals 1

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    const/16 v0, 0x5dc

    iput v0, p0, Lxhpgvfjuz/l;->c:I

    iput-object p1, p0, Lxhpgvfjuz/l;->d:Lxhpgvfjuz/G;

    invoke-interface {p1}, Lxhpgvfjuz/G;->c()I

    move-result p1

    iput p1, p0, Lxhpgvfjuz/l;->h:I

    return-void
.end method

.method static a(Lxhpgvfjuz/G;)V
    .locals 6

    sget-object v0, Lxhpgvfjuz/l;->e:Ljava/util/Timer;

    new-instance v1, Lxhpgvfjuz/l;

    invoke-direct {v1, p0}, Lxhpgvfjuz/l;-><init>(Lxhpgvfjuz/G;)V

    const-wide/16 v2, 0x1f4

    const-wide/16 v4, 0x1f4

    invoke-virtual/range {v0 .. v5}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;JJ)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    iget-object v0, p0, Lxhpgvfjuz/l;->d:Lxhpgvfjuz/G;

    invoke-interface {v0}, Lxhpgvfjuz/G;->c()I

    move-result v0

    iget v1, p0, Lxhpgvfjuz/l;->h:I

    if-ne v0, v1, :cond_0

    iget v0, p0, Lxhpgvfjuz/l;->c:I

    add-int/lit16 v0, v0, -0x1f4

    iput v0, p0, Lxhpgvfjuz/l;->c:I

    if-gtz v0, :cond_2

    invoke-virtual {p0}, Ljava/util/TimerTask;->cancel()Z

    goto :goto_1

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Pull bindings "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lxhpgvfjuz/l;->d:Lxhpgvfjuz/G;

    invoke-interface {v2}, Lxhpgvfjuz/G;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "ShieldSDK"

    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lxhpgvfjuz/l;->d:Lxhpgvfjuz/G;

    invoke-interface {v0}, Lxhpgvfjuz/G;->b()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lxhpgvfjuz/l;->d:Lxhpgvfjuz/G;

    invoke-interface {v0}, Lxhpgvfjuz/G;->c()I

    move-result v0

    iput v0, p0, Lxhpgvfjuz/l;->h:I

    const/16 v0, 0x5dc

    iput v0, p0, Lxhpgvfjuz/l;->c:I

    :cond_2
    :goto_1
    return-void
.end method
