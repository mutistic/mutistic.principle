package com.mutistic.behavioral.memento.revocation;

/**
 * @program 命令接口的抽象实现类
 * @description 
 * @author mutisitic
 * @date 2018年8月31日
 */
public abstract class AbstractCommand implements Command {

	/** 持有：真正的命令实现者对象 */
    protected OpeartionApi opeartion;
    
    /**
     * @description 具体的功能实现
     * @author mutisitic
     * @date 2018年8月31日
     * @see com.mutistic.behavioral.memento.revocation.Command#execute()
     */
    @Override
	public abstract void execute();
	
    /**
     * @description 撤销
     * @author mutisitic
     * @date 2018年8月31日
     * @param memento
     * @see com.mutistic.behavioral.memento.revocation.Command#undo(com.mutistic.behavioral.memento.revocation.Memento)
     */
	@Override
	public void undo(Memento memento) {
		opeartion.setMemento(memento);
	}

	/**
	 * @description 恢复
	 * @author mutisitic
	 * @date 2018年8月31日
	 * @param memento
	 * @see com.mutistic.behavioral.memento.revocation.Command#redo(com.mutistic.behavioral.memento.revocation.Memento)
	 */
	@Override
	public void redo(Memento memento) {
		opeartion.setMemento(memento);
	}
	
	/**
	 * @description 创建备忘录对象
	 * @author mutisitic
	 * @date 2018年8月31日
	 * @return
	 * @see com.mutistic.behavioral.memento.revocation.Command#createrMemento()
	 */
	@Override
	public Memento createrMemento() {
		return opeartion.createrMemento();
	}

	public OpeartionApi getOpeartion() {
		return opeartion;
	}

	public void setOpeartion(OpeartionApi opeartion) {
		this.opeartion = opeartion;
	}
}
